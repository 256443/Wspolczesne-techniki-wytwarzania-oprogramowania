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
public class StrategyPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StrategyContext strategyContext = new StrategyContext(new OperationAdd());
        System.out.println("10 + 5 = " + strategyContext.executeStrategy(10, 5));
        
        strategyContext = new StrategyContext(new OperationMultiply());
        System.out.println("10 * 5 = "+ strategyContext.executeStrategy(10, 5));
        
        strategyContext = new StrategyContext(new OperationSubstract());
        System.out.println("10 - 5 = "+strategyContext.executeStrategy(10, 5));
    }
    
}
