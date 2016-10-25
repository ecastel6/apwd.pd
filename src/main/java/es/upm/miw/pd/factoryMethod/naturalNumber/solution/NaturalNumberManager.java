package es.upm.miw.pd.factoryMethod.naturalNumber.solution;

public class NaturalNumberManager {
    private Number number;

    private NumberCreator creator;

    public Number getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = this.creator.createNumber(number);
    }

    public NumberCreator getCreator() {
        return creator;
    }

    public void setCreator(NumberCreator creator) {
        this.creator = creator;
    }

}
