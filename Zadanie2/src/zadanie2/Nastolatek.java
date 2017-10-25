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
public class Nastolatek extends Czlowiek{
    
    public Nastolatek(String imie) {
        super(imie);
    }
    
    @Override
    public void obowiazkiWdomu(){
        System.out.println("Pomagać rodzicom");
    }
    @Override
    public void obowiazkiPozaDomem(){
        System.out.println("Chodzić do szkoly");
    }
}
