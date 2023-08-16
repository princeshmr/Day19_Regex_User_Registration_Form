package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationUC4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Mobile number");
		String mobileNumber=scan.nextLine();
		
		String regex = "(91|0)?\\s?[6-9][0-9]{9}$";
		
		Pattern p3 = Pattern.compile(regex);
		Matcher m3 = p3.matcher(mobileNumber);
		boolean res = m3.matches();
		
		if(res) {
			System.out.println("Mobile Number is Valid");
		}
		else {
			System.out.println("Mobile Number is Invalid");
		}
			

	}

}
