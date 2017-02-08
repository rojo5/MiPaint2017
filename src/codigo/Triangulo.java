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

    public Triangulo(int _posX, int _posY, int _radio, Color _color, boolean _relleno) {
        //Super llama al constructor de la clase superior (polygon en este caso)
        super();
        //Numero de puntos que tiene el poligonos        
        this.npoints = 3;
         int altura = 40;
         int mediaBase = (int) (altura  /Math.tan(Math.toRadians(60)));
        
        this.xpoints[0] = _posX;
        this.ypoints[0] = _posY;
        
        this.xpoints[1] = _posX + mediaBase;
        this.ypoints[1] = _posY +altura;
        
        this.xpoints[2] = _posX - mediaBase;
        this.ypoints[2] = _posY +altura;
        
       
        
        System.out.println(xpoints[0]+ " " + xpoints[1]+ " "+ xpoints[2]+ " ");
        System.out.println(xpoints[0]+ " " + xpoints[1]+ " "+ xpoints[2]+ " ");
        System.out.println(mediaBase);
        this.color = _color;
        this.relleno = _relleno;
    }
    
    public void dibujate(Graphics2D g2, int posX) {
     
        g2.setColor(color);
        if (relleno) {
            g2.fill(this);
        } else {
            g2.draw(this);
        }
    }
   
}
