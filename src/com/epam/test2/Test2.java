package com.epam.test2;

public class Test2 {

    String name;
    int cost;

    Test2() {

        name = "Mari";
        cost = 10;
    }

    public Test2(String name, int cost) {

        this.name = name;
        this.cost = cost;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getCost() {

        return cost;
    }

    public void setCost(int cost) {

        this.cost = cost;
    }
}
