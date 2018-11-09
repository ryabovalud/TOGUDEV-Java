package com.company;

import java.util.logging.Logger;

public class SportCar extends Avto18Plus {
    private String carTeam;
    private static Logger log = Logger.getLogger(Avto18Plus.class.getName());

    public SportCar(String model, int year, String color, int speed, String name, int age, String carTeam) {
        super(model, year, color, speed, name, age);
        this.carTeam = carTeam;
        log.info("Конструктор SportCar");
    }

    public void OverTaking (Avto avto){
        System.out.println("Обгоняем ");
        avto.info();
    }
}
