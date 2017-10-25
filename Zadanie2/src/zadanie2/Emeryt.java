/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie2;

/**
 *
 * @author PrzemysławAntoszek
 */
public class Emeryt extends Czlowiek{
    
    public Emeryt(String imie) {
        super(imie);
    }
   
            
    @Override
    public void obowiazkiWdomu(){
        System.out.println("Być zdrowym");
    }
}
