package maps;

public class SID implements Comparable<SID> {
	public Integer nr;
	public Integer gNr;

	public SID(int nr, int gNr) {
		this.nr = nr;
		this.gNr = gNr;
	}

	public int getNr() {
		return nr;
	}

	public void setNr(int nr) {
		this.nr = nr;
	}

	public int getgNr() {
		return gNr;
	}

	public void setgNr(int gNr) {
		this.gNr = gNr;
	}

	@Override
	public String toString() {
		return "[" + gNr + ", " + nr + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (gNr==((SID)obj).gNr) {
			return nr==((SID)obj).nr;
		}else {
			return false;
		}
		
	}

	@Override
	public int compareTo(SID o) {
		if (gNr==o.gNr) {
			return nr.compareTo(o.nr);
		}else {
			return gNr.compareTo(o.gNr);
		}
		
	}
	
	

}
