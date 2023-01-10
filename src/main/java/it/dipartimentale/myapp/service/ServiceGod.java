package it.dipartimentale.myapp.service;

import it.dipartimentale.myapp.dto.DepartmentHeadDto;
import it.dipartimentale.myapp.dto.GodDto;
import it.dipartimentale.myapp.dto.TeamLeaderDto;
import it.dipartimentale.myapp.dto.WorkersDto;
import it.dipartimentale.myapp.dto.utils.AssemblySheet;
import it.dipartimentale.myapp.dto.utils.Tools;
import it.dipartimentale.myapp.repository.*;
import it.dipartimentale.myapp.service.commonService.AbstractService;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;


/**
 * @author : Federico Di Maio
 * @date : 15/12/2022
 * @Project : my-app
 */
@Service
public class ServiceGod extends AbstractService<AssemblySheet, WorkersDto, TeamLeaderDto, DepartmentHeadDto, GodDto, Tools> {

    protected DepartementHeadRepository departementHeadRepository;
    protected TeamLeaderRepository teamLeaderRepository;
    protected WorkersRepository workersRepository;
    protected GodRepository godRepository;
    protected AssemblySheetRepository assemblySheetRepository;
    protected ToolsRepository toolsRepository;

    protected ServiceGod(GodRepository godRepository,
                         TeamLeaderRepository teamLeaderRepository,
                         WorkersRepository workersRepository,
                         DepartementHeadRepository departementHeadRepository,
                         AssemblySheetRepository assemblySheetRepository,
                         ToolsRepository toolsRepository) {
        super(assemblySheetRepository,
                godRepository,
                teamLeaderRepository,
                workersRepository,
                departementHeadRepository,
                toolsRepository);
    }

    //ASSEMBLY SHEET
    @Override
    public List<AssemblySheet> createAssemblySheet(AssemblySheet assemblySheet) {
        return Collections.singletonList(assemblySheetRepository.insert(assemblySheet));
    }

    @Override
    public List<AssemblySheet> getAllAssemblySheet() {
        return assemblySheetRepository.findAll();
    }

    @Override
    public Optional<AssemblySheet> getAssemblySheetForId(String Id) {
        return assemblySheetRepository.findById(Id);
    }

    @Override // manca modifica lista data lista tools da verificare in seguito
    public Optional<AssemblySheet> updateAssemblySheet(String Id, AssemblySheet assemblySheet) {
        Optional<AssemblySheet> assemblySheetOptional = assemblySheetRepository.findById(Id);
        assemblySheetOptional.ifPresent(a -> a.setNameAssemblySheet(assemblySheet.getNameAssemblySheet()));
        assemblySheetOptional.ifPresent(a -> a.setNumberAssemblySheet(assemblySheet.getNumberAssemblySheet()));
        assemblySheetOptional.ifPresent(a -> a.setNameWorkerAssigned(assemblySheet.getNameWorkerAssigned()));
        assemblySheetOptional.ifPresent(a -> assemblySheetRepository.save(a));
        return assemblySheetOptional;
    }

    //WORKERS
    @Override
    public List<WorkersDto> createWorkers(WorkersDto workersDto) {
        return Collections.singletonList(workersRepository.insert(workersDto));
    }

    @Override
    public List<WorkersDto> getAllWorkers() {
        return workersRepository.findAll();
    }

    @Override
    public Optional<WorkersDto> getWorkersForId(String Id) {
        return workersRepository.findById(Id);
    }

    @Override // manca modifica sheet
    public Optional<WorkersDto> updateWorkers(String Id, WorkersDto workersDto) {
        Optional<WorkersDto> workersDtoOptional = workersRepository.findById(Id);
        workersDtoOptional.ifPresent(w -> w.setName(workersDto.getName()));
        workersDtoOptional.ifPresent(w -> w.setSurname(workersDto.getSurname()));
        workersDtoOptional.ifPresent(w -> w.setAddress(workersDto.getAddress()));
        workersDtoOptional.ifPresent(w -> w.setNumber(workersDto.getNumber()));
        workersDtoOptional.ifPresent(w -> w.setEmail(workersDto.getEmail()));

        return workersDtoOptional;
    }

    //TEAM LEADER
    @Override
    public List<TeamLeaderDto> createTeamLeader(TeamLeaderDto teamLeaderDto) {
        return Collections.singletonList(teamLeaderRepository.insert(teamLeaderDto));
    }

    @Override
    public List<TeamLeaderDto> getAllTeamLeader() {
        return teamLeaderRepository.findAll();
    }

    @Override
    public Optional<TeamLeaderDto> getTeamLeaderForId(String Id) {
        return teamLeaderRepository.findById(Id);
    }

    @Override // manca modifica workers e sheet
    public Optional<TeamLeaderDto> updateTeamLeader(String Id, TeamLeaderDto teamLeaderDto) {
        Optional<TeamLeaderDto> teamLeaderDtoOptional = teamLeaderRepository.findById(Id);
        teamLeaderDtoOptional.ifPresent(t -> t.setName(teamLeaderDto.getName()));
        teamLeaderDtoOptional.ifPresent(t -> t.setSurname(teamLeaderDto.getSurname()));
        teamLeaderDtoOptional.ifPresent(t -> t.setAddress(teamLeaderDto.getAddress()));
        teamLeaderDtoOptional.ifPresent(t -> t.setNumber(teamLeaderDto.getNumber()));
        teamLeaderDtoOptional.ifPresent(t -> t.setEmail(teamLeaderDto.getEmail()));

        return teamLeaderDtoOptional;
    }

    // DEPARTMENT HEAD
    @Override
    public List<DepartmentHeadDto> createDepartmentHead(DepartmentHeadDto departmentHeadDto) {
        return Collections.singletonList(departementHeadRepository.insert(departmentHeadDto));
    }

    @Override
    public List<DepartmentHeadDto> getDepartmentHead() {
        return departementHeadRepository.findAll();
    }

    @Override
    public Optional<DepartmentHeadDto> getDepartmentHeadForId(String Id) {
        return departementHeadRepository.findById(Id);
    }

    @Override // manca modifica leader, workers, sheet
    public Optional<DepartmentHeadDto> updateDepartmentHead(String Id, DepartmentHeadDto departmentHeadDto) {
        Optional<DepartmentHeadDto> departmentHeadDtoOptional = departementHeadRepository.findById(Id);
        departmentHeadDtoOptional.ifPresent(d -> d.setName(departmentHeadDto.getName()));
        departmentHeadDtoOptional.ifPresent(d -> d.setSurname(departmentHeadDto.getSurname()));
        departmentHeadDtoOptional.ifPresent(d -> d.setAddress(departmentHeadDto.getAddress()));
        departmentHeadDtoOptional.ifPresent(d -> d.setNumber(departmentHeadDto.getNumber()));
        departmentHeadDtoOptional.ifPresent(d -> d.setEmail(departmentHeadDto.getEmail()));

        return departmentHeadDtoOptional;
    }


    //TOOLS
    @Override
    public List<Tools> createTools(Tools tools) {
        return Collections.singletonList(toolsRepository.save(tools));
    }

    @Override
    public List<Tools> getTools() {
        return toolsRepository.findAll();
    }

    @Override
    public Optional<Tools> getToolsById(String Id) {
        return toolsRepository.findById(Id);
    }

    // COMPANY
    @Override
    public List<GodDto> getAllMembersCompany() {
        return godRepository.findAll();
    }


}
