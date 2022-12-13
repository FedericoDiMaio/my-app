package it.dipartimentale.myapp.model.utils;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

/**
 * @author : Federico Di Maio
 * @date : 13/12/2022
 * @Project : my-app
 */
@Data
public class Tools implements Serializable {
    @Id
    private String id;

    private String nameTools;

}
