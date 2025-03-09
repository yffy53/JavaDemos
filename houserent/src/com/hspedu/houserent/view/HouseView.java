package com.hspedu.houserent.view;


import com.hspedu.houserent.utils.Utility;

public class HouseView {

    private boolean loop = true;
    private char key;

    public void listHouse() {
        System.out.println("==============房屋列表==============");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态（未出租/已出租）");
    }

    public void mainMenu() {

        do{
            System.out.println("==============房屋出租系统菜单==============");
            System.out.println("\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t2 查 找 房 屋");
            System.out.println("\t\t\t3 删 除 房 屋");
            System.out.println("\t\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t\t5 房 屋 列 表");
            System.out.println("\t\t\t6 退      出");
            System.out.print("请输入你的选择(1-6): ");
            key = Utility.readChar();
            switch (key) {
                case '1':
                    System.out.println("新增");
                    break;
                case '2':
                    System.out.println("查 找");
                    break;
                case '3':
                    System.out.println("删 除");
                    break;
                case '4':
                    System.out.println("修 改");
                    break;
                case '5':
                    System.out.println("房 屋 列 表");
                    break;
                case '6':
                    System.out.println("退出");
                    loop = false;
                    break;
            }
        }while(loop);
    }
}
