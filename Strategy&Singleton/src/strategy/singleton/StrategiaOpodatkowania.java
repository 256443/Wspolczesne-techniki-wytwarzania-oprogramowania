/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy.singleton;

/**
 *
 * @author PrzemysławAntoszek
 */
public class StrategiaOpodatkowania {
    private Podatek podatek;

    public StrategiaOpodatkowania(Podatek podatek) {
        this.podatek = podatek;
    }

    public Podatek getPodatek() {
        return podatek;
    }

    public void setPodatek(Podatek podatek) {
        this.podatek = podatek;
    }
    
    public double wykonajObliczeniaOpodatkowania(double kwota){
        return podatek.obliczPodatek(kwota);
    }
}
