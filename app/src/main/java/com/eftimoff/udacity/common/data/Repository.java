package com.eftimoff.udacity.common.data;

import java.util.List;

/**
 * Created by georgieftimov on 06/04/16.
 */
public interface Repository<T> {

    void create(T t);

    List<T> getAll();

    void delete(T t);

}
