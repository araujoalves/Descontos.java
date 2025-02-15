package financas_pessoais;

import java.util.Date;

public class Transfer implements FinancialTransaction {
    private double value;
    private Date date;
    private String description;

    public Transfer(double value, Date date, String description) {
        this.value = value;
        this.date = date;
        this.description = description;
    }

    public double getValue() {
        return -this.value; // negative value for outgoing transactions
    }

    public Date getDate() {
        return this.date;
    }

    public String getDescription() {
        return this.description;
    }
}