package fr.epsi.b32324c1;

public class LangueLituanienne implements LangueInterface {
    private final String period;

    public LangueLituanienne(String period) {
        this.period = period;
    }

    @Override
    public String Féliciter() {
        return Expressions.WellSaid;
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
                return "Viso gero, rytoj susitiksim";
            case "afternoon":
                return "Viso gero, gero popietės";
            case "evening":
                return "Viso gero, gero vakaro";
            case "night":
                return "Viso gero, gero nakties";
            default:
                return Expressions.Goodbye;
        }
    }

    @Override
    public String toString() {
        return "Langue Lituanienne";
    }
}
