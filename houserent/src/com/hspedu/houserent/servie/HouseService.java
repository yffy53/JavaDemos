package com.hspedu.houserent.servie;

import com.hspedu.houserent.domain.House;

/**
 * 定义House[]，保存House对象
 * 1.响应HouseView的调用
 * 2.完成对房屋信息的各种操作（增删改查c[create]r[read]u[update]d[delete]）
 */

public class HouseService {

    private House[] houses;  //保存House对象
    private int houseNums = 1; //记录当前有多个房屋信息
    private int idCounter = 0; //记录当前的id增长到哪个值
    //构造器
    public HouseService(int size) {
        houses = new House[size];  //当创建HouseService对象，指定数组大小
        houses[0] = new House(1, "jack", "708", "吉阳区", 2000, "未出租");
    }

    //add方法，添加新对象，返回boolean
    public boolean add(House newHouse) {
        //判断是否还可以继续添加（暂不考虑数组扩容）
        if (houseNums == houses.length) {//不能再添加
            System.out.println("数组已满，不能再添加...");
            return false;
        }
        //把newHouse对象加入houses，新增加了一个房屋
        houses[houseNums++] = newHouse;
        //id自增长，然后更新newHouse的id
        newHouse.setId(++idCounter);
        return true;
    }

    public House[] list() {
        return houses;
    }
}
