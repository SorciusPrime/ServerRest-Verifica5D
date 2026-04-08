/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serverrest;

/**
 *
 * @author delfo
 */
public class RouletteResponse {

    String giocata;
    String numero;
    Boolean vittoria;
    // Costruttore vuoto necessario per GSON
    public RouletteResponse() {
    }
    
    // Costruttore con parametri

    public RouletteResponse(String giocata, String numero, Boolean vittoria) {
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

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Boolean getVittoria() {
        return vittoria;
    }

    public void setVittoria(Boolean vittoria) {
        this.vittoria = vittoria;
    }
    
}