package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class InverseReduce {

    private Random random = new Random();

    public InverseReduce() {
    }

    public InverseReduce(Random random) {
        this.random = random;
    }

    public List<Integer> divideToSmaller(int number) {
        int step;
        do {
            step = this.random.nextInt(3);
        } while (step == 0);
        List<Integer> resultList = new ArrayList<>();
        for (int i = number - step; i >= 0; i = i - step) {
            resultList.add(i);
        }
        return resultList;
    }
}
