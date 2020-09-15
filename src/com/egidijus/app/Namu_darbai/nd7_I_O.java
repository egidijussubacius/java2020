package com.egidijus.app.Namu_darbai;

import java.io.*;
import java.util.Arrays;

import static com.egidijus.app.paskaita7.checked;
import static com.egidijus.app.paskaita7.unchecked;

public class nd7_I_O {

    public static void main(String[] args) {




        // Checked vs. unchecked exceptions
        try {
            checked();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            unchecked();
        } catch (
                IOException e) {
            System.out.println(e.getMessage());
        }

        try {
            u(3);
        } catch (
                FileNotFoundException e) {
            System.err.println("Failas nerastas, pažiūrėkite ar jis yra direktorijoje: ");
        } catch (IOException | ArrayIndexOutOfBoundsException e) {
            System.err.println("I/O klaida, failas rastas, bet negaliu perskaityti!");
            System.err.println(e.getClass());
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("Bendrinė klaida");
        }

        System.out.println("Programos pabaiga!");


        // File I/O
        System.out.println("Working Directory = " + System.getProperty("user.dir"));

        System.out.println("Sukurite failą su tokiais duomenimis: vardas, amžius, telefono numeris. Duomenis perskaitykite ir išveskite į ekraną.");

        // ... sukuriu failo objektą, kuris laiko info kur failas randasi
        // File relativeFile = new File("data/singleLine.txt");
        // ... skaitome failą, kuriame daug eilučių (vieną po kitos)
        File relativeFileMultiLine = new File("./data/multiLine.txt");
        try {
            FileReader fileReader = new FileReader(relativeFileMultiLine);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String fileLine = bufferedReader.readLine();
            while (fileLine != null) { // žiūrome ar perskaityta eilutė nėra tuščia
                // System.out.println(fileLine); // spausdiname visą eilutę
                // String[] splitString = fileLine.split(" ");
                String[] splitString = fileLine.split("\\s;|\\s|;");
                System.out.println(Arrays.toString(splitString));
                fileLine = bufferedReader.readLine(); // skaitome sekančią eilutę
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("** Parašykite programėlę, kuri skaito duomenis iš konsolės ir įrašo juos į failą.");
        // ... writting to files
        File relativeFile2 = new File("./data/import.csv");
        FileWriter fw = null;
        try {
            fw = new FileWriter(relativeFile2);
            BufferedWriter bw = new BufferedWriter(fw);


            // writting file with newline
            String fileLine2 = "Tautvydas 39m 862545352\n";
            bw.write(fileLine2);

            bw.write("Matvydas 27m 862535453");
            bw.newLine();

            bw.write("Mantas 22m 862535652");
            bw.write("\n");

            bw.write("Lukas 26m 865457456");

            // bw.flush();
            bw.close(); // close automatically flushes the buffer
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    // Exception catching order
    public static void u(int param) throws Exception {
        switch (param){
            case 1: throw new Exception();
            case 2: throw new IOException();
            case 3: throw new FileNotFoundException();
        }
    }

    // Checked vs. unchecked exceptions
    public static void checked(){
        throw new ArithmeticException("Aritmetikos klaida");
    }

    public static void unchecked() throws IOException {
        throw new IOException("IO klaida");
    }
}
