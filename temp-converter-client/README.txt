## Prerequisite
You need to have JAVA and MAVEN installed properly with JAVA_HOME and M2_HOME environment variables.

# to create eclipse project execute
mvn eclipse:eclipse

# to clean the project
mvn clean

# to package the project
mvn package

# to execute jar file
java -jar target\temp-converter-client-0.0.1-SNAPSHOT.jar est.jaxws.temp.client.TempConverterClient