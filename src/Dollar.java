import java.util.Objects;

public class Dollar {
    private double amount;

    public Dollar(double amount) {

        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Dollar{" +
                "amount=" + amount +
                '}';
    }
}
