package it.dipartimentale.myapp.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

/**
 * @author : Federico Di Maio
 * {@code @date} : 13/12/2022
 * @Project : my-app
 */
@Data
@Builder
public class TrackingDto {

    private String createdBy;
    private Date createdOn;
    private String lastEditedBy;
    private Date lastEditedOn;
    private boolean deleted;
    private String deletedBy;
    private Date deletedOn;
}
