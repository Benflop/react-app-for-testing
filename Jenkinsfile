pipeline {
    agent {
        docker {
            image 'node:react-app-for-testing' 
            args '-p 3000:3000' 
        }
    }
    stages {
        stage('Build') { 
            steps {
                sh 'npm install' 
            }
        }
    }
}