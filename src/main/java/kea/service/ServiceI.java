package kea.service;

import java.util.List;

public interface ServiceI<T> {

    public T create(T t);
    public T readId(T t);
    public T update(T t);
    public boolean delete(int id);
    public List<T> read();
    public List<T> readAll();
}