package net.eviden.rest;

import lombok.extern.slf4j.Slf4j;
import net.eviden.model.Faca0003_V2;
import net.eviden.model.Faca0003_V3;
import net.eviden.service.IFaca0003_v2Service;
import net.eviden.service.IFaca0003_v3Service;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class Faca0003_V2Controller {

    private final IFaca0003_v2Service iFaca0003V2Service;

    public Faca0003_V2Controller(IFaca0003_v2Service iFaca0003V2Service) {
        this.iFaca0003V2Service = iFaca0003V2Service;
    }

    @GetMapping(value = "/getFaca0003V2")
    public ResponseEntity<List<Faca0003_V2>> findAllFaca003V1(@RequestParam String id, @RequestParam String any, @RequestParam String mes){

        long startTime = System.currentTimeMillis();
        log.info("Entering into the Faca0003_V2Controller.getFaca003V2");

        List<Faca0003_V2> response = iFaca0003V2Service.findByLote(id, any, mes);

        if (response == null){
            return ResponseEntity.badRequest().build();
        }

        log.info("Exiting from the Faca0003_V2Controller.findAllFaca003V2 method in {}ms \n",System.currentTimeMillis()-startTime);
        return response != null ? ResponseEntity.ok(response) : ResponseEntity.ok(null);
    }
}
