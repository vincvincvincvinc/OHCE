package fr.epsi.b32324c1;

public class LangueLituanienne implements LangueInterface {
    private final String period;

    public LangueLituanienne(String period) {
        this.period = period;
    }

    @Override
    public String Féliciter() {
        return Expressions.Sveikinu;
    }

    @Override
    public String Saluer() {
        switch (period) {
            case "morning":
                return Expressions.LabasRytasLt;
            case "afternoon":
                return Expressions.LabaDienaLt;
            case "evening":
                return Expressions.LabasVakarasLt;
            case "night":
                return Expressions.LabanaktLt;
            default:
                return Expressions.Hello;
        }
    }

    @Override
    public String DireAuRevoir() {
        switch (period) {
            case "morning":
                return "Iki!";
            case "afternoon":
                return "Geros dienos";
            case "evening":
                return "Gero vakaro";
            case "night":
                return "Labos nakties";
            default:
                return Expressions.Goodbye;
        }
    }

    @Override
    public String toString() {
        return "Langue Lituanienne";
    }
}
