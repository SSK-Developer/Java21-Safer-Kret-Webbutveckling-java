package model;

public class LoginBean {

	private String userName;
	private String password;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean confirm() {
		
		if(userName.equals("username1") && password.equals("password1") || userName.equals("username2") && password.equals("password2")) {
			return true;
		}
		return false;
	}
	
}
