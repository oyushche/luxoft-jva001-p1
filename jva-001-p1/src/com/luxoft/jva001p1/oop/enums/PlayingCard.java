package com.luxoft.jva001p1.oop.enums;

public class PlayingCard
{
    public static final int SUIT_SPADES = 0;
    public static final int SUIT_HEARTS = 1;
    public static final int SUIT_CLUBS = 2;
    public static final int SUIT_DIAMONDS = 3;

    private int suit;

    public PlayingCard(int suit)
    {
        this.suit = suit;
    }

    public String getSuitName()
    {
        String name = "";

        switch (suit)
        {
            case SUIT_SPADES: name = "spades"; break;
            case SUIT_HEARTS: name = "hearts"; break;
            case SUIT_CLUBS: name = "clubs"; break;
            case SUIT_DIAMONDS: name = "diamonds"; break;
        }
        return name;
    }
}
