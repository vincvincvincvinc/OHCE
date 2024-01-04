package fr.epsi.b32324c1;

import java.util.Scanner;

public class ConsoleApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a language: ");
        System.out.println("1. English");
        System.out.println("2. Lithuanian");
        int languageChoice = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        LangueInterface language;
        if (languageChoice == 1) {
            language = new LangueAnglaise(getTimeOfDay());
        } else {
            language = new LangueLituanienne(getTimeOfDay());
        }

        VerificationPalindrome verifier = new VerificationPalindrome(language, MomentDeLaJournee.Matin);

        saluer(language);

        while (true) {
            System.out.print("Enter text (or 'exit' to quit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                direAuRevoir(language);
                break;
            }

            String result = verifier.verifier(input);
            System.out.println(result);
        }

        scanner.close();
    }

    private static void saluer(LangueInterface language) {
        System.out.println(language.Saluer());
    }

    private static void direAuRevoir(LangueInterface language) {
        System.out.println(language.DireAuRevoir());
    }

    private static String getTimeOfDay() {
        // You can use a more accurate way to determine the time of day if needed
        // For simplicity, I'm using a hardcoded value here.
        return "morning";
    }

    public static void start() {
        System.out.println("Program started...");
    }

}

