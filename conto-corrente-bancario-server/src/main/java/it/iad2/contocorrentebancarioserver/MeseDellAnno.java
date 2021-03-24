package it.iad2.contocorrentebancarioserver;

import org.hibernate.tuple.GeneratedValueGeneration;

public enum MeseDellAnno {
    GENNAIO(31), FEBBRAIO(29);
    
    private int maxGiorni;

    private MeseDellAnno(int maxGiorni) {
        this.maxGiorni = maxGiorni;
    }
    
}
