package net.eviden.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class CalendariLectPK  implements Serializable {

    private String idAreaLect;

    private String anyCalendari;

    private String mesCalendari;

    private LocalDateTime dataCalendLect;

    private String numLectInsp;

}
