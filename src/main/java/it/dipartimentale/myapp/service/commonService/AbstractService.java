package it.dipartimentale.myapp.service.commonService;

import it.dipartimentale.myapp.dto.DepartmentHeadDto;
import it.dipartimentale.myapp.dto.TeamLeaderDto;
import it.dipartimentale.myapp.dto.WorkersDto;
import it.dipartimentale.myapp.dto.utils.AssemblySheet;
import it.dipartimentale.myapp.repository.*;


import java.util.List;


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

    public abstract List<T1> createWorkers(WorkersDto workersDto);
    public abstract List<T1> getAllWorkers();

    public abstract List<T2> createTeamLeader(TeamLeaderDto teamLeaderDto);
    public abstract List<T2> getAllTeamLeader();

    public abstract List<T3> createDepartementHead(DepartmentHeadDto departmentHeadDto);
    public abstract List<T3> getDepartmentHead();

    public abstract List<T4> getAllMembersCompany();


}
