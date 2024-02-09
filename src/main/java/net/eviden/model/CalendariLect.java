package net.eviden.model;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Accessors(chain = true)
@IdClass(CalendariLectPK.class)
@Table(name = "CALENDARI_LECT")
public class CalendariLect {

    @Id
    @Column(name = "ID_AREA_LECT", nullable = false)
    private String idAreaLect;

    @Id
    @Column(name = "ANY_CALENDARI", nullable = false)
    private String anyCalendari;

    @Id
    @Column(name = "MES_CALENDARI", nullable = false)
    private String mesCalendari;

    @Id
    @Column(name = "DATA_CALEND_LECT", nullable = false)
    private LocalDateTime dataCalendLect;

    @Id
    @Column(name = "NUM_LECT_INSP", nullable = false)
    private String numLectInsp;

    @Column(name = "SIT_LECT_DATA")
    private String sitLectData;

    @Column(name = "ID_LOT_LECT")
    private String idLotLect;

    @Column(name = "TORN_PREV_CAL_LEC")
    private Integer tornPrevCalLec;

    @Column(name = "TIPUS_AS_CAL_LEC")
    private String tipusAsCalLec;

    @Column(name = "TIP_TORN_CAL_LEC")
    private String tipTornCalLec;

    @Column(name = "LIM_INICIAL_TORN")
    private String limInicialTorn;

    @Column(name = "LIM_FINAL_TORN")
    private String limFinalTorn;

    @Column(name = "TIPUS_LECT")
    private String tipusLect;

    @Column(name = "ID_DEST_BAIXA")
    private String idDestBaixa;

    @Column(name = "ID_DEST_NO_CONTTR")
    private String idDestNoConttr;

    @Column(name = "ID_LECT_MAN_TELE")
    private String idLectManTele;

    @Column(name = "ID_LECT_MOD_VALID")
    private String idLectModValid;

}
