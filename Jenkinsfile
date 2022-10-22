pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "M3"
    }

    stages {
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                git 'https://github.com/lothoroger/springbootpipe.git'

                // Run Maven wrapper.
                sh "mvn compile"
			
		echo 'Building the Project with maven compiler'
                
            }
	   }

	stage('Test') {

		steps {

			sh 'mvn test'
			echo 'Testing the projectwith mave test'	           
            }
        }

stage('Deploy') {

		steps {

			sh 'mvn package'
			echo 'Deploy the project with maven package'	           
            }
        }
    }
}
