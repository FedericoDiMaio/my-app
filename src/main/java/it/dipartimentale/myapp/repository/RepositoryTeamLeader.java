package it.dipartimentale.myapp.repository;

import it.dipartimentale.myapp.model.TeamLeader;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositoryTeamLeader extends MongoRepository<TeamLeader, String> {
}
