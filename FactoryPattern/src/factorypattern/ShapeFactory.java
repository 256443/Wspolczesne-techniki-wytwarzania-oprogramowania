/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypattern;

/**
 *
 * @author PrzemysławAntoszek
 */
public class ShapeFactory {
    public Shape getShape(String shapeType){
        if(shapeType==null)
            return null;
        if(shapeType.equalsIgnoreCase("CIRCLE"))
            return new Circle();
        else if(shapeType.equalsIgnoreCase("Square"))
            return new Square();
        else if(shapeType.equalsIgnoreCase("Rectangle"))
            return new Rectangle();
        return null;
    }
}
