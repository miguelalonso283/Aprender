package Interfaces;

import Interfaces.Interfaces.Alimentable;
import Interfaces.Interfaces.Comunicable;

public class Delfin extends CriaturasMarinas implements Comunicable, Alimentable {

    public Delfin(String nombre) {
        super(nombre);
    }

    @Override
    void nadar() {
        System.out.println(nombre + "Está nadando y saltando");
    }

    @Override
    public void comunicarse() {
        System.out.println(nombre+"Emite sonidos de chasquidos");
    }

    @Override
    public void alimentar() {
        System.out.println("Estamos alimetando con galletas a "+nombre);
    }
}
