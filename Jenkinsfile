pipeline {
    agent any
    tools {nodejs "NodeJS 18.4.0"}
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
            }
        }

        stage('Deploy') {
            steps {
                echo 'To Deploy & Serve React App'
            }
        }
    }
}