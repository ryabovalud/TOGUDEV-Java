package com.company;

import java.util.logging.Logger;

public class Avto18Plus extends Avto {

    private String name;
    private int age;
    private static Logger log = Logger.getLogger(Avto18Plus.class.getName());
    public Avto18Plus(String model, int year, String color, int speed,String name,int age) {

        super(model, year, color, speed);
        this.name = name;
        this.age = age;
        log.info("Конструктор Avto18Plus");

    }

    @Override
    public void forward() {
        if(age<18)
            System.out.println("Вам нет 18ти лет");
        else
          System.out.println("Forward");
    }

    @Override
    public void back() {
        if(age<18)
            System.out.println("Вам нет 18ти лет");
        else
            System.out.println("Back");
    }
}
