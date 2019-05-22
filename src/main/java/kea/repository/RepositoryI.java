package kea.repository;

import java.util.List;

public interface RepositoryI<T> {

    public T create(T t);
    public T readId(int id);
    public boolean update(T t);
    public boolean delete(int id);
    public List<T> read();
}
