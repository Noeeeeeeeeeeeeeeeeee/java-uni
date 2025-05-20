package progettouniversita;

public class Studente extends Persona {

    public String codiceCorso;

    public Studente(String nome, String cognome, String matricola, String codice) {
        super (nome, cognome, matricola);
        if ("".equals(codice)) {
            throw new IllegalArgumentException("Errore : Codice corso sbagliato");
        } else {
            this.codiceCorso = codice;
        }
    }

    public String getCodiceCorso() {
        return codiceCorso;
    }

    public void setCodiceCorso(String codiceCorso) {
        this.codiceCorso = codiceCorso;
    }

    @Override
    public String toString() {
        return super.toString() + ";" + codiceCorso;
    }
    
    
}
