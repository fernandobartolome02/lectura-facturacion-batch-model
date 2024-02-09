package net.eviden.repository;

import net.eviden.model.Faca0003;
import net.eviden.model.Faca0003PK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Faca0003Repository extends JpaRepository<Faca0003, Faca0003PK> {

    Long countBycpolsub(String polissaSubm);

    List<Faca0003> findByClotlecAndFanylotAndFmeslotOrderByClotlecAsc(String Clotlec,String Fanylot, String Fmeslot);

}
