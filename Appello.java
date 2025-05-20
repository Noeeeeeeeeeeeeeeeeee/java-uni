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

    public String getIdAppello() {
        return idAppello;
    }

    public String getData() {
        return data;
    }

    public String getCodiceDisciplina() {
        return codiceDisciplina;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setIdAppello(String idAppello) {
        this.idAppello = idAppello;
    }

    public void setCodiceDisciplina(String codiceDisciplina) {
        this.codiceDisciplina = codiceDisciplina;
    }
    
    

    @Override
    public String toString() {
        return idAppello + ";" + data + ";" + codiceDisciplina;
    }
    
    
}
