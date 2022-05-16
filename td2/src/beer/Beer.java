package beer;

public abstract class Beer {
	public double beerEBC() { return 2.939*Math.pow(MCU(), 0.6859); }
	public abstract double MCU();
}

/***
 * calcul du MCU seulement adapté pour bière single malt
***/
 