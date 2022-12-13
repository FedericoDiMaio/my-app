package it.dipartimentale.myapp.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author : Federico Di Maio
 * @date : 13/12/2022
 * @Project : my-app
 */
@Data
public class DepartmentHead implements Serializable {

    private String name = "nameDepartmentHead";
    private String surname = "surnameDepartmentHead";
    private String address = "addressDepartmentHead";
    private String number = "numberDepartmentHead";
    private String email = "emailDepartmentHead";
}