package net.eviden.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Data
@Entity
@Table(name = "FACA0003_V3", schema = "CMRPADM")
@IdClass(Faca0003PKV1.class)
public class Faca0003_V3 {

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

    @Column(name = "DATA_FIN_FACTB1")
    private String dataFinFactB1;
    @Column(name = "CONSUM_BUTLLETAB1")
    private String consumButlletab1;
    @Column(name = "NUM_BUTLLETAB1")
    private String numButlletab1;
    @Column(name = "DATA_FIN_FACTB2")
    private String dataFinFactB2;
    @Column(name = "CONSUM_BUTLLETAB2")
    private String consumButlletab2;
    @Column(name = "NUM_BUTLLETAB2")
    private String numButlletab2;
    @Column(name = "DATA_FIN_FACTB3")
    private String dataFinFactB3;
    @Column(name = "CONSUM_BUTLLETAB3")
    private String consumButlletab3;
    @Column(name = "NUM_BUTLLETAB3")
    private String numButlletab3;
    @Column(name = "DATA_FIN_FACTB4")
    private String dataFinFactB4;
    @Column(name = "CONSUM_BUTLLETAB4")
    private String consumButlletab4;
    @Column(name = "NUM_BUTLLETAB4")
    private String numButlletab4;
    @Column(name = "DATA_FIN_FACTB5")
    private String dataFinFactB5;
    @Column(name = "CONSUM_BUTLLETAB5")
    private String consumButlletab5;
    @Column(name = "NUM_BUTLLETAB5")
    private String numButlletab5;
    @Column(name = "DATA_FIN_FACTB6")
    private String dataFinFactB6;
    @Column(name = "CONSUM_BUTLLETAB6")
    private String consumButlletab6;
    @Column(name = "NUM_BUTLLETAB6")
    private String numButlletab6;
    @Column(name = "DATA_FIN_FACTB7")
    private String dataFinFactB7;
    @Column(name = "CONSUM_BUTLLETAB7")
    private String consumButlletab7;
    @Column(name = "NUM_BUTLLETAB7")
    private String numButlletab7;
    @Column(name = "DATA_FIN_FACTB8")
    private String dataFinFactB8;
    @Column(name = "CONSUM_BUTLLETAB8")
    private String consumButlletab8;
    @Column(name = "NUM_BUTLLETAB8")
    private String numButlletab8;
    @Column(name = "DATA_FIN_FACTB9")
    private String dataFinFactB9;
    @Column(name = "CONSUM_BUTLLETAB9")
    private String consumButlletab9;
    @Column(name = "NUM_BUTLLETAB9")
    private String numButlletab9;
    @Column(name = "DATA_FIN_FACTB10")
    private String dataFinFactB10;
    @Column(name = "CONSUM_BUTLLETAB10")
    private String consumButlletab10;
    @Column(name = "NUM_BUTLLETAB10")
    private String numButlletab10;
    @Column(name = "DATA_FIN_FACTB11")
    private String dataFinFactB11;
    @Column(name = "CONSUM_BUTLLETAB11")
    private String consumButlletab11;
    @Column(name = "NUM_BUTLLETAB11")
    private String numButlletab11;
    @Column(name = "DATA_FIN_FACTB12")
    private String dataFinFactB12;
    @Column(name = "CONSUM_BUTLLETAB12")
    private String consumButlletab12;
    @Column(name = "NUM_BUTLLETAB12")
    private String numButlletab12;
    @Column(name = "DATA_FIN_FACTB13")
    private String dataFinFactB13;
    @Column(name = "CONSUM_BUTLLETAB13")
    private String consumButlletab13;
    @Column(name = "NUM_BUTLLETAB13")
    private String numButlletab13;
    @Column(name = "DATA_FIN_FACTB14")
    private String dataFinFactB14;
    @Column(name = "CONSUM_BUTLLETAB14")
    private String consumButlletab14;
    @Column(name = "NUM_BUTLLETAB14")
    private String numButlletab14;
    @Column(name = "DATA_FI_PE_INCBR1")
    private String dataFiPeIncbr1;
    @Column(name = "CONS_REG_BUTBR1")
    private String consRegButbr1;
    @Column(name = "NUM_BUTLLETABR1")
    private String numButlletabr1;
    @Column(name = "DATA_FI_PE_INCBR2")
    private String dataFiPeIncbr2;
    @Column(name = "CONS_REG_BUTBR2")
    private String consRegButbr2;
    @Column(name = "NUM_BUTLLETABR2")
    private String numButlletabr2;
    @Column(name = "DATA_FI_PE_INCBR3")
    private String dataFiPeIncbr3;
    @Column(name = "CONS_REG_BUTBR3")
    private String consRegButbr3;
    @Column(name = "NUM_BUTLLETABR3")
    private String numButlletabr3;
    @Column(name = "DATA_FI_PE_INCBR4")
    private String dataFiPeIncbr4;
    @Column(name = "CONS_REG_BUTBR4")
    private String consRegButbr4;
    @Column(name = "NUM_BUTLLETABR4")
    private String numButlletabr4;
    @Column(name = "DATA_FI_PE_INCBR5")
    private String dataFiPeIncbr5;
    @Column(name = "CONS_REG_BUTBR5")
    private String consRegButbr5;
    @Column(name = "NUM_BUTLLETABR5")
    private String numButlletabr5;
    @Column(name = "DATA_FI_PE_INCBR6")
    private String dataFiPeIncbr6;
    @Column(name = "CONS_REG_BUTBR6")
    private String consRegButbr6;
    @Column(name = "NUM_BUTLLETABR6")
    private String numButlletabr6;
    @Column(name = "DATA_FI_PE_INCBR7")
    private String dataFiPeIncbr7;
    @Column(name = "CONS_REG_BUTBR7")
    private String consRegButbr7;
    @Column(name = "NUM_BUTLLETABR7")
    private String numButlletabr7;
    @Column(name = "DATA_FI_PE_INCBR8")
    private String dataFiPeIncbr8;
    @Column(name = "CONS_REG_BUTBR8")
    private String consRegButbr8;
    @Column(name = "NUM_BUTLLETABR8")
    private String numButlletabr8;
    @Column(name = "DATA_FI_PE_INCBR9")
    private String dataFiPeIncbr9;
    @Column(name = "CONS_REG_BUTBR9")
    private String consRegButbr9;
    @Column(name = "NUM_BUTLLETABR9")
    private String numButlletabr9;
    @Column(name = "DATA_FI_PE_INCBR10")
    private String dataFiPeIncbr10;
    @Column(name = "CONS_REG_BUTBR10")
    private String consRegButbr10;
    @Column(name = "NUM_BUTLLETABR10")
    private String numButlletabr10;
    @Column(name = "DATA_FI_PE_INCBR11")
    private String dataFiPeIncbr11;
    @Column(name = "CONS_REG_BUTBR11")
    private String consRegButbr11;
    @Column(name = "NUM_BUTLLETABR11")
    private String numButlletabr11;
    @Column(name = "DATA_FI_PE_INCBR12")
    private String dataFiPeIncbr12;
    @Column(name = "CONS_REG_BUTBR12")
    private String consRegButbr12;
    @Column(name = "NUM_BUTLLETABR12")
    private String numButlletabr12;
    @Column(name = "DATA_FI_PE_INCBR13")
    private String dataFiPeIncbr13;
    @Column(name = "CONS_REG_BUTBR13")
    private String consRegButbr13;
    @Column(name = "NUM_BUTLLETABR13")
    private String numButlletabr13;
    @Column(name = "DATA_FI_PE_INCBR14")
    private String dataFiPeIncbr14;
    @Column(name = "CONS_REG_BUTBR14")
    private String consRegButbr14;
    @Column(name = "NUM_BUTLLETABR14")
    private String numButlletabr14;
    @Column(name = "OBS_PRESA_RAMAL")
    private String obsPresaRamal;
    @Column(name = "LOCAL_CLAUS_FINCA")
    private String localClausFinca;
    @Column(name = "TEL_CONTA_LECT_CG")
    private String telContaLectCg;
    @Column(name = "NOM_CONTA_LECT_CG")
    private String nomContaLectCg;
    @Column(name = "TRIP_RISC_ACC_LECT")
    private String tripRiscAccLect;
    @Column(name = "UBICACIO_CG")
    private String ubicacioCg;
    @Column(name = "ESTAT_ESTANSA_BAT")
    private String estatEstansaBat;
    @Column(name = "NUM_PLANOL_ST_CG")
    private String numPlanolStCg;
    @Column(name = "NLECOMP")
    private String nlecomp;
    @Column(name = "NLECSEC")
    private String nlecsec;
    @Column(name = "DIFERENCI_LECT")
    private String diferenciLect;
    @Column(name = "DIFERENCI_LECT_SEC")
    private String diferenciLectSec;
    @Column(name = "CON_MIG_PR_DIA")
    private String conMigPrDia;
    @Column(name = "CON_MIG_PR_DIS_SEC")
    private String conMigPrDisSec;
    @Column(name = "ID_CONSUM_ESTACION")
    private String idConsumEstacion;
}
