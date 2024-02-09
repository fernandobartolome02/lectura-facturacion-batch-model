package net.eviden.service;

import net.eviden.model.Faca0003_V2;

import java.util.List;

public interface IFaca0003_v2Service {

    List<Faca0003_V2> findByLote(String lote, String any, String mes);
}
