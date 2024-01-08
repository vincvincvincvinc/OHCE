package fr.epsi.b32324c1;

import java.util.Scanner;
import java.time.LocalTime;


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

    public static void start() {
        System.out.println("Program started...");
    }

    public static LangueInterface choisirLangue() {
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

    public static MomentDeLaJournee choisirTimeOfDay() {
        LocalTime currentTime = LocalTime.now();

        if (currentTime.isAfter(LocalTime.of(6,- 0)) && currentTime.isBefore(LocalTime.of(12, 0))) {
            return MomentDeLaJournee.Matin;
        } else if (currentTime.isAfter(LocalTime.of(12, 0)) && currentTime.isBefore(LocalTime.of(18, 0))) {
            return MomentDeLaJournee.ApresMidi;
        } else {
            return MomentDeLaJournee.Soir;
        }
    }

    private static String getTimeOfDay() {
        LocalTime currentTime = LocalTime.now();

        if (currentTime.isAfter(LocalTime.of(6, 0)) && currentTime.isBefore(LocalTime.of(12, 0))) {
            return "morning";
        } else if (currentTime.isAfter(LocalTime.of(12,0)) && currentTime.isBefore(LocalTime.of(18, 0))) {
            return "afternoon";
        } else {
            return "evening";
        }

    }
}