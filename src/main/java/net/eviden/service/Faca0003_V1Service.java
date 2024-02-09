package net.eviden.service;

import lombok.extern.slf4j.Slf4j;
import net.eviden.model.Faca0003_V1;
import net.eviden.repository.Faca0003_V1Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class Faca0003_V1Service implements IFaca0003_v1Service {

    private final Faca0003_V1Repository faca0003V1Repository;

    public Faca0003_V1Service(Faca0003_V1Repository faca0003V1Repository) {

        this.faca0003V1Repository = faca0003V1Repository;
    }

    @Override
    public List<Faca0003_V1> findByLote(String lote, String any, String mes) {

        try {

            List<Faca0003_V1> faca0003_V1List =  faca0003V1Repository.findByClotlecAndFanylotAndFmeslotOrderByClotlecAsc(lote, any, mes);

            log.info(String.valueOf(faca0003_V1List.size()));

            for (Faca0003_V1 faca0003V1 : faca0003_V1List){

                if (faca0003V1.toString().equals(faca0003_V1List.get(0).toString())){
                    log.error("Todo es igual");

                }else{
                    log.info(faca0003V1.toString() + " es diferente");
                }
            }

            if (faca0003_V1List.size() == 0){
                return null;
            }else {

                return faca0003_V1List;
            }

        } catch (Exception e) {
            log.error("Error, {}", e.getMessage() );
            return null;

        }
    }
}
