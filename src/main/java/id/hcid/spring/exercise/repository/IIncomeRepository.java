package id.hcid.spring.exercise.repository;

import id.hcid.spring.exercise.entity.Income;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface IIncomeRepository extends JpaRepository<Income, Long> {
    @Override
    List<Income> findAll();

    @Query(value = "SELECT SUM(amount) FROM income WHERE income_on BETWEEN ?1 AND ?2", nativeQuery = true)
    Long incomeByDate(Date incomeFrom, Date incomeTo);

    @Query(value = "SELECT * FROM Income WHERE income_on BETWEEN ?1 AND ?2", nativeQuery = true)
    List<Income> incomeListByDate(Date incomeFrom, Date incomeTo);
}


