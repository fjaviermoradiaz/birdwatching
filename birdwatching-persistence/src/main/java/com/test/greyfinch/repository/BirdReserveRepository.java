package com.test.greyfinch.repository;


import com.test.greyfinch.model.BirdReserve;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BirdReserveRepository extends JpaRepository<BirdReserve,Long> {

    @Query(value = "SELECT bird_reserve.* FROM bird_reserve " +
            " JOIN reserve on (reserve.id = bird_reserve.reserve_id) " +
            " WHERE EXTRACT(MONTH FROM bird_reserve.visit_date) = ?1 AND bird_reserve.percentage > 15 " +
            " ORDER BY reserve.name ASC, bird_reserve.percentage ASC", nativeQuery = true)
    List<BirdReserve> findByMatchMonth(@Param("filterDate") Integer month);
}