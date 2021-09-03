pipeline{
    agent anystahes{
        stage('init'){
            steps{
                echo "Hi , this is vinay from vij"
                echo "We are starting the testing"
            }
        }
        stage('build'){
            steps{
                echo 'Building sample Maven Project'
            }


        }

        stage('Deploy'){
            step{
                echo "Deploying the staging Area"
            }
        }
        stage("DeployProduction"){
            steps{
                echo "Deploying in production area"
            }
        }
    }
}
