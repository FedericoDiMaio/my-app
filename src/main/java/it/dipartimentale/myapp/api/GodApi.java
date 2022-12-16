package it.dipartimentale.myapp.api;

import it.dipartimentale.myapp.dto.GodDto;
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
        return serviceGod.createCompany();
    }

    @RequestMapping(value = "/receiveAllMembers", method = RequestMethod.GET)
    public List<GodDto> getAllMembersCompany() {
        return serviceGod.getAllMembersCompany();
    }

    @RequestMapping(value = "/getallTeamLeader", method = RequestMethod.GET)
    public List<GodDto> getAllTeamLeader() {
        return serviceGod.getAllTeamLeader();
    }

    @RequestMapping(value = "/getAllWorkers", method = RequestMethod.GET)
    public List<GodDto> getAllWorkers() {
        return serviceGod.getAllWorkers();
    }

    @RequestMapping(value = "/getAllAssemblySheet", method = RequestMethod.GET)
    public List<GodDto> getAllAssemblySheet() {
        return serviceGod.getAllAssemblySheet();
    }
}