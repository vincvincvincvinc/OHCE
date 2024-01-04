package fr.epsi.b32324c1;

public class Main {
    public static void main(String[] args) {
        ConsoleApp.start();

        LangueInterface english = new LangueAnglaise("morning");
        MomentDeLaJournée morning = MomentDeLaJournée.Matin;

        VérificationPalindrome verifier = new VérificationPalindrome(english, morning);
        System.out.println(verifier.Vérifier("level"));
    }

}
