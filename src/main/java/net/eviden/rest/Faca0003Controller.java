package net.eviden.rest;

import lombok.extern.slf4j.Slf4j;
import net.eviden.model.Faca0003;
import net.eviden.service.IFaca0003Service;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class Faca0003Controller {

    private final IFaca0003Service iFaca0003Service;

    public Faca0003Controller(IFaca0003Service iFaca0003Service) {
        this.iFaca0003Service = iFaca0003Service;
    }

    @GetMapping(value = "/getFaca0003")
    public ResponseEntity<List<Faca0003>> findAllFaca003V1(@RequestParam String id, @RequestParam String any, @RequestParam String mes){

        long startTime = System.currentTimeMillis();
        log.info("Entering into the Faca0003Controller.getFaca003");

        List<Faca0003> response = iFaca0003Service.findByLote(id, any, mes);

        if (response == null){
            return ResponseEntity.badRequest().build();
        }

        log.info("Exiting from the Faca0003Controller.findAllFaca003 method in {}ms \n",System.currentTimeMillis()-startTime);
        return response != null ? ResponseEntity.ok(response) : ResponseEntity.ok(null);
    }
}
