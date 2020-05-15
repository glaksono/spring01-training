package id.hcid.spring.exercise.service;

import id.hcid.spring.exercise.model.response.GetIncomeResponseDTO;

import java.util.List;

public interface IGetIncome {
    List<GetIncomeResponseDTO> getIncome();
}