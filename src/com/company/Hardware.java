package com.company;

public class Hardware {
    public static void main(String[] args) {
        Item hammer = new Item("9876", "Hammer", 19.75);
        Item level = new Item("1239", "Level", 12.99);
        Item circular_saw = new Item("4343", "Circular Saw", 122.50);

        System.out.println(circular_saw.getTotalPrice(2) + hammer.getTotalPrice(5) + level.getTotalPrice(12));
        System.out.println(circular_saw);
        System.out.println(hammer);
        System.out.println(level);
    }
}
