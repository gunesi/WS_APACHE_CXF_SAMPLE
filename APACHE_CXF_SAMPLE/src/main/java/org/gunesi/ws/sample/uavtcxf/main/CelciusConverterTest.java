package org.gunesi.ws.sample.uavtcxf.main;

import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.w3schools.ws.tempconvert.TempConvertSoap;

public class CelciusConverterTest {

	public static void main(String[] args) {
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.getInInterceptors().add(new LoggingOutInterceptor());
		factory.setServiceClass(TempConvertSoap.class);
		factory.setAddress("https://www.w3schools.com/xml/tempconvert.asmx");
		
		TempConvertSoap client = (TempConvertSoap)factory.create();
		String response = client.celsiusToFahrenheit("30");
		System.out.println("30 celsius equal to " + response + " fahrenheit");
	}

}
