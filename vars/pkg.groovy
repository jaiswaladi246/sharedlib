def call() {
    stage('Maven Package') {
        // Define the Maven command to be executed
        def mavenCommand = 'mvn package'

        // Execute the Maven command in a shell
        sh script: mavenCommand, returnStatus: true

        // Check the return status of the Maven command
        if (currentBuild.resultIsBetterOrEqualTo('FAILURE')) {
            error "Maven build failed"
        }
    }
}
