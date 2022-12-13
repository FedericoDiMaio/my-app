package it.dipartimentale.myapp.repository;

import it.dipartimentale.myapp.model.Workers;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author : Federico Di Maio
 * @date : 13/12/2022
 * @Project : my-app
 */
public interface RepositoryWorkers extends MongoRepository<Workers, String> {
}
