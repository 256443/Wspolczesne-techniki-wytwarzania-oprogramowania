/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie3;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author PrzemysławAntoszek
 */
public class Zadanie3 {

    public void wys(Vector<String>slowa){
        int licznik=0;
        
    }
    public static void main(String[] args) {
        
        Vector<String> slowa = new Vector<String>();
        String slowo;
        Scanner odczyt = new Scanner(System.in);
        for(int i=0;i<10;i++){
            slowo= odczyt.nextLine();
            slowa.add(slowo);
        }
        for(String s : slowa){
            System.out.println(s);
        }

    }
    
}
