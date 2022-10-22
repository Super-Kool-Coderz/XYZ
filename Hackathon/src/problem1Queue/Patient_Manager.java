package problem1Queue;

import java.util.ArrayList;

public class Patient_Manager {

    private static ArrayList<Patient> patients = new ArrayList<Patient>();

    public static void main(String[] args){
        System.out.println("Hello");
    }

    public static void addPatient(Patient p){
        if (patients.contains(p)){
            //TODO: update status
        }
    }
}
