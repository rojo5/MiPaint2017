/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;

/**
 *
 * @author rojo5
 */
public class Triangulo extends Polygon {
     Color color = null;

    boolean relleno = false;

    public Triangulo(int _posX, int _posY, int _altura, Color _color, boolean _relleno) {
        //Super llama al constructor de la clase superior (polygon en este caso)
        super();
          //número de puntos que tiene el polígono
        this.npoints = 3;

        this.xpoints[0] = _posX;
        this.ypoints[0] = _posY;
        this.ypoints[1] = _posY + _altura;
        this.ypoints[2] = _posY + _altura;
        
        int mediaBase = (int) (_altura / Math.sin(Math.toRadians(60))) ;

        this.xpoints[1] = _posX + mediaBase;
        this.xpoints[2] = _posX - mediaBase;
        this.color = _color;
        this.relleno = _relleno;
    }
    
    public void dibujate(Graphics2D g2, int posY) {
        
        int altura = Math.abs((int) ypoints[0] - posY);
        this.ypoints[1] = posY + altura;
        this.ypoints[2] = posY + altura;
        int mediaBase = (int) (altura / Math.sin(Math.toRadians(60))) ;
        this.xpoints[1] = this.xpoints[0] + mediaBase;
        this.xpoints[2] = this.xpoints[0] - mediaBase;
     
        g2.setColor(color);
        if (relleno) {
            g2.fill(this);
        } else {
            g2.draw(this);
        }
    }
   
}
