/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Jacob DeBerry
 */
package oop.exercises.ex44;

public class Product {
    private String name;
    private double price;
    private int quantity;
    public Product(String title, double cost, int supply)
    {
        name = title;
        price = cost;
        quantity = supply;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String toString()
    {
        String output = "";
        output += "Name: " + name;
        output += "\nPrice: " + price;
        output += "\nQuantity: " + quantity;
        return output;
    }
}
