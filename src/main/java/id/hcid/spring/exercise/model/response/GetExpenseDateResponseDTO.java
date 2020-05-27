package id.hcid.spring.exercise.model.response;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

public class GetExpenseDateResponseDTO implements Serializable {
    private Long expenseTotal;

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date expenseFrom;

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date expenseTo;

    public Long getExpenseTotal() {
        return expenseTotal;
    }

    public void setExpenseTotal(Long expenseTotal) {
        this.expenseTotal = expenseTotal;
    }

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
