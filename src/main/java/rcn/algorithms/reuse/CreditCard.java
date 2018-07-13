package rcn.algorithms.reuse;

public class CreditCard {
	private String customer;
	private String bank;
	private String account;
	private int limit;
	protected double balance;
	
	public CreditCard(String cust, String bk, String acnt, int lim, double initialBal) {
		customer = cust;
		bank = bk;
		account = acnt;
		limit = lim;
		balance = initialBal;
	}
	
	public String getCustomer() {
		return customer;
	}
	
	public  String getBank() {
		return bank;
	}
	
	public boolean charge(double price) {
		if(price + balance > limit)
			return false;
		balance += price;
		return true;
	}
	
	public void makePayment(double amount) {
		balance -= amount;
	}
	
	public String getAccount() {
		return account;
	}
	
	public int getLimit() {
		return limit;
	}
	
	public double getBalance() {
		return balance;
	}
}
