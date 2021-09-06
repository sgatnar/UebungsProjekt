package Model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StudentTest {

    Student student;

    @BeforeEach
    void setUp() throws CustomException {

        student = new Student("Herr", "SVEN", "123123");
    }

    @Test
    void setMatriculationNumberTest1() {

        assertThrows(CustomException.class, () -> {
            student.setMatriculationNumber("1231233");
        });

        assertThrows(CustomException.class, () -> {
            student.setMatriculationNumber("12233");
        });
    }

    @Test
    void setMatriculationNumberTest2(){
        assertThrows(NumberFormatException.class, () -> {
            student.setMatriculationNumber("Hallo1");
        });
    }

    @Test
    void setMatriculationNumberTestPositive(){
        assertEquals(123123, student.getMatriculationNumber());
    }
}
