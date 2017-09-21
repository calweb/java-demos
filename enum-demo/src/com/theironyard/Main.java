package com.theironyard;

public class Main {

    public static void main(String[] args) {
        System.out.println(Days.THURSDAY.getStatus());
        System.out.println(Days.THURSDAY.daysAdjacent(Days.WEDNESDAY));

        System.out.println(Boards.SNOWBOARD.isOnWater());
    }
}
