package it.dipartimentale.myapp.dto.utils;

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
public class AssemblySheet implements Serializable {
    @Id
    private String Id;

    private String nameAssemblySheet;
    private String numberAssemblySheet;
    private String nameWorkerAssigned;
    private List<Tools> toolsList;
    private List<Date> dataList;

}
