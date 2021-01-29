package by.htp.account.logic;

import java.util.ArrayList;
import java.util.List;

import by.htp.account.bean.Account;

public class AccountsLogicSearch {
     public List<Account> findAccWithNegBalance(List<Account> accounts){
    	 List<Account> result = new ArrayList<Account>();
    	 for (Account account : accounts) {
			if(account.getBalance()<0) {
				result.add(account);
			}
		}
    	return result; 
     }

     public List<Account> findAccWithPosBalance(List<Account> accounts){
        	 List<Account> result = new ArrayList<Account>();
        	 for (Account account : accounts) {
    			if(account.getBalance()>=0) {
    				result.add(account);
    			}
    		}
        	return result; 
         }
     
     public List<Account> findBlockedAccs(List<Account> accounts){
    	 List<Account> result = new ArrayList<Account>();
    	 for (Account account : accounts) {
			if(account.isCardBlocked()==true) {
				result.add(account);
			}
		}
    	 return result;
     }
     
     public List<Account> findUnblockedAccs(List<Account> accounts){
    	 List<Account> result = new ArrayList<Account>();
    	 for (Account account : accounts) {
			if(account.isCardBlocked()==false) {
				result.add(account);
			}
		}
    	 return result;
     }
     
     public List<Account> findByAccNumb(List<Account> accounts,int bankAccountNumber){
    	 List<Account> result = new ArrayList<Account>();
    	 for (Account account : accounts) {
			if(account.getBankAccountNumber()==bankAccountNumber) {
				result.add(account);
			}
		}
    	return result; 
     }
     public int sumBalanceAllAccs(List<Account> accounts){
    	 int sum = 0;
    	 for (Account account : accounts) {
			sum = sum+account.getBalance();
		}
    	return sum; 
     }
     
     public int sumAccsPosBalance(List<Account> accounts) {
    	 int sum = 0;
    	 List<Account> result;
    	 result = findAccWithPosBalance(accounts);
    	 for (Account account : result) {
			sum = sum + account.getBalance();
		}
    	 return sum;
    	 
     }
     public int sumAccsNegBalance(List<Account> accounts) {
    	 int sum = 0;
    	 List<Account> result;
    	 result = findAccWithNegBalance(accounts);
    	 for (Account account : result) {
			sum = sum + account.getBalance();
		}
    	 return sum;
    	 
     }
     
     
    
}
     




