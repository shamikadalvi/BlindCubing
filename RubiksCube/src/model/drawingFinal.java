package model;

import javax.swing.JComponent;


import java.awt.*;
import java.awt.geom.Line2D;

public class drawingFinal extends JComponent 

{
	
	static String FinalWhite00;
	static String FinalWhite01;
	static String FinalWhite02;
	static String FinalWhite10;
	static String  FinalWhite11;
	static String  FinalWhite12;
	static String  FinalWhite20;
	static String  FinalWhite21;
	static String  FinalWhite22;
	
	
	
	
	
	static String FinalGreen00;
	static String FinalGreen01;
	static String FinalGreen02;
	static String FinalGreen10;
	static String FinalGreen11;
	static String FinalGreen12;
	static String  FinalGreen20;
	static String  FinalGreen21;
	static String  FinalGreen22;
	
	
	static String FinalRed00;
	static String FinalRed01;
	static String FinalRed02;
	static String FinalRed10;
	static String  FinalRed11;
	static String  FinalRed12;
	static String  FinalRed20;
	static String  FinalRed21;
	static String  FinalRed22;
	
	static String FinalBlue00;
	static String FinalBlue01;
	static String FinalBlue02;
	static String FinalBlue10;
	static String FinalBlue11;
	static String  FinalBlue12;
	static String  FinalBlue20;
	static String  FinalBlue21;
	static String  FinalBlue22;
	
	static String FinalOrange00;
	static String FinalOrange01;
	static String FinalOrange02;
	static String FinalOrange10;
	static String FinalOrange11;
	static String  FinalOrange12;
	static String  FinalOrange20;
	static String  FinalOrange21;
	static String  FinalOrange22;
	
	static String FinalYellow00;
	static String FinalYellow01;
	static String FinalYellow02;
	static String FinalYellow10;
	static String FinalYellow11;
	static String  FinalYellow12;
	static String  FinalYellow20;
	static String  FinalYellow21;
	static String  FinalYellow22;
	

	public void paint (Graphics g)
	{
		Graphics2D g2 =(Graphics2D)	g;
		Graphics2D g1 =(Graphics2D)	g;
		
		Color yellow  = new Color(245,245,0);
		Color orange = new Color(255,140,0);
		
		
		
		
	
		 
		// System.out.println("the updated white color for graphics" + FinalWhite00);
		 
		 
		
		//System.out.println("the color of white at start" + data12White00);
		
	
		
	   
		
		
		Rectangle rect1 = new Rectangle(145,145,40,40);
		
		if(FinalWhite00.equals("W")==false)
		{
			if(FinalWhite00.equals("O")==false)
			{
				
				if(FinalWhite00.equals("B")==false)
				{
					
			       if(FinalWhite00.equals("R")==false)
			    		   {
			    	          if(FinalWhite00.equals("G")==false)
			    	        	  
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
		
		if(FinalWhite01.equals("W")==false)
		{
			if(FinalWhite01.equals("O")==false)
			{
				
				if(FinalWhite01.equals("B")==false)
				{
					
			       if(FinalWhite01.equals("R")==false)
			    		   {
			    	          if(FinalWhite01.equals("G")==false)
			    	        	  
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
		
		if(FinalWhite02.equals("W")==false)
		{
			if(FinalWhite02.equals("O")==false)
			{
				
				if(FinalWhite02.equals("B")==false)
				{
					
			       if(FinalWhite02.equals("R")==false)
			    		   {
			    	          if(FinalWhite02.equals("G")==false)
			    	        	  
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
		
		if(FinalWhite10.equals("W")==false)
		{
			if(FinalWhite10.equals("O")==false)
			{
				
				if(FinalWhite10.equals("B")==false)
				{
					
			       if(FinalWhite10.equals("R")==false)
			    		   {
			    	          if(FinalWhite10.equals("G")==false)
			    	        	  
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
		
		if(FinalWhite11.equals("W")==false)
		{
			if(FinalWhite11.equals("O")==false)
			{
				
				if(FinalWhite11.equals("B")==false)
				{
					
			       if(FinalWhite11.equals("R")==false)
			    		   {
			    	          if(FinalWhite11.equals("G")==false)
			    	        	  
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
		
		if(FinalWhite12.equals("W")==false)
		{
			if(FinalWhite12.equals("O")==false)
			{
				
				if(FinalWhite12.equals("B")==false)
				{
					
			       if(FinalWhite12.equals("R")==false)
			    		   {
			    	          if(FinalWhite12.equals("G")==false)
			    	        	  
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
		
		if(FinalWhite20.equals("W")==false)
		{
			if(FinalWhite20.equals("O")==false)
			{
				
				if(FinalWhite20.equals("B")==false)
				{
					
			       if(FinalWhite20.equals("R")==false)
			    		   {
			    	          if(FinalWhite20.equals("G")==false)
			    	        	  
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
		
		if(FinalWhite21.equals("W")==false)
		{
			if(FinalWhite21.equals("O")==false)
			{
				
				if(FinalWhite21.equals("B")==false)
				{
					
			       if(FinalWhite21.equals("R")==false)
			    		   {
			    	          if(FinalWhite21.equals("G")==false)
			    	        	  
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
		
		if(FinalWhite22.equals("W")==false)
		{
			if(FinalWhite22.equals("O")==false)
			{
				
				if(FinalWhite22.equals("B")==false)
				{
					
			       if(FinalWhite22.equals("R")==false)
			    		   {
			    	          if(FinalWhite22.equals("G")==false)
			    	        	  
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
		
		    Rectangle rectl1 = new Rectangle(145,145,240,6);
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
	
		
			
			Rectangle rectl5 = new Rectangle(145,145,4,120);
			g2.setColor(Color.BLACK);
			
			g2.fill(rectl5);
			
			
			
			Rectangle rectl6 = new Rectangle(185,145,4,120);
			g2.setColor(Color.BLACK);
			
			g2.fill(rectl6);
			
			
			
			Rectangle rectl7 = new Rectangle(225,145,4,120);
			g2.setColor(Color.BLACK);
			
			g2.fill(rectl7);
			
			
			Rectangle rectl8 = new Rectangle(265,145,6,240);
			g2.setColor(Color.BLACK);
			
			g2.fill(rectl8);
			
			
			//GREEN 
			 
			 
			
		//	System.out.println("the color of green at start" + data13Green00);
			
		
			
		   
			
			
			Rectangle rect11 = new Rectangle(145,265,40,40);
			
			if(FinalGreen00.equals("W")==false)
			{
				if(FinalGreen00.equals("O")==false)
				{
					
					if(FinalGreen00.equals("B")==false)
					{
						
				       if(FinalGreen00.equals("R")==false)
				    		   {
				    	          if(FinalGreen00.equals("G")==false)
				    	        	  
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
			
			if(FinalGreen01.equals("W")==false)
			{
				if(FinalGreen01.equals("O")==false)
				{
					
					if(FinalGreen01.equals("B")==false)
					{
						
				       if(FinalGreen01.equals("R")==false)
				    		   {
				    	          if(FinalGreen01.equals("G")==false)
				    	        	  
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
			
			if(FinalGreen02.equals("W")==false)
			{
				if(FinalGreen02.equals("O")==false)
				{
					
					if(FinalGreen02.equals("B")==false)
					{
						
				       if(FinalGreen02.equals("R")==false)
				    		   {
				    	          if(FinalGreen02.equals("G")==false)
				    	        	  
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
			
			if(FinalGreen10.equals("W")==false)
			{
				if(FinalGreen10.equals("O")==false)
				{
					
					if(FinalGreen10.equals("B")==false)
					{
						
				       if(FinalGreen10.equals("R")==false)
				    		   {
				    	          if(FinalGreen10.equals("G")==false)
				    	        	  
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
			
			if(FinalGreen11.equals("W")==false)
			{
				if(FinalGreen11.equals("O")==false)
				{
					
					if(FinalGreen11.equals("B")==false)
					{
						
				       if(FinalGreen11.equals("R")==false)
				    		   {
				    	          if(FinalGreen11.equals("G")==false)
				    	        	  
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
			
			if(FinalGreen12.equals("W")==false)
			{
				if(FinalGreen12.equals("O")==false)
				{
					
					if(FinalGreen12.equals("B")==false)
					{
						
				       if(FinalGreen12.equals("R")==false)
				    		   {
				    	          if(FinalGreen12.equals("G")==false)
				    	        	  
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
			
			if(FinalGreen20.equals("W")==false)
			{
				if(FinalGreen20.equals("O")==false)
				{
					
					if(FinalGreen20.equals("B")==false)
					{
						
				       if(FinalGreen20.equals("R")==false)
				    		   {
				    	          if(FinalGreen20.equals("G")==false)
				    	        	  
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
			
			if(FinalGreen21.equals("W")==false)
			{
				if(FinalGreen21.equals("O")==false)
				{
					
					if(FinalGreen21.equals("B")==false)
					{
						
				       if(FinalGreen21.equals("R")==false)
				    		   {
				    	          if(FinalGreen21.equals("G")==false)
				    	        	  
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
			
			if(FinalGreen22.equals("W")==false)
			{
				if(FinalGreen22.equals("O")==false)
				{
					
					if(FinalGreen22.equals("B")==false)
					{
						
				       if(FinalGreen22.equals("R")==false)
				    		   {
				    	          if(FinalGreen22.equals("G")==false)
				    	        	  
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
				
				
				
				
				 
				 
				 
				 
				
			//	System.out.println("the color of Blue at start" + data14Blue00);
				
			
				
			   
				
				
				Rectangle rect21 = new Rectangle(225,105,40,40);
				
				if(FinalBlue00.equals("W")==false)
				{
					if(FinalBlue00.equals("O")==false)
					{
						
						if(FinalBlue00.equals("B")==false)
						{
							
					       if(FinalBlue00.equals("R")==false)
					    		   {
					    	          if(FinalBlue00.equals("G")==false)
					    	        	  
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
				
				if(FinalBlue01.equals("W")==false)
				{
					if(FinalBlue01.equals("O")==false)
					{
						
						if(FinalBlue01.equals("B")==false)
						{
							
					       if(FinalBlue01.equals("R")==false)
					    		   {
					    	          if(FinalBlue01.equals("G")==false)
					    	        	  
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
				
				if(FinalBlue02.equals("W")==false)
				{
					if(FinalBlue02.equals("O")==false)
					{
						
						if(FinalBlue02.equals("B")==false)
						{
							
					       if(FinalBlue02.equals("R")==false)
					    		   {
					    	          if(FinalBlue02.equals("G")==false)
					    	        	  
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
				
				if(FinalBlue10.equals("W")==false)
				{
					if(FinalBlue10.equals("O")==false)
					{
						
						if(FinalBlue10.equals("B")==false)
						{
							
					       if(FinalBlue10.equals("R")==false)
					    		   {
					    	          if(FinalBlue10.equals("G")==false)
					    	        	  
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
				
				if(FinalBlue11.equals("W")==false)
				{
					if(FinalBlue11.equals("O")==false)
					{
						
						if(FinalBlue11.equals("B")==false)
						{
							
					       if(FinalBlue11.equals("R")==false)
					    		   {
					    	          if(FinalBlue11.equals("G")==false)
					    	        	  
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
				
				if(FinalBlue12.equals("W")==false)
				{
					if(FinalBlue12.equals("O")==false)
					{
						
						if(FinalBlue12.equals("B")==false)
						{
							
					       if(FinalBlue12.equals("R")==false)
					    		   {
					    	          if(FinalBlue12.equals("G")==false)
					    	        	  
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
				
				if(FinalBlue20.equals("W")==false)
				{
					if(FinalBlue20.equals("O")==false)
					{
						
						if(FinalBlue20.equals("B")==false)
						{
							
					       if(FinalBlue20.equals("R")==false)
					    		   {
					    	          if(FinalBlue20.equals("G")==false)
					    	        	  
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
				
				if(	FinalBlue21.equals("W")==false)
				{
					if(FinalBlue21.equals("O")==false)
					{
						
						if(FinalBlue21.equals("B")==false)
						{
							
					       if(FinalBlue21.equals("R")==false)
					    		   {
					    	          if(FinalBlue21.equals("G")==false)
					    	        	  
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
				
				if(FinalBlue22.equals("W")==false)
				{
					if(FinalBlue22.equals("O")==false)
					{
						
						if(FinalBlue22.equals("B")==false)
						{
							
					       if(FinalBlue22.equals("R")==false)
					    		   {
					    	          if(FinalBlue22.equals("G")==false)
					    	        	  
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
					
					
				
					 
					 
					 
					
			//		System.out.println("the color of Red at start" + data15Red00);
					
				
					
				   
					
					
					Rectangle rect31 = new Rectangle(265,225,40,40);
					
					if(FinalRed00.equals("W")==false)
					{
						if(FinalRed00.equals("O")==false)
						{
							
							if(FinalRed00.equals("B")==false)
							{
								
						       if(FinalRed00.equals("R")==false)
						    		   {
						    	          if(FinalRed00.equals("G")==false)
						    	        	  
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
					
					if(FinalRed01.equals("W")==false)
					{
						if(FinalRed01.equals("O")==false)
						{
							
							if(FinalRed01.equals("B")==false)
							{
								
						       if(FinalRed01.equals("R")==false)
						    		   {
						    	          if(FinalRed01.equals("G")==false)
						    	        	  
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
					
					if(FinalRed02.equals("W")==false)
					{
						if(FinalRed02.equals("O")==false)
						{
							
							if(FinalRed02.equals("B")==false)
							{
								
						       if(FinalRed02.equals("R")==false)
						    		   {
						    	          if(FinalRed02.equals("G")==false)
						    	        	  
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
					
					if(FinalRed10.equals("W")==false)
					{
						if(FinalRed10.equals("O")==false)
						{
							
							if(FinalRed10.equals("B")==false)
							{
								
						       if(FinalRed10.equals("R")==false)
						    		   {
						    	          if(FinalRed10.equals("G")==false)
						    	        	  
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
					
					if(FinalRed11.equals("W")==false)
					{
						if(FinalRed11.equals("O")==false)
						{
							
							if(FinalRed11.equals("B")==false)
							{
								
						       if(FinalRed11.equals("R")==false)
						    		   {
						    	          if(FinalRed11.equals("G")==false)
						    	        	  
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
					
					if(FinalRed12.equals("W")==false)
					{
						if(FinalRed12.equals("O")==false)
						{
							
							if(FinalRed12.equals("B")==false)
							{
								
						       if(FinalRed12.equals("R")==false)
						    		   {
						    	          if(FinalRed12.equals("G")==false)
						    	        	  
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
					
					if(	FinalRed20.equals("W")==false)
					{
						if(FinalRed20.equals("O")==false)
						{
							
							if(FinalRed20.equals("B")==false)
							{
								
						       if(FinalRed20.equals("R")==false)
						    		   {
						    	          if(FinalRed20.equals("G")==false)
						    	        	  
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
					
					if(FinalRed21.equals("W")==false)
					{
						if(FinalRed21.equals("O")==false)
						{
							
							if(FinalRed21.equals("B")==false)
							{
								
						       if(FinalRed21.equals("R")==false)
						    		   {
						    	          if(FinalRed21.equals("G")==false)
						    	        	  
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
					
					if(FinalRed22.equals("W")==false)
					{
						if(FinalRed22.equals("O")==false)
						{
							
							if(FinalRed22.equals("B")==false)
							{
								
						       if(FinalRed22.equals("R")==false)
						    		   {
						    	          if(FinalRed22.equals("G")==false)
						    	        	  
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
						
						
						
						
						
						 
						 
						 
						 
						
						//System.out.println("the color of Orange at start" + data16Orange00);
						
					
						
					   
						
						
						Rectangle rect41 = new Rectangle(105,145,40,40);
						
						if(FinalOrange00.equals("W")==false)
						{
							if(FinalOrange00.equals("O")==false)
							{
								
								if(FinalOrange00.equals("B")==false)
								{
									
							       if(FinalOrange00.equals("R")==false)
							    		   {
							    	          if(FinalOrange00.equals("G")==false)
							    	        	  
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
						
						if(FinalOrange01.equals("W")==false)
						{
							if(FinalOrange01.equals("O")==false)
							{
								
								if(FinalOrange01.equals("B")==false)
								{
									
							       if(FinalOrange01.equals("R")==false)
							    		   {
							    	          if(FinalOrange01.equals("G")==false)
							    	        	  
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
						
						if(FinalOrange02.equals("W")==false)
						{
							if(FinalOrange02.equals("O")==false)
							{
								
								if(FinalOrange02.equals("B")==false)
								{
									
							       if(FinalOrange02.equals("R")==false)
							    		   {
							    	          if(FinalOrange02.equals("G")==false)
							    	        	  
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
						
						if(FinalOrange10.equals("W")==false)
						{
							if(FinalOrange10.equals("O")==false)
							{
								
								if(FinalOrange10.equals("B")==false)
								{
									
							       if(FinalOrange10.equals("R")==false)
							    		   {
							    	          if(FinalOrange10.equals("G")==false)
							    	        	  
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
						
						if(FinalOrange11.equals("W")==false)
						{
							if(FinalOrange11.equals("O")==false)
							{
								
								if(FinalOrange11.equals("B")==false)
								{
									
							       if(FinalOrange11.equals("R")==false)
							    		   {
							    	          if(FinalOrange11.equals("G")==false)
							    	        	  
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
						
						if(FinalOrange12.equals("W")==false)
						{
							if(FinalOrange12.equals("O")==false)
							{
								
								if(FinalOrange12.equals("B")==false)
								{
									
							       if(FinalOrange12.equals("R")==false)
							    		   {
							    	          if(FinalOrange12.equals("G")==false)
							    	        	  
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
						
						if(FinalOrange20.equals("W")==false)
						{
							if(FinalOrange20.equals("O")==false)
							{
								
								if(FinalOrange20.equals("B")==false)
								{
									
							       if(FinalOrange20.equals("R")==false)
							    		   {
							    	          if(FinalOrange20.equals("G")==false)
							    	        	  
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
						
						if(FinalOrange21.equals("W")==false)
						{
							if(FinalOrange21.equals("O")==false)
							{
								
								if(FinalOrange21.equals("B")==false)
								{
									
							       if(FinalOrange21.equals("R")==false)
							    		   {
							    	          if(FinalOrange21.equals("G")==false)
							    	        	  
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
						
						if(FinalOrange22.equals("W")==false)
						{
							if(FinalOrange22.equals("O")==false)
							{
								
								if(FinalOrange22.equals("B")==false)
								{
									
							       if(FinalOrange22.equals("R")==false)
							    		   {
							    	          if(FinalOrange22.equals("G")==false)
							    	        	  
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
							
							
						
							 
							 
							 
							
							//System.out.println("the color of Yellow at start" + data17Yellow00);
							
						
							
						   
							
							
							Rectangle rect51 = new Rectangle(145,385,40,40);
							
							if(FinalYellow00.equals("W")==false)
							{
								if(FinalYellow00.equals("O")==false)
								{
									
									if(FinalYellow00.equals("B")==false)
									{
										
								       if(FinalYellow00.equals("R")==false)
								    		   {
								    	          if(FinalYellow00.equals("G")==false)
								    	        	  
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
							
							if(FinalYellow01.equals("W")==false)
							{
								if(FinalYellow01.equals("O")==false)
								{
									
									if(FinalYellow01.equals("B")==false)
									{
										
								       if(FinalYellow01.equals("R")==false)
								    		   {
								    	          if(FinalYellow01.equals("G")==false)
								    	        	  
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
							
							if(FinalYellow02.equals("W")==false)
							{
								if(FinalYellow02.equals("O")==false)
								{
									
									if(FinalYellow02.equals("B")==false)
									{
										
								       if(FinalYellow02.equals("R")==false)
								    		   {
								    	          if(FinalYellow02.equals("G")==false)
								    	        	  
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
							
							if(FinalYellow10.equals("W")==false)
							{
								if(FinalYellow10.equals("O")==false)
								{
									
									if(FinalYellow10.equals("B")==false)
									{
										
								       if(FinalYellow10.equals("R")==false)
								    		   {
								    	          if(FinalYellow10.equals("G")==false)
								    	        	  
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
							
							if(FinalYellow11.equals("W")==false)
							{
								if(FinalYellow11.equals("O")==false)
								{
									
									if(FinalYellow11.equals("B")==false)
									{
										
								       if(FinalYellow11.equals("R")==false)
								    		   {
								    	          if(FinalYellow11.equals("G")==false)
								    	        	  
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
							
							if(FinalYellow12.equals("W")==false)
							{
								if(FinalYellow12.equals("O")==false)
								{
									
									if(FinalYellow12.equals("B")==false)
									{
										
								       if(FinalYellow12.equals("R")==false)
								    		   {
								    	          if(FinalYellow12.equals("G")==false)
								    	        	  
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
							
							if(FinalYellow20.equals("W")==false)
							{
								if(FinalYellow20.equals("O")==false)
								{
									
									if(FinalYellow20.equals("B")==false)
									{
										
								       if(FinalYellow20.equals("R")==false)
								    		   {
								    	          if(FinalYellow20.equals("G")==false)
								    	        	  
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
							
							if(FinalYellow21.equals("W")==false)
							{
								if(FinalYellow21.equals("O")==false)
								{
									
									if(FinalYellow21.equals("B")==false)
									{
										
								       if(FinalYellow21.equals("R")==false)
								    		   {
								    	          if(FinalYellow21.equals("G")==false)
								    	        	  
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
							
							if(FinalYellow22.equals("W")==false)
							{
								if(FinalYellow22.equals("O")==false)
								{
									
									if(FinalYellow22.equals("B")==false)
									{
										
								       if(FinalYellow22.equals("R")==false)
								    		   {
								    	          if(FinalYellow22.equals("G")==false)
								    	        	  
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
	
	
}
