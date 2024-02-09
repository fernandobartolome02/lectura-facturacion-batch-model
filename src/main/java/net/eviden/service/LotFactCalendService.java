package net.eviden.service;

import lombok.extern.slf4j.Slf4j;
import net.eviden.model.LotFactCalendar;
import net.eviden.repository.LotFactCalendRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Optional;

@Slf4j
@Service
public class LotFactCalendService implements ILotFactCalend {

    private final LotFactCalendRepository lotFactCalendRepository;

    public LotFactCalendService(LotFactCalendRepository lotFactCalendRepository) {
        this.lotFactCalendRepository = lotFactCalendRepository;
    }

    @Override
    public Optional<LotFactCalendar> getLotFactCalend(String idLotFact) {

        log.info("Entering into LotFactCalendarService.getLotFactCalend service");
        try {
            return lotFactCalendRepository.findById(idLotFact);
        } catch (Exception e) {
            log.error("Error in LotFactCalendarService.getLotFactCalend service");
            return Optional.empty();
        }
    }

    @Override
    public LotFactCalendar saveLotFactCalend(LotFactCalendar lotFactCalendar) {
        log.info("Entering into LotFactCalendarService.saveLotFactCalendar service");
        try {
            return lotFactCalendRepository.save(lotFactCalendar);
        } catch (Exception e) {
            log.error("Error in LotFactCalendarService.saveLotFactCalendar service");
            return (LotFactCalendar) Collections.emptyList();
        }
    }
    @Override
    public LotFactCalendar getDataFactLotCal(String id, String any, String mes) {
        log.info("Entering into LotFactCalendarService.getDataFactLotCal service");
        try {
            Pageable pageable = PageRequest.of(0, 1);
            return lotFactCalendRepository.findByIdLotFactAndAnyCalendariAndMesCalendariOrderByDataFactLotCalAsc(
                    id, any, mes, pageable).get(0);
        } catch (Exception e) {
            log.error("Error in LotFactCalendarService.getDataFactLotCal service");
            return null;
        }
    }
}
