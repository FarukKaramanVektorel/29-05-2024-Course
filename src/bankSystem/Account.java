package bankSystem;

public abstract class Account {
	private String hesapNo;
	private double bakiye;
	private CustomerAccount customer;

	public Account(double bakiye, CustomerAccount customer) {
		this.hesapNo = AccountNumberGenerator.generateAccountNumber(this.getClass());
		this.bakiye = bakiye;
		this.customer = customer;
	}
	
	public abstract void paraYatir(double miktar);	
	public abstract void paraCek(double miktar);
	public abstract double bakiyeGoruntule();

	

	public String getHesapNo() {
		return hesapNo;
	}

	public double getBakiye() {
		return bakiye;
	}

	public CustomerAccount getCustomer() {
		return customer;
	}
}
