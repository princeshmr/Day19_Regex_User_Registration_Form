package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationUC1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first name");
		String firstName=scan.next();
		String regex = "^[A-Z]{1}[a-z]{3,}$";
		
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(firstName);
		boolean res=m.matches();
		
		if (res) {
			System.out.println("It Is A Valid First Name");
		}
		else {
			System.out.println("It Is Invalid First Name");
		}


	}

}
