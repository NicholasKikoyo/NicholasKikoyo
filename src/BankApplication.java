import java.util.HashSet;
import java.util.Set;

public class BankApplication {
    Set<Payment> payments = new HashSet<>();

    public BankApplication(Set<Payment> payments){
        this.payments = payments;
    }

    public static void main(String[] args) {

        Set<Payment> payments = new HashSet<>();
        payments.add(new Payment(1000, 10, 2020, "salary"));
        payments.add(new Payment(-100, 10, 2020, "transport"));
        payments.add(new Payment(-200, 10, 2020, "rent"));
        payments.add(new Payment(-10, 10, 2020, "cafe"));

        Comparator<Payment> amountComparator = (p1, p2) -> Integer.compare(p1.getAmount(), p2.getAmount());

        Optional<Payment> paymentOptional = payments.stream().filter(payment -> payment.amount < 0L).sorted(amountComparator).findFirst();

        System.out.println(paymentOptional);     }

}

