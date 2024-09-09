package com.evergent.corejava.oops;

public class UserLogin {
	
	public void loginInfo() {
		System.out.println("Login Info");
	}
	
	public void loginData(String uname,String pass, String capcha) {
		System.out.println("Username : "+ uname);
		System.out.println("Password : "+ pass);
		System.out.println("Capcha : "+capcha);
	}
	public void loginData(int mobile, String pass) {
		System.out.println("Mobile : "+ mobile);
		System.out.println("pass : " + pass);
	}

	public static void main(String[] args) {
		UserLogin ul = new UserLogin();
		ul.loginInfo();
		System.out.println("______");
		ul.loginData("Aashritha" , "Aash123", "hs73A3");
		System.out.println("______");
		ul.loginData(12353, "aash123");
	}

}
