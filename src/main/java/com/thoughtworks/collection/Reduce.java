package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        IntSummaryStatistics statistics = this.arrayList.stream().collect(Collectors.summarizingInt(Integer::valueOf));
        return statistics.getMax();
    }

    public double getMinimum() {
        return this.arrayList.stream().reduce(this.arrayList.get(0), (pre, ele) -> (pre < ele) ? pre : ele);
    }

    public double getAverage() {
        return this.arrayList.stream().collect(Collectors.averagingDouble(Integer::valueOf));
    }

    public double getOrderedMedian() {
        Collections.sort(arrayList);
        int small = (int) Math.floor((arrayList.size() - 1) / 2.0);
        int large = (int) Math.ceil((arrayList.size() - 1) / 2.0);
        return (arrayList.get(small) + arrayList.get(large)) / 2.0;
    }

    public int getFirstEven() {
        return this.arrayList.stream().filter(i -> i % 2 == 0).findFirst().get();
    }

    public int getIndexOfFirstEven() {
        return this.arrayList.indexOf(getFirstEven());
    }

    public boolean isEqual(List<Integer> arrayList) {
        return arrayList.containsAll(this.arrayList) && this.arrayList.containsAll(arrayList);
    }

    //实现接口SingleLink，然后再此函数内使用
    public Double getMedianInLinkList(SingleLink singleLink) {
        SingleLinkList<Integer> singleLinkList = new SingleLinkList<>();
        this.arrayList.forEach(num -> {
            singleLink.addTailPointer(num);
            singleLinkList.addTailPointer(num);
        });
        int small = (int) Math.floor((singleLinkList.size() - 1) / 2.0);
        int large = (int) Math.ceil((singleLinkList.size() - 1) / 2.0);
        return (singleLinkList.getNode(small) + singleLinkList.getNode(large)) / 2.0;
    }

    public int getLastOdd() {
        List<Integer> list = this.arrayList.stream().filter(i -> i % 2 == 1).collect(Collectors.toList());
        return list.get(list.size()-1);
    }

    public int getIndexOfLastOdd() {
        return this.arrayList.lastIndexOf(getLastOdd());
    }
}
