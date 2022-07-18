pipeline {
  agent {
    any {
      image 'node:lts-bullseye-slim'
      args '-p 3000:3000'
    }
  }

  environment {
      		DOCKERHUB_CREDENTIALS=credentials('Docker')
  }
  
  stages {
    stage('Setup') {
      steps {
        echo 'Setting up the Software'
        sh 'npm install'
        sh 'npm start & sleep 1'
      }
    }

    stage('Test') {
      steps {
        echo 'Jest Test'
        sh 'npm --watchAll test'

        echo 'Selenium Test'
        dir(path: 'src/test/Selenium/selenium') {
          sh 'mvn test'
        }
      }
    }

    stage('Deploy') {
      steps {
        echo 'To Deploy & Serve React App in Docker Image'
        sh 'cp package.json package-lock.json ./build'
        sh 'cp -R ./src ./build'
        sh 'cp -R ./public ./build'
        dir(path: 'build') {
          sh 'docker build -t react-app-for-testing .'
          sh 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USR --password-stdin'
          sh 'docker tag react-app-for-testing benflop/react-app-for-testing:latest'
          sh 'docker push benflop/react-app-for-testing:latest'
        }
      }
    }

    post {
    success {
        slackSend "Build deployed successfully - ${env.JOB_NAME} ${env.BUILD_NUMBER} (<${env.BUILD_URL}|Open>)"
        }
    }

  }
  tools {
    nodejs 'NodeJS 18.4.0'
    maven 'Maven3'
  }
}