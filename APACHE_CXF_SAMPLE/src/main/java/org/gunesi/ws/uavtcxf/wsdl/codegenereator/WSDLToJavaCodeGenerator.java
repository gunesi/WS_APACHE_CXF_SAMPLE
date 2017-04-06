package org.gunesi.ws.uavtcxf.wsdl.codegenereator;

import org.apache.cxf.tools.wsdlto.WSDLToJava;

public class WSDLToJavaCodeGenerator {

	public static void main(String[] args) {
		try {
		
			WSDLToJava.main(new String[] { "-d", "src", "https://www.w3schools.com/xml/tempconvert.asmx?WSDL" });
			
		    System.out.println("Files have generated!!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
