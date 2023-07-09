package Ornitorrinco;

public class Ornitorrinco extends Mamifero implements Anfibio, Venenoso, Oviparo {

    int huevos;
    public Ornitorrinco(int huevos) {
        this.huevos = huevos;
    }
    @Override
    public void amamantar() {
        System.out.println("Amamantando");
    }

    @Override
    public void respirarBranquias() {
        System.out.println("Respirando por branquias");
    }

    @Override
    public void respirarPulmones() {
        System.out.println("Respirando por pulmones");
    }

    @Override
    public void envenenar() {
        System.out.println("Envenenando");
    }

    @Override
    public void huevos() {
        System.out.println("He puesto: " + huevos + " huevitos");
    }
}

