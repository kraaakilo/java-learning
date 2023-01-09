package com.kraaakilo.strings;

public class StringService {
    private static String generateRandomStringService(int length) {
        return getString(length);
    }

    private static String getString(int length) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String random = "";
        for (int i = 0; i < length; i++) {
            random = random.concat(String.valueOf(alphabet.charAt((int) Math.round(Math.random() * (alphabet.length() - 1)))));
        }
        return random;
    }

    public static String generateRandomString(int length) {
        return generateRandomStringService(length);
    }

    public static String generateRandomString() {
        return generateRandomStringService(5);
    }
}
