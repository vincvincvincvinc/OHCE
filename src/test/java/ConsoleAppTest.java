import fr.epsi.b32324c1.ConsoleApp;
import fr.epsi.b32324c1.MomentDeLaJournee;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;
import java.time.LocalTime;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ConsoleAppTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void start_ShouldPrintProgramStartedMessage() {
        // Arrange

        // Act

        ConsoleApp.start();

        // Assert

        assertEquals("Program started...", outContent.toString().trim());
    }


    @Test
    public void choisirTimeOfDay_ShouldReturnCorrectMoment() {

        // Act

        MomentDeLaJournee moment = ConsoleApp.choisirTimeOfDay();

        // Assert

        assertNotNull(moment);
        assertTrue(moment instanceof MomentDeLaJournee);
    }
}
