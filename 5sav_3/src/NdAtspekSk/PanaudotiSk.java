package NdAtspekSk;

public class PanaudotiSk implements Comparable<PanaudotiSk> {
	public int inSk;

	public PanaudotiSk(int inSk) {
		this.inSk = inSk;
	}

	public int getInSk() {
		return inSk;
	}

	public void setInSk(int inSk) {
		this.inSk = inSk;
	}
 
	@Override
	public boolean equals(Object obj) {
		return (this.inSk==((PanaudotiSk) obj).inSk);
	}
	
	@Override
	public int compareTo(PanaudotiSk o) {
		if (this.inSk>o.inSk) return 1;
		if (this.inSk<o.inSk) return -1;
		
		return 0;
	}
	
	


	
	

}
