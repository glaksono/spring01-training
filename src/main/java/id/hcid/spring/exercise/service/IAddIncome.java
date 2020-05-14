package id.hcid.spring.exercise.service;


import id.hcid.spring.exercise.model.request.AddIncomeRequestDTO;
import id.hcid.spring.exercise.model.response.AddIncomeResponseDTO;

import java.util.List;

public interface IAddIncome {
    AddIncomeResponseDTO addIncome(List<AddIncomeRequestDTO> incomeDTO);
}
