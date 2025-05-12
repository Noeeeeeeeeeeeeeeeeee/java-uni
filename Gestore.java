/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progettouniversita;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.crypto.Data;

/**
 *
 * @author reggianin
 */
public class Gestore {
    ArrayList <Studente> studenti = new ArrayList<>();
    ArrayList <Docente> docenti = new ArrayList<>();
    ArrayList <Corso> corsi = new ArrayList<>();
    ArrayList <Disciplina> discipline = new ArrayList<>();
    ArrayList <Appello> appelli = new ArrayList<>();
    ArrayList <IscrizioneAppello> IscrizioneAppelli = new ArrayList<>();
    
    String linea;
    String del = ";"; // carattere delimitatore
    
    public boolean importStudCSV(String fn) {
        try {
            File file = new File(fn);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            br.readLine();
            while((linea = br.readLine()) != null){
                String[] data = linea.split(del);
                
                studenti.add (new Studente (data[0], data[1], data[2], data[3]));
            }

        } catch (FileNotFoundException ex) {
            System.err.println("File non esistente");
            return false;
        } catch (IOException ex2) {
            System.err.println(ex2);
            return false;
        }
        return true;
    }

    public boolean  importDocCSV (String fn) {
        try {
            File file = new File(fn);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            br.readLine();
            while((linea = br.readLine()) != null){
                String[] data = linea.split(del);
                
                docenti.add (new Docente (data[0], data[1], data[2], data[3]));
            }

        } catch (FileNotFoundException ex) {
            System.err.println("File non esistente");
            return false;
        } catch (IOException ex2) {
            System.err.println(ex2);
            return false;
        }
        return true;
    }

    public boolean importCorsiCSV (String fn)  {        
        try {
            File file = new File(fn);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            br.readLine();
            while((linea = br.readLine()) != null){
                String[] data = linea.split(del);
                
                corsi.add (new Corso (data[0], data[1], Integer.parseInt(data[2])));
            }

        } catch (FileNotFoundException ex) {
            System.err.println("File non esistente");
            return false;
        } catch (IOException ex2) {
            System.err.println(ex2);
            return false;
        }
        return true;
    }

    public boolean importDiscCSV (String fn) {      
        try {
            File file = new File(fn);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            br.readLine();
            while((linea = br.readLine()) != null){
                String[] data = linea.split(del);
                
                discipline.add (new Disciplina (data[0], data[1], Integer.parseInt(data[2]), data [3]));
            }

        } catch (FileNotFoundException ex) {
            System.err.println("File non esistente");
            return false;
        } catch (IOException ex2) {
            System.err.println(ex2);
            return false;
        }
        return true;
    }

    public boolean importAppelliCSV (String fn) {    
        try {
            File file = new File(fn);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            br.readLine();
            while((linea = br.readLine()) != null){
                String[] data = linea.split(del);
                
                appelli.add (new Appello (data[0],data[1], data [2]));
            }

        } catch (FileNotFoundException ex) {
            System.err.println("File non esistente");
            return false;
        } catch (IOException ex2) {
            System.err.println(ex2);
            return false;
        }
        return true;
    }

    public boolean importIscCSV(String fn) {    
        try {
            File file = new File(fn);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            br.readLine();
            while((linea = br.readLine()) != null){
                String[] data = linea.split(del);
                
                IscrizioneAppelli.add (new IscrizioneAppello (data[0], data [1]));
            }

        } catch (FileNotFoundException ex) {
            System.err.println("File non esistente");
            return false;
        } catch (IOException ex2) {
            System.err.println(ex2);
            return false;
        }
        return true;
    }
    
    public String cercaCorso (String code, String modifica)
    {
        for (Corso c : corsi)
        {
            if ((c.getCodice()).equals(code))
                return c.modificaCorso (modifica);
        }
        return "Errore modifica del corso";
    }
}
