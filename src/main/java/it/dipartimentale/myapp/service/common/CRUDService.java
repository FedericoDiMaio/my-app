package it.dipartimentale.myapp.service.common;

import java.util.List;

/**
 * @author : Federico Di Maio
 * @date : 13/12/2022
 * @Project : my-app
 */
public interface CRUDService<T> {

    T insert(T entity);

    T findByIdAndUsername(String id, String username);

    List<T> findByUsername(String username);

    List<T> find();

    T update(T entity);

    void deleteById(String id);

    void delete(T entity);


}
