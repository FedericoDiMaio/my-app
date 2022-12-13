package it.dipartimentale.myapp.service;

import it.dipartimentale.myapp.model.TeamLeader;
import it.dipartimentale.myapp.service.common.AbstractCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

@Service
public class TeamLeaderService extends AbstractCrudService<TeamLeader> {

    @Autowired
    protected TeamLeaderService(MongoRepository<TeamLeader, String> repository) {
        super(repository);
    }

    public void delete(String id) {
        super.delete(id);
    }
}
