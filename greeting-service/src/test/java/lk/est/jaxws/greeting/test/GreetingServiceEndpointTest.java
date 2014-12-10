package lk.est.jaxws.greeting.test;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Endpoint;
import javax.xml.ws.Service;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import lk.est.greeting.msg.IGretingsMessages;
import lk.est.jaxws.greeting.impl.Greeting;
import lk.est.jaxws.greeting.service.IGreetingService;
import lk.est.test.util.RemoteUtil;

/**
 * The class HelloWorldServiceEndpointTest for service test with publishing.
 * @author rangalal.g
 *
 */
public class GreetingServiceEndpointTest {

	private final String name = "Rangalal";
	private static Endpoint endpoint;
	private static int port;
	private static String endpointUrl;
 	
    /**
     * Publish the web service at given Endpoint.
     * @throws Exception
     * 
     */
    @BeforeClass
    public static void beforeClass() throws Exception {
		port = RemoteUtil.getFreePort();
		endpointUrl = "http://localhost:" + port + "/greeting-service/greeting";
        endpoint = Endpoint.publish(endpointUrl, new Greeting());
    }
	
	/**
	 * Stop the Endpoint that already published.
	 * @throws Exception
	 */
	@AfterClass
    public static void afterClass() throws Exception {
        endpoint.stop();
    }
	
	/**
	 * Test the service with published Endpoint for hello greeting message.
	 * @throws MalformedURLException
	 */
	@Test
	public void testGreetingHellowMessage() throws MalformedURLException {
		
		URL wsdlUrl = new URL(endpointUrl + "?wsdl");
        QName serviceName = new QName("http://impl.greeting.jaxws.est.lk/", "GreetingService");
		
        Service service = Service.create(wsdlUrl, serviceName);
        IGreetingService iGreetingService = service.getPort(IGreetingService.class);
        
		String response = iGreetingService.getGreetingHellowMessage(name);
		Assert.assertEquals(IGretingsMessages.HELLO + name, response);
	}
	
	/**
	 * Test the service with published Endpoint for welcome greeting message.
	 * @throws MalformedURLException
	 */
	@Test
	public void testGreetingWelcomeMessage() throws MalformedURLException {
		
		URL wsdlUrl = new URL(endpointUrl + "?wsdl");
        QName serviceName = new QName("http://impl.greeting.jaxws.est.lk/", "GreetingService");
		
        Service service = Service.create(wsdlUrl, serviceName);
        IGreetingService iGreetingService = service.getPort(IGreetingService.class);
        
		String response = iGreetingService.getGreetingWelcomeMessage(name);
		Assert.assertEquals(IGretingsMessages.WELCOME + name, response);
	}

}
