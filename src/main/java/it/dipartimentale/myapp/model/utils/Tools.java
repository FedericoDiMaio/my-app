package it.dipartimentale.myapp.model.utils;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@Data
public class Tools implements Serializable {
    @Id
    private String id;

    private String nameTools;

}
