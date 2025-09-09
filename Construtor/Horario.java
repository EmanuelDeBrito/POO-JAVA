package br.fatec.pg;

public class Horario {
    private int hora;
    private int minuto;
    private int segundo;

    public Horario(){
        setHora(00);
        setMinuto(00);
        setSegundo(00);
    }

    public Horario(int hora, int minuto, int segundo){
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    public int getHora(){
        return this.hora;
    }

    public void setHora(int hora){
        this.hora = hora;
    }

    public int getMinuto(){
        return this.minuto;
    }

    public void setMinuto(int minuto){
        this.minuto = minuto;
    }

    public int getSegundo(){
        return this.segundo;
    }

    public void setSegundo(int segundo){
        this.segundo = segundo;
    }

    public boolean isManha(){
        if(getHora() >= 6 && getHora() < 12){
            return true;
        }

        return false;
    }

    public boolean isTarde(){
        if(getHora() >= 12 && getHora() < 18){
            return true;
        }

        return false;
    }

    public boolean isNoite(){
        if(getHora() >= 18 && getHora() < 0){
            return true;
        }

        return false;
    }
    
    public boolean isMadrugada(){
        if(getHora() >= 0 && getHora() <= 6){
            return true;
        }

        return false;
    }

    public String preencherZeroNaEsquerda(int numero){
        String numeroFormatado;

        numeroFormatado = "0" + Integer.toString(numero);

        return numeroFormatado;
    }

    public String getHorario(){
        String horario;
        String horaFormatada = Integer.toString(getHora());
        String minutoFormatado = Integer.toString(getMinuto());
        String segundoFormatado = Integer.toString(getSegundo());

        if(this.hora < 10){
            horaFormatada = "0" + Integer.toString(getHora());
        }

        if(this.minuto < 10){
            minutoFormatado = "0" + Integer.toString(getMinuto());
        }

        if(this.segundo < 10){
            segundoFormatado = this.preencherZeroNaEsquerda(getSegundo());
        }

        horario = horaFormatada + ":" + minutoFormatado + ":" + segundoFormatado;

        return horario;
    }
}
