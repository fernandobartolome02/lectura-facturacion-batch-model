package net.eviden.service;

import net.eviden.dto.CalendariLectAlertsDto;
import net.eviden.dto.CalendariLectDeleteDTO;
import net.eviden.dto.CalendariLectFilterDto;
import net.eviden.model.CalendariLect;

import java.util.List;

public interface ICalendariLectService {

    List<CalendariLect> insertCalendariLect (List<CalendariLect> calendariLect);

    List<CalendariLect> getCalendariLect (CalendariLectFilterDto lectFilterDto);

    List<CalendariLect> deleteCalendari (CalendariLectDeleteDTO lectFilterDto);

    List<CalendariLect> getNumTornsByIdLot(CalendariLectAlertsDto alertsDto);

    CalendariLect getIdAreaLect(String idLotLect);
}
