package it.dipartimentale.myapp.service;

import it.dipartimentale.myapp.dto.GodDto;
import it.dipartimentale.myapp.repository.GodRepository;
import it.dipartimentale.myapp.service.common.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * @author : Federico Di Maio
 * @date : 15/12/2022
 * @Project : my-app
 */
@Service
public class ServiceGod extends AbstractService {
    @Autowired
    public ServiceGod(GodRepository godRepository) {
        super(godRepository);
    }
    @Override
    public List<GodDto> createCompany(GodDto godDto){
        return Collections.singletonList(godRepository.insert(godDto));
    }

    @Override
    public List<List<GodDto>> getAllMembersCompany() {
        return Collections.singletonList(godRepository.findAll());
    }

    @Override
    public List<List<GodDto>> getAllWorkers() {
        return Collections.singletonList(godRepository.findAll());
    }

    @Override
    public List<List<GodDto>> getAllTeamLeader() {
        return Collections.singletonList(godRepository.findAll());
    }

    @Override
    public List<List<GodDto>> getAllDepartmentHead() {
        return Collections.singletonList(godRepository.findAll());
    }
}
