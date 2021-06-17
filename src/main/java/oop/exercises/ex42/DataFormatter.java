/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Jacob DeBerry
 */
package oop.exercises.ex42;

import java.util.ArrayList;

public class DataFormatter {
    private ArrayList<String[]> data = new ArrayList<>();
    private String chart = "";

    //splits line into individual strings, and adds to array list
    public void process(String nextLine)
    {
       String[] tempArray = nextLine.split(",");
       data.add(tempArray);
    }

    //sets up chart, title, and populates with data
    public void createChart()
    {
        chart += "Last      First     Salary";
        chart += "\n--------------------------";

        String temp;
        for(String[] entry : data)
        {
            chart += "\n";
            for(int i = 0; i < entry.length; i++)
            {
                temp = entry[i];
                if(i != entry.length - 1) {
                    while (temp.length() < 10) {
                        temp += " ";
                    }
                }
                chart += temp;
            }
        }
    }

    //prints out the created chart
    public String printChart()
    {
        return chart;
    }
}
