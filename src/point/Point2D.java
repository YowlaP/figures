package point;

public class Point2D {
	
	private int x;
	private int y;
	
	private static int cpt = 0;
	
	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point2D(Point2D p) {
        this.x = p.x;
        this.y = p.y;
	}
	
	// Astuce : Il faut souvent recréer explicitement le constructeur par défaut (vide) 
    // s'il était utilisé ailleurs, car Java ne le fournit plus automatiquement !
    public Point2D() {
        this.x = 0;
        this.y = 0;
    }
	
	public void translater(int dx, int dy) {
		
		x += dx;
		y += dy;
		cpt ++;
	}
	
	public static int getCpt() {
		return cpt;
	}
	
	public static double distance(Point2D p1, Point2D p2) {
		
		return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
	}
	
	public double distance(Point2D p2) {
		
		return Math.sqrt(Math.pow(p2.x - this.x, 2) + Math.pow(p2.y - this.y, 2));
	}

	public void afficher() {
		
		System.out.println(toString());
		
	}
	
	public Boolean egale(Point2D p2) {
		if(x == p2.x && y == p2.y) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj == null) {
			return false;
		}
		
		if(this == obj) {
			return true;
		}
		
		Point2D pObj = (Point2D) obj;
		return (x == pObj.x) && (y == pObj.y);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(" + x + ", " + y + ")";
	}
}
