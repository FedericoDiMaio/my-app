package it.dipartimentale.myapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author : Federico Di Maio
 * @date : 13/12/2022
 * @Project : my-app
 */
public interface IRepository <Entity, id> extends MongoRepository<Entity, id> {
}
