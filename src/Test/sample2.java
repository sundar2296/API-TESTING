package Test;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import pojo.product2;
import pojo.productDetails;

public class sample2 {

	public static void main(String[]args) throws JAXBException {
		readValueXml();
	}
	
	public static void readValueXml() throws JAXBException{
		//create the JaxbContext
		JAXBContext Context	=JAXBContext.newInstance(productDetails.class);
		Marshaller Mn	=Context.createMarshaller();
		//path of xml file
		File xmlPath=new File("D:\\ApiTesting\\src\\Test\\marshaller.xml");
		//set the value
		productDetails details= new productDetails();
		details.setProductName("samsung s20");
		details.setQty(1);
		details.setPrize(70000);
		details.setOrderId(133);
		//add the obj reff,xml loc
		Mn.marshal(details, xmlPath);;
		System.out.println("Done......");
	}
}
		
		
		
		
		
		
		

