package it.dipartimentale.myapp.api;

import it.dipartimentale.myapp.dto.DepartmentHeadDto;
import it.dipartimentale.myapp.dto.GodDto;
import it.dipartimentale.myapp.dto.TeamLeaderDto;
import it.dipartimentale.myapp.dto.WorkersDto;
import it.dipartimentale.myapp.dto.utils.AssemblySheet;
import it.dipartimentale.myapp.service.ServiceGod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

/**
 * @author : Federico Di Maio
 * @date : 15/12/2022
 * @Project : my-app
 */
@CrossOrigin
@RestController
@RequestMapping("api/god")
public class GodApi {

    protected final ServiceGod serviceGod;


    @Autowired
    public GodApi(ServiceGod serviceGod) {
        this.serviceGod = serviceGod;

    }

    //COMPANY
    @RequestMapping(value = "/getAllMembers", method = RequestMethod.GET)
    public List<GodDto> getAllMembersCompany() {
        return serviceGod.getAllMembersCompany();
    }

    //TEAM LEADER API
    @RequestMapping(value = "/createTeamLeader", method = RequestMethod.POST)
    public List<TeamLeaderDto> createTeamLeader(@RequestBody TeamLeaderDto teamLeaderDto) {
        return serviceGod.createTeamLeader(teamLeaderDto);
    }

    @RequestMapping(value = "/getAllTeamLeader", method = RequestMethod.GET)
    public List<TeamLeaderDto> getAllTeamLeader() {
        return serviceGod.getAllTeamLeader();
    }

    //WORKERS API
    @RequestMapping(value = "/createWorkers", method = RequestMethod.POST)
    public List<WorkersDto> createWorkers(@RequestBody WorkersDto workersDto) {
        return serviceGod.createWorkers(workersDto);
    }

    @RequestMapping(value = "/getAllWorkers", method = RequestMethod.GET)
    public List<WorkersDto> getAllWorkers() {
        return serviceGod.getAllWorkers();
    }

    //ASSEMBLY SHEET API
    @RequestMapping(value = "/createAssemblySheet", method = RequestMethod.POST)
    public List<AssemblySheet> createAssemblySheet(@RequestBody AssemblySheet assemblySheet) {
        return serviceGod.createAssemblySheet(assemblySheet);
    }

    @RequestMapping(value = "/getAllAssemblySheet", method = RequestMethod.GET)
    public List<AssemblySheet> getAllAssemblySheet() {
        return serviceGod.getAllAssemblySheet();
    }

    //DEPARTMENT HEAD API
    @RequestMapping(value = "/createDepartmentHead", method = RequestMethod.POST)
    public List<DepartmentHeadDto> createDepartmentHead(@RequestBody DepartmentHeadDto departmentHeadDto) {
        return serviceGod.createDepartementHead(departmentHeadDto);
    }

    @RequestMapping(value = "/getAllDepartementHead", method = RequestMethod.GET)
    public List<DepartmentHeadDto> getAllDepartmentHead() {
        return serviceGod.getDepartmentHead();
    }
}
