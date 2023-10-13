package com.ilya.designpattern.behavioral.Iterator;

public class MarketRunner {
    public static void main(String[] args) {
        String[] goodsCart = {"Milk","Eggs","Bread","Cheese"};
        String buyer = "Mr.Smith";
        Cart anotherDeal = new Cart(buyer,goodsCart);
        Iterator iterator = anotherDeal.getIterator();
        System.out.println("Cart goods of: "+anotherDeal.getBayerName());
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
