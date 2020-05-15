package id.hcid.spring.exercise.service;

import id.hcid.spring.exercise.entity.Income;
import id.hcid.spring.exercise.model.response.GetIncomeResponseDTO;
import id.hcid.spring.exercise.repository.IIncomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GetIncomeService implements IGetIncome{
    @Autowired
    private IIncomeRepository incomeRepository;

    @Override
    public List<GetIncomeResponseDTO> getIncome() {
        List<Income> incomeData = incomeRepository.findAll();

        List<GetIncomeResponseDTO> incomeResponse = new ArrayList<GetIncomeResponseDTO>();

        for(int i = 0; i < incomeData.size(); i++){
            Income income = incomeData.get(i);

            GetIncomeResponseDTO getIncomeResponseDTO = new GetIncomeResponseDTO();
            getIncomeResponseDTO.setAmount(income.getAmount());
            getIncomeResponseDTO.setIncomeName(income.getName());
            incomeResponse.add(getIncomeResponseDTO);
        }

        return incomeResponse;
    }
}
