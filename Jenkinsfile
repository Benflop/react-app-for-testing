pipeline {
    agent {
        docker {
            image 'docker:react-app-for-testing' 
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