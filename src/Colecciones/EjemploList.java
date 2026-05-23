package Colecciones;

import java.util.ArrayList;
import java.util.List;

public class EjemploList {
    static void main(String[] args) {

        List<String> listEjemplo = new ArrayList<>();

        //ADD:
        listEjemplo.add("Caja 1"); // Elemento 0
        listEjemplo.add("Caja 2"); // Elemento 1
        listEjemplo.add("Caja 3"); // Elemento 2
        listEjemplo.add("Caja 4"); // Elemento 3

        //SIZE:
        System.out.println(listEjemplo.size());

        //GET:
        String caja = listEjemplo.get(1);
        System.out.println(caja);

        //CONTAINS:
        boolean encontrado = listEjemplo.contains("Caja 4");
        System.out.println(encontrado);
        boolean noencontrado = listEjemplo.contains("randomtext");
        System.out.println(noencontrado);

        //REMOVE:
        listEjemplo.remove(2);
        System.out.println(listEjemplo.size()); // Uno menos

        listEjemplo.add("Caja 3");

        for (int i = 0; i < listEjemplo.size(); i++) {
            System.out.println(listEjemplo.get(i));
        }
    }
}
