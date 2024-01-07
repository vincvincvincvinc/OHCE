import fr.epsi.b32324c1.LangueInterface;
import fr.epsi.b32324c1.MomentDeLaJournee;
import fr.epsi.b32324c1.VerificationPalindrome;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class VerificationPalindromeTest {

    @Test
    public void verifier_ShouldReverseInputAndReturnCorrectResult() {

        // Arrange
        LangueInterface mockLangue = new LangueMock();
        VerificationPalindrome verifier = new VerificationPalindrome(mockLangue, MomentDeLaJournee.Matin);

        // Act
        String result = verifier.verifier("level");

        // Assert
        assertEquals(System.lineSeparator() + "level" + System.lineSeparator() + "Well Said!", result);
    }

    @Test
    public void direAuRvoir_ShouldReturnCorrectFarewellMessage() {

        // Arrange
        LangueInterface mockLangue = new LangueMock();

        // Act

        String farewell = verifier.direAuRevoir();

        // Assert
        assertEquals("Goodbye, have a great morning", farewell);
    }

    // More Tests later on
}
