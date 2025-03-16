package com.hspedu.KCD_dice.service;

import com.hspedu.KCD_dice.domain.Dice;
import com.hspedu.KCD_dice.domain.Player;

import java.util.Random;

public class DiceService {
    private Player[] players;//保存Player对象
    private Dice dice;
    private int targetScore;
    private int currentPlayerIndex;

    public DiceService(Player p1, Player p2, Dice d, int target) {
        players = new Player[]{p1, p2};
        dice = d;
        targetScore = target;
    }

    //抽签先后手
    public boolean drawLotsService() {
        currentPlayerIndex = new Random().nextInt(players.length);
        return currentPlayerIndex == 0;
    }

    public void start() {
        while (true) {
            Player currentPlayer = players[currentPlayerIndex];
        }
    }
}
