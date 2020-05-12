package id.hcid.spring.exercise.controller;

import id.hcid.spring.exercise.model.request.AddExpenseRequestDTO;
import id.hcid.spring.exercise.model.request.GetExpenseRequestDTO;
import id.hcid.spring.exercise.model.response.AddExpenseResponseDTO;
import id.hcid.spring.exercise.model.response.GetExpenseResponseDTO;
import id.hcid.spring.exercise.service.IAddExpense;
import id.hcid.spring.exercise.service.IGetExpense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/expense")
public class ExpenseController {

    //This is service for adding an expense
    @Autowired
    private IAddExpense addExpenseService;

    //Create and add here service for getting the expense
    @Autowired
    private IGetExpense getExpenseService;

    @PostMapping
    public ResponseEntity<AddExpenseResponseDTO> addExpense(@RequestBody  AddExpenseRequestDTO data){
        AddExpenseResponseDTO result = addExpenseService.addExpense(data);
        return new ResponseEntity<AddExpenseResponseDTO>(result, HttpStatus.OK);
    }

    // Use this method for retrieving all the expenses here. Please use appropriate response / request model (if needed)

    @GetMapping
    public ResponseEntity<List<GetExpenseResponseDTO>> getExpense(@RequestBody GetExpenseRequestDTO data){
        List<GetExpenseResponseDTO> result = getExpenseService.getExpense(data);
        return new ResponseEntity(result, HttpStatus.OK);
    }

}
