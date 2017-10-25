/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie5;

import java.util.HashMap;
import java.util.Map;
import static javafx.scene.input.KeyCode.S;

/**
 *
 * @author PrzemysławAntoszek
 */
public class Zadanie5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<Klucz, Wartosc> kalendarz = new HashMap<Klucz, Wartosc>();
        for(int i=0;i<3;i++){
            Klucz k = new Klucz("Styczeń "+i, "Sty ");
            Wartosc w = new Wartosc(i);
        
            kalendarz.put(k, w);
        }
        
        for( Map.Entry<Klucz,Wartosc> entry : kalendarz.entrySet()){
            if(entry.getKey().getNazwa().equals("Styczeń 1"))
                System.out.println(entry.getKey().getNazwa() + " " + entry.getKey().getSkrot() + " " + entry.getValue().getValue());
        }
        int licznik = 0;
//        for (int i = 0; i < kalendarz.size(); i++) {
//            String toString = kalendarz.get(i).toString();
//        }

    }
}