package es.upm.miw.pd.visitor.figure.solution;

public class Circle implements Figure {

    private double radius;

    public Circle(String description, double radius) {
        this.setRadius(radius);
    }

//    @Override
//    public double area() {
//        return Math.PI * radius * radius;
//    }

//    @Override
//    public double numberOfSides() {
//        return Double.POSITIVE_INFINITY;
//    }
//
	@Override
	public void accept(Visitor v) {
		v.visitCircle(this);
		
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

}
