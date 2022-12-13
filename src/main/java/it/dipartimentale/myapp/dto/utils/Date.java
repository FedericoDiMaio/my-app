package it.dipartimentale.myapp.dto.utils;

import lombok.Data;

import java.io.Serializable;

/**
 * @author : Federico Di Maio
 * @date : 13/12/2022
 * @Project : my-app
 */
@Data
public class Date implements Serializable {

    private Long day; // es.1 = monday...
    private String startWork;
    private String finishWork;
    private String timesForWork;
}
