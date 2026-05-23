package Colecciones.Ejercicios;

import java.util.ArrayList;

public class Ejercicio1 {

    public static ArrayList<Integer> numerosAleatorios() {

        ArrayList<Integer> lista = new ArrayList<>();

        int numAleatorio = (int)Math.floor(Math.random()*(20-10+1)+10);

        for (int i = 0; i < numAleatorio; i++) {
            lista.add((int)(Math.floor(Math.random()*(100+1))));
        }
        return lista;
    }

    public static int suma(ArrayList<Integer> lista) {

        int sumaNumeros=0;

        for (int i = 0; i < lista.size(); i++) {
            sumaNumeros += lista.get(i);
        }

        return sumaNumeros;
    }

    public static void borrarPares(ArrayList<Integer> lista) {

        for (int i = lista.size() -1; i >= 0; i--) {
            if (lista.get(i)%2 == 0) {
                Integer e = lista.remove(i);
            }
        }
    }

    public static void reemplazarDiv3(ArrayList<Integer> lista) {

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i)%3 == 0) {
                lista.set(i,0);
            }
        }
    }

    public static void reemplazarDiv5(ArrayList<Integer> lista) {

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i)%5 == 0 && lista.get(i)!=0) {
                lista.set(i-1,555);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = numerosAleatorios();
        System.out.println(lista);
        System.out.println(suma(lista));
        ArrayList<Integer> listaBorrarPares = new ArrayList<>(lista);
        borrarPares(listaBorrarPares);
        System.out.println(listaBorrarPares);
        ArrayList<Integer> listaReemplazar3 = new ArrayList<>(lista);
        reemplazarDiv3(listaReemplazar3);
        System.out.println(listaReemplazar3);
        ArrayList<Integer> listaReemplazar5 = new ArrayList<>(lista);
        reemplazarDiv5(listaReemplazar5);
        System.out.println(listaReemplazar5);

    }
}
