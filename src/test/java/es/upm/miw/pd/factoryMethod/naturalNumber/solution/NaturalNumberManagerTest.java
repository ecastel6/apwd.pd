package es.upm.miw.pd.factoryMethod.naturalNumber.solution;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NaturalNumberManagerTest {
    private static NaturalNumberManager manager = new NaturalNumberManager();
        NumberCreator es = new NumberCreatorEs();
        NumberCreator en = new NumberCreatorEn();


    @Test
    public void testSetCreatorSetNumberEs() {
        manager.setCreator(es);
        manager.setNumber(0);
        assertEquals("CERO", manager.getNumber().getDescription());
    }
    
    @Test
    public void testSetCreatorSetNumberEn() {
        manager.setCreator(en);
        manager.setNumber(2);
        assertEquals("TWO", manager.getNumber().getDescription());
    }

}
