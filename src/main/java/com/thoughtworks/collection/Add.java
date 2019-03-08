package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        CollectionOperator collectionOperator = new CollectionOperator();
        List<Integer> list = collectionOperator.getEvenListByIntervals(leftBorder, rightBorder);
        return list.stream().reduce(0, (pre, cur) -> pre + cur);
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        CollectionOperator collectionOperator = new CollectionOperator();
        List<Integer> list = collectionOperator.getListByInterval(leftBorder, rightBorder);
        return list.stream().filter(element -> element % 2 == 1).mapToInt(Integer::valueOf).sum();
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream().map(number -> number * 3 + 2).mapToInt(Integer::valueOf).sum();
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream().filter(i -> i % 2 == 1).map(number -> number * 3 + 2).collect(Collectors.toList());
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        return arrayList.stream().filter(i -> i % 2 == 1).map(n -> n * 3 + 5).reduce(0, (a, b) -> a + b);
    }

    public double getMedianOfEvenIndex(List<Integer> arrayList) {
        List<Integer> evenArrayList = IntStream.range(0, arrayList.size())
                .filter(i -> i % 2 == 0).mapToObj(arrayList::get).collect(Collectors.toList());
        Reduce reduce = new Reduce(evenArrayList);
        return reduce.getOrderedMedian();
    }

    public double getAverageOfEvenIndex(List<Integer> arrayList) {
        List<Integer> evenArrayList = IntStream.range(0, arrayList.size())
                .filter(i -> i % 2 == 0).mapToObj(arrayList::get).collect(Collectors.toList());
        return evenArrayList.stream().collect(Collectors.averagingDouble(Integer::valueOf));
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        return arrayList.stream().filter(i -> i % 2 == 0).anyMatch(i -> i.equals(specialElment));
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        return arrayList.stream().filter(i -> i % 2 == 0).distinct().collect(Collectors.toList());
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        List<Integer> evenList = arrayList.stream().filter(i -> i % 2 == 0)
                .sorted().collect(Collectors.toList());
        List<Integer> oddList = arrayList.stream().filter(i -> i % 2 == 1)
                .sorted(Collections.reverseOrder()).collect(Collectors.toList());
        return Stream.concat(evenList.stream(),oddList.stream()).collect(Collectors.toList());
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        IntStream indexStream = IntStream.range(1,arrayList.size());
        List<Integer> array = indexStream.mapToObj(i->3*(arrayList.get(i-1)+arrayList.get(i)))
                .collect(Collectors.toList());
        return array;
    }
}
