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
public class Rzezba implements Przedmiot{

    private double rozmiarRzezby;
    private double stala = 2020;
    private int rokWykonania;
    private int mnożnik = 2;

    public Rzezba(double rozmiarRzezby, int rokWykonania) {
        this.rozmiarRzezby = rozmiarRzezby;
        this.rokWykonania = rokWykonania;
        System.out.println("Utworzono nową rzeźbe, cena: " + this.okreslWartosc());
    }

    
    public double getRozmiarRzezby() {
        return rozmiarRzezby;
    }

    public void setRozmiarRzezby(double rozmiarRzezby) {
        this.rozmiarRzezby = rozmiarRzezby;
    }

    public int getRokWykonania() {
        return rokWykonania;
    }

    public void setRokWykonania(int rokWykonania) {
        this.rokWykonania = rokWykonania;
    }

    @Override
    public double okreslWartosc() {
        return (stala - this.rokWykonania)*this.rozmiarRzezby * mnożnik;
    }
    
    
    
    
}
