package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        cell3.setOwner("jalen");
        cell3.setPhoneNumber("389-482-9075");
        cell3.setCarrier("At&t");
        cell3.setModel("Iphone");
        cell3.setSerialNumber(38975938);
    display(cell3);
        Cellphone cell1 = cellphone();
        Cellphone cell2 = cellphone();
        display(cell1);
        display(cell2);

        cell1.dial(cell2);
        cell2.dial(cell1);
        cell2.dial(cell3.getPhoneNumber());

    }



    public static Cellphone cellphone(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the serial number? ");
        Cellphone information = new Cellphone();
        information.setSerialNumber(scanner.nextInt());


        System.out.print("What model is the phone? ");
        information.setModel(scanner.next());


        System.out.print("Who is the carrier? ");
        information.setCarrier(scanner.next());


        System.out.print("What is the phone number? ");
        information.setPhoneNumber(scanner.next());


        System.out.print("Who is the owner of the phone? ");
        information.setOwner(scanner.next());

return information;




    }


    public static void display(Cellphone phone){


        System.out.println("SerialNumber = " + phone.getSerialNumber());
        System.out.println("Model = " + phone.getModel());
        System.out.println("Carrier = " + phone.getCarrier());
        System.out.println("PhoneNumber = " + phone.getPhoneNumber());
        System.out.println("Owner = " + phone.getOwner());
    }

    static Cellphone cell3 = new Cellphone(384983, "test", "test", "phonenumber", "owner");

}
