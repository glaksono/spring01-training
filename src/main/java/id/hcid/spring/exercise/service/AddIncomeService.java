package id.hcid.spring.exercise.service;

import id.hcid.spring.exercise.entity.Income;
import id.hcid.spring.exercise.model.request.AddIncomeRequestDTO;
import id.hcid.spring.exercise.model.response.AddExpenseResponseDTO;
import id.hcid.spring.exercise.model.response.AddIncomeResponseDTO;
import id.hcid.spring.exercise.repository.IIncomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddIncomeService implements IAddIncome {

    @Autowired
    private IIncomeRepository incomeRepository;

    @Override
    public AddIncomeResponseDTO addIncome(List<AddIncomeRequestDTO> incomeDTO) {
        List<Income> newIncome = new ArrayList<Income>();

        for(AddIncomeRequestDTO addIncome : incomeDTO){
            Income income = new Income();
            income.setAmount(addIncome.getAmount());
            income.setName(addIncome.getIncomeName());
            newIncome.add(income);
        }

        incomeRepository.save(newIncome);
        AddIncomeResponseDTO responseDTO = new AddIncomeResponseDTO();
        responseDTO.setStatus("SUCCESS");
        return responseDTO;
    }
}
