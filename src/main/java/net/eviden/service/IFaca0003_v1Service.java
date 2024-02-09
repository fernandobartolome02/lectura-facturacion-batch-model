package net.eviden.service;

import net.eviden.model.Faca0003_V1;

import java.util.List;

public interface IFaca0003_v1Service {

    List<Faca0003_V1> findByLote(String lote, String any, String mes);
}
