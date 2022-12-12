package it.dipartimentale.myapp.model;


import it.dipartimentale.myapp.model.utils.AssemblySheet;
import lombok.Data;

import java.util.List;

@Data
public class Workers {
    @org.springframework.data.annotation.Id
    private long Id;

    private String name;
    private String surname;
    private String address;
    private String number;
    private String email;
    private List<AssemblySheet> assemblySheetList;
}
