package net.eviden.service;

import lombok.extern.slf4j.Slf4j;
import net.eviden.dto.CalendariLectAlertsDto;
import net.eviden.dto.CalendariLectDeleteDTO;
import net.eviden.dto.CalendariLectFilterDto;
import net.eviden.model.CalendariLect;
import net.eviden.repository.CalendariLectRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Slf4j
@Service
public class CalendariLectService implements ICalendariLectService {

    private final CalendariLectRepository calendariLectRepository;

    public CalendariLectService(CalendariLectRepository calendariLectRepository) {
        this.calendariLectRepository = calendariLectRepository;
    }

    @Override
    public List<CalendariLect> insertCalendariLect(List<CalendariLect> calendariLect) {
        log.info("Entering into CalendariLectService.insertCalendariLect service");
        try {
            return calendariLectRepository.saveAll(calendariLect);
        } catch (Exception e) {
            log.error("Error in CalendariLectService.insertCalendariLect service");
            return Collections.emptyList();
        }
    }

    @Override
    public List<CalendariLect> getCalendariLect(CalendariLectFilterDto lectFilterDto) {
        log.info("Entering into CalendariLectService.getCalendariLect service");
        try {
            return calendariLectRepository.findByAnyCalendariAndMesCalendariAndIdAreaLectAndTipusLect(lectFilterDto.getAnyCalendari(), lectFilterDto.getMesCalendari(), lectFilterDto.getIdAreaLect(), lectFilterDto.getTipusLect());
        } catch (Exception e) {
            log.error("Error in CalendariLectService.insertCalendariLect service");
            return Collections.emptyList();
        }
    }

    @Override
    public List<CalendariLect> deleteCalendari(CalendariLectDeleteDTO lectFilterDto) {
        log.info("Entering into CalendariLectService.deleteCalendari service");
        try {
            List<CalendariLect> calendarisToDelete =
                    calendariLectRepository.findByAnyCalendariAndMesCalendari(lectFilterDto.getAnyCalendari(), lectFilterDto.getMesCalendari());
            calendariLectRepository.deleteAll(calendarisToDelete);
            return calendarisToDelete;
        } catch (Exception e) {
            log.error("Error in CalendariLectService.deleteCalendari service");
            return Collections.emptyList();
        }
    }

    @Override
    public List<CalendariLect> getNumTornsByIdLot(CalendariLectAlertsDto alertsDto) {
        log.info("Entering into CalendariLectService.getNumTornsByIdLot service");
        try {
            Pageable pageable = PageRequest.of(0, alertsDto.getNum());
            return calendariLectRepository.findByAnyCalendariAndMesCalendariAndIdAreaLectAndIdLotLectAndTipusLectOrderByTornPrevCalLecDesc(
                    alertsDto.getAnyCalendari(), alertsDto.getMesCalendari(), alertsDto.getIdAreaLect(), alertsDto.getIdLotLect(), alertsDto.getTipusLect(), pageable);
        } catch (Exception e) {
            log.error("Error in CalendariLectService.getNumTornsByIdLot service");
            return Collections.emptyList();
        }
    }

    @Override
    public CalendariLect getIdAreaLect(String idLotLect) {
        log.info("Entering into CalendariLectService.getNumTornsByIdLot service");
        try {
            Pageable pageable = PageRequest.of(0, 1);
            if(calendariLectRepository.findByIdLotLectOrderByIdLotLectAsc(
                    idLotLect, pageable).get(0) == null){

                return null;
            }
        else {
                return calendariLectRepository.findByIdLotLectOrderByIdLotLectAsc(
                        idLotLect, pageable).get(0);
            }
        } catch (Exception e) {
            log.error("Error in CalendariLectService.getIdAreaLect service");
            return (CalendariLect) Collections.emptyList().get(0);
        }
    }
}
