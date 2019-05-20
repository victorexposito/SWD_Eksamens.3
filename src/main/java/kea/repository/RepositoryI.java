package kea.repository;

import java.util.List;

public interface RepositoryI<T> {

    public T create(T t);
    public T readId(int id);
    public T update(T t);
    public T delete(T t);
    public List<T> read();
}
