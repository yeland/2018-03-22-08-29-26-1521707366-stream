package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        List<Integer> array = new ArrayList<>();
        if (left < right) {
            for (int i = left; i <= right; i++) {
                array.add(i);
            }
        } else {
            for (int i = left; i >= right; i--) {
                array.add(i);
            }
        }
        return array;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<Integer> list = new ArrayList<>(getListByInterval(left, right));
        List<Integer> evenList = new ArrayList<>();
        for (Integer num:list) {
            if(num%2==0) {
                evenList.add(num);
            }
        }
        return evenList;
    }

    public List<Integer> popEvenElments(int[] array) {
        List<Integer> evenArray = new ArrayList<>();
        for (int num : array) {
            if (num % 2 == 0) {
                evenArray.add(num);
            }
        }
        return evenArray;
    }

    public int popLastElment(int[] array) {
        return array[array.length-1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        List<Integer> common = new ArrayList<>();
        List<Integer> secondList = new ArrayList<>();
        for (int num:secondArray) {
            secondList.add(num);
        }
        for (int num:firstArray) {
            if(secondList.contains(num)) {
                common.add(num);
            }
        }
        return common;
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        List<Integer> common = new ArrayList<>();
        List<Integer> firstList = Arrays.asList(firstArray);
        common.addAll(firstList);
        for (Integer num:secondArray) {
            if(!common.contains(num)) {
                common.add(num);
            }
        }
        return common;
    }
}
