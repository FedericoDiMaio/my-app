package it.dipartimentale.myapp.repository;


import it.dipartimentale.myapp.dto.GodDto;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author : Federico Di Maio
 * @date : 15/12/2022
 * @Project : my-app
 */
public interface GodRepository extends MongoRepository<GodDto, String> {
}
