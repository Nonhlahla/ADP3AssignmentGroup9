package za.ac.cput;


import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.assertTimeout;




import static org.junit.jupiter.api.Assertions.*;

class DetailsTest {

    private Details student1;
    private Details student2;
    private Details student3;
    private Details student4;

    @BeforeEach
    void setUp() {
        student1 = new Details();
        student2 = new Details();
        student3 = student1;
    }

   // this code checks if the students are equal with the assertEquals method.
    @Test
    void testEquality() {
        student4 = student2;
        assertEquals(student4, student2);
        System.out.println("They are equal.");
    }

    /**
     * This code is not for assignment, but i wanted to test it out.
     *
     * It checks if the two students that i did not make equal that it is not equal
     */

    @Test
    void testNotEquality()
    {
        assertNotEquals(student1,student4);
        System.out.printf("They are not Equal. %nTry other students.");

    }


    @Test
    void testIdentity() {

        if (student1 == student2)
         {
        System.out.println("Student 1 and Student 2 DO NOT have the same identity.");
         }
        else if (student1 == student3)
            {
                assertSame(student1, student3);
            System.out.println("Student 1 and Student 3 DO have the same identity.");
            }
        else
            {
                System.out.println("Can not find the student's identity");
            }
    }

    @Test
    void testFail() {
        assertEquals(student1, student3);
        fail("This test will fail!!!");
    }


    @Test
    void timeout()
    {
        assertTimeout(ofMillis(20), () ->
        {

        });
        System.out.println("Your time been checked in 20 milli seconds.");
    }

    @Ignore
    @Test
    void temporarilyDisabledTest( )
    {
       String student1 = "John";
        System.out.println(student1);
    }

}




