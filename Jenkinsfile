pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'Buidling The Software'
        sh 'npm install'
        sh 'apt-get install qemu'
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
      }
    }

  }
  tools {
    nodejs 'NodeJS 18.4.0'
    maven 'Maven3'
  }
}