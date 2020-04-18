package com.syntax.class26;

public class Registration2 {
	private String email;
	private String userName;
	private String password;
	
	public void setEmail(String email){
		if(email.endsWith("yahoo.com")) {
			this.email=email;			
		}else {
			System.out.println("Only yahoo.com");
		}
	}
	public void setuserName(String userName){
		if(!userName.isEmpty()&& userName.length()>6) {
			this.userName=userName;			
		}else {
			System.out.println("user name cannot be empty and password should be more then 6 char");
		}
	}
	public void setpassword(String password){
		if(!password.isEmpty()&&password.length()<6) {
			System.out.println("Password is too short");
		}else if(!(password.contentEquals(userName))){
	     this.password=password;
		}
	}
	
	public String getEmail(){
		return email;
	}
	public String getuserName(){
		return userName;
	}
	public String getpassword(){
		return password;
	}
}

