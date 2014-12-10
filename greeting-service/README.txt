# About greeting-service:
This is a jax-ws code-first web service to get greeting message.
This will describe way to test the service with JUnit and javax.xml.ws.Endpoint.

# Prerequisite:
You need to have JAVA (1.7) and MAVEN (3.2.3) installed properly with JAVA_HOME and M2_HOME environment variables.

# to create eclipse project execute:
mvn eclipse:eclipse

# to clean the project:
mvn clean

# to package the project:
mvn package

# to see the generated WSDL:
deploy war file on tomcat server and access via following URL.
http://localhost:8080/greeting-service/greeting
