package bankSystem;

public class KrediHesabi extends Account {

	public KrediHesabi(String hesapNo, double bakiye, CustomerAccount customer) {
		super(hesapNo, bakiye, customer);
		// TODO Auto-generated constructor stub
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
