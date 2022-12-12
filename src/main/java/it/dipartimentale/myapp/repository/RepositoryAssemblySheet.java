package it.dipartimentale.myapp.repository;

import it.dipartimentale.myapp.model.utils.AssemblySheet;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositoryAssemblySheet extends MongoRepository<AssemblySheet, String> {
}
