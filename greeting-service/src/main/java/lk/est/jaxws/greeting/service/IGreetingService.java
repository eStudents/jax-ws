package lk.est.jaxws.greeting.service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/**
 * The class IGreetingService is the web service interface.
 * 
 * @author rangalal.g
 * 
 */

@WebService
@SOAPBinding(style = Style.RPC)
public interface IGreetingService {

	/**
	 * @param name
	 * @return the greeting massage hello.
	 */
	@WebMethod
	public String getGreetingHellowMessage(String name);

	/**
	 * @param name
	 * @return the greeting massage welcome.
	 */
	@WebMethod
	public String getGreetingWelcomeMessage(String name);

}
