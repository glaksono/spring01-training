package id.hcid.spring.exercise.service;

import id.hcid.spring.exercise.entity.Expense;
import id.hcid.spring.exercise.model.request.GetExpenseRequestDTO;
import id.hcid.spring.exercise.model.response.GetExpenseDateResponseDTO;
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

            getexpenseresponseDTO.setExpense(expense.getExpenseDescription());
            getexpenseresponseDTO.setAmount(expense.getAmount());
            expenseList2.add(getexpenseresponseDTO);
        }

        return expenseList2;
    }

    @Override
    public Long getExpenseByDate() {
        List<Expense> expenseList = expenseRepository.findAll();

        Long expenseTotal = 0L;

        GetExpenseDateResponseDTO getExpenseDateResponseDTO = new GetExpenseDateResponseDTO();
        Date expenseFrom = getExpenseDateResponseDTO.getExpenseFrom(); //
        Date expenseTo = getExpenseDateResponseDTO.getExpenseTo(); //

        for(int i = 0; i < expenseList.size(); i++){
            Expense expense = expenseList.get(i);

            if(expense.getExpenseOn().compareTo(expenseFrom) >= 0 && expense.getExpenseOn().compareTo(expenseTo) <= 0){
                expenseTotal += expense.getAmount();
            }
        }

        return expenseTotal;
    }
}
