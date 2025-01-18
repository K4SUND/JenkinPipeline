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
                bat 'mkdir new_directory || echo "Directory already exists"'
                echo 'Directory created'
            }
        }
    }
}
