package id.hcid.spring.exercise.controller;

import id.hcid.spring.exercise.model.request.AddIncomeRequestDTO;
import id.hcid.spring.exercise.model.response.AddIncomeResponseDTO;
import id.hcid.spring.exercise.model.response.GetIncomeResponseDTO;
import id.hcid.spring.exercise.service.IAddIncome;
import id.hcid.spring.exercise.service.IGetIncome;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/income")
public class IncomeController {

    @Autowired
    private IAddIncome addIncomeService;

    @Autowired
    private IGetIncome getIncomeService;

    @PostMapping
    public ResponseEntity<AddIncomeResponseDTO> addIncome(@RequestBody List<AddIncomeRequestDTO> expense){
        AddIncomeResponseDTO result = addIncomeService.addIncome(expense);
        return new ResponseEntity<AddIncomeResponseDTO>(result, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<GetIncomeResponseDTO>> getIncome(){
        return new ResponseEntity<List<GetIncomeResponseDTO>>(getIncomeService.getIncome(), HttpStatus.OK);
    }
}
