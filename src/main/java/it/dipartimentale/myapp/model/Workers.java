package it.dipartimentale.myapp.model;


import it.dipartimentale.myapp.model.utils.AssemblySheet;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Workers implements Serializable {
    @org.springframework.data.annotation.Id
    private String Id;

    private String name;
    private String surname;
    private String address;
    private String number;
    private String email;
    private List<AssemblySheet> assemblySheetList;
}
