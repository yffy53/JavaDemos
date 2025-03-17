package com.hspedu.KCD_dice.service;

import com.hspedu.KCD_dice.domain.Dice;
import com.hspedu.KCD_dice.domain.Player;
import com.hspedu.KCD_dice.view.DiceView;

import java.util.Random;

public class DiceService {
    private Player[] players;//保存Player对象
    private Dice dice;
    private int targetScore;
    private int currentPlayerIndex;
    private DiceView diceView = new DiceView();

    public DiceService(Player p1, Player p2, Dice d, int target) {
        players = new Player[]{p1, p2};
        dice = d;
        targetScore = target;
    }

    //验证计分合法
    public boolean rollDice() {

    }

    //计分
    public int scoring(int[] rollResult) {
        int score = 0;
        int[] points = diceView.addScoreView(rollResult);

        return score;
    }

    //抽签先后手
    public boolean drawLotsService() {
        currentPlayerIndex = new Random().nextInt(players.length);
        return currentPlayerIndex == 0;
    }

    public void start() {
        int diceNum = 6;
        int score = 0;
        while (true) {
            Player currentPlayer = players[currentPlayerIndex];

            //掷骰子
            int[] rollResult = dice.roll(diceNum);
            diceView.showDice(rollResult);

            //计分

        }
    }
}
