import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

class ReportTest {


    @Test
    public void generateReport(){

        LinkedList<Bond> bonds = new LinkedList<Bond>();
        bonds.add(new Bond("Integral", 300, new Dollar(2.5)));
        bonds.add(new Bond("Autonomic", 123, new Dollar(4.38)));
        Report report = new Report(bonds);
        Approvals.verify(report);


    }
}