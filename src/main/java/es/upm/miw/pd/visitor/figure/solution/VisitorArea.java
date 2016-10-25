package es.upm.miw.pd.visitor.figure.solution;

import es.upm.miw.pd.visitor.figure.solution.Circle;
import es.upm.miw.pd.visitor.figure.solution.Square;
import es.upm.miw.pd.visitor.figure.solution.Triangle;
import es.upm.miw.pd.visitor.figure.solution.Visitor;

public class VisitorArea extends Visitor {
    public double totalArea = 0;

    @Override
    public void visitTriangle(Triangle e) {
        this.totalArea += e.getBase() * e.getHeight() * 0.5;

    }

    @Override
    public void visitCircle(Circle e) {
        this.totalArea += Math.PI * Math.pow(e.getRadius(), 2);

    }

    @Override
    public void visitSquare(Square e) {
        this.totalArea += Math.pow(e.getSide(), 2);

    }

    public double getArea() {
        return this.totalArea;
    }

}
