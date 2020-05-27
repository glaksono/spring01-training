package id.hcid.spring.exercise.model.response;


import java.io.Serializable;
import java.util.Date;

public class GetExpenseResponseDTO implements Serializable {
    private String description;
    private Long amount;
    private Date expenseOn;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Date getExpenseOn() {
        return expenseOn;
    }

    public void setExpenseOn(Date expenseOn) {
        this.expenseOn = expenseOn;
    }
}
