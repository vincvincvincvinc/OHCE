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

        assertTrue(result.contains("level"));
        assertTrue(result.contains("Well Said!"));

    }

    @Test
    public void direAuRevoir_ShouldReturnCorrectFarewellMessage() {

        // Arrange
        LangueInterface mockLangue = new LangueMock();
        VerificationPalindrome verifier = new VerificationPalindrome(mockLangue, MomentDeLaJournee.Matin);

        // Act

        String farewell = verifier.direAuRevoir();

        // Assert
        assertEquals("Mock Farewell", farewell);
    }

}
