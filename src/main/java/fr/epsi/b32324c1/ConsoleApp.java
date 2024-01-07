package fr.epsi.b32324c1;

import java.util.Scanner;

public class ConsoleApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        start();

        LangueInterface langue = choisirLangue();
        MomentDeLaJournee moment = choisirTimeOfDay();

        String greetingMessage = langue.Saluer();
        System.out.println(greetingMessage);

        boolean exit = false;

        VerificationPalindrome verifier = new VerificationPalindrome(langue, moment);

        while (!exit) {
            System.out.print("Entrez du texte (ou 'exit' pour quitter): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                exit = true;
            } else {
                String result = verifier.verifier(input);
                System.out.println(result);
            }
        }

        String goodbyeMessage = verifier.direAuRevoir();
        System.out.println(goodbyeMessage);

        scanner.close();
    }

    static void start() {
        System.out.println("Program started...");
    }

    private static LangueInterface choisirLangue() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choisissez une langue: ");
        System.out.println("1. Anglais");
        System.out.println("2. Lituanien");
        int langueChoix = scanner.nextInt();
        scanner.nextLine();

        if (langueChoix == 1) {
            return new LangueAnglaise(getTimeOfDay());
        } else {
            return new LangueLituanienne(getTimeOfDay());
        }
    }

    private static MomentDeLaJournee choisirTimeOfDay() {
        return MomentDeLaJournee.Matin;
    }

    private static String getTimeOfDay() {
        return "morning";
    }
}





/*
import java.util.Scanner;

public class ConsoleApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        start();

        LangueInterface langue = choisirLangue();
        MomentDeLaJournee moment = choisirTimeOfDay();
        VerificationPalindrome verifier = new VerificationPalindrome(langue, moment);

        String greetingMessage = langue.Saluer();
        System.out.println(greetingMessage);

        boolean exit = false;

        while (!exit) {
            System.out.print("Entrez du texte (ou 'exit' pour quitter): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                exit = true;
            } else {
                String result = verifier.verifier(input);
                System.out.println(result);
            }
        }

        String goodbyeMessage = verifier.direAuRevoir();
        System.out.println(goodbyeMessage);

        scanner.close();
    }

    static void start() {
        System.out.println("Program started...");
    }

    private static LangueInterface choisirLangue() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choisissez une langue: ");
        System.out.println("1. Anglais");
        System.out.println("2. Lituanien");
        int langueChoix = scanner.nextInt();
        scanner.nextLine();

        if (langueChoix == 1) {
            return new LangueAnglaise(getTimeOfDay());
        } else {
            return new LangueLituanienne(getTimeOfDay());
        }
    }


    private static MomentDeLaJournee choisirTimeOfDay() {
        return MomentDeLaJournee.Matin;
    }

    private static String getTimeOfDay() {
        return "morning";
    }
}
*/