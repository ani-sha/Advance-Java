import java.awt.*;    
import java.applet.*;    
    
public class Shapes extends Applet    
 {    
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void  paint(Graphics g)    
   {    
      g.drawLine(25,25,100,25);    
    
      g.drawRect(25,40,100,50);    
    
      g.fillRect(145,40,100,50);    
    
      g.drawRect(265,40,50,50);    
    
      g.drawRoundRect(25,125,100,50,15,15);    
    
      g.fillRoundRect(145,125,100,50,15,15);    
    
      g.drawOval(25,205,100,50);    
    
      g.fillOval(145,205,100,50);    
    
      g.drawOval(265,205,50,50);    
    
      g.draw3DRect(25,280,100,50,true);    
    
      g.draw3DRect(145,280,100,50,false);    
    
      g.drawArc(25,345,100,50,25,75);    
    
      g.drawArc(145,345,100,50,125,75);    
   }    
 }    
    
/* <applet code = "shap.class" height = 500 width =500>  
   </applet> */
