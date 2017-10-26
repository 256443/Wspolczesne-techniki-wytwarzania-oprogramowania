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
public class Ksiazka implements Przedmiot {

    private int rokWydania;
    private int nrWydania;
    private double Stala=2050;

    public Ksiazka(int rokWydania, int nrWydania) {
        this.rokWydania = rokWydania;
        this.nrWydania = nrWydania;
        System.out.println("Utworzono nową książkę, cena: " + this.okreslWartosc());
    }

    
    public int getRokWydania() {
        return rokWydania;
    }

    public void setRokWydania(int rokWydania) {
        this.rokWydania = rokWydania;
    }

    public int getNrWydania() {
        return nrWydania;
    }

    public void setNrWydania(int nrWydania) {
        this.nrWydania = nrWydania;
    }
    
    
    
    @Override
    public double okreslWartosc() {
        return (this.Stala - this.rokWydania) / this.nrWydania;
    }

    

}
