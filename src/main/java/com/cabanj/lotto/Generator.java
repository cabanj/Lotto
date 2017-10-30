package com.cabanj.lotto;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Generator {
    /**
     * Default limit is 50 since numbers range is 1-49
     */
    private int limit = 50;

    public Generator(){}

    public Generator(int limit) {
        this.limit = limit;
    }

    private Set<Integer> generate(){
        Set<Integer> numbers = new TreeSet<>();
        Random random = new Random();
        for(int i = 0; i < 6; i++){
            numbers.add(random.nextInt(limit));
        }
        return numbers;
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
