package by.htp.account.main;

import java.util.List;

import by.htp.account.bean.Account;
import by.htp.account.bean.CustomerAccounts;
import by.htp.account.logic.AccountsLogicSearch;
import by.htp.account.logic.AccountsLogicSort;
import by.htp.account.logic.AccountsLogicSum;
import by.htp.account.view.AccountsView;

public class Main {

	public static void main(String[] args) {
		CustomerAccounts accsByIvanovIvan = new CustomerAccounts();
		AccountsLogicSearch accountLogicSearch = new AccountsLogicSearch();
		AccountsLogicSort accountLogicSort = new AccountsLogicSort();
		AccountsLogicSum accountLogicSum = new AccountsLogicSum();
		AccountsView accountsView = new AccountsView();
		
		Account acc1 = new Account(743453, "Ivanov", "ivan", -754, true);
		Account acc2 = new Account(324544, "Ivanov", "ivan", 1132, false);
		Account acc3 = new Account(797833, "Ivanov", "ivan", 1453, false);
		Account acc4 = new Account(236454, "Ivanov", "ivan", -25, true);
		Account acc5 = new Account(136869, "Ivanov", "ivan", -1504, false);
		Account acc6 = new Account(566756, "Ivanov", "ivan", 0, false);
		
		accsByIvanovIvan.addAccount(acc1);
		accsByIvanovIvan.addAccount(acc2);
		accsByIvanovIvan.addAccount(acc3);
		accsByIvanovIvan.addAccount(acc4);
		accsByIvanovIvan.addAccount(acc5);
		accsByIvanovIvan.addAccount(acc6);
		
		List<Account> result  = accountLogicSearch.findUnblockedAccs(accsByIvanovIvan.getAccounts());
		accountsView.print(result, "Unblocked accounts");
		result = accountLogicSort.sortByBankAccNumber(result);
		accountsView.print(result, "Unblocked sorted accounts");
		int sum = accountLogicSum.sumBalanceAccs(result);
		accountsView.print(sum, "Sum balance by unblocked accounts ");
		
		
		
	

	}

}
