package lk.est.jaxws.greeting.test;

import org.junit.Assert;
import org.junit.Test;

import lk.est.greeting.msg.IGretingsMessages;
import lk.est.jaxws.greeting.impl.Greeting;
import lk.est.jaxws.greeting.service.IGreetingService;

/**
 * The class GreetingServiceTest for direct service test without publish it in a container.
 * @author rangalal.g
 *
 */

public class GreetingServiceTest {

	private final String name = "Rangalal";

	private IGreetingService iGreetingService;
	
	@Test
	public void testGreetingHellowMessage() {
		iGreetingService = new Greeting();
		String result = iGreetingService.getGreetingHellowMessage(name);
		Assert.assertEquals("Check for messsage 'Hello Rangalal'",IGretingsMessages.HELLO+ name, result);
	}

}
