package com.example.game;

import org.junit.Test;
import static org.junit.Assert.*;

public class NumberGuessGameTest {

    @Test
    public void testRandomNumberInRange() {
        int number = (int) (Math.random() * 100) + 1;
        assertTrue(number >= 1 && number <= 100);
    }
}

