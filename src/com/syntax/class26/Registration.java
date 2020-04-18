package com.syntax.class26;

public class Registration {
	//Create Registration Class
	//in which you would have variables as email, userName and password that have an access scope only within its own class.
	//After creating an object of the class user should be able to call methods 
	//and in each method separately pass values to set users email, username and password. 
	private String email;
	private String userName;
	private String password;
	public void setEmail(String email) {
		if(!email.isEmpty()) {
			if(email.contains("yahoo")) {
				this.email=email;
			}else {
				System.out.println("email must be of yahoo type");
			}		
		}else {
			System.out.println("email cannot be empty");
		}
	}
	
	public String getEmail() {
		return email;
	}
	public void setUserName(String userName) {
		if(!userName.isEmpty()) {
			if(userName.length()>8) {
				this.userName=userName;
			}else {
				System.out.println("User name is to short");
			}
			
		}else {
			System.out.println("User name cannot be empty");
		}
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setPassword(String password) {
		if(password.length()>0) {
			if(password.length()>6) {
				if(!password.contains(userName)) {
					this.password=password;
				}else {
					System.out.println("password cannot be userName");
				}
				
			}else {
				System.out.println("password is to short");
			}
			
		}else {
			System.out.println("password cannot be empty");
		}
	}
	public String getPassword() {
		return password;
	}
	
}
