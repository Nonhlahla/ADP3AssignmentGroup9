package za.ac.cput.za.ac.cput.adpassignmentgroup;

/**
 * This is a simple car Manufacturer program
 *
 * @ author Nonhlahla Hlungwani 218160658
 * 31 March 2021
 */
public class Cars {
    //Atributes
    private String make;
    private int yearModel;
    private double price;
    //Getters
    public String getMake()
    {
        return make;
    }
    public int getYearModel()
    {
        return yearModel;
    }
    public double getPrice()
    {
        return price;
    }

    //Setters
    public void set(String m, int yM, double p)
    {
        make = m;
        yearModel = yM;
        price = p;

    }
    public void setMake(String m)
    {
        make = m;
    }
    public void setYearModel(int yM)
    {
        yearModel = yM;
    }
    public void setPrice(double p)
    {
        price = p;
    }
    //show
    public void show()

    {
        System.out.println("Make: " + make);
        System.out.println("Year Model: " + yearModel);
        System.out.printf("Price: R%.2f\n", price );
    }





}
