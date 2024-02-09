package net.eviden.rest;

import lombok.extern.slf4j.Slf4j;
import net.eviden.model.Faca0003_V1;
import net.eviden.service.IFaca0003_v1Service;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class Faca0003_V1Controller {

    private final IFaca0003_v1Service iFaca0003V1Service;

    public Faca0003_V1Controller(IFaca0003_v1Service iFaca0003V1Service) {
        this.iFaca0003V1Service = iFaca0003V1Service;
    }

    @GetMapping(value = "/getFaca0003V1")
    public ResponseEntity<List<Faca0003_V1>> findAllFaca003V1(@RequestParam String id, @RequestParam String any, @RequestParam String mes){

        long startTime = System.currentTimeMillis();
        log.info("Entering into the Faca0003_V1Controller.getFaca003V1");

        List<Faca0003_V1> response = iFaca0003V1Service.findByLote(id, any, mes);

        if (response == null){
            return ResponseEntity.badRequest().build();
        }

        log.info("Exiting from the Faca0003_V1Controller.findAllFaca003V1 method in {}ms \n",System.currentTimeMillis()-startTime);
        return response != null ? ResponseEntity.ok(response) : ResponseEntity.ok(null);
    }
}
