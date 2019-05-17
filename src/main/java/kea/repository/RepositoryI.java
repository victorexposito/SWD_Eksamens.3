package kea.repository;

public interface RepositoryI<T> {

    public T create(T t);
    public T read(T t);
    public T update(T t);
    public T delete(T t);
    public List<T t> readAll;
}
