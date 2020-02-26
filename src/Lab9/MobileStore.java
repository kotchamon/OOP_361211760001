package Lab9;

import Lab9.Moblie;

import java.sql.*;
import java.util.ArrayList;

public class MobileStore {

    public static void main(String[] args) {
        //step1: load driver
        try {
            Class.forName("org.sqlite.JDBC");
            System.out.println("Load driver successfully.");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //step2: Create Connection
        ArrayList<Moblie> mymb = new ArrayList<Moblie>();
        String SQCONN = "jdbc:sqlite:mobile.sqlite";

            try {
                Connection conn = DriverManager.getConnection(SQCONN);
                if (conn == null) {
                    System.out.println("Could not connect to database.");
                }else {
                    System.out.println("Connected to database.");
                }
         //step3 :Create Statement
                Statement stmt = conn.createStatement();
                String sql = "select * from Mobilestore";
                ResultSet rs = stmt.executeQuery(sql);
                // step4display data from database
                while (rs.next()) {
                    Moblie mb = new Moblie(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDouble(4),rs.getString(5));
                    mymb.add(mb);
                }
                //step5 : Close Connection
                rs.close();
                stmt.close();
                conn.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }
            //Display data object
            System.out.println("Data as object");
            for (Moblie e:mymb) {
                System.out.println(e.toString());
            }



        }//main
}//class
