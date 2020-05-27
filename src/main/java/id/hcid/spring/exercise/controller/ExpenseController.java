package id.hcid.spring.exercise.controller;

import id.hcid.spring.exercise.model.request.AddExpenseRequestDTO;
import id.hcid.spring.exercise.model.request.GetExpenseDateRequestDTO;
import id.hcid.spring.exercise.model.request.GetExpenseListByDateRequestDTO;
import id.hcid.spring.exercise.model.response.AddExpenseResponseDTO;
import id.hcid.spring.exercise.model.response.GetExpenseDateResponseDTO;
import id.hcid.spring.exercise.model.response.GetExpenseListByDateResponseDTO;
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
    public ResponseEntity<AddExpenseResponseDTO> addExpense(@RequestBody  List<AddExpenseRequestDTO> data){
        AddExpenseResponseDTO result = addExpenseService.addExpense(data);
        return new ResponseEntity<AddExpenseResponseDTO>(result, HttpStatus.OK);
    }

    // Use this method for retrieving all the expenses here. Please use appropriate response / request model (if needed)

    @GetMapping
    public ResponseEntity<List<GetExpenseResponseDTO>> getExpense(){
//        GetExpenseResponseDTO result =  getExpenseService.getExpense(data);
        return new ResponseEntity(getExpenseService.getExpense(), HttpStatus.OK);
    }

    @GetMapping(path = "/date")
    public ResponseEntity<GetExpenseDateResponseDTO> getExpenseByDate(@RequestBody GetExpenseDateRequestDTO expenseDateRequestDTO){
        return new ResponseEntity(getExpenseService.getExpenseByDate(expenseDateRequestDTO), HttpStatus.OK); //from to
    }

    @GetMapping(path= "/date/list")
    public ResponseEntity<GetExpenseListByDateResponseDTO> getExpenseListByDate(@RequestBody GetExpenseListByDateRequestDTO expenseListByDateRequestDTO){
        return new ResponseEntity<GetExpenseListByDateResponseDTO>(getExpenseService.getExpenseListByDate(expenseListByDateRequestDTO), HttpStatus.OK);
    }
}
