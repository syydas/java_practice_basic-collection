package com.thoughtworks.collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Random;

public class Practice1 {
    public static void main(String[] args) {
        System.out.println(randomNumber());
    }

    /**
     * 生成10个0到20的随机整数，要求不能重复
     */
    public static Collection<Integer> randomNumber() {
        Collection<Integer> randomNum = new HashSet<>();
        while (randomNum.size() < 10) {
            randomNum.add(new Random().nextInt(20));
        }
        return randomNum;
    }
}
