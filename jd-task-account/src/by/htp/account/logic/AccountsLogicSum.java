package by.htp.account.logic;



import java.util.List;

import by.htp.account.bean.Account;


public class AccountsLogicSum {
	
	public int sumBalanceAccs(List <Account> accounts) {
		int sum = 0;
		for (Account account : accounts) {
			sum = sum + account.getBalance();
		}
		return sum;
	}
	
}
