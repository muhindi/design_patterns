package journaldev.structural.facade;

public class AccountNUmberCheck {

	private int accountNumber = 12345678;

	public int getAccountNumber(){return accountNumber;}

	public boolean isAccountActive(int accountNumberToCheck){
		if(accountNumberToCheck == getAccountNumber())
			return true;
		else {
			return false;
		}
	}
}
