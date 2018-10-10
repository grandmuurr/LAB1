package com.company;

public abstract class Animals{

    int NumOfLegs; //количество ног
    boolean HasWool; // имеет шерсть

    public Animals( int numOfLegs , boolean hasWool ){
        NumOfLegs = numOfLegs;
        HasWool = hasWool;
    }

    public void getLegs(){
        System.out.println("Legs: " + NumOfLegs );
    }

    public void getHasWool() {
        System.out.println("It has a wool:" + HasWool);
    }
}

