package progettouniversita;

public class Persona {
    private String matricola;
    private String nome;
    private String cognome;

    public Persona(String nome, String cognome, String matricola) {
        if ("".equals(nome)) {
            throw new IllegalArgumentException("Errore : Nome sbagliato");
        } else {
            this.nome = nome;
        }

        if ("".equals(cognome)) {
            throw new IllegalArgumentException("Errore : Cognome sbagliato");
        } else {
            this.cognome = cognome;
        }

        if ("".equals(matricola)) {
            throw new IllegalArgumentException("Errore : Matricola sbagliata");
        } else {
            this.matricola = matricola;
        }
    }

    public String getMatricola() {
        return matricola;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

}
