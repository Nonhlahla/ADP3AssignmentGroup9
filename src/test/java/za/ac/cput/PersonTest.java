package za.ac.cput;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

/*
    Author: Jason Jaftha
    Student No: 217009301
    Description: Test Class to test methods in the Person class
*/

class PersonTest {


    //Attributes
        private Person p1, p2, p3;

    @BeforeEach
    void setUp()
    {
        //Set up our objects to be tested
            p1 = new Person();
            p2 = new Person();
            p3 = p1;
    }

    @AfterEach
    void tearDown() {
    }

    //Testing...
    @Test
    public void testIdentity() //Test for identity
    {
        assertSame(p1, p3);
    }

    @Test
    public void testIdentity2()
    {
        assertNotSame(p1, p2);
    }

    @Test
    public void testEquality() //Test for equality
    {
        assertEquals(p1, p3);
    }

    @Test
    public void testAdd() //Failing a test
    {
        int result = p1.add(5, 5); //Run the method and get the result
        assertEquals(0, result);  //Make the expected value 0 to deliberately fail the test to eliminate a false pass
    }

    @Timeout(1) //Timeout test | 1 second timeout
    @Test
    public void testMultiply() throws InterruptedException
    {
        int result = p1.multiply(10, 10);
        assertEquals(100, result);
        TimeUnit.SECONDS.sleep(3); //Delay test case for 3 seconds
    }

    @Disabled("Method not yet implemented!")
    @Test
    public void testDivision() //Ignore or disable test
    {
        int result = p1.divide(10, 2);
        assertEquals(5, result);
    }

}