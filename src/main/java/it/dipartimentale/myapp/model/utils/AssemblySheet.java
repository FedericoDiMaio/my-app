package it.dipartimentale.myapp.model.utils;

import lombok.Data;

import java.util.List;


@Data
public class AssemblySheet {
    @org.springframework.data.annotation.Id
    private long Id;

    private String nameAssemblySheet;
    private String numberAssemblySheet;
    private String nameWorker;
    private List<Tools> toolsList;
    private List<Date> dataList;

}
