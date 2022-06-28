pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'Buidling The Software'
        sh 'apt-get install libglib2.0-0'
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
      }
    }

  }
  tools {
    nodejs 'NodeJS 18.4.0'
    maven 'Maven3'
  }
}