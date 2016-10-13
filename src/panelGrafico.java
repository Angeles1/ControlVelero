
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JPanel;

/**
 * @author angeles
 */
public class panelGrafico extends JPanel {
    //atributo de la clase
    public Double anguloVela = 0.0;
    public Double anguloTimon = 0.0;
    public boolean focusVela = false;
    public boolean focusTimon = false;

    @Override
    public void paintComponent(Graphics g) {

        //ordenes iniciales utiles
        super.paintComponent(g);
        Rectangle rect = this.getBounds();//obtener dimensiones
        Graphics2D g2 = (Graphics2D) g; //si se desea utilizar la clase 2D

        //codigo especifico con primitivas
        g2.setStroke(new BasicStroke(3.0f)); //grosor del pincel
        g2.drawOval(100, 100, 100, 200); //dibuja el casco
        //dibuja la vela
        int x1 = 150;
        int y1 = 150;
        int x2 = x1 + (int) (100.0 * Math.sin(anguloVela));
        int y2 = y1 + (int) (100.0 * Math.cos(anguloVela));
        if (focusVela) {
            g2.setColor(Color.red);
            g2.drawLine(x1, y1, x2, y2);
            g2.setColor(Color.black);
        } else {
            g2.drawLine(x1, y1, x2, y2);
        }
        //dibuja el timon
        x1 = 150;
        y1 = 300;
        x2 = x1 + (int) (50.0 * Math.sin(anguloTimon));
        y2 = y1 + (int) (50.0 * Math.cos(anguloTimon));
        if (focusTimon) {//si focalizado
            g2.setColor(Color.red);
            g2.drawLine(x1, y1, x2, y2);
            g2.setColor(Color.black);
        } else {
            g2.drawLine(x1, y1, x2, y2);
        }
    }
}
