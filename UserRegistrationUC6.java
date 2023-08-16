package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationUC6 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the Password Atleast One Upper Case & Eight Character :");
		String passWord = scan.nextLine();
		
		String regex = "^[A-Z]{1}+[a-zA-z0-9]{7,}$";
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(passWord);
		boolean res = m.matches();
		
		if(res) {
			System.out.println("Password is Valid");
		}
		else {
			System.out.println("Password is Invalid");
		}
		
	}

}
