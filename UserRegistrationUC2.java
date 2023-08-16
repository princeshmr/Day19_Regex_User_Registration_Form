package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationUC2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter last name");
		String lastName=scan.next();

		String regex = "^[A-Z]{1}[a-z]{2,}$";
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(lastName);
		boolean res = m.matches();
		
		if(res) {
			System.out.println("It Is Valid Last Name");
		}
		else {
			System.out.println("It Is Invalid Last name");
		}
	}

}
