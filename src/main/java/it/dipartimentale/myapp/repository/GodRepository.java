package it.dipartimentale.myapp.repository;


import it.dipartimentale.myapp.dto.GodDto;

import it.dipartimentale.myapp.repository.commonRepository.IRepository;
import org.springframework.stereotype.Repository;


/**
 * @author : Federico Di Maio
 * @date : 15/12/2022
 * @Project : my-app
 */
@Repository
public interface GodRepository extends IRepository<GodDto, String> {

}
