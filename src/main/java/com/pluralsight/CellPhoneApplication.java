package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {

        Cellphone cell1 = cellphone();
        Cellphone cell2 = cellphone();
    display(cell1);
    display(cell2);

       cell1.dial(cell2);
       cell2.dial(cell1);

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

}
