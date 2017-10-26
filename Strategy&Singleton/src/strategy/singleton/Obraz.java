/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy.singleton;

/**
 *
 * @author student
 */
public class Obraz implements Przedmiot {
    
    private int rokNamalowania;
    private double stala=2100;
    private int mnożnik = 10;

    public Obraz(int rokNamalowania) {
        this.rokNamalowania = rokNamalowania;
        System.out.println("Stworzono nowy obraz, cena: " +this.okreslWartosc());
    }

    public Obraz() {
    }
    

    
    public int getRokNamalowania() {
        return rokNamalowania;
    }

    public void setRokNamalowania(int rokNamalowania) {
        this.rokNamalowania = rokNamalowania;
    }

    @Override
    public double okreslWartosc() {
        return (this.stala - this.rokNamalowania) * mnożnik;
    }
    
    
    
    
}
