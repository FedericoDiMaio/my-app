package it.dipartimentale.myapp.api;

import it.dipartimentale.myapp.dto.DepartmentHeadDto;
import it.dipartimentale.myapp.dto.GodDto;
import it.dipartimentale.myapp.dto.TeamLeaderDto;
import it.dipartimentale.myapp.dto.WorkersDto;
import it.dipartimentale.myapp.dto.utils.AssemblySheet;
import it.dipartimentale.myapp.dto.utils.Tools;
import it.dipartimentale.myapp.service.ServiceGod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

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

    @RequestMapping(value = "/getTeamLeaderById/{id}", method = RequestMethod.GET)
    public Optional<TeamLeaderDto> getTeamLeaderById(@PathVariable("id") String id) {
        return serviceGod.getTeamLeaderForId(id);
    }

    @RequestMapping(value = "updateTeamLeader/{id}", method = RequestMethod.PUT)
    public Optional<TeamLeaderDto> updateTeamLeaderById(@PathVariable("id") String id, @RequestBody TeamLeaderDto teamLeaderDto) {
        return serviceGod.updateTeamLeader(id, teamLeaderDto);
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

    @RequestMapping(value = "/getWorkersById/{id}", method = RequestMethod.GET)
    public Optional<WorkersDto> getWorkersById(@PathVariable("id") String id) {
        return serviceGod.getWorkersForId(id);
    }

    @RequestMapping(value = "/updateWorkers/{id}", method = RequestMethod.PUT)
    public Optional<WorkersDto> updateWorkers(@PathVariable("id") String id, @RequestBody WorkersDto workersDto) {
        return serviceGod.updateWorkers(id, workersDto);
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

    @RequestMapping(value = "/getAssemblySheetById/{id}", method = RequestMethod.GET)
    public Optional<AssemblySheet> getAssemblySheetById(@PathVariable("id") String id) {
        return serviceGod.getAssemblySheetForId(id);
    }

    @RequestMapping(value = "/updateAssemblySheet/{id}", method = RequestMethod.PUT)
    public Optional<AssemblySheet> updateAssemblySheet(@PathVariable("id") String id, @RequestBody AssemblySheet assemblySheet) {
        return serviceGod.updateAssemblySheet(id, assemblySheet);
    }

    //DEPARTMENT HEAD API
    @RequestMapping(value = "/createDepartmentHead", method = RequestMethod.POST)
    public List<DepartmentHeadDto> createDepartmentHead(@RequestBody DepartmentHeadDto departmentHeadDto) {
        return serviceGod.createDepartmentHead(departmentHeadDto);
    }

    @RequestMapping(value = "/getAllDepartementHead", method = RequestMethod.GET)
    public List<DepartmentHeadDto> getAllDepartmentHead() {
        return serviceGod.getDepartmentHead();
    }

    @RequestMapping(value = "/getDepartmentHeadById/{id}", method = RequestMethod.GET)
    public Optional<DepartmentHeadDto> getDepartmentHeadById(@PathVariable("id") String id) {
        return serviceGod.getDepartmentHeadForId(id);
    }

    @RequestMapping(value = "/updateDepartmentHead/{id}", method = RequestMethod.PUT)
    public Optional<DepartmentHeadDto> updateDepartmentHead(@PathVariable("id") String id, DepartmentHeadDto departmentHeadDto) {
        return serviceGod.updateDepartmentHead(id, departmentHeadDto);
    }

    //TOOLS API
    @RequestMapping(value = "/createTools", method = RequestMethod.POST)
    public List<Tools> createTools(@RequestBody Tools tools) {
        return serviceGod.createTools(tools);
    }

    @RequestMapping(value = "/getAllTools", method = RequestMethod.GET)
    public List<Tools> getAllTools() {
        return serviceGod.getTools();
    }

    @RequestMapping(value = "/getToolsById", method = RequestMethod.GET)
    public Optional<Tools> getToolsById(@PathVariable("Id") String id) {
        return serviceGod.getToolsById(id);
    }

}
