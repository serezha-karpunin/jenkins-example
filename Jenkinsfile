pipeline {
    agent any
    stages{
        stage('Build') {
            steps {
                echo 'Building...'
            }
        }

        stage('Test') {
            steps {
                echo 'Testing...'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying...'
            }
        }
    }
    post {
        always {
            mail bcc: '', body: 'World', cc: '', from: '', replyTo: '', subject: 'Hello', to: 'itdepends@yandex.ru'
        }
    }
}