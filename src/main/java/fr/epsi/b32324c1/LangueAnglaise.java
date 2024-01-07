package fr.epsi.b32324c1;

public class LangueAnglaise implements LangueInterface {
    private final String period;

    public LangueAnglaise(String period) {
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
                return Expressions.GoodMorningEn;
            case "afternoon":
                return Expressions.HelloAfternoonEn;
            case "evening":
                return Expressions.GoodEveningEn;
            case "night":
                return Expressions.HelloNightEn;
            default:
                return Expressions.Hello;
        }
    }

    @Override
    public String DireAuRevoir() {
        switch (period) {
            case "morning":
                return "Goodbye, have a great morning";
            case "afternoon":
                return "Goodbye, have a wonderful afternoon";
            case "evening":
                return "Goodbye, have a lovely evening";
            case "night":
                return "Good night";
            default:
                return Expressions.Goodbye;
        }
    }

    @Override
    public String toString() {
        return "Langue Anglaise";
    }
}


