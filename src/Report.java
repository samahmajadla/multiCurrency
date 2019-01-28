import java.util.List;

public class Report {
    private List<Bond> bonds;

    public Report(List<Bond> bonds) {
        this.bonds = bonds;
    }

    @Override
    public String toString() {
        return "Report{" +
                "bonds=" + bonds +
                '}';
    }
}
