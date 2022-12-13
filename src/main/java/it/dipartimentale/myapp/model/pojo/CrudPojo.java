package it.dipartimentale.myapp.model.pojo;

import it.dipartimentale.myapp.dto.CrudPojoDto;
import lombok.Data;

import java.util.Date;

/**
 * @author : Federico Di Maio
 * @date : 13/12/2022
 * @Project : my-app
 */
@Data
public class CrudPojo  {
    private String createdBy;
    private Date createdOn;
    private String lastEditedBy;
    private Date lastEditedOn;
    private boolean deleted;
    private String deletedBy;
    private Date deletedOn;

    public CrudPojoDto toDto(){
        return CrudPojoDto.builder()
                .createdBy(createdBy)
                .createdOn(createdOn)
                .lastEditedBy(lastEditedBy)
                .lastEditedOn(lastEditedOn)
                .deleted(deleted)
                .deletedBy(deletedBy)
                .deletedOn(deletedOn)
                .build();
    }
}
