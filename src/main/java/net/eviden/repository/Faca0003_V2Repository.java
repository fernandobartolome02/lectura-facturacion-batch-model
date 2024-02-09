package net.eviden.repository;

import net.eviden.model.Faca0003_V1;
import net.eviden.model.Faca0003_V2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Faca0003_V2Repository extends JpaRepository<Faca0003_V2, String> {
    List<Faca0003_V2> findByClotlecAndFanylotAndFmeslotOrderByClotlecAsc(String Clotlec, String Fanylot, String Fmeslot);
}
