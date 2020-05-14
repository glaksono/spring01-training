package id.hcid.spring.exercise.repository;

import id.hcid.spring.exercise.entity.Income;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IIncomeRepository extends JpaRepository<Income, Long> {
}
