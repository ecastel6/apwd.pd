package es.upm.miw.pd.visitor.figure.solution;

public class Square implements Figure {

    private double side;

    public Square(String description, double side) {
        this.setSide(side);
    }

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public void accept(Visitor v) {
		v.visitSquare(this);
		
	}

//    @Override
//    public double area() {
//        return side * side;
//    }
//
//    @Override
//    public double numberOfSides() {
//        return 4;
//    }

}
