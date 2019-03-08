package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        return this.array.stream().map(i -> i * 3).collect(Collectors.toList());
    }

    public List<String> mapLetter() {
        return this.array.stream().map(i -> letterList.get(i - 1)).collect(Collectors.toList());
    }

    public List<String> mapLetters() {
        Stream<String> letter = this.array.stream().filter(element -> element <= 26)
                .map(i -> letterList.get(i - 1));
        Stream<String> letters = this.array.stream().filter(element -> element > 26)
                .map(i -> letterList.get((i - 1) / 26 - 1) + letterList.get((i - 1) % 26));
        return Stream.concat(letter, letters).collect(Collectors.toList());
    }

    public List<Integer> sortFromBig() {
        return this.array.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
    }

    public List<Integer> sortFromSmall() {
        return this.array.stream().sorted().collect(Collectors.toList());
    }
}
