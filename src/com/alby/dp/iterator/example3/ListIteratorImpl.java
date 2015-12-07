package com.alby.dp.iterator.example3;

/**
 * Created by xianwei on 2015/12/7.
 * 用来实现访问数组的迭代接口
 */
public class ListIteratorImpl implements Iterator {
    /**
     * 用来存放被迭代的聚合对象
     */
    private PayManager aggregate = null;

    private int index = -1;

    public ListIteratorImpl(PayManager aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public void first() {
        index = 0;
    }

    @Override
    public void next() {
        index = index + 1 ;
    }

    @Override
    public boolean isDone() {
        return index == this.aggregate.size();
    }

    @Override
    public Object currentItem() {
        return this.aggregate.get(index);
    }
}
