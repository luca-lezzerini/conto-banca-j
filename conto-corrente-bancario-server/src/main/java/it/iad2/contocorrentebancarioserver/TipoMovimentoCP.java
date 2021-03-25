/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.iad2.contocorrentebancarioserver;

/**
 *
 * @author user
 */
public enum TipoMovimentoCP {
    CONCESSIONE("Concessione"), 
    EROGAZIONE("Erogazione"), 
    RIMBORSO("Rimborso");
    
    private String tipo;

    private TipoMovimentoCP(String tipo) {
        this.tipo = tipo;
    }
}
