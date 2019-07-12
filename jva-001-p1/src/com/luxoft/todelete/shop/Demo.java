package com.luxoft.todelete.shop;

public class Demo
{
    public static void main(String[] args)
    {
        Doll doll = new Doll();

        doll.setName("Rima");
        doll.setColor("Red");



    }


    static void printProduct(Product product)
    {
        System.out.println(product.getName() + ":" + product.getPrice());
    }


    static void printDoll(Doll doll)
    {
        System.out.println(doll.getName() + ":" + doll.getColor());
    }

    static void printBarbie(Barbie barbie)
    {
        System.out.println(barbie.getName() + ":" + barbie.getExtraClothes());
    }
}
