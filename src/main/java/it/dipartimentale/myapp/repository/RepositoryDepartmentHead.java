package it.dipartimentale.myapp.repository;

import it.dipartimentale.myapp.dto.DepartmentHeadDto;
import it.dipartimentale.myapp.model.DepartmentHeadEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author : Federico Di Maio
 * @date : 13/12/2022
 * @Project : my-app
 */

public interface RepositoryDepartmentHead extends MongoRepository<DepartmentHeadDto, String>, IRepository<DepartmentHeadEntity, String> {
}
