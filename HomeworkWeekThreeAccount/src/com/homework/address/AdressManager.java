package com.homework.address;

import com.homework.account.User;

public abstract class AdressManager {
		
	public static void addAdress(User user,Adress adress) {
		
		user.setAdreslistesiadd(adress);
	}
	
	public static void deleteAdress(User user,Adress adress) {
		
		user.setAdreslistesidel(adress);
	}

}
