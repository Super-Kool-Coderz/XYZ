package problem1Queue;

import java.util.Comparator;
public class PatientNameComparator implements Comparator<Patient> {

    @Override
    public int compare(Patient p1, Patient p2){
        return p1.getName().compareTo(p2.getName());
    }

}


