package com.hspedu.KCD_dice.domain;

import java.util.Random;

//骰子类
public class Dice {
    private int faces;

    Dice(int faces) {
        this.faces = faces;
    }
    public int roll() {
        return new Random().nextInt(faces) + 1;
    }
}
