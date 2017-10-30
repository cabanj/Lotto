package com.cabanj.lotto;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Generator {
    /**
     * Default limit is 50 since numbers range is 1-49
     */
    private int limit = 49;
    private int count = 6;

    /**
     * Construct with default values 6 numbers up to 49
     */
    public Generator(){}

    public Generator(int limit, int count) {
        this.limit = limit;
        this.count = count;
    }

    private Set<Integer> generate(){
        Set<Integer> numbers = new TreeSet<>();
        for(int i = 0; i < count; i++){
           addUniqueNumber(numbers);
        }
        return numbers;
    }

    private void addUniqueNumber(Set<Integer> numbers) {
        Random random = new Random();
        int number = random.nextInt(limit) + 1;
        if (numbers.contains(number)){
            addUniqueNumber(numbers);
        }
        numbers.add(number);
    }

    public void print(int iterations){
        for (int i = 0; i < iterations; i++) {
            System.out.println(generate());
        }
    }

    /**
     * Default generation of one set of numbers
     */
    public void print(){
        print(1);
    }
}
