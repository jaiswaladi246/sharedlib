
// File: vars/sonarAnalysis.groovy

def call() {
    // Define SonarQube server details
    def sonarHostUrl = "http://13.233.67.35:9000"
    def sonarProjectKey = "ABCD"
    def sonarProjectName = "ABCD"
    
    // Define SonarQube scanner properties
    def sonarScannerHome = tool 'sonar-scanner'
    def sonarScannerOpts = "-Xmx512m"  // Adjust memory settings as needed
    
    // Execute Sonar analysis
    sh """
        ${sonarScannerHome}/bin/sonar-scanner \
        -Dsonar.host.url=${sonarHostUrl} \
        -Dsonar.projectKey=${sonarProjectKey} \
        -Dsonar.projectName=${sonarProjectName} \
        ${sonarScannerOpts}
    """
}
