package br.fatec.pg;

public class Data{
    private int dia;
    private int mes; 
    private int ano;

    public int getDia(){
        return this.dia;
    }

    public void setDia(int dia){
        this.dia = dia;
    }

    public int getMes(){
        return this.mes;
    }

    public void setMes(int mes){
        this.mes = mes;
    }

    public int getAno(){
        return this.ano;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public boolean isBissexto(){
        if((getAno() % 4 == 0) || (getAno() % 100 == 0 && getAno() % 400 == 0)){
            return true;
        }

        return false;
    }

    public String getData(){
        String dataCompleta;
        String diaFormatado = Integer.toString(getDia());
        String mesFormatado = Integer.toString(getMes());
        String anoFormatado = Integer.toString(getAno());
        
        if(this.dia < 10){
            diaFormatado = this.preencherZeroNaEsquerda(getDia());
        }

        if(this.mes < 10){
            mesFormatado = this.preencherZeroNaEsquerda(getMes());
        }

        dataCompleta = diaFormatado + "/" + mesFormatado + "/" + anoFormatado;

        return dataCompleta;
    }

    public String preencherZeroNaEsquerda(int numero){
        String numeroFormatado;

        numeroFormatado = "0" + Integer.toString(numero);

        return numeroFormatado;
    }
} 