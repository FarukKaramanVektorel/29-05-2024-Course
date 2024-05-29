package bankSystem;

import java.util.Iterator;

public class CustomerAccount {
	private String customerName;
	private String adres;
	private Account[] accounts;
	
	public CustomerAccount(String customerName, String adres ) {		
		this.customerName = customerName;
		this.adres = adres;
		this.accounts=new Account[3];
		for (int i = 0; i < accounts.length; i++) {
			System.out.println(accounts[i]);
		}
		
	}
	
	public void addAccount(Account account) {
		if(account instanceof YatirimHesabi) {
			YatirimHesabi yh=(YatirimHesabi) account;
			boolean isYatirimVarmi=yatirimHesabiKontrolEt(yh);
			
		}else if(account instanceof VadesizHesap) {
			VadesizHesap vh=(VadesizHesap) account;
			
		}else if(account instanceof KrediHesabi) {
			KrediHesabi kh=(KrediHesabi) account;
		}else {
			System.out.println("Komutan Logar bir cisim yaklaşıyor...");
		}
		
		
		
	}

	private boolean yatirimHesabiKontrolEt(YatirimHesabi yh) {
		boolean donus=false;
		for (int i = 0; i < this.accounts.length; i++) {
			if(accounts[i]!=null) {
				if(accounts[i] instanceof YatirimHesabi) {
					System.out.println("Arkadaşın yatırım hesabı var sen neyin peşindesin???");
					donus=true;					
					return donus;
				}
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
