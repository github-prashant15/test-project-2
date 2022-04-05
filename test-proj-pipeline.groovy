pipeline {
        agent any 
        stages {
          stage('Build') { 
            steps {
              git credentialsId: 'gitlab-ssh', url: 'https://github.com/github-prashant15/pipeline-repo.git'
            }
          }
          stage('Test') { 
            steps {
              echo "test is completed"
            }
          }
          stage('Deploy') { 
            steps {
              echo "deploy completed move to production sever"
            }
          }
          stage('release') {
            steps {
            echo "product is reday to release"
            }
          }
          stage('feature') {
            steps {
            echo "add new features after release"
            }
          }
          stage('prod') {
            steps {
            echo "producation is completed"
            }
          }
        }
}