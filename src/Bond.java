public class Bond {
    private String instrument;
    private int shares;
    private Dollar price;

    public Bond(String instrument, int shares, Dollar price) {

        this.instrument = instrument;
        this.shares = shares;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bond{" +
                "instrument='" + instrument + '\'' +
                ", shares=" + shares +
                ", price=" + price +
                '}';
    }
}
