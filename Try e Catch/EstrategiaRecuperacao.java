package br.fatec.pg;

import java.io.IOException;

public interface EstrategiaRecuperacao {
    void recuperar(IOException exception);
}