pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo "Compiling..."
                sh "sbt clean compile"
            }
        }
        stage('Test') {
            steps {
                echo "Running tests..."
                sh "sbt test"
            }
        }
    } 
}


