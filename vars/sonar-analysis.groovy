
def call (Project){
  def sonarCommand = ''' $SCANNER_HOME/bin/sonar-scanner -Dsonar.projectName=${Project} \
                   -Dsonar.java.binaries=. \
                   -Dsonar.projectKey=${Project} '''

  sh script: sonarCommand, returnStatus: true

}
