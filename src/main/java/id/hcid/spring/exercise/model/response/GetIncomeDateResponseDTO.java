package id.hcid.spring.exercise.model.response;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

public class GetIncomeDateResponseDTO implements Serializable {
    private Long incomeTotal;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date incomeFrom;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date incomeTo;

    public Long getIncomeTotal() {
        return incomeTotal;
    }

    public void setIncomeTotal(Long incomeTotal) {
        this.incomeTotal = incomeTotal;
    }

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
