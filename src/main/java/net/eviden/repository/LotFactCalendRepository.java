package net.eviden.repository;

import net.eviden.model.LotFactCalendar;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LotFactCalendRepository extends JpaRepository<LotFactCalendar, String> {

        List<LotFactCalendar> findByIdLotFactAndAnyCalendariAndMesCalendariOrderByDataFactLotCalAsc(String idLotFact,String anyCalendari, String mesCalendari, Pageable pageable);
}
