package CalsesAbstractas;

public class Principal {
    static void main(String[] args) {
        Circulo circulo = new Circulo(10);
        Rectangulo rectangulo = new Rectangulo(8,6);

        circulo.imprimirInfo();
        System.out.println("El área del círculo es: "+circulo.calcularArea());
        rectangulo.imprimirInfo();
        System.out.println("El área del rectangulo es: "+rectangulo.calcularArea());
    }
}
