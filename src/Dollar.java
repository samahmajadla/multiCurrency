import java.util.Objects;

public class Dollar {
    private double amount;

    public Dollar(double amount) {

        this.amount = amount;
    }

    public double amount() {
        return amount;
    }

    public Dollar plus(Dollar toAdd) {
        return new Dollar(amount() + toAdd.amount());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dollar dollar = (Dollar) o;
        return Double.compare(dollar.amount, amount) == 0;
    }

    public Dollar times(int toMultiply) {
        return new Dollar(amount() * toMultiply);
    }

    @Override
    public String toString() {
        return "Dollar{" +
                "amount=" + amount +
                '}';
    }
}
