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
public class Czlowiek {
    private String imie;

    public Czlowiek(String imie) {
        this.imie = imie;
    }
    public String getImie(){
        return imie;
    }
    public void obowiazkiWdomu(){};
    public void obowiazkiPozaDomem(){
        System.out.println("Brak obowiazków");
    }
        
}
