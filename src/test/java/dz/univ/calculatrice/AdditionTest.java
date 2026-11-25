package dz.univ.calculatrice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AdditionTest {

    @Test
    void testAddition() {
        Addition addition = new Addition();

        double resultat = addition.calculer(10, 5);

        assertEquals(15, resultat);
    }

    @Test
    void testAdditionAvecZero() {
        Addition addition = new Addition();

        double resultat = addition.calculer(10, 0);

        assertEquals(10, resultat);
    }
}