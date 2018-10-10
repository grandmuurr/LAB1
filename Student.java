package com.company;

public class Student extends Animals implements Actions {

    String Name ;
    String University;
    int Group;

    public Student( int numOfLegs , boolean hasWool , String name , String university , int group ){
        super( numOfLegs , hasWool );
        University = university;
        Group = group;
        Name = name;
    }

    public void sleep() {
        System.out.println("Zzz");
    }

    public void eat(String food) {
        System.out.println( Name + " eats " + food);
    }

    public void say(String sound) {
        System.out.println( sound + " I'm student of " + University + ", " + Group + " group" );
    }

    public void getHasWool() {
        System.out.println( "Student has a wool:" + HasWool );
    }
}

