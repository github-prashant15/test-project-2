pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Hello World'
            }
        }
        stage('Deploy') {
            when {
                branch 'production'
            }
            steps {
                echo 'Deploying'
            }
        }
    }
}
