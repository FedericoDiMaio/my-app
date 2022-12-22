package it.dipartimentale.myapp.repository;

import it.dipartimentale.myapp.dto.DepartmentHeadDto;
import it.dipartimentale.myapp.dto.GodDto;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author : Federico Di Maio
 * @date : 22/12/2022
 * @Project : tesi
 */
public interface DepartementHeadRepository  extends MongoRepository<DepartmentHeadDto, String> {
}
