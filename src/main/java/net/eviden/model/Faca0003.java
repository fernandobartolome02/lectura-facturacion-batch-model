package net.eviden.model;

import lombok.Data;
import net.eviden.annotations.LimitChar;

import javax.persistence.*;

@Data
@Entity
@Table(name = "FACA0003", schema = "CMRPADM")
@IdClass(Faca0003PK.class)
public class Faca0003 {

    @Id
    @Column(name = "CLOTLEC", nullable = false, length = 3)
    private String clotlec;

    @Id
    @Column(name = "FANYLOT", nullable = false, length = 2)
    private String fanylot;

    @Id
    @Column(name = "FMESLOT", nullable = false, length = 2)
    private String fmeslot;

    @Id
    @Column(name = "NTORN", nullable = false, length = 2)
    private String ntorn;

    @Id
    @Column(name = "CZONREC", nullable = false, length = 2)
    private String czonrec;

    @Id
    @Column(name = "TRAV_MEN", nullable = false, length = 7)
    private String travMen;

    @Id
    @Column(name = "CASAREC", nullable = false, length = 3)
    private String casarec;

    @Id
    @Column(name = "NORDRAM", nullable = false, length = 2)
    private String nordram;

    @Id
    @Column(name = "DLLETRA", nullable = false, length = 1)
    private String dlletra;

    @Id
    @Column(name = "PJOCLAU", nullable = false, length = 2)
    private String pjoclau;

    @Id
    @Column(name = "CPOLSUB", nullable = false, length = 9)
    private String cpolsub;

    @LimitChar(campo = "cpolsub",size = 9)
    public void setCpolsub(String cpolsub) {
        this.cpolsub = cpolsub;
    }

    @Column(name = "DADES_GENERALS", nullable = false, length = 224)
    private String dadesGenerals;

    @Column(name = "DADES_COMPTADOR", nullable = false, length = 87)
     private String dadesComptador;


    @Column(name = "DADES_LECTURA", nullable = false, length = 25)

     private String dadesLectura;

    @Column(name = "DADES_CONSUM", nullable = false, length = 47)
     private String dadesConsum;


    @Column(name = "REGUL_ACTUAL", nullable = false, length = 13)
    private String regulActual;

    @Column(name = "ESDEV_ACTUAL", nullable = false, length = 40)
     private String esdevActual;

    @Column(name = "ESDEV_ANTERIOR", nullable = false, length = 38)
    private String esdevAnterior;

    @Column(name = "HIST_LECT_CONS_6_1", nullable = false, length = 234)
    private String histLectCons61;


    @Column(name = "HIST_LECT_CONS_6_2", nullable = false, length = 234)
    private String histLectCons62;

    @Column(name = "HIST_LECT_CONS_2_3", nullable = false, length = 78)
     private String histLectCons23;

    @Column(name = "HIST_REGUL_14", nullable = false, length = 252)
     private String histRegul14;

    @Column(name = "HIST_BUTLLETA_14", nullable = false, length = 182)
     private String histButlleta14;

    @Column(name = "HIST_BUTLL_REG_14", nullable = false, length = 182)
    private String histButllReg14;


    @Column(name = "RESTE_FACD003", nullable = false, length = 119)
    private String resteFacd003;

    @Column(name = "NUM_DEL_SGAB", nullable = false, length = 2)
    private String numDelSgab;

    @Column(name = "QLCOMEL", nullable = false, length = 1)
     private String qlcomel;

    @Column(name = "DTE_MUNI", nullable = false, length = 2)
     private String dteMuni;

    @Column(name = "SECTOR", nullable = false, length = 8)
    private String sector;


}
