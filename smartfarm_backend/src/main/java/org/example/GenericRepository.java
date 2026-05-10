package org.example;

import java.util.ArrayList;
import java.util.List;

public class GenericRepository<T> {
    private List<T> data = new ArrayList<>();
    private Class<T> type;

    public GenericRepository(Class<T> type) {
        this.type = type;
    }

    public void save(T entity) {
        data.add(entity);
    }

    public List<T> findAll() {
        return data;
    }
}
