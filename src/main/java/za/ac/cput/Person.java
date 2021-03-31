package za.ac.cput;

/*
    Author: Jason Jaftha
    Student No: 217009301
    Description: Person Class with main class and methods
*/

public class Person {

    //Attributes
    private String firstName;
    private String lastName;
    private int age;

    //Default constructor
    public Person()
    {
        this.firstName = " ";
        this.lastName = " ";
        this.age = 0;
    }

    //Method to add numbers
    public int add(int num1, int num2)
    {
        return num1 + num2;
    }

    //Method to multiply numbers
    public int multiply(int num1, int num2)
    {
        return num1 * num2;
    }

    //Method for division | incomplete
    public int divide(int num1, int num2)
    {
        return 0;
    }

    public static void main(String[] args) {

        System.out.println("Hello");

    }

}
