/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.iad2.contocorrentebancarioserver.dto;

/**
 *
 * @author lenovo
 */
public class NumCCDto {

    private String numConto;

    public NumCCDto() {
    }

    public NumCCDto(String numConto) {
        this.numConto = numConto;
    }

    public String getNumConto() {
        return numConto;
    }

    public void setNumConto(String numConto) {
        this.numConto = numConto;
    }

    @Override
    public String toString() {
        return "NumCCDto{" + "numConto=" + numConto + '}';
    }

}
