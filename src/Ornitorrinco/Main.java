package Ornitorrinco;

public class Main {
    public static void main(String[] args) {
        Ornitorrinco ornitorrinco = new Ornitorrinco(2);
        Ornitorrinco ornitorrinco2 = new Ornitorrinco(3);

        ornitorrinco.respirarBranquias();
        ornitorrinco.respirarPulmones();
        ornitorrinco.amamantar();
        ornitorrinco.envenenar();
        ornitorrinco.huevos();
        System.out.println();
        ornitorrinco2.respirarBranquias();
        ornitorrinco2.respirarPulmones();
        ornitorrinco2.amamantar();
        ornitorrinco2.envenenar();
        ornitorrinco2.huevos();
    }
}
