package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationUC9 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the email : @gmail.com ");
		String emailSample = scan.next();
		String regex = "[a-zA-Z0-9_.]*[-]*[+]*[a-zA-Z0-9]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(emailSample);
		boolean res = m.matches();
		if (res) {
			System.out.println("Valid G-mail Address");
		}
		else {
			System.out.println("Invalid G-mail Address");
		}
	}

}


