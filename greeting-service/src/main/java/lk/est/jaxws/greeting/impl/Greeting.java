package lk.est.jaxws.greeting.impl;

import javax.jws.WebMethod;
import javax.jws.WebService;

import lk.est.greeting.msg.IGretingsMessages;
import lk.est.jaxws.greeting.service.IGreetingService;

/**
 * The class Greeting implement the IGreetingService interface.
 * 
 * @author rangalal.g
 *
 */
@WebService(endpointInterface = "lk.est.jaxws.greeting.service.IGreetingService")
public class Greeting implements IGreetingService {

	
	@WebMethod()
	public String getGreetingHellowMessage(String name) {
		return IGretingsMessages.HELLO + name ;
	}

	@WebMethod
	public String getGreetingWelcomeMessage(String name) {
		return IGretingsMessages.WELCOME + name ;
	}

}
