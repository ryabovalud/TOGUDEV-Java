package com.company;

public class Avto {
    private String AvtoModel;
    private int yearOfIssue;
    private String colorOfAvto;
    private int maxSpeed;

    public Avto(String model,int year,String color,int speed){
        this.AvtoModel = model;
        this.yearOfIssue = year;
        this.colorOfAvto = color;
        this.maxSpeed = speed;
    }

    public String getAvto() {
        return this.AvtoModel;
    }

    public int getYear() {
        return this.yearOfIssue;
    }

    public String getColor() {
        return this.colorOfAvto;
    }

    public int getSpeed() {
        return this.maxSpeed;
    }

    public void setAvto(String model) {
        this.AvtoModel = model;
    }

    public void setYear(int year) {
        this.yearOfIssue = year;
    }

    public void setColor(String color) {
        this.colorOfAvto = color;
    }

    public void setSpeed(int speed) {
        this.maxSpeed = speed;
    }

    public void right() {
        System.out.println("Right");
    }


    public void left() {
        System.out.println("Left");
    }

    public void forward() {
        System.out.println("Forward");
    }

    public void back() {
        System.out.println("Back");
    }

    public void beep() {
        System.out.println("BEEEEEEEEEEEP");
    }
}
