package org.example;

import java.util.Scanner;
import org.example.models.Bill;
import org.example.models.Stock;
import java.sql.*;

public class Main {
    public static final String INSTRUMENT_TABLE = "INSTRUMENT";
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String url = "jdbc:sqlite:sarangi.db";
        System.out.print("Enter Name:");
        String Name= sc.next();
        System.out.print("Enter Address:");
        String Address=sc.next();
        System.out.print("Enter Phone Number: ");
        String pnum=sc.next();
        Bill b1=new Bill(2,0,0);
        String createStatementSql = "CREATE TABLE IF NOT EXISTS " + INSTRUMENT_TABLE + "(" +
                "id INTEGER PRIMARY KEY , " +
                "Name TEXT, " +
                "Address TEXT, " +
                "PhoneNum TEXT, " +
                "FluteQuantity INTEGER, " +
                "GuitarQuantity INTEGER, " +
                "PianoQuantity INTEGER)";

        System.out.println(createStatementSql);

        try {
            Connection connection = DriverManager.getConnection(url);
            System.out.println("Connected");


            Statement statement = connection.createStatement();

            statement.execute(createStatementSql);



            String insertRecordSQL = "INSERT INTO " + INSTRUMENT_TABLE + " (Name, Address, PhoneNum, FluteQuantity, GuitarQuantity, PianoQuantity) " +
                    "VALUES (?, ?, ?, ?, ?, ?)";



            PreparedStatement preparedStatement = connection.prepareStatement(insertRecordSQL);

            preparedStatement.setString(1, Name);
            preparedStatement.setString(2, Address);
            preparedStatement.setString(3,pnum);
            preparedStatement.setInt(4,b1.getFlutequantity());
            preparedStatement.setInt(5, b1.getGuitarquantity());
            preparedStatement.setInt(6, b1.getPianoquantity());
            // Execute the prepared statement
            preparedStatement.execute();
        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        }

        double flutePrice = 300.0;
        double guitarPrice = 1000.0;
        double pianoPrice = 1200.0;

        Stock stock = new Stock();
        stock.addItem("Flute", 20);
        stock.addItem("Guitar", 5);
        stock.addItem("Piano", 7);

        stock.displayStock();

        b1.billgen();
    }


}