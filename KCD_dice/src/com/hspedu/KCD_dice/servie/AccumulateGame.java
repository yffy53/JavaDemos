package com.hspedu.KCD_dice.servie;

import com.hspedu.KCD_dice.domain.Dice;
import com.hspedu.KCD_dice.domain.Player;

//游戏控制类
public class AccumulateGame {
    private Player[] players;
    private Dice dice;
    private int targetScore;//目标分数
    private int currentPlayerIndex;//当前玩家

    public AccumulateGame(Player p1, Player p2, Dice d, int target) {
        players = new Player[]{p1, p2};
        dice = d;
        targetScore = target;
        currentPlayerIndex = 0;
    }

    public void start() {
        while (true){
            Player currentPlayer = players[currentPlayerIndex];

            //玩家掷骰子
            int rollResult = dice.roll();

        }
    }
}
