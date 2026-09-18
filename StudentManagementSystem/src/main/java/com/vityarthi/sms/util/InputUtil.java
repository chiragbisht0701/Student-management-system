package com.vityarthi.sms.util;

import java.util.Scanner;

public final class InputUtil {
    private InputUtil() {}

    public static String readNonEmpty(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            String value = sc.nextLine().trim();
            if (!value.isEmpty()) return value;
            System.out.println("Value cannot be empty.");
        }
    }

    public static int readInt(Scanner sc, String prompt, int min, int max) {
        while (true) {
            try {
                System.out.print(prompt);
                int value = Integer.parseInt(sc.nextLine().trim());
                if (value >= min && value <= max) return value;
            } catch (NumberFormatException ignored) {}
            System.out.println("Enter a valid integer in range " + min + "-" + max + ".");
        }
    }

    public static double readDouble(Scanner sc, String prompt, double min, double max) {
        while (true) {
            try {
                System.out.print(prompt);
                double value = Double.parseDouble(sc.nextLine().trim());
                if (value >= min && value <= max) return value;
            } catch (NumberFormatException ignored) {}
            System.out.println("Enter a valid number in range " + min + "-" + max + ".");
        }
    }
}
