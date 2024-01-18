
// File: vars/sonarAnalysis.groovy

def call() {
    // Define SonarQube server details
    def sonarHostUrl = "http://13.233.67.35:9000"
    def sonarProjectKey = "ABCD"
    def sonarProjectName = "ABCD"
    def sonartoken = 'squ_ccec0df3b7a9571b33a1f7eeae90c601b57a926c'
    
    // Define SonarQube scanner properties
    def sonarScannerHome = tool 'sonar-scanner'
    //def sonarScannerOpts = "-Xmx512m"  // Adjust memory settings as needed
    
    // Execute Sonar analysis
    sh """
        ${sonarScannerHome}/bin/sonar-scanner \
        -Dsonar.host.url=${sonarHostUrl} \
        -Dsonar.login=${sonartoken}
        -Dsonar.projectKey=${sonarProjectKey} \
        -Dsonar.projectName=${sonarProjectName} 
        
    """
}
