package fr.epsi.b32324c1;

public class Main {
    public static void main(String[] args) {
        ConsoleApp.start();

        LangueInterface english = new LangueAnglaise("morning");
        MomentDeLaJournee morning = MomentDeLaJournee.Matin;

        VerificationPalindrome verifier = new VerificationPalindrome(english, morning);
        System.out.println(verifier.verifier("level"));
    }

}
