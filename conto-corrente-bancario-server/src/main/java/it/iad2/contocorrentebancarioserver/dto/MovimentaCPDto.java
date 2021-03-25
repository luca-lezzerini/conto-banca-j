/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.iad2.contocorrentebancarioserver.dto;

import it.iad2.contocorrentebancarioserver.model.MovCP;

/**
 *
 * @author user
 */
public class MovimentaCPDto {
    
    private MovCP movCP;

    public MovimentaCPDto(MovCP movCP) {
        this.movCP = movCP;
    }

    public MovCP getMovCP() {
        return movCP;
    }

    public void setMovCP(MovCP movCP) {
        this.movCP = movCP;
    }
    
}
