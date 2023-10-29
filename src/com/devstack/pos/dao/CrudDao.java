package com.devstack.pos.dao;

import java.util.List;

public interface CrudDao<T,ID> {
    public boolean create(T t);
    public T find(ID id);
    public boolean remove(ID id);
    public boolean modify(T t);
    public List<T> loadAll();
}
