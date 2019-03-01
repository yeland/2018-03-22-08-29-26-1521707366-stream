package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int evenSum = 0;
        int left = (leftBorder > rightBorder) ? rightBorder : leftBorder;
        int right = (leftBorder > rightBorder) ? leftBorder : rightBorder;
        for (int i = left; i <= right; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            }
        }
        return evenSum;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int oddSum = 0;
        int left = (leftBorder > rightBorder) ? rightBorder : leftBorder;
        int right = (leftBorder > rightBorder) ? leftBorder : rightBorder;
        for (int i = left; i <= right; i++) {
            if (i % 2 == 1) {
                oddSum += i;
            }
        }
        return oddSum;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        int sum = 0;
        for (Integer num : arrayList) {
            sum += num * 3 + 2;
        }
        return sum;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        List<Integer> resultList = new ArrayList<>();
        for (Integer num : arrayList) {
            if (num % 2 == 1) {
                resultList.add(num * 3 + 2);
            } else {
                resultList.add(num);
            }
        }
        return resultList;
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        int sum = 0;
        for (Integer num : arrayList) {
            if (num % 2 == 1) {
                sum += num * 3 + 5;
            }
        }
        return sum;
    }

    public double getMedianOfEvenIndex(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public double getAverageOfEvenIndex(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        throw new NotImplementedException();
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        throw new NotImplementedException();
    }
}
