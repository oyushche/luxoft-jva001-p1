package com.luxoft.jva001p1.postoffice;

public class Mail
{
    private final String text;

    private Person to;
    private Person from;

    public Mail(String text)
    {
        this.text = text;
    }

    public String getText()
    {
        return text;
    }

    public Person getTo()
    {
        return to;
    }

    public void setTo(Person to)
    {
        this.to = to;
    }

    public Person getFrom()
    {
        return from;
    }

    public void setFrom(Person from)
    {
        this.from = from;
    }

    @Override
    public String toString()
    {
        return text;
    }
}
