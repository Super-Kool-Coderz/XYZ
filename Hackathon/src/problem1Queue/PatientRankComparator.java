package problem1Queue;
import java.util.Comparator;


public class PatientRankComparator implements Comparator<Patient>{

    @Override
    public int compare(Patient p1, Patient p2){
        return p2.getRank()-p1.getRank();
    }

}
