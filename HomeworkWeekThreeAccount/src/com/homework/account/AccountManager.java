package com.homework.account;

import java.util.TreeSet;

public class AccountManager{

	private TreeSet<Account> treeHEsaplar = new TreeSet<Account>();
	
	public TreeSet<Account> getTreeHEsaplar() {
		return treeHEsaplar;
	}

	public void setTreeHEsaplar(TreeSet<Account> treeHEsaplar) {
		this.treeHEsaplar = treeHEsaplar;
	}

	public Account login(String email2,String sifre2) throws InvalidAuthenticationException {
	
		for(Account a : treeHEsaplar) {
			try {
				a.checkLogin(email2, sifre2);
			} catch (InvalidAuthenticationException e) {
				System.out.println(a.getAuthenticationStatus());
			}
		}
		return null;
	}


}
