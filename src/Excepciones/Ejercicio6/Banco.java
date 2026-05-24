package Excepciones.Ejercicio6;

public class Banco {

    /*
    Crea una clase Banco con un método retirarDinero(double cantidad) que
    reduzca el saldo de una cuenta bancaria. Si la cantidad a retirar es
    mayor que el saldo disponible, el método debe lanzar una excepción
    SaldoInsuficienteException (una excepción personalizada).
    La excepción no debe capturarse en el método retirarDinero, sino en la
    clase Principal, donde se intente realizar un retiro. Si ocurre la
    excepción, se debe mostrar un mensaje de error indicando que el saldo
    es insuficiente.
     */

    private String cuenta;
    private double saldo;

    public Banco(String cuenta, double saldo) {
        this.cuenta = cuenta;
        this.saldo = saldo;
    }

    public double retirarDinero(double cantidad) {

        if (cantidad > saldo)
            throw  new SaldoInsuficienteException("No tiene el suficiente saldo: "+saldo);
        else
            saldo -= cantidad;
        return saldo;
    }
}
