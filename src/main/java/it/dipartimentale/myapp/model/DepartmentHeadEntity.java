package it.dipartimentale.myapp.model;

import it.dipartimentale.myapp.dto.DepartmentHeadDto;
import it.dipartimentale.myapp.dto.TeamLeader;
import it.dipartimentale.myapp.dto.Workers;
import it.dipartimentale.myapp.dto.utils.AssemblySheet;
import it.dipartimentale.myapp.model.pojo.CrudPojoAb;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.List;

/**
 * @author : Federico Di Maio
 * @date : 13/12/2022
 * @Project : my-app
 */
@Data

public class DepartmentHeadEntity extends CrudPojoAb<DepartmentHeadDto> implements Serializable {
    @Id
    private String id;
    private String name;
    private String surname;
    private String address;
    private String number;
    private String email;
    private List<TeamLeader> teamLeaderList;
    private List<Workers> workersList;
    private List<AssemblySheet> assemblySheetList;

    @Override
    public DepartmentHeadDto toDto() {
        return DepartmentHeadDto.builder()
                .crudPojoDto(this.getCrudPojo().toDto())
                .id(this.getId())
                .name(this.getName())
                .surname(this.getSurname())
                .address(this.getAddress())
                .number(this.getNumber())
                .email(this.getEmail())
                .teamLeaderList(this.getTeamLeaderList())
                .workersList(this.getWorkersList())
                .assemblySheetList(this.getAssemblySheetList())
                .build();


    }
}
