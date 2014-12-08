package est.jaxws.temp.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import com.w3schools.webservices.TempConvertSoap;

public class TempConverterClient2 {

	/**
	 * @param args
	 * @throws MalformedURLException 
	 */
	public static void main(String[] args) throws MalformedURLException {
		
		URL url = new URL("http://www.w3schools.com/webservices/tempconvert.asmx?WSDL");
        QName qname = new QName("http://www.w3schools.com/webservices/", "TempConvert");
 
        Service service = Service.create(url, qname);
        TempConvertSoap tempConvertSoap = service.getPort(TempConvertSoap.class);
 
        String celsiusValue = "36";
		String fahrenheitValue = tempConvertSoap.celsiusToFahrenheit(celsiusValue);
		
		System.out.println("Fahrenheit Value of " + celsiusValue + "C is " + fahrenheitValue + ".");
		System.out.println("Celsius value of 96.8f is " + tempConvertSoap.fahrenheitToCelsius("96.8") +  ".");
	}

}
