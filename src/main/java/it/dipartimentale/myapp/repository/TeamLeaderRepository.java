package it.dipartimentale.myapp.repository;

import it.dipartimentale.myapp.dto.TeamLeaderDto;
import it.dipartimentale.myapp.repository.commonRepository.IRepository;
import org.springframework.stereotype.Repository;


/**
 * @author : Federico Di Maio
 * @date : 22/12/2022
 * @Project : tesi
 */
@Repository
public interface TeamLeaderRepository  extends IRepository<TeamLeaderDto, String> {
}
