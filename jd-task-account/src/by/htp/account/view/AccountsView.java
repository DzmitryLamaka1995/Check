package by.htp.account.view;

import java.util.List;

import by.htp.account.bean.Account;

public class AccountsView {
	public void print (List <Account> accounts,String message) {
		System.out.println("******" + message + "******");
		for (Account account : accounts) {
			System.out.print("Bank Account Number = " + account.getBankAccountNumber() + " | "  + account.getSurname()+" "+
		account.getName()+" | Balance = " + account.getBalance()+" | ");
			if(account.isCardBlocked()==true) {
				System.out.println("Card blocked");
			}else {
				System.out.println("Card is not blocked");
			}
		}
	}
	
	public void print(int sum, String message) {
		System.out.print(message + " "+ sum);
		
	}
	

}
