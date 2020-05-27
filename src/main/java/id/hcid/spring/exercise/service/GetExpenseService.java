package id.hcid.spring.exercise.service;

import id.hcid.spring.exercise.entity.Expense;
import id.hcid.spring.exercise.model.request.GetExpenseDateRequestDTO;
import id.hcid.spring.exercise.model.request.GetExpenseListByDateRequestDTO;
import id.hcid.spring.exercise.model.request.GetExpenseRequestDTO;
import id.hcid.spring.exercise.model.response.GetExpenseDateResponseDTO;
import id.hcid.spring.exercise.model.response.GetExpenseListByDateResponseDTO;
import id.hcid.spring.exercise.model.response.GetExpenseResponseDTO;
import id.hcid.spring.exercise.repository.IExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class GetExpenseService implements IGetExpense{
    @Autowired
    private IExpenseRepository expenseRepository;

    @Override
    public List<GetExpenseResponseDTO> getExpense() {
        List<Expense> expenseList = expenseRepository.findAll();

        List<GetExpenseResponseDTO> expenseList2 = new ArrayList<GetExpenseResponseDTO>();

        for(int i = 0; i < expenseList.size(); i++){
            Expense expense = expenseList.get(i);

            GetExpenseResponseDTO getexpenseresponseDTO = new GetExpenseResponseDTO();

            getexpenseresponseDTO.setDescription(expense.getExpenseDescription());
            getexpenseresponseDTO.setAmount(expense.getAmount());
            getexpenseresponseDTO.setExpenseOn(expense.getExpenseOn());
            expenseList2.add(getexpenseresponseDTO);
        }

        return expenseList2;
    }

    @Override
    public GetExpenseDateResponseDTO getExpenseByDate(GetExpenseDateRequestDTO expenseDateRequestDTO) {
        Long totalExpense = expenseRepository.expenseByDate(expenseDateRequestDTO.getExpenseFrom(), expenseDateRequestDTO.getExpenseTo());

        GetExpenseDateResponseDTO response = new GetExpenseDateResponseDTO();
        response.setExpenseFrom(expenseDateRequestDTO.getExpenseFrom());
        response.setExpenseTo(expenseDateRequestDTO.getExpenseTo());
        response.setExpenseTotal(totalExpense);

        return response;
    }

    @Override
    public GetExpenseListByDateResponseDTO getExpenseListByDate(GetExpenseListByDateRequestDTO expenseListByDateRequestDTO) {
        List<Expense> dataDB = expenseRepository.expenseListByDate(expenseListByDateRequestDTO.getRequestFrom(), expenseListByDateRequestDTO.getRequestTo());

        GetExpenseListByDateResponseDTO expenseListByDateResponseDTO = new GetExpenseListByDateResponseDTO();

        List<GetExpenseResponseDTO> dataTemp = new ArrayList<GetExpenseResponseDTO>();

        for(Expense e: dataDB){
            GetExpenseResponseDTO dto = new GetExpenseResponseDTO();
            dto.setExpenseOn(e.getExpenseOn());
            dto.setAmount(e.getAmount());
            dto.setDescription(e.getExpenseDescription());
            dataTemp.add(dto);
        }
        expenseListByDateResponseDTO.setExpense(dataTemp);

        return expenseListByDateResponseDTO;
    }
}
