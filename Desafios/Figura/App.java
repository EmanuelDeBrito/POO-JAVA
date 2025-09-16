package OO.Exercicios;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Figura> figuras = new ArrayList<Figura>();

        Circulo primeiroCirculo = new Circulo(2);
        Circulo segundoCirculo = new Circulo(3);

        Retangulo primeiroRetangulo = new Retangulo(10, 10);
        Retangulo segundoRetangulo = new Retangulo(20, 20);

        figuras.add(primeiroCirculo);
        figuras.add(segundoCirculo);
        figuras.add(primeiroRetangulo);
        figuras.add(segundoRetangulo);

        for(Figura figura : figuras){
            System.out.println("\n Area do " + figura.getClass().getSimpleName() + ": " + figura.calcularAreaFigura());
        }
    }
}
