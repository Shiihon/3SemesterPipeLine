package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void testForSuccess (){
        Assertions.assertEquals(1, 1);
    }

    @Test
    void testForFailure (){
        Assertions.assertEquals(1, 1);
    }
}