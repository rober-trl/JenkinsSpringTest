pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "MAVEN_HOME"
    }

    stages {
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                git branch: 'main', url: 'https://github.com/rober-trl/JenkinsSpringTest.git'

                // Run Maven on a Unix agent.
                sh "mvn clean package -Dskiptest=true"

                // To run Maven on a Windows agent, use
                // bat "mvn -Dmaven.test.failure.ignore=true clean package"
            }

            //post {
                // If Maven was able to run the tests, even if some of the test
                // failed, record the test results and archive the jar file.
                //success {
                //    archiveArtifacts 'target/*.war'
                //}
            //}
        }
        stage('Test') {
            steps {
                sh "mvn test"
            }
        }
        stage('Deploy') {
            steps {
				echo "PUlling " + ${env.BRANCH_NAME}                
                //sh "mvn spring-boot:run"
                sh "whoami"
                //sh "cp target/*war /home/webapps/"
                
            }
        }
    }
}
