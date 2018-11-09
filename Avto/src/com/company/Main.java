package com.company;

public class Main {

    public static void main(String[] args) {

        Avto blackBummer = new Avto("BMW",2002, "Black", 180);
        Avto blackBummer2 = new Avto("BMW",2002, "Black", 180);
        //стандартный .equals() не прокатит, так как он равнивает ссылки на обьекты, поэтомы его нужно перезаписать
        if(blackBummer.equals(blackBummer2))
            System.out.println("Они равны!");
        else
            System.out.println("Они не равны!");

        Avto whiteAudio = new Avto18Plus("Audio",2018, "White", 200, "Ivan", 17);

        Avto redPorsche = new SportCar("Porsche",2018, "Red", 250, "Sergey", 22, "Ferari");

        Avto standartBus = new Bus("Korea",2000, "White", 77, "Ivan", 17, 8);

        blackBummer.info();
        blackBummer.right(); blackBummer.back();

        whiteAudio.info();
        whiteAudio.forward();

        redPorsche.info();

        standartBus.info();

    }
}
