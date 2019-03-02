package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

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
        List<Integer> evenArrayList = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            if (i % 2 == 0) {
                evenArrayList.add(arrayList.get(i));
            }
        }
        Collections.sort(evenArrayList);
        int small = (int) Math.floor((evenArrayList.size() - 1) / 2.0);
        int large = (int) Math.ceil((evenArrayList.size() - 1) / 2.0);
        return (evenArrayList.get(small) + evenArrayList.get(large)) / 2.0;
    }

    public double getAverageOfEvenIndex(List<Integer> arrayList) {
        int sum = 0;
        int length = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (i % 2 == 0) {
                sum += arrayList.get(i);
                length += 1;
            }
        }
        return sum / length;
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        for (Integer num : arrayList) {
            if (num % 2 == 0 && specialElment.equals(num)) {
                return true;
            }
        }
        return false;
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        List<Integer> evenList = new ArrayList<>();
        for (Integer num:arrayList) {
            if(num%2==0 && evenList.indexOf(num)<0) {
                evenList.add(num);
            }
        }
        return evenList;
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();
        for (Integer num:arrayList) {
            if(num%2 == 0) {
                evenList.add(num);
            } else {
                oddList.add(num);
            }
        }
        Collections.sort(evenList);
        Collections.sort(oddList);
        Collections.reverse(oddList);
        evenList.addAll(oddList);
        return evenList;
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        List<Integer> array = new ArrayList<>();
        for (int i = 1; i<arrayList.size();i++) {
            array.add(3*(arrayList.get(i-1)+arrayList.get(i)));
        }
        return array;
    }
}
