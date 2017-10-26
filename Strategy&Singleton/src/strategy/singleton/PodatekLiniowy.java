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
public class PodatekLiniowy implements Podatek{

    @Override
    public double obliczPodatek(double kwota) {
        return 0.19;
    }
    
}
