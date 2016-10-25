package es.upm.miw.pd.visitor.figure.solution;

public class Circle implements Figure {

    private double radius;

    private double numSides;

    public Circle(String description, double radius) {
        this.radius = radius;
        this.numSides = Double.POSITIVE_INFINITY;
    }

    public double getRadius() {
        return radius;
    }

    public double getNumSides() {
        return numSides;
    }

    @Override
    public void accept(Visitor v) {
        v.visitCircle(this);
    }
}
