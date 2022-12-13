package it.dipartimentale.myapp.service;

import it.dipartimentale.myapp.model.TeamLeader;
import it.dipartimentale.myapp.service.common.AbstractCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

/**
 * @author : Federico Di Maio
 * @date : 13/12/2022
 * @Project : my-app
 */
@Service
public class TeamLeaderService extends AbstractCrudService<TeamLeader> {

    @Autowired
    protected TeamLeaderService(MongoRepository<TeamLeader, String> repository) {
        super(repository);
    }

    public void deleteById(String id) {
        super.deleteById(id);
    }
}
