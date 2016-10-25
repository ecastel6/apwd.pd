package es.upm.miw.pd.visitor.figure.solution;

public class Triangle implements Figure {
    private static final int TRIANGLESIDES = 3;

    private double base;

    private double height;

    private int numSides;

    public Triangle(String description, double base, double height) {
        this.base = base;
        this.height = height;
        this.numSides = TRIANGLESIDES;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public int getNumSides() {
        return this.numSides;
    }

    @Override
    public void accept(Visitor v) {
        v.visitTriangle(this);
    }
}
