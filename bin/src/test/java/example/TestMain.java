package example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMain {
    @Test
    public void getGreeting() {
        String test = Main.greeting();
        String expected = "Hello World";
        assertEquals(expected, test);
    }
}
