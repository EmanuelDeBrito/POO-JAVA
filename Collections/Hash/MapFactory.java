package br.fatec.pg;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

enum PoliticaMap {
    RAPIDO,
    ORDEM_INSERCAO,
    ORDENADO;
}

public class MapFactory {
    public static <K, V> Map<K, V> criar(PoliticaMap p){
        return 
        switch(p){
            case RAPIDO -> new HashMap<>();
            case ORDEM_INSERCAO -> new LinkedHashMap<>();
            case ORDENADO -> new TreeMap<>();
        };
    }
}
