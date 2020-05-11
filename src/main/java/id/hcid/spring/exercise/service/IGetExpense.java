package id.hcid.spring.exercise.service;

import id.hcid.spring.exercise.model.request.GetExpenseRequestDTO;
import id.hcid.spring.exercise.model.response.GetExpenseResponseDTO;

public interface IGetExpense {
    GetExpenseResponseDTO getExpense(GetExpenseRequestDTO expenseDTO);
}
