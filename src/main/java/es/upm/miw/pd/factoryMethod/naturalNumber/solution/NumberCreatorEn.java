package es.upm.miw.pd.factoryMethod.naturalNumber.solution;

public class NumberCreatorEn extends NumberCreator {

    @Override
    public Number createNumber(int number) {
        return new NumberEn(number);
    }

}
