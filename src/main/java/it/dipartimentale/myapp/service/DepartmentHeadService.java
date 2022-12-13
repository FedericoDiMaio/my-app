package it.dipartimentale.myapp.service;


import it.dipartimentale.myapp.dto.DepartmentHeadDto;
import it.dipartimentale.myapp.model.DepartmentHeadEntity;
import it.dipartimentale.myapp.repository.RepositoryDepartmentHead;
import it.dipartimentale.myapp.service.common.AbstractCrudService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : Federico Di Maio
 * @date : 13/12/2022
 * @Project : my-app
 */
@Service
public class DepartmentHeadService extends AbstractCrudService <DepartmentHeadEntity, RepositoryDepartmentHead> {


    public DepartmentHeadService(RepositoryDepartmentHead repositoryDepartmentHead){
        super(repositoryDepartmentHead);
    }


    @Override
    public DepartmentHeadEntity findByIdAndUsername(String id, String username) {
        return null;
    }

    @Override
    public List<DepartmentHeadEntity> findByUsername(String username) {
        return null;
    }

    @Override
    public List<DepartmentHeadEntity> find() {
        return null;
    }

    @Override
    public DepartmentHeadEntity update(DepartmentHeadEntity entity) {
        return null;
    }

    @Override
    public void deleteById(String id) {

    }

    @Override
    public void delete(DepartmentHeadEntity entity) {

    }
}
