package it.dipartimentale.myapp.service;

import it.dipartimentale.myapp.model.DepartmentHead;
import it.dipartimentale.myapp.model.utils.AssemblySheet;
import it.dipartimentale.myapp.service.common.AbstractCrudService;
import org.aspectj.apache.bcel.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

/**
 * @author : Federico Di Maio
 * @date : 13/12/2022
 * @Project : my-app
 */
@Service
public class DepartmentHeadService extends AbstractCrudService<DepartmentHead> {


    protected DepartmentHeadService(MongoRepository<DepartmentHead, String> repository) {
        super(repository);
    }

    public AssemblySheet insert() {                         //crea scheda di lavoro
        return new AssemblySheet();
    }
}
