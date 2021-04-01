package za.ac.cput.za.ac.cput.adpassignmentgroup;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CarsTest {

    private Cars car1;
    private Cars car2;
    private Cars car3;


    @BeforeEach
    void setUp() {
        car1 = new Cars("Polo", 2015, 500);
        car2 = new Cars("BMW", 2020, 300);
        car3 = car2;
    }

    @Test
    void testGetYearModel() {
        System.out.println("yearModel");

        assertEquals(car2, car3);
    }

    @Test
    void testIdentity() {
        System.out.println("yearModel");

        assertSame(car3, car2);
    }

    @Test
    void failYearModel() {
        fail("Car 3 is not the same as car 2 so the test will fail");

        assertSame(car3, car2);

    }
    @Test
    @Timeout(2)
    void testTimeout() throws InterruptedException {



    }


    @Test
    @Disabled
    void disableYearModel() {
        car1 = car3;
    }




}