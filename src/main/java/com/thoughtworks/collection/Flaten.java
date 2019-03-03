package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Flaten {

    Integer[][] array;

    public Flaten(Integer[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            resultList.addAll(Arrays.asList(array[i]));
        }
        return resultList;
    }

    public List<Integer> transformToUnrepeatedOneDimesional() {
        List<Integer> resultList = transformToOneDimesional();
        Filter filter = new Filter(resultList);
        return filter.getDifferentElements();
    }
}
