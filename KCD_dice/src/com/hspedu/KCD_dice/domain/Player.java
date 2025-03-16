package com.hspedu.KCD_dice.domain;

//玩家类
public class Player {
    private String name;
    private int totalScore;//累计得分

    public Player(String name) {
        this.name = name;
        this.totalScore = 0;
    }

    //增加得分方法
    public void addScore(int points) {
        totalScore += points;
    }

    public String getName() {
        return name;
    }

    public int getTotalScore() {
        return totalScore;
    }
}
