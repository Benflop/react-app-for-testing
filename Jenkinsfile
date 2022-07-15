pipeline {
  agent {
    any {
      image 'node:lts-bullseye-slim'
      args '-p 3000:3000'
    }

  }
  stages {
    stage('Build') {
      steps {
        echo 'Buidling The Software'
        sh 'npm install'
      }
    }

    stage('Test') {
      steps {
        echo 'To include Jest & Selenium'
        dir(path: 'src/test/Selenium/selenium') {
          sh 'mvn test'
        }
      }
    }

    stage('Deploy') {
      steps {
        echo 'To Deploy & Serve React App'
        dir(path: 'build') {
          sh 'docker-compose -f docker-compose.prod.yml build'
        }
        // sh 'set -x'
        // sh 'npm run build'
        // sh 'set +x'
        // sh 'set -x'
        sh 'npm start & sleep 1'
        echo '$! > .pidfile'
        sh 'set +x'
        echo 'You can visit the site now at http://localhost:3000'
        input 'Finished using the web site? (Click "Proceed" to continue)'
        sh 'set -x'
        // sh 'kill $(cat .pidfile)'
      }
    }

  }
  tools {
    nodejs 'NodeJS 18.4.0'
    maven 'Maven3'
  }
}