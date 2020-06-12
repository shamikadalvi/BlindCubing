package model;

import javax.swing.JComponent;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Line2D;

public class drawingComponent extends JComponent implements ActionListener

{

	Cube cu = new Cube();
	
	
	
	static String[][] data12;
	
	
	static String[][] data13;
	static String[][] data14;
	static String[][] data15;
	static String[][] data16;
	static String[][] data17;
	static String[][] UpdateWhiteColor;
	
	
	static String data12White00;
	static String data12White01;
	static String data12White02;
	static String data12White10;
	static String  data12White11;
	static String  data12White12;
	static String  data12White20;
	static String  data12White21;
	static String  data12White22;
	
	
	static String data13Green00;
	static String data13Green01;
	static String data13Green02;
	static String data13Green10;
	static String  data13Green11;
	static String  data13Green12;
	static String  data13Green20;
	static String  data13Green21;
	static String  data13Green22;
	
	
	static String data14Blue00;
	static String data14Blue01;
	static String data14Blue02;
	static String data14Blue10;
	static String  data14Blue11;
	static String  data14Blue12;
	static String  data14Blue20;
	static String  data14Blue21;
	static String  data14Blue22;
	
	
	
	static String data15Red00;
	static String data15Red01;
	static String data15Red02;
	static String data15Red10;
	static String  data15Red11;
	static String  data15Red12;
	static String  data15Red20;
	static String  data15Red21;
	static String  data15Red22;
	
	
	
	static String data16Orange00;
	static String data16Orange01;
	static String data16Orange02;
	static String data16Orange10;
	static String  data16Orange11;
	static String  data16Orange12;
	static String  data16Orange20;
	static String  data16Orange21;
	static String  data16Orange22;
	
	
	static String data17Yellow00;
	static String data17Yellow01;
	static String data17Yellow02;
	static String data17Yellow10;
	static String  data17Yellow11;
	static String  data17Yellow12;
	static String  data17Yellow20;
	static String  data17Yellow21;
	static String  data17Yellow22;
	
	
	
	
	
	
	
	
	
	
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 =(Graphics2D)	g;
		Graphics2D g1 =(Graphics2D)	g;
		
		Color yellow  = new Color(245,245,0);
		Color orange = new Color(255,140,0);
		
		
		 data12 = Cube.getColorWhite();
		 data12White00= data12[0][0];
		 data12White01= data12[0][1];
		 data12White02= data12[0][2];
		 data12White10= data12[1][0];
		 data12White11= data12[1][1];
		 data12White12= data12[1][2];
		 data12White20= data12[2][0];
		 data12White21= data12[2][1];
		 data12White22= data12[2][2];
		 
		 
		 
		 
		
		//System.out.println("the color of white at start" + data12White00);
		
	
		
	   
		
		
		Rectangle rect1 = new Rectangle(145,145,40,40);
		
		if(data12White00.equals("W")==false)
		{
			if(data12White00.equals("O")==false)
			{
				
				if(data12White00.equals("B")==false)
				{
					
			       if(data12White00.equals("R")==false)
			    		   {
			    	          if(data12White00.equals("G")==false)
			    	        	  
			    	          {
			    	        	  
			    	        	  g2.setColor(yellow);
									
									g2.fill(rect1);
									
								
			    	          }
			    	          
			    	          
			    	          
			    	          else
			    	          {
			    	        	  g2.setColor(Color.GREEN);
									
									g2.fill(rect1);
									
									
			    	        	  
			    	          }
			    	          
			    	         
			    	         
			    		   }
			       
			       else
			       {
			    	   g2.setColor(Color.RED);
						
						g2.fill(rect1);
			    	   
			       }
				}
				
				else
				{
					g2.setColor(Color.BLUE);
					
					g2.fill(rect1);
					
				}
			}
			
			else
			{
				
				g2.setColor(orange);
				
				g2.fill(rect1);
			}
			
		}
		
		else
			
		{
			g2.setColor(Color.WHITE);
			
			g2.fill(rect1);
		}
		
		
		
		
		Rectangle rect2 = new Rectangle(185,145,40,40);
		
		if(data12White01.equals("W")==false)
		{
			if(data12White01.equals("O")==false)
			{
				
				if(data12White01.equals("B")==false)
				{
					
			       if(data12White01.equals("R")==false)
			    		   {
			    	          if(data12White01.equals("G")==false)
			    	        	  
			    	          {
			    	        	  
			    	        	  g2.setColor(yellow);
									
									g2.fill(rect2);
									
								
			    	          }
			    	          
			    	          
			    	          
			    	          else
			    	          {
			    	        	  g2.setColor(Color.GREEN);
									
									g2.fill(rect2);
									
									
			    	        	  
			    	          }
			    	          
			    	         
			    	         
			    		   }
			       
			       else
			       {
			    	   g2.setColor(Color.RED);
						
						g2.fill(rect2);
			    	   
			       }
				}
				
				else
				{
					g2.setColor(Color.BLUE);
					
					g2.fill(rect2);
					
				}
			}
			
			else
			{
				
				g2.setColor(orange);
				
				g2.fill(rect2);
			}
			
		}
		
		else
			
		{
			g2.setColor(Color.WHITE);
			
			g2.fill(rect2);
		}
		
		
		
		Rectangle rect3 = new Rectangle(225,145,40,40);
		
		if(data12White02.equals("W")==false)
		{
			if(data12White02.equals("O")==false)
			{
				
				if(data12White02.equals("B")==false)
				{
					
			       if(data12White02.equals("R")==false)
			    		   {
			    	          if(data12White02.equals("G")==false)
			    	        	  
			    	          {
			    	        	  
			    	        	  g2.setColor(yellow);
									
									g2.fill(rect3);
									
								
			    	          }
			    	          
			    	          
			    	          
			    	          else
			    	          {
			    	        	  g2.setColor(Color.GREEN);
									
									g2.fill(rect3);
									
									
			    	        	  
			    	          }
			    	          
			    	         
			    	         
			    		   }
			       
			       else
			       {
			    	   g2.setColor(Color.RED);
						
						g2.fill(rect3);
			    	   
			       }
				}
				
				else
				{
					g2.setColor(Color.BLUE);
					
					g2.fill(rect3);
					
				}
			}
			
			else
			{
				
				g2.setColor(orange);
				
				g2.fill(rect3);
			}
			
		}
		
		else
			
		{
			g2.setColor(Color.WHITE);
			
			g2.fill(rect3);
		}
		
		
		
		Rectangle rect4 = new Rectangle(145,185,40,40);
		
		if(data12White10.equals("W")==false)
		{
			if(data12White10.equals("O")==false)
			{
				
				if(data12White10.equals("B")==false)
				{
					
			       if(data12White10.equals("R")==false)
			    		   {
			    	          if(data12White10.equals("G")==false)
			    	        	  
			    	          {
			    	        	  
			    	        	  g2.setColor(yellow);
									
									g2.fill(rect4);
									
								
			    	          }
			    	          
			    	          
			    	          
			    	          else
			    	          {
			    	        	  g2.setColor(Color.GREEN);
									
									g2.fill(rect4);
									
									
			    	        	  
			    	          }
			    	          
			    	         
			    	         
			    		   }
			       
			       else
			       {
			    	   g2.setColor(Color.RED);
						
						g2.fill(rect4);
			    	   
			       }
				}
				
				else
				{
					g2.setColor(Color.BLUE);
					
					g2.fill(rect4);
					
				}
			}
			
			else
			{
				
				g2.setColor(orange);
				
				g2.fill(rect4);
			}
			
		}
		
		else
			
		{
			g2.setColor(Color.WHITE);
			
			g2.fill(rect4);
		}
		
		
		
		
	
		
		Rectangle rect5 = new Rectangle(185,185,40,40);
		
		if(data12White11.equals("W")==false)
		{
			if(data12White11.equals("O")==false)
			{
				
				if(data12White11.equals("B")==false)
				{
					
			       if(data12White11.equals("R")==false)
			    		   {
			    	          if(data12White11.equals("G")==false)
			    	        	  
			    	          {
			    	        	  
			    	        	  g2.setColor(yellow);
									
									g2.fill(rect5);
									
								
			    	          }
			    	          
			    	          
			    	          
			    	          else
			    	          {
			    	        	  g2.setColor(Color.GREEN);
									
									g2.fill(rect5);
									
									
			    	        	  
			    	          }
			    	          
			    	         
			    	         
			    		   }
			       
			       else
			       {
			    	   g2.setColor(Color.RED);
						
						g2.fill(rect5);
			    	   
			       }
				}
				
				else
				{
					g2.setColor(Color.BLUE);
					
					g2.fill(rect5);
					
				}
			}
			
			else
			{
				
				g2.setColor(orange);
				
				g2.fill(rect5);
			}
			
		}
		
		else
			
		{
			g2.setColor(Color.WHITE);
			
			g2.fill(rect5);
		}
		
		
		
		
		Rectangle rect6 = new Rectangle(225,185,40,40);
		
		if(data12White12.equals("W")==false)
		{
			if(data12White12.equals("O")==false)
			{
				
				if(data12White12.equals("B")==false)
				{
					
			       if(data12White12.equals("R")==false)
			    		   {
			    	          if(data12White12.equals("G")==false)
			    	        	  
			    	          {
			    	        	  
			    	        	  g2.setColor(yellow);
									
									g2.fill(rect6);
									
								
			    	          }
			    	          
			    	          
			    	          
			    	          else
			    	          {
			    	        	  g2.setColor(Color.GREEN);
									
									g2.fill(rect6);
									
									
			    	        	  
			    	          }
			    	          
			    	         
			    	         
			    		   }
			       
			       else
			       {
			    	   g2.setColor(Color.RED);
						
						g2.fill(rect6);
			    	   
			       }
				}
				
				else
				{
					g2.setColor(Color.BLUE);
					
					g2.fill(rect6);
					
				}
			}
			
			else
			{
				
				g2.setColor(orange);
				
				g2.fill(rect6);
			}
			
		}
		
		else
			
		{
			g2.setColor(Color.WHITE);
			
			g2.fill(rect6);
		}
		
		
		
		Rectangle rect7 = new Rectangle(145,225,40,40);
		
		if(data12White20.equals("W")==false)
		{
			if(data12White20.equals("O")==false)
			{
				
				if(data12White20.equals("B")==false)
				{
					
			       if(data12White20.equals("R")==false)
			    		   {
			    	          if(data12White20.equals("G")==false)
			    	        	  
			    	          {
			    	        	  
			    	        	  g2.setColor(yellow);
									
									g2.fill(rect7);
									
								
			    	          }
			    	          
			    	          
			    	          
			    	          else
			    	          {
			    	        	  g2.setColor(Color.GREEN);
									
									g2.fill(rect7);
									
									
			    	        	  
			    	          }
			    	          
			    	         
			    	         
			    		   }
			       
			       else
			       {
			    	   g2.setColor(Color.RED);
						
						g2.fill(rect7);
			    	   
			       }
				}
				
				else
				{
					g2.setColor(Color.BLUE);
					
					g2.fill(rect7);
					
				}
			}
			
			else
			{
				
				g2.setColor(orange);
				
				g2.fill(rect7);
			}
			
		}
		
		else
			
		{
			g2.setColor(Color.WHITE);
			
			g2.fill(rect7);
		}
		
		
		
		
		

		Rectangle rect8 = new Rectangle(185,225,40,40);
		
		if(data12White21.equals("W")==false)
		{
			if(data12White21.equals("O")==false)
			{
				
				if(data12White21.equals("B")==false)
				{
					
			       if(data12White21.equals("R")==false)
			    		   {
			    	          if(data12White21.equals("G")==false)
			    	        	  
			    	          {
			    	        	  
			    	        	  g2.setColor(yellow);
									
									g2.fill(rect8);
									
								
			    	          }
			    	          
			    	          
			    	          
			    	          else
			    	          {
			    	        	  g2.setColor(Color.GREEN);
									
									g2.fill(rect8);
									
									
			    	        	  
			    	          }
			    	          
			    	         
			    	         
			    		   }
			       
			       else
			       {
			    	   g2.setColor(Color.RED);
						
						g2.fill(rect8);
			    	   
			       }
				}
				
				else
				{
					g2.setColor(Color.BLUE);
					
					g2.fill(rect8);
					
				}
			}
			
			else
			{
				
				g2.setColor(orange);
				
				g2.fill(rect8);
			}
			
		}
		
		else
			
		{
			g2.setColor(Color.WHITE);
			
			g2.fill(rect8);
		}
		
		
		
		

		Rectangle rect9 = new Rectangle(225,225,40,40);
		
		if(data12White22.equals("W")==false)
		{
			if(data12White22.equals("O")==false)
			{
				
				if(data12White22.equals("B")==false)
				{
					
			       if(data12White22.equals("R")==false)
			    		   {
			    	          if(data12White22.equals("G")==false)
			    	        	  
			    	          {
			    	        	  
			    	        	  g2.setColor(yellow);
									
									g2.fill(rect9);
									
								
			    	          }
			    	          
			    	          
			    	          
			    	          else
			    	          {
			    	        	  g2.setColor(Color.GREEN);
									
									g2.fill(rect9);
									
									
			    	        	  
			    	          }
			    	          
			    	         
			    	         
			    		   }
			       
			       else
			       {
			    	   g2.setColor(Color.RED);
						
						g2.fill(rect9);
			    	   
			       }
				}
				
				else
				{
					g2.setColor(Color.BLUE);
					
					g2.fill(rect9);
					
				}
			}
			
			else
			{
				
				g2.setColor(orange);
				
				g2.fill(rect9);
			}
			
		}
		
		else
			
		{
			g2.setColor(Color.WHITE);
			
			g2.fill(rect9);
		}
		
		    Rectangle rectl1 = new Rectangle(145,145,120,6);
			g2.setColor(Color.BLACK);
			
			g2.fill(rectl1);
		
			Rectangle rectl2 = new Rectangle(145,185,120,4);
			g2.setColor(Color.BLACK);
			
			g2.fill(rectl2);
		
			
			Rectangle rectl3 = new Rectangle(145,225,120,4);
			g2.setColor(Color.BLACK);
			
			g2.fill(rectl3);
			
			
			
			Rectangle rectl4 = new Rectangle(145,265,120,6);
			g2.setColor(Color.BLACK);
			
			g2.fill(rectl4);
	
		
			
			Rectangle rectl5 = new Rectangle(145,145,4,240);
			g2.setColor(Color.BLACK);
			
			g2.fill(rectl5);
			
			
			
			Rectangle rectl6 = new Rectangle(185,145,4,240);
			g2.setColor(Color.BLACK);
			
			g2.fill(rectl6);
			
			
			
			Rectangle rectl7 = new Rectangle(225,145,4,240);
			g2.setColor(Color.BLACK);
			
			g2.fill(rectl7);
			
			
			Rectangle rectl8 = new Rectangle(265,145,6,240);
			g2.setColor(Color.BLACK);
			
			g2.fill(rectl8);
		
		
			
			////GREEN
			
			
			
			 data13 = Cube.getColorGreen();
			 data13Green00= data13[0][0];
			 data13Green01= data13[0][1];
			 data13Green02= data13[0][2];
			 data13Green10= data13[1][0];
			 data13Green11= data13[1][1];
			 data13Green12= data13[1][2];
			 data13Green20= data13[2][0];
			 data13Green21= data13[2][1];
			 data13Green22= data13[2][2];
			 
			 
			 
			 
			
		//	System.out.println("the color of green at start" + data13Green00);
			
		
			
		   
			
			
			Rectangle rect11 = new Rectangle(145,265,40,40);
			
			if(data13Green00.equals("W")==false)
			{
				if(data13Green00.equals("O")==false)
				{
					
					if(data13Green00.equals("B")==false)
					{
						
				       if(data13Green00.equals("R")==false)
				    		   {
				    	          if(data13Green00.equals("G")==false)
				    	        	  
				    	          {
				    	        	  
				    	        	  g2.setColor(yellow);
										
										g2.fill(rect11);
										
									
				    	          }
				    	          
				    	          
				    	          
				    	          else
				    	          {
				    	        	  g2.setColor(Color.GREEN);
										
										g2.fill(rect11);
										
										
				    	        	  
				    	          }
				    	          
				    	         
				    	         
				    		   }
				       
				       else
				       {
				    	   g2.setColor(Color.RED);
							
							g2.fill(rect11);
				    	   
				       }
					}
					
					else
					{
						g2.setColor(Color.BLUE);
						
						g2.fill(rect11);
						
					}
				}
				
				else
				{
					
					g2.setColor(orange);
					
					g2.fill(rect11);
				}
				
			}
			
			else
				
			{
				g2.setColor(Color.WHITE);
				
				g2.fill(rect11);
			}
			
			
			
			
			Rectangle rect12 = new Rectangle(185,265,40,40);
			
			if(data13Green01.equals("W")==false)
			{
				if(data13Green01.equals("O")==false)
				{
					
					if(data13Green01.equals("B")==false)
					{
						
				       if(data13Green01.equals("R")==false)
				    		   {
				    	          if(data13Green01.equals("G")==false)
				    	        	  
				    	          {
				    	        	  
				    	        	  g2.setColor(yellow);
										
										g2.fill(rect12);
										
									
				    	          }
				    	          
				    	          
				    	          
				    	          else
				    	          {
				    	        	  g2.setColor(Color.GREEN);
										
										g2.fill(rect12);
										
										
				    	        	  
				    	          }
				    	          
				    	         
				    	         
				    		   }
				       
				       else
				       {
				    	   g2.setColor(Color.RED);
							
							g2.fill(rect12);
				    	   
				       }
					}
					
					else
					{
						g2.setColor(Color.BLUE);
						
						g2.fill(rect12);
						
					}
				}
				
				else
				{
					
					g2.setColor(orange);
					
					g2.fill(rect12);
				}
				
			}
			
			else
				
			{
				g2.setColor(Color.WHITE);
				
				g2.fill(rect12);
			}
			
			
			
			Rectangle rect13 = new Rectangle(225,265,40,40);
			
			if(data13Green02.equals("W")==false)
			{
				if(data13Green02.equals("O")==false)
				{
					
					if(data13Green02.equals("B")==false)
					{
						
				       if(data13Green02.equals("R")==false)
				    		   {
				    	          if(data13Green02.equals("G")==false)
				    	        	  
				    	          {
				    	        	  
				    	        	  g2.setColor(yellow);
										
										g2.fill(rect13);
										
									
				    	          }
				    	          
				    	          
				    	          
				    	          else
				    	          {
				    	        	  g2.setColor(Color.GREEN);
										
										g2.fill(rect13);
										
										
				    	        	  
				    	          }
				    	          
				    	         
				    	         
				    		   }
				       
				       else
				       {
				    	   g2.setColor(Color.RED);
							
							g2.fill(rect13);
				    	   
				       }
					}
					
					else
					{
						g2.setColor(Color.BLUE);
						
						g2.fill(rect13);
						
					}
				}
				
				else
				{
					
					g2.setColor(orange);
					
					g2.fill(rect13);
				}
				
			}
			
			else
				
			{
				g2.setColor(Color.WHITE);
				
				g2.fill(rect13);
			}
			
			///------------------------------------------------//
			
			
			
			Rectangle rect14 = new Rectangle(145,305,40,40);
			
			if(data13Green10.equals("W")==false)
			{
				if(data13Green10.equals("O")==false)
				{
					
					if(data13Green10.equals("B")==false)
					{
						
				       if(data13Green10.equals("R")==false)
				    		   {
				    	          if(data13Green10.equals("G")==false)
				    	        	  
				    	          {
				    	        	  
				    	        	  g2.setColor(yellow);
										
										g2.fill(rect14);
										
									
				    	          }
				    	          
				    	          
				    	          
				    	          else
				    	          {
				    	        	  g2.setColor(Color.GREEN);
										
										g2.fill(rect14);
										
										
				    	        	  
				    	          }
				    	          
				    	         
				    	         
				    		   }
				       
				       else
				       {
				    	   g2.setColor(Color.RED);
							
							g2.fill(rect14);
				    	   
				       }
					}
					
					else
					{
						g2.setColor(Color.BLUE);
						
						g2.fill(rect14);
						
					}
				}
				
				else
				{
					
					g2.setColor(orange);
					
					g2.fill(rect14);
				}
				
			}
			
			else
				
			{
				g2.setColor(Color.WHITE);
				
				g2.fill(rect14);
			}
			
			
			
			
		
			
			Rectangle rect15 = new Rectangle(185,305,40,40);
			
			if(data13Green11.equals("W")==false)
			{
				if(data13Green11.equals("O")==false)
				{
					
					if(data13Green11.equals("B")==false)
					{
						
				       if(data13Green11.equals("R")==false)
				    		   {
				    	          if(data13Green11.equals("G")==false)
				    	        	  
				    	          {
				    	        	  
				    	        	  g2.setColor(yellow);
										
										g2.fill(rect15);
										
									
				    	          }
				    	          
				    	          
				    	          
				    	          else
				    	          {
				    	        	  g2.setColor(Color.GREEN);
										
										g2.fill(rect15);
										
										
				    	        	  
				    	          }
				    	          
				    	         
				    	         
				    		   }
				       
				       else
				       {
				    	   g2.setColor(Color.RED);
							
							g2.fill(rect15);
				    	   
				       }
					}
					
					else
					{
						g2.setColor(Color.BLUE);
						
						g2.fill(rect15);
						
					}
				}
				
				else
				{
					
					g2.setColor(orange);
					
					g2.fill(rect15);
				}
				
			}
			
			else
				
			{
				g2.setColor(Color.WHITE);
				
				g2.fill(rect15);
			}
			
			
			
			
			Rectangle rect16 = new Rectangle(225,305,40,40);
			
			if(data13Green12.equals("W")==false)
			{
				if(data13Green12.equals("O")==false)
				{
					
					if(data13Green12.equals("B")==false)
					{
						
				       if(data13Green12.equals("R")==false)
				    		   {
				    	          if(data13Green12.equals("G")==false)
				    	        	  
				    	          {
				    	        	  
				    	        	  g2.setColor(yellow);
										
										g2.fill(rect16);
										
									
				    	          }
				    	          
				    	          
				    	          
				    	          else
				    	          {
				    	        	  g2.setColor(Color.GREEN);
										
										g2.fill(rect16);
										
										
				    	        	  
				    	          }
				    	          
				    	         
				    	         
				    		   }
				       
				       else
				       {
				    	   g2.setColor(Color.RED);
							
							g2.fill(rect16);
				    	   
				       }
					}
					
					else
					{
						g2.setColor(Color.BLUE);
						
						g2.fill(rect16);
						
					}
				}
				
				else
				{
					
					g2.setColor(orange);
					
					g2.fill(rect16);
				}
				
			}
			
			else
				
			{
				g2.setColor(Color.WHITE);
				
				g2.fill(rect16);
			}
			
			
			
			Rectangle rect17 = new Rectangle(145,345,40,40);
			
			if(data13Green20.equals("W")==false)
			{
				if(data13Green20.equals("O")==false)
				{
					
					if(data13Green20.equals("B")==false)
					{
						
				       if(data13Green20.equals("R")==false)
				    		   {
				    	          if(data13Green20.equals("G")==false)
				    	        	  
				    	          {
				    	        	  
				    	        	  g2.setColor(yellow);
										
										g2.fill(rect17);
										
									
				    	          }
				    	          
				    	          
				    	          
				    	          else
				    	          {
				    	        	  g2.setColor(Color.GREEN);
										
										g2.fill(rect17);
										
										
				    	        	  
				    	          }
				    	          
				    	         
				    	         
				    		   }
				       
				       else
				       {
				    	   g2.setColor(Color.RED);
							
							g2.fill(rect17);
				    	   
				       }
					}
					
					else
					{
						g2.setColor(Color.BLUE);
						
						g2.fill(rect17);
						
					}
				}
				
				else
				{
					
					g2.setColor(orange);
					
					g2.fill(rect17);
				}
				
			}
			
			else
				
			{
				g2.setColor(Color.WHITE);
				
				g2.fill(rect17);
			}
			
			
			
			
			

			Rectangle rect18 = new Rectangle(185,345,40,40);
			
			if(data13Green21.equals("W")==false)
			{
				if(data13Green21.equals("O")==false)
				{
					
					if(data13Green21.equals("B")==false)
					{
						
				       if(data13Green21.equals("R")==false)
				    		   {
				    	          if(data13Green21.equals("G")==false)
				    	        	  
				    	          {
				    	        	  
				    	        	  g2.setColor(yellow);
										
										g2.fill(rect18);
										
									
				    	          }
				    	          
				    	          
				    	          
				    	          else
				    	          {
				    	        	  g2.setColor(Color.GREEN);
										
										g2.fill(rect18);
										
										
				    	        	  
				    	          }
				    	          
				    	         
				    	         
				    		   }
				       
				       else
				       {
				    	   g2.setColor(Color.RED);
							
							g2.fill(rect18);
				    	   
				       }
					}
					
					else
					{
						g2.setColor(Color.BLUE);
						
						g2.fill(rect18);
						
					}
				}
				
				else
				{
					
					g2.setColor(orange);
					
					g2.fill(rect18);
				}
				
			}
			
			else
				
			{
				g2.setColor(Color.WHITE);
				
				g2.fill(rect18);
			}
			
			
			
			

			Rectangle rect19 = new Rectangle(225,345,40,40);
			
			if(data13Green22.equals("W")==false)
			{
				if(data13Green22.equals("O")==false)
				{
					
					if(data13Green22.equals("B")==false)
					{
						
				       if(data13Green22.equals("R")==false)
				    		   {
				    	          if(data13Green22.equals("G")==false)
				    	        	  
				    	          {
				    	        	  
				    	        	  g2.setColor(yellow);
										
										g2.fill(rect19);
										
									
				    	          }
				    	          
				    	          
				    	          
				    	          else
				    	          {
				    	        	  g2.setColor(Color.GREEN);
										
										g2.fill(rect19);
										
										
				    	        	  
				    	          }
				    	          
				    	         
				    	         
				    		   }
				       
				       else
				       {
				    	   g2.setColor(Color.RED);
							
							g2.fill(rect19);
				    	   
				       }
					}
					
					else
					{
						g2.setColor(Color.BLUE);
						
						g2.fill(rect19);
						
					}
				}
				
				else
				{
					
					g2.setColor(orange);
					
					g2.fill(rect19);
				}
				
			}
			
			else
				
			{
				g2.setColor(Color.WHITE);
				
				g2.fill(rect19);
			}
			
			
			
			
			
			
			    Rectangle rectl11 = new Rectangle(145,305,120,4);
				g2.setColor(Color.BLACK);
				
				g2.fill(rectl11);
			
				Rectangle rectl12 = new Rectangle(145,345,120,4);
				g2.setColor(Color.BLACK);
				
				g2.fill(rectl12);
			
				
				Rectangle rectl13 = new Rectangle(145,385,120,4);
				g2.setColor(Color.BLACK);
				
				g2.fill(rectl13);
				
				
				Rectangle rectl14 = new Rectangle(185,145,4,240);
				g2.setColor(Color.BLACK);
				
				g2.fill(rectl14);
				
				
				Rectangle rectl15 = new Rectangle(225,145,4,240);
				g2.setColor(Color.BLACK);
				
				g2.fill(rectl15);
				
				Rectangle rectl16 = new Rectangle(145,145,6,240);
				g2.setColor(Color.BLACK);
				
				g2.fill(rectl16);
				
				
				
				Rectangle rectl18 =new Rectangle(145,265,124,4);
				g2.setColor(Color.BLACK);
				
				g2.fill(rectl18);
		
			
            	//BLUE------------------------------------------------
				
				
				
				
				
				 data14 = Cube.getColorBlue();
				 data14Blue00= data14[0][0];
				 data14Blue01= data14[0][1];
				 data14Blue02= data14[0][2];
				 data14Blue10= data14[1][0];
				 data14Blue11= data14[1][1];
				 data14Blue12= data14[1][2];
				 data14Blue20= data14[2][0];
				 data14Blue21= data14[2][1];
				 data14Blue22= data14[2][2];
				 
				 
				 
				 
				
			//	System.out.println("the color of Blue at start" + data14Blue00);
				
			
				
			   
				
				
				Rectangle rect21 = new Rectangle(225,105,40,40);
				
				if(data14Blue00.equals("W")==false)
				{
					if(data14Blue00.equals("O")==false)
					{
						
						if(data14Blue00.equals("B")==false)
						{
							
					       if(data14Blue00.equals("R")==false)
					    		   {
					    	          if(data14Blue00.equals("G")==false)
					    	        	  
					    	          {
					    	        	  
					    	        	  g2.setColor(yellow);
											
											g2.fill(rect21);
											
										
					    	          }
					    	          
					    	          
					    	          
					    	          else
					    	          {
					    	        	  g2.setColor(Color.GREEN);
											
											g2.fill(rect21);
											
											
					    	        	  
					    	          }
					    	          
					    	         
					    	         
					    		   }
					       
					       else
					       {
					    	   g2.setColor(Color.RED);
								
								g2.fill(rect21);
					    	   
					       }
						}
						
						else
						{
							g2.setColor(Color.BLUE);
							
							g2.fill(rect21);
							
						}
					}
					
					else
					{
						
						g2.setColor(orange);
						
						g2.fill(rect21);
					}
					
				}
				
				else
					
				{
					g2.setColor(Color.WHITE);
					
					g2.fill(rect21);
				}
				
				
				
				
				Rectangle rect22 = new Rectangle(185,105,40,40);
				
				if(data14Blue01.equals("W")==false)
				{
					if(data14Blue01.equals("O")==false)
					{
						
						if(data14Blue01.equals("B")==false)
						{
							
					       if(data14Blue01.equals("R")==false)
					    		   {
					    	          if(data14Blue01.equals("G")==false)
					    	        	  
					    	          {
					    	        	  
					    	        	  g2.setColor(yellow);
											
											g2.fill(rect22);
											
										
					    	          }
					    	          
					    	          
					    	          
					    	          else
					    	          {
					    	        	  g2.setColor(Color.GREEN);
											
											g2.fill(rect22);
											
											
					    	        	  
					    	          }
					    	          
					    	         
					    	         
					    		   }
					       
					       else
					       {
					    	   g2.setColor(Color.RED);
								
								g2.fill(rect22);
					    	   
					       }
						}
						
						else
						{
							g2.setColor(Color.BLUE);
							
							g2.fill(rect22);
							
						}
					}
					
					else
					{
						
						g2.setColor(orange);
						
						g2.fill(rect22);
					}
					
				}
				
				else
					
				{
					g2.setColor(Color.WHITE);
					
					g2.fill(rect22);
				}
				
				
				
				Rectangle rect23 = new Rectangle(145,105,40,40);
				
				if(data14Blue02.equals("W")==false)
				{
					if(data14Blue02.equals("O")==false)
					{
						
						if(data14Blue02.equals("B")==false)
						{
							
					       if(data14Blue02.equals("R")==false)
					    		   {
					    	          if(data14Blue02.equals("G")==false)
					    	        	  
					    	          {
					    	        	  
					    	        	  g2.setColor(yellow);
											
											g2.fill(rect23);
											
										
					    	          }
					    	          
					    	          
					    	          
					    	          else
					    	          {
					    	        	  g2.setColor(Color.GREEN);
											
											g2.fill(rect23);
											
											
					    	        	  
					    	          }
					    	          
					    	         
					    	         
					    		   }
					       
					       else
					       {
					    	   g2.setColor(Color.RED);
								
								g2.fill(rect23);
					    	   
					       }
						}
						
						else
						{
							g2.setColor(Color.BLUE);
							
							g2.fill(rect23);
							
						}
					}
					
					else
					{
						
						g2.setColor(orange);
						
						g2.fill(rect23);
					}
					
				}
				
				else
					
				{
					g2.setColor(Color.WHITE);
					
					g2.fill(rect23);
				}
				
				///------------------------------------------------//
				
				
				
				Rectangle rect24 = new Rectangle(225,65,40,40);
				
				if(data14Blue10.equals("W")==false)
				{
					if(data14Blue10.equals("O")==false)
					{
						
						if(data14Blue10.equals("B")==false)
						{
							
					       if(data14Blue10.equals("R")==false)
					    		   {
					    	          if(data14Blue10.equals("G")==false)
					    	        	  
					    	          {
					    	        	  
					    	        	  g2.setColor(yellow);
											
											g2.fill(rect24);
											
										
					    	          }
					    	          
					    	          
					    	          
					    	          else
					    	          {
					    	        	  g2.setColor(Color.GREEN);
											
											g2.fill(rect24);
											
											
					    	        	  
					    	          }
					    	          
					    	         
					    	         
					    		   }
					       
					       else
					       {
					    	   g2.setColor(Color.RED);
								
								g2.fill(rect24);
					    	   
					       }
						}
						
						else
						{
							g2.setColor(Color.BLUE);
							
							g2.fill(rect24);
							
						}
					}
					
					else
					{
						
						g2.setColor(orange);
						
						g2.fill(rect24);
					}
					
				}
				
				else
					
				{
					g2.setColor(Color.WHITE);
					
					g2.fill(rect24);
				}
				
				
				
				
			
				
				Rectangle rect25 = new Rectangle(185,65,40,40);
				
				if(data14Blue11.equals("W")==false)
				{
					if(data14Blue11.equals("O")==false)
					{
						
						if(data14Blue11.equals("B")==false)
						{
							
					       if(data14Blue11.equals("R")==false)
					    		   {
					    	          if(data14Blue11.equals("G")==false)
					    	        	  
					    	          {
					    	        	  
					    	        	  g2.setColor(yellow);
											
											g2.fill(rect25);
											
										
					    	          }
					    	          
					    	          
					    	          
					    	          else
					    	          {
					    	        	  g2.setColor(Color.GREEN);
											
											g2.fill(rect25);
											
											
					    	        	  
					    	          }
					    	          
					    	         
					    	         
					    		   }
					       
					       else
					       {
					    	   g2.setColor(Color.RED);
								
								g2.fill(rect25);
					    	   
					       }
						}
						
						else
						{
							g2.setColor(Color.BLUE);
							
							g2.fill(rect25);
							
						}
					}
					
					else
					{
						
						g2.setColor(orange);
						
						g2.fill(rect25);
					}
					
				}
				
				else
					
				{
					g2.setColor(Color.WHITE);
					
					g2.fill(rect25);
				}
				
				
				
				
				Rectangle rect26 = new Rectangle(145,65,40,40);
				
				if(data14Blue12.equals("W")==false)
				{
					if(data14Blue12.equals("O")==false)
					{
						
						if(data14Blue12.equals("B")==false)
						{
							
					       if(data14Blue12.equals("R")==false)
					    		   {
					    	          if(data14Blue12.equals("G")==false)
					    	        	  
					    	          {
					    	        	  
					    	        	  g2.setColor(yellow);
											
											g2.fill(rect26);
											
										
					    	          }
					    	          
					    	          
					    	          
					    	          else
					    	          {
					    	        	  g2.setColor(Color.GREEN);
											
											g2.fill(rect26);
											
											
					    	        	  
					    	          }
					    	          
					    	         
					    	         
					    		   }
					       
					       else
					       {
					    	   g2.setColor(Color.RED);
								
								g2.fill(rect26);
					    	   
					       }
						}
						
						else
						{
							g2.setColor(Color.BLUE);
							
							g2.fill(rect26);
							
						}
					}
					
					else
					{
						
						g2.setColor(orange);
						
						g2.fill(rect26);
					}
					
				}
				
				else
					
				{
					g2.setColor(Color.WHITE);
					
					g2.fill(rect26);
				}
				
				
				
				Rectangle rect27 = new Rectangle(225,25,40,40);
				
				if(data14Blue20.equals("W")==false)
				{
					if(data14Blue20.equals("O")==false)
					{
						
						if(data14Blue20.equals("B")==false)
						{
							
					       if(data14Blue20.equals("R")==false)
					    		   {
					    	          if(data14Blue20.equals("G")==false)
					    	        	  
					    	          {
					    	        	  
					    	        	  g2.setColor(yellow);
											
											g2.fill(rect27);
											
										
					    	          }
					    	          
					    	          
					    	          
					    	          else
					    	          {
					    	        	  g2.setColor(Color.GREEN);
											
											g2.fill(rect27);
											
											
					    	        	  
					    	          }
					    	          
					    	         
					    	         
					    		   }
					       
					       else
					       {
					    	   g2.setColor(Color.RED);
								
								g2.fill(rect27);
					    	   
					       }
						}
						
						else
						{
							g2.setColor(Color.BLUE);
							
							g2.fill(rect27);
							
						}
					}
					
					else
					{
						
						g2.setColor(orange);
						
						g2.fill(rect27);
					}
					
				}
				
				else
					
				{
					g2.setColor(Color.WHITE);
					
					g2.fill(rect27);
				}
				
				
				
				
				

				Rectangle rect28 = new Rectangle(185,25,40,40);
				
				if(data14Blue21.equals("W")==false)
				{
					if(data14Blue21.equals("O")==false)
					{
						
						if(data14Blue21.equals("B")==false)
						{
							
					       if(data14Blue21.equals("R")==false)
					    		   {
					    	          if(data14Blue21.equals("G")==false)
					    	        	  
					    	          {
					    	        	  
					    	        	  g2.setColor(yellow);
											
											g2.fill(rect28);
											
										
					    	          }
					    	          
					    	          
					    	          
					    	          else
					    	          {
					    	        	  g2.setColor(Color.GREEN);
											
											g2.fill(rect28);
											
											
					    	        	  
					    	          }
					    	          
					    	         
					    	         
					    		   }
					       
					       else
					       {
					    	   g2.setColor(Color.RED);
								
								g2.fill(rect28);
					    	   
					       }
						}
						
						else
						{
							g2.setColor(Color.BLUE);
							
							g2.fill(rect28);
							
						}
					}
					
					else
					{
						
						g2.setColor(orange);
						
						g2.fill(rect28);
					}
					
				}
				
				else
					
				{
					g2.setColor(Color.WHITE);
					
					g2.fill(rect28);
				}
				
				
				
				

				Rectangle rect29 = new Rectangle(145,25,40,40);
				
				if(data14Blue22.equals("W")==false)
				{
					if(data14Blue22.equals("O")==false)
					{
						
						if(data14Blue22.equals("B")==false)
						{
							
					       if(data14Blue22.equals("R")==false)
					    		   {
					    	          if(data14Blue22.equals("G")==false)
					    	        	  
					    	          {
					    	        	  
					    	        	  g2.setColor(yellow);
											
											g2.fill(rect29);
											
										
					    	          }
					    	          
					    	          
					    	          
					    	          else
					    	          {
					    	        	  g2.setColor(Color.GREEN);
											
											g2.fill(rect29);
											
											
					    	        	  
					    	          }
					    	          
					    	         
					    	         
					    		   }
					       
					       else
					       {
					    	   g2.setColor(Color.RED);
								
								g2.fill(rect29);
					    	   
					       }
						}
						
						else
						{
							g2.setColor(Color.BLUE);
							
							g2.fill(rect29);
							
						}
					}
					
					else
					{
						
						g2.setColor(orange);
						
						g2.fill(rect29);
					}
					
				}
				
				else
					
				{
					g2.setColor(Color.WHITE);
					
					g2.fill(rect29);
				}
				
				
				
				
				
				
				    Rectangle rectl21 = new Rectangle(145,25,120,6);
					g2.setColor(Color.BLACK);
					
					g2.fill(rectl21);
				
					Rectangle rectl22 = new Rectangle(145,65,120,4);
					g2.setColor(Color.BLACK);
					
					g2.fill(rectl22);
				
					
					Rectangle rectl23 = new Rectangle(145,105,120,4);
					g2.setColor(Color.BLACK);
			
					g2.fill(rectl23);
					
					
					Rectangle rectl24 = new Rectangle(145,25,6,240);
					g2.setColor(Color.BLACK);
					
					g2.fill(rectl24);
					
					
					Rectangle rectl25 = new Rectangle(265,25,6,240);
					g2.setColor(Color.BLACK);
					
					g2.fill(rectl25);
					
					Rectangle rectl26 = new Rectangle(185,25,4,240);
					g2.setColor(Color.BLACK);
					
					g2.fill(rectl26);
					
					
					
					Rectangle rectl28 =new Rectangle(225,25,4,240);
					g2.setColor(Color.BLACK);
					
					g2.fill(rectl28);
					
					
				
				
					
					//RED------------------------------------------------
					
					
					
					
					
					 data15 = Cube.getColorRed();
					 data15Red00= data15[0][0];
					 data15Red01= data15[0][1];
					 data15Red02= data15[0][2];
					 data15Red10= data15[1][0];
					 data15Red11= data15[1][1];
					 data15Red12= data15[1][2];
					 data15Red20= data15[2][0];
					 data15Red21= data15[2][1];
					 data15Red22= data15[2][2];
					 
					 
					 
					 
					
			//		System.out.println("the color of Red at start" + data15Red00);
					
				
					
				   
					
					
					Rectangle rect31 = new Rectangle(265,225,40,40);
					
					if(data15Red00.equals("W")==false)
					{
						if(data15Red00.equals("O")==false)
						{
							
							if(data15Red00.equals("B")==false)
							{
								
						       if(data15Red00.equals("R")==false)
						    		   {
						    	          if(data15Red00.equals("G")==false)
						    	        	  
						    	          {
						    	        	  
						    	        	  g2.setColor(yellow);
												
												g2.fill(rect31);
												
											
						    	          }
						    	          
						    	          
						    	          
						    	          else
						    	          {
						    	        	  g2.setColor(Color.GREEN);
												
												g2.fill(rect31);
												
												
						    	        	  
						    	          }
						    	          
						    	         
						    	         
						    		   }
						       
						       else
						       {
						    	   g2.setColor(Color.RED);
									
									g2.fill(rect31);
						    	   
						       }
							}
							
							else
							{
								g2.setColor(Color.BLUE);
								
								g2.fill(rect31);
								
							}
						}
						
						else
						{
							
							g2.setColor(orange);
							
							g2.fill(rect31);
						}
						
					}
					
					else
						
					{
						g2.setColor(Color.WHITE);
						
						g2.fill(rect31);
					}
					
					
					
					
					Rectangle rect32 = new Rectangle(265,185,40,40);
					
					if(data15Red01.equals("W")==false)
					{
						if(data15Red01.equals("O")==false)
						{
							
							if(data15Red01.equals("B")==false)
							{
								
						       if(data15Red01.equals("R")==false)
						    		   {
						    	          if(data15Red01.equals("G")==false)
						    	        	  
						    	          {
						    	        	  
						    	        	  g2.setColor(yellow);
												
												g2.fill(rect32);
												
											
						    	          }
						    	          
						    	          
						    	          
						    	          else
						    	          {
						    	        	  g2.setColor(Color.GREEN);
												
												g2.fill(rect32);
												
												
						    	        	  
						    	          }
						    	          
						    	         
						    	         
						    		   }
						       
						       else
						       {
						    	   g2.setColor(Color.RED);
									
									g2.fill(rect32);
						    	   
						       }
							}
							
							else
							{
								g2.setColor(Color.BLUE);
								
								g2.fill(rect32);
								
							}
						}
						
						else
						{
							
							g2.setColor(orange);
							
							g2.fill(rect32);
						}
						
					}
					
					else
						
					{
						g2.setColor(Color.WHITE);
						
						g2.fill(rect32);
					}
					
					
					
					Rectangle rect33 = new Rectangle(265,145,40,40);
					
					if(data15Red02.equals("W")==false)
					{
						if(data15Red02.equals("O")==false)
						{
							
							if(data15Red02.equals("B")==false)
							{
								
						       if(data15Red02.equals("R")==false)
						    		   {
						    	          if(data15Red02.equals("G")==false)
						    	        	  
						    	          {
						    	        	  
						    	        	  g2.setColor(yellow);
												
												g2.fill(rect33);
												
											
						    	          }
						    	          
						    	          
						    	          
						    	          else
						    	          {
						    	        	  g2.setColor(Color.GREEN);
												
												g2.fill(rect33);
												
												
						    	        	  
						    	          }
						    	          
						    	         
						    	         
						    		   }
						       
						       else
						       {
						    	   g2.setColor(Color.RED);
									
									g2.fill(rect33);
						    	   
						       }
							}
							
							else
							{
								g2.setColor(Color.BLUE);
								
								g2.fill(rect33);
								
							}
						}
						
						else
						{
							
							g2.setColor(orange);
							
							g2.fill(rect33);
						}
						
					}
					
					else
						
					{
						g2.setColor(Color.WHITE);
						
						g2.fill(rect33);
					}
					
					///------------------------------------------------//
					
					
					
					Rectangle rect34 = new Rectangle(305,225,40,40);
					
					if(data15Red10.equals("W")==false)
					{
						if(data15Red10.equals("O")==false)
						{
							
							if(data15Red10.equals("B")==false)
							{
								
						       if(data15Red10.equals("R")==false)
						    		   {
						    	          if(data15Red10.equals("G")==false)
						    	        	  
						    	          {
						    	        	  
						    	        	  g2.setColor(yellow);
												
												g2.fill(rect34);
												
											
						    	          }
						    	          
						    	          
						    	          
						    	          else
						    	          {
						    	        	  g2.setColor(Color.GREEN);
												
												g2.fill(rect34);
												
												
						    	        	  
						    	          }
						    	          
						    	         
						    	         
						    		   }
						       
						       else
						       {
						    	   g2.setColor(Color.RED);
									
									g2.fill(rect34);
						    	   
						       }
							}
							
							else
							{
								g2.setColor(Color.BLUE);
								
								g2.fill(rect34);
								
							}
						}
						
						else
						{
							
							g2.setColor(orange);
							
							g2.fill(rect34);
						}
						
					}
					
					else
						
					{
						g2.setColor(Color.WHITE);
						
						g2.fill(rect34);
					}
					
					
					
					
				
					
					Rectangle rect35 = new Rectangle(305,185,40,40);
					
					if(data15Red11.equals("W")==false)
					{
						if(data15Red11.equals("O")==false)
						{
							
							if(data15Red11.equals("B")==false)
							{
								
						       if(data15Red11.equals("R")==false)
						    		   {
						    	          if(data15Red11.equals("G")==false)
						    	        	  
						    	          {
						    	        	  
						    	        	  g2.setColor(Color.YELLOW);
												
												g2.fill(rect35);
												
											
						    	          }
						    	          
						    	          
						    	          
						    	          else
						    	          {
						    	        	  g2.setColor(Color.GREEN);
												
												g2.fill(rect35);
												
												
						    	        	  
						    	          }
						    	          
						    	         
						    	         
						    		   }
						       
						       else
						       {
						    	   g2.setColor(Color.RED);
									
									g2.fill(rect35);
						    	   
						       }
							}
							
							else
							{
								g2.setColor(Color.BLUE);
								
								g2.fill(rect35);
								
							}
						}
						
						else
						{
							
							g2.setColor(orange);
							
							g2.fill(rect35);
						}
						
					}
					
					else
						
					{
						g2.setColor(Color.WHITE);
						
						g2.fill(rect35);
					}
					
					
					
					
					Rectangle rect36 = new Rectangle(305,145,40,40);
					
					if(data15Red12.equals("W")==false)
					{
						if(data15Red12.equals("O")==false)
						{
							
							if(data15Red12.equals("B")==false)
							{
								
						       if(data15Red12.equals("R")==false)
						    		   {
						    	          if(data15Red12.equals("G")==false)
						    	        	  
						    	          {
						    	        	  
						    	        	  g2.setColor(yellow);
												
												g2.fill(rect36);
												
											
						    	          }
						    	          
						    	          
						    	          
						    	          else
						    	          {
						    	        	  g2.setColor(Color.GREEN);
												
												g2.fill(rect36);
												
												
						    	        	  
						    	          }
						    	          
						    	         
						    	         
						    		   }
						       
						       else
						       {
						    	   g2.setColor(Color.RED);
									
									g2.fill(rect36);
						    	   
						       }
							}
							
							else
							{
								g2.setColor(Color.BLUE);
								
								g2.fill(rect36);
								
							}
						}
						
						else
						{
							
							g2.setColor(orange);
							
							g2.fill(rect36);
						}
						
					}
					
					else
						
					{
						g2.setColor(Color.WHITE);
						
						g2.fill(rect36);
					}
					
					
					
					Rectangle rect37 = new Rectangle(345,225,40,40);
					
					if(data15Red20.equals("W")==false)
					{
						if(data15Red20.equals("O")==false)
						{
							
							if(data15Red20.equals("B")==false)
							{
								
						       if(data15Red20.equals("R")==false)
						    		   {
						    	          if(data15Red20.equals("G")==false)
						    	        	  
						    	          {
						    	        	  
						    	        	  g2.setColor(yellow);
												
												g2.fill(rect37);
												
											
						    	          }
						    	          
						    	          
						    	          
						    	          else
						    	          {
						    	        	  g2.setColor(Color.GREEN);
												
												g2.fill(rect37);
												
												
						    	        	  
						    	          }
						    	          
						    	         
						    	         
						    		   }
						       
						       else
						       {
						    	   g2.setColor(Color.RED);
									
									g2.fill(rect37);
						    	   
						       }
							}
							
							else
							{
								g2.setColor(Color.BLUE);
								
								g2.fill(rect37);
								
							}
						}
						
						else
						{
							
							g2.setColor(orange);
							
							g2.fill(rect37);
						}
						
					}
					
					else
						
					{
						g2.setColor(Color.WHITE);
						
						g2.fill(rect37);
					}
					
					
					
					
					

					Rectangle rect38 = new Rectangle(345,185,40,40);
					
					if(data15Red21.equals("W")==false)
					{
						if(data15Red21.equals("O")==false)
						{
							
							if(data15Red21.equals("B")==false)
							{
								
						       if(data15Red21.equals("R")==false)
						    		   {
						    	          if(data15Red21.equals("G")==false)
						    	        	  
						    	          {
						    	        	  
						    	        	  g2.setColor(yellow);
												
												g2.fill(rect38);
												
											
						    	          }
						    	          
						    	          
						    	          
						    	          else
						    	          {
						    	        	  g2.setColor(Color.GREEN);
												
												g2.fill(rect38);
												
												
						    	        	  
						    	          }
						    	          
						    	         
						    	         
						    		   }
						       
						       else
						       {
						    	   g2.setColor(Color.RED);
									
									g2.fill(rect38);
						    	   
						       }
							}
							
							else
							{
								g2.setColor(Color.BLUE);
								
								g2.fill(rect38);
								
							}
						}
						
						else
						{
							
							g2.setColor(orange);
							
							g2.fill(rect38);
						}
						
					}
					
					else
						
					{
						g2.setColor(Color.WHITE);
						
						g2.fill(rect38);
					}
					
					
					
					

					Rectangle rect39 = new Rectangle(345,145,40,40);
					
					if(data15Red22.equals("W")==false)
					{
						if(data15Red22.equals("O")==false)
						{
							
							if(data15Red22.equals("B")==false)
							{
								
						       if(data15Red22.equals("R")==false)
						    		   {
						    	          if(data15Red22.equals("G")==false)
						    	        	  
						    	          {
						    	        	  
						    	        	  g2.setColor(yellow);
												
												g2.fill(rect39);
												
											
						    	          }
						    	          
						    	          
						    	          
						    	          else
						    	          {
						    	        	  g2.setColor(Color.GREEN);
												
												g2.fill(rect39);
												
												
						    	        	  
						    	          }
						    	          
						    	         
						    	         
						    		   }
						       
						       else
						       {
						    	   g2.setColor(Color.RED);
									
									g2.fill(rect39);
						    	   
						       }
							}
							
							else
							{
								g2.setColor(Color.BLUE);
								
								g2.fill(rect39);
								
							}
						}
						
						else
						{
							
							g2.setColor(orange);
							
							g2.fill(rect39);
						}
						
					}
					
					else
						
					{
						g2.setColor(Color.WHITE);
						
						g2.fill(rect39);
					}
					
					
					
					
					
					
					    Rectangle rectl31 = new Rectangle(265,225,120,4);
						g2.setColor(Color.BLACK);
						
						g2.fill(rectl31);
					
						Rectangle rectl32 = new Rectangle(265,185,120,4);
						g2.setColor(Color.BLACK);
						
						g2.fill(rectl32);
					
						Rectangle rectl33 = new Rectangle(265,145,124,6);
						g2.setColor(Color.BLACK);
						
						g2.fill(rectl33);
						
						
						Rectangle rectl35 = new Rectangle(265,265,120,6);
						g2.setColor(Color.BLACK);
						
						g2.fill(rectl35);
						
						
						
						
						Rectangle rectl34 = new Rectangle(265,25,6,240);
						g2.setColor(Color.BLACK);
						
						g2.fill(rectl34);
						
						
						
						Rectangle rectl37 = new Rectangle(305,145,4,120);
						g2.setColor(Color.BLACK);
						
						g2.fill(rectl37);
						
						Rectangle rectl36 = new Rectangle(345,145,4,120);
						g2.setColor(Color.BLACK);
						
						g2.fill(rectl36);
						
						
						
						Rectangle rectl38 =new Rectangle(385,145,6,124);
						g2.setColor(Color.BLACK);
						
						g2.fill(rectl38);
						
						
					
						//Orange------------------------------------------------
						
						
						
						
						
						 data16 = Cube.getColorOrange();
						 data16Orange00= data16[0][0];
						 data16Orange01= data16[0][1];
						 data16Orange02= data16[0][2];
						 data16Orange10= data16[1][0];
						 data16Orange11= data16[1][1];
						 data16Orange12= data16[1][2];
						 data16Orange20= data16[2][0];
						 data16Orange21= data16[2][1];
						 data16Orange22= data16[2][2];
						 
						 
						 
						 
						
						//System.out.println("the color of Orange at start" + data16Orange00);
						
					
						
					   
						
						
						Rectangle rect41 = new Rectangle(105,145,40,40);
						
						if(data16Orange00.equals("W")==false)
						{
							if(data16Orange00.equals("O")==false)
							{
								
								if(data16Orange00.equals("B")==false)
								{
									
							       if(data16Orange00.equals("R")==false)
							    		   {
							    	          if(data16Orange00.equals("G")==false)
							    	        	  
							    	          {
							    	        	  
							    	        	  g2.setColor(yellow);
													
													g2.fill(rect41);
													
												
							    	          }
							    	          
							    	          
							    	          
							    	          else
							    	          {
							    	        	  g2.setColor(Color.GREEN);
													
													g2.fill(rect41);
													
													
							    	        	  
							    	          }
							    	          
							    	         
							    	         
							    		   }
							       
							       else
							       {
							    	   g2.setColor(Color.RED);
										
										g2.fill(rect41);
							    	   
							       }
								}
								
								else
								{
									g2.setColor(Color.BLUE);
									
									g2.fill(rect41);
									
								}
							}
							
							else
							{
								
								g2.setColor(orange);
								
								g2.fill(rect41);
							}
							
						}
						
						else
							
						{
							g2.setColor(Color.WHITE);
							
							g2.fill(rect41);
						}
						
						
						
						
						Rectangle rect42 = new Rectangle(105,185,40,40);
						
						if(data16Orange01.equals("W")==false)
						{
							if(data16Orange01.equals("O")==false)
							{
								
								if(data16Orange01.equals("B")==false)
								{
									
							       if(data16Orange01.equals("R")==false)
							    		   {
							    	          if(data16Orange01.equals("G")==false)
							    	        	  
							    	          {
							    	        	  
							    	        	  g2.setColor(yellow);
													
													g2.fill(rect42);
													
												
							    	          }
							    	          
							    	          
							    	          
							    	          else
							    	          {
							    	        	  g2.setColor(Color.GREEN);
													
													g2.fill(rect42);
													
													
							    	        	  
							    	          }
							    	          
							    	         
							    	         
							    		   }
							       
							       else
							       {
							    	   g2.setColor(Color.RED);
										
										g2.fill(rect42);
							    	   
							       }
								}
								
								else
								{
									g2.setColor(Color.BLUE);
									
									g2.fill(rect42);
									
								}
							}
							
							else
							{
								
								g2.setColor(orange);
								
								g2.fill(rect42);
							}
							
						}
						
						else
							
						{
							g2.setColor(Color.WHITE);
							
							g2.fill(rect42);
						}
						
						
						
						Rectangle rect43 = new Rectangle(105,225,40,40);
						
						if(data16Orange02.equals("W")==false)
						{
							if(data16Orange02.equals("O")==false)
							{
								
								if(data16Orange02.equals("B")==false)
								{
									
							       if(data16Orange02.equals("R")==false)
							    		   {
							    	          if(data16Orange02.equals("G")==false)
							    	        	  
							    	          {
							    	        	  
							    	        	  g2.setColor(yellow);
													
													g2.fill(rect43);
													
												
							    	          }
							    	          
							    	          
							    	          
							    	          else
							    	          {
							    	        	  g2.setColor(Color.GREEN);
													
													g2.fill(rect43);
													
													
							    	        	  
							    	          }
							    	          
							    	         
							    	         
							    		   }
							       
							       else
							       {
							    	   g2.setColor(Color.RED);
										
										g2.fill(rect43);
							    	   
							       }
								}
								
								else
								{
									g2.setColor(Color.BLUE);
									
									g2.fill(rect43);
									
								}
							}
							
							else
							{
								
								g2.setColor(orange);
								
								g2.fill(rect43);
							}
							
						}
						
						else
							
						{
							g2.setColor(Color.WHITE);
							
							g2.fill(rect43);
						}
						
						///------------------------------------------------//
						
						
						
						Rectangle rect44 = new Rectangle(65,145,40,40);
						
						if(data15Red10.equals("W")==false)
						{
							if(data15Red10.equals("O")==false)
							{
								
								if(data15Red10.equals("B")==false)
								{
									
							       if(data15Red10.equals("R")==false)
							    		   {
							    	          if(data15Red10.equals("G")==false)
							    	        	  
							    	          {
							    	        	  
							    	        	  g2.setColor(yellow);
													
													g2.fill(rect44);
													
												
							    	          }
							    	          
							    	          
							    	          
							    	          else
							    	          {
							    	        	  g2.setColor(Color.GREEN);
													
													g2.fill(rect44);
													
													
							    	        	  
							    	          }
							    	          
							    	         
							    	         
							    		   }
							       
							       else
							       {
							    	   g2.setColor(Color.RED);
										
										g2.fill(rect44);
							    	   
							       }
								}
								
								else
								{
									g2.setColor(Color.BLUE);
									
									g2.fill(rect44);
									
								}
							}
							
							else
							{
								
								g2.setColor(orange);
								
								g2.fill(rect44);
							}
							
						}
						
						else
							
						{
							g2.setColor(Color.WHITE);
							
							g2.fill(rect44);
						}
						
						
						
						
					
						
						Rectangle rect45 = new Rectangle(65,185,40,40);
						
						if(data16Orange11.equals("W")==false)
						{
							if(data16Orange11.equals("O")==false)
							{
								
								if(data16Orange11.equals("B")==false)
								{
									
							       if(data16Orange11.equals("R")==false)
							    		   {
							    	          if(data16Orange11.equals("G")==false)
							    	        	  
							    	          {
							    	        	  
							    	        	  g2.setColor(yellow);
													
													g2.fill(rect45);
													
												
							    	          }
							    	          
							    	          
							    	          
							    	          else
							    	          {
							    	        	  g2.setColor(Color.GREEN);
													
													g2.fill(rect45);
													
													
							    	        	  
							    	          }
							    	          
							    	         
							    	         
							    		   }
							       
							       else
							       {
							    	   g2.setColor(Color.RED);
										
										g2.fill(rect45);
							    	   
							       }
								}
								
								else
								{
									g2.setColor(Color.BLUE);
									
									g2.fill(rect45);
									
								}
							}
							
							else
							{
								
								g2.setColor(orange);
								
								g2.fill(rect45);
							}
							
						}
						
						else
							
						{
							g2.setColor(Color.WHITE);
							
							g2.fill(rect45);
						}
						
						
						
						
						Rectangle rect46 = new Rectangle(65,225,40,40);
						
						if(data16Orange12.equals("W")==false)
						{
							if(data16Orange12.equals("O")==false)
							{
								
								if(data16Orange12.equals("B")==false)
								{
									
							       if(data16Orange12.equals("R")==false)
							    		   {
							    	          if(data16Orange12.equals("G")==false)
							    	        	  
							    	          {
							    	        	  
							    	        	  g2.setColor(yellow);
													
													g2.fill(rect46);
													
												
							    	          }
							    	          
							    	          
							    	          
							    	          else
							    	          {
							    	        	  g2.setColor(Color.GREEN);
													
													g2.fill(rect46);
													
													
							    	        	  
							    	          }
							    	          
							    	         
							    	         
							    		   }
							       
							       else
							       {
							    	   g2.setColor(Color.RED);
										
										g2.fill(rect46);
							    	   
							       }
								}
								
								else
								{
									g2.setColor(Color.BLUE);
									
									g2.fill(rect46);
									
								}
							}
							
							else
							{
								
								g2.setColor(orange);
								
								g2.fill(rect46);
							}
							
						}
						
						else
							
						{
							g2.setColor(Color.WHITE);
							
							g2.fill(rect46);
						}
						
						
						
						Rectangle rect47 = new Rectangle(25,145,40,40);
						
						if(data16Orange20.equals("W")==false)
						{
							if(data16Orange20.equals("O")==false)
							{
								
								if(data16Orange20.equals("B")==false)
								{
									
							       if(data16Orange20.equals("R")==false)
							    		   {
							    	          if(data16Orange20.equals("G")==false)
							    	        	  
							    	          {
							    	        	  
							    	        	  g2.setColor(yellow);
													
													g2.fill(rect47);
													
												
							    	          }
							    	          
							    	          
							    	          
							    	          else
							    	          {
							    	        	  g2.setColor(Color.GREEN);
													
													g2.fill(rect47);
													
													
							    	        	  
							    	          }
							    	          
							    	         
							    	         
							    		   }
							       
							       else
							       {
							    	   g2.setColor(Color.RED);
										
										g2.fill(rect47);
							    	   
							       }
								}
								
								else
								{
									g2.setColor(Color.BLUE);
									
									g2.fill(rect47);
									
								}
							}
							
							else
							{
								
								g2.setColor(orange);
								
								g2.fill(rect47);
							}
							
						}
						
						else
							
						{
							g2.setColor(Color.WHITE);
							
							g2.fill(rect47);
						}
						
						
						
						
						

						Rectangle rect48 = new Rectangle(25,185,40,40);
						
						if(data16Orange21.equals("W")==false)
						{
							if(data16Orange21.equals("O")==false)
							{
								
								if(data16Orange21.equals("B")==false)
								{
									
							       if(data16Orange21.equals("R")==false)
							    		   {
							    	          if(data16Orange21.equals("G")==false)
							    	        	  
							    	          {
							    	        	  
							    	        	  g2.setColor(yellow);
													
													g2.fill(rect48);
													
												
							    	          }
							    	          
							    	          
							    	          
							    	          else
							    	          {
							    	        	  g2.setColor(Color.GREEN);
													
													g2.fill(rect48);
													
													
							    	        	  
							    	          }
							    	          
							    	         
							    	         
							    		   }
							       
							       else
							       {
							    	   g2.setColor(Color.RED);
										
										g2.fill(rect48);
							    	   
							       }
								}
								
								else
								{
									g2.setColor(Color.BLUE);
									
									g2.fill(rect48);
									
								}
							}
							
							else
							{
								
								g2.setColor(orange);
								
								g2.fill(rect48);
							}
							
						}
						
						else
							
						{
							g2.setColor(Color.WHITE);
							
							g2.fill(rect48);
						}
						
						
						
						

						Rectangle rect49 = new Rectangle(25,225,40,40);
						
						if(data16Orange22.equals("W")==false)
						{
							if(data16Orange22.equals("O")==false)
							{
								
								if(data16Orange22.equals("B")==false)
								{
									
							       if(data16Orange22.equals("R")==false)
							    		   {
							    	          if(data16Orange22.equals("G")==false)
							    	        	  
							    	          {
							    	        	  
							    	        	  g2.setColor(yellow);
													
													g2.fill(rect49);
													
												
							    	          }
							    	          
							    	          
							    	          
							    	          else
							    	          {
							    	        	  g2.setColor(Color.GREEN);
													
													g2.fill(rect49);
													
													
							    	        	  
							    	          }
							    	          
							    	         
							    	         
							    		   }
							       
							       else
							       {
							    	   g2.setColor(Color.RED);
										
										g2.fill(rect49);
							    	   
							       }
								}
								
								else
								{
									g2.setColor(Color.BLUE);
									
									g2.fill(rect49);
									
								}
							}
							
							else
							{
								
								g2.setColor(orange);
								
								g2.fill(rect49);
							}
							
						}
						
						else
							
						{
							g2.setColor(Color.WHITE);
							
							g2.fill(rect49);
						}
						
						
						
						
						
						
						    Rectangle rectl41 = new Rectangle(25,225,124,4);
							g2.setColor(Color.BLACK);
							
							g2.fill(rectl41);
						
							Rectangle rectl42 = new Rectangle(25,185,124,4);
							g2.setColor(Color.BLACK);
							
							g2.fill(rectl42);
						
							Rectangle rectl43 = new Rectangle(25,145,124,6);
							g2.setColor(Color.BLACK);
							
							g2.fill(rectl43);
							
							
							Rectangle rectl45 = new Rectangle(25,265,364,6);
							g2.setColor(Color.BLACK);
							
							g2.fill(rectl45);
							
							
							
							
							Rectangle rectl44 = new Rectangle(25,145,6,120);
							g2.setColor(Color.BLACK);
							
							g2.fill(rectl44);
							
							
							
							Rectangle rectl47 = new Rectangle(65,145,4,124);
							g2.setColor(Color.BLACK);
							
							g2.fill(rectl47);
							
							Rectangle rectl46 = new Rectangle(105,145,4,124);
							g2.setColor(Color.BLACK);
							
							g2.fill(rectl46);
							
							
							
							Rectangle rectl48 =new Rectangle(145,145,6,124);
							g2.setColor(Color.BLACK);
							
							g2.fill(rectl48);
						
						
					
							
							//Yellow------------------------------------------------
							
							
							
							
							
							 data17 = Cube.getColorYellow();
							 data17Yellow00= data17[0][0];
							 data17Yellow01= data17[0][1];
							 data17Yellow02= data17[0][2];
							 data17Yellow10= data17[1][0];
							 data17Yellow11= data17[1][1];
							 data17Yellow12= data17[1][2];
							 data17Yellow20= data17[2][0];
							 data17Yellow21= data17[2][1];
							 data17Yellow22= data17[2][2];
							 
							 
							 
							 
							
							//System.out.println("the color of Yellow at start" + data17Yellow00);
							
						
							
						   
							
							
							Rectangle rect51 = new Rectangle(145,385,40,40);
							
							if(data17Yellow00.equals("W")==false)
							{
								if(data17Yellow00.equals("O")==false)
								{
									
									if(data17Yellow00.equals("B")==false)
									{
										
								       if(data17Yellow00.equals("R")==false)
								    		   {
								    	          if(data17Yellow00.equals("G")==false)
								    	        	  
								    	          {
								    	        	  
								    	        	  g2.setColor(yellow);
														
														g2.fill(rect51);
														
													
								    	          }
								    	          
								    	          
								    	          
								    	          else
								    	          {
								    	        	  g2.setColor(Color.GREEN);
														
														g2.fill(rect51);
														
														
								    	        	  
								    	          }
								    	          
								    	         
								    	         
								    		   }
								       
								       else
								       {
								    	   g2.setColor(Color.RED);
											
											g2.fill(rect51);
								    	   
								       }
									}
									
									else
									{
										g2.setColor(Color.BLUE);
										
										g2.fill(rect51);
										
									}
								}
								
								else
								{
									
									g2.setColor(orange);
									
									g2.fill(rect51);
								}
								
							}
							
							else
								
							{
								g2.setColor(Color.WHITE);
								
								g2.fill(rect51);
							}
							
							
							
							
							Rectangle rect52 = new Rectangle(185,385,40,40);
							
							if(data17Yellow01.equals("W")==false)
							{
								if(data17Yellow01.equals("O")==false)
								{
									
									if(data17Yellow01.equals("B")==false)
									{
										
								       if(data17Yellow01.equals("R")==false)
								    		   {
								    	          if(data17Yellow01.equals("G")==false)
								    	        	  
								    	          {
								    	        	  
								    	        	  g2.setColor(yellow);
														
														g2.fill(rect52);
														
													
								    	          }
								    	          
								    	          
								    	          
								    	          else
								    	          {
								    	        	  g2.setColor(Color.GREEN);
														
														g2.fill(rect52);
														
														
								    	        	  
								    	          }
								    	          
								    	         
								    	         
								    		   }
								       
								       else
								       {
								    	   g2.setColor(Color.RED);
											
											g2.fill(rect52);
								    	   
								       }
									}
									
									else
									{
										g2.setColor(Color.BLUE);
										
										g2.fill(rect52);
										
									}
								}
								
								else
								{
									
									g2.setColor(orange);
									
									g2.fill(rect52);
								}
								
							}
							
							else
								
							{
								g2.setColor(Color.WHITE);
								
								g2.fill(rect52);
							}
							
							
							
							Rectangle rect53 = new Rectangle(225,385,40,40);
							
							if(data17Yellow02.equals("W")==false)
							{
								if(data17Yellow02.equals("O")==false)
								{
									
									if(data17Yellow02.equals("B")==false)
									{
										
								       if(data17Yellow02.equals("R")==false)
								    		   {
								    	          if(data17Yellow02.equals("G")==false)
								    	        	  
								    	          {
								    	        	  
								    	        	  g2.setColor(yellow);
														
														g2.fill(rect53);
														
													
								    	          }
								    	          
								    	          
								    	          
								    	          else
								    	          {
								    	        	  g2.setColor(Color.GREEN);
														
														g2.fill(rect53);
														
														
								    	        	  
								    	          }
								    	          
								    	         
								    	         
								    		   }
								       
								       else
								       {
								    	   g2.setColor(Color.RED);
											
											g2.fill(rect53);
								    	   
								       }
									}
									
									else
									{
										g2.setColor(Color.BLUE);
										
										g2.fill(rect53);
										
									}
								}
								
								else
								{
									
									g2.setColor(orange);
									
									g2.fill(rect53);
								}
								
							}
							
							else
								
							{
								g2.setColor(Color.WHITE);
								
								g2.fill(rect53);
							}
							
							///------------------------------------------------//
							
							
							
							Rectangle rect54 = new Rectangle(145,425,40,40);
							
							if(data17Yellow10.equals("W")==false)
							{
								if(data17Yellow10.equals("O")==false)
								{
									
									if(data17Yellow10.equals("B")==false)
									{
										
								       if(data17Yellow10.equals("R")==false)
								    		   {
								    	          if(data17Yellow10.equals("G")==false)
								    	        	  
								    	          {
								    	        	  
								    	        	  g2.setColor(yellow);
														
														g2.fill(rect54);
														
													
								    	          }
								    	          
								    	          
								    	          
								    	          else
								    	          {
								    	        	  g2.setColor(Color.GREEN);
														
														g2.fill(rect54);
														
														
								    	        	  
								    	          }
								    	          
								    	         
								    	         
								    		   }
								       
								       else
								       {
								    	   g2.setColor(Color.RED);
											
											g2.fill(rect54);
								    	   
								       }
									}
									
									else
									{
										g2.setColor(Color.BLUE);
										
										g2.fill(rect54);
										
									}
								}
								
								else
								{
									
									g2.setColor(orange);
									
									g2.fill(rect54);
								}
								
							}
							
							else
								
							{
								g2.setColor(Color.WHITE);
								
								g2.fill(rect54);
							}
							
							
							
							
						
							
							Rectangle rect55 = new Rectangle(185,425,40,40);
							
							if(data17Yellow11.equals("W")==false)
							{
								if(data17Yellow11.equals("O")==false)
								{
									
									if(data17Yellow11.equals("B")==false)
									{
										
								       if(data17Yellow11.equals("R")==false)
								    		   {
								    	          if(data17Yellow11.equals("G")==false)
								    	        	  
								    	          {
								    	        	  
								    	        	  g2.setColor(yellow);
														
														g2.fill(rect55);
														
													
								    	          }
								    	          
								    	          
								    	          
								    	          else
								    	          {
								    	        	  g2.setColor(Color.GREEN);
														
														g2.fill(rect55);
														
														
								    	        	  
								    	          }
								    	          
								    	         
								    	         
								    		   }
								       
								       else
								       {
								    	   g2.setColor(Color.RED);
											
											g2.fill(rect55);
								    	   
								       }
									}
									
									else
									{
										g2.setColor(Color.BLUE);
										
										g2.fill(rect55);
										
									}
								}
								
								else
								{
									
									g2.setColor(orange);
									
									g2.fill(rect55);
								}
								
							}
							
							else
								
							{
								g2.setColor(Color.WHITE);
								
								g2.fill(rect55);
							}
							
							
							
							
							Rectangle rect56 = new Rectangle(225,425,40,40);
							
							if(data17Yellow12.equals("W")==false)
							{
								if(data17Yellow12.equals("O")==false)
								{
									
									if(data17Yellow12.equals("B")==false)
									{
										
								       if(data17Yellow12.equals("R")==false)
								    		   {
								    	          if(data17Yellow12.equals("G")==false)
								    	        	  
								    	          {
								    	        	  
								    	        	  g2.setColor(yellow);
														
														g2.fill(rect56);
														
													
								    	          }
								    	          
								    	          
								    	          
								    	          else
								    	          {
								    	        	  g2.setColor(Color.GREEN);
														
														g2.fill(rect56);
														
														
								    	        	  
								    	          }
								    	          
								    	         
								    	         
								    		   }
								       
								       else
								       {
								    	   g2.setColor(Color.RED);
											
											g2.fill(rect56);
								    	   
								       }
									}
									
									else
									{
										g2.setColor(Color.BLUE);
										
										g2.fill(rect56);
										
									}
								}
								
								else
								{
									
									g2.setColor(orange);
									
									g2.fill(rect56);
								}
								
							}
							
							else
								
							{
								g2.setColor(Color.WHITE);
								
								g2.fill(rect56);
							}
							
							
							
							Rectangle rect57 = new Rectangle(145,465,40,40);
							
							if(data17Yellow20.equals("W")==false)
							{
								if(data17Yellow20.equals("O")==false)
								{
									
									if(data17Yellow20.equals("B")==false)
									{
										
								       if(data17Yellow20.equals("R")==false)
								    		   {
								    	          if(data17Yellow20.equals("G")==false)
								    	        	  
								    	          {
								    	        	  
								    	        	  g2.setColor(yellow);
														
														g2.fill(rect57);
														
													
								    	          }
								    	          
								    	          
								    	          
								    	          else
								    	          {
								    	        	  g2.setColor(Color.GREEN);
														
														g2.fill(rect57);
														
														
								    	        	  
								    	          }
								    	          
								    	         
								    	         
								    		   }
								       
								       else
								       {
								    	   g2.setColor(Color.RED);
											
											g2.fill(rect57);
								    	   
								       }
									}
									
									else
									{
										g2.setColor(Color.BLUE);
										
										g2.fill(rect57);
										
									}
								}
								
								else
								{
									
									g2.setColor(orange);
									
									g2.fill(rect57);
								}
								
							}
							
							else
								
							{
								g2.setColor(Color.WHITE);
								
								g2.fill(rect57);
							}
							
							
							
							
							

							Rectangle rect58 = new Rectangle(185,465,40,40);
							
							if(data17Yellow21.equals("W")==false)
							{
								if(data17Yellow21.equals("O")==false)
								{
									
									if(data17Yellow21.equals("B")==false)
									{
										
								       if(data17Yellow21.equals("R")==false)
								    		   {
								    	          if(data17Yellow21.equals("G")==false)
								    	        	  
								    	          {
								    	        	  
								    	        	  g2.setColor(yellow);
														
														g2.fill(rect58);
														
													
								    	          }
								    	          
								    	          
								    	          
								    	          else
								    	          {
								    	        	  g2.setColor(Color.GREEN);
														
														g2.fill(rect58);
														
														
								    	        	  
								    	          }
								    	          
								    	         
								    	         
								    		   }
								       
								       else
								       {
								    	   g2.setColor(Color.RED);
											
											g2.fill(rect58);
								    	   
								       }
									}
									
									else
									{
										g2.setColor(Color.BLUE);
										
										g2.fill(rect58);
										
									}
								}
								
								else
								{
									
									g2.setColor(orange);
									
									g2.fill(rect58);
								}
								
							}
							
							else
								
							{
								g2.setColor(Color.WHITE);
								
								g2.fill(rect58);
							}
							
							
							
							

							Rectangle rect59 = new Rectangle(225,465,40,40);
							
							if(data17Yellow22.equals("W")==false)
							{
								if(data17Yellow22.equals("O")==false)
								{
									
									if(data17Yellow22.equals("B")==false)
									{
										
								       if(data17Yellow22.equals("R")==false)
								    		   {
								    	          if(data17Yellow22.equals("G")==false)
								    	        	  
								    	          {
								    	        	  
								    	        	  g2.setColor(yellow);
														
														g2.fill(rect59);
														
													
								    	          }
								    	          
								    	          
								    	          
								    	          else
								    	          {
								    	        	  g2.setColor(Color.GREEN);
														
														g2.fill(rect59);
														
														
								    	        	  
								    	          }
								    	          
								    	         
								    	         
								    		   }
								       
								       else
								       {
								    	   g2.setColor(Color.RED);
											
											g2.fill(rect59);
								    	   
								       }
									}
									
									else
									{
										g2.setColor(Color.BLUE);
										
										g2.fill(rect59);
										
									}
								}
								
								else
								{
									
									g2.setColor(orange);
									
									g2.fill(rect59);
								}
								
							}
							
							else
								
							{
								g2.setColor(Color.WHITE);
								
								g2.fill(rect59);
							}
							
							
							
							
							
							
							    Rectangle rectl51 = new Rectangle(145,385,124,6);
								g2.setColor(Color.BLACK);
								
								g2.fill(rectl51);
							
								Rectangle rectl52 = new Rectangle(145,425,124,4);
								g2.setColor(Color.BLACK);
								
								g2.fill(rectl52);
							
								Rectangle rectl53 = new Rectangle(145,465,124,4);
								g2.setColor(Color.BLACK);
								
								g2.fill(rectl53);
								
								
								Rectangle rectl54 = new Rectangle(145,505,124,6);
								g2.setColor(Color.BLACK);
								
								g2.fill(rectl54);
								
								
								
								
								Rectangle rectl55 = new Rectangle(145,385,6,120);
								g2.setColor(Color.BLACK);
								
								g2.fill(rectl55);
								
								
								
								Rectangle rectl57 = new Rectangle(185,385,4,124);
								g2.setColor(Color.BLACK);
								
								g2.fill(rectl57);
								
								Rectangle rectl56 = new Rectangle(225,385,4,124);
								g2.setColor(Color.BLACK);
								
								g2.fill(rectl56);
								
								
								
								Rectangle rectl58 =new Rectangle(265,385,6,124);
								g2.setColor(Color.BLACK);
								
								g2.fill(rectl58);
									
							
							
							
					
					
					
					
					
	
	
	}











	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
}
