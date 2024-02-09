package net.eviden.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CalendariLectAlertsDto {

    private String idAreaLect;

    private String anyCalendari;

    private String mesCalendari;

    private String tipusLect;

    private String idLotLect;

    private Integer num;

}
