/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progettouniversita;

/**
 *
 * @author reggianin
 */
public class Disciplina {
    //codice, nome, durata (anni).
    private String codiceDisciplina;
    private String nome;
    private int cfu;
    private String codiceCorso;
    
    public Disciplina (String codice, String nome, int cfu, String cCorso){
        if ("".equals(nome)) {
            throw new IllegalArgumentException("Errore : Nome sbagliato");
        } else {
            this.nome = nome;
        }

        if ("".equals(codice)) {
            throw new IllegalArgumentException("Errore : Codice sbagliato");
        } else {
            this.codiceDisciplina = codice;
        }

        if ("".equals(cfu)) {
            throw new IllegalArgumentException("Errore : Matricola sbagliata");
        } else {
            this.cfu = cfu;
        }
        
        if ("".equals(cCorso)) {
            throw new IllegalArgumentException("Errore : Codice Corso sbagliata");
        } else {
            this.codiceCorso = cCorso;
        }
    }

    public String getCodiceDisciplina() {
        return codiceDisciplina;
    }

    public String getNome() {
        return nome;
    }

    public int getCfu() {
        return cfu;
    }

    public String getCodiceCorso() {
        return codiceCorso;
    }
}
