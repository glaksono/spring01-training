package id.hcid.spring.exercise.service;

import id.hcid.spring.exercise.entity.Income;
import id.hcid.spring.exercise.model.request.GetIncomeDateRequestDTO;
import id.hcid.spring.exercise.model.request.GetIncomeListByDateRequestDTO;
import id.hcid.spring.exercise.model.response.GetIncomeDateResponseDTO;
import id.hcid.spring.exercise.model.response.GetIncomeListByDateResponseDTO;
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
            getIncomeResponseDTO.setIncomeOn(income.getIncomeOn());
            getIncomeResponseDTO.setAmount(income.getAmount());
            getIncomeResponseDTO.setDescription(income.getName());
            incomeResponse.add(getIncomeResponseDTO);
        }

        return incomeResponse;
    }

    @Override
    public GetIncomeDateResponseDTO getIncomeByDate(GetIncomeDateRequestDTO incomeByDateRequestDTO) {
        Long totalIncome = incomeRepository.incomeByDate(incomeByDateRequestDTO.getIncomeFrom(), incomeByDateRequestDTO.getIncomeTo());

        GetIncomeDateResponseDTO response = new GetIncomeDateResponseDTO();
        response.setIncomeFrom(incomeByDateRequestDTO.getIncomeFrom());
        response.setIncomeTo(incomeByDateRequestDTO.getIncomeTo());
        response.setIncomeTotal(totalIncome);

        return response;
    }

    @Override
    public GetIncomeListByDateResponseDTO getIncomeListByDate(GetIncomeListByDateRequestDTO getIncomeListByDateRequestDTO) {
        List<Income> dataDB = incomeRepository.incomeListByDate(getIncomeListByDateRequestDTO.getRequestFrom(), getIncomeListByDateRequestDTO.getRequestTo());

        GetIncomeListByDateResponseDTO incomeListByDateResponseDTO = new GetIncomeListByDateResponseDTO();

        List<GetIncomeResponseDTO> dataTemp = new ArrayList<GetIncomeResponseDTO>();

        for(Income i: dataDB){
            GetIncomeResponseDTO dto = new GetIncomeResponseDTO();
            dto.setIncomeOn(i.getIncomeOn());
            dto.setAmount(i.getAmount());
            dto.setDescription(i.getName());

            dataTemp.add(dto);
        }
        incomeListByDateResponseDTO.setIncome(dataTemp);

        return incomeListByDateResponseDTO;
    }
}
