package beer;

public class SingleMaltBeer extends Beer {
	private double maltWeight; //KG
	private double beerVolume; //L
	private Malt malt;
	
	
	public SingleMaltBeer(double maltWeight, double beerVolume, Malt malt) {
		this.maltWeight = maltWeight;
		this.beerVolume = beerVolume;
		this.malt = malt;
	}
	
	public double getMaltWeight() {return maltWeight;}
	public double getBeerVolume() {return beerVolume;}
	public double getMaltEBC() {return malt.getEBC();}
	
	public double MCU() {
		return 4.23*this.getMaltEBC()*this.getMaltWeight()/this.getBeerVolume();
	}
}
