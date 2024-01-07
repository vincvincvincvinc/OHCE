package fr.epsi.b32324c1;

public class MomentDeLaJournee {
    public static MomentDeLaJournee Matin = new MomentDeLaJournee("Matin");
    public static MomentDeLaJournee ApresMidi = new MomentDeLaJournee("Apres-Midi");
    public static MomentDeLaJournee Soir = new MomentDeLaJournee("Soir");

    private final String representation;

    private MomentDeLaJournee(String label){
        this.representation = label;
    }

    @Override
    public String toString() {
        return this.representation;
    }
}
