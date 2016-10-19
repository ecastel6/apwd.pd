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
        if (mapCharacters.containsKey(key)) {
            return mapCharacters.get(key);
        }
        else 
        {
            Caracter newCar = new Caracter(key);
            mapCharacters.put(key,newCar);
            return newCar;
        }
    }
}
