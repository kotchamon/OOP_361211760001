package Lab7;

public class MobileStore {
    public static void main(String[] args) {

        Mobile mobile1 = new Mobile();

        mobile1.setMoblieID("1001");
        mobile1.setBrand("Wiko");
        mobile1.setDeails("Sunny 4 plus");
        mobile1.setPrice(2090);
        mobile1.setSystem("Android 9 Go");

        System.out.println(mobile1.getMoblieID());
        System.out.println(mobile1.getBrand());
        System.out.println(mobile1.getDeails());
        System.out.println(mobile1.getprice());
        System.out.println(mobile1.getSystem());

        Mobile mobile2 = new Mobile("2002","Apple","ipone 11 Pro",35900,"IOS 13");
        System.out.println(mobile2.getMoblieID());
        System.out.println(mobile2.getBrand());
        System.out.println(mobile2.getDeails());
        System.out.println(mobile2.getprice());
        System.out.println(mobile2.getSystem());

        Mobile mobile3 = new Mobile("3003","Samsung","Galaxy E7",11500,"Android 4.4");
        System.out.println(mobile3.getMoblieID());
        System.out.println(mobile3.getBrand());
        System.out.println(mobile3.getDeails());
        System.out.println(mobile3.getprice());
        System.out.println(mobile3.getSystem());
    }//main
}//class
