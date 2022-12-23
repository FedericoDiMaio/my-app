package it.dipartimentale.myapp.repository;

import it.dipartimentale.myapp.dto.WorkersDto;
import it.dipartimentale.myapp.repository.commonRepository.IRepository;
import org.springframework.stereotype.Repository;


/**
 * @author : Federico Di Maio
 * @date : 22/12/2022
 * @Project : tesi
 */
@Repository
public interface WorkersRepository extends IRepository<WorkersDto, String> {
}
