pipeline {
    agent any
    stages {
		
		
		// ******ALL CODE TO BE ADDED BELOW THIS COMMENT******
		
		//Code starts for stage Clean
			stage('Clean') {
            steps {
                sh 'mvn clean'
            }
        }
		//Code ends for stage Clean
		
		//Code starts for stage Compile
		stage('Compile') {
            steps {
                sh 'mvn compile'
            }
        }
		//Code Ends for stage Compile
		
		//Code starts for stage Unit Test
        stage('Unit Test') {
            steps {
                sh 'mvn test'
            }	
        }
		//Code ends for stage Unit Test

// ******ALL CODE TO BE ADDED ABOVE THIS COMMENT******
    }
}
