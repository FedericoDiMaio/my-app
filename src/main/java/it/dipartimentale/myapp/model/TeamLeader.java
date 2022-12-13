package it.dipartimentale.myapp.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.List;


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


}
