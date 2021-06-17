package oop.exercises.ex42;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class DataFormatterTest {
    @Test
    void final_chart_comparison_test() throws FileNotFoundException {
        //reads in data line by line
        File inFile = new File("C:\\Users\\JMDeB\\Desktop\\Object Oriented Programming\\" +
                "deberry-cop3330-assignment3\\src\\main\\java\\oop\\exercises\\ex42\\exercise42_input.txt");
        Scanner sc = new Scanner(inFile);
        DataFormatter formatter = new DataFormatter();
        while(sc.hasNextLine())
        {
            formatter.process(sc.nextLine());
        }

        //breaks up data by category and formats into chart
        formatter.createChart();

        //prints chart
        String output = formatter.printChart();
        String expected = "Last      First     Salary\n" +
                "--------------------------\n" +
                "Ling      Mai       55900\n" +
                "Johnson   Jim       56500\n" +
                "Jones     Aaron     46000\n" +
                "Jones     Chris     34500\n" +
                "Swift     Geoffrey  14200\n" +
                "Xiong     Fong      65000\n" +
                "Zarnecki  Sabrina   51500";
        assertEquals(expected, output);

    }

}