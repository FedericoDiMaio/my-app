package it.dipartimentale.myapp.api;

import it.dipartimentale.myapp.dto.DepartmentHeadDto;
import it.dipartimentale.myapp.dto.GodDto;
import it.dipartimentale.myapp.dto.TeamLeaderDto;
import it.dipartimentale.myapp.dto.WorkersDto;
import it.dipartimentale.myapp.dto.utils.AssemblySheet;
import it.dipartimentale.myapp.service.ServiceGod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping(value = "/createCompany", method = RequestMethod.POST)
    public List<GodDto> createCompany() {
        return null;
    }

    @RequestMapping(value = "/getAllMembers", method = RequestMethod.GET)
    public List<GodDto> getAllMembersCompany() {
        return serviceGod.getAllMembersCompany();
    }

    @RequestMapping(value = "/getAllTeamLeader", method = RequestMethod.GET)
    public List<TeamLeaderDto> getAllTeamLeader() {
        return serviceGod.getAllTeamLeader();
    }

    @RequestMapping(value = "/getAllWorkers", method = RequestMethod.GET)
    public List<WorkersDto> getAllWorkers() {
        return serviceGod.getAllWorkers();
    }

    @RequestMapping(value = "/getAllAssemblySheet", method = RequestMethod.GET)
    public List<AssemblySheet> getAllAssemblySheet() {
        return serviceGod.getAllAssemblySheet();
    }

    @RequestMapping(value = "/getAllDepartementHead", method = RequestMethod.GET)
    public List<DepartmentHeadDto> getAllDepartmentHead() {
        return serviceGod.getDepartmentHead();
    }
}
