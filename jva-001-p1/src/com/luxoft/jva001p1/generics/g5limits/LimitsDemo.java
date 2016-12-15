package com.luxoft.jva001p1.generics.g5limits;

import com.luxoft.jva001p1.generics.Monitor;

public class LimitsDemo
{
    public static void main(String[] args)
    {
        Basket<TV> tvBasket = new Basket<>();
//        Basket<Monitor> monitorBasket = new Basket<>(); // Will not compile

        tvBasket.add(new TV(1, 56));
    }
}
