package com.homework.Main;

import java.util.Scanner;

import com.homework.account.Account;
import com.homework.account.AccountManager;
import com.homework.account.InvalidAuthenticationException;

public class Main {

	public static void main(String[] args) throws InvalidAuthenticationException {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Email Adresinizi Giriniz : ");
		String email = scanner.nextLine();
		
		System.out.println("Şifrenizi Giriniz : ");
		String sifre = scanner.nextLine();
		
		scanner.close();
		
		AccountManager accountManager = new AccountManager();		
		Account account = accountManager.login(email, sifre);
		
	}
}
