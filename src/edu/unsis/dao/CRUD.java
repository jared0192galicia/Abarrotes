package edu.unsis.dao;



import java.util.ArrayList;

public interface CRUD <T> {
    
    public ArrayList<T> listAll();
    public boolean create(T obj);
    public boolean delete(T obj);
    public boolean update(T obj);
}
