package oop.exercises.ex41;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameSorterTest {
    @Test
    void NameSorterTest()
    {
        NameSorter test = new NameSorter();
        test.add("Johnson, Tom");
        test.add("Dodd, Bob");
        test.add("Adamson, Adam");

        test.sortByLastName();
        String actual = test.toString();
        String expected = "Total of 3 names\n-----------------------------\nAdamson, Adam\nDodd, Bob\nJohnson, Tom";
        assertEquals(expected, actual);
    }

}