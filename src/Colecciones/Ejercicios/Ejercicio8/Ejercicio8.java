package Colecciones.Ejercicios.Ejercicio8;

import java.util.Scanner;
import java.util.TreeSet;

public class Ejercicio8 {

    public static TreeSet<Integer> numerosEnteros() {

        Scanner s = new Scanner(System.in);
        TreeSet<Integer> lista = new TreeSet<>();

        boolean valido = true;

        while (valido) {

            if (!s.hasNextInt()) {
                System.out.println("Error al leer el número, vuelve a escribirlo: ");
                s.next();
            }
            else {
                int num = s.nextInt();
                if (num == 0) {
                    valido = false;
                } else if (lista.contains(num)) {
                    System.out.println("Ese número ya existe");
                } else {
                    lista.add(num);
                }
            }
        }
        return lista;
    }

    static void main(String[] args) {
        TreeSet<Integer> lista = numerosEnteros();
        System.out.println(lista);
        System.out.println(lista.descendingSet());
    }

}
