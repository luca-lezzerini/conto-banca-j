package it.iad2.contocorrentebancarioserver.dto;

public class DatiPageDto {
    
    private int numPag;
    private int elemPag;

    public DatiPageDto() {
    }

    public DatiPageDto(int numPag, int elemPag) {
        this.numPag = numPag;
        this.elemPag = elemPag;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    public int getElemPag() {
        return elemPag;
    }

    public void setElemPag(int elemPag) {
        this.elemPag = elemPag;
    }
    
    
}
