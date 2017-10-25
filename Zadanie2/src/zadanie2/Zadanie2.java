/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie2;

import java.util.Scanner;

/**
 *
 * @author PrzemysławAntoszek
 */
public class Zadanie2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int n=0;
//        Scanner odczyt = new Scanner(System.in);
//        n=odczyt.nextInt();
        
        Czlowiek [] osoby = new Czlowiek[9];
        
        while(n<9){
            if(n<3){
                osoby[n]=new Niemowle("Jasio");
            }
            else if(n<6){
                osoby[n]=new Nastolatek("Janek");
            }
            else
                osoby[n]=new Emeryt("Jan");
            n++;
        }
        
        for(Czlowiek x : osoby){
            System.out.println(x.getImie());
            x.obowiazkiWdomu();
//            x.obowiazkiPozaDomem();
        }
    }
    
}
