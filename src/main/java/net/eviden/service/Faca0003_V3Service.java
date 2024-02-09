package net.eviden.service;

import lombok.extern.slf4j.Slf4j;
import net.eviden.model.Faca0003_V3;
import net.eviden.repository.Faca0003_V3Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class Faca0003_V3Service implements IFaca0003_v3Service {

    private final Faca0003_V3Repository faca0003V3Repository;

    public Faca0003_V3Service(Faca0003_V3Repository faca0003V3Repository) {

        this.faca0003V3Repository = faca0003V3Repository;
    }



    @Override
    public List<Faca0003_V3> findByLote(String lote, String any, String mes) {

        try {
            List<Faca0003_V3> faca0003_V3List = faca0003V3Repository.findByClotlecAndFanylotAndFmeslotOrderByClotlecAsc(lote, any, mes);

            if (faca0003_V3List.size() == 0){

                return null;
            }else {
                return faca0003_V3List;
            }
        } catch (Exception e) {

            log.error("Error, {}", e.getMessage() );
            return null;

        }
    }
}
