package com.hspedu.KCD_dice.domain;

import java.util.Random;

//骰子类
public class Dice {
    private int faces;

    public Dice(int faces) {
        this.faces = faces;
    }
    public int[] roll( int diceNum ) {
        int[] rolls = new int[diceNum];
        for (int i = 0; i < 6; i++) {
            rolls[i] = new Random().nextInt(faces) + 1;
        }
        return rolls;
    }
}
