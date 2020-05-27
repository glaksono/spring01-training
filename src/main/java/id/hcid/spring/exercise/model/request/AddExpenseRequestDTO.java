package id.hcid.spring.exercise.model.request;

import java.io.Serializable;

public class AddExpenseRequestDTO implements Serializable {
    private String description;
    private Long amount;

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

}
