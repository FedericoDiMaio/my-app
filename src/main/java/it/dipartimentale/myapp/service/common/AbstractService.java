package it.dipartimentale.myapp.service.common;

import it.dipartimentale.myapp.dto.GodDto;
import it.dipartimentale.myapp.dto.WorkersDto;
import it.dipartimentale.myapp.repository.GodRepository;


import java.util.List;


/**
 * @author : Federico Di Maio
 * @date : 15/12/2022
 * @Project : my-app
 */

public abstract class AbstractService<T> {

    protected final GodRepository godRepository;

    protected AbstractService(GodRepository godRepository) {
        this.godRepository = godRepository;
    }

    public abstract List<T> getAllMembersCompany();

    public abstract List<T> createCompany();

    public abstract List<T> getAllWorkers();

    public abstract List<T> getAllTeamLeader();

    //??
    public abstract List<GodDto> createCompany(GodDto godDto);
}
