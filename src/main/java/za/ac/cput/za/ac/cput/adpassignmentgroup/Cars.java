package za.ac.cput.za.ac.cput.adpassignmentgroup;

/**
 * This is a simple car Manufacturer program
 *
 * @ author Nonhlahla Hlungwani 218160658
 * 31 March 2021
 */
public class Cars {

    private String make;
    private int yearModel;
    private double price;

    public Cars(String make,int yearModel,double price) {
        this.make = make;
        this.yearModel = yearModel;
        this.price = price;
    }


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

    public  double getPrice() {
        return price;
    }

    public void setPrice(double price) {

    }
    public void set(String make,int yearModel,double price)
    {
        this.make = make;
        this.yearModel = yearModel;
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
