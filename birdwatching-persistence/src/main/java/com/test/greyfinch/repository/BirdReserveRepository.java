package com.test.greyfinch.repository;


import com.test.greyfinch.model.BirdReserve;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BirdReserveRepository extends JpaRepository<BirdReserve,Long> {
}
