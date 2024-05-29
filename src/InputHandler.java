import java.util.Scanner;

public class InputHandler {
	private static final Scanner SCANNER = new Scanner(System.in);
	private InputHandler() {
		
	}
	public static int getIntInput(String message) {
		System.out.println(message);
		int errorCount = 0;
		while (true) {
			if (SCANNER.hasNextInt()) {
				return SCANNER.nextInt();
			} else {
				errorCount++;
				printErrorMessage("Lütfen geçerli bir tam sayı giriniz. Tekrar Dene", errorCount);
				SCANNER.next();
			}
		}
	}
	public static String getStringInput(String message) {
		System.out.println(message);
		return SCANNER.next();
	}
	public static double getDoubleInput(String message) {
		System.out.println(message);
		int errorCount = 0;
		while (true) {
			if (SCANNER.hasNextDouble()) {
				return SCANNER.nextDouble();
			} else {
				errorCount++;
				printErrorMessage("Lütfen geçerli bir ondalıklı sayı giriniz. Tekrar Dene", errorCount);
				SCANNER.next();
			}
		}
	}
	public static boolean getBoolenInput(String message) {
		System.out.println(message);
		int errorCount = 0;
		while (true) {
			if (SCANNER.hasNextBoolean()) {
				return SCANNER.nextBoolean();
			} else {
				errorCount++;
				printErrorMessage("Lütfen geçerli bir boolean değer giriniz. Tekrar Dene", errorCount);
				SCANNER.next();
			}
		}
	}
	public static void printErrorMessage(String message, int count) {
		if (count > 0 && count < 3) {
			System.out.print("Hatalı giriş sayısı : " + count + " " + message);
		} else if (count >= 3 && count <= 5) {
			System.out.println(
					"Sen dünyada teksin dostum bir girişi beceremedin " + count + " deneme oldu. Adamı hasta etme.");
		} else if (count > 5) {
			System.out.println(
					"Zoret dama çıkacaaan " + count + " deneme oldu. bence bir doktora görün...");
		} else {
			System.out.println(message + " : ");
		}
	}

}
