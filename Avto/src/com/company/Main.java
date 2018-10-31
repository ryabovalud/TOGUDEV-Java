package com.company;

public class Main {

    public static void main(String[] args) {

        Avto blackBummer = new Avto("BMW",2002, "Black", 180);

        Avto whiteAudio = new Avto("Audio",2018, "White", 200);

        Avto redPorsche = new Avto("Porsche",2018, "Red", 250);

        blackBummer.info();
        blackBummer.right(); blackBummer.back();

        whiteAudio.info();
        whiteAudio.left();

        redPorsche.info();
        redPorsche.forward(); redPorsche.beep();

    }
}
