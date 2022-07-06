pipeline {
  agent any
  docker {
            args '-p 3000:3000'
        }
  stages {
    stage('Build') {
      steps {
        echo 'Buidling The Software'
        sh 'npm install'
        // sh 'npm test'
        // sh 'npm start'
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

        set -x
        sh 'npm run build'
        set +x

        set -x
        sh 'npm start & sleep 1'
        echo '$! > .pidfile'
        set +x

        echo 'You can visit the site now at http://localhost:3000'
        input message: 'Finished using the web site? (Click "Proceed" to continue)'
      }
    }

  }
  tools {
    nodejs 'NodeJS 18.4.0'
    maven 'Maven3'
  }
}