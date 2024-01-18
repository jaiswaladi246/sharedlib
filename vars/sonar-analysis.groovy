
def call (Project){
  def sonarCommand = ''' $SCANNER_HOME/bin/sonar-scanner -Dsonar.url=http://13.233.67.35:9000 -Dsonar.projectName=${Project}  \
                   -Dsonar.java.binaries=. \
                   -Dsonar.projectKey=${Project} '''

  sh script: sonarCommand, returnStatus: true

}
