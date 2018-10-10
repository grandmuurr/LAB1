package com.company;

public class Main {

    public static void main(String[] args) {

        Cat barsik = new Cat( 4 , true , "Grey" , "Barsik" , "British Shorthair");
        barsik.eat("croissant");
        barsik.sleep();
        barsik.say("MEOW!");
        barsik.getLegs();
        barsik.getHasWool();

        System.out.println();

        Student stud = new Student( 2 , false , "Maxim" , "ONAFT" , 341 ) ;
        stud.eat("sandwich");
        stud.sleep();
        stud.say("Hello!");
        stud.getLegs();
        stud.getHasWool();

        System.out.println();

        Fish fish = new Fish ("mackerel", "elongated" , "Black sea");
        fish.eat("worm");
        fish.swim();
        fish.getLegs();
        fish.getHasWool();
    }
}

