package id.hcid.spring.exercise.service;

import id.hcid.spring.exercise.entity.Expense;
import id.hcid.spring.exercise.model.request.AddExpenseRequestDTO;
import id.hcid.spring.exercise.model.request.GetExpenseRequestDTO;
import id.hcid.spring.exercise.model.response.AddExpenseResponseDTO;
import id.hcid.spring.exercise.model.response.GetExpenseResponseDTO;
import id.hcid.spring.exercise.repository.IExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class AddExpenseService implements IAddExpense {

    @Autowired
    private IExpenseRepository expenseRepository;

    @Override
    public AddExpenseResponseDTO addExpense(List<AddExpenseRequestDTO> expenseDto) {

        List<Expense> expenses = new ArrayList<Expense>();
        for(AddExpenseRequestDTO addExpense: expenseDto){
            Expense expense = new Expense();
            expense.setAmount(addExpense.getAmount());
            expense.setExpenseDescription(addExpense.getExpense());
            expense.setExpenseOn(new Date());
            expenses.add(expense);
        }

        expenseRepository.save(expenses);
        AddExpenseResponseDTO responseDTO = new AddExpenseResponseDTO();
        responseDTO.setMessage("SUCCESS");
        return responseDTO;
    }
}