package com.luxoft.jva001p1.inners.i1public;


public class StringList
{
    private Node root;

    public StringList()
    {
        this.root = new Node("root");
    }

    public void addString(String s)
    {

        Node n = new Node(s);

        Node cn = root;

        while (cn.getNext() != null)
        {
            cn = cn.getNext();
        }

        cn.setNext(n);
    }

    public Iterator getIterator()
    {
        return new Iterator();
    }

    public class Iterator
    {
        private Node currentNode = root;

        private Iterator()
        {
        }

        public String getNextString()
        {
            if (hasNext())
            {
                currentNode = currentNode.getNext();
                return currentNode.getString();
            }
            return null;
        }

        public boolean hasNext()
        {
            return currentNode.getNext() != null;
        }
    }

    private class Node
    {
        private String string;

        private Node next;

        public Node(String string)
        {
            this.string = string;
        }

        public String getString()
        {
            return string;
        }

        public Node getNext()
        {
            return next;
        }

        public void setNext(Node next)
        {
            this.next = next;
        }
    }
}
