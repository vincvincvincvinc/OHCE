package fr.epsi.b32324c1;

public class MomentDeLaJournee {
    public static MomentDeLaJournée Matin = new MomentDeLaJournée("Matin");
    public static MomentDeLaJournée Inconnu = new MomentDeLaJournée("Inconnu");

    private final String representation;

    private MomentDeLaJournée(String label){
        this.representation = label;
    }

    @Override
    public String toString() {
        return this.representation;
    }
}