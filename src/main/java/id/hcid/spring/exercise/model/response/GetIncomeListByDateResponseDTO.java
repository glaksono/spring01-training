package id.hcid.spring.exercise.model.response;

import java.util.Date;
import java.util.List;

public class GetIncomeListByDateResponseDTO {
    private List<GetIncomeResponseDTO> income;

    public List<GetIncomeResponseDTO> getIncome() {
        return income;
    }

    public void setIncome(List<GetIncomeResponseDTO> income) {
        this.income = income;
    }
}
