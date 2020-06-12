package model;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class drawingFont extends JComponent

{

	
	
	static int Cori;
	static int P;
	public static int rubcor[][]= new int[1][200];
	static int data13;
	 static int k=0;
	 static int count=0;
	 
	    static int Edi;
		static int M;
		public static int rubed[][]= new int[1][200];
		static int data1k;
		 static int l=0;
		 static int S;
		 public ImageIcon image;
		 public JLabel labelimage;
	
		 
		 
		
	 
	 
	 
	 public void paint(Graphics g) 
	 
	 {
	      Graphics2D g2 = (Graphics2D)g;        
	      Graphics2D g1 = (Graphics2D)g;  
	      
	      
	      
	      
	      
	      
	      
	      Font boldFont = new Font("Serif", Font.BOLD, 30);        
	      g2.setFont(boldFont);
	      g2.setColor(Color.blue);
	      g2.drawString("Cube Solution", 20, 70); 
	      
	      Font boldFont1 = new Font("Serif", Font.BOLD, 18);        
	      g2.setFont(boldFont1);
	      
	      
	      g2.setColor(Color.red);
	  
	      g2.drawString("Corner Solution", 20, 180); 
	      
	      
	      
	      
	      
	      

	      System.out.println("rubcor");
	      
	      
	      while((   ( (Cube.rubcor[0][P])==0)&&((Cube.rubcor[0][P+1])==0) )  ==false   )

	      {
	    	  //System.out.println("reached here");
	              Cube.data13=Cube.rubcor[0][P];
	     
	      
	              
	      
	      
	              
	              switch(Cube.data13)
	              {

	              
	              
	                   
	                      case 1:
	                    	  System.out.print("ya"+"\t");
	                    	 //add(new JLabel("ya"),gc);
	                    	  
	       					 //R U’ R’ U’ R U R’ F’ R U R’ U’ R’ F R
	                    	  
	                    	  g2.drawString("ya", k, 250);
	                    	  k=k+30;

	       									
	                        break;

	                         case 3:
	                        	 System.out.print("F"+"\t");
	                        	 g2.drawString("F", k, 250);
		                    	  k=k+30;
	                    	
	       					 break;

	       						 case 33:
	       				
	       							 System.out.print("F' "+"\t");        
	       							 g2.drawString("F'", k, 250);
			                    	  k=k+30;



	                        				break;

	                          case 7:
	                        	  System.out.print("R"+"\t");
	                        	  g2.drawString("R", k, 250);
		                    	  k=k+30;
		                    	  
		                    	  break;

	       					   case 77:
	       						   System.out.print("R'"+"\t");
	       						 g2.drawString("R'", k, 250);
		                    	  k=k+30;




	       					  break;
	       					
	       					   case 5:
	       						   System.out.print("D"+"\t");
	       						 g2.drawString("D", k, 250);
		                    	  k=k+30;

	       					  break;
	       					
	       					 case 55:
	       						 System.out.print("D'"+"\t");
	       						 g2.drawString("D' ", k, 250);
		                    	  k=k+30;

	       						break;
	       				
	       				   case 8:
	       					   System.out.print("U"+"\t");
	       					 g2.drawString("U", k, 250);
	                    	  k=k+30;
    
	       				  break;
	       				
	       				   case 88:
	       					   System.out.print("U'"+"\t");
	       					 g2.drawString("U'", k, 250);
	                    	  k=k+30;
      
	       				  break;
	       				
	       				   case 4:
	       					   System.out.print("L"+"\t");
	       					 g2.drawString("L", k, 250);
	                    	  k=k+30;  
	       				  break;
	       				
	       				   case 44:
	       					   System.out.print("L'"+"\t");
	       					 g2.drawString("L'", k, 250);
	                    	  k=k+30;         
	       				  break;
	       				
	       				  
	       				    
	                        }

	                         
	                                P=P+1;
	       
	                    }
	  	
	                     // repaint();
	  	  
	      
	      
	      //Font boldFont = new Font("Serif", Font.BOLD, 24);        
	      g1.setFont(boldFont1);
	      g1.setColor(Color.black);
	      g1.drawString("Edge Solution", 20, 280); 
	      
	      
    System.out.println("rubed");
	      
	      
	      while((   ( (Cube.rubed[0][M])==0)&&((Cube.rubed[0][M+1])==0) )  ==false   )

	      {
	    	  
	    	  
	    	 //System.out.println("reached here");
	              Cube.data14=Cube.rubed[0][M];
	               
	      
	              
	      
	      
	              
	              switch(Cube.data14)
	                        {

	                        case 2:
	          				  //Serial.println("the cube makes ya move");
	          					  System.out.print("T"+"\t");
	          					 g1.drawString("T", l, 320+S);
		                    	  l=l+20;
	          					  
	          					  
	          						//R U R’ U’ R’ F R2 U’ R’ U’ R U R’ F’


	          							 	
	          				  break;
	          				   
	          				 case 3:
	          				  //Serial.println("the cube makes F move");
	          					 System.out.print("F"+"\t");
	          					g1.drawString("F", l, 320+S);
		                    	  l=l+20;


	          				  break;
	          				
	          				   case 33:
	          				 // Serial.println("the cube makes FP move");
	          					   System.out.print("F' "+"\t");
	                               
	          					 g1.drawString("F'", l, 320+S);
		                    	  l=l+20;
	          					   
	          				  break;
	          				
	          				   case 7:
	          				 // Serial.println("the cube makes R move");
	          					   System.out.print("R"+"\t");
	          					 g1.drawString("R", l, 320+S);
		                    	  l=l+20; 	 
	          				  break;
	          				
	          				   case 77:
	          				  //Serial.println("the cube makes RP move");
	          					   System.out.print("R'"+"\t");
	          					 g1.drawString("R'", l, 320+S );
		                    	  l=l+20;
	                                	 
	          				  break;
	          				
	          				   case 5:
	          				 // Serial.println("the cube makes D move");
	          					   System.out.print("D"+"\t");
	          					 g1.drawString("D", l, 320+S);
		                    	  l=l+20;
	                                	 
	          				  break;
	          				
	          				   case 55:
	          				 // Serial.println("the cube makes DP move");
	          					   System.out.print("D'"+"\t");
	          					 g1.drawString("D'", l, 320+S);
		                    	  l=l+20; 	 
	          				  break;
	          				
	          				   case 8:
	          				  //Serial.println("the cube makes U move");
	          					   System.out.print("U"+"\t");
	          					 g1.drawString("U", l, 320+S);
		                    	  l=l+20;
	          				  break;
	          				
	          				   case 88:
	          				 // Serial.println("the cube makes UP move");
	          					   System.out.print("U'"+"\t");
	          					 g1.drawString("U'", l, 320+S);
		                    	  l=l+20; 	 
	          				  break;
	          				
	          				   case 4:
	          				  //Serial.println("the cube makes L move");
	          					   System.out.print("L"+"\t");
	          					 g1.drawString("L", l, 320+S);
		                    	  l=l+20; 	 
	          				  break;
	          				
	          				   case 44:
	          				  //Serial.println("the cube makes LP move");
	          					   System.out.print("L'"+"\t");
	          					 g1.drawString("L'", l, 320+S);
		                    	  l=l+20;
	          				  break;
	          				
	          				  
	          						   case 6:
	          				  //Serial.println("the cube makes F move");
	          							   System.out.print("B"+"\t");
	          							 g1.drawString("B", l, 320+S);
	   		                    	  l=l+20;

	          				  break;
	                                	 
	          						    case 66:
	          				  //Serial.println("the cube makes F move");
	          						    	 System.out.print("B'"+"\t");
	          						    	g1.drawString("B'", l, 320+S);
	      		                    	  l=l+20;

	          				  break;
      
	       				    
	                        }
                                  count++;
                                  
                                  
                                  if(count>50)
                                  {
                                	  S=S+50;
                                	  l=0;
                                	  count=0;
                                  }
                                  
	                               
	                                M=M+1;
	       
	                    }
	  	
	                      //repaint();
	  	  
	      
	      
	      
	      
	        }
	     
     }    
	 

	



