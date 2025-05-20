/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progettouniversita;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author reggianin
 */
public class Gestore {

    ArrayList<Studente> studenti = new ArrayList<>();
    ArrayList<Docente> docenti = new ArrayList<>();
    ArrayList<Corso> corsi = new ArrayList<>();
    ArrayList<Disciplina> discipline = new ArrayList<>();
    ArrayList<Appello> appelli = new ArrayList<>();
    ArrayList<IscrizioneAppello> IscrizioneAppelli = new ArrayList<>();

    String linea;
    String del = ";"; // carattere delimitatore

    public boolean importStudCSV(String fn) {
        try {
            File file = new File(fn);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            br.readLine();
            while ((linea = br.readLine()) != null) {
                String[] data = linea.split(del);

                if (data.length < 4) {
                    System.err.println("Riga non valida (colonne insufficienti): " + linea);
                    continue; // salta questa riga
                }

                studenti.add(new Studente(data[1], data[2], data[0], data[3]));
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

    public boolean importDocCSV(String fn) {
        try {
            File file = new File(fn);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            br.readLine();
            while ((linea = br.readLine()) != null) {
                String[] data = linea.split(del);

                docenti.add(new Docente(data[1], data[2], data[0], data[3]));
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

    public boolean importCorsiCSV(String fn) {
        try {
            File file = new File(fn);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            br.readLine();
            while ((linea = br.readLine()) != null) {
                String[] data = linea.split(del);
                if (data.length < 3) {
                    System.err.println("Riga corso non valida: " + linea);
                    continue;
                }
                corsi.add(new Corso(data[0], data[1], Integer.parseInt(data[2])));
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

    public boolean importDiscCSV(String fn) {
        try {
            File file = new File(fn);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            br.readLine();
            while ((linea = br.readLine()) != null) {
                String[] data = linea.split(del);

                discipline.add(new Disciplina(data[0], data[1], Integer.parseInt(data[2]), data[3]));
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

    public boolean importAppelliCSV(String fn) {
        try {
            File file = new File(fn);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            br.readLine();
            while ((linea = br.readLine()) != null) {
                String[] data = linea.split(del);

                appelli.add(new Appello(data[0], data[1], data[2]));
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
            while ((linea = br.readLine()) != null) {
                String[] data = linea.split(del);

                IscrizioneAppelli.add(new IscrizioneAppello(data[0], data[1]));
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

    public String getCorsi() {
        String a = "Corsi : \n";
        for (Corso o : corsi) {
            a += o + "\n";
        }
        return a;
    }

    public String getStudenti() {
        String a = "Studenti : \n";
        for (Studente o : studenti) {
            a += o + "\n";
        }
        return a;
    }

    public String getDocenti() {
        String a = "Docenti : \n";
        for (Docente o : docenti) {
            a += o + "\n";
        }
        return a;
    }

    public String getDiscipline() {
        String a = "Discipline : \n";
        for (Disciplina o : discipline) {
            a += o + "\n";
        }
        return a;
    }

    public String getAppelli() {
        String a = "Appelli : \n";
        for (Appello o : appelli) {
            a += o + "\n";
        }
        return a;
    }

    public String getIscrizione() {
        String a = "Iscrizione appelli : \n";
        for (IscrizioneAppello o : IscrizioneAppelli) {
            a += o + "\n";
        }
        return a;
    }

    public Corso cercaCorso(String code) {
        for (Corso c : corsi) {
            if ((c.getCodice()).equals(code)) {
                return c;
            }
        }
        return null;
    }

    public Disciplina cercaDisciplina(String code) {
        for (Disciplina d : discipline) {
            if ((d.getCodiceDisciplina()).equals(code)) {
                return d;
            }
        }
        return null;
    }

    public Appello cercaAppello(String code) {
        for (Appello c : appelli) {
            if ((c.getIdAppello()).equals(code)) {
                return c;
            }
        }
        return null;
    }

    public IscrizioneAppello cercaIscrizioneAppello(String code) {
        for (IscrizioneAppello c : IscrizioneAppelli) {
            if ((c.getIdAppello()).equals(code)) {
                return c;
            }
        }
        return null;
    }

    public Docente cercaDocente(String code) {
        for (Docente c : docenti) {
            if ((c.getMatricola()).equals(code)) {
                return c;
            }
        }
        return null;
    }

    public Studente cercaStudente(String code) {
        for (Studente c : studenti) {
            if ((c.getMatricola()).equals(code)) {
                return c;
            }
        }
        return null;
    }

    public void aggiungiCorso(String codice, String nome, int durata) {
        for (Corso c : corsi) {
            if (c.getCodice().equals(codice)) {
                throw new IllegalArgumentException("Errore questo codice appartiene ad un altro corso");
            }
            if (c.getNome().equals(nome)) {
                throw new IllegalArgumentException("Errore questa materia è gia presente");
            }
        }
        Corso s = new Corso(codice, nome, durata);
        corsi.add(s);
        String std = codice + ";" + nome + ";" + durata;
        File file = new File("corsi.CSV");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            if (file.length() > 0) {
                writer.newLine();
            }
            writer.write(std);
        } catch (IOException e) {
            System.err.println(e);
        }
    }

    public void aggiungiDisciplina(String nome, String codice, int cfu, String corso) {
        for (Disciplina d : discipline) {
            if (d.getCodiceCorso().equals(codice)) {
                throw new IllegalArgumentException("Errore: questo codice è già presente.");
            }
        }

        Corso corsoTrovato = null;
        for (Corso c : corsi) {
            if (c.getCodice().equals(corso)) {
                corsoTrovato = c;
                break;
            }
        }

        if (corsoTrovato == null) {
            throw new IllegalArgumentException("Errore: corso non trovato.");
        }

        Disciplina nuovaDisciplina = new Disciplina(codice, nome, cfu, corso);
        discipline.add(nuovaDisciplina);

        File file = new File("discipline.CSV");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            if (file.length() > 0) {
                writer.newLine();
            }
            writer.write(codice + ";" + nome + ";" + cfu + ";" + corso);
        } catch (IOException e) {
            System.err.println("Errore durante la scrittura del file: " + e.getMessage());
        }
    }

    public void aggiungiDocente(String nome, String cognome, String matricola, String codiceD) {
        for (Docente d : docenti) {
            if (d.getNome().equals(nome) && d.getCognome().equals(cognome)) {
                throw new IllegalArgumentException("Errore: un docente può insegnare una sola disciplina.");
            }
        }

        Disciplina disciplinaTrovata = null;
        for (Disciplina d : discipline) {
            if (d.getCodiceDisciplina().equals(codiceD)) {
                disciplinaTrovata = d;
                break;
            }
        }

        if (disciplinaTrovata == null) {
            throw new IllegalArgumentException("Errore: disciplina non trovata.");
        }

        Docente nuovoDocente = new Docente(nome, cognome, matricola, codiceD);
        docenti.add(nuovoDocente);

        File file = new File("docenti.CSV");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            if (file.length() > 0) {
                writer.newLine();
            }
            writer.write(matricola + ";" + nome + ";" + cognome + ";" + codiceD);
        } catch (IOException e) {
            System.err.println("Errore durante la scrittura del file: " + e.getMessage());
        }
    }

    public void aggiungiStudente(String nome, String cognome, String matricola, String codice) {
        for (Studente s : studenti) {
            if (s.getMatricola().equals(matricola)) {
                throw new IllegalArgumentException("Errore: uno studente può partecipare a una sola disciplina.");
            }
        }

        Corso corsoTrovata = null;
        for (Corso d : corsi) {
            if (d.getCodice().equals(codice)) {
                corsoTrovata = d;
                break;
            }
        }

        if (corsoTrovata == null) {
            throw new IllegalArgumentException("Errore: corso non trovato.");
        }

        Studente nuovoStudente = new Studente(nome, cognome, matricola, codice);
        studenti.add(nuovoStudente);

        File file = new File("studenti.CSV");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            if (file.length() > 0) {
                writer.newLine();
            }
            writer.write(matricola + ";" + nome + ";" + cognome + ";" + codice);
        } catch (IOException e) {
            System.err.println("Errore durante la scrittura del file: " + e.getMessage());
        }
    }

    public void aggiungiAppello(String id, String data, String codice) {
        boolean trovato = false;

        for (Disciplina d : discipline) {
            if (d.getCodiceDisciplina().equals(codice)) {
                trovato = true;
                break;
            }
        }

        if (!trovato) {
            throw new IllegalArgumentException("Puoi aggiungere appelli solo di discipline esistenti");
        }

        Appello s = new Appello(id, data, codice);
        appelli.add(s);
        String std = id + ";" + data + ";" + codice;

        File file = new File("appelli.CSV");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            if (file.length() > 0) {
                writer.newLine();
            }
            writer.write(std);
        } catch (IOException e) {
            System.err.println(e);
        }
    }

    public void aggiungiIscrizioneAppello(String id, String matricola) {
        Appello appelloTrovato = null;
        Studente studenteTrovato = null;

        for (Appello a : appelli) {
            if (a.getIdAppello().equals(id)) {
                appelloTrovato = a;
                break;
            }
        }

        if (appelloTrovato == null) {
            throw new IllegalArgumentException("Errore: appello non trovato");
        }

        for (Studente s : studenti) {
            if (s.getMatricola().equals(matricola)) {
                studenteTrovato = s;
                break;
            }
        }

        if (studenteTrovato == null) {
            throw new IllegalArgumentException("Errore: studente non trovato");
        }

        boolean studenteFrequenta = false;
        for (Disciplina d : discipline) {
            if (d.getCodiceCorso().equals(studenteTrovato.getCodiceCorso()) && d.getCodiceDisciplina().equals(appelloTrovato.getCodiceDisciplina())) {
                studenteFrequenta = true;
                break;
            }
        }

        if (!studenteFrequenta) {
            throw new IllegalArgumentException("Errore: lo studente può iscriversi solo ad appelli di discipline che frequenta");
        }

        IscrizioneAppello x = new IscrizioneAppello(id, matricola);
        IscrizioneAppelli.add(x);
        String std = id + ";" + matricola;

        File file = new File("iscrizioni_appelli.CSV");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            if (file.length() > 0) {
                writer.newLine();
            }
            writer.write(std);
        } catch (IOException e) {
            System.err.println(e);
        }
    }

    public void modificaNomeCorso(String codice, String nomeNuovo) {
        for (Corso c : corsi) {
            if (c.getCodice().equals(codice)) {
                c.setNome(nomeNuovo);

                try (BufferedWriter writer = new BufferedWriter(new FileWriter("corsi.CSV"))) {
                    for (Corso a : corsi) {
                        String riga = a.getCodice() + ";" + a.getNome() + ";" + a.getDurata();
                        writer.write(riga);
                        writer.newLine();
                    }
                } catch (IOException e) {
                    System.err.println("Errore scrittura corsi: " + e.getMessage());
                }

                return;
            }
        }

        throw new IllegalArgumentException("Corso non trovato.");
    }

    public void modificaIscrizioniAppelli(String id, String matricola) {
        IscrizioneAppello appelloTrovato = null;
        Studente studenteTrovato = null;

        for (IscrizioneAppello a : IscrizioneAppelli) {
            if (a.getIdAppello().equals(id)) {
                appelloTrovato = a;
                break;
            }
        }

        if (appelloTrovato == null) {
            throw new IllegalArgumentException("Errore: appello non trovato");
        }

        for (Studente s : studenti) {
            if (s.getMatricola().equals(matricola)) {
                studenteTrovato = s;
                break;
            }
        }

        if (studenteTrovato == null) {
            throw new IllegalArgumentException("Errore: studente non trovato");
        }

        appelloTrovato.setMatricolaStudente(matricola);
    }

    public void modificaNomeDisciplina(String codice, String nomeNuovo) {
        for (Disciplina d : discipline) {
            if (d.getCodiceCorso().equals(codice)) {
                d.setNome(nomeNuovo);

                try (BufferedWriter writer = new BufferedWriter(new FileWriter("discipline.CSV"))) {
                    for (Disciplina a : discipline) {
                        String riga = a.getCodiceCorso() + ";" + a.getNome() + ";" + a.getCfu() + ";" + a.getCodiceDisciplina();
                        writer.write(riga);
                        writer.newLine();
                    }
                } catch (IOException e) {
                    System.err.println("Errore scrittura discipline: " + e.getMessage());
                }

                return;
            }
        }

        throw new IllegalArgumentException("Disciplina non trovata.");
    }

    public void modificaNomeStudente(String matricola, String nomeNuovo) {
        for (Studente s : studenti) {
            if (s.getMatricola().equals(matricola)) {
                s.setNome(nomeNuovo);

                try (BufferedWriter writer = new BufferedWriter(new FileWriter("studenti.CSV"))) {
                    for (Studente a : studenti) {
                        String riga = a.getMatricola() + ";" + a.getNome() + ";" + a.getCognome() + ";" + a.getCodiceCorso();
                        writer.write(riga);
                        writer.newLine();
                    }
                } catch (IOException e) {
                    System.err.println("Errore scrittura studenti: " + e.getMessage());
                }

                return;
            }
        }

        throw new IllegalArgumentException("Studente non trovato.");
    }

    public void modificaNomeDocente(String matricola, String nomeNuovo) {
        for (Docente d : docenti) {
            if (d.getMatricola().equals(matricola)) {
                d.setNome(nomeNuovo);

                try (BufferedWriter writer = new BufferedWriter(new FileWriter("docenti.CSV"))) {
                    for (Docente a : docenti) {
                        String riga = a.getMatricola() + ";" + a.getNome() + ";" + a.getCognome() + ";" + a.getDisciplina();
                        writer.write(riga);
                        writer.newLine();
                    }
                } catch (IOException e) {
                    System.err.println("Errore scrittura docenti: " + e.getMessage());
                }

                return;
            }
        }

        throw new IllegalArgumentException("Docente non trovato.");
    }

    public void modificaCfuDisciplina(String codice, int nuoviCfu) {
        for (Disciplina d : discipline) {
            if (d.getCodiceCorso().equals(codice)) {
                d.setCfu(nuoviCfu);

                try (BufferedWriter writer = new BufferedWriter(new FileWriter("discipline.CSV"))) {
                    for (Disciplina a : discipline) {
                        String riga = a.getCodiceCorso() + ";" + a.getNome() + ";" + a.getCfu() + ";" + a.getCodiceDisciplina();
                        writer.write(riga);
                        writer.newLine();
                    }
                } catch (IOException e) {
                    System.err.println("Errore scrittura file discipline: " + e.getMessage());
                }

                return;
            }
        }

        throw new IllegalArgumentException("Disciplina non trovata.");
    }

    public void modificaDurataCorso(String codice, int nuovaDurata) {
        for (Corso c : corsi) {
            if (c.getCodice().equals(codice)) {
                c.setDurata(nuovaDurata);

                try (BufferedWriter writer = new BufferedWriter(new FileWriter("corsi.CSV"))) {
                    for (Corso a : corsi) {
                        String riga = a.getCodice() + ";" + a.getNome() + ";" + a.getDurata();
                        writer.write(riga);
                        writer.newLine();
                    }
                } catch (IOException e) {
                    System.err.println("Errore scrittura file corsi: " + e.getMessage());
                }

                return;
            }
        }

        throw new IllegalArgumentException("Corso non trovato.");
    }

    public void modificaCognomeStudente(String matricola, String nuovoCognome) {
        for (Studente s : studenti) {
            if (s.getMatricola().equals(matricola)) {
                s.setCognome(nuovoCognome);

                try (BufferedWriter writer = new BufferedWriter(new FileWriter("studenti.CSV"))) {
                    for (Studente a : studenti) {
                        String riga = a.getMatricola() + ";" + a.getNome() + ";" + a.getCognome() + ";" + a.getCodiceCorso();
                        writer.write(riga);
                        writer.newLine();
                    }
                } catch (IOException e) {
                    System.err.println("Errore scrittura studenti: " + e.getMessage());
                }

                return;
            }
        }

        throw new IllegalArgumentException("Studente con la matricola indicata non trovato.");
    }

    public void modificaCognomeDocente(String matricola, String nuovoCognome) {
        for (Docente d : docenti) {
            if (d.getMatricola().equals(matricola)) {
                d.setCognome(nuovoCognome);

                try (BufferedWriter writer = new BufferedWriter(new FileWriter("docenti.CSV"))) {
                    for (Docente a : docenti) {
                        String riga = a.getMatricola() + ";" + a.getNome() + ";" + a.getCognome() + ";" + a.getDisciplina();
                        writer.write(riga);
                        writer.newLine();
                    }
                } catch (IOException e) {
                    System.err.println("Errore scrittura docenti: " + e.getMessage());
                }

                return;
            }
        }

        throw new IllegalArgumentException("Docente con la matricola indicata non trovato.");
    }

    public void modificaAppelli(String data, String id) {
        for (Appello d : appelli) {
            if (d.getIdAppello().equals(id)) {
                d.setData(data);

                try (BufferedWriter writer = new BufferedWriter(new FileWriter("appelli.CSV"))) {
                    for (Appello a : appelli) {
                        String riga = a.getIdAppello() + ";" + a.getData() + ";" + a.getCodiceDisciplina();
                        writer.write(riga);
                        writer.newLine();
                    }
                } catch (IOException e) {
                    System.err.println("Errore scrittura apelli: " + e.getMessage());
                }

                return;
            }
        }
    }

    public void modificaMatricola(String matr, String id) {
        boolean trovatoStudente = false;
        for (Studente s : studenti) {
            if (s.getMatricola().equals(matr)) {
                trovatoStudente = true;
                break;
            }
        }

        if (!trovatoStudente) {
            throw new IllegalArgumentException("Matricola studente non esistente");
        }

        boolean trovatoAppello = false;
        for (IscrizioneAppello iscrizione : IscrizioneAppelli) {
            if (iscrizione.getIdAppello().equals(id)) {
                iscrizione.setMatricolaStudente(matr);
                trovatoAppello = true;
                break;
            }
        }

        if (!trovatoAppello) {
            throw new IllegalArgumentException("Appello non trovato");
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("iscrizioniAppelli.CSV"))) {
            for (IscrizioneAppello iscrizione : IscrizioneAppelli) {
                String riga = iscrizione.getIdAppello() + ";" + iscrizione.getMatricolaStudente();
                writer.write(riga);
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Errore nella scrittura del file iscrizioni: " + e.getMessage());
        }
    }

    public void modificaCorsoStudente(String cod, String nuovoCodiceCorso) {
        for (Studente s : studenti) {
            if (s.getMatricola().equals(cod)) {
                boolean corsoEsiste = false;
                for (Corso c : corsi) {
                    if (c.getCodice().equals(nuovoCodiceCorso)) {
                        corsoEsiste = true;
                        break;
                    }
                }

                if (!corsoEsiste) {
                    throw new IllegalArgumentException("Errore: il corso specificato non esiste.");
                }

                s.setCodiceCorso(nuovoCodiceCorso);

                try (BufferedWriter writer = new BufferedWriter(new FileWriter("studenti.CSV"))) {
                    for (Studente a : studenti) {
                        String riga = a.getMatricola() + ";" + a.getNome() + ";" + a.getCognome() + ";" + a.getCodiceCorso();
                        writer.write(riga);
                        writer.newLine();
                    }
                } catch (IOException e) {
                    System.err.println("Errore scrittura file studenti: " + e.getMessage());
                }

                return;
            }
        }
        throw new IllegalArgumentException("Errore: matricola studente non trovata.");
    }

    public void modificaDisDocente(String cod, String nuovaDisciplina) {
        for (Docente s : docenti) {
            if (s.getMatricola().equals(cod)) {
                boolean disciplinaEsiste = false;
                for (Disciplina c : discipline) {
                    if (c.getCodiceDisciplina().equals(nuovaDisciplina)) {
                        disciplinaEsiste = true;
                        break;
                    }
                }

                if (!disciplinaEsiste) {
                    throw new IllegalArgumentException("Errore: la disciplina che hai specificato non esiste.");
                }

                s.setDisciplina(nuovaDisciplina);

                try (BufferedWriter writer = new BufferedWriter(new FileWriter("docenti.CSV"))) {
                    for (Studente a : studenti) {
                        String riga = a.getMatricola() + ";" + a.getNome() + ";" + a.getCognome() + ";" + a.getCodiceCorso();
                        writer.write(riga);
                        writer.newLine();
                    }
                } catch (IOException e) {
                    System.err.println("Errore scrittura file docenti: " + e.getMessage());
                }

                return;
            }
        }
        throw new IllegalArgumentException("Errore: matricola docente non trovata.");
    }

    public void modificaAppelloDisciplina(String id, String codiceDisciplina) {
        for (Appello p : appelli) {
            if (p.getIdAppello().equals(id)) {
                boolean disciplinaTrovata = false;

                for (Disciplina d : discipline) {
                    if (d.getCodiceDisciplina().equals(codiceDisciplina)) {
                        disciplinaTrovata = true;
                        break;
                    }
                }

                if (!disciplinaTrovata) {
                    throw new IllegalArgumentException("Errore: la disciplina specificata non esiste.");
                }

                p.setCodiceDisciplina(codiceDisciplina);
                return; // esce dopo la modifica
            }
        }

        throw new IllegalArgumentException("Errore: appello con ID non trovato.");
    }

    public void modificaDisciplinaCorso(String matricola, String corso) {
        Disciplina disciplinaTrovata = null;
        Corso corsoTrovato = null;

        for (Disciplina d : discipline) {
            if (d.getCodiceDisciplina().equals(matricola)) {
                disciplinaTrovata = d;
                break;
            }
        }

        if (disciplinaTrovata == null) {
            throw new IllegalArgumentException("Errore: la disciplina specificata non esiste.");
        }

        for (Corso c : corsi) {
            if (c.getCodice().equals(corso)) {
                corsoTrovato = c;
                break;
            }
        }
        if (corsoTrovato == null) {
            throw new IllegalArgumentException("Errore: il corso specificato non esiste.");
        }

        disciplinaTrovata.setCodiceCorso(corso);
    }
}
