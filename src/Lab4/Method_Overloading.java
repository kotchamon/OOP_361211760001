package Lab4;

import java.util.Scanner;

public class Method_Overloading {

    //Method Overloading คือ เมธอดที่มีชื่อเหมือนกัน แต่มีการรับพารามิเตอร์และการคืนค่ากลับแตกต่างกัน

    public static void main(String[] args) {

       System.out.println(sum(10,10));
       System.out.println(sum(10.5,20.5));
       System.out.println(sum(10,50.50));
    }//main

    public static int sum(int x,int y){
        return x + y ;
    }

    public static double sum(double x,double y){
        return x + y ;
    }
}//class
