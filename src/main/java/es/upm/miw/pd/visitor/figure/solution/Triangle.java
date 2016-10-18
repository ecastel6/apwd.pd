package es.upm.miw.pd.visitor.figure.solution;

public class Triangle implements Figure {
    private double base;

    private double height;

    public Triangle(String description, double base, double height) {
        this.setBase(base);
        this.setHeight(height);
    }

//    @Override
//    public double area() {
//        return base * height * 0.5;
//    }
//
//    @Override
//    public double numberOfSides() {
//        return 3;
//    }

	@Override
	public void accept(Visitor v) {
		v.visitTriangle(this);
		
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}
