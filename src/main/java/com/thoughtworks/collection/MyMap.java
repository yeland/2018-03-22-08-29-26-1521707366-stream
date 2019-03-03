package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        List<Integer> triple = new ArrayList<>();
        for (Integer num : this.array) {
            triple.add(num * 3);
        }
        return triple;
    }

    public List<String> mapLetter() {
        List<String> letterList = new ArrayList<>();
        for (Integer num : this.array) {
            letterList.add(letters[num - 1]);
        }
        return letterList;
    }

    public List<String> mapLetters() {
        List<String> lettersList = new ArrayList<>();
        for (Integer num : this.array) {
            if (num <= 26) {
                lettersList.add(letters[num - 1]);
            } else {
                lettersList.add(letters[(num - 1) / 26 - 1] + letters[(num - 1) % 26]);
            }
        }
        return lettersList;
    }

    public List<Integer> sortFromBig() {
        List<Integer> list = sortFromSmall();
        Collections.reverse(list);
        return list;
    }

    public List<Integer> sortFromSmall() {
        Collections.sort(this.array);
        return this.array;
    }
}
