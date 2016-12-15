package com.luxoft.jva001p1.generics.g1list;

public class D1_Box<T>
{
    private T object;

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public static void main(String[] args)
    {
        D1_Box<Integer> box = new D1_Box<>();

        box.setObject(23);
        Integer number = box.getObject();
    }
}

