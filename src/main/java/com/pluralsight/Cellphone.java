package com.pluralsight;

public class Cellphone {
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    public Cellphone(){
        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";
    }

    public Cellphone(int serialNumber, String model, String carrier, String phoneNumber, String owner) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.owner = owner;
    }

    public int getSerialNumber(){
        return this.serialNumber;
    }

    public String getModel(){
        return this.model;
    }

    public String getCarrier(){
        return this.carrier;
    }


    public String getPhoneNumber(){
        return this.phoneNumber;
    }


    public String getOwner(){
        return this.owner;
    }

    public void setSerialNumber(int i){
        this.serialNumber = i;
    }

    public void setModel(String i){
        this.model = i;
    }

    public void setCarrier(String i){
        this.carrier = i;
    }


    public void setPhoneNumber(String i){
        this.phoneNumber = i;
    }


    public void setOwner(String i){
        this.owner = i;
    }

    public void dial(Cellphone cellphone){
        System.out.println(getOwner() + "'s phone is calling " + cellphone.getPhoneNumber());
    }

    public void dial(String phoneNumber){
        System.out.println(getOwner() + "'s phone is calling " + phoneNumber);
    }




}
