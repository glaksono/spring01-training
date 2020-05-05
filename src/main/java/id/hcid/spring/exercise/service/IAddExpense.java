package id.hcid.spring.exercise.service;

import id.hcid.spring.exercise.model.request.AddExpenseRequestDTO;
import id.hcid.spring.exercise.model.response.AddExpenseResponseDTO;

public interface IAddExpense {
    AddExpenseResponseDTO addExpense(AddExpenseRequestDTO expenseDto);
}
