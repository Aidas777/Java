package NdTelefKn;

public class Pavarde implements Comparable<Pavarde>{
	public String pavarde;

	public Pavarde(String pavarde) {
		this.pavarde = pavarde;
	}

	public String getPavarde() {
		return pavarde;
	}

	public void setPavarde(String pavarde) {
		this.pavarde = pavarde;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (pavarde.equals(((Pavarde) obj).pavarde)) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public int compareTo(Pavarde o) {
		return pavarde.compareTo(o.pavarde);
	}

	@Override
	public String toString() {
		return pavarde;
	}
	
	
	
	
}
