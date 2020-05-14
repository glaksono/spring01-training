package id.hcid.spring.exercise.service;

import id.hcid.spring.exercise.entity.Expense;
import id.hcid.spring.exercise.model.request.GetExpenseRequestDTO;
import id.hcid.spring.exercise.model.response.GetExpenseResponseDTO;
import id.hcid.spring.exercise.repository.IExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

            getexpenseresponseDTO.setExpense(expense.getExpenseDescription());
            getexpenseresponseDTO.setAmount(expense.getAmount());
            expenseList2.add(getexpenseresponseDTO);
        }

        return expenseList2;
    }
}
