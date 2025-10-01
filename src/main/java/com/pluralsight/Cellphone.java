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
}
