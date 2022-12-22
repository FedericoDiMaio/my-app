package it.dipartimentale.myapp.service;

import it.dipartimentale.myapp.dto.DepartmentHeadDto;
import it.dipartimentale.myapp.dto.GodDto;
import it.dipartimentale.myapp.dto.TeamLeaderDto;
import it.dipartimentale.myapp.dto.WorkersDto;
import it.dipartimentale.myapp.dto.utils.AssemblySheet;
import it.dipartimentale.myapp.repository.*;
import it.dipartimentale.myapp.service.commonService.AbstractService;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;


/**
 * @author : Federico Di Maio
 * @date : 15/12/2022
 * @Project : my-app
 */
@Service
public class ServiceGod extends AbstractService<AssemblySheet, WorkersDto, TeamLeaderDto, DepartmentHeadDto, GodDto> {

    protected DepartementHeadRepository departementHeadRepository;
    protected TeamLeaderRepository teamLeaderRepository;
    protected WorkersRepository workersRepository;
    protected GodRepository godRepository;
    protected AssemblySheetRepository assemblySheetRepository;

    protected ServiceGod(GodRepository godRepository,
                         TeamLeaderRepository teamLeaderRepository,
                         WorkersRepository workersRepository,
                         DepartementHeadRepository departementHeadRepository,
                         AssemblySheetRepository assemblySheetRepository) {
        super(assemblySheetRepository, godRepository, teamLeaderRepository, workersRepository, departementHeadRepository);
    }

    @Override
    public List<AssemblySheet> createAssemblySheet(AssemblySheet assemblySheet) {
        return Collections.singletonList(assemblySheetRepository.insert(assemblySheet));
    }

    @Override
    public List<AssemblySheet> getAllAssemblySheet() {
        return assemblySheetRepository.findAll();
    }

    @Override
    public List<WorkersDto> createWorkers(WorkersDto workersDto) {
        return Collections.singletonList(workersRepository.insert(workersDto));
    }

    @Override
    public List<WorkersDto> getAllWorkers() {
        return workersRepository.findAll();
    }

    @Override
    public List<TeamLeaderDto> createTeamLeader(TeamLeaderDto teamLeaderDto) {
        return Collections.singletonList(teamLeaderRepository.insert(teamLeaderDto));
    }

    @Override
    public List<TeamLeaderDto> getAllTeamLeader() {
        return teamLeaderRepository.findAll();
    }

    @Override
    public List<DepartmentHeadDto> createDepartementHead(DepartmentHeadDto departmentHeadDto) {
        return Collections.singletonList(departementHeadRepository.insert(departmentHeadDto));
    }

    @Override
    public List<DepartmentHeadDto> getDepartmentHead() {
        return departementHeadRepository.findAll();
    }

    @Override
    public List<GodDto> getAllMembersCompany() {
        return godRepository.findAll();
    }
}
