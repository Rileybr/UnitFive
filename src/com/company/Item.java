package com.company;

public class Item {
    private String part_number;
    private String part_description;
    private double price;

    public Item(String part_number, String part_description, double price){
        this.part_number = part_number;
        this.part_description = part_description;
        this.price = price;
        if (price<0){
            this.price = 0;
        }
    }

    public String toString(){
        return "Item: " + part_number + "\nPrice: $" + price +"\nDescription: " + part_description;
    }

    public double getTotalPrice(int quantity){
        if (quantity < 0){
            quantity = 0;
        }
        return quantity*price;
    }
}
