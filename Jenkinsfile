pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                git 'https://github.com/lothoroger/springbootpipe.git'

                // Run Maven wrapper.
                bat "mvn compile"
			
		echo 'Building the Project with maven compiler'
                
            }
	   }

	stage('Test') {

		steps {

			bat 'mvn test'
			echo 'Testing the projectwith mave test'	           
            }
        }

stage('Deploy') {

		steps {

			bat 'mvn package'
			echo 'Deploy the project with maven package'	           
            }
        }
    }
}
