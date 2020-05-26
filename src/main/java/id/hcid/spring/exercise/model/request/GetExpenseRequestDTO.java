package id.hcid.spring.exercise.model.request;

import java.io.Serializable;
import java.util.Date;

public class GetExpenseRequestDTO implements Serializable {
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
