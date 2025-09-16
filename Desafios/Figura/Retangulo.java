package OO.Exercicios;

public class Retangulo extends Figura{
    private double baseDoRetangulo;
    private double alturaDoRetangulo;

    public Retangulo(double baseDoRetangulo, double alturaDoRetangulo){
        this.baseDoRetangulo = baseDoRetangulo;
        this.alturaDoRetangulo = alturaDoRetangulo;
    }

    public double getBaseDoRetangulo(){
        return this.baseDoRetangulo;
    }

    public double getAlturaDoRetangulo(){
        return this.alturaDoRetangulo;
    }

    public void setBaseDoRetangulo(double novaBaseDoRetangulo){
        this.baseDoRetangulo = novaBaseDoRetangulo;
    }

    public void setAlturaDoRetangulo(double novaAlturaDoRetangulo){
        this.alturaDoRetangulo = novaAlturaDoRetangulo;
    }

    @Override
    public double calcularAreaFigura(){
        double areaDoRetangulo = this.baseDoRetangulo * this.alturaDoRetangulo;
        return areaDoRetangulo;
    }
}
