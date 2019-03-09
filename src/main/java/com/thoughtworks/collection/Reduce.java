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
        if (this.arrayList.size() != arrayList.size()) {
            return false;
        }
        for (int i = 0; i < this.arrayList.size(); i++) {
            if (!this.arrayList.get(i).equals(arrayList.get(i))) {
                return false;
            }
        }
        return true;
    }

    //实现接口SingleLink，然后再此函数内使用
    public Double getMedianInLinkList(SingleLink singleLink) {
        SingleLinkList<Integer> singleLinkList = new SingleLinkList<>();
        for (Integer num : this.arrayList) {
            singleLink.addTailPointer(num);
            singleLinkList.addTailPointer(num);
        }
        int small = (int) Math.floor((singleLinkList.size() - 1) / 2.0);
        int large = (int) Math.ceil((singleLinkList.size() - 1) / 2.0);
        return (singleLinkList.getNode(small) + singleLinkList.getNode(large)) / 2.0;
    }

    public int getLastOdd() {
        int lastOdd = 0;
        for (Integer num : this.arrayList) {
            if (num % 2 == 1) {
                lastOdd = num;
            }
        }
        return lastOdd;
    }

    public int getIndexOfLastOdd() {
        Integer lastOdd = getLastOdd();
        return this.arrayList.lastIndexOf(lastOdd);
    }
}
