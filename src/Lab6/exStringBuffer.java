package Lab6;

import java.util.StringTokenizer;

public class exStringBuffer {
    public static void main(String[] args) {

        // stringBuffer เป็นคลาส ที่มีเมธอดต่างๆ ที่สามารถปรับปรุงแก้ไขข้อมูลที่เป็น String ได้มากกว่าคลาส String ทั่วไป

        StringBuffer strBuf = new StringBuffer("Hello");
        System.out.println(strBuf);
        //append() ใช้สำหรับต่อ String
        strBuf.append("Saiyai");
        System.out.println(strBuf);
        System.out.println(strBuf.reverse());
        strBuf.delete(0,6);
        System.out.println(strBuf);

        //StringTokenizer นับคำในข้อความ
        String s = "Coronaviruses are a group of viruses that cause diseases in mammals and birds. " +
                "In humans, the virus causes respiratory infections which are typically mild including the common " +
                "cold but rarer forms like SARS and MERS can be lethal. In cows and pigs they may cause diarrhea," +
                " while in chickens it can cause an upper respiratory disease. There are no vaccines or antiviral " +
                "drugs that are approved for prevention or treatment.";

        StringTokenizer tokenizer = new StringTokenizer(s);
        int countWord = tokenizer.countTokens();
        System.out.println("Word count from message: "+countWord);

        // word cutting ตัดคำในข้อความ ใช้ 1 เคาะ
        while (tokenizer.hasMoreTokens()){
            System.out.println(tokenizer.nextToken());
        }



    }//main
}//class
