package journaldev.structural.facade;

public class TestBankAccount {

	public static void main(String[] args) {
		BankAccountFacade bankAccount = new BankAccountFacade(12345678,1234);
		bankAccount.withdrawCash(500.00);
		bankAccount.withdrawCash(900.00);
	}

}
