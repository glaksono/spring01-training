package id.hcid.spring.exercise.model.request;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

public class GetExpenseDateRequestDTO implements Serializable {
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date expenseFrom;

    @JsonFormat(pattern="yyyy-MM-dd")
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
}
