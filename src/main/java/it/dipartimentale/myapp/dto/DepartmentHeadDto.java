package it.dipartimentale.myapp.dto;

import it.dipartimentale.myapp.dto.utils.AssemblySheet;
import it.dipartimentale.myapp.model.pojo.CrudPojoAb;
import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @author : Federico Di Maio
 * @date : 13/12/2022
 * @Project : my-app
 */
@Data
@Builder
public class DepartmentHeadDto {

    private CrudPojoDto crudPojoDto;

    private String id;
    private String name;
    private String surname;
    private String address;
    private String number;
    private String email;
    private List<TeamLeader> teamLeaderList;
    private List<Workers> workersList;
    private List<AssemblySheet> assemblySheetList;
}