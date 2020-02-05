package Lab7;

import java.util.ArrayList;
import java.util.List;

public class DogApp {

    public static void main(String[] args) {
        //create object สร้างวัตถุ
        //1.ใช้ default constructor
        Dog dog1 = new Dog();

        dog1.setName("Dang");
        dog1.setAge(3);
        dog1.setHairColor("Brown");

        System.out.println(dog1.getName());
        System.out.println(dog1.getAqe());
        System.out.println(dog1.getHairColor());



        //2.ใช้ constructor ที่มีการรับพารามิเตอร์ เป็นการสร้างวัตถุ
        Dog dog2 = new Dog("Dum",10,"Black");
        System.out.println(dog2.getName());
        System.out.println(dog2.getAqe());
        System.out.println(dog2.getHairColor());

        List<Dog> dogList = new ArrayList<Dog>();
        dogList.add(dog1);
        dogList.add(dog2);
        System.out.println(dogList);

        for (Dog d:dogList){
            System.out.println(d.getName());
        }


    }//main
}//class
