package bankSystem;

public class Main {
	public static void main(String[] args) {
		CustomerAccount ca=new CustomerAccount("Abuzer Kadayıf", "Dünya");
		KrediHesabi krediHesabi = new KrediHesabi(1000.0, ca);
		YatirimHesabi yatirimHesabi = new YatirimHesabi(2000.0, ca);
		VadesizHesap vadesizHesap = new VadesizHesap(3000.0, ca);

	

		for (Account account : ca.getAccounts()) {
			if (account != null) {
				System.out.println("Hesap No: " + account.getHesapNo() + " Bakiye: " + account.getBakiye());
			}
		}
	}

}
