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

# to deploy on tomcat:
Download the JAX-WS Reference Implementation (RI), from https://jax-ws.java.net/ and add following .jar to TOMCAT_HOME/lib.
I was using jaxws-ri-2.2.8 and apache-tomcat-7.0.56.

jaxws-rt.jar -> java.lang.NoClassDefFoundError: com.sun.xml.ws.transport.http.servlet.WSServletContextListener
jaxb-core.jar - > java.lang.NoClassDefFoundError: com/sun/istack/localization/Localizable
streambuffer.jar -> java.lang.ClassNotFoundException: com.sun.xml.stream.buffer.XMLStreamBuffer
jaxb-impl.jar -> java.lang.ClassNotFoundException: com.sun.xml.bind.api.JAXBRIContext
policy.jar -> java.lang.ClassNotFoundException: com.sun.xml.ws.policy.PolicyException
stax-ex.jar -> java.lang.ClassNotFoundException: org.jvnet.staxex.XMLStreamReaderEx
gmbal-api-only.jar -> java.lang.ClassNotFoundException: org.glassfish.gmbal.ManagedObjectManager
management-api.jar -> java.lang.ClassNotFoundException: org.glassfish.external.amx.AMXGlassfish
ha-api.jar -> java.lang.ClassNotFoundException: org.glassfish.ha.store.api.BackingStoreException

Then deploy war file to tomcat server and access via following URL.

# to check the web service:
http://localhost:8080/greeting-service/greeting
