package progettouniversita;

import javax.xml.crypto.Data;

public class Appello {
    //idAppello;data;codiceDisciplina
    private String idAppello;
    private String data;
    private String codiceDisciplina;
    
    public Appello(String idAppello, String dt, String codiceDisciplina){
        if ("".equals(idAppello)) {
            throw new IllegalArgumentException("Errore : Id dell'appello non valido");
        } else {
            this.idAppello = idAppello;
        }
        
        if ("".equals(dt)) {
            throw new IllegalArgumentException("Errore : Data della disciplina non valida");
        } else {
            this.data = dt;
        }

        if ("".equals(codiceDisciplina)) {
            throw new IllegalArgumentException("Errore : Codice della disciplina non valida");
        } else {
            this.codiceDisciplina = codiceDisciplina;
        }
    }
}
