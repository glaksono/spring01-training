package id.hcid.spring.exercise.service;

import id.hcid.spring.exercise.model.request.AddExpenseRequestDTO;
import id.hcid.spring.exercise.model.response.AddExpenseResponseDTO;

import java.util.List;

public interface IAddExpense {
    AddExpenseResponseDTO addExpense(List<AddExpenseRequestDTO> expenseDto);
}
