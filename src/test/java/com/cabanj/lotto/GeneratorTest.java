package com.cabanj.lotto;

import org.junit.Assert;
import org.junit.Test;

import java.util.Set;

public class GeneratorTest {

    @Test
    public void test() {
        Generator g = new Generator();
        for (int i = 0; i < 100; i++) {
            Set<Integer> generatedSet = g.generate();
            Assert.assertEquals(generatedSet.size(), 6);
            for (int n : generatedSet) {
                Assert.assertTrue(n > 0);
                Assert.assertTrue(n < 50);
            }
        }
    }
}
