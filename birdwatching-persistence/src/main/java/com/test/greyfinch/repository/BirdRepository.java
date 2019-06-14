package com.test.greyfinch.repository;


import com.test.greyfinch.model.Bird;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BirdRepository extends JpaRepository<Bird,Long> {
}
