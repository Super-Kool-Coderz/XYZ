public class Comparators {
	public int compareNames(Patient p1, Patient p2) {
		return p1.getName().compareTo(p2.getName());
	}
	
	public Patient compareRanks(Patient p1, Patient p2) {
		if (p1.getRank() > p2.getRank()) {
			return p1;
		}
		return p2;
	}
}