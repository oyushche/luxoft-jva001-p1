package com.luxoft.jva001p1.inners.i0private;


public class StringList
{
    private Node root;

    public StringList()
    {
        this.root = new Node("root");
    }

    public Node getRoot()
    {
        return root;
    }

    public void print()
    {
        Node cn = root.getNext();
        while (cn != null)
        {
            System.out.println(cn.getString());
            cn = cn.getNext();
        }
    }

    public void addString(String s)
    {

        Node n = new Node(s);

        Node currentNode = root;

        while (currentNode.getNext() != null)
        {
            currentNode = currentNode.getNext();
        }

        currentNode.setNext(n);
    }

    /**
     * This class does not accessible to outer world.
     */
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
