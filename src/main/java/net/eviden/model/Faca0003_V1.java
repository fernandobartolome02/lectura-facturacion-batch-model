package net.eviden.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Data
@Entity
@Table(name = "FACA0003_V1", schema = "CMRPADM")
@IdClass(Faca0003PKV1.class)
public class Faca0003_V1 {
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

        @Column(name = "NUM_MUN_SGAB")
        private String num_mun_sgab;

        @Column(name = "ZONRECT")
        private String zonrect;

        @Column(name = "NOM_MUN_SGAB")
        private String nom_mun_sgab;

        @Column(name = "ADRECON")
        private String adrecon;

        @Column(name = "CODI_POSTAL")
        private String codi_postal;

        @Column(name = "NUM_CARRER")
        private String num_carrer;

        @Column(name = "NOM_ABREUJ_CARRER")
        private String nom_abreuj_carrer;

        @Column(name = "POLISSA_RAMAL")
        private String polissa_ramal;

        @Column(name = "DVER_POLISSA_RAMAL")
        private String dver_polissa_ramal;

        @Column(name = "TIP_SUBM_CTE_RAMAL")
        private String tip_subm_cte_ramal;

        @Column(name = "NUM_INI_FINCA")
        private String num_ini_finca;

        @Column(name = "COMP_NUM_INI_FINCA")
        private String comp_num_ini_finca;

        @Column(name = "NUM_FIN_FINCA")
        private String num_fin_finca;

        @Column(name = "COMP_NUM_FIN_FINCA")
        private String comp_num_fin_finca;

        @Column(name = "SIT_FINCA_ESPEC")
        private String sit_finca_espec;

        @Column(name = "ORD_FINCA_ESPEC")
        private String ord_finca_espec;

        @Column(name = "OBS_ADRE_INCOMPLET")
        private String obs_adre_incomplet;

        @Column(name = "LOCAL_CLAU_ACC_BAT")
        private String local_clau_acc_bat;

        @Column(name = "NOM_CLIENT")
        private String nom_client;

        @Column(name = "TIP_CLAU_PORTA_BAT")
        private String tip_clau_porta_bat;

        @Column(name = "DVER_POLISSA_SUBM")
        private String dver_polissa_subm;

        @Column(name = "QL_PSEUDO_ALTA")
        private String ql_pseudo_alta;

        @Column(name = "FREQ_FACT")
        private String freq_fact;

        @Column(name = "TIP_SUBM_SERV")
        private String tip_subm_serv;

        @Column(name = "SIT_SUBM_SERV")
        private String sit_subm_serv;

        @Column(name = "DATA_ALT_SUBM_SERV")
        private String data_alt_subm_serv;

        @Column(name = "ID_FACT_AJUNT")
        private String id_fact_ajunt;

        @Column(name = "DATA_ULTIMA_FACT")
        private String data_ultima_fact;

        @Column(name = "US_AIGUA_SUBM")
        private String us_aigua_subm;

        @Column(name = "ID_VENDA_ALTA")
        private String id_venda_alta;

        @Column(name = "NOMB_HABIT_SUBM")
        private String nomb_habit_subm;

        @Column(name = "ID_CANON_VENDA")
        private String id_canon_venda;

        @Column(name = "VENDA1")
        private String venda1;

        @Column(name = "VENDA2")
        private String venda2;

        @Column(name = "VENDA3")
        private String venda3;

        @Column(name = "VENDA4")
        private String venda4;

        @Column(name = "DIAM_COMP_CTE")
        private String diam_comp_cte;

        @Column(name = "DIAM_COMP_SEC_CTE")
        private String diam_comp_sec_cte;

        @Column(name = "PROPIETAT_COMP")
        private String propietat_comp;

        @Column(name = "CONSUM_MIG_DIA")
        private String consum_mig_dia;

        @Column(name = "CONSUM_MIG_DIA_SEC")
        private String consum_mig_dia_sec;

        @Column(name = "UL_LECT_COMP")
        private String ul_lect_comp;

        @Column(name = "UL_LECT_COMP_SEC")
        private String ul_lect_comp_sec;

        @Column(name = "DATA_UL_LECT_COMP")
        private String data_ul_lect_comp;

        @Column(name = "UL_LECT_COMP_REAL")
        private String ul_lect_comp_real;

        @Column(name = "UL_LECT_C_SEC_REAL")
        private String ul_lect_c_sec_real;

        @Column(name = "DATA_UL_LEC_C_REAL")
        private String data_ul_lec_c_real;

        @Column(name = "NOM_PERIOD_ABSENT")
        private String nom_period_absent;

        @Column(name = "ID_NO_HI_VIU")
        private String id_no_hi_viu;

        @Column(name = "DATA_INI_DESOCUPAT")
        private String data_ini_desocupat;

        @Column(name = "DATA_FIN_DESOCUPAT")
        private String data_fin_desocupat;

        @Column(name = "MARCA_COMP")
        private String marca_comp;

        @Column(name = "NUM_COMP")
        private String num_comp;

        @Column(name = "NOMB_DIGI_COMP")
        private String nomb_digi_comp;

        @Column(name = "NOMB_DIGI_COMP_SEC")
        private String nomb_digi_comp_sec;

        @Column(name = "ESTAT_COMP")
        private String estat_comp;

        @Column(name = "ESTAT_COMP_SEC")
        private String estat_comp_sec;

        @Column(name = "DIAM_COMP")
        private String diam_comp;

        @Column(name = "DIAM_COMP_SEC")
        private String diam_comp_sec;

        @Column(name = "ID_COMP_PRIM_SEC")
        private String id_comp_prim_sec;

        @Column(name = "DATA_INST_COMP")
        private String data_inst_comp;

        @Column(name = "MIN_LIT_DIA_C_A")
        private String min_lit_dia_c_a;

        @Column(name = "DATA_FIN_FACT")
        private String data_fin_fact;

        @Column(name = "INCIDEN_LECT_COMP")
        private String incid_lect_comp;

        @Column(name = "INCIDEN_LECT_SEC")
        private String incid_lect_sec;

        @Column(name = "LECT_PERIOD_REAL")
        private String lect_period_real;

        @Column(name = "LECT_PER_REAL_SEC")
        private String lect_per_real_sec;

        @Column(name = "TIPRISC")
        private String tiprisc;

        @Column(name = "ESTATBAT")
        private String estatbat;

        @Column(name = "UBICACIO")
        private String ubicacio;

        @Column(name = "ID_CONSUM_MITJANA")
        private String id_consum_mitjana;

        @Column(name = "ID_CON_SEC_MITJ")
        private String id_con_sec_mitj;

        @Column(name = "CODI_ANOMALIA")
        private String codi_anomalia;

        @Column(name = "CODI_ANOMALIA_SEC")
        private String codi_anomalia_sec;

        @Column(name = "CONSUM_REAL")
        private String consum_real;

        @Column(name = "CONSUM_REAL_SEC")
        private String consum_real_sec;

        @Column(name = "NOMB_BOQUES_25")
        private String nomb_boques_25;

        @Column(name = "NOMB_BOQUES_45")
        private String nomb_boques_45;

        @Column(name = "NOMB_BOQUES_70")
        private String nomb_boques_70;

        @Column(name = "NOMB_BOQUES_100")
        private String nomb_boques_100;

        @Column(name = "NOMB_SPRINCKLERS")
        private String nomb_sprincklers;

        @Column(name = "DATA_INI_CONSUM")
        private String data_ini_consum;

        @Column(name = "DATA_FIN_CONSUM")
        private String data_fin_consum;

        @Column(name = "DATA_INI_CON_SEC")
        private String data_ini_con_sec;

        @Column(name = "DATA_FIN_CON_SEC")
        private String data_fin_con_sec;

        @Column(name = "DIES_CONSUM")
        private String dies_consum;

        @Column(name = "CALCUL_CONSUM")
        private String calcul_consum;

        @Column(name = "CALCUL_CON_SEC")
        private String calcul_con_sec;

        @Column(name = "DATA_FIN_PER_INCID")
        private String data_fin_per_incid;

        @Column(name = "CONSUM_REGUL")
        private String consum_regul;

        @Column(name = "CONSUM_REGUL_SEC")
        private String consum_regul_sec;

        @Column(name = "TIP_ESDEVEN_ACT")
        private String tip_esdeven_act;

        @Column(name = "DATA_ESDEVEN_ACT")
        private String data_esdeven_act;

        @Column(name = "MARCA_COMP_EAC")
        private String marca_comp_eac;

        @Column(name = "NUM_COMP_EAC")
        private String num_comp_eac;

        @Column(name = "LECT_COMP_EAC")
        private String lect_comp_eac;

        @Column(name = "LECT_COMP_SEC_EAC")
        private String lect_comp_sec_eac;

        @Column(name = "ESTAT_COMP_EAC")
        private String estat_comp_eac;

        @Column(name = "ESTAT_COMP_SEC_EAC")
        private String estat_comp_sec_eac;

        @Column(name = "CONSUM_CANVI_ACT")
        private String consum_canvi_act;

        @Column(name = "CON_SEC_CANVI_ACT")
        private String con_sec_canvi_act;

        @Column(name = "NOMB_DIG_COMP_RET")
        private String nomb_dig_comp_ret;

        @Column(name = "NOMB_DIG_C_SEC_RT")
        private String nomb_dig_c_sec_rt;

        @Column(name = "TIP_ESDEVEN_ANT")
        private String tip_esdeven_ant;

        @Column(name = "DATA_ESDEVEN_ANT")
        private String data_esdeven_ant;

        @Column(name = "MARCA_COMP_EAN")
        private String marca_comp_ean;

        @Column(name = "NUM_COMP_EAN")
        private String num_comp_ean;

        @Column(name = "LECT_COMP_EAN")
        private String lect_comp_ean;

        @Column(name = "LECT_COMP_SEC_EAN")
        private String lect_comp_sec_ean;

        @Column(name = "ESTAT_COMP_EAN")
        private String estat_comp_ean;

        @Column(name = "ESTAT_COMP_SEC_EAN")
        private String estat_comp_sec_ean;

        @Column(name = "CONSUM_CANVI_ANT")
        private String consum_canvi_ant;

        @Column(name = "CON_SEC_CANVI_ANT")
        private String con_sec_canvi_ant;
    }


