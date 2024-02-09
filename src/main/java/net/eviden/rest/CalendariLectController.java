package net.eviden.rest;

import lombok.extern.slf4j.Slf4j;
import net.eviden.dto.CalendariLectAlertsDto;
import net.eviden.dto.CalendariLectDeleteDTO;
import net.eviden.dto.CalendariLectFilterDto;
import net.eviden.model.CalendariLect;
import net.eviden.service.ICalendariLectService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class CalendariLectController {

    private final ICalendariLectService iCalendariLectService;

    public CalendariLectController(ICalendariLectService iCalendariLectService) {
        this.iCalendariLectService = iCalendariLectService;
    }


    @PostMapping(value = "/insertCalendariLect")
    public ResponseEntity<List<CalendariLect>> newCalendariLect(@RequestBody List<CalendariLect> calendariLect) {
        long startTime = System.currentTimeMillis();
        log.info("Entering into the CalendariLectController.newCalendariLect method with : {}", calendariLect);

        List<CalendariLect> response = iCalendariLectService.insertCalendariLect(calendariLect);

        log.info("Exiting from the CalendariLectController.newCalendariLect method with : {}, in {}ms \n", calendariLect , System.currentTimeMillis()-startTime);
        return response != null ? ResponseEntity.ok(response) : ResponseEntity.badRequest().build();
    }

    @PostMapping(value = "/getCalendariLect")
    public ResponseEntity<List<CalendariLect>> getCalendari(@RequestBody CalendariLectFilterDto lectFilterDto) {
        long startTime = System.currentTimeMillis();
        log.info("Entering into the CalendariLectController.getCalendari method with : {}", lectFilterDto);

        List<CalendariLect> response = iCalendariLectService.getCalendariLect(lectFilterDto);

        log.info("Exiting from the CalendariLectController.getCalendari method with : {}, in {}ms \n", lectFilterDto , System.currentTimeMillis()-startTime);
        return response != null ? ResponseEntity.ok(response) : ResponseEntity.badRequest().build();
    }

    @PostMapping(value = "/getNumTornsByIdLot")
    public ResponseEntity<List<CalendariLect>> getNumTornsByIdLot(@RequestBody CalendariLectAlertsDto lectFilterDto) {
        long startTime = System.currentTimeMillis();
        log.info("Entering into the CalendariLectController.getNumTornsByIdLot method with : {}", lectFilterDto);

        List<CalendariLect> response = iCalendariLectService.getNumTornsByIdLot(lectFilterDto);

        log.info("Exiting from the CalendariLectController.getNumTornsByIdLot method with : {}, in {}ms \n", lectFilterDto , System.currentTimeMillis()-startTime);
        return response != null ? ResponseEntity.ok(response) : ResponseEntity.badRequest().build();
    }

    @DeleteMapping(value = "/deleteCalendariLect")
    public ResponseEntity<List<CalendariLect>> deleteCalendari(@RequestBody CalendariLectDeleteDTO lectFilterDto) {
        long startTime = System.currentTimeMillis();
        log.info("Entering into the CalendariLectController.deleteCalendari method with : {}", lectFilterDto);

        List<CalendariLect> response = iCalendariLectService.deleteCalendari(lectFilterDto);

        log.info("Exiting from the CalendariLectController.deleteCalendari method with : {}, in {}ms \n", lectFilterDto , System.currentTimeMillis()-startTime);
        return response != null ? ResponseEntity.ok(response) : ResponseEntity.badRequest().build();
    }

    @GetMapping(value = "/getIdAreaLect/{idLotLect}")
    public ResponseEntity<String> getIdAreaLect(@PathVariable String idLotLect) {
        long startTime = System.currentTimeMillis();
        log.info("Entering into the CalendariLectController.getIdAreaLect method with : {}", idLotLect);

        String response = iCalendariLectService.getIdAreaLect(idLotLect).getIdAreaLect();
        log.info(response);

        log.info("Exiting from the CalendariLectController.getIdAreaLect method with : {}, in {}ms \n", idLotLect , System.currentTimeMillis()-startTime);

        if (response == null){

            return ResponseEntity.badRequest().build();
        }

        return response != null ? ResponseEntity.ok(response) : ResponseEntity.badRequest().build();
    }


}
