package fr.epsi.b32324c1;

public class MomentDeLaJournee {
    public static MomentDeLaJournee Matin = new MomentDeLaJournee("Matin");

    private final String representation;

    private MomentDeLaJournee(String label){
        this.representation = label;
    }

    @Override
    public String toString() {
        return this.representation;
    }
}
