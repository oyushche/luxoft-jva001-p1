package com.luxoft.jva001p1.generics.c0list;

public class ListStructureDemo
{
    public static void main(String[] args)
    {
        int counter = 0;

        Node root = new Node(counter++);

        push(root, counter++);
        push(root, counter++);
        push(root, counter++);

        printList(root);
    }

    public static void push(Node root, int i)
    {
        Node current = root;

        while (current.getNext() != null)
        {
            current = current.getNext();
        }

        current.setNext(new Node(i));
    }

    public static void printList(Node current)
    {
        do
        {
            System.out.println(current.getData());
            current = current.getNext();
        }
        while (current != null);
    }

}
