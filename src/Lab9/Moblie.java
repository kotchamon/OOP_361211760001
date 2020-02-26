package Lab9;

public class Moblie {
    private int moblieID;
    private String brand ;
    private String model;
    private double price;
    private String system;

    @Override
    public String toString() {
        return "Moblie{" +
                "moblieID=" + moblieID +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", system='" + system + '\'' +
                '}';
    }

    //getter and setter
    public int getMoblieID() {
        return moblieID;
    }

    public void setMoblieID(int moblieID) {
        this.moblieID = moblieID;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    //constructor
    public Moblie(int moblieID, String brand, String model, double price, String system) {
        this.moblieID = moblieID;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.system = system;
    }



}//class
