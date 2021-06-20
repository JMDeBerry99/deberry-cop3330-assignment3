package oop.exercises.ex43;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class WebsiteGeneratorTest {

    @Test
    void generateWebsiteTest() throws IOException {
        WebsiteGenerator test = new WebsiteGenerator();
        test.setName("awesomeco");
        test.setAuthor("Max Power");
        test.setJS(true);
        test.setCSS(true);
        String actual = test.generateWebsite();
        String expected = "Created ./ex43/awesomeco\n" +
                "Created ./ex43/awesomeco/index.html\n" +
                "Created ./ex43/awesomeco/js/\n" +
                "Created ./ex43/awesomeco/css/\n";
        assertEquals(expected, actual);
    }
}