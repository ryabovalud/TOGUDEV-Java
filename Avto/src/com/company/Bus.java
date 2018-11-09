package com.company;

import java.util.logging.Logger;

public class Bus extends Avto18Plus {

    private int busRout;
    private static Logger log = Logger.getLogger(Avto18Plus.class.getName());

    public Bus(String model, int year, String color, int speed, String name, int age,int busRout) {
        super(model, year, color, speed, name, age);
        this.busRout = busRout;
        log.info("Конструктор Bus");
    }

    @Override
    public void info() {
        System.out.println(getAvto() + " " + getYear() +  " " + getColor() + " " + getSpeed()
                +" "+getBusRout());

    }

    private int getBusRout() {
        return this.busRout;
    }
}
