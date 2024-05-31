package bankSystem;

import java.util.Random;

public class AccountNumberGenerator {
	

    private static final String KREDI_PREFIX = "12345678";
    private static final String YATIRIM_PREFIX = "87654321";
    private static final String VADESIZ_PREFIX = "11223344";

    public static String generateAccountNumber(Class<? extends Account> accountClass) {
        String prefix = "";

        if (accountClass == KrediHesabi.class) {
            prefix = KREDI_PREFIX;
        } else if (accountClass == YatirimHesabi.class) {
            prefix = YATIRIM_PREFIX;
        } else if (accountClass == VadesizHesap.class) {
            prefix = VADESIZ_PREFIX;
        }

        return prefix + generateRandomDigits(8);
    }

    private static String generateRandomDigits(int length) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(random.nextInt(10)); // 0-9 arası rastgele sayı ekler
        }
        return sb.toString();
    }
}

