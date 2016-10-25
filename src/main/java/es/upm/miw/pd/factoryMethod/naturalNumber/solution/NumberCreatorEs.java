package es.upm.miw.pd.factoryMethod.naturalNumber.solution;

public class NumberCreatorEs extends NumberCreator {

    @Override
    public Number createNumber(int number) {
        return new NumberEs(number);
    }

}
