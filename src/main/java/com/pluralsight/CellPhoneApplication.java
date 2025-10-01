package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the serial number? ");
        Cellphone serial_number = new Cellphone();
        serial_number.setSerialNumber(scanner.nextInt());


        System.out.print("What model is the phone? ");
        Cellphone model = new Cellphone();
        model.setModel(scanner.next());


        System.out.print("Who is the carrier? ");
        Cellphone carrier = new Cellphone();
        carrier.setCarrier(scanner.next());


        System.out.print("What is the phone number? ");
        Cellphone phoneNumber = new Cellphone();
        phoneNumber.setPhoneNumber(scanner.next());


        System.out.print("Who is the owner of the phone? ");
        Cellphone owner = new Cellphone();
        owner.setOwner(scanner.next());



        System.out.println("SerialNumber = " + serial_number.getSerialNumber());
        System.out.println("Model = " + model.getModel());
        System.out.println("Carrier = " + carrier.getCarrier());
        System.out.println("PhoneNumber = " + phoneNumber.getPhoneNumber());
        System.out.println("Owner = " + owner.getOwner());
    }
}
