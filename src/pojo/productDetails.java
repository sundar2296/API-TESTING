package pojo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class productDetails {
	private String productName;
	private int qty;
	private long prize;
	private int orderId;
	private Address address;
	private Details contactDetails;
	
	public Details getContactDetails() {
		return contactDetails;
	}
	public void setContactDetails(Details contactDetails) {
		this.contactDetails = contactDetails;
	}
	public  Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public long getPrize() {
		return prize;
	}
	public void setPrize(long prize) {
		this.prize = prize;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;

	}
	
	
	
	}
	
	
	


	
	


