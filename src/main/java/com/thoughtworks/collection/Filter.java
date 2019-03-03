package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Filter {

    List<Integer> array;

    public Filter(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> filterEven() {
        List<Integer> evenArray = new ArrayList<>();
        for (Integer num : this.array) {
            if (num % 2 == 0) {
                evenArray.add(num);
            }
        }
        return evenArray;
    }

    public List<Integer> filterMultipleOfThree() {
        List<Integer> threeArray = new ArrayList<>();
        for (Integer num:this.array) {
            if (num%3==0) {
                threeArray.add(num);
            }
        }
        return threeArray;
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        List<Integer> common = new ArrayList<>();
        for (Integer num:firstList) {
            if(secondList.contains(num)) {
                common.add(num);
            }
        }
        return common;
    }

    public List<Integer> getDifferentElements() {
        List<Integer> resultList = new ArrayList<>();
        for (Integer num:this.array) {
            if(!resultList.contains(num)) {
                resultList.add(num);
            }
        }
        return resultList;
    }
}