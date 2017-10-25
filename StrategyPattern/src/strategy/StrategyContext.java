/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author PrzemysławAntoszek
 */
public class StrategyContext {
    private Strategy strategy;

    
    
    public StrategyContext(Strategy s){
        this.strategy=s;
    }
    
    public float executeStrategy(float num1, float num2){
        return strategy.doOperation(num1, num2);
    }
}
