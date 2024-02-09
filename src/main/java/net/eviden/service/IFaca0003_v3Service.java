package net.eviden.service;

import net.eviden.model.Faca0003_V3;

import java.util.List;

public interface IFaca0003_v3Service {

    List<Faca0003_V3> findByLote(String lote, String any, String mes);
}
