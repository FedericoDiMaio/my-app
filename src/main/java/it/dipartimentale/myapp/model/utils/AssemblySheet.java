package it.dipartimentale.myapp.model.utils;

import lombok.Data;

import java.io.Serializable;
import java.util.List;


@Data
public class AssemblySheet implements Serializable {
    @org.springframework.data.annotation.Id
    private String Id;

    private String nameAssemblySheet;
    private String numberAssemblySheet;
    private String nameWorkerAssigned;
    private List<Tools> toolsList;
    private List<Date> dataList;

}
