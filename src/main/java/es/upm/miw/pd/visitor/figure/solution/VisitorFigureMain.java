package es.upm.miw.pd.visitor.figure.solution;

import java.util.ArrayList;
import java.util.Collection;

import upm.jbb.IO;

public class VisitorFigureMain {
	private static Collection<Figure> coleccion = new ArrayList<Figure>();

	public VisitorFigureMain() {
		coleccion.add(new Circle("circle1", 2.1));
		coleccion.add(new Triangle("Triangle1", 2.0, 3.0));
		coleccion.add(new Square("Square1", 4.2));
	}

	public void VisitorArea () {
		VisitorArea visitorArea = new VisitorArea();
		for (Figure figure : coleccion) {
			figure.accept(visitorArea);
		}
		System.out.println("Total Figures Area= " + visitorArea.getArea());
	}

	public static void main(String[] args) {
		IO.getIO().addView(new VisitorFigureMain());
	}

}
