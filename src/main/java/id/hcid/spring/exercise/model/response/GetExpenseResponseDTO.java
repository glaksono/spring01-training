package id.hcid.spring.exercise.model.response;


public class GetExpenseResponseDTO {
    private String expense;
    private Long amount;

    public String getExpense() {
        return expense;
    }

    public void setExpense(String expense) {
        this.expense = expense;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }
}
