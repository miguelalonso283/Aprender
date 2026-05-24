package Colecciones;

import java.util.Iterator;
import java.util.LinkedList;

public class EjemploIterator {
    static void main(String[] args) {
        LinkedList<Integer> A = new LinkedList<Integer>();

        A.add(78);
        A.add(76);
        A.add(45);
        A.add(123);
        A.add(96);

        Iterator it = A.iterator();

        //Para recorrer la lista:
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
