package it.dipartimentale.myapp.repository;

import it.dipartimentale.myapp.dto.TeamLeaderDto;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author : Federico Di Maio
 * @date : 22/12/2022
 * @Project : tesi
 */
public interface TeamLeaderRepository  extends MongoRepository<TeamLeaderDto, String> {
}
