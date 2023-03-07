package is.fg.geom;

import is.fg.figure.FigTriangolo;

/**
 * @author ludov
 * PATTERN ADAPTER - OBJECT
 *
 * Adapter
 */

public class Triangolo implements Figura2D {
	
	private FigTriangolo t;
	
	public Triangolo(double l1, double l2, double l3) {
		t = new FigTriangolo(l1, l2, l3);
	}
	public double area() {
		double s = perimetro()/2.0;
		return Math.sqrt(s*(s-t.getL1())*(s-t.getL2())*(s-t.getL3()));
	}

	public double perimetro() {
		return t.getL1() + t.getL2() + t.getL3();
	}

}
