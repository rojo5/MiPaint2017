/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author rojo5
 */
public class Cuadrado extends Rectangle2D.Double{
    
    
    Color color = null;
    
    boolean relleno = false;
    
    public Cuadrado(int _posX, int _posY, int _lado, Color _color, boolean _relleno) {
        super();
        //El "this"  se regiere al objeto al que extiendes
        this.x =_posX;
        this.y = _posY;
        this.width =_lado;
        this.height = _lado;
        this.color = _color;
        this.relleno =_relleno;
    }
    
    
    public void dibujate(Graphics2D g2, int posX){
         int lado = Math.abs((int) this.x - posX);
                this.width = lado;
                this.height = lado;
        g2.setColor(color);
        if(relleno){
            g2.fill(this);
        }
        else{
            g2.draw(this);
        }
    }
    
}
