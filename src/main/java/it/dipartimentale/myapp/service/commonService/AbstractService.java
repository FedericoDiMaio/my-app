package it.dipartimentale.myapp.service.commonService;

import it.dipartimentale.myapp.dto.DepartmentHeadDto;
import it.dipartimentale.myapp.dto.TeamLeaderDto;
import it.dipartimentale.myapp.dto.WorkersDto;
import it.dipartimentale.myapp.dto.utils.AssemblySheet;
import it.dipartimentale.myapp.repository.*;


import java.util.List;
import java.util.Optional;


/**
 * @author : Federico Di Maio
 * @date : 15/12/2022
 * @Project : my-app
 */

public abstract class AbstractService<T0, T1, T2, T3, T4> {
    protected final AssemblySheetRepository assemblySheetRepository;
    protected final GodRepository godRepository;
    protected final TeamLeaderRepository teamLeaderRepository;
    protected final WorkersRepository workersRepository;
    protected final DepartementHeadRepository departementHeadRepository;


    //T0= Assembly Sheet
    //T1= Workers
    //T2= TeamLeader
    //T3= Department Head
    //T4= GodDto

    protected AbstractService(AssemblySheetRepository assemblySheetRepository,
                              GodRepository godRepository,
                              TeamLeaderRepository teamLeaderRepository,
                              WorkersRepository workersRepository,
                              DepartementHeadRepository departementHeadRepository) {
        this.assemblySheetRepository = assemblySheetRepository;
        this.godRepository = godRepository;
        this.teamLeaderRepository = teamLeaderRepository;
        this.workersRepository = workersRepository;
        this.departementHeadRepository = departementHeadRepository;
    }

    public abstract List<T0> createAssemblySheet(AssemblySheet assemblySheet);

    public abstract List<T0> getAllAssemblySheet();

    public abstract Optional<T0> getAssemblySheetForId(String Id);

    public abstract Optional<T0> updateAssemblySheet(String Id, AssemblySheet assemblySheet);

    public abstract List<T1> createWorkers(WorkersDto workersDto);

    public abstract List<T1> getAllWorkers();

    public abstract Optional<T1> getWorkersForID(String Id);

    public abstract Optional<T1> updateWorkers(String Id, WorkersDto workersDto);

    public abstract List<T2> createTeamLeader(TeamLeaderDto teamLeaderDto);

    public abstract List<T2> getAllTeamLeader();

    public abstract Optional<T2> getTeamLeaderForId(String Id);

    public abstract Optional<T2> updateTeamLeader(String Id, TeamLeaderDto teamLeaderDto);

    public abstract List<T3> createDepartementHead(DepartmentHeadDto departmentHeadDto);

    public abstract List<T3> getDepartmentHead();

    public abstract Optional<T3> getDepartmentHeadForId(String Id);

    public abstract Optional<T3> updateDepartmentHead(String Id, DepartmentHeadDto departmentHeadDto);

    public abstract List<T4> getAllMembersCompany();


}
