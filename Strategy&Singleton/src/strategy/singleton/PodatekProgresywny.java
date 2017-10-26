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
public class PodatekProgresywny implements Podatek{

    @Override
    public double obliczPodatek(double kwota) {
        //18% <= 10k, 30% >10k
        
        if (kwota > 10000) {
            return 0.3;
        } else {
            return 0.18;
        }
    }
    
}
