package id.hcid.spring.exercise.model.response;


import java.io.Serializable;
import java.util.Date;

public class GetExpenseResponseDTO implements Serializable {
    private String expense;
    private Long amount;

    public String getExpense() {
        return expense;
    }

    public void setExpense(String expense) {
        this.expense = expense;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }
}
