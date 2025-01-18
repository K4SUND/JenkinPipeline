pipeline {
    agent any
    stages {
        stage('Hello World') {
            steps {
                echo 'Hello World'
            }
        }
        stage('Create Directory') {
            steps {
                bat 'mkdir -p ./new_directory'
                echo 'Directory created'
            }
        }
    }
}
