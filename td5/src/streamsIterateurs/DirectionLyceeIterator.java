package streamsIterateurs;

import java.util.Iterator;

public class DirectionLyceeIterator implements Iterator<EmployeLycee>{
	
	private DirectionLycee d;
	private int i;

	public DirectionLyceeIterator(DirectionLycee d) {
		super();
		this.d = d;
		this.i = 0;
	}

	@Override
	public boolean hasNext() {
		if (i >= 5) {
			return false;
		}
		return true;
	}

	@Override
	public EmployeLycee next() {
		EmployeLycee e = null;
		if(i == 0) {
			e = this.d.getProviseur();
		} else if (i == 1) {
			e = this.d.getProviseurAdjoint();
		} else if (i == 2) {
			e = this.d.getConseillerPrincipaldEducation();
		} else if (i == 3) {
			e = this.d.getGestionnaire();
		} else { //i == 4
			e = this.d.getChefDeTravaux();
		}
		
		i++;
		return e;
	}
	
}
