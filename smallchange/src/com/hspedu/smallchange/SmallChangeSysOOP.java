package com.hspedu.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSysOOP {

    boolean loop = true;
    Scanner sc = new Scanner(System.in);
    String key;

    String details = "----------------零钱通明细----------------";

    double money;
    double balance = 0;
    Date date;  //表示日期
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");  //可以用于日期格式化

    String note;

    public void mainMenu() {
        do {
            System.out.println("=======零钱通菜单(OOP)=======");
            System.out.println("\t1 零钱通明细");
            System.out.println("\t2 收益入账");
            System.out.println("\t3 消费");
            System.out.println("\t4 退     出");

            System.out.print("请选择(1-4):");
            key = sc.next();

            switch (key) {
                case "1":
                    this.detail();
                    break;
                case "2":
                    this.income();
                    break;
                case "3":
                    this.pay();
                    break;
                case "4":
                    this.exit();
                    break;
                default:
                    System.out.println("选择有误，请重新选择");
            }
        } while (loop);
    }

    public void detail() {
        System.out.println(details);
    }

    public void income() {
        System.out.print("收益入账金额:");
        money = sc.nextDouble();

        if (money <= 0) {
            System.out.println("收益入账金额 需要 大于 0");
            return;
        }

        balance += money;
        date = new Date();  //获取当前日期
        details += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t" + balance;
    }

    public void pay() {
        System.out.print("消费金额:");
        money = sc.nextDouble();

        if (money <= 0 || money > balance) {
            System.out.println("消费金额 需要在 0-" + balance);
            return;
        }

        System.out.print("消费说明:");
        note = sc.next();

        balance -= money;
        date = new Date();
        details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
    }

    public void exit() {
        String choice;
        do {
            System.out.println("你确定要退出吗？y/n");
            choice = sc.next();
        } while (!"y".equals(choice) && !"n".equals(choice));
        if (choice.equals("y")) {
            loop = false;
        }
    }
}
