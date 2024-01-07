package fr.epsi.b32324c1;

public class VerificationPalindrome {
    private final LangueInterface langue;
    private final MomentDeLaJournee moment;

    public VerificationPalindrome(LangueInterface langue, MomentDeLaJournee moment) {
        this.langue = langue;
        this.moment = moment;
    }

    public String verifier(String chaîne) {
        String miroir = new StringBuilder(chaîne)
                .reverse()
                .toString();

        StringBuilder resultBuilder = new StringBuilder();
        resultBuilder.append(System.lineSeparator());
        resultBuilder.append(miroir);
        resultBuilder.append(System.lineSeparator());

        if (miroir.equals(chaîne)) {
            resultBuilder.append(this.langue.Féliciter());
            resultBuilder.append(System.lineSeparator());
        }

        return resultBuilder.toString();
    }

    public String direAuRevoir() {
        return this.langue.DireAuRevoir();
    }
}


