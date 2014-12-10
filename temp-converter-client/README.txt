# About temp-converter-client:
This is a jax-ws client for exsisting .Net web service.
URL: http://www.w3schools.com/webservices/tempconvert.asmx

# Prerequisite:
You need to have JAVA (1.7) and MAVEN (3.2.3) installed properly with JAVA_HOME and M2_HOME environment variables.

# to create eclipse project execute:
mvn eclipse:eclipse

# to clean the project:
mvn clean

# to package the project:
mvn package

# to execute jar file:
java -jar target\temp-converter-client-0.0.1-SNAPSHOT.jar est.jaxws.temp.client.TempConverterClient