package it.dipartimentale.myapp.dto;

import it.dipartimentale.myapp.dto.utils.AssemblySheet;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.List;

/**
 * @author : Federico Di Maio
 * @date : 15/12/2022
 * @Project : my-app
 */
@Data
@Document("company")
public class GodDto implements Serializable {
    public List<DepartmentHeadDto> departmentHeadList;
    public List<TeamLeaderDto> teamLeaderDtoList;
    public List<WorkersDto> workersDtoList;
    public List<AssemblySheet> assemblySheetList;
}
