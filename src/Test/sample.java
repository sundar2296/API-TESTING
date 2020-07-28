package Test;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;


import pojo.productDetails;

public class sample {
	public static void main(String[]args) throws JAXBException {
		readValueXml();
	}
	
	public static void readValueXml() throws JAXBException{
		//create the JaxbContext
		JAXBContext Context	=JAXBContext.newInstance(productDetails.class);
		
        //create the Unmarsheller
		Unmarshaller un	=Context.createUnmarshaller();
		//path of xml file
		File xmlPath=new File("D:\\ApiTesting\\src\\Api.xml");
		Object obj =un.unmarshal(xmlPath);
		//type cast
		productDetails p =(productDetails)obj;
		System.out.println("product details.....");
		System.out.println("productName:"+p.getProductName());
		System.out.println("qty:"+p.getQty());
		System.out.println("prize:"+p.getPrize());
		System.out.println("orderId:"+p.getOrderId());
	
		System.out.println();
		
		System.out.println("Address");
		System.out.println("streetName:"+p.getAddress().getStreetName());
		System.out.println("city:"+p.getAddress().getCity());
		System.out.println("district:"+p.getAddress().getDistrict());
		System.out.println("state:"+p.getAddress().getState());
		System.out.println("country:"+p.getAddress().getCountry());
		
		System.out.println();
		
		 System.out.println("contact details");
		System.out.println("emailId:"+p.getContactDetails().getEmailId());
		System.out.println("mobileNo"+p.getContactDetails().getMobileNo());
}
}