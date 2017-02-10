/*
 * La clase Forma es la clase comun a todos los objetos graficos qye estamos
 creando y contiene los metrodos comunes de pintado de calculo de posicion de 
vertices y las propiedades comunes de todos los ojetos graficos que estamos creando:
el colorm el relleno, la posicion X e Y y el numero de lados
 */
package codigo;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;

/**
 *
 * @author Jorge Cisneros
 */
public class Forma extends Polygon {

    Color color = null;
    boolean relleno = false;
    int x = 0;
    int y = 0;
    int numLados;

    public Forma(int _posX, int _posY, int[] _puntosX, int[] _puntosY,  Color _color, boolean _relleno, int _numLados) {
        super(_puntosX, _puntosY, _numLados);
        numLados= _numLados;
        this.x = _posX;
        this.y = _posY;
        calculaVertices(1);
        color = _color;
        relleno = _relleno;
    }

    public void dibujate(Graphics2D g2, int posY) {
        int radio = this.y - posY;
        calculaVertices(radio);
        g2.setColor(color);
        if (relleno) {
            g2.fill(this);
        } else {
            g2.draw(this);
        }

    }

    public void calculaVertices(int _radio) {

        for (int i = 0; i < numLados; i++) {
            this.xpoints[i] = (int) (this.x + _radio * Math.cos(2 * Math.PI * i / npoints));
            this.ypoints[i] = (int) (this.y + _radio * Math.sin(2 * Math.PI * i / npoints));
        }

    }
}