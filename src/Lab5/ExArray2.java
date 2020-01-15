package Lab5;

import java.util.Scanner;

public class ExArray2 {

    //user input data to array



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x[] =new int[5];

        //for
        for (int i = 0; i < x.length;i++) {

            System.out.println("Enter an integer:  ");
            x[i] = sc.nextInt();
        }

        //display data in array
        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
        System.out.println(x[3]);
        System.out.println(x[4]);

        //fori
        System.out.println("Data in Array: ");
        for (int i = 0; i < x.length;i++) {
            System.out.println(x[i]);
        }
        //foreach
        System.out.println("Data in array(foreach): ");
        for (int val:x) { //อวนลูป่านค่าข้อมูลใน array ที่ละตำแหน่งมาเก็บในตัวแปร val
            System.out.println(val);

        }
        showDataArray(x); //show fori
        showData(x); //show foreach
        totalDataArray(x); //รวมผลค่า array

    }//main

    private static void totalDataArray(int[] x) {
        int total = 0;
        for (int val:x){
            total += val;
        }
        System.out.println("The total value in array: "+total);
        System.out.println("The average value is: "+(total/x.length)); //อ่านค่าเฉลี่ย
    }

    private static void showData(int[] x) {
        System.out.println("Data in Array: ");
        for (int i = 0; i < x.length;i++) {
            System.out.println(x[i]);
    }
    }

    private static void showDataArray(int[] x) {
        System.out.println("Data in Array: ");
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);

        }
    }

}//class
