package pojo;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class product2 {
	private List<pojo.productDetails>productDetails;

	public List<pojo.productDetails> getProductDetails() {
		return productDetails;
	}

	public void setProductDetails(List<pojo.productDetails> productDetails) {
		this.productDetails = productDetails;
	}
	
	

}
