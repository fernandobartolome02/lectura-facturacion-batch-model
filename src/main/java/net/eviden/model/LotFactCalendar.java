package net.eviden.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity(name = "LOT_FACT_CALEND")
@Getter
@Setter
public class LotFactCalendar {

    @Id
    @Column(name = "ID_LOT_FACT")
    String idLotFact;

    @Column(name = "ANY_CALENDARI")
    String anyCalendari;

    @Column(name = "MES_CALENDARI")
    String mesCalendari;

    @Column(name = "DATA_FACT_LOT_CAL")
    Date dataFactLotCal;
}
