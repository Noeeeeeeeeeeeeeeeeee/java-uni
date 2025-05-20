/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package progettouniversita;

/**
 *
 * @author reggianin
 */
public class Main {

    public static void main(String[] args) {
        Gestore GS1 = new Gestore();

        GS1.importStudCSV("studenti.CSV");
        GS1.importDocCSV("docenti.CSV");
        GS1.importCorsiCSV("corsi.CSV");
        GS1.importDiscCSV("discipline.CSV");
        GS1.importAppelliCSV("appelli.CSV");
        GS1.importIscCSV("iscrizioni_appelli.CSV");
/*
        System.out.println(GS1.getCorsi());
        System.out.println(GS1.getAppelli());
        System.out.println(GS1.getDocenti());
        System.out.println(GS1.getStudenti());
        System.out.println(GS1.getDiscipline());
        System.out.println(GS1.getIscrizione());

        System.out.println(GS1.cercaCorso("C002"));
        System.out.println(GS1.cercaDisciplina("D003"));
        System.out.println(GS1.cercaDocente("P04"));
        System.out.println(GS1.cercaStudente("S004"));
        System.out.println(GS1.cercaAppello("A03"));
        System.out.println(GS1.cercaIscrizioneAppello("A03"));
        GS1.aggiungiStudente("aba","vda","S009","C002");
        
        /*System.out.println(GS1.cercaCorso("C009"));
        System.out.println(GS1.cercaDisciplina("D009"));
        System.out.println(GS1.cercaDocente("P09"));
        System.out.println(GS1.cercaStudente("S009"));
        System.out.println(GS1.cercaAppello("A09"));
        System.out.println(GS1.cercaIscrizioneAppello("A09"));*/
        
        /*GS1.aggiungiCorso("C008", "Storia", 5);
        GS1.aggiungiCorso("C001", "Inglese", 5);
        System.out.println(GS1.getCorsi());

        GS1.aggiungiStudente("Emiliano", "Casotti", "D003", "P06");
        System.out.println(GS1.getStudenti());*/

        /*GS1.aggiungiDisciplina("Matematica", "D004", 2, "C009");
        System.out.println(GS1.getDiscipline());/*

        GS1.aggiungiDocente("Reggiani", "Noemi", "P02", "D005");
        System.out.println(GS1.getDocenti());
        
        GS1.aggiungiDocente("Reggiani", "Noemi", "P02", "D005");
        System.out.println(GS1.getDocenti());
        
        GS1.aggiungiAppello("A08","29-10-22","D004");
        System.out.println(GS1.getAppelli());

        GS1.aggiungiIscrizioneAppello("A04","S004");
        System.out.println(GS1.getIscrizione());*/
       
        
    }

}
