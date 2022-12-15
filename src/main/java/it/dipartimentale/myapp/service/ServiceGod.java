package it.dipartimentale.myapp.service;

import it.dipartimentale.myapp.dto.GodDto;
import it.dipartimentale.myapp.repository.GodRepository;
import it.dipartimentale.myapp.service.common.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : Federico Di Maio
 * @date : 15/12/2022
 * @Project : my-app
 */
@Service
public class ServiceGod extends AbstractService {
    @Autowired
    private GodRepository godRepository;

    @Override
    public GodDto createCompany() {
        return null;
    }

    @Override
    public List<GodRepository> getAllMembersCompany() {
        return null;
    }

    @Override
    public List<GodRepository> getAllWorkers() {
        return null;
    }

    @Override
    public List<GodRepository> getAllTeamLeader() {
        return null;
    }

    @Override
    public List<GodRepository> getAllDepartmentHead() {
        return null;
    }
}
