package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationUC3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Email");
		String email=scan.next();
		
		String regex = "^[a-zA-Z0-9]+([.][A-Za-z]+)*@[a-zA-Z]+[.]+[a-zA-Z]{2,3}+([.][A-Za-z]+)*$";
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(email);
		boolean res = m.matches();
		
		if(res) {
			System.out.println("Valid Email Address");
		}
		else {
			System.out.println("Email Address is InValid ");
		}
	}

}
