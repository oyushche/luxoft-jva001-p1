package com.luxoft.jva001p1.generics.c0list;

public class Node
{
    private Node next;
    private final Object data;

    public Node(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
