public class Bond {
    private String instrument;
    private int shares;
    private Dollar price;

    public Bond(String instrument, int shares, Dollar price) {

        this.instrument = instrument;
        this.shares = shares;
        this.price = price;
    }

    public String getInstrument() {
        return this.instrument;
    }

    public int getShares() {
        return this.shares;
    }

    public Dollar getPrice() {
        return this.price;
    }

    public Dollar getTotal() {
        return this.price.times(this.shares);
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
