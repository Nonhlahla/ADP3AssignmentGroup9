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


    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYearModel() {
        return yearModel;
    }

    public void setYearModel(int yearModel) {
        this.yearModel = yearModel;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public java.lang.String toString() {
        return "Cars{" +
                "make='" + make + '\'' +
                ", yearModel=" + yearModel +
                ", price=" + price +
                '}';
    }
}
