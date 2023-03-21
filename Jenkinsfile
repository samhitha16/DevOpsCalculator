pipeline{
    agent any
    stages{
        stage('Git clone'){
            steps{
                git 'https://github.com/samhitha16/DevOpsCalculator.git'
            }
        }
        stage('Maven Build'){
            steps{
                sh 'mvn clean install'
            }
        }
        stage('Docker build Image') {
            steps{
                script {
                    imageName=docker.build "samhitha16/calculator-app"
                }
            }
        }
        stage('Docker push Image') {
            steps {
                script{
                    docker.withRegistry('','dockerPassword'){
                    imageName.push()
                    }
                }    
            }
        }
        stage('Ansible pull Image') {
            steps {
                ansiblePlaybook becomeUser: null, colorized: true, disableHostKeyChecking: true, installation: 'Ansible', inventory: 'inventory', playbook: 'playbook.yml', sudoUser: null
            }    
        }
        
    }
}