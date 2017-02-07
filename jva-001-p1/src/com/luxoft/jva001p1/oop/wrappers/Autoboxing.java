package com.luxoft.jva001p1.oop.wrappers;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Autoboxing
{

    private Integer i = 3;

    public void doNumsNewWay()
    {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);

        int num = numbers.get(0);
    }

    public static void main(String[] args)
    {
        BigInteger number = new BigInteger("33");
        BigInteger big = number.pow(10000);
    }
}
