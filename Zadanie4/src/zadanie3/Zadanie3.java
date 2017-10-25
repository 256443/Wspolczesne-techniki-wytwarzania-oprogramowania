/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author PrzemysławAntoszek
 */
public class Zadanie3 {

    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<File> lista = new ArrayList<>();

        File wczytaj = new File("C:\\Users\\PrzemysławAntoszek\\"
                + "Documents\\NetBeansProjects\\Zadanie4\\plik_nr1.txt");
        lista.add(wczytaj);
        wczytaj = new File("C:\\Users\\PrzemysławAntoszek\\"
                + "Documents\\NetBeansProjects\\Zadanie4\\plik_nr2.txt");
        lista.add(wczytaj);

        PrintWriter zapisz = new PrintWriter("C:\\Users\\PrzemysławAntoszek\\"
                + "Documents\\NetBeansProjects\\Zadanie4\\plik_nr3.txt");
        for (int i = 0; i < lista.size(); i++) {
            Scanner odczyt = new Scanner(lista.get(i));
            while (odczyt.hasNext()) {
                try {
                    String jednoZdanie = odczyt.nextLine();
                    System.out.println(jednoZdanie);
                    zapisz.println(jednoZdanie);
//                zapisz.println("\n");
                } catch (Exception e) {
                    System.out.println("NoSuchElementException: No line found");
                    break;
                }

            }
        }
        zapisz.close();

    }

}
