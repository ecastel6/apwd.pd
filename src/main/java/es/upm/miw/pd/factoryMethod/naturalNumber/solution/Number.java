package es.upm.miw.pd.factoryMethod.naturalNumber.solution;

public abstract class Number {
    private int value;

    private String[] description;

    public Number(int value, String[] description) {
        this.value = value;
        this.description = description;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        assert value >= 0;
        this.value = value;

    }

    public void add(int value) {
        this.setValue(value + this.getValue());
    }

    public String getDescription() {
        if (this.value < description.length) {
            return description[this.value];
        } else {
            return "???";
        }
    }

}
