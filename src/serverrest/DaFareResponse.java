/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serverrest;

/**
 *
 * @author delfo
 */
public class DaFareResponse {

    String giocata;
    Integer numero;
    String vittoria;
    // Costruttore vuoto necessario per GSON
    public DaFareResponse() {
    }
    
    // Costruttore con parametri
    public DaFareResponse(String giocata, Integer numero, String vittoria) {
        this.giocata = giocata;
        this.numero = numero;
        this.vittoria = vittoria;
    }  
    
    // Getter
    public String getGiocata() {
        return giocata;
    }

    public void setGiocata(String giocata) {
        this.giocata = giocata;
    }

    public Integer getNumero() {
        return numero;
    }
    
    // Setter
    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getVittoria() {
        return vittoria;
    }

    public void setVittoria(String vittoria) {
        this.vittoria = vittoria;
    }
}