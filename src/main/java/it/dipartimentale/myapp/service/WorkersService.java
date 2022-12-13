package it.dipartimentale.myapp.service;

import it.dipartimentale.myapp.model.Workers;
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
public class WorkersService extends AbstractCrudService<Workers> {

    @Autowired
    protected WorkersService(MongoRepository<Workers, String> repository) {
        super(repository);
    }



}
