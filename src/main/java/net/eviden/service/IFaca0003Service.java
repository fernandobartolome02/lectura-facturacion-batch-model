package net.eviden.service;

import net.eviden.model.Faca0003;

import java.util.List;

public interface IFaca0003Service {

    List<Faca0003> findByLote(String Clotlec, String Fanylot, String Fmeslot);
}
