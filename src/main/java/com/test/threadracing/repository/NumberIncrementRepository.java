package com.test.threadracing.repository;

import com.test.threadracing.entity.NumberIncrement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * @author amit
 * below is the repository interface for the class NumberIncrement
 */

@Repository
public interface NumberIncrementRepository extends JpaRepository<NumberIncrement,Long> {

    @Query(value = "select * from number where id=?",nativeQuery = true)
    NumberIncrement getEntityById(Long id);
}
