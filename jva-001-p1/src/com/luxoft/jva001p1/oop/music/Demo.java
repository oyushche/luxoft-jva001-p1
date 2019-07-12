package com.luxoft.jva001p1.oop.music;

public class Demo
{
    public static void main(String[] args)
    {
        Shop musicShop = new Shop();
        generateAndAddSongs(musicShop);

        musicShop.buy("Oleg", "Bereza");
        musicShop.buy("Oleg", "Beliy Dim", "Seriy Dim", "Mary say hello");

        musicShop.buy("Irina", "Mary say hello");

        musicShop.printPrices();
        musicShop.printPurchases();
    }

    static void generateAndAddSongs(Shop shop)
    {
        shop.addSong("Bereza", 10);
        shop.addSong("Seriy Dim", 15);

        shop.addSong("Mary say hello", 30);
    }
}
