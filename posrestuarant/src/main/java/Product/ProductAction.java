package Product;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class ProductAction extends ActionSupport {
	private ProductModel productmodel;

	public ProductModel getProductmodel() {
		return productmodel;
	}

	public void setProductmodel(ProductModel productmodel) {
		this.productmodel = productmodel;
	}
	
	public String execute(){
		
		HttpServletRequest request = ServletActionContext.getRequest();
		
		String 	product_id =productmodel.getProduct_id() ,
				product_name = productmodel.getProduct_name(),
				forwardText ="";
		
		String submit = request.getParameter("submit"),
				cancel = request.getParameter("cancel");
		
		if(submit != null){
			productmodel.setProduct_id(product_id);
			productmodel.setProduct_name(product_name);
			forwardText ="submit";
		}else{
			forwardText ="cancel";
		}
		
		
		
		return forwardText;
	}
}
