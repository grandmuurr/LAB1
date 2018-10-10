package com.company;

public class Cat extends Animals implements Actions{
    String Color;
    String Name;
    String Breed; // порода

    public Cat(int numOfLegs, boolean hasWool, String color, String name, String breed ) {
        super(numOfLegs, hasWool);
        Color = color;
        Name = name;
        Breed = breed;
    }

    public void eat( String food ) {
        System.out.println( Name + " eats " + food );
    }

    public void sleep() {
        System.out.println( "Hrrr" );
    }

    public void say(String sound) {
        System.out.println( Name + " says " + sound );
    }

    public void getLegs() {
        System.out.println( Name + " has " + NumOfLegs + " leg(s)" );
    }
}

