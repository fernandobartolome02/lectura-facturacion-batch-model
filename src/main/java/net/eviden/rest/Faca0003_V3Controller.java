package net.eviden.rest;

import lombok.extern.slf4j.Slf4j;
import net.eviden.model.Faca0003_V3;
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
public class Faca0003_V3Controller {

    private final IFaca0003_v3Service iFaca0003V3Service;

    public Faca0003_V3Controller(IFaca0003_v3Service iFaca0003V3Service) {
        this.iFaca0003V3Service = iFaca0003V3Service;
    }

    @GetMapping(value = "/getFaca0003V3")
    public ResponseEntity<List<Faca0003_V3>> findAllFaca003V1(@RequestParam String id, @RequestParam String any, @RequestParam String mes){

        long startTime = System.currentTimeMillis();
        log.info("Entering into the Faca0003_V3Controller.getFaca003V3");

        List<Faca0003_V3> response = iFaca0003V3Service.findByLote(id, any, mes);

        if (response == null){
            return ResponseEntity.badRequest().build();
        }

        log.info("Exiting from the Faca0003_V3Controller.findAllFaca003V3 method in {}ms \n",System.currentTimeMillis()-startTime);
        return response != null ? ResponseEntity.ok(response) : ResponseEntity.ok(null);
    }
}
