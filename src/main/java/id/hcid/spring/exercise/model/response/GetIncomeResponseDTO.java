package id.hcid.spring.exercise.model.response;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class GetIncomeResponseDTO {
    private Date incomeOn;
    private Long amount;
    private String description;

    @JsonFormat(pattern="yyyy-MM-dd")
    public Date getIncomeOn() {
        return incomeOn;
    }

    public void setIncomeOn(Date incomeOn) {
        this.incomeOn = incomeOn;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}