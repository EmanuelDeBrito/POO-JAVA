package OO.Exercicios;

public class Circulo extends Figura{
    private static final double PI = 3.14159;
    private double raioDoCirculo;

    public Circulo(double raioDoCirculo){
        this.raioDoCirculo = raioDoCirculo;
    }

    public double getRaioDoCirculo(){
        return this.raioDoCirculo;
    }

    public void setRaioDoCirculo(double novoRaioDoCirculo){
        this.raioDoCirculo = novoRaioDoCirculo;
    }

    @Override
    public double calcularAreaFigura() {
        double areaDoCirculo = (this.raioDoCirculo * this.raioDoCirculo) * PI;
        return areaDoCirculo;
    }
}
