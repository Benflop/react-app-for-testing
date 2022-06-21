pipeline {
    agent any
    tools {nodejs "NodeJS 18.4.0"
           maven "Maven3"}
    stages {
        stage('Build') { 
            steps {
                echo 'Buidling The Software'
                sh 'npm install'
                dir("src/test/Selenium/selenium") {
                    sh 'mvn -B -DskipTests clean package'
                }
            }
        }

        stage('Test') {
            steps {
                echo 'To include Jest & Selenium'
                // sh 'npm test'
            }
        }

        stage('Deploy') {
            steps {
                echo 'To Deploy & Serve React App'
            }
        }
    }
}