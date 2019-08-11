import java.sql.Date;

public class Expense {
    private String uuid;
    private String payer; // TODO User class
    private Date date;
    private double amount;
    private String description;
    private String login;
    private String password;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getLogin() { return login; }

    public void  setLogin(String login) { this.login = login; }

    public String getPassword() { return password; }

    public void  setPassword(String password) {

        this.password = password; }

    public String getPayer() {
        return payer;
    }

    public void setPayer(String payer) {
        this.payer = payer;
    }

    public java.sql.Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "uuid='" + uuid + '\'' +
                ", payer='" + payer + '\'' +
                ", date=" + date +
                ", amount=" + amount +
                ", login=" + login + '\'' +
                ", paswword=" + password + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}