package id.hcid.spring.exercise.model.request;

import java.io.Serializable;
import java.util.Date;

public class GetExpenseDateRequestDTO implements Serializable {
    private Long expenseTotal;
    private Date expenseFrom;
    private Date expenseTo;

    public Date getExpenseFrom() {
        return expenseFrom;
    }

    public void setExpenseFrom(Date expenseFrom) {
        this.expenseFrom = expenseFrom;
    }

    public Date getExpenseTo() {
        return expenseTo;
    }

    public void setExpenseTo(Date expenseTo) {
        this.expenseTo = expenseTo;
    }

    public Long getExpenseTotal() {
        return expenseTotal;
    }

    public void setExpenseTotal(Long expenseTotal) {
        this.expenseTotal = expenseTotal;
    }
}
