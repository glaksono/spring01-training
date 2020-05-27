package id.hcid.spring.exercise.model.request;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class GetExpenseListByDateRequestDTO {
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date requestFrom;

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date requestTo;

    public Date getRequestFrom() {
        return requestFrom;
    }

    public void setRequestFrom(Date requestFrom) {
        this.requestFrom = requestFrom;
    }

    public Date getRequestTo() {
        return requestTo;
    }

    public void setRequestTo(Date requestTo) {
        this.requestTo = requestTo;
    }
}
