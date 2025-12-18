pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'test', url: 'https://github.com/Franklindot04/Number-Guess-Game.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }

    post {
        always {
            archiveArtifacts artifacts: '**/target/*.jar', allowEmptyArchive: true
            junit '**/target/surefire-reports/*.xml'
        }
    }
}

