package Interfaces;

import Interfaces.Interfaces.Alimentable;
import Interfaces.Interfaces.Comunicable;

public class Pulpo extends CriaturasMarinas implements Comunicable, Alimentable {

    int cantTentaculos;

    public Pulpo(String nombre, int cantTentaculos) {
        super(nombre);
        this.cantTentaculos = cantTentaculos;
    }

    @Override
    void nadar() {
        System.out.println(nombre+"Está nadando con sus 8 tentáculos");
    }

    @Override
    public void comunicarse() {
        System.out.println(nombre+"Saluda con sus tentáculos");
    }

    @Override
    public void alimentar() {
        System.out.println("Estamos alimetando con peces a "+nombre);
    }
}
