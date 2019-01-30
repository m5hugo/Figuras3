
package com.figuras3;

/**
 *
 * @author hugo
 */
public class Punto 
{
    private int puntoX;
    private int puntoY;
    
    public Punto(int x, int y)
    {
        this.puntoX = x;
        this.puntoY = y;
    }
    
    public int getX()
    {
        return this.puntoX;
    }      
    
    public int getY()
    {
        return this.puntoY;
    }
}
