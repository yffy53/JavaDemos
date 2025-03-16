package com.hspedu.KCD_dice.view;

import com.hspedu.KCD_dice.domain.Dice;
import com.hspedu.KCD_dice.domain.Player;
import com.hspedu.KCD_dice.domain.PlayerAi;
import com.hspedu.KCD_dice.service.DiceService;
import com.hspedu.KCD_dice.utils.Utility;

public class DiceView {
    private boolean loop = true;
    private char key;
    private DiceService diceService;
    Dice dice = new Dice(6);
    Player p1;
    PlayerAi p2;
    int target;

    //抽签
    public void drawLotsView() {
        diceService = new DiceService(p1, p2, dice, target);
        if (diceService.drawLotsService()){
            System.out.println(p1.getName() + "先手");
        }
        System.out.println(p2.getName() + "先手");
    }

    //询问开始
    public boolean inquiryBeginsView() {
        System.out.println("1. 开始\t\t2. 退出");
        System.out.print("请选择: ");
        key = Utility.readChar('1');
        if (key == '2') {
            char c = Utility.readConfirmSelection();
            return c != 'Y';
        }
        return true;
    }

    //添加信息
    public void userView() {
        System.out.print("请输入玩家name: ");
        String playerName = Utility.readString(8);
        do{
            System.out.println("请选择目标分数(2000,4000,8000): ");
            target = Utility.readInt();
        }while(target != 2000 && target != 4000 && target != 8000);
        p1 = new Player(playerName);
        p2 = new PlayerAi("AI");
    }

    //规则界面
    public void rulesView() {
        System.out.println("========KCD_dice========");
        System.out.println("以下为所有骰子组合及其点数值: ");
        System.out.println("\t<1>: 100\t\t\t<5>: 50");
        System.out.println("\t<1,2,3,4,5>: 500\t<2,3,4,5,6>: 750\t<1,2,3,4,5,6>: 1500");
        System.out.println("\t<1,1,1>: 1000\t\t<2,2,2>: 200\t\t<3,3,3>: 300");
        System.out.println("\t<4,4,4>: 400\t\t<5,5,5>: 500\t\t<6,6,6>: 600");
        System.out.println("三个骰子后每增加一个骰子，点数翻倍: ");
        System.out.println("\t<2,2,2,2>: 400\t\t<2,2,2,2,2>: 800");
        System.out.println("\t<2,2,2,2,2,2>: 1600");
    }

    //主界面
    public void mainMenu() {
        //展示规则
        rulesView();

        //询问开始
        if(!inquiryBeginsView()){
            return;
        }

        //添加玩家信息
        userView();

        //抽签先后手
        drawLotsView();

        //开始游戏
        System.out.println("=======游戏开始=======");
        do {
            //显示骰子
            //询问加分
            //打印本轮得分
            //询问是否继续
            //交换玩家
            System.out.print("输入0退出: ");
            key = Utility.readChar();
            if (key == '0') {
                loop = false;
            }
        } while (loop);
    }
}
