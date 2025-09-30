package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the serial number? ");
        Cellphone serial_number = new Cellphone();
        serial_number.setSerialNumber(scanner.nextLine());


        System.out.print("What model is the phone?");
        Cellphone model = new Cellphone();
        model.setModel(scanner.nextLine());


        System.out.print("Who is the carrier?");
        Cellphone carrier = new Cellphone();
        carrier.setCarrier(scanner.nextLine());


        System.out.print("What is the phone number");
        Cellphone phoneNumber = new Cellphone();
        phoneNumber.setPhoneNumber(scanner.nextLine());


        System.out.print("Who is the owner of the phone? ");
        Cellphone owner = new Cellphone();
        owner.setOwner(scanner.nextLine());



        System.out.println(serial_number.getSerialNumber());
        System.out.println(model.getModel());
        System.out.println(carrier.getCarrier());
        System.out.println(String.join(phoneNumber.getPhoneNumber(),"-"));
        System.out.println(owner.getOwner());
    }
}
