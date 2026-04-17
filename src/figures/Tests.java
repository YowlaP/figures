package figures;

import figures.deuxD.Rectangle;
import figures.deuxD.Triangle;
import point.Point2D;
import point.Point3D;

public class Tests {

	private static void testPoints() {
		Point2D p1 = new Point2D();
		p1.afficher();
		p1.translater(2, 3);
		p1.afficher();
		Point2D p2 = new Point2D();
		p2.afficher();
		p2.translater(2, 3);
		p2.afficher();
		
		if(p1 == p2) {
			System.out.println( "p1 == p2");
		}else {
			System.out.println("p1 diff de p2");
		}
		
		if(p1.equals(p2)) {
			System.out.println("p1 == p2");
		}else {
			System.out.println("p1 diff de p2");
		}
		
		System.out.println(p1.egale(p2));
		System.out.println(p1.equals(p2));
		
		System.out.println(p1.getClass() == p2.getClass());
		
		Point2D p3 = new Point2D(p1);
		p3.afficher();
		p3.translater(2, 0);
		p3.afficher();
		p1.afficher();
		
		System.out.println("Dist entre p1 et p3 (static) : " + Point2D.distance(p1, p3));
		System.out.println("Dist entre p1 et p3 : " + p1.distance(p3));
		
		System.out.println("Appel fct translater : " + Point2D.getCpt());
		
		Point3D p5 = new Point3D(1,1,1);
		System.out.println(p5);
		p5.afficher();
		System.out.println(p5);
		p5.translater(2, 4);
		p5.afficher();
		
	}
	
	private static void testFormes() {
		Forme[] tabF = new Forme[4];
		tabF[0] = new Triangle(3,3,3,3);
		tabF[1] = new Rectangle(4,4);
		
		tabF[0].affiche();
		tabF[1].affiche(); 
		// ces deux lignes sont du polymorphisme avec la méthode affiche qui a bien été redéfinie
	}
	
	
	public static void main(String[] args) {
		
		testPoints();
		testFormes();
	}

}
