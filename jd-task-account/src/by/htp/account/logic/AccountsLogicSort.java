package by.htp.account.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import by.htp.account.bean.Account;

public class AccountsLogicSort {
	
	public List<Account> sortByBankAccNumber(List<Account> accounts){
		List<Account> result = new ArrayList<Account>();
		result.addAll(accounts);
		
		boolean isSorted = false;
		while(!isSorted) {
			isSorted = true;
			for (int i = 1; i < result.size(); i++) {
				Account acc1 = result.get(i);
				Account acc2 = result.get(i-1);
				if(acc1.getBankAccountNumber()<acc2.getBankAccountNumber()) {
					Collections.swap(result, i, i-1);
					isSorted = false;
					
					
				}
				
			}
			
		}
	
		return result;
	}
	public List<Account> sortByBalance(List<Account> accounts){
		List<Account> result = new ArrayList<Account>();
		result.addAll(accounts);
		boolean isSorted = false;
		while(!isSorted) {
			isSorted = true;
			for (int i = 1; i < result.size(); i++) {
				Account acc1 = result.get(i);
				Account acc2 = result.get(i-1);
				if(acc1.getBalance()>acc2.getBalance()) {
					Collections.swap(result, i, i-1);
					isSorted = false;
				}
			}
		}
		return result;
	}
	

}
