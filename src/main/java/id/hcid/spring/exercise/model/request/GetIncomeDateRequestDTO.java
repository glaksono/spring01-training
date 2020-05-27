package id.hcid.spring.exercise.model.request;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class GetIncomeDateRequestDTO {
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date incomeFrom;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date incomeTo;

    public Date getIncomeFrom() {
        return incomeFrom;
    }

    public void setIncomeFrom(Date incomeFrom) {
        this.incomeFrom = incomeFrom;
    }

    public Date getIncomeTo() {
        return incomeTo;
    }

    public void setIncomeTo(Date incomeTo) {
        this.incomeTo = incomeTo;
    }
}
