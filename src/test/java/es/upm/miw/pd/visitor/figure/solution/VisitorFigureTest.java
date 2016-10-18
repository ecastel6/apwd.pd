package es.upm.miw.pd.visitor.figure.solution;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

public class VisitorFigureTest {
    private Collection<Figure> coleccion = new ArrayList<Figure>();

    @Before
    public void ini() {
        coleccion.add(new Circle("circle1",2.1));
        coleccion.add(new Triangle("Triangle1",2.0,3.0));
        coleccion.add(new Square("Square1",4.2));
    }

    @Test
    public void testVisitorAreas() {
    	VisitorArea visitorArea = new VisitorArea();
        for (Figure figure : coleccion) {
            figure.accept(visitorArea);
        }
        assertEquals(34.49442, visitorArea.getArea(),10e-5);
   }
}
