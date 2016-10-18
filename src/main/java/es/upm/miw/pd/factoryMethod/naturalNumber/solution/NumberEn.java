package es.upm.miw.pd.factoryMethod.naturalNumber.solution;

public class NumberEn extends Number {
    private static String[] description = {"ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE"};

    public NumberEn(int value) {
        super(value, description);
    }

}
