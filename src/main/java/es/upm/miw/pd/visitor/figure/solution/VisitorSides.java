package es.upm.miw.pd.visitor.figure.solution;

import es.upm.miw.pd.visitor.figure.solution.Circle;
import es.upm.miw.pd.visitor.figure.solution.Square;
import es.upm.miw.pd.visitor.figure.solution.Triangle;
import es.upm.miw.pd.visitor.figure.solution.Visitor;

public class VisitorSides extends Visitor {
	public double totalSides=0.0;
	
	@Override
	public void visitTriangle(Triangle e) {
		this.totalSides+=e.getNumSides();

	}

	@Override
	public void visitCircle(Circle e) {
		this.totalSides+=e.getNumSides();
	}

	@Override
	public void visitSquare(Square e) {
		this.totalSides+= e.getNumSides();

	}

	public double getTotalSides() {
		return this.totalSides;
	}

}
