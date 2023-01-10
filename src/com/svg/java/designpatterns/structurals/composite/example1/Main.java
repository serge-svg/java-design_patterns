package com.svg.java.designpatterns.structurals.composite.example1;

public class Main {

    public static void main(String[] args) {

        BoxGift bigGiftBox = new BoxGift("BigBox");
        bigGiftBox.addGift(new SingleGift("book"));
        bigGiftBox.addGift(new SingleGift("jumper"));

        BoxGift smallGiftBox = new BoxGift("SmallBox");
        smallGiftBox.addGift(new SingleGift("ring"));
        smallGiftBox.addGift(new SingleGift("watch"));

        bigGiftBox.addGift(smallGiftBox);

        /** Not recursion approach  */
        for(Gift gift : bigGiftBox.getGifts()){
            System.out.println(gift.getName());
            if (gift.isBoxGift()) {
                for(Gift g : gift.getGifts()){
                    System.out.println(g.getName());
                }
            }
        }

        /** Recursion approach */
        printGifts(bigGiftBox);
        System.out.println(fun1(3,2));
    }

    private static void printGifts(Gift gift) {
        if (!gift.isBoxGift()) {
            System.out.println(gift.getName());
        } else {
            for (Gift g : gift.getGifts()) {
                printGifts(g);
            }
        }
    }

    static int fun1(int x, int y)
    {
        if (x == 0)
            return y;
        else
            return fun1(x - 1, x + y);
    }

}
