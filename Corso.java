/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progettouniversita;

/**
 *
 * @author reggianin
 */
public class Corso {
    //codice, nome, durata (anni).
    private String codice;
    private String nome;
    private int durata;
    
    public Corso(String codice, String nome, int durata){
        if ("".equals(nome)) {
            throw new IllegalArgumentException("Errore : Nome sbagliato");
        } else {
            this.nome = nome;
        }

        if ("".equals(codice)) {
            throw new IllegalArgumentException("Errore : Codice sbagliato");
        } else {
            this.codice = codice;
        }

        if ("".equals(durata)) {
            throw new IllegalArgumentException("Errore : Matricola sbagliata");
        } else {
            this.durata = durata;
        }
    }

    public String getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public int getDurata() {
        return durata;
    }

    public String modificaCorso (String modifica) {
        this.nome = modifica;
        
        return "Modifica avvenuta correttamente";
    }

}
