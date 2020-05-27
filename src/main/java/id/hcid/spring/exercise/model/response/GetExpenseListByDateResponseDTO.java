package id.hcid.spring.exercise.model.response;

import java.util.List;

public class GetExpenseListByDateResponseDTO {
    private List<GetExpenseResponseDTO> expense;

    public List<GetExpenseResponseDTO> getExpense() {
        return expense;
    }

    public void setExpense(List<GetExpenseResponseDTO> expense) {
        this.expense = expense;
    }
}
