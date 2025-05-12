/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progettouniversita;

/**
 *
 * @author reggianin
 */
public class Docente extends Persona {

    public String disciplina;

    public Docente(String nome, String cognome, String matricola, String disciplina) {
        super(nome, cognome, matricola);
        if ("".equals(disciplina)) {
            throw new IllegalArgumentException("Errore : Codice corso sbagliato");
        } else {
            this.disciplina = disciplina;
        }
    }

    public String getDisciplina() {
        return disciplina;
    }
}
