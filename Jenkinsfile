pipeline {
    agent any

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
    post {
        always {
            mail to: itdepends@yandex.ru, subject: 'The Pipeline finished'
        }
    }
}