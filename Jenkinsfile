pipeline {
	environment {
    	registry = "maharshi18/sample"
    	registryCredential = 'mv_docker'
    	dockerImage = ''
  }
    agent any 
    stages {
        stage('clean and compile') { 
            steps {
                sh "mvn clean"
                sh "mvn compile"
            }
        }
        stage('Test') { 
            steps {
                sh "mvn test"
            }
        }
        stage('package') { 
            steps {
                sh "mvn package"
            }
        }
         stage('Building image') {
      		steps {
        		script {
          			dockerImage = docker.build registry + ":latest"
        		}
      		}
    	}
    	stage('Upload Image to dockerhub') {
      		steps {
        		script {
          			docker.withRegistry( '', registryCredential ) {
            		dockerImage.push()
          			}
        		}
      		}
    	}
        stage('Rundeck'){
            steps{
                build 'rundeck_test'
            }
        }
    }
} 
