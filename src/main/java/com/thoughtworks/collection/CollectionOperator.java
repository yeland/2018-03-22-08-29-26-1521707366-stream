package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        if (left < right) {
            return IntStream.rangeClosed(left, right).boxed().collect(Collectors.toList());
        }
        List<Integer> list = IntStream.rangeClosed(right, left).sorted().boxed().collect(Collectors.toList());
        list.sort(Comparator.reverseOrder());
        return list;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<Integer> list = new ArrayList<>(getListByInterval(left, right));
        return list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
    }

    public List<Integer> popEvenElments(int[] array) {
        IntStream stream = Arrays.stream(array);
        return stream.filter(i -> i % 2 == 0).boxed().collect(Collectors.toList());
    }

    public int popLastElment(int[] array) {
        return array[array.length - 1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        IntStream firstStream = Arrays.stream(firstArray);
        List<Integer> secondList = Arrays.stream(secondArray).boxed().collect(Collectors.toList());
        return firstStream.filter(secondList::contains).boxed().collect(Collectors.toList());
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        return Stream.concat(Arrays.stream(firstArray),Arrays.stream(secondArray))
                .distinct().collect(Collectors.toList());
    }
}
