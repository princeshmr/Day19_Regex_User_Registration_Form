package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationUC7 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Password Atleast One Upper Case & One Numaric");
		String passWord = scan.nextLine();
		
		String regex = "^[A-Z]{1}+[a-zA-Z]{6}+[0-9]+{1,}$";

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
