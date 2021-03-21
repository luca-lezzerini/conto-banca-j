
package it.iad2.contocorrentebancarioserver.dto;

public class FiltroCognomeDto {
    private String cognome;

    public FiltroCognomeDto() {
    }

    public FiltroCognomeDto(String cognome) {
        this.cognome = cognome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    @Override
    public String toString() {
        return "FiltroCognomeDto{" + "cognome=" + cognome + '}';
    }
    
}
