pipeline {
agent any
  
stages {

stage('Build') {
steps {
echo 'BUILD'
bat 'mvn clean install -DskipTests=true'
}
}
stage('Test') {
steps {
echo 'TEST'
bat 'mvn test'
}
}
stage('Package') {
steps {
echo 'PACKAGE'
bat 'mvn clean package -DskipTests=true'
}
}
stage('Deploy') {
steps {
echo 'DEPLOYED'
}
}
}
}
