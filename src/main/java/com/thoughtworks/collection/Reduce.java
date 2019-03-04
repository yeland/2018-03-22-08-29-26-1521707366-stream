package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        return Collections.max(this.arrayList);
    }

    public double getMinimum() {
        return Collections.min(this.arrayList);
    }

    public double getAverage() {
        double sum = 0;
        for (Integer num : this.arrayList) {
            sum += num;
        }
        return sum / this.arrayList.size();
    }

    public double getOrderedMedian() {
        Collections.sort(arrayList);
        int small = (int) Math.floor((arrayList.size() - 1) / 2.0);
        int large = (int) Math.ceil((arrayList.size() - 1) / 2.0);
        return (arrayList.get(small) + arrayList.get(large)) / 2.0;
    }

    public int getFirstEven() {
        for (Integer num : this.arrayList) {
            if (num % 2 == 0) {
                return num;
            }
        }
        return 0;
    }

    public int getIndexOfFirstEven() {
        for (int i = 0; i < this.arrayList.size(); i++) {
            if (this.arrayList.get(i) % 2 == 0) {
                return i;
            }
        }
        return 0;
    }

    public boolean isEqual(List<Integer> arrayList) {
        if (this.arrayList.size()!=arrayList.size()) {
            return false;
        }
        for (int i=0;i<this.arrayList.size();i++) {
            if (!this.arrayList.get(i).equals(arrayList.get(i))) {
                return false;
            }
        }
        return true;
    }

    //实现接口SingleLink，然后再此函数内使用
    public Double getMedianInLinkList(SingleLink singleLink) {
        throw new NotImplementedException();
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
