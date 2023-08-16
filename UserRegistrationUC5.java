package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationUC5 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter The Password Atleast 8 Character :- ");
		String passWord = scan.nextLine();
        
		String regex = "^[A-Z a-z 0-9]{8,}$";
		
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
