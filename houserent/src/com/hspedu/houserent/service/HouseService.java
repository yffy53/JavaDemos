package com.hspedu.houserent.servie;

import com.hspedu.houserent.domain.House;

/**
 * 定义House[]，保存House对象
 * 1.响应HouseView的调用
 * 2.完成对房屋信息的各种操作（增删改查c[create]r[read]u[update]d[delete]）
 */

public class HouseService {

    private House[] houses;  //保存House对象
    private int houseNums = 0; //记录当前有多个房屋信息
    private int idCounter = 0; //记录当前的id增长到哪个值
    //构造器
    public HouseService(int size) {
        houses = new House[size];  //当创建HouseService对象，指定数组大小
        houses[houseNums++] = new House(idCounter, "jack", "708", "吉阳区", 2000, "未出租");
    }

    //findById方法，返回House对象或者null
    public House findById(int findId) {
        //遍历数组
        for (int i = 0; i < houseNums; i++) {
            if (houses[i].getId() == findId) {
                return houses[i];
            }
        }
        return null;
    }

    //del方法，删除一个房屋信息
    public boolean del(int delId) {
        //应当先找到要删除的房屋信息对应的下标
        //下标不是房屋编号
        int index = -1;
        for (int i = 0; i < houseNums; i++) {
            if (houses[i].getId() == delId) {//要删除的房屋(id)，是数组下标为i的元素
                index = i;//index记录i
            }
        }

        if (index == -1) {//说明delId在数组中不存在
            return false;
        }
        for (int i = index; i < houseNums - 1; i++) {
            houses[i] = houses[i + 1];
        }
        houses[--houseNums] = null;//把当有存在的房屋信息的最后一个设置为null
        return true;
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
