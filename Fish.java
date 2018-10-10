package com.company;

public class Fish extends Animals implements FishActions{
    String Types;
    String Shape;
    String Habitat;


    public Fish ( String types, String shape, String habitat){
        super(0 , false );
        Types = types;
        Shape = shape;
        Habitat = habitat;
    }
    public void eat (String feed){
        System.out.println("Fish eats " + feed);
    }
    public void swim (){
        System.out.println("Fish swims");
    }
}

