import java.util.ArrayList;
import java.util.Scanner;

import java.io.File;
import java.io.FileNotFoundException;

public class PatientManger {
	static ArrayList<Patient> patients = new ArrayList<Patient>();
	static Scanner scnr;
	
	public static void main(String[] args) {
		
	}
	
	public static void addPatient(Patient p) {
		if (patients.contains(p)) {
			p.setRoomStatus("Waiting");
		}
		else {
			createAccount();
		}
	}
	
	public static void createAccount() {
		File file = new File();
		try {
			while (scnr.hasNextLine()) {
				
			}
		}
	}
}