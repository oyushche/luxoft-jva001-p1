package com.luxoft.jva001p1.generics.g9restrictions;

public class SyntaxRestrictions
{

    public static void main(String[] args)
    {
//        Primitive<int> p = new Primitive<>(); // will not compile

        Primitive<Integer> i = new Primitive<>();

        // will not compile
//        if (i instanceof Primitive<Boolean>)
//        {
//            System.out.println("not com.luxoft.jva001p1.animals.Integer");
//        }



    }

    static class Primitive<T>
    {

        void create()
        {
//            T t = new T(); // will not compile
        }
    }

    // will not compile
//    class Problem<T> extends Exception
//    {
//
//    }

    class Catcher<T extends Throwable>
    {

        void catchIt()
        {
            try
            {
                // do something
            }
//            catch (T e) // will not compile
//            {
//
//            }
            finally
            {

            }
        }
    }

    public class Pair<T>
    {
        public Pair<T> makePair(Class<T> clazz) throws Exception
        {
            return (Pair<T>) clazz.newInstance();
        }
    }

}
