package it.dipartimentale.myapp.dto;

import it.dipartimentale.myapp.dto.utils.AssemblySheet;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author : Federico Di Maio
 * @date : 15/12/2022
 * @Project : my-app
 */
@Data
public class GodDto implements Serializable {
    private List<DepartmentHeadDto> departmentHeadList;
    private List<TeamLeaderDto> teamLeaderDtoList;
    private List<WorkersDto> workersDtoList;
    private List<AssemblySheet> assemblySheetList;
}
