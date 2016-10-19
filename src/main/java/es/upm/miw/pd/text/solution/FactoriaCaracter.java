package es.upm.miw.pd.text.solution;

import java.util.HashMap;
import java.util.Map;

public class FactoriaCaracter {
    private Map<Character, Caracter> mapCharacters;

    private static FactoriaCaracter characterFactory;

    private FactoriaCaracter() {
        this.mapCharacters = new HashMap<>();
    }

    public static FactoriaCaracter getFactoria() {
        if (characterFactory == null) {
            characterFactory = new FactoriaCaracter();
        }
        return characterFactory;
    }

    public Caracter get(char key) {
        return mapCharacters.get(key);
    }
}
