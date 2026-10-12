package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testAddition() {

        App obj = new App();

        int result = obj.add(10, 20);

        assertEquals(30, result);
    }
}