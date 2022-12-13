package it.dipartimentale.myapp.model.pojo;

import lombok.Data;

/**
 * @author : Federico Di Maio
 * @date : 13/12/2022
 * @Project : my-app
 */
@Data
public abstract class CrudPojoAb<Dto> {
    protected CrudPojo crudPojo;

    public abstract Dto toDto();

}
