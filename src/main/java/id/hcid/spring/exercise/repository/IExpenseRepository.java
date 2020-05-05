package id.hcid.spring.exercise.repository;

import id.hcid.spring.exercise.entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IExpenseRepository extends JpaRepository<Expense, Long> {
}
