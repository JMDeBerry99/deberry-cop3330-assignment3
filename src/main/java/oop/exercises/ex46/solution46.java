/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Jacob DeBerry
 */
package oop.exercises.ex46;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class solution46 {
    public static void main(String[] args) throws FileNotFoundException {
        //read in file
        Scanner file = new Scanner(new File("C:\\Users\\JMDeB\\Desktop\\Object Oriented Programming" +
                "\\deberry-cop3330-assignment3\\src\\main\\java\\oop\\exercises\\ex46\\exercise46_input.txt"));
        String input = readIN(file);

        //traverse string, counting how many times the desired word appears
        int badgerCount = countOfWord("badger", input);
        int mushroomCount = countOfWord("mushroom", input);
        int snakeCount = countOfWord("snake", input);

        //output the counts of each desired word
        String output = toPrint("badger", badgerCount);
        System.out.println(output);
        output = toPrint("mushroom", mushroomCount);
        System.out.println(output);
        output = toPrint("snake", snakeCount);
        System.out.println(output);
    }

    public static String readIN(Scanner file)
    {
        String input = "";
        while(file.hasNextLine())
        {
            input += file.nextLine();
            input += " ";
        }
        return input;
    }

    public static int countOfWord(String word, String phrase)
    {
        int count = 0;
        String[] wordArray = phrase.split("\\s+");
        for(String singleWord : wordArray)
        {
            if(singleWord.equalsIgnoreCase(word))
                count++;
        }
        return count;
    }

    public static String toPrint(String word, int count)
    {
        String output = word + ":";
        for(int i = 0; i < 10-output.length(); i++)
            output += " ";

        for(int i = 0; i < count; i++)
            output += "*";

        return output;
    }
}
