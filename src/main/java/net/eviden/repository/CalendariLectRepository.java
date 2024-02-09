package net.eviden.repository;

import net.eviden.model.CalendariLect;
import net.eviden.model.CalendariLectPK;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CalendariLectRepository extends JpaRepository<CalendariLect, CalendariLectPK> {

    List<CalendariLect> findByAnyCalendariAndMesCalendari(String anyCalendari, String mesCalendari);

    List<CalendariLect> findByAnyCalendariAndMesCalendariAndIdAreaLectAndTipusLect(String anyCalendari, String mesCalendari, String idAreaLect, String tipusLect);

    List<CalendariLect> findByAnyCalendariAndMesCalendariAndIdAreaLectAndIdLotLectAndTipusLectOrderByTornPrevCalLecDesc(
            String anyCalendari, String mesCalendari, String idAreaLect, String idLotLect, String tipusLect, Pageable pageable);

    List<CalendariLect> findByIdLotLectOrderByIdLotLectAsc(String idAreaLect, Pageable pageable );


}
