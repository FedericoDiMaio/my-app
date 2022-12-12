package it.dipartimentale.myapp.model.utils;

import lombok.Data;

@Data
public class Date {
    private Long day; // es.1 = monday...
    private String startWork;
    private String finishWork;
    private String timesForWork;
}
