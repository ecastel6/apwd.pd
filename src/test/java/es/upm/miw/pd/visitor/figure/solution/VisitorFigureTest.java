package es.upm.miw.pd.visitor.figure.solution;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;

public class VisitorFigureTest {
    private Collection<Figure> coleccion = new ArrayList<Figure>();

    @Test
    public void testVisitorAreas() {
        coleccion.add(new Circle("Circle1", 2.1));
        coleccion.add(new Triangle("Triangle1", 2.0, 3.0));
        coleccion.add(new Square("Square1", 4.2));

        VisitorArea visitorArea = new VisitorArea();
        for (Figure figure : coleccion) {
            figure.accept(visitorArea);
        }
        assertEquals(34.49442, visitorArea.getArea(), 10e-5);
    }

    @Test
    public void testVisitorSides() {
        coleccion.add(new Triangle("Triangle1", 2.0, 3.0));
        coleccion.add(new Square("Square1", 4.2));
        coleccion.add(new Triangle("Triangle2", 5.0, 2.0));

        VisitorSides visitorSides = new VisitorSides();
        for (Figure figure : coleccion) {
            figure.accept(visitorSides);
        }
        assertEquals(10.0, visitorSides.getTotalSides(), 10e-10);
    }

}
