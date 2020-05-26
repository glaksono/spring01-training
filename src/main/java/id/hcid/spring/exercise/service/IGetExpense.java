package id.hcid.spring.exercise.service;

import id.hcid.spring.exercise.model.request.GetExpenseDateRequestDTO;
import id.hcid.spring.exercise.model.response.GetExpenseDateResponseDTO;
import id.hcid.spring.exercise.model.response.GetExpenseResponseDTO;

import java.util.Date;
import java.util.List;

public interface IGetExpense {
    List<GetExpenseResponseDTO> getExpense();

    GetExpenseDateResponseDTO getExpenseByDate(GetExpenseDateRequestDTO expenseDateRequestDTO);
}
