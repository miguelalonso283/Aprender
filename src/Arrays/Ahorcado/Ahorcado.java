package Arrays.Ahorcado;

import java.awt.*;
import java.util.Scanner;

public class Ahorcado {
    static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        String palabraSecreta = "astronauta";
        int intentosMax = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        for (int i = 0; i < palabraSecreta.length(); i++) {
            letrasAdivinadas[i] = '_';
        }

        do {
            System.out.print("Palabra actual: ");
            for (char c : letrasAdivinadas)
                System.out.print(c + " ");
            System.out.println("\nIntroduce una letra o la palabra");
            //Escribir la letra o Palabra
            String letraOPalabra = teclado.nextLine();

            if (letraOPalabra.length()==1) {
                boolean letraContenida = false;

                for (int i = 0; i < palabraSecreta.length(); i++) {
                    String caracterAct = String.valueOf(palabraSecreta.charAt(i));
                    if (caracterAct.equalsIgnoreCase(letraOPalabra)) {
                        letraContenida = true;
                        letrasAdivinadas[i] = letraOPalabra.charAt(0);
                        System.out.println("Acertaste. Está en la posición: " + i);
                    }
                }
                if (!letraContenida) {
                    intentos++;
                    System.out.println("Esa letra no está contenida en la palabra");
                }

            } else if (letraOPalabra.equalsIgnoreCase(palabraSecreta)) {
                palabraAdivinada = true;
                System.out.println("¡Palabra adivinada!");
            } else {
                intentos++;
                System.out.println("Palabra introducida errónea");
            }

            boolean quedanGuiones = false;
            for (char c : letrasAdivinadas) {
                if (c == '_') {
                    quedanGuiones = true;
                    break;
                }
            }
            if (!quedanGuiones) {
                palabraAdivinada = true;
                System.out.println("¡Felicidades, descubriste todas las letras! " +
                        "\nPalabra secreta: "+palabraSecreta);

            }

        } while (!palabraAdivinada && intentos <= 10);
        if (intentos == 11)
            System.out.println("Te quedaste sin más intentos, imbécil");
    }
}

