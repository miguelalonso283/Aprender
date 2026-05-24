package Excepciones.Ejercicio6;

public class Principal {
    static void main(String[] args) {
        Banco b1 = new Banco("7BG45",25000);

        try {
            b1.retirarDinero(30000);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }
}
