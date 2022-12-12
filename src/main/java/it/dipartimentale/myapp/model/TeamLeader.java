package it.dipartimentale.myapp.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.List;


@Data
public class TeamLeader {
    @Id
    private long Id;

    private String name;
    private String surname;
    private String address;
    private String number;
    private String email;
    private List<Workers> WorkersSet;


}
