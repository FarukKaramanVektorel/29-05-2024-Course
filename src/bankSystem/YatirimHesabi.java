package bankSystem;

public class YatirimHesabi extends Account{

	public YatirimHesabi(String hesapNo, double bakiye, CustomerAccount customer) {
		super(hesapNo, bakiye, customer);
		super.hesapBagla(customer);
	}

	@Override
	public void paraYatir(double miktar) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void paraCek(double miktar) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double bakiyeGoruntüle() {
		// TODO Auto-generated method stub
		return 0;
	}

}
