import fr.epsi.b32324c1.LangueInterface;
public class LangueMock implements LangueInterface {

    @Override
    public String Féliciter() {
        return "Well Said!";
    }

    @Override
    public String Saluer() {
        return "Mock Greeting";
    }

    @Override
    public String DireAuRevoir() {
        return "Mock Farewell";
    }
}
