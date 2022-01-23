public class Account {

//	protected String accountNumber;
//	protected boolean isSavingAccount;

	private String accountNumber;
	private boolean isSavingAccount;

	public Account(String accountNumber, boolean isSavingAccount) {
		this.accountNumber = accountNumber;
		this.isSavingAccount = isSavingAccount;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public boolean isSavingAccount() {
		return isSavingAccount;
	}

	public void setSavingAccount(boolean savingAccount) {
		isSavingAccount = savingAccount;
	}
}
