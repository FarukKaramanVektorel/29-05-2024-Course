package bankSystem;

public class KrediHesabi extends Account {

	public KrediHesabi(double bakiye, CustomerAccount customer) {
		super(bakiye, customer);
		customer.addAccount(this);
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
	public double bakiyeGoruntule() {
		// TODO Auto-generated method stub
		return 0;
	}
}
