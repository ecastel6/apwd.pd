package es.upm.miw.pd.factoryMethod.naturalNumber.solution;

public class NumberEs extends Number {
    private static String[] description = {"CERO", "UNO", "DOS", "TRES", "CUATRO", "CINCO"};

    public NumberEs(int value) {
        super(value, description);
    }

}
