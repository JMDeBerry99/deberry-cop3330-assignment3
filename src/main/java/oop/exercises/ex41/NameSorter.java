/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Jacob DeBerry
 */
package oop.exercises.ex41;

import java.util.ArrayList;

public class NameSorter {
    //list to store names in
    private static ArrayList<String> names = new ArrayList<>();
    private static ArrayList<String> sortedNames = new ArrayList<>();

    //method to add new names to list
    public void add(String name)
    {
        names.add(name);
    }

    //method to sort by last name
    public void sortByLastName()
    {
        int lowestLetterIndex;
        int sizeOfOriginalList = names.size();
        for(int i = 0; i < sizeOfOriginalList; i++)
        {
            lowestLetterIndex = 0;

            for(int j = 0; j < names.size(); j++)
            {
                if(names.get(j).compareToIgnoreCase(names.get(lowestLetterIndex)) < 0)
                {
                    lowestLetterIndex = j;
                }
            }

            sortedNames.add(names.get(lowestLetterIndex));
            names.remove(lowestLetterIndex);
        }

    }

    //turns sorted list into a string for output
    public String toString()
    {
        String output = "";
        output += "Total of " + sortedNames.size() + " names";
        output += "\n-----------------------------";
        for(int i = 0; i < sortedNames.size(); i++)
        {
            output += "\n" + sortedNames.get(i);
        }
        return output;
    }

}
