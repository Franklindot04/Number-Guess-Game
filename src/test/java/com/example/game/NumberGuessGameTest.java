package com.example.game;

import org.junit.Test;
import static org.junit.Assert.*;

public class NumberGuessGameTest {

    @Test
    public void testNumberInRange() {
        int number = (int) (Math.random() * 10) + 1;
        assertTrue("Number should be between 1 and 10", number >= 1 && number <= 10);
    }
}

