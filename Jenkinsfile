pipeline {
    agent any
    
    
    
    stages {
      stage('Git Checkout') {
            steps {
                script {
                    git url: 'https://github.com/saibala45/projectsai.git'
                      echo 'git checkout is done code pulled from github to jenkins workspace'
                }
            }
        }
        stage('Mvn Build') {
            steps {
                script {
                    sh 'mvn clean install'
                      echo 'maven build is done'
                }
            }
        }
        stage('docker image'){
            steps{
             
                sh 'docker build -t /projectsai:${BUILD_NUMBER} .'
                echo 'docker image is created'
            }
        }
        stage('docker deploy'){
            steps{
                sh 'docker container rm -f projectsai'
                sh 'docker run --name projectsai -itd -p 9393:9393 /projectsai:${BUILD_NUMBER}'
                echo 'docker container is created'
                echo 'docker container is running'
            }
        }
        
    }
 }
