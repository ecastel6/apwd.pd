package es.upm.miw.pd.factoryMethod.naturalNumber.solution;

public class NaturalNumbersMain {
    private static NaturalNumberManager manager = new NaturalNumberManager();

    public static void main(String[] args) {
        NumberCreator es = new NumberCreatorEs();
        NumberCreator en = new NumberCreatorEn();
        
        manager.setCreator(es);
        manager.setNumber(0);
        System.out.println(manager.getNumber().getDescription());

        manager.setCreator(en);
        manager.setNumber(1);
        System.out.println(manager.getNumber().getDescription());
        
        manager.setCreator(es);
        manager.setNumber(2);
        System.out.println(manager.getNumber().getDescription());
        
    }

}
