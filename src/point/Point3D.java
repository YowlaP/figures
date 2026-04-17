package point;

public class Point3D extends Point2D {
	
	private int z;
	
	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	
	
	@Override
	public void afficher() {
		super.afficher();
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		String s = "[";
		
		s += super.toString();
		s += ", " + z + "]";
		
		return s;
	}
	
	@Override
	public void translater(int dx, int dy) {  // pas obligatoire
		super.translater(dx, dy);
		// z ?
		this.z += (dx + dy) / 2; // inventé
	}
	
	public void translater(int dx, int dy, int dz) {
		super.translater(dx, dy);
		// z ?
		this.z += dz;
	}
}
