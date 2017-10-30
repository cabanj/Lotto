package com.cabanj.lotto;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

class Generator {
    /**
     * Default limit is 50 since numbers range is 1-49
     */
    private int limit = 49;
    /**
     * Generate 6 numbers
     */
    private int count = 6;
    private Random random = new Random();

    Set<Integer> generate() {
        Set<Integer> numbers = new TreeSet<>();
        for(int i = 0; i < count; i++){
           addUniqueNumber(numbers);
        }
        return numbers;
    }

    private void addUniqueNumber(Set<Integer> numbers) {
        int number = random.nextInt(limit) + 1;
        if (numbers.contains(number)){
            addUniqueNumber(numbers);
        }
        numbers.add(number);
    }

    void print(int iterations) {
        for (int i = 0; i < iterations; i++) {
            System.out.println(generate());
        }
    }
}
