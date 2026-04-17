package figures.deuxD;

public class Rectangle extends DeuxDimensions{
	
	private double L, l;
	
	public Rectangle(double L, double l) {
		
		this.L = L;
		this.l = l;
	}

	@Override
	public double perimetre() {
		
		return 2 * (L + l);
	}

	@Override
	public void affiche() {
		System.out.println("Rectangle : " + L + " " + l);
		
	}

	@Override
	public double aire() {
		return L * l;
	}
	

}
