package it.dipartimentale.myapp.repository;


import it.dipartimentale.myapp.dto.GodDto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author : Federico Di Maio
 * @date : 15/12/2022
 * @Project : my-app
 */
@Repository
public interface GodRepository extends MongoRepository<GodDto, String> {
    List save();
}
