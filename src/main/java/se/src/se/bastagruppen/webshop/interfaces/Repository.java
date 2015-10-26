package se.bastagruppen.webshop.interfaces;

import java.util.List;

/**
 * Created by fredrik on 26/10/15.
 */
public interface Repository<T> {

    void create(T item);

    T findById(String id);

    List<T> getAll();

    void update(T item);

    void delete(String id);
}
