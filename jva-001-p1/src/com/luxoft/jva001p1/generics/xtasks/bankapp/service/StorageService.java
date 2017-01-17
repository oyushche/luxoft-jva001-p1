package com.luxoft.jva001p1.generics.xtasks.bankapp.service;

import com.luxoft.jva001p1.generics.xtasks.bankapp.domain.Indexed;

import java.util.List;

public interface StorageService<T extends Indexed>
{
    T store(T object);

    T getById(int id);

    T update(T toUpdate);

    void delete(T object);

    List<T> getAll();
}
