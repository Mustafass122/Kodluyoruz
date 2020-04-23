package com.homework.account;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.homework.Insurance.Insurance;
import com.homework.address.Adress;
import com.homework.address.AdressManager;

public abstract class Account implements Comparable<Account>{	
	
	private ArrayList<Insurance> sigortalist = new ArrayList<Insurance>();	
	private AuthenticationStatus authenticationStatus;
	private User user;
	
	List<User> users = new ArrayList<User>();
	
	private User user1 = new User("Mustafa", "Sipahi", "xxxxxxx.gmail.com", "123", "Doktor", 25);
	private User user2 = new User("Kadir", "Sipahi", "xxxxxxx.gmail.com", "321", "Öğretmen", 27);
	private User user3 = new User("Galip", "Sipahi", "xxxxxxx.gmail.com", "213", "Mühendis", 29);
	
	public void userControl() {		
		users.add(user1);
		users.add(user2);
		users.add(user3);		
		this.user = (User) users;		
	}	
	
	public AuthenticationStatus getAuthenticationStatus() {
		return authenticationStatus;
	}

	public void setAuthenticationStatus(AuthenticationStatus authenticationStatus) {
		this.authenticationStatus = authenticationStatus;
	}
	

	public void addAdressAccount(User user,Adress adress) {
		AdressManager.addAdress(user, adress);
	}
	
	public void delAdressAccount(User user,Adress adress) {
		AdressManager.deleteAdress(user, adress);
	}
	
	public void yapılanSigortalarYazdır() {
		for(Insurance i : sigortalist) {
			System.out.println(i);
		}
	}	

	public abstract void sigortaEkle(Insurance insurance);
	
	public final void showUserInfo(User user) {
		System.out.println("İsim : " + user.getIsim());
		System.out.println("Soy İsim : " + user.getSoyisim());
		System.out.println("Email : " + user.getEmail());
		System.out.println("Şifre : " + user.getSifre());
		System.out.println("Meslek : " + user.getMeslek());
		System.out.println("Yaş : " + user.getYas());
		System.out.println("Adres Listesi : " + user.getAdreslistesi());
		System.out.println("Son Giriş Tarihi : " + user.getSongiris());
	}
	
	public void checkLogin(String newemail,String newsifre) throws InvalidAuthenticationException {
		userControl();
		if (((User) users).getEmail().equals(newemail) && ((User) users).getSifre().equals(newsifre)) {
			authenticationStatus = AuthenticationStatus.SUCCESS;
		}
		else {
			authenticationStatus = AuthenticationStatus.FAIL;
			throw new InvalidAuthenticationException();			
		}
	}

	public boolean login() {
		if (this.authenticationStatus == AuthenticationStatus.SUCCESS) {
			return true;
		}
		else {
			return false;
		}
	}
	
	@Override
	public int compareTo(Account o) {		
		return user.getIsim().compareTo(o.getIsim());
	}

	private String getIsim() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((authenticationStatus == null) ? 0 : authenticationStatus.hashCode());
		result = prime * result + ((sigortalist == null) ? 0 : sigortalist.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		result = prime * result + ((user1 == null) ? 0 : user1.hashCode());
		result = prime * result + ((user2 == null) ? 0 : user2.hashCode());
		result = prime * result + ((user3 == null) ? 0 : user3.hashCode());
		result = prime * result + ((users == null) ? 0 : users.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (authenticationStatus != other.authenticationStatus)
			return false;
		if (sigortalist == null) {
			if (other.sigortalist != null)
				return false;
		} else if (!sigortalist.equals(other.sigortalist))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		if (user1 == null) {
			if (other.user1 != null)
				return false;
		} else if (!user1.equals(other.user1))
			return false;
		if (user2 == null) {
			if (other.user2 != null)
				return false;
		} else if (!user2.equals(other.user2))
			return false;
		if (user3 == null) {
			if (other.user3 != null)
				return false;
		} else if (!user3.equals(other.user3))
			return false;
		if (users == null) {
			if (other.users != null)
				return false;
		} else if (!users.equals(other.users))
			return false;
		return true;
	}
	
}
