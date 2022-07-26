pipeline {
    agent any
    tools {
            maven 'Maven 3.8.6'
        }
    stages {

        stage('Build') {
            steps {
                sh 'mvn -Dmaven.test.failure.ignore=true clean install'
             }
        }

        stage("ssh Server"){
            steps{
                sshagent(['CONNECT_DEPLOY_WAR']) {
                        sh 'ssh -o StrictHostKeyChecking=no -l ec2-user 23.23.69.209'
                        sh 'scp -o StrictHostKeyChecking=no /var/lib/jenkins/workspace/demo-deploy-file-war-pipeline@2/target/demo-0.0.1-SNAPSHOT.war ec2-user@23.23.69.209:/var/lib/tomcat/webapps'
                        sh 'sudo systemctl stop tomcat'
                        sh 'sudo systemctl start tomcat'
                }
            }
       }
    }
}