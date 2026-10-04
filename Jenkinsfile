pipeline{
    agent any

    stages{
        stage('Checkout'){
            steps{
                checkout scm
            }
        }

        stage('Build and Test'){
            steps{
                sh 'mvn clean package'
            }
        }

        stage('Docker Build'){
            steps{
                sh 'docker build -t student-management .'
            }
        }  

        stage('Deploy'){
            steps{
                sh 'docker rm -f student-container || true'
                sh 'docker run --name student-container student-management'
            }
        }
    }
}