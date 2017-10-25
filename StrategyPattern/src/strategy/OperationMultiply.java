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
public class OperationMultiply implements Strategy{

    @Override
    public float doOperation(float num1, float num2) {
        return num1 * num2;
    }
    
}
