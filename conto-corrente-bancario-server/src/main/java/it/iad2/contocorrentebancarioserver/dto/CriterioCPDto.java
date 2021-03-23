package it.iad2.contocorrentebancarioserver.dto;

public class CriterioCPDto {

    private String ricerca;

    public CriterioCPDto() {
    }

    public CriterioCPDto(String ricerca) {
        this.ricerca = ricerca;
    }

    public String getRicerca() {
        return ricerca;
    }

    public void setRicerca(String ricerca) {
        this.ricerca = ricerca;
    }
}
