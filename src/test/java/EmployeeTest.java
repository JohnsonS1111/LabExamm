import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    Employee myEmployee;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        myEmployee = new Employee();
    }


    @Test
    void testName(){
        myEmployee.setName("Johnson");
        assertEquals("Johnson", myEmployee.getName());
    }

    @Test
    void testNameFail(){
        myEmployee.setName("Bob");
    }

    @Test
    void testPPS(){
        myEmployee.setPPS("12345G");
        assertEquals("12345G", myEmployee.getPps());
    }

    @Test
    void testPPSFail(){

    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }
}