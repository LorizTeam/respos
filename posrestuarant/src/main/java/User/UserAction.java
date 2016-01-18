package User;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{
	private UserModel usermodel;
	
	public UserModel getUsermodel() {
		return usermodel;
	}

	public void setUsermodel(UserModel usermodel) {
		this.usermodel = usermodel;
	}

	public String execute(){
		
		String username = usermodel.getUsername();
		String password = usermodel.getPassword();
		
		System.out.println(username);
		System.out.println(password);
		
		usermodel.setUsername(username);
		
		return SUCCESS;
	}
}
