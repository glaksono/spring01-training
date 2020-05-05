package id.hcid.spring.exercise.service;

import id.hcid.spring.exercise.entity.Expense;
import id.hcid.spring.exercise.model.request.AddExpenseRequestDTO;
import id.hcid.spring.exercise.model.response.AddExpenseResponseDTO;
import id.hcid.spring.exercise.repository.IExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class AddExpenseService implements IAddExpense {

    @Autowired
    private IExpenseRepository expenseRepository;

    @Override
    public AddExpenseResponseDTO addExpense(AddExpenseRequestDTO expenseDto) {
        Expense expense = new Expense();
        expense.setAmount(expenseDto.getAmount());
        expense.setExpenseDescription(expenseDto.getExpense());
        expense.setExpenseOn(new Date());

        Expense result = expenseRepository.save(expense);
        if(result != null){
            AddExpenseResponseDTO responseDTO = new AddExpenseResponseDTO();
            responseDTO.setMessage("SUCCESS");
            return responseDTO;
        }
        return null;
    }

}
