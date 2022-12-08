package services;

import java.util.List;

public interface BaseService<E> {

    E getById(int id);

    List<E> getAll();

    void deleteById(int id);



}
