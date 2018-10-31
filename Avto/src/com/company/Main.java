package com.company;

public class Main {

    public static void main(String[] args) {

        Avto blackBummer = new Avto("BMW",2002, "Black", 180);

        Avto whiteAudio = new Avto("Audio",2018, "White", 200);

        Avto redPorsche = new Avto("Porsche",2018, "Red", 250);

        System.out.println(blackBummer.getAvto() + " " + blackBummer.getYear() +  " " + blackBummer.getColor() + " " + blackBummer.getSpeed());
        blackBummer.right(); blackBummer.back();

        System.out.println(whiteAudio.getAvto() + " " + whiteAudio.getYear() +  " " + whiteAudio.getColor() + " " + whiteAudio.getSpeed());
        whiteAudio.left();

        System.out.println(redPorsche.getAvto() + " " + redPorsche.getYear() +  " " + redPorsche.getColor() + " " + redPorsche.getSpeed());
        redPorsche.forward(); redPorsche.beep();

    }
}
