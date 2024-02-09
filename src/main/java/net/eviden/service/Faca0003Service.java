package net.eviden.service;

import net.eviden.model.Faca0003;
import net.eviden.repository.Faca0003Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Faca0003Service implements IFaca0003Service {

    private final Faca0003Repository faca0003Repository;

    public Faca0003Service(Faca0003Repository faca0003Repository) {
        this.faca0003Repository = faca0003Repository;
    }

    @Override
    public List<Faca0003> findByLote(String lote, String any, String mes) {

        List<Faca0003> listFaca0003 = faca0003Repository.findByClotlecAndFanylotAndFmeslotOrderByClotlecAsc(lote, any, mes);

        List<Faca0003> newListFaca003 = new ArrayList<>();

        if (listFaca0003.size() == 0){
            return null;
        }else {
            for (Faca0003 faca : listFaca0003) {

                Faca0003 newFaca = new Faca0003();

                newFaca.setClotlec(faca.getClotlec());
                newFaca.setFanylot(faca.getFanylot());
                newFaca.setFmeslot(faca.getFmeslot());
                newFaca.setNumDelSgab(faca.getNumDelSgab());
                newFaca.setQlcomel(faca.getQlcomel());
                newFaca.setDteMuni(faca.getDteMuni());
                newFaca.setSector(faca.getSector());

                newListFaca003.add(newFaca);

            }

            return newListFaca003;
        }
    }

}
