package it.dipartimentale.myapp.dto;

import it.dipartimentale.myapp.dto.utils.AssemblySheet;
import lombok.Builder;
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
@Builder
public class DepartmentHeadDto implements Serializable {
    @Id
    private String id;
    private String name;
    private String surname;
    private String address;
    private String number;
    private String email;
    private List<TeamLeaderDto> teamLeaderDtoList;
    private List<WorkersDto> workersDtoList;
    private List<AssemblySheet> assemblySheetList;
}