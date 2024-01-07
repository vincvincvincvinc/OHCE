import fr.epsi.b32324c1.ConsoleApp;
import fr.epsi.b32324c1.MomentDeLaJournee;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ConsoleAppTest {
    @Test
    public void start_ShoulPrintProgramStartedMessage() {
        // Arrange
        SystemCapture systemCapture = new SystemCapture();
        systemCapture.startCapture();

        // Act

        ConsoleApp.start();

        // Assert

        assertEquals("Program started...", systemCapture.getCapturedOutput().trim());
        systemCapture.stopCapture();
    }

    @Test
    public void choisirTimeOfDay_ShouldReturnCorrectMoment() {

        // Arrange
        // NEEDS DOING : Mock LocalTime

        // Act

        MomentDeLaJournee moment = ConsoleApp.choisirTimeOfDay();

        // Assert

        assertNotNull(moment);
        assertTrue(moment instanceof MomentDeLaJournee);
    }

    // More Tests
}
