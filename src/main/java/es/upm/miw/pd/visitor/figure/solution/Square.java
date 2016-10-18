package es.upm.miw.pd.visitor.figure.solution;

public class Square implements Figure {

    private static final int SQUARESIDES = 4;

    private double side;

    private int numSides;

    public Square(String description, double side) {
        this.side = side;
        this.numSides = SQUARESIDES;
    }

    public double getSide() {
        return side;
    }

    public int getNumSides() {
        return this.numSides;
    }

    @Override
    public void accept(Visitor v) {
        v.visitSquare(this);

    }

}
