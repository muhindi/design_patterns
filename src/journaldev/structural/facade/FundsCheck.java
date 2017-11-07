package journaldev.structural.facade;

public class FundsCheck {

	private double cashInAccount = 1000.00;

	public double getCashInAccount(){return cashInAccount;}

	//deposit funds to account
	public void creditAccount(double cashDeposited){
		cashInAccount += cashDeposited;
	}

	//withdraw funds from account
	public void debitAccount(double cashWithdrawn){
		cashInAccount -= cashWithdrawn;
	}

	public boolean hasEnoughMoney(double cashToWithdraw){
		if(cashToWithdraw > cashInAccount){
			System.out.println("Not enough money in account: "+ cashInAccount);
			return false;
		}else{
			debitAccount(cashToWithdraw);
			System.out.println("Withdraw done!, Balance is "+cashInAccount);
			return true;
		}
	}


}
