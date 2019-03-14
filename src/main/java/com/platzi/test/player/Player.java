package com.platzi.test.player;

public class Player {

    private Dice dice;
    private int minWinNumber;

    public Player(Dice dice, int minWinNumber) {
        this.dice = dice;
        this.minWinNumber = minWinNumber;
    }

    public boolean play(){

        int diceNumber = dice.roll();
        return diceNumber > minWinNumber;
    }
}
