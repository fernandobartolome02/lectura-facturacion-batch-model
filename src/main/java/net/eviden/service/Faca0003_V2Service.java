package net.eviden.service;

import lombok.extern.slf4j.Slf4j;
import net.eviden.model.Faca0003_V2;
import net.eviden.repository.Faca0003_V2Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class Faca0003_V2Service implements IFaca0003_v2Service {

    private final Faca0003_V2Repository faca0003V2Repository;

    public Faca0003_V2Service(Faca0003_V2Repository faca0003V2Repository) {

        this.faca0003V2Repository = faca0003V2Repository;
    }



    @Override
    public List<Faca0003_V2> findByLote(String lote, String any, String mes) {

        try {
            List<Faca0003_V2> faca0003_V2List = faca0003V2Repository.findByClotlecAndFanylotAndFmeslotOrderByClotlecAsc(lote, any, mes);

            if (faca0003_V2List.size() == 0){

                return null;
            }else {
                return faca0003_V2List;
            }
        } catch (Exception e) {

            log.error("Error, {}", e.getMessage() );
            return null;

        }
    }
}
