package model;




import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class drawingTrial extends Frame {
       
   public drawingTrial(){
      super("Java AWT Examples");
      prepareGUI();
   }

   public static void main(String[] args){
	   drawingTrial  awtGraphicsDemo = new drawingTrial();  
      awtGraphicsDemo.setVisible(true);
   }

   private void prepareGUI(){
      setSize(400,400);
      addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      }); 
   }    

   @Override
   public void paint(Graphics g) {
      Graphics2D g2 = (Graphics2D)g;        
      
      
      
      Font boldFont = new Font("Serif", Font.BOLD, 24);        
      g2.setFont(boldFont);
      g2.drawString("Welcome to TutorialsPoint", 50, 170); 
     
   }
}