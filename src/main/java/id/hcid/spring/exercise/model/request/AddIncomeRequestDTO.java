package id.hcid.spring.exercise.model.request;

public class AddIncomeRequestDTO {
    private Long amount;
    private String incomeName;

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getIncomeName() {
        return incomeName;
    }

    public void setIncomeName(String incomeName) {
        this.incomeName = incomeName;
    }
}
