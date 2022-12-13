package it.dipartimentale.myapp.model.utils;

import lombok.Data;

import java.io.Serializable;

@Data
public class Date implements Serializable {

    private Long day; // es.1 = monday...
    private String startWork;
    private String finishWork;
    private String timesForWork;
}
