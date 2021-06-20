/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Jacob DeBerry
 */
package oop.exercises.ex44;

import com.google.gson.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class solution44 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException {
        //read in product data
        Scanner file = new Scanner(new File("C:\\Users\\JMDeB\\Desktop\\Object Oriented Programming" +
                "\\deberry-cop3330-assignment3\\src\\main\\java\\oop\\exercises\\ex44\\exercise44_input.json"));
        String input = "";
        while(file.hasNextLine())
        {
            input += file.nextLine();
        }

        Gson gson = new Gson();
        Inventory products = gson.fromJson(input, Inventory.class);

        //main loop
        boolean foundProduct = false;
        while(!foundProduct)
        {
            //prompt for name
            System.out.print("What is the product name? ");
            String name = in.nextLine();
            //search and return results
            for(int i = 0; i < products.getProducts().length; i++)
            {
                if(products.getProducts()[i].getName().equalsIgnoreCase(name)) {
                    foundProduct = true;
                    System.out.println(products.getProducts()[i].toString());
                    break;
                }
            }

            if(!foundProduct)
                System.out.println("Sorry, that product was not found in our inventory.");
        }
    }
}
