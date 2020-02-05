package Lab7;

public class Notebook {

    private String bran;
    private String model;
    private String cpu;
    private String gpu;
    private String ram;
    private String display;
    private String hdd;
    private String os;
    private double price;

    //constructor กด alt + insert

    public Notebook(String bran, String model, String cpu, String gpu, String ram, String display, String hdd, String os, double price) {
        this.bran = bran;
        this.model = model;
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
        this.display = display;
        this.hdd = hdd;
        this.os = os;
        this.price = price;
    }

    //getter and setter กด alt + insert

    public String getBran() {
        return bran;
    }

    public void setBran(String bran) {
        this.bran = bran;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getHdd() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //toString() -> display data in object  กด alt + insert


    @Override
    public String toString() {
        return "Notebook{" +
                "brang='" + bran + '\'' +
                ", model='" + model + '\'' +
                ", cpu='" + cpu + '\'' +
                ", gpu='" + gpu + '\'' +
                ", ram='" + ram + '\'' +
                ", display='" + display + '\'' +
                ", hdd='" + hdd + '\'' +
                ", os='" + os + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
