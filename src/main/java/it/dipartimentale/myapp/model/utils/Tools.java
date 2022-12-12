package it.dipartimentale.myapp.model.utils;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Tools {
    @Id
    private long id;

    private String nameTools;

}
