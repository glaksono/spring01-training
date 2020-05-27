package id.hcid.spring.exercise.service;

import id.hcid.spring.exercise.model.request.GetIncomeDateRequestDTO;
import id.hcid.spring.exercise.model.request.GetIncomeListByDateRequestDTO;
import id.hcid.spring.exercise.model.response.GetIncomeDateResponseDTO;
import id.hcid.spring.exercise.model.response.GetIncomeListByDateResponseDTO;
import id.hcid.spring.exercise.model.response.GetIncomeResponseDTO;

import java.util.List;

public interface IGetIncome {
    List<GetIncomeResponseDTO> getIncome();

    GetIncomeDateResponseDTO getIncomeByDate(GetIncomeDateRequestDTO getIncomeByDateRequestDTO);

    GetIncomeListByDateResponseDTO getIncomeListByDate(GetIncomeListByDateRequestDTO getIncomeListByDateRequest);
}