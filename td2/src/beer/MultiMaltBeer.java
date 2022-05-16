package beer;

import java.util.ArrayList;
import java.util.HashMap;

public class MultiMaltBeer extends Beer {
	private double beerVolume; //L
	private ArrayList<Malt> malts;
	private HashMap<Malt,Double> maltWeight;
	
	public double getMaltWeight() { 
		double som = 0;
		
		for(Double d: maltWeight.values()) {
			som += d.doubleValue();
		}	
		
		return som; 
	}
	public double getBeerVolume() {return beerVolume;}
	public double getMaltEBC() {
		double som = 0;
		for(Malt m : malts) {
			som += m.getEBC();
		}
		
		return som;
	}
	
	public void ajoutIngredient(Malt malt, double poids) {
		maltWeight.put(malt, poids);
	}

	@Override
	public double MCU() {
		return 4.23*this.getMaltEBC()*this.getMaltWeight()/this.getBeerVolume();
	}

}
