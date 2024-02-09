package net.eviden.repository;

import net.eviden.model.Faca0003PKV1;
import net.eviden.model.Faca0003PKV3;
import net.eviden.model.Faca0003_V3;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Faca0003_V3Repository extends JpaRepository<Faca0003_V3, Faca0003PKV3> {

    @Query("SELECT e FROM Faca0003_V3 e WHERE e.clotlec = :clotlec AND e.fanylot = :fanylot AND e.fmeslot = :fmeslot ORDER BY e.clotlec ASC")
    List<Faca0003_V3> findByClotlecAndFanylotAndFmeslotOrderByClotlecAsc(
            @Param("clotlec") String clotlec,
            @Param("fanylot") String fanylot,
            @Param("fmeslot") String fmeslot);
}
