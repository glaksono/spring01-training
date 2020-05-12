package id.hcid.spring.exercise.service;

import id.hcid.spring.exercise.model.request.GetExpenseRequestDTO;
import id.hcid.spring.exercise.model.response.GetExpenseResponseDTO;

import java.util.List;

public interface IGetExpense {
    List<GetExpenseResponseDTO> getExpense(GetExpenseRequestDTO expenseDTO);
}
