package it.dipartimentale.myapp.dto;

import it.dipartimentale.myapp.dto.utils.AssemblySheet;
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
public class TeamLeader implements Serializable {
    @Id
    private String Id;

    private String name;
    private String surname;
    private String address;
    private String number;
    private String email;
    private List<Workers> WorkersSet;
    private List<AssemblySheet> assemblySheetList;

}
