package bankSystem;

public abstract class Account {
	private String hesapNo;
	private double bakiye;
	private CustomerAccount customer;
	
	/*1- Encaplusation - kapsülleme
	 *2- Inheritance - Miras
	 *3- Abstraction - Soyutlama 
	 */
	public Account(String hesapNo, double bakiye, CustomerAccount customer) {		
		this.hesapNo = hesapNo;
		this.bakiye = bakiye;
		this.customer = customer;
	}
	
	
	public abstract void paraYatir(double miktar);	
	public abstract void paraCek(double miktar);
	public abstract double bakiyeGoruntüle();
	
	public void hesapBagla(CustomerAccount customer) {
		customer.addAccount(this);
	}

}
