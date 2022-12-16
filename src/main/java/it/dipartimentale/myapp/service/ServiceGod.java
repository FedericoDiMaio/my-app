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
public class ServiceGod extends AbstractService<GodDto> {

    @Autowired
    public ServiceGod(GodRepository godRepository) {
        super(godRepository);
    }

    @Override
    public List<GodDto> createCompany(GodDto dto) {
        return Collections.singletonList(godRepository.save(dto));
    }

    @Override
    public List<GodDto> getAllMembersCompany() {                                  // ok
        return godRepository.findAll();
    }
    @Override
    public List<GodDto> getAllTeamLeader() {
        return null;
    }

    @Override
    public List<GodDto> getAllWorkers() {
        return null;
    }


}
