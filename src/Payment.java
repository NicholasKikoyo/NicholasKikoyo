public class Payment {
    String month;
    String type;
    int year;
    int id;
    int amount;

    public Payment(String month, int year, int id, int amount) {
        this.month = month;
        this.type = type;
        this.year = year;
        this.id = id;
        this.amount = amount;
    }

    public String getmonth() {
        return month;
    }

    public String gettype() {
        return type;
    }

    public int getYear() {
        return year;
    }

    public int getId() {
        return id;
    }

    public int getAmount() {

        return amount;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "amount=" + amount + ", month=" + month + ", year=" + year + ", type='" + type + '\'' + '}';


    }
}