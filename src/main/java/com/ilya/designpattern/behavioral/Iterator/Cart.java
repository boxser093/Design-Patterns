package com.ilya.designpattern.behavioral.Iterator;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Cart implements Collection {

    private String bayerName;
    private String[] goods;

    @Override
    public Iterator getIterator() {
        return new CartIterator();
    }

    private class CartIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            if (index < goods.length) {
                return true;
            }
            return false;
        }
        @Override
        public Object next() {
            return goods[index++];
        }
    }

}
