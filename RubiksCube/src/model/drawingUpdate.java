package model;

import javax.swing.JComponent;


import java.awt.*;
import java.awt.geom.Line2D;

public class drawingUpdate extends JComponent


{

	
	static String UpdateWhite00;
	static String UpdateWhite01;
	static String UpdateWhite02;
	static String UpdateWhite10;
	static String  UpdateWhite11;
	static String  UpdateWhite12;
	static String  UpdateWhite20;
	static String  UpdateWhite21;
	static String  UpdateWhite22;
	
	
	
	
	
	static String UpdateGreen00;
	static String UpdateGreen01;
	static String UpdateGreen02;
	static String UpdateGreen10;
	static String UpdateGreen11;
	static String UpdateGreen12;
	static String  UpdateGreen20;
	static String  UpdateGreen21;
	static String  UpdateGreen22;
	
	
	static String UpdateRed00;
	static String UpdateRed01;
	static String UpdateRed02;
	static String UpdateRed10;
	static String  UpdateRed11;
	static String  UpdateRed12;
	static String  UpdateRed20;
	static String  UpdateRed21;
	static String  UpdateRed22;
	
	static String UpdateBlue00;
	static String UpdateBlue01;
	static String UpdateBlue02;
	static String UpdateBlue10;
	static String UpdateBlue11;
	static String  UpdateBlue12;
	static String  UpdateBlue20;
	static String  UpdateBlue21;
	static String  UpdateBlue22;
	
	static String UpdateOrange00;
	static String UpdateOrange01;
	static String UpdateOrange02;
	static String UpdateOrange10;
	static String UpdateOrange11;
	static String  UpdateOrange12;
	static String  UpdateOrange20;
	static String  UpdateOrange21;
	static String  UpdateOrange22;
	
	static String UpdateYellow00;
	static String UpdateYellow01;
	static String UpdateYellow02;
	static String UpdateYellow10;
	static String UpdateYellow11;
	static String  UpdateYellow12;
	static String  UpdateYellow20;
	static String  UpdateYellow21;
	static String  UpdateYellow22;
	

	public void paint (Graphics g)
	{
		Graphics2D g2 =(Graphics2D)	g;
		Graphics2D g1 =(Graphics2D)	g;
		
		Color yellow  = new Color(245,245,0);
		Color orange = new Color(255,140,0);
		
		
		
		
	
		 
		// System.out.println("the updated white color for graphics" + UpdateWhite00);
		 
		 
		
		//System.out.println("the color of white at start" + data12White00);
		
	
	
	   
		
		
		Rectangle rect1 = new Rectangle(145,145,40,40);
		
		if(UpdateWhite00.equals("W")==false)
		{
			if(UpdateWhite00.equals("O")==false)
			{
				
				if(UpdateWhite00.equals("B")==false)
				{
					
			       if(UpdateWhite00.equals("R")==false)
			    		   {
			    	          if(UpdateWhite00.equals("G")==false)
			    	        	  
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
		
		if(UpdateWhite01.equals("W")==false)
		{
			if(UpdateWhite01.equals("O")==false)
			{
				
				if(UpdateWhite01.equals("B")==false)
				{
					
			       if(UpdateWhite01.equals("R")==false)
			    		   {
			    	          if(UpdateWhite01.equals("G")==false)
			    	        	  
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
		
		if(UpdateWhite02.equals("W")==false)
		{
			if(UpdateWhite02.equals("O")==false)
			{
				
				if(UpdateWhite02.equals("B")==false)
				{
					
			       if(UpdateWhite02.equals("R")==false)
			    		   {
			    	          if(UpdateWhite02.equals("G")==false)
			    	        	  
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
		
		if(UpdateWhite10.equals("W")==false)
		{
			if(UpdateWhite10.equals("O")==false)
			{
				
				if(UpdateWhite10.equals("B")==false)
				{
					
			       if(UpdateWhite10.equals("R")==false)
			    		   {
			    	          if(UpdateWhite10.equals("G")==false)
			    	        	  
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
		
		if(UpdateWhite11.equals("W")==false)
		{
			if(UpdateWhite11.equals("O")==false)
			{
				
				if(UpdateWhite11.equals("B")==false)
				{
					
			       if(UpdateWhite11.equals("R")==false)
			    		   {
			    	          if(UpdateWhite11.equals("G")==false)
			    	        	  
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
		
		if(UpdateWhite12.equals("W")==false)
		{
			if(UpdateWhite12.equals("O")==false)
			{
				
				if(UpdateWhite12.equals("B")==false)
				{
					
			       if(UpdateWhite12.equals("R")==false)
			    		   {
			    	          if(UpdateWhite12.equals("G")==false)
			    	        	  
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
		
		if(UpdateWhite20.equals("W")==false)
		{
			if(UpdateWhite20.equals("O")==false)
			{
				
				if(UpdateWhite20.equals("B")==false)
				{
					
			       if(UpdateWhite20.equals("R")==false)
			    		   {
			    	          if(UpdateWhite20.equals("G")==false)
			    	        	  
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
		
		if(UpdateWhite21.equals("W")==false)
		{
			if(UpdateWhite21.equals("O")==false)
			{
				
				if(UpdateWhite21.equals("B")==false)
				{
					
			       if(UpdateWhite21.equals("R")==false)
			    		   {
			    	          if(UpdateWhite21.equals("G")==false)
			    	        	  
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
		
		if(UpdateWhite22.equals("W")==false)
		{
			if(UpdateWhite22.equals("O")==false)
			{
				
				if(UpdateWhite22.equals("B")==false)
				{
					
			       if(UpdateWhite22.equals("R")==false)
			    		   {
			    	          if(UpdateWhite22.equals("G")==false)
			    	        	  
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
			
			if(UpdateGreen00.equals("W")==false)
			{
				if(UpdateGreen00.equals("O")==false)
				{
					
					if(UpdateGreen00.equals("B")==false)
					{
						
				       if(UpdateGreen00.equals("R")==false)
				    		   {
				    	          if(UpdateGreen00.equals("G")==false)
				    	        	  
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
			
			if(UpdateGreen01.equals("W")==false)
			{
				if(UpdateGreen01.equals("O")==false)
				{
					
					if(UpdateGreen01.equals("B")==false)
					{
						
				       if(UpdateGreen01.equals("R")==false)
				    		   {
				    	          if(UpdateGreen01.equals("G")==false)
				    	        	  
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
			
			if(UpdateGreen02.equals("W")==false)
			{
				if(UpdateGreen02.equals("O")==false)
				{
					
					if(UpdateGreen02.equals("B")==false)
					{
						
				       if(UpdateGreen02.equals("R")==false)
				    		   {
				    	          if(UpdateGreen02.equals("G")==false)
				    	        	  
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
			
			if(UpdateGreen10.equals("W")==false)
			{
				if(UpdateGreen10.equals("O")==false)
				{
					
					if(UpdateGreen10.equals("B")==false)
					{
						
				       if(UpdateGreen10.equals("R")==false)
				    		   {
				    	          if(UpdateGreen10.equals("G")==false)
				    	        	  
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
			
			if(UpdateGreen11.equals("W")==false)
			{
				if(UpdateGreen11.equals("O")==false)
				{
					
					if(UpdateGreen11.equals("B")==false)
					{
						
				       if(UpdateGreen11.equals("R")==false)
				    		   {
				    	          if(UpdateGreen11.equals("G")==false)
				    	        	  
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
			
			if(UpdateGreen12.equals("W")==false)
			{
				if(UpdateGreen12.equals("O")==false)
				{
					
					if(UpdateGreen12.equals("B")==false)
					{
						
				       if(UpdateGreen12.equals("R")==false)
				    		   {
				    	          if(UpdateGreen12.equals("G")==false)
				    	        	  
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
			
			if(UpdateGreen20.equals("W")==false)
			{
				if(UpdateGreen20.equals("O")==false)
				{
					
					if(UpdateGreen20.equals("B")==false)
					{
						
				       if(UpdateGreen20.equals("R")==false)
				    		   {
				    	          if(UpdateGreen20.equals("G")==false)
				    	        	  
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
			
			if(UpdateGreen21.equals("W")==false)
			{
				if(UpdateGreen21.equals("O")==false)
				{
					
					if(UpdateGreen21.equals("B")==false)
					{
						
				       if(UpdateGreen21.equals("R")==false)
				    		   {
				    	          if(UpdateGreen21.equals("G")==false)
				    	        	  
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
			
			if(UpdateGreen22.equals("W")==false)
			{
				if(UpdateGreen22.equals("O")==false)
				{
					
					if(UpdateGreen22.equals("B")==false)
					{
						
				       if(UpdateGreen22.equals("R")==false)
				    		   {
				    	          if(UpdateGreen22.equals("G")==false)
				    	        	  
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
				
				if(UpdateBlue00.equals("W")==false)
				{
					if(UpdateBlue00.equals("O")==false)
					{
						
						if(UpdateBlue00.equals("B")==false)
						{
							
					       if(UpdateBlue00.equals("R")==false)
					    		   {
					    	          if(UpdateBlue00.equals("G")==false)
					    	        	  
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
				
				if(UpdateBlue01.equals("W")==false)
				{
					if(UpdateBlue01.equals("O")==false)
					{
						
						if(UpdateBlue01.equals("B")==false)
						{
							
					       if(UpdateBlue01.equals("R")==false)
					    		   {
					    	          if(UpdateBlue01.equals("G")==false)
					    	        	  
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
				
				if(UpdateBlue02.equals("W")==false)
				{
					if(UpdateBlue02.equals("O")==false)
					{
						
						if(UpdateBlue02.equals("B")==false)
						{
							
					       if(UpdateBlue02.equals("R")==false)
					    		   {
					    	          if(UpdateBlue02.equals("G")==false)
					    	        	  
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
				
				if(UpdateBlue10.equals("W")==false)
				{
					if(UpdateBlue10.equals("O")==false)
					{
						
						if(UpdateBlue10.equals("B")==false)
						{
							
					       if(UpdateBlue10.equals("R")==false)
					    		   {
					    	          if(UpdateBlue10.equals("G")==false)
					    	        	  
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
				
				if(UpdateBlue11.equals("W")==false)
				{
					if(UpdateBlue11.equals("O")==false)
					{
						
						if(UpdateBlue11.equals("B")==false)
						{
							
					       if(UpdateBlue11.equals("R")==false)
					    		   {
					    	          if(UpdateBlue11.equals("G")==false)
					    	        	  
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
				
				if(UpdateBlue12.equals("W")==false)
				{
					if(UpdateBlue12.equals("O")==false)
					{
						
						if(UpdateBlue12.equals("B")==false)
						{
							
					       if(UpdateBlue12.equals("R")==false)
					    		   {
					    	          if(UpdateBlue12.equals("G")==false)
					    	        	  
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
				
				if(UpdateBlue20.equals("W")==false)
				{
					if(UpdateBlue20.equals("O")==false)
					{
						
						if(UpdateBlue20.equals("B")==false)
						{
							
					       if(UpdateBlue20.equals("R")==false)
					    		   {
					    	          if(UpdateBlue20.equals("G")==false)
					    	        	  
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
				
				if(	UpdateBlue21.equals("W")==false)
				{
					if(UpdateBlue21.equals("O")==false)
					{
						
						if(UpdateBlue21.equals("B")==false)
						{
							
					       if(UpdateBlue21.equals("R")==false)
					    		   {
					    	          if(UpdateBlue21.equals("G")==false)
					    	        	  
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
				
				if(UpdateBlue22.equals("W")==false)
				{
					if(UpdateBlue22.equals("O")==false)
					{
						
						if(UpdateBlue22.equals("B")==false)
						{
							
					       if(UpdateBlue22.equals("R")==false)
					    		   {
					    	          if(UpdateBlue22.equals("G")==false)
					    	        	  
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
					
					if(UpdateRed00.equals("W")==false)
					{
						if(UpdateRed00.equals("O")==false)
						{
							
							if(UpdateRed00.equals("B")==false)
							{
								
						       if(UpdateRed00.equals("R")==false)
						    		   {
						    	          if(UpdateRed00.equals("G")==false)
						    	        	  
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
					
					if(UpdateRed01.equals("W")==false)
					{
						if(UpdateRed01.equals("O")==false)
						{
							
							if(UpdateRed01.equals("B")==false)
							{
								
						       if(UpdateRed01.equals("R")==false)
						    		   {
						    	          if(UpdateRed01.equals("G")==false)
						    	        	  
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
					
					if(UpdateRed02.equals("W")==false)
					{
						if(UpdateRed02.equals("O")==false)
						{
							
							if(UpdateRed02.equals("B")==false)
							{
								
						       if(UpdateRed02.equals("R")==false)
						    		   {
						    	          if(UpdateRed02.equals("G")==false)
						    	        	  
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
					
					if(UpdateRed10.equals("W")==false)
					{
						if(UpdateRed10.equals("O")==false)
						{
							
							if(UpdateRed10.equals("B")==false)
							{
								
						       if(UpdateRed10.equals("R")==false)
						    		   {
						    	          if(UpdateRed10.equals("G")==false)
						    	        	  
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
					
					if(UpdateRed11.equals("W")==false)
					{
						if(UpdateRed11.equals("O")==false)
						{
							
							if(UpdateRed11.equals("B")==false)
							{
								
						       if(UpdateRed11.equals("R")==false)
						    		   {
						    	          if(UpdateRed11.equals("G")==false)
						    	        	  
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
					
					if(UpdateRed12.equals("W")==false)
					{
						if(UpdateRed12.equals("O")==false)
						{
							
							if(UpdateRed12.equals("B")==false)
							{
								
						       if(UpdateRed12.equals("R")==false)
						    		   {
						    	          if(UpdateRed12.equals("G")==false)
						    	        	  
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
					
					if(	UpdateRed20.equals("W")==false)
					{
						if(UpdateRed20.equals("O")==false)
						{
							
							if(UpdateRed20.equals("B")==false)
							{
								
						       if(UpdateRed20.equals("R")==false)
						    		   {
						    	          if(UpdateRed20.equals("G")==false)
						    	        	  
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
					
					if(UpdateRed21.equals("W")==false)
					{
						if(UpdateRed21.equals("O")==false)
						{
							
							if(UpdateRed21.equals("B")==false)
							{
								
						       if(UpdateRed21.equals("R")==false)
						    		   {
						    	          if(UpdateRed21.equals("G")==false)
						    	        	  
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
					
					if(UpdateRed22.equals("W")==false)
					{
						if(UpdateRed22.equals("O")==false)
						{
							
							if(UpdateRed22.equals("B")==false)
							{
								
						       if(UpdateRed22.equals("R")==false)
						    		   {
						    	          if(UpdateRed22.equals("G")==false)
						    	        	  
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
						
						if(UpdateOrange00.equals("W")==false)
						{
							if(UpdateOrange00.equals("O")==false)
							{
								
								if(UpdateOrange00.equals("B")==false)
								{
									
							       if(UpdateOrange00.equals("R")==false)
							    		   {
							    	          if(UpdateOrange00.equals("G")==false)
							    	        	  
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
						
						if(UpdateOrange01.equals("W")==false)
						{
							if(UpdateOrange01.equals("O")==false)
							{
								
								if(UpdateOrange01.equals("B")==false)
								{
									
							       if(UpdateOrange01.equals("R")==false)
							    		   {
							    	          if(UpdateOrange01.equals("G")==false)
							    	        	  
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
						
						if(UpdateOrange02.equals("W")==false)
						{
							if(UpdateOrange02.equals("O")==false)
							{
								
								if(UpdateOrange02.equals("B")==false)
								{
									
							       if(UpdateOrange02.equals("R")==false)
							    		   {
							    	          if(UpdateOrange02.equals("G")==false)
							    	        	  
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
						
						if(UpdateOrange10.equals("W")==false)
						{
							if(UpdateOrange10.equals("O")==false)
							{
								
								if(UpdateOrange10.equals("B")==false)
								{
									
							       if(UpdateOrange10.equals("R")==false)
							    		   {
							    	          if(UpdateOrange10.equals("G")==false)
							    	        	  
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
						
						if(UpdateOrange11.equals("W")==false)
						{
							if(UpdateOrange11.equals("O")==false)
							{
								
								if(UpdateOrange11.equals("B")==false)
								{
									
							       if(UpdateOrange11.equals("R")==false)
							    		   {
							    	          if(UpdateOrange11.equals("G")==false)
							    	        	  
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
						
						if(UpdateOrange12.equals("W")==false)
						{
							if(UpdateOrange12.equals("O")==false)
							{
								
								if(UpdateOrange12.equals("B")==false)
								{
									
							       if(UpdateOrange12.equals("R")==false)
							    		   {
							    	          if(UpdateOrange12.equals("G")==false)
							    	        	  
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
						
						if(UpdateOrange20.equals("W")==false)
						{
							if(UpdateOrange20.equals("O")==false)
							{
								
								if(UpdateOrange20.equals("B")==false)
								{
									
							       if(UpdateOrange20.equals("R")==false)
							    		   {
							    	          if(UpdateOrange20.equals("G")==false)
							    	        	  
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
						
						if(UpdateOrange21.equals("W")==false)
						{
							if(UpdateOrange21.equals("O")==false)
							{
								
								if(UpdateOrange21.equals("B")==false)
								{
									
							       if(UpdateOrange21.equals("R")==false)
							    		   {
							    	          if(UpdateOrange21.equals("G")==false)
							    	        	  
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
						
						if(UpdateOrange22.equals("W")==false)
						{
							if(UpdateOrange22.equals("O")==false)
							{
								
								if(UpdateOrange22.equals("B")==false)
								{
									
							       if(UpdateOrange22.equals("R")==false)
							    		   {
							    	          if(UpdateOrange22.equals("G")==false)
							    	        	  
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
							
							if(UpdateYellow00.equals("W")==false)
							{
								if(UpdateYellow00.equals("O")==false)
								{
									
									if(UpdateYellow00.equals("B")==false)
									{
										
								       if(UpdateYellow00.equals("R")==false)
								    		   {
								    	          if(UpdateYellow00.equals("G")==false)
								    	        	  
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
							
							if(UpdateYellow01.equals("W")==false)
							{
								if(UpdateYellow01.equals("O")==false)
								{
									
									if(UpdateYellow01.equals("B")==false)
									{
										
								       if(UpdateYellow01.equals("R")==false)
								    		   {
								    	          if(UpdateYellow01.equals("G")==false)
								    	        	  
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
							
							if(UpdateYellow02.equals("W")==false)
							{
								if(UpdateYellow02.equals("O")==false)
								{
									
									if(UpdateYellow02.equals("B")==false)
									{
										
								       if(UpdateYellow02.equals("R")==false)
								    		   {
								    	          if(UpdateYellow02.equals("G")==false)
								    	        	  
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
							
							if(UpdateYellow10.equals("W")==false)
							{
								if(UpdateYellow10.equals("O")==false)
								{
									
									if(UpdateYellow10.equals("B")==false)
									{
										
								       if(UpdateYellow10.equals("R")==false)
								    		   {
								    	          if(UpdateYellow10.equals("G")==false)
								    	        	  
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
							
							if(UpdateYellow11.equals("W")==false)
							{
								if(UpdateYellow11.equals("O")==false)
								{
									
									if(UpdateYellow11.equals("B")==false)
									{
										
								       if(UpdateYellow11.equals("R")==false)
								    		   {
								    	          if(UpdateYellow11.equals("G")==false)
								    	        	  
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
							
							if(UpdateYellow12.equals("W")==false)
							{
								if(UpdateYellow12.equals("O")==false)
								{
									
									if(UpdateYellow12.equals("B")==false)
									{
										
								       if(UpdateYellow12.equals("R")==false)
								    		   {
								    	          if(UpdateYellow12.equals("G")==false)
								    	        	  
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
							
							if(UpdateYellow20.equals("W")==false)
							{
								if(UpdateYellow20.equals("O")==false)
								{
									
									if(UpdateYellow20.equals("B")==false)
									{
										
								       if(UpdateYellow20.equals("R")==false)
								    		   {
								    	          if(UpdateYellow20.equals("G")==false)
								    	        	  
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
							
							if(UpdateYellow21.equals("W")==false)
							{
								if(UpdateYellow21.equals("O")==false)
								{
									
									if(UpdateYellow21.equals("B")==false)
									{
										
								       if(UpdateYellow21.equals("R")==false)
								    		   {
								    	          if(UpdateYellow21.equals("G")==false)
								    	        	  
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
							
							if(UpdateYellow22.equals("W")==false)
							{
								if(UpdateYellow22.equals("O")==false)
								{
									
									if(UpdateYellow22.equals("B")==false)
									{
										
								       if(UpdateYellow22.equals("R")==false)
								    		   {
								    	          if(UpdateYellow22.equals("G")==false)
								    	        	  
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
