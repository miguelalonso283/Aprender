package Colecciones;

import java.util.HashMap;
import java.util.Map;

public class EjemploMap {
    static void main(String[] args) {
        Map<String, Integer> m = new HashMap<>();

        m.put("1",20);
        m.put("2",50);
        m.put("3",30);
        m.put("4",70);

        for (Map.Entry<String, Integer> si : m.entrySet()) {
            System.out.println("Llave: "+si.getKey()+" Valor: "+si.getValue());
        }
    }
}
