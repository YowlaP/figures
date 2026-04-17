package figures.deuxD;

public class Triangle extends DeuxDimensions {

	// base : c1
	// hauteur : h
	private double c1, c2, c3, h;
	
	public Triangle(double c1, double c2, double c3, double h) {
		
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
		this.h = h; // vérif ? Calculs ?
	
	}
	
	@Override
	public double perimetre() {
		
		return c1 + c2 + c3;
		
	}

	@Override
	public void affiche() {
		System.out.println("Triangle : " + c1 + " " + c2 + " " + c3 + " " + h);
		
	}

	@Override
	public double aire() {
		return (c1 * h) / 2;
	}

}
