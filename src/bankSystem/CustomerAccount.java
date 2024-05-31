package bankSystem;

public class CustomerAccount {
	private String customerName;
	private String adres;
	private Account[] accounts;

	public CustomerAccount(String customerName, String adres) {
		this.customerName = customerName;
		this.adres = adres;
		this.accounts = new Account[3];
	}

	public void addAccount(Account account) {
		boolean alreadyExists = false;
		
		if (account instanceof KrediHesabi) {
			alreadyExists = krediHesabiKontrolEt();
		} else if (account instanceof YatirimHesabi) {
			alreadyExists = yatirimHesabiKontrolEt();
		} else if (account instanceof VadesizHesap) {
			alreadyExists = vadesizHesapKontrolEt();
		}
		
		if (alreadyExists) {
			System.out.println("Bu türde zaten bir hesabınız var.");
			return;
		}
		
		boolean added = false;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] == null) {
				accounts[i] = account;
				System.out.println("Hesap başarıyla eklendi.");
				added = true;
				break;
			}
		}
		
		if (!added) {
			System.out.println("Hesap eklenemedi. Hesap slotları dolu.");
		}
	}

	private boolean krediHesabiKontrolEt() {
		for (Account account : accounts) {
			if (account instanceof KrediHesabi) {
				return true;
			}
		}
		return false;
	}

	private boolean yatirimHesabiKontrolEt() {
		for (Account account : accounts) {
			if (account instanceof YatirimHesabi) {
				return true;
			}
		}
		return false;
	}

	private boolean vadesizHesapKontrolEt() {
		for (Account account : accounts) {
			if (account instanceof VadesizHesap) {
				return true;
			}
		}
		return false;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public Account[] getAccounts() {
		return accounts;
	}
}
