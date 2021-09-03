pipeline{
    agent any
        stages{
            stage('Init'){
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
                        steps{ 
                        echo "Deploying the staging Area"
                    }
                }
                stage("Deploy Production"){
                    steps{
                        echo "Deploying in production area"
                    }
                }
        }

}