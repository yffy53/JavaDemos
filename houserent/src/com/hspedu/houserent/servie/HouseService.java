package com.hspedu.houserent.servie;

import com.hspedu.houserent.domain.House;

public class HouseService {

    private House[] houses;  //保存House对象

    public HouseService(int size) {
        houses = new House[size];  //当创建HouseService对象，指定数组大小
        houses[0] = new House(1, "jack", "708", "吉阳区", 2000, "未出租");
    }

    public House[] list() {
        return houses;
    }
}
