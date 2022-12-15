package it.dipartimentale.myapp.service.common;

import it.dipartimentale.myapp.dto.GodDto;
import it.dipartimentale.myapp.repository.GodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author : Federico Di Maio
 * @date : 15/12/2022
 * @Project : my-app
 */

public abstract class AbstractService<T> {
    public abstract T createCompany();
    public abstract List<T> getAllMembersCompany();
    public abstract List<T> getAllWorkers();
    public abstract List<T> getAllTeamLeader();
    public abstract List<T> getAllDepartmentHead();




}
