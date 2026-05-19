package Interfaces;

public class App {
    static void main(String[] args) {

        Delfin delfin = new Delfin("Adolfina");
        Pulpo pulpo = new Pulpo("Gonzalez", 8);

        delfin.nadar();
        delfin.comunicarse();
        delfin.alimentar();

        delfin.nadar();
        delfin.comunicarse();
        delfin.alimentar();
    }
}
