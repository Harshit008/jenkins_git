pipeline {
    agent any

    stages {
        stage('checkout') {
            steps {
                git 'https://github.com/Harshit008/jenkins_git.git'
            }
        }
         stage('build') {
            steps {
                bat 'mvn package'
            }
        }
         stage('deploy') {
            steps {
                deploy adapters: [tomcat8(credentialsId: 'tomcat_credentials', path: '', url: 'http://localhost:8080/')], contextPath: 'servlet-jsp-maven-jenkins', war: '**/*.war'
            }
        }
    }
}
