package com.luxoft.jva001p1.inners.automation;

import java.util.ArrayList;
import java.util.List;

public class Box
{
    private List<String> strings;

    public Box()
    {
        strings = new ArrayList<>();
    }

    public void add(String s)
    {
        strings.add(s);
    }

    public List<String> getStrings()
    {
        return new ArrayList<>(strings);
    }

    public BoxIterator getBackIterator()
    {
        return new BackIterator();
    }

    public BoxIterator getIterator()
    {
        return new Iterator();
    }

    public interface BoxIterator
    {
        String next();
    }

    public class Iterator implements BoxIterator
    {
        int index = 0;

        public Iterator()
        {
        }

        public String next()
        {
            if (index < strings.size())
            {
                return strings.get(index++);
            }
            return null;
        }
    }

    public class BackIterator implements BoxIterator
    {
        int index;

        public BackIterator()
        {
            this.index = strings.size() - 1;
        }

        public String next()
        {
            if (index >= 0)
            {
                return strings.get(index--);
            }
            return null;
        }
    }
}
