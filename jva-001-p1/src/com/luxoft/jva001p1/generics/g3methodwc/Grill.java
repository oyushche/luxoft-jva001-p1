package com.luxoft.jva001p1.generics.g3methodwc;

import com.luxoft.jva001p1.generics.Product;

public class Grill extends Product
{
    public Grill(long uid)
    {
        super(uid);
    }

    @Override
    public String toString()
    {
        return getUid() + ":Grill[]";
    }
}
