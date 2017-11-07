package journaldev.structural.facade;

public class BankAccountFacade {

	private int accountNumber;
	private int securityCode;

	AccountNUmberCheck accountNUmberChecker;
	SecurityCodeCheck securityCodeChecker;
	FundsCheck fundsChecker;

	public BankAccountFacade(int accountNumber, int securityCode){
		this.accountNumber = accountNumber;
		this.securityCode = securityCode;

		accountNUmberChecker = new AccountNUmberCheck();
		securityCodeChecker = new SecurityCodeCheck();
		fundsChecker = new FundsCheck();
	}

	public int getAccountNumber(){return accountNumber;}
	public int getSecurityCode(){return securityCode;}

	public void withdrawCash(double cashToGet){
		if(accountNUmberChecker.isAccountActive(getAccountNumber())
				&& securityCodeChecker.isCodeCorrect(getSecurityCode())
				&& fundsChecker.hasEnoughMoney(cashToGet)){
			System.out.println("Transaction complete!");
		}else{
			System.out.println("Transaction failed!");
		}
	}

}
