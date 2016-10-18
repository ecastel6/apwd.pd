package es.upm.miw.pd.visitor.figure.solution;

public abstract class Visitor {
	public abstract void visitTriangle(Triangle e);

	public abstract void visitCircle(Circle e);

	public abstract void visitSquare(Square e);
	
}
