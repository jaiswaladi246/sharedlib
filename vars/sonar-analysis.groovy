
// File: vars/sonarAnalysis.groovy

def call() {
   sh ''' $SCANNER_HOME/bin/sonar-scanner -Dsonar.projectName=E-Kart \
                   -Dsonar.java.binaries=. \
                   -Dsonar.projectKey=E-Kart '''
}
