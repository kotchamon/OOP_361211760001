package Lab7;

public class Mobile {

    private String moblieID;
    private String brand ;
    private String deails;
    private int price;
    private String system;

    public Mobile (){}
    public Mobile (String moblieID,String brand,String deails,int price,String system){
        this.moblieID = moblieID;
        this.brand = brand;
        this.deails = deails;
        this.price = price;
        this.system = system;

}
    public String getMoblieID(){
        return this.moblieID;

    }
    public  void setMoblieID(String moblieID){
        this.moblieID = moblieID ;
    }
    public String getBrand(){
        return this.brand;
    }
    public  void setBrand(String brand){
        this.brand = brand;
    }
    public String getDeails(){
        return this.deails;

    }
    public  void setDeails(String deails){
        this.deails = deails;
    }
    public int getprice(){
        return this.price;
    }
    public  void setPrice(int price){
        this.price = price;
    }
    public String getSystem(){
        return this.system;
    }
    public  void setSystem(String system){
        this.system = system;
    }

}
