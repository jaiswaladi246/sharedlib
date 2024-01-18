def call() {
   
        // Define the Maven command to be executed
        def mavenCommand = 'mvn package -DskipTests=true'

        // Execute the Maven command in a shell
        sh script: mavenCommand, returnStatus: true

        
    
}
