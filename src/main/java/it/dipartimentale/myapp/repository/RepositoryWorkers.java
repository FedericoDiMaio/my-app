package it.dipartimentale.myapp.repository;

import it.dipartimentale.myapp.model.Workers;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositoryWorkers extends MongoRepository<Workers, String> {
}
