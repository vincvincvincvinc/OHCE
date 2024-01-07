import fr.epsi.b32324c1.MomentDeLaJournee;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class MomentDeLaJourneeTest {

    @Test

    public void toSting_ShouldReturnCorrectRepresentation() {

        // Arrange
        MomentDeLaJournee matin = MomentDeLaJournee.Matin;
        MomentDeLaJournee apresMidi = MomentDeLaJournee.ApresMidi;
        MomentDeLaJournee soir = MomentDeLaJournee.Soir;

        // Act
        String representationMatin = matin.toString();
        String representationApresMidi = apresMidi.toString();
        String representationSoir = soir.toString();

        // Assert
        assertEquals("Matin", representationMatin);
        assertEquals("Apres-Midi", representationApresMidi);
        assertEquals("Soir", representationSoir);
    }
}
