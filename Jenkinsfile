def gradle(command) {
    bat "gradlew ${command}"
}

pipeline {
    agent any
    stages{
        stage('Clone') {
            steps {
                echo 'Cloning...'
                git 'https://github.com/serezha-karpunin/jenkins-example.git'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing...'
                gradle 'test'
            }
        }

        stage('Build') {
            steps {
                echo 'Building...'
                gradle 'build'
            }
        }

        stage('Check') {
            steps {
                echo 'Checking...'
                gradle 'check'
            }
        }
    }
    post {
        failure {
            mail bcc: '', body: 'something went wrong', cc: '', from: '', replyTo: '', subject: 'CI failed', to: 'itdepends@yandex.ru'
        }
    }
}