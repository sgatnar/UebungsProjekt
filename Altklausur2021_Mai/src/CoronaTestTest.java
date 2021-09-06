import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoronaTestTest {

    CoronaTest coronatest;

    @Test
    void test1() {

        assertThrows(CustomException.class, () -> {
            coronatest.setVorname("AB");
        });

        assertThrows(CustomException.class, () -> {
            coronatest.setNachname("CD");
        });
    }

    @Test
    void test2(){
        assertThrows(CustomException.class, () -> {
            new CoronaTest("AS", "Nachname", Testergebnis.NEGATIV);
        });

        assertThrows(CustomException.class, () -> {
            new CoronaTest("Vorname", "AS", Testergebnis.POSITIV);
        });
    }
}