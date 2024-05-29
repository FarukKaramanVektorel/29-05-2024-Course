import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String name = InputHandler.getStringInput("Merhaba, İsmim Robo. Senin ismin nedir?");
		int yas = InputHandler.getIntInput("tanıştığımıza memnun oldum " + name + "\nKaç yaşındasın?");
		double maas = InputHandler
				.getDoubleInput(yas + " en güzel yaşlardandır.\n" + name + " Ne kadar maaş alıyorsun?");
		boolean isMarried = InputHandler
				.getBoolenInput(name + " bu maaş ile iyi geçinmen lazım.\nEvlimisin? (true / false)");
		System.out.println("Hayatta bol çok başarılar felan fistan...");

	}

}
