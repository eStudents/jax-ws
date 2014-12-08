package est.jaxws.temp.client;

import com.w3schools.webservices.TempConvert;
import com.w3schools.webservices.TempConvertSoap;

public class TempConverterClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		TempConvert tempConvert = new TempConvert();
		TempConvertSoap tempConvertSoap = tempConvert.getTempConvertSoap();
		
		String celsiusValue = "36";
		String fahrenheitValue = tempConvertSoap.celsiusToFahrenheit(celsiusValue);
		
		System.out.println("Fahrenheit Value of " + celsiusValue + "C is " + fahrenheitValue + ".");
		System.out.println("Celsius value of 96.8f is " + tempConvertSoap.fahrenheitToCelsius("96.8") +  ".");
	}

}
