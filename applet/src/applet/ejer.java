
package applet;

import java.applet.Applet;
import java.awt.Image;




  

    import javax.swing.*; import java.awt.*;
public class ejer extends JFrame{
    private Image casa;
    public void init(){
    casa=getImage(getCodeBase(),"up.jpg");
    }
    public ejer(){
         super("Dibujando");
         setSize(400,400);
         getContentPane().add(new Lienzo());
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         setVisible(true);
    }
    public static void main(String [] ar){
        new ejer(); 
    }
 }
 class Lienzo extends Canvas{
    public void paint(Graphics g){
     //Dibujando fondo negro
     g.setColor(Color.black);
     g.fillRect(0,0,getWidth(),getHeight());
     //Cuadrado de la casa 
     g.setColor(Color.yellow);
     g.fillRect(100,100,200,200);
     //Dibujando techo
      int x[]={100,200,300};
      int y[]={100,20,100};
      g.setColor(Color.blue);
      g.fillPolygon(x,y,3);
     //dibujar ventana
     g.setColor(Color.gray);
     g.fillRect(120,150,40,40);
     
       g.setColor(Color.gray);
     g.fillRect(230,150,40,40);
     

     //Dibujar puerta 
     g.setColor(Color.green);
     g.fillRect(180,200,40,100); 
    } 
}

    



