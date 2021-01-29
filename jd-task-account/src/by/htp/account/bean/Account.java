package by.htp.account.bean;

public class Account {
	private int bankAccountNumber;
	private String surname;
	private String name;
	private int balance;
	private boolean cardBlocked;
	
	public Account() {
		
	}

	public Account(int bankAccountNumber, String surname, String name, int balance, boolean cardBlocked) {
		this.bankAccountNumber = bankAccountNumber;
		this.surname = surname;
		this.name = name;
		this.balance = balance;
		this.cardBlocked = cardBlocked;
	}

	public int getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(int bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public boolean isCardBlocked() {
		return cardBlocked;
	}

	public void setCardBlocked(boolean cardBlocked) {
		this.cardBlocked = cardBlocked;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + balance;
		result = prime * result + bankAccountNumber;
		result = prime * result + (cardBlocked ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
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
		if (balance != other.balance)
			return false;
		if (bankAccountNumber != other.bankAccountNumber)
			return false;
		if (cardBlocked != other.cardBlocked)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Account [bankAccountNumber=" + bankAccountNumber + ", surname=" + surname + ", name=" + name
				+ ", balance=" + balance + ", cardBlocked=" + cardBlocked + "]";
	}
	
	
 

}
