package net.eviden.rest;

import lombok.extern.slf4j.Slf4j;
import net.eviden.model.LotFactCalendar;
import net.eviden.service.ILotFactCalend;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Optional;

@Slf4j
@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class LotFactCalendController {

    private final ILotFactCalend iLotFactCalend;

    public LotFactCalendController(ILotFactCalend iLotFactCalend) {
        this.iLotFactCalend = iLotFactCalend;
    }

    @PostMapping(value = "/insertLotFactCalendar")
    public ResponseEntity<LotFactCalendar> newLotFactCalend(@RequestBody LotFactCalendar lotFactCalendar) {
        long startTime = System.currentTimeMillis();
        log.info("Entering into the LotFactCalendController.newLotFactCalendar method with : {}", lotFactCalendar);

        LotFactCalendar response = iLotFactCalend.saveLotFactCalend(lotFactCalendar);

        log.info("Exiting from the LotFactCalendController.newLotFactCalendar method with : {}, in {}ms \n", lotFactCalendar , System.currentTimeMillis()-startTime);
        return response != null ? ResponseEntity.ok(response) : ResponseEntity.badRequest().build();
    }

    @GetMapping(value = "/getLotFactCalendar")
    public ResponseEntity<Optional<LotFactCalendar>> getLotFactCalend(@PathVariable String idLotFact) {
        long startTime = System.currentTimeMillis();
        log.info("Entering into the LotFactCalendController.newLotFactCalendar method with : {}", idLotFact);

        Optional<LotFactCalendar> response = iLotFactCalend.getLotFactCalend(idLotFact);

        log.info("Exiting from the LotFactCalendController.newLotFactCalendar method with : {}, in {}ms \n", response.get() , System.currentTimeMillis()-startTime);
        return response != null ? ResponseEntity.ok(response) : ResponseEntity.badRequest().build();
    }

    @GetMapping(value = "/getDataFactLotCal")
    public ResponseEntity<Date> getLotFactCalend(@RequestParam String id, @RequestParam String any, @RequestParam String mes) {


        long startTime = System.currentTimeMillis();
        log.info("Entering into the LotFactCalendController.newLotFactCalendar method with : {}", id);
        try{
            Date response = iLotFactCalend.getDataFactLotCal(id, any, mes).getDataFactLotCal();
            log.info("Exiting from the LotFactCalendController.newLotFactCalendar method with : {}, in {}ms \n", response , System.currentTimeMillis()-startTime);
            return response != null ? ResponseEntity.ok(response) : ResponseEntity.badRequest().build();
        }
        catch (Exception e){
            log.error(e.getMessage());
            return ResponseEntity.badRequest().build();
        }
    }
}
