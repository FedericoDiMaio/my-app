package it.dipartimentale.myapp.service.common;

import org.springframework.data.mongodb.repository.MongoRepository;


import java.util.List;

/**
 * @author : f.dimaio
 * @date : 13/12/2022
 * @Project : my-app
 */
public abstract class AbstractCrudService<T> {

    private final MongoRepository<T, String> repository;

    protected AbstractCrudService(MongoRepository<T, String> repository) {
        this.repository = repository;
    }

    public List<T> readAll() {
        return repository.findAll();
    }

    public T read(String id) {
        return repository.findById(id).orElse(null);
    }

    public T update(T entity) {
        return repository.save(entity);
    }

    public T insert(T entity) {
        return repository.insert(entity);
    }

    public void delete(T entity) {
        repository.delete(entity);
    }

    public void deleteById(String id) {
        repository.deleteById(id);
    }


}
