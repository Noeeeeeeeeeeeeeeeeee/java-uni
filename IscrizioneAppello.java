/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progettouniversita;

/**
 *
 * @author reggianin
 */
public class IscrizioneAppello {
    private String idAppello;
    private String matricolaStudente;
    
    public IscrizioneAppello(String idAppello, String idStudente){
        if("".equals(idAppello)){
            throw new IllegalArgumentException("Errore : Id dell'appello non valido");
        }else{
            this.idAppello=idAppello;
        }
        
        if("".equals(idStudente)){
            throw new IllegalArgumentException("Errore : Matricola dello studente non valido");
        }else{
            this.matricolaStudente=idStudente;
        }
    }
}
