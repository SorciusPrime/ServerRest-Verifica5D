/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serverrest;

import java.util.Objects;

/**
 *
 * @author delfo
 */
public class RouletteService {
    
    public static double CalcolaVittoria(String giocataFatta, String numero) 
            throws IllegalArgumentException {
            Integer numeroEstratto = Integer.parseInt(numero);
        
        // Controllo se i parametri passati sono validi
                if (Objects.equals(parametriValidi(giocataFatta, numeroEstratto), "paramentri non validi")) {
            throw new IllegalArgumentException("Operatore non può essere vuoto");
        }
        
        Boolean vittoria;
        
        switch (giocataFatta.toUpperCase().trim()){
            case "PARI":
                vittoria = numeroEstratto %2 != 0 && numeroEstratto != 0;
                break;
            case "DISPARI":
                vittoria = numeroEstratto %2 == 0 && numeroEstratto != 0;
                break;
            default:
                throw new IllegalArgumentException("giocata non amessa" + giocataFatta);
        }
        return 0; // Placeholder, da sostituire con il risultato della logica di calcolo
    }

    // Metodo di validazione dei parametri (da implementare)
    private static Boolean parametriValidi(String giocata, Integer numero)
    {
       if (giocata == null || numero == null){
           return false;
       }
       
       if (giocata.trim().isEmpty()){
           return false;
       }
       
       if (numero < 0 || numero > 36) {
           return false;
       }
       
       String message = giocata.toUpperCase();
       return message.equals("PARI")|| message.equals("DISPARI");
    }
}
