package id.hcid.spring.exercise.repository;

import id.hcid.spring.exercise.entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface IExpenseRepository extends JpaRepository<Expense, Long> {
    @Override
    List<Expense> findAll();

    @Query(value = "SELECT SUM(amount) FROM expense WHERE expenseOn BETWEEN ?1 AND ?2", nativeQuery = true)
    Long expenseByDate(Date expenseFrom, Date expenseTo);
}
