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
        
        GS1.importStudCSV ("studenti.CSV");
        GS1.importDocCSV ("docenti.CSV");
        GS1.importCorsiCSV ("corsi.CSV");
        GS1.cercaCorso ("C002", "Lettere Moderne");
        
        GS1.importDiscCSV ("discipline.CSV");
        GS1.importAppelliCSV ("appelli.CSV");
        GS1.importIscCSV ("iscrizione.CSV");
    }
    
}