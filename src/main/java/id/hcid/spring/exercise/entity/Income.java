package id.hcid.spring.exercise.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Income {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;
    private Long amount;

    @Temporal(TemporalType.TIMESTAMP)
    private Date incomeOn;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Date getIncomeOn() {
        return incomeOn;
    }

    public void setIncomeOn(Date incomeOn) {
        this.incomeOn = incomeOn;
    }
}
