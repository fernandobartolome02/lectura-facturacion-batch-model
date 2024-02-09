package net.eviden.service;

import net.eviden.model.LotFactCalendar;

import java.util.Optional;

public interface ILotFactCalend {

    Optional<LotFactCalendar> getLotFactCalend(String idLotFact);

    LotFactCalendar saveLotFactCalend(LotFactCalendar lotFactCalendar);

    LotFactCalendar getDataFactLotCal(String id, String any, String mes);
}
