package net.eviden.model;

import javax.persistence.*;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data
@Entity
@Table(name = "FACA0003_V2", schema = "CMRPADM")
@IdClass(Faca0003PKV2.class)
public class Faca0003_V2 {

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
    @Column(name = "DATA_FIN_FACT1")
    private String dataFinFact1;

    @Column(name = "DIES_CONSUM1")
    private String diesConsum1;

    @Column(name = "DATA_FIN_CONS1")
    private String dataFinCons1;

    @Column(name = "LE_PERIOD_REAL1")
    private String lePeriodReal1;

    @Column(name = "LE_PER_REAL_SEC1")
    private String lePerRealSec1;

    @Column(name = "INCIDEN_LE_COMP1")
    private String incidenLeComp1;

    @Column(name = "INCIDEN_LE_SEC1")
    private String incidenLeSec1;

    @Column(name = "CALC_CONS1")
    private String calcCons1;

    @Column(name = "CALC_CONS_SEC1")
    private String calcConsSec1;

    @Column(name = "CONSUM_REAL1")
    private String consumReal1;

    @Column(name = "CONSUM_REAL_SEC1")
    private String consumRealSec1;

    @Column(name = "DATA_FIN_FACT2")
    private String dataFinFact2;

    @Column(name = "DIES_CONSUM2")
    private String diesConsum2;

    @Column(name = "DATA_FIN_CONS2")
    private String dataFinCons2;

    @Column(name = "LE_PERIOD_REAL2")
    private String lePeriodReal2;

    @Column(name = "LE_PER_REAL_SEC2")
    private String lePerRealSec2;

    @Column(name = "INCIDEN_LE_COMP2")
    private String incidenLeComp2;

    @Column(name = "INCIDEN_LE_SEC2")
    private String incidenLeSec2;

    @Column(name = "CALC_CONS2")
    private String calcCons2;

    @Column(name = "CALC_CONS_SEC2")
    private String calcConsSec2;

    @Column(name = "CONSUM_REAL2")
    private String consumReal2;

    @Column(name = "CONSUM_REAL_SEC2")
    private String consumRealSec2;

    @Column(name = "DATA_FIN_FACT3")
    private String dataFinFact3;

    @Column(name = "DIES_CONSUM3")
    private String diesConsum3;

    @Column(name = "DATA_FIN_CONS3")
    private String dataFinCons3;

    @Column(name = "LE_PERIOD_REAL3")
    private String lePeriodReal3;

    @Column(name = "LE_PER_REAL_SEC3")
    private String lePerRealSec3;

    @Column(name = "INCIDEN_LE_COMP3")
    private String incidenLeComp3;

    @Column(name = "INCIDEN_LE_SEC3")
    private String incidenLeSec3;

    @Column(name = "CALC_CONS3")
    private String calcCons3;

    @Column(name = "CALC_CONS_SEC3")
    private String calcConsSec3;

    @Column(name = "CONSUM_REAL3")
    private String consumReal3;

    @Column(name = "CONSUM_REAL_SEC3")
    private String consumRealSec3;

    @Column(name = "DATA_FIN_FACT4")
    private String dataFinFact4;

    @Column(name = "DIES_CONSUM4")
    private String diesConsum4;

    @Column(name = "DATA_FIN_CONS4")
    private String dataFinCons4;

    @Column(name = "LE_PERIOD_REAL4")
    private String lePeriodReal4;

    @Column(name = "LE_PER_REAL_SEC4")
    private String lePerRealSec4;

    @Column(name = "INCIDEN_LE_COMP4")
    private String incidenLeComp4;

    @Column(name = "INCIDEN_LE_SEC4")
    private String incidenLeSec4;

    @Column(name = "CALC_CONS4")
    private String calcCons4;

    @Column(name = "CALC_CONS_SEC4")
    private String calcConsSec4;

    @Column(name = "CONSUM_REAL4")
    private String consumReal4;

    @Column(name = "CONSUM_REAL_SEC4")
    private String consumRealSec4;

    @Column(name = "DATA_FIN_FACT5")
    private String dataFinFact5;

    @Column(name = "DIES_CONSUM5")
    private String diesConsum5;

    @Column(name = "DATA_FIN_CONS5")
    private String dataFinCons5;

    @Column(name = "LE_PERIOD_REAL5")
    private String lePeriodReal5;

    @Column(name = "LE_PER_REAL_SEC5")
    private String lePerRealSec5;

    @Column(name = "INCIDEN_LE_COMP5")
    private String incidenLeComp5;

    @Column(name = "INCIDEN_LE_SEC5")
    private String incidenLeSec5;

    @Column(name = "CALC_CONS5")
    private String calcCons5;

    @Column(name = "CALC_CONS_SEC5")
    private String calcConsSec5;

    @Column(name = "CONSUM_REAL5")
    private String consumReal5;

    @Column(name = "CONSUM_REAL_SEC5")
    private String consumRealSec5;

    @Column(name = "DATA_FIN_FACT6")
    private String dataFinFact6;

    @Column(name = "DIES_CONSUM6")
    private String diesConsum6;

    @Column(name = "DATA_FIN_CONS6")
    private String dataFinCons6;

    @Column(name = "LE_PERIOD_REAL6")
    private String lePeriodReal6;

    @Column(name = "LE_PER_REAL_SEC6")
    private String lePerRealSec6;

    @Column(name = "INCIDEN_LE_COMP6")
    private String incidenLeComp6;

    @Column(name = "INCIDEN_LE_SEC6")
    private String incidenLeSec6;

    @Column(name = "CALC_CONS6")
    private String calcCons6;

    @Column(name = "CALC_CONS_SEC6")
    private String calcConsSec6;

    @Column(name = "CONSUM_REAL6")
    private String consumReal6;

    @Column(name = "CONSUM_REAL_SEC6")
    private String consumRealSec6;

    @Column(name = "DATA_FIN_FACT7")
    private String dataFinFact7;

    @Column(name = "DIES_CONSUM7")
    private String diesConsum7;

    @Column(name = "DATA_FIN_CONS7")
    private String dataFinCons7;

    @Column(name = "LE_PERIOD_REAL7")
    private String lePeriodReal7;

    @Column(name = "LE_PER_REAL_SEC7")
    private String lePerRealSec7;

    @Column(name = "INCIDEN_LE_COMP7")
    private String incidenLeComp7;

    @Column(name = "INCIDEN_LE_SEC7")
    private String incidenLeSec7;

    @Column(name = "CALC_CONS7")
    private String calcCons7;

    @Column(name = "CALC_CONS_SEC7")
    private String calcConsSec7;

    @Column(name = "CONSUM_REAL7")
    private String consumReal7;

    @Column(name = "CONSUM_REAL_SEC7")
    private String consumRealSec7;

    @Column(name = "DATA_FIN_FACT8")
    private String dataFinFact8;

    @Column(name = "DIES_CONSUM8")
    private String diesConsum8;

    @Column(name = "DATA_FIN_CONS8")
    private String dataFinCons8;

    @Column(name = "LE_PERIOD_REAL8")
    private String lePeriodReal8;

    @Column(name = "LE_PER_REAL_SEC8")
    private String lePerRealSec8;

    @Column(name = "INCIDEN_LE_COMP8")
    private String incidenLeComp8;

    @Column(name = "INCIDEN_LE_SEC8")
    private String incidenLeSec8;

    @Column(name = "CALC_CONS8")
    private String calcCons8;

    @Column(name = "CALC_CONS_SEC8")
    private String calcConsSec8;

    @Column(name = "CONSUM_REAL8")
    private String consumReal8;

    @Column(name = "CONSUM_REAL_SEC8")
    private String consumRealSec8;

    @Column(name = "DATA_FIN_FACT9")
    private String dataFinFact9;

    @Column(name = "DIES_CONSUM9")
    private String diesConsum9;

    @Column(name = "DATA_FIN_CONS9")
    private String dataFinCons9;

    @Column(name = "LE_PERIOD_REAL9")
    private String lePeriodReal9;

    @Column(name = "LE_PER_REAL_SEC9")
    private String lePerRealSec9;

    @Column(name = "INCIDEN_LE_COMP9")
    private String incidenLeComp9;

    @Column(name = "INCIDEN_LE_SEC9")
    private String incidenLeSec9;

    @Column(name = "CALC_CONS9")
    private String calcCons9;

    @Column(name = "CALC_CONS_SEC9")
    private String calcConsSec9;

    @Column(name = "CONSUM_REAL9")
    private String consumReal9;

    @Column(name = "CONSUM_REAL_SEC9")
    private String consumRealSec9;

    @Column(name = "DATA_FIN_FACT10")
    private String dataFinFact10;

    @Column(name = "DIES_CONSUM10")
    private String diesConsum10;

    @Column(name = "DATA_FIN_CONS10")
    private String dataFinCons10;

    @Column(name = "LE_PERIOD_REAL10")
    private String lePeriodReal10;

    @Column(name = "LE_PER_REAL_SEC10")
    private String lePerRealSec10;

    @Column(name = "INCIDEN_LE_COMP10")
    private String incidenLeComp10;

    @Column(name = "INCIDEN_LE_SEC10")
    private String incidenLeSec10;

    @Column(name = "CALC_CONS10")
    private String calcCons10;

    @Column(name = "CALC_CONS_SEC10")
    private String calcConsSec10;

    @Column(name = "CONSUM_REAL10")
    private String consumReal10;

    @Column(name = "CONSUM_REAL_SEC10")
    private String consumRealSec10;

    @Column(name = "DATA_FIN_FACT11")
    private String dataFinFact11;

    @Column(name = "DIES_CONSUM11")
    private String diesConsum11;

    @Column(name = "DATA_FIN_CONS11")
    private String dataFinCons11;

    @Column(name = "LE_PERIOD_REAL11")
    private String lePeriodReal11;

    @Column(name = "LE_PER_REAL_SEC11")
    private String lePerRealSec11;

    @Column(name = "INCIDEN_LE_COMP11")
    private String incidenLeComp11;

    @Column(name = "INCIDEN_LE_SEC11")
    private String incidenLeSec11;

    @Column(name = "CALC_CONS11")
    private String calcCons11;

    @Column(name = "CALC_CONS_SEC11")
    private String calcConsSec11;

    @Column(name = "CONSUM_REAL11")
    private String consumReal11;

    @Column(name = "CONSUM_REAL_SEC11")
    private String consumRealSec11;

    @Column(name = "DATA_FIN_FACT12")
    private String dataFinFact12;

    @Column(name = "DIES_CONSUM12")
    private String diesConsum12;

    @Column(name = "DATA_FIN_CONS12")
    private String dataFinCons12;

    @Column(name = "LE_PERIOD_REAL12")
    private String lePeriodReal12;

    @Column(name = "LE_PER_REAL_SEC12")
    private String lePerRealSec12;

    @Column(name = "INCIDEN_LE_COMP12")
    private String incidenLeComp12;

    @Column(name = "INCIDEN_LE_SEC12")
    private String incidenLeSec12;

    @Column(name = "CALC_CONS12")
    private String calcCons12;

    @Column(name = "CALC_CONS_SEC12")
    private String calcConsSec12;

    @Column(name = "CONSUM_REAL12")
    private String consumReal12;

    @Column(name = "CONSUM_REAL_SEC12")
    private String consumRealSec12;

    @Column(name = "DATA_FIN_FACT13")
    private String dataFinFact13;

    @Column(name = "DIES_CONSUM13")
    private String diesConsum13;

    @Column(name = "DATA_FIN_CONS13")
    private String dataFinCons13;

    @Column(name = "LE_PERIOD_REAL13")
    private String lePeriodReal13;

    @Column(name = "LE_PER_REAL_SEC13")
    private String lePerRealSec13;

    @Column(name = "INCIDEN_LE_COMP13")
    private String incidenLeComp13;

    @Column(name = "INCIDEN_LE_SEC13")
    private String incidenLeSec13;

    @Column(name = "CALC_CONS13")
    private String calcCons13;

    @Column(name = "CALC_CONS_SEC13")
    private String calcConsSec13;

    @Column(name = "CONSUM_REAL13")
    private String consumReal13;

    @Column(name = "CONSUM_REAL_SEC13")
    private String consumRealSec13;

    @Column(name = "DATA_FIN_FACT14")
    private String dataFinFact14;

    @Column(name = "DIES_CONSUM14")
    private String diesConsum14;

    @Column(name = "DATA_FIN_CONS14")
    private String dataFinCons14;

    @Column(name = "LE_PERIOD_REAL14")
    private String lePeriodReal14;

    @Column(name = "LE_PER_REAL_SEC14")
    private String lePerRealSec14;

    @Column(name = "INCIDEN_LE_COMP14")
    private String incidenLeComp14;

    @Column(name = "INCIDEN_LE_SEC14")
    private String incidenLeSec14;

    @Column(name = "CALC_CONS14")
    private String calcCons14;

    @Column(name = "CALC_CONS_SEC14")
    private String calcConsSec14;

    @Column(name = "CONSUM_REAL14")
    private String consumReal14;

    @Column(name = "CONSUM_REAL_SEC14")
    private String consumRealSec14;

    @Column(name = "DATA_FIN_FACTR1")
    private String dataFinFactR1;

    @Column(name = "DATA_FI_PE_INCR1")
    private String dataFiPeIncr1;

    @Column(name = "CONS_REGR1")
    private String consRegr1;

    @Column(name = "CONS_REG_SECR1")
    private String consRegSecr1;

    @Column(name = "DATA_FIN_FACTR2")
    private String dataFinFactR2;

    @Column(name = "DATA_FI_PE_INCR2")
    private String dataFiPeIncr2;

    @Column(name = "CONS_REGR2")
    private String consRegr2;

    @Column(name = "CONS_REG_SECR2")
    private String consRegSecr2;

    @Column(name = "DATA_FIN_FACTR3")
    private String dataFinFactR3;


    @Column(name = "DATA_FI_PE_INCR3")
    private String dataFiPeIncr3;

    @Column(name = "CONS_REGR3")
    private String consRegr3;

    @Column(name = "CONS_REG_SECR3")
    private String consRegSecr3;

    @Column(name = "DATA_FIN_FACTR4")
    private String dataFinFactR4;

    @Column(name = "DATA_FI_PE_INCR4")
    private String dataFiPeIncr4;

    @Column(name = "CONS_REGR4")
    private String consRegr4;

    @Column(name = "CONS_REG_SECR4")
    private String consRegSecr4;

    @Column(name = "DATA_FIN_FACTR5")
    private String dataFinFactR5;

    @Column(name = "DATA_FI_PE_INCR5")
    private String dataFiPeIncr5;

    @Column(name = "CONS_REGR5")

    private String consRegr5;

    @Column(name = "CONS_REG_SECR5")
    private String consRegSecr5;

    @Column(name = "DATA_FIN_FACTR6")
    private String dataFinFactR6;

    @Column(name = "DATA_FI_PE_INCR6")
    private String dataFiPeIncr6;

    @Column(name = "CONS_REGR6")
    private String consRegr6;

    @Column(name = "CONS_REG_SECR6")
    private String consRegSecr6;

    @Column(name = "DATA_FIN_FACTR7")
    private String dataFinFactR7;

    @Column(name = "DATA_FI_PE_INCR7")
    private String dataFiPeIncr7;

    @Column(name = "CONS_REGR7")
    private String consRegr7;

    @Column(name = "CONS_REG_SECR7")
    private String consRegSecr7;

    @Column(name = "DATA_FIN_FACTR8")
    private String dataFinFactR8;

    @Column(name = "DATA_FI_PE_INCR8")
    private String dataFiPeIncr8;

    @Column(name = "CONS_REGR8")
    private String consRegr8;

    @Column(name = "CONS_REG_SECR8")
    private String consRegSecr8;

    @Column(name = "DATA_FIN_FACTR9")
    private String dataFinFactR9;

    @Column(name = "DATA_FI_PE_INCR9")
    private String dataFiPeIncr9;

    @Column(name = "CONS_REGR9")
    private String consRegr9;

    @Column(name = "CONS_REG_SECR9")
    private String consRegSecr9;

    @Column(name = "DATA_FIN_FACTR10")
    private String dataFinFactR10;

    @Column(name = "DATA_FI_PE_INCR10")
    private String dataFiPeIncr10;

    @Column(name = "CONS_REGR10")
    private String consRegr10;

    @Column(name = "CONS_REG_SECR10")
    private String consRegSecr10;

    @Column(name = "DATA_FIN_FACTR11")
    private String dataFinFactR11;

    @Column(name = "DATA_FI_PE_INCR11")
    private String dataFiPeIncr11;

    @Column(name = "CONS_REGR11")
    private String consRegr11;

    @Column(name = "CONS_REG_SECR11")
    private String consRegSecr11;

    @Column(name = "DATA_FIN_FACTR12")
    private String dataFinFactR12;

    @Column(name = "DATA_FI_PE_INCR12")
    private String dataFiPeIncr12;

    @Column(name = "CONS_REGR12")
    private String consRegr12;

    @Column(name = "CONS_REG_SECR12")
    private String consRegSecr12;

    @Column(name = "DATA_FIN_FACTR13")
    private String dataFinFactR13;

    @Column(name = "DATA_FI_PE_INCR13")
    private String dataFiPeIncr13;

    @Column(name = "CONS_REGR13")
    private String consRegr13;

    @Column(name = "CONS_REG_SECR13")
    private String consRegSecr13;

    @Column(name = "DATA_FIN_FACTR14")
    private String dataFinFactR14;

    @Column(name = "DATA_FI_PE_INCR14")
    private String dataFiPeIncr14;

    @Column(name = "CONS_REGR14")
    private String consRegr14;

    @Column(name = "CONS_REG_SECR14")
    private String consRegSecr14;

}
