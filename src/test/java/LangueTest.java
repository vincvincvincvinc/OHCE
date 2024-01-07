import fr.epsi.b32324c1.LangueAnglaise;
import fr.epsi.b32324c1.LangueInterface;
import fr.epsi.b32324c1.LangueLituanienne;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class LangueTest {

    @Test
    public void saluer_ShouldReturnCorrectGreeting() {

        // Arrange
        LangueInterface langueAnglaise = new LangueAnglaise("morning");
        LangueInterface langueLituanienne = new LangueLituanienne("morning");

        // Act
        String greetingEn = langueAnglaise.Saluer();
        String greetingLt = langueLituanienne.Saluer();

        // Assert
        assertEquals("Good morning", greetingEn);
        assertEquals("Labas rytas", greetingLt);
    }


    @Test
    public void direAuRevoir_ShouldReturnCorrectFarewellMessage() {

        // Arrange
        LangueInterface langueAnglaise = new LangueAnglaise("morning");
        LangueInterface langueLituanienne = new LangueLituanienne("morning");

        // Act

        String farewellEn = langueAnglaise.DireAuRevoir();
        String farewellLt = langueLituanienne.DireAuRevoir();

        //Assert
        assertEquals("Goodbye, have a great morning", farewellEn);
        assertEquals("Iki!", farewellLt);
    }

}
