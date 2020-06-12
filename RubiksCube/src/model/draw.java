

package model;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;




public class draw extends JPanel

{
	

	
	
     private static int x,y,flag,redbtncount,greenbtncount,bluebtncount,yellowbtncount,orangebtncount,whitebtncount,nextbtncount;
     public static boolean flagmain= false;
     public static String w00,w01,w02,w10,w11,w12,w20,w21,w22;
     public static String g00,g01,g02,g10,g11,g12,g20,g21,g22;
     public static String r00,r01,r02,r10,r11,r12,r20,r21,r22;
     public static String b00,b01,b02,b10,b11,b12,b20,b21,b22;
     public static String o00,o01,o02,o10,o11,o12,o20,o21,o22;
     public static String y00,y01,y02,y10,y11,y12,y20,y21,y22;
     
     static String[][] White;
     static String[][] Green;
     static String[][] Red;
     static String[][] Blue;
     static String[][] Orange;
     static String[][] Yellow;
     
     
     
     public static JButton redbtn =  new JButton("red");
     public  static JButton greenbtn = new JButton("green");
     public	static JButton bluebtn = new JButton("blue");
     public static JButton nextbtn = new JButton("next");
     public static JButton whitebtn = new JButton("white");
     public static JButton orangebtn = new JButton("orange");
     public static JButton yellowbtn = new JButton("yellow");
     public static JButton savebtn = new JButton("save");
     public static JButton backbtn = new JButton("back");
     
	
	
	
     
     draw()
     
     
     
     
     
     {
    	 
    	 add(redbtn);
    	 add(greenbtn);
    	 add(bluebtn);
    	 add(whitebtn);
    	 add(orangebtn);
    	 add(yellowbtn);
    	 
    	 
    	 add(nextbtn);
    	 add(backbtn);
    	 
    	 add(savebtn);
    	 
    	 
    	 
    	 
    	 
    	 redbtn.addActionListener(new ActionListener()
			
			{

				@Override
				public void actionPerformed(ActionEvent e) 
				
				
				{
					
					
					
					String clickedbtn= e.getActionCommand();
					System.out.println("clicked" + clickedbtn);
					
					if(e.getSource()==redbtn)
					{
						flag=1;
						//setBackground(Color.red);
						redbtncount++;
						System.out.println("redcount" + redbtncount);
						repaint();
								
						
					}
					
				}
		
		
			}
			
			
			);
    	 
    	 
    	 
    	 greenbtn.addActionListener(new ActionListener()
			
			{

				@Override
				public void actionPerformed(ActionEvent e) 
				
				
				{
					
					
					
					String clickedbtn= e.getActionCommand();
					System.out.println("clicked" + clickedbtn);
					
					if(e.getSource()==greenbtn)
					{
						flag=2;
						//setBackground(Color.red);
						greenbtncount++;
						System.out.println("greencount" + greenbtncount);
						repaint();
								
						
					}
					
				}
		
		
			}
			
			
			);
    	 
    	 
    	 
    	 bluebtn.addActionListener(new ActionListener()
			
			{

				@Override
				public void actionPerformed(ActionEvent e) 
				
				
				{
					
					
					
					String clickedbtn= e.getActionCommand();
					System.out.println("clicked" + clickedbtn);
					
					if(e.getSource()==bluebtn)
					{
						flag=3;
						//setBackground(Color.red);
						bluebtncount++;
						System.out.println("bluecount" + bluebtncount);
						repaint();
								
						
					}
					
				}
		
		
			}
			
			
			);
    	 
    	 
    	 
    	 whitebtn.addActionListener(new ActionListener()
			
			{

				@Override
				public void actionPerformed(ActionEvent e) 
				
				
				{
					
					
					
					String clickedbtn= e.getActionCommand();
					System.out.println("clicked" + clickedbtn);
					
					if(e.getSource()==whitebtn)
					{
						flag=4;
						//setBackground(Color.red);
						whitebtncount++;
						System.out.println("whitecount" + whitebtncount);
						repaint();
								
						
					}
					
				}
		
		
			}
			
			
			); 
    	 
    	 
    	 
    	 orangebtn.addActionListener(new ActionListener()
			
			{

				@Override
				public void actionPerformed(ActionEvent e) 
				
				
				{
					
					
					
					String clickedbtn= e.getActionCommand();
					System.out.println("clicked" + clickedbtn);
					
					if(e.getSource()==orangebtn)
					{
						flag=5;
						//setBackground(Color.red);
						orangebtncount++;
						System.out.println("orangecount" + orangebtncount);
						repaint();
								
						
					}
					
				}
		
		
			}
			
			
			);
    	 
    	 
    	 
    	 
    	 yellowbtn.addActionListener(new ActionListener()
			
			{

				@Override
				public void actionPerformed(ActionEvent e) 
				
				
				{
					
					
					
					String clickedbtn= e.getActionCommand();
					System.out.println("clicked" + clickedbtn);
					
					if(e.getSource()==yellowbtn)
					{
						flag=6;
						//setBackground(Color.red);
						yellowbtncount++;
						System.out.println("yellowcount" + yellowbtncount);
						repaint();
								
						
					}
					
				}
		
		
			}
			
			
			);
 	 
	
    	 
    	 nextbtn.addActionListener(new ActionListener()
			
			{

				@Override
				public void actionPerformed(ActionEvent e) 
				
				
				{
					
					
					
					String clickedbtn= e.getActionCommand();
					System.out.println("clicked" + clickedbtn);
					
					if(e.getSource()==nextbtn)
					{
						
						//setBackground(Color.red);
						nextbtncount++;
						System.out.println("nextcount" + nextbtncount);
						
								
						
					}
					
				}
		
		
			}
			
			
			);
    	 
    	 
    	 backbtn.addActionListener(new ActionListener()
			
			{

				@Override
				public void actionPerformed(ActionEvent e) 
				
				
				{
					
					
					
					String clickedbtn= e.getActionCommand();
					System.out.println("clicked" + clickedbtn);
					
					if(e.getSource()==backbtn)
					{
						
						//setBackground(Color.red);
						nextbtncount--;
						System.out.println("nextcount" + nextbtncount);
						
								
						
					}
					
				}
		
		
			}
			
			
			);
 	 
 	 
 	 
    	 
 	 
    	 
    	 
    	 
    	 savebtn.addActionListener(new ActionListener()
			
			{

				@Override
				public void actionPerformed(ActionEvent e) 
				
				
				{
					
					
		       			
					String clickedbtn= e.getActionCommand();
					System.out.println("clicked" + clickedbtn);
					
					if(e.getSource()==savebtn)
					{
						
					
							
					    	White = new String[3][3];
							
							

							White[0][0] = draw.w00;
							White[0][1] = draw.w01;
							White[0][2] = draw.w02;
							White[1][0] = draw.w10;
							White[1][1] = "W";          
							White[1][2] = draw.w12;
							White[2][0] = draw.w20;
							White[2][1] = draw.w21;
							White[2][2] = draw.w22;
							

							System.out.println("White[0][0] "+ White[0][0]);
							System.out.println("White[0][1] "+ White[0][1]);
							System.out.println("White[0][2] "+ White[0][2]);
							System.out.println("White[1][0] "+ White[1][0]);
							System.out.println("White[1][1] "+ White[1][1]);
							System.out.println("White[1][2] "+ White[1][2]);
							System.out.println("White[2][0] "+ White[2][0]);
							System.out.println("White[2][1] "+ White[2][1]);
							System.out.println("White[2][2] "+ White[2][2]);
							
							
							
							
                           Green = new String[3][3];
							
							

                           Green[0][0] = draw.g00;
                           Green[0][1] = draw.g01;
                           Green[0][2] = draw.g02;
                           Green[1][0] = draw.g10;
                           Green[1][1] = "G";          
                           Green[1][2] = draw.g12;
                           Green[2][0] = draw.g20;
                           Green[2][1] = draw.g21;
                           Green[2][2] = draw.g22;
							

							System.out.println("Green[0][0] "+ Green[0][0]);
							System.out.println("Green[0][1] "+ Green[0][1]);
							System.out.println("Green[0][2] "+ Green[0][2]);
							System.out.println("Green[1][0] "+ Green[1][0]);
							System.out.println("Green[1][1] "+ Green[1][1]);
							System.out.println("Green[1][2] "+ Green[1][2]);
							System.out.println("Green[2][0] "+ Green[2][0]);
							System.out.println("Green[2][1] "+ Green[2][1]);
							System.out.println("Green[2][2] "+ Green[2][2]);
							
							
							
							Red = new String[3][3];
							
							

							Red[0][0] = draw.r00;
							Red[0][1] = draw.r01;
							Red[0][2] = draw.r02;
							Red[1][0] = draw.r10;
							Red[1][1] = "R";          
							Red[1][2] = draw.r12;
							Red[2][0] = draw.r20;
							Red[2][1] = draw.r21;
							Red[2][2] = draw.r22;
								

								System.out.println("Red[0][0] "+ Red[0][0]);
								System.out.println("Red[0][1] "+ Red[0][1]);
								System.out.println("Red[0][2] "+ Red[0][2]);
								System.out.println("Red[1][0] "+ Red[1][0]);
								System.out.println("Red[1][1] "+ Red[1][1]);
								System.out.println("Red[1][2] "+ Red[1][2]);
								System.out.println("Red[2][0] "+ Red[2][0]);
								System.out.println("Red[2][1] "+ Red[2][1]);
								System.out.println("Red[2][2] "+ Red[2][2]);
							
							
								
								
								
								

								Blue = new String[3][3];
								
								

								Blue[0][0] = draw.b00;
								Blue[0][1] = draw.b01;
								Blue[0][2] = draw.b02;
								Blue[1][0] = draw.b10;
								Blue[1][1] = "B";          
								Blue[1][2] = draw.b12;
								Blue[2][0] = draw.b20;
								Blue[2][1] = draw.b21;
								Blue[2][2] = draw.b22;
									

									System.out.println("Blue[0][0] "+ Blue[0][0]);
									System.out.println("Blue[0][1] "+ Blue[0][1]);
									System.out.println("Blue[0][2] "+ Blue[0][2]);
									System.out.println("Blue[1][0] "+ Blue[1][0]);
									System.out.println("Blue[1][1] "+ Blue[1][1]);
									System.out.println("Blue[1][2] "+ Blue[1][2]);
									System.out.println("Blue[2][0] "+ Blue[2][0]);
									System.out.println("Blue[2][1] "+ Blue[2][1]);
									System.out.println("Blue[2][2] "+ Blue[2][2]);
								
								
									
									Orange = new String[3][3];
									
									

									Orange[0][0] = draw.o00;
									Orange[0][1] = draw.o01;
									Orange[0][2] = draw.o02;
									Orange[1][0] = draw.o10;
									Orange[1][1] = "O";          
									Orange[1][2] = draw.o12;
									Orange[2][0] = draw.o20;
									Orange[2][1] = draw.o21;
									Orange[2][2] = draw.o22;
										

										System.out.println("Orange[0][0] "+ Orange[0][0]);
										System.out.println("Orange[0][1] "+ Orange[0][1]);
										System.out.println("Orange[0][2] "+ Orange[0][2]);
										System.out.println("Orange[1][0] "+ Orange[1][0]);
										System.out.println("Orange[1][1] "+ Orange[1][1]);
										System.out.println("Orange[1][2] "+ Orange[1][2]);
										System.out.println("Orange[2][0] "+ Orange[2][0]);
										System.out.println("Orange[2][1] "+ Orange[2][1]);
										System.out.println("Orange[2][2] "+ Orange[2][2]);
										
										
										Yellow = new String[3][3];
										
										

										Yellow[0][0] = draw.y00;
										Yellow[0][1] = draw.y01;
										Yellow[0][2] = draw.y02;
										Yellow[1][0] = draw.y10;
										Yellow[1][1] = "Y";          
										Yellow[1][2] = draw.y12;
										Yellow[2][0] = draw.y20;
										Yellow[2][1] = draw.y21;
										Yellow[2][2] = draw.y22;
											

											System.out.println("Yellow[0][0] "+ Yellow[0][0]);
											System.out.println("Yellow[0][1] "+ Yellow[0][1]);
											System.out.println("Yellow[0][2] "+ Yellow[0][2]);
											System.out.println("Yellow[1][0] "+ Yellow[1][0]);
											System.out.println("Yellow[1][1] "+ Yellow[1][1]);
											System.out.println("Yellow[1][2] "+ Yellow[1][2]);
											System.out.println("Yellow[2][0] "+ Yellow[2][0]);
											System.out.println("Yellow[2][1] "+ Yellow[2][1]);
											System.out.println("Yellow[2][2] "+ Yellow[2][2]);
											
										
								
								
								
							Cube.flag=1;
							System.out.println("flag value in draw "+ Cube.flag);
						
							
							
							
							Cube.displayColorWhite();
							
							
							Cube.displayColorGreen();
							
							Cube.displayColorRed();
							
					       Cube.displayColorBlue();
						    
						   Cube.displayColorOrange();
						    
						    Cube.displayColorYellow();
						    
						    
						  // Cube.displayScramble();
						    
						    
						    
						    
						    
						    
						    System.out.println("\n");
						   
						    Cube.data7 =  Cube.CheckPosCor();
						
						    
						    
						  
						    
						    
					    	
						    while((  (Cube.White[0][0].equals("W"))   &&   (Cube.White[0][2].equals("W"))     && (Cube.White[2][0].equals("W"))   &&   (Cube.White[2][2].equals("W"))  &&    (Cube.Orange[0][0].equals("O")) &&   (Cube.Orange[0][2].equals("O"))    &&   (Cube.Orange[2][0].equals("O")) &&   (Cube.Orange[2][2].equals("O")) &&   (Cube.Green[0][0].equals("G")) &&   (Cube.Green[0][2].equals("G"))   &&    (Cube.Green[2][0].equals("G")) &&   (Cube.Green[2][2].equals("G")) &&   (Cube.Red[0][0].equals("R")) &&   (Cube.Red[0][2].equals("R")) &&   (Cube.Red[2][0].equals("R")) &&   (Cube.Red[2][2].equals("R"))   && (Cube.Blue[0][0].equals("B")) && (Cube.Blue[0][2].equals("B"))  && (Cube.Blue[2][0].equals("B"))  && (Cube.Blue[2][2].equals("B"))  && (Cube.Yellow[0][0].equals("Y"))  && (Cube.Yellow[0][2].equals("Y"))  && (Cube.Yellow[2][0].equals("Y"))  && (Cube.Yellow[2][2].equals("Y"))            ) == false)
						    {  	
						   Cube.getPosCor(Cube.data7);
						   //Cube.UpdateColorWhite();
					   	   //Cube.UpdateColorGreen();
					   	   //Cube.UpdateColorRed();
					   	   //Cube.UpdateColorBlue();
					   	  // Cube.UpdateColorOrange();
					       //Cube.UpdateColorYellow();
					       
					     //  Cube.showUpdate();
					   //    Cube.displayUpdate(); 
						   
						 
						   Cube.n++;
						  
						 
						    }
						    
						  //  showUpdate();
						   // displayUpdate();
						    
						    if( Cube.n%2 == 0) 
						    {
						    	
						    	System.out.println("Corners position is correct");
						    }
						    
						    else
						    {
						    	 // Cube.getPosCor(data7);
						    	
						    	 System.out.println("Corners position is  now correct");
						    	 
						    	 
						    	 Cube.temp1 = new String[1][2];
						    	 Cube.ed0 = new String[1][2];
						    	 
						         Cube.temp1[0][0] = Cube.White[1][0];
					             Cube.White[1][0]= Cube.White[0][1];
					              Cube.White[0][1]= Cube.temp1[0][0];
					              
					              
					             
					              
					              
					             Cube.temp1[0][1] = Cube.Orange[0][1];
					             Cube.Orange[0][1] = Cube.Blue[0][1];
					             Cube.Blue[0][1]=  Cube.temp1[0][1];
					              
					       	 
					              
					             Cube.ed0[0][0] = Cube.temp1 [0][0];
					             Cube.ed0[0][1] =  Cube.temp1 [0][1];
					          	 
					              
					              
					          	 
					          	for(int j=0;j<2;j++)
					     	  {
					     		//  System.out.print(cor1[0][j]+"\t");
					     	  }
					          	  
					          	Cube.data8=  (Cube.ed0[0][0] +  Cube.ed0[0][1] );
					          	  
					          	  
						    	 
						    	
						    }
						  
						    
						    
						   
						    System.out.println("rubcor");
						    while((   ( (Cube.rubcor[0][Cube.P])==0)&&((Cube.rubcor[0][Cube.P+1])==0) )  ==false   )

					        {

					                Cube.data13=Cube.CheckCor();
						    	
						 
					        }
						    
						    
					    	
						  
					    	Cube.UpdateColorWhite();
					    	Cube.UpdateColorGreen();
					    	Cube.UpdateColorRed();
					    	Cube.UpdateColorBlue();
					    	Cube.UpdateColorOrange();
					        Cube.UpdateColorYellow();
					        
					        //cut & paste
					        
					        
					       //showUpdate();
					       //displayUpdate(); 
					       
					        
					        
					        
					      // Cube.displayUpdate(); 
					        
					       
					        
					        
					        
					       
					        System.out.println("\n");
					 	   
						    Cube.data9 =  Cube.CheckPosEd();
						    
						    System.out.println("edge is " + Cube.data9);
						    
						    //repeat
						    
				    
						    
						    
						    while((  (Cube.White[1][0].equals("W")) &&   (Cube.White[0][1].equals("W") )     && (Cube.White[1][2].equals("W"))   &&   (Cube.White[2][1].equals("W"))  &&  (Cube.Green[0][1].equals("G") ) &&   (Cube.Green[1][0].equals("G"))    &&   (Cube.Green[2][1].equals("G")) &&   (Cube.Green[1][2].equals("G")) &&   (Cube.Orange[0][1].equals("O")) &&   (Cube.Orange[1][0].equals("O"))   &&    (Cube.Orange[1][2].equals("O")) &&   (Cube.Orange[2][1].equals("O")) &&   (Cube.Red[0][1].equals("R")) &&   (Cube.Red[1][0].equals("R")) &&   (Cube.Red[1][2].equals("R")) &&   (Cube.Red[2][1].equals("R")) &&   (Cube.Blue[0][1].equals("B"))    && (Cube.Blue[1][0].equals("B"))    &&  (Cube.Blue[1][2].equals("B"))   && (Cube.Blue[2][1].equals("B"))   && (Cube.Yellow[0][1].equals("Y")) && (Cube.Yellow[1][0].equals("Y")) && (Cube.Yellow[1][2].equals("Y"))   && (Cube.Yellow[2][1].equals("Y"))  ) == false)
						    
						    {
						    	Cube.getPosEd(Cube.data9);
						    	//Cube.UpdateColorWhite();
						    	//Cube.UpdateColorGreen();
						    	//Cube.UpdateColorRed();
						    	//Cube.UpdateColorBlue();
						    	//Cube.UpdateColorOrange();
						        //Cube.UpdateColorYellow();
						    //    Cube.showUpdate();
						      //  Cube.displayUpdate();
						    }
						    
						   
						    
						    
						    
						    Cube.UpdateColorWhite();
					    	Cube.UpdateColorGreen();
					    	Cube.UpdateColorRed();
					    	Cube.UpdateColorBlue();
					    	Cube.UpdateColorOrange();
					        Cube.UpdateColorYellow();
					        				        
					        showUpdate();
					        displayUpdate();
					        
					        
					      Cube.displayFont();
					        
					        
					        
					       // Cube.displayFinal(); 
					       
					        //Cube.displayUpdate(); 
					       // Cube.displayScramble();
					        //System.exit(0);
					        
					     
						    
						     } 
						
						
						
						    
					//D' R2 U' R2 U'  R2 B2 F2 U' R2 B2 R2 B' D2 U' F' D' R D'  B2 U2  //DONE (EVEN)
						
						}
						
						 
							
							//System.exit(0);
							
						
			
		
		
			}
			
			
			);
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
     }
     
     
     
     
     public static void showUpdate()
     {
   	  
   	  drawingUpdate.UpdateWhite00=    Cube.White[0][0];
         drawingUpdate.UpdateWhite01= Cube.White[0][1];
         drawingUpdate.UpdateWhite02= Cube.White[0][2];
         drawingUpdate.UpdateWhite10= Cube.White[1][0];
         drawingUpdate.UpdateWhite11= Cube.White[1][1];
         drawingUpdate.UpdateWhite12= Cube.White[1][2];
         drawingUpdate.UpdateWhite20= Cube.White[2][0];
         drawingUpdate.UpdateWhite21= Cube.White[2][1];
         drawingUpdate.UpdateWhite22= Cube.White[2][2];
         
         
         drawingUpdate.UpdateGreen00= Cube.Green[0][0];
         drawingUpdate.UpdateGreen01= Cube.Green[0][1];
         drawingUpdate.UpdateGreen02= Cube.Green[0][2];
         drawingUpdate.UpdateGreen10= Cube.Green[1][0];
         drawingUpdate.UpdateGreen11= Cube.Green[1][1];
         drawingUpdate.UpdateGreen12= Cube.Green[1][2];
         drawingUpdate.UpdateGreen20= Cube.Green[2][0];
         drawingUpdate.UpdateGreen21= Cube.Green[2][1];
         drawingUpdate.UpdateGreen22= Cube.Green[2][2];
         
         
         
         drawingUpdate.UpdateRed00= Cube.Red[0][0];
         drawingUpdate.UpdateRed01= Cube.Red[0][1];
         drawingUpdate.UpdateRed02= Cube.Red[0][2];
         drawingUpdate.UpdateRed10= Cube.Red[1][0];
         drawingUpdate.UpdateRed11= Cube.Red[1][1];
         drawingUpdate.UpdateRed12= Cube.Red[1][2];
         drawingUpdate.UpdateRed20= Cube.Red[2][0];
         drawingUpdate.UpdateRed21= Cube.Red[2][1];
         drawingUpdate.UpdateRed22= Cube.Red[2][2];
         
         
         
         drawingUpdate.UpdateBlue00= Cube.Blue[0][0];
         drawingUpdate.UpdateBlue01= Cube.Blue[0][1];
         drawingUpdate.UpdateBlue02= Cube.Blue[0][2];
         drawingUpdate.UpdateBlue10= Cube.Blue[1][0];
         drawingUpdate.UpdateBlue11= Cube.Blue[1][1];
         drawingUpdate.UpdateBlue12= Cube.Blue[1][2];
         drawingUpdate.UpdateBlue20= Cube.Blue[2][0];
         drawingUpdate.UpdateBlue21= Cube.Blue[2][1];
         drawingUpdate.UpdateBlue22= Cube.Blue[2][2];
         
         
         drawingUpdate.UpdateOrange00= Cube.Orange[0][0];
         drawingUpdate.UpdateOrange01= Cube.Orange[0][1];
         drawingUpdate.UpdateOrange02= Cube.Orange[0][2];
         drawingUpdate.UpdateOrange10= Cube.Orange[1][0];
         drawingUpdate.UpdateOrange11= Cube.Orange[1][1];
         drawingUpdate.UpdateOrange12= Cube.Orange[1][2];
         drawingUpdate.UpdateOrange20= Cube.Orange[2][0];
         drawingUpdate.UpdateOrange21= Cube.Orange[2][1];
         drawingUpdate.UpdateOrange22= Cube.Orange[2][2];
         
         
         drawingUpdate.UpdateYellow00= Cube.Yellow[0][0];
         drawingUpdate.UpdateYellow01= Cube.Yellow[0][1];
         drawingUpdate.UpdateYellow02= Cube.Yellow[0][2];
         drawingUpdate.UpdateYellow10= Cube.Yellow[1][0];
         drawingUpdate.UpdateYellow11= Cube.Yellow[1][1];
         drawingUpdate.UpdateYellow12= Cube.Yellow[1][2];
         drawingUpdate.UpdateYellow20= Cube.Yellow[2][0];
         drawingUpdate.UpdateYellow21= Cube.Yellow[2][1];
         drawingUpdate.UpdateYellow22= Cube.Yellow[2][2];
     }
     
     
     
     
     public static void displayUpdate()
     {
   	  
   	  JFrame window = new JFrame();
         window.setSize(500,600);
         window.setTitle("Rubiks Cube Update");
         window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         window.setVisible(true);
        
         //Cube.UpdateColorWhite();
         
         drawingUpdate du = new drawingUpdate();
         window.add(du);  
       //  Cube.delay(2000);
        //window.setVisible(false);
         
         
   	  
     }
     
     
     
     
     
     
	
	public void paintComponent(Graphics g)
	{
		
		Graphics2D g2 =(Graphics2D)	g;
		Graphics2D g1 =(Graphics2D)	g;
		
		
		
		
		
		
		
		
		
		
		
		Color yellow  = new Color(245,245,0);
		
		
		   Rectangle rect1 = new Rectangle(145,185,40,40);
		
		
	    
			Rectangle rect2 = new Rectangle(185,185,40,40);	
			
			Rectangle rect3 = new Rectangle(225,185,40,40);	
			
			Rectangle rect4 = new Rectangle(145,225,40,40);	
			
			Rectangle rect5 = new Rectangle(185,225,40,40);
			
			Rectangle rect6 = new Rectangle(225,225,40,40);
			
			Rectangle rect7 = new Rectangle(145,265,40,40);
			
			Rectangle rect8 = new Rectangle(185,265,40,40);
			
			Rectangle rect9 = new Rectangle(225,265,40,40);
			
			
			
			Rectangle rect10 = new Rectangle(145,305,40,40);
			
			Rectangle rect11 = new Rectangle(185,305,40,40);
			
			Rectangle rect12 = new Rectangle(225,305,40,40);
			
			
            Rectangle rect13 = new Rectangle(145,345,40,40);
			
			Rectangle rect14 = new Rectangle(185,345,40,40);
			
			Rectangle rect15 = new Rectangle(225,345,40,40);
			
			
            Rectangle rect16 = new Rectangle(145,385,40,40);
		
			Rectangle rect17 = new Rectangle(185,385,40,40);
			
			Rectangle rect18 = new Rectangle(225,385,40,40);
			
			
	        
			
           Rectangle rect19 = new Rectangle(265,265,40,40);
			
			Rectangle rect20 = new Rectangle(265,225,40,40);
			
			Rectangle rect21 = new Rectangle(265,185,40,40);
			
			
            Rectangle rect22 = new Rectangle(305,265,40,40);
			
			Rectangle rect23 = new Rectangle(305,225,40,40);
			
			Rectangle rect24 = new Rectangle(305,185,40,40);
			
			
            Rectangle rect25 = new Rectangle(345,265,40,40);
		
			Rectangle rect26 = new Rectangle(345,225,40,40);
			
			Rectangle rect27 = new Rectangle(345,185,40,40);
			
			
			
			
			   Rectangle rect28 = new Rectangle(225,145,40,40);
				
				Rectangle rect29 = new Rectangle(185,145,40,40);
				
				Rectangle rect30 = new Rectangle(145,145,40,40);
				
				
	            Rectangle rect31 = new Rectangle(225,105,40,40);
				
				Rectangle rect32 = new Rectangle(185,105,40,40);
				
				Rectangle rect33 = new Rectangle(145,105,40,40);
				
				
	            Rectangle rect34 = new Rectangle(225,65,40,40);
			
				Rectangle rect35 = new Rectangle(185,65,40,40);
				
				Rectangle rect36 = new Rectangle(145,65,40,40);
				
			
			
				   Rectangle rect37 = new Rectangle(105,185,40,40);
					
					Rectangle rect38 =  new Rectangle(105,225,40,40);
					
					Rectangle rect39 = new Rectangle(105,265,40,40);
					
					
		            Rectangle rect40 = new Rectangle(65,185,40,40);
					
					Rectangle rect41 = new Rectangle(65,225,40,40);
					
					Rectangle rect42 = new Rectangle(65,265,40,40);
					
					
		            Rectangle rect43 = new Rectangle(25,185,40,40);
				
					Rectangle rect44 = new Rectangle(25,225,40,40);
					
					Rectangle rect45 = new Rectangle(25,265,40,40);
			
			
					
					

					   Rectangle rect46 = new Rectangle(145,425,40,40);
						
						Rectangle rect47 = new Rectangle(185,425,40,40);
						
						Rectangle rect48 = new Rectangle(225,425,40,40);
						
						
			            Rectangle rect49 = new Rectangle(145,465,40,40);
						
						Rectangle rect50 =  new Rectangle(185,465,40,40);
						
						Rectangle rect51 =  new Rectangle(225,465,40,40);
						
						
			            Rectangle rect52 = new Rectangle(145,505,40,40);
					
						Rectangle rect53 = new Rectangle(185,505,40,40);
						
						Rectangle rect54 = new Rectangle(225,505,40,40);
				
			
		
		
		
		System.out.println("next is" + nextbtncount);
		System.out.println("flag is" + flag);
		
		
	         g2.setColor(Color.white);
			 w11= "W";
			 System.out.println("wHITE[1][1]" + w11);
			
		 
		       g2.fill(rect5);
		    
		    
		        g2.setColor(Color.green);
				g11= "G";
				 System.out.println("green[1][1]" + g11);
			
			 
			      g2.fill(rect14);
			      
			      
					
					g2.setColor(Color.red);
					r11= "R";
					 System.out.println("red[1][1]" + r11);
					
				 
				 g2.fill(rect23);  
				 
				 
					g2.setColor(Color.BLUE);
					b11= "B";
					 System.out.println("blue[1][1]" + b11);
					
				 
				    g2.fill(rect32);
				    

					g2.setColor(Color.orange);
					o11= "O";
					 System.out.println("orange[1][1]" + o11);
					
				 
				     g2.fill(rect41);
				     
				     
			      
				 	g2.setColor(Color.yellow);
					y11= "Y";
					 System.out.println("yellow[1][1]" + y11);
					
				 
				 g2.fill(rect50);

		
		if(nextbtncount==0)
		{
		
			if(flag==1)
			{
			 g2.setColor(Color.red);
			 w00= "R";
			 System.out.println("wHITE[0][0]" + w00);
			}
			
			
			
			
			if(flag==2)
			{
			 g2.setColor(Color.green);
			 w00= "G";
			 System.out.println("wHITE[0][0]" + w00);
			 
			}
			
			
			
			
			if(flag==3)
			{
			 g2.setColor(Color.blue);
			 w00= "B";
			 System.out.println("wHITE[0][0]" + w00);
			 
			}
			
			
			
			if(flag==4)
			{
			 g2.setColor(Color.white);
			 w00= "W";
			 System.out.println("wHITE[0][0]" + w00);
			 
			}
			
			if(flag==5)
			{
			 g2.setColor(Color.orange);
			 w00= "O";
			 System.out.println("wHITE[0][0]" + w00);
			 
			}
			
			if(flag==6)
			{
			 g2.setColor(Color.yellow);
			 w00= "Y";
			 System.out.println("wHITE[0][0]" + w00);
			 
			}
			
			
			
			
			
			
			
		 g2.fill(rect1);
		 
		}
		
		
		else if(nextbtncount==1)
		{
			
			if(flag==1)
			{
			 g2.setColor(Color.red);
			 w01= "R";
			 System.out.println("wHITE[0][1]" + w01);
			}
			
			
			
			
			if(flag==2)
			{
			 g2.setColor(Color.green);
			 w01= "G";
			 System.out.println("wHITE[0][1]" + w01);
			}
			
			
			
			
			if(flag==3)
			{
			 g2.setColor(Color.blue);
			 w01= "B";
			 System.out.println("wHITE[0][1]" + w01);
			 
			}
			if(flag==4)
			{
			 g2.setColor(Color.white);
			 w01= "W";
			 System.out.println("wHITE[0][1]" + w01);
			 
			}
			
			if(flag==5)
			{
			 g2.setColor(Color.orange);
			 w01= "O";
			 System.out.println("wHITE[0][1]" + w01);
			 
			}
			
			if(flag==6)
			{
			 g2.setColor(Color.yellow);
			 w01= "Y";
			 System.out.println("wHITE[0][1]" + w01);
			 
			}
			
			
			
			
			
		 
		 g2.fill(rect2);
			
		}
		
		
		
		else if(nextbtncount==2)
		{
			
			if(flag==1)
			{
			 g2.setColor(Color.red);
			 w02= "R";
			 System.out.println("wHITE[0][2]" + w02);
			}
			
			
			
			
			if(flag==2)
			{
			 g2.setColor(Color.green);
			 w02= "G";
			 System.out.println("wHITE[0]2]" + w02);
			}
			
			
			
			
			if(flag==3)
			{
			 g2.setColor(Color.blue);
			 w02= "B";
			 System.out.println("wHITE[0][2]" + w02);
			 
			}
			if(flag==4)
			{
			 g2.setColor(Color.white);
			 w02= "W";
			 System.out.println("wHITE[0][2]" + w02);
			 
			}
			
			if(flag==5)
			{
			 g2.setColor(Color.orange);
			 w02= "O";
			 System.out.println("wHITE[0][2]" + w02);
			 
			}
			
			if(flag==6)
			{
			 g2.setColor(Color.yellow);
			 w02= "Y";
			 System.out.println("wHITE[0][2]" + w02);
			 
			}
			
			
			
			
			
		 
		 g2.fill(rect3);
			
		}
		
		
			
		

		else if(nextbtncount==3)
		{
			
			if(flag==1)
			{
			 g2.setColor(Color.red);
			 w10= "R";
			 System.out.println("wHITE[1][0]" + w10);
			}
			
			
			
			
			if(flag==2)
			{
			 g2.setColor(Color.green);
			 w10= "G";
			 System.out.println("wHITE[1][0]" + w10);
			}
			
			
			
			
			if(flag==3)
			{
			 g2.setColor(Color.blue);
			 w10= "B";
			 System.out.println("wHITE[1][0]" + w10);
			 
			}
			if(flag==4)
			{
			 g2.setColor(Color.white);
			 w10= "W";
			 System.out.println("wHITE[1][0]" + w10);
			 
			}
			
			if(flag==5)
			{
			 g2.setColor(Color.orange);
			 w10= "O";
			 System.out.println("wHITE[1][0]" + w10);
			 
			}
			
			if(flag==6)
			{
			 g2.setColor(Color.yellow);
			 w10= "Y";
			 System.out.println("wHITE[1][0]" + w10);
			 
			}
			
			
			
			
			
		 
		 g2.fill(rect4);
			
		}
		
        
		

	//	else if(nextbtncount==4)
	//	{
			
			
	//		g2.setColor(Color.white);
	//		w11= "W";
	//		 System.out.println("wHITE[1][1]" + w11);
			
		 
	//	 g2.fill(rect5);
			
	//	}
		
		
		


		else if(nextbtncount==4)
		{
			
			if(flag==1)
			{
			 g2.setColor(Color.red);
			 w12= "R";
			 System.out.println("wHITE[1][2]" + w12);
			}
			
			
			
			
			if(flag==2)
			{
			 g2.setColor(Color.green);
			 w12= "G";
			 System.out.println("wHITE[1][2]" + w12);
			}
			
			
			
			
			if(flag==3)
			{
			 g2.setColor(Color.blue);
			 w12= "B";
			 System.out.println("wHITE[1][2]" + w12);
			 
			}
			if(flag==4)
			{
			 g2.setColor(Color.white);
			 w12= "W";
			 System.out.println("wHITE[1][2]" + w12);
			 
			}
			
			if(flag==5)
			{
			 g2.setColor(Color.orange);
			 w12= "O";
			 System.out.println("wHITE[1][2]" + w12);
			 
			}
			
			if(flag==6)
			{
			 g2.setColor(Color.yellow);
			 w12= "Y";
			 System.out.println("wHITE[1][2]" + w12);
			 
			}
			
			
			
			
			
		 
		 g2.fill(rect6);
			
		}
			
		
		
		else if(nextbtncount==5)
		{
			
			if(flag==1)
			{
			 g2.setColor(Color.red);
			 w20= "R";
			 System.out.println("wHITE[2][0]" + w20);
			}
			
			
			
			
			if(flag==2)
			{
			 g2.setColor(Color.green);
			 w20= "G";
			 System.out.println("wHITE[2][0]" + w20);
			}
			
			
			
			
			if(flag==3)
			{
			 g2.setColor(Color.blue);
			 w20= "B";
			 System.out.println("wHITE[2][0]" + w20);
			 
			}
			if(flag==4)
			{
			 g2.setColor(Color.white);
			 w20= "W";
			 System.out.println("wHITE[2][0]" + w20);
			 
			}
			
			if(flag==5)
			{
			 g2.setColor(Color.orange);
			 w20= "O";
			 System.out.println("wHITE[2][0]" + w20);
			 
			}
			
			if(flag==6)
			{
			 g2.setColor(Color.yellow);
			 w20= "Y";
			 System.out.println("wHITE[2][0]" + w20);
			 
			}
			
			
			
			
			
		 
		 g2.fill(rect7);
			
		}
		
			
		
		
		else if(nextbtncount==6)
		{
			
			if(flag==1)
			{
			 g2.setColor(Color.red);
			 w21= "R";
			 System.out.println("wHITE[2][1]" + w21);
			}
			
			
			
			
			if(flag==2)
			{
			 g2.setColor(Color.green);
			 w21= "G";
			 System.out.println("wHITE[2][1]" + w21);
			}
			
			
			
			
			if(flag==3)
			{
			 g2.setColor(Color.blue);
			 w21= "B";
			 System.out.println("wHITE[2][1]" + w21);
			 
			}
			if(flag==4)
			{
			 g2.setColor(Color.white);
			 w21= "W";
			 System.out.println("wHITE[2][1]" + w21);
			 
			}
			
			if(flag==5)
			{
			 g2.setColor(Color.orange);
			 w21= "O";
			 System.out.println("wHITE[2][1]" + w21);
			 
			}
			
			if(flag==6)
			{
			 g2.setColor(Color.yellow);
			 w21= "Y";
			 System.out.println("wHITE[2][1]" + w21);
			 
			}
			
			
			
			
			
		 
		 g2.fill(rect8);
			
		}
		
		else if(nextbtncount==7)
		{
			
			if(flag==1)
			{
			 g2.setColor(Color.red);
			 w22= "R";
			 System.out.println("wHITE[2][2]" + w22);
			}
			
			
			
			
			if(flag==2)
			{
			 g2.setColor(Color.green);
			 w22= "G";
			 System.out.println("wHITE[2][2]" + w22);
			}
			
			
			
			
			if(flag==3)
			{
			 g2.setColor(Color.blue);
			 w22= "B";
			 System.out.println("wHITE[2][2]" + w22);
			 
			}
			if(flag==4)
			{
			 g2.setColor(Color.white);
			 w22= "W";
			 System.out.println("wHITE[2][2]" + w22);
			 
			}
			
			if(flag==5)
			{
			 g2.setColor(Color.orange);
			 w22= "O";
			 System.out.println("wHITE[2][2]" + w22);
			 
			}
			
			if(flag==6)
			{
			 g2.setColor(Color.yellow);
			 w22= "Y";
			 System.out.println("wHITE[2][2]" + w22);
			 
			}
			
			
			
			
			
		 
		 g2.fill(rect9);
			
		}
		
		
		
		
		
		else if(nextbtncount==8)
		{
		
			if(flag==1)
			{
			 g2.setColor(Color.red);
			 g00= "R";
			 System.out.println("green[0][0]" + g00);
			}
			
			
			
			
			if(flag==2)
			{
			 g2.setColor(Color.green);
			 g00= "G";
			 System.out.println("green[0][0]" + g00);
			 
			}
			
			
			
			
			if(flag==3)
			{
			 g2.setColor(Color.blue);
			 g00= "B";
			 System.out.println("green[0][0]" + g00);
			 
			}
			
			
			
			if(flag==4)
			{
			 g2.setColor(Color.white);
			 g00= "W";
			 System.out.println("green[0][0]" + g00);
			 
			}
			
			if(flag==5)
			{
			 g2.setColor(Color.orange);
			 g00= "O";
			 System.out.println("green[0][0]" + g00);
			 
			}
			
			if(flag==6)
			{
			 g2.setColor(Color.yellow);
			 g00= "Y";
			 System.out.println("green[0][0]" + g00);
			 
			}
			
			
			
			
			
			
			
		 g2.fill(rect10);
		 
		}
		
		
		else if(nextbtncount==9)
		{
			
			if(flag==1)
			{
			 g2.setColor(Color.red);
			 g01= "R";
			 System.out.println("green[0][1]" + g01);
			}
			
			
			
			
			if(flag==2)
			{
			 g2.setColor(Color.green);
			 g01= "G";
			 System.out.println("green[0][1]" + g01);
			}
			
			
			
			
			if(flag==3)
			{
			 g2.setColor(Color.blue);
			 g01= "B";
			 System.out.println("green[0][1]" + g01);
			 
			}
			if(flag==4)
			{
			 g2.setColor(Color.white);
			 g01= "W";
			 System.out.println("green[0][1]" + g01);
			 
			}
			
			if(flag==5)
			{
			 g2.setColor(Color.orange);
			 g01= "O";
			 System.out.println("green[0][1]" + g01);
			 
			}
			
			if(flag==6)
			{
			 g2.setColor(Color.yellow);
			 g01= "Y";
			 System.out.println("green[0][1]" + g01);
			 
			}
			
			
			
			
			
		 
		 g2.fill(rect11);
			
		}
		
		
		
		else if(nextbtncount==10)
		{
			
			if(flag==1)
			{
			 g2.setColor(Color.red);
			 g02= "R";
			 System.out.println("green[0][2]" + g02);
			}
			
			
			
			
			if(flag==2)
			{
			 g2.setColor(Color.green);
			 g02= "G";
			 System.out.println("green[0]2]" + g02);
			}
			
			
			
			
			if(flag==3)
			{
			 g2.setColor(Color.blue);
			 g02= "B";
			 System.out.println("green[0][2]" + g02);
			 
			}
			if(flag==4)
			{
			 g2.setColor(Color.white);
			 g02= "W";
			 System.out.println("green[0][2]" + g02);
			 
			}
			
			if(flag==5)
			{
			 g2.setColor(Color.orange);
			 g02= "O";
			 System.out.println("green[0][2]" + g02);
			 
			}
			
			if(flag==6)
			{
			 g2.setColor(Color.yellow);
			 g02= "Y";
			 System.out.println("green[0][2]" + g02);
			 
			}
			
			
			
			
			
		 
		 g2.fill(rect12);
			
		}
		
		
			
		

		else if(nextbtncount==11)
		{
			
			if(flag==1)
			{
			 g2.setColor(Color.red);
			 g10= "R";
			 System.out.println("green[1][0]" + g10);
			}
			
			
			
			
			if(flag==2)
			{
			 g2.setColor(Color.green);
			 g10= "G";
			 System.out.println("green[1][0]" + g10);
			}
			
			
			
			
			if(flag==3)
			{
			 g2.setColor(Color.blue);
			 g10= "B";
			 System.out.println("green[1][0]" + g10);
			 
			}
			if(flag==4)
			{
			 g2.setColor(Color.white);
			 g10= "W";
			 System.out.println("green[1][0]" + g10);
			 
			}
			
			if(flag==5)
			{
			 g2.setColor(Color.orange);
			 g10= "O";
			 System.out.println("green[1][0]" + g10);
			 
			}
			
			if(flag==6)
			{
			 g2.setColor(Color.yellow);
			 g10= "Y";
			 System.out.println("green[1][0]" + g10);
			 
			}
			
			
			
			
			
		 
		 g2.fill(rect13);
			
		}
		
        
		

		//else if(nextbtncount==13)
		//{
			
			
		//	g2.setColor(Color.green);
		//	g11= "G";
		//	 System.out.println("green[1][1]" + g11);
		
		 
		// g2.fill(rect14);
			
		//}
		
		
		


		else if(nextbtncount==12)
		{
			
			if(flag==1)
			{
			 g2.setColor(Color.red);
			 g12= "R";
			 System.out.println("green[1][2]" + g12);
			}
			
			
			
			
			if(flag==2)
			{
			 g2.setColor(Color.green);
			 g12= "G";
			 System.out.println("green[1][2]" + g12);
			}
			
			
			
			
			if(flag==3)
			{
			 g2.setColor(Color.blue);
			 g12= "B";
			 System.out.println("green[1][2]" + g12);
			 
			}
			if(flag==4)
			{
			 g2.setColor(Color.white);
			 g12= "W";
			 System.out.println("green[1][2]" + g12);
			 
			}
			
			if(flag==5)
			{
			 g2.setColor(Color.orange);
			 g12= "O";
			 System.out.println("green[1][2]" + g12);
			 
			}
			
			if(flag==6)
			{
			 g2.setColor(Color.yellow);
			 g12= "Y";
			 System.out.println("green[1][2]" + g12);
			 
			}
			
			
			
			
			
		 
		 g2.fill(rect15);
			
		}
			
		
		
		else if(nextbtncount==13)
		{
			
			if(flag==1)
			{
			 g2.setColor(Color.red);
			 g20= "R";
			 System.out.println("green[2][0]" + g20);
			}
			
			
			
			
			if(flag==2)
			{
			 g2.setColor(Color.green);
			 g20= "G";
			 System.out.println("green[2][0]" + g20);
			}
			
			
			
			
			if(flag==3)
			{
			 g2.setColor(Color.blue);
			 g20= "B";
			 System.out.println("green[2][0]" + g20);
			 
			}
			if(flag==4)
			{
			 g2.setColor(Color.white);
			 g20= "W";
			 System.out.println("green[2][0]" + g20);
			 
			}
			
			if(flag==5)
			{
			 g2.setColor(Color.orange);
			 g20= "O";
			 System.out.println("green[2][0]" + g20);
			 
			}
			
			if(flag==6)
			{
			 g2.setColor(Color.yellow);
			 g20= "Y";
			 System.out.println("green[2][0]" + g20);
			 
			}
			
			
			
			
			
		 
		 g2.fill(rect16);
			
		}
		
			
		
		
		else if(nextbtncount==14)
		{
			
			if(flag==1)
			{
			 g2.setColor(Color.red);
			 g21= "R";
			 System.out.println("green[2][1]" + g21);
			}
			
			
			
			
			if(flag==2)
			{
			 g2.setColor(Color.green);
			 g21= "G";
			 System.out.println("green[2][1]" + g21);
			}
			
			
			
			
			if(flag==3)
			{
			 g2.setColor(Color.blue);
			 g21= "B";
			 System.out.println("green[2][1]" + g21);
			 
			}
			if(flag==4)
			{
			 g2.setColor(Color.white);
			 g21= "W";
			 System.out.println("green[2][1]" + g21);
			 
			}
			
			if(flag==5)
			{
			 g2.setColor(Color.orange);
			 g21= "O";
			 System.out.println("green[2][1]" + g21);
			 
			}
			
			if(flag==6)
			{
			 g2.setColor(Color.yellow);
			 g21= "Y";
			 System.out.println("green[2][1]" + g21);
			 
			}
			
			
			
			
			
		 
		 g2.fill(rect17);
			
		}
		
		else if(nextbtncount==15)
		{
			
			if(flag==1)
			{
			 g2.setColor(Color.red);
			 g22= "R";
			 System.out.println("green[2][2]" + g22);
			}
			
			
			
			
			if(flag==2)
			{
			 g2.setColor(Color.green);
			 g22= "G";
			 System.out.println("green[2][2]" + g22);
			}
			
			
			
			
			if(flag==3)
			{
			 g2.setColor(Color.blue);
			 g22= "B";
			 System.out.println("green[2][2]" + g22);
			 
			}
			if(flag==4)
			{
			 g2.setColor(Color.white);
			 g22= "W";
			 System.out.println("green[2][2]" + g22);
			 
			}
			
			if(flag==5)
			{
			 g2.setColor(Color.orange);
			 g22= "O";
			 System.out.println("green[2][2]" + g22);
			 
			}
			
			if(flag==6)
			{
			 g2.setColor(Color.yellow);
			 g22= "Y";
			 System.out.println("green[2][2]" + g22);
			 
			}
			
			
			
			
			
		 
		 g2.fill(rect18);
			
		}
		
		
		
		
		
		
		
		

		else if(nextbtncount==16)
		{
		
			if(flag==1)
			{
			 g2.setColor(Color.red);
			 r00= "R";
			 System.out.println("red[0][0]" + r00);
			}
			
			
			
			
			if(flag==2)
			{
			 g2.setColor(Color.green);
			 r00= "G";
			 System.out.println("red[0][0]" + r00);
			 
			}
			
			
			
			
			if(flag==3)
			{
			 g2.setColor(Color.blue);
			 r00= "B";
			 System.out.println("red[0][0]" + r00);
			 
			}
			
			
			
			if(flag==4)
			{
			 g2.setColor(Color.white);
			 r00= "W";
			 System.out.println("red[0][0]" + r00);
			 
			}
			
			if(flag==5)
			{
			 g2.setColor(Color.orange);
			 r00= "O";
			 System.out.println("red[0][0]" + r00);
			 
			}
			
			if(flag==6)
			{
			 g2.setColor(Color.yellow);
			 r00= "Y";
			 System.out.println("red[0][0]" + r00);
			 
			}
			
			
			
			
			
			
			
		 g2.fill(rect19);
		 
		}
		
		
		else if(nextbtncount==17)
		{
			
			if(flag==1)
			{
			 g2.setColor(Color.red);
			 r01= "R";
			 System.out.println("red[0][1]" + r01);
			}
			
			
			
			
			if(flag==2)
			{
			 g2.setColor(Color.green);
			 r01= "G";
			 System.out.println("red[0][1]" + r01);
			}
			
			
			
			
			if(flag==3)
			{
			 g2.setColor(Color.blue);
			 r01= "B";
			 System.out.println("red[0][1]" + r01);
			 
			}
			if(flag==4)
			{
			 g2.setColor(Color.white);
			 r01= "W";
			 System.out.println("red[0][1]" + r01);
			 
			}
			
			if(flag==5)
			{
			 g2.setColor(Color.orange);
			 r01= "O";
			 System.out.println("red[0][1]" + r01);
			 
			}
			
			if(flag==6)
			{
			 g2.setColor(Color.yellow);
			 r01= "Y";
			 System.out.println("red[0][1]" + r01);
			 
			}
			
			
			
			
			
		 
		 g2.fill(rect20);
			
		}
		
		
		
		else if(nextbtncount==18)
		{
			
			if(flag==1)
			{
			 g2.setColor(Color.red);
			 r02= "R";
			 System.out.println("red[0][2]" + r02);
			}
			
			
			
			
			if(flag==2)
			{
			 g2.setColor(Color.green);
			 r02= "G";
			 System.out.println("red[0]2]" + r02);
			}
			
			
			
			
			if(flag==3)
			{
			 g2.setColor(Color.blue);
			 r02= "B";
			 System.out.println("red[0][2]" + r02);
			 
			}
			if(flag==4)
			{
			 g2.setColor(Color.white);
			 r02= "W";
			 System.out.println("red[0][2]" + r02);
			 
			}
			
			if(flag==5)
			{
			 g2.setColor(Color.orange);
			 r02= "O";
			 System.out.println("red[0][2]" + r02);
			 
			}
			
			if(flag==6)
			{
			 g2.setColor(Color.yellow);
			 r02= "Y";
			 System.out.println("red[0][2]" + r02);
			 
			}
			
			
			
			
			
		 
		 g2.fill(rect21);
			
		}
		
		
			
		

		else if(nextbtncount==19)
		{
			
			if(flag==1)
			{
			 g2.setColor(Color.red);
			 r10= "R";
			 System.out.println("red[1][0]" + r10);
			}
			
			
			
			
			if(flag==2)
			{
			 g2.setColor(Color.green);
			 r10= "G";
			 System.out.println("red[1][0]" + r10);
			}
			
			
			
			
			if(flag==3)
			{
			 g2.setColor(Color.blue);
			 r10= "B";
			 System.out.println("red[1][0]" + r10);
			 
			}
			if(flag==4)
			{
			 g2.setColor(Color.white);
			 r10= "W";
			 System.out.println("red[1][0]" + r10);
			 
			}
			
			if(flag==5)
			{
			 g2.setColor(Color.orange);
			 r10= "O";
			 System.out.println("red[1][0]" + r10);
			 
			}
			
			if(flag==6)
			{
			 g2.setColor(Color.yellow);
			 r10= "Y";
			 System.out.println("red[1][0]" + r10);
			 
			}
			
			
			
			
			
		 
		 g2.fill(rect22);
			
		}
		
        
		
      /*
		else if(nextbtncount==22)
		{
			
			
			g2.setColor(Color.red);
			r11= "R";
			 System.out.println("red[1][1]" + r11);
			
		 
		 g2.fill(rect23);
			
		}
		
		*/
		


		else if(nextbtncount==20)
		{
			
			if(flag==1)
			{
			 g2.setColor(Color.red);
			 r12= "R";
			 System.out.println("red[1][2]" + r12);
			}
			
			
			
			
			if(flag==2)
			{
			 g2.setColor(Color.green);
			 r12= "G";
			 System.out.println("red[1][2]" + r12);
			}
			
			
			
			
			if(flag==3)
			{
			 g2.setColor(Color.blue);
			 r12= "B";
			 System.out.println("red[1][2]" + r12);
			 
			}
			if(flag==4)
			{
			 g2.setColor(Color.white);
			 r12= "W";
			 System.out.println("red[1][2]" + r12);
			 
			}
			
			if(flag==5)
			{
			 g2.setColor(Color.orange);
			 r12= "O";
			 System.out.println("red[1][2]" + r12);
			 
			}
			
			if(flag==6)
			{
			 g2.setColor(Color.yellow);
			 r12= "Y";
			 System.out.println("red[1][2]" + r12);
			 
			}
			
			
			
			
			
		 
		 g2.fill(rect24);
			
		}
			
		
		
		else if(nextbtncount==21)
		{
			
			if(flag==1)
			{
			 g2.setColor(Color.red);
			 r20= "R";
			 System.out.println("red[2][0]" + r20);
			}
			
			
			
			
			if(flag==2)
			{
			 g2.setColor(Color.green);
			 r20= "G";
			 System.out.println("red[2][0]" + r20);
			}
			
			
			
			
			if(flag==3)
			{
			 g2.setColor(Color.blue);
			 r20= "B";
			 System.out.println("red[2][0]" + r20);
			 
			}
			if(flag==4)
			{
			 g2.setColor(Color.white);
			 r20= "W";
			 System.out.println("red[2][0]" + r20);
			 
			}
			
			if(flag==5)
			{
			 g2.setColor(Color.orange);
			 r20= "O";
			 System.out.println("red[2][0]" + r20);
			 
			}
			
			if(flag==6)
			{
			 g2.setColor(Color.yellow);
			 r20= "Y";
			 System.out.println("red[2][0]" + r20);
			 
			}
			
			
			
			
			
		 
		 g2.fill(rect25);
			
		}
		
			
		
		
		else if(nextbtncount==22)
		{
			
			if(flag==1)
			{
			 g2.setColor(Color.red);
			 r21= "R";
			 System.out.println("red[2][1]" + r21);
			}
			
			
			
			
			if(flag==2)
			{
			 g2.setColor(Color.green);
			 r21= "G";
			 System.out.println("red[2][1]" + r21);
			}
			
			
			
			
			if(flag==3)
			{
			 g2.setColor(Color.blue);
			 r21= "B";
			 System.out.println("red[2][1]" + r21);
			 
			}
			if(flag==4)
			{
			 g2.setColor(Color.white);
			 r21= "W";
			 System.out.println("red[2][1]" + r21);
			 
			}
			
			if(flag==5)
			{
			 g2.setColor(Color.orange);
			 r21= "O";
			 System.out.println("red[2][1]" + r21);
			 
			}
			
			if(flag==6)
			{
			 g2.setColor(Color.yellow);
			 r21= "Y";
			 System.out.println("red[2][1]" + r21);
			 
			}
			
			
			
			
			
		 
		 g2.fill(rect26);
			
		}
		
		else if(nextbtncount==23)
		{
			
			if(flag==1)
			{
			 g2.setColor(Color.red);
			 r22= "R";
			 System.out.println("red[2][2]" + r22);
			}
			
			
			
			
			if(flag==2)
			{
			 g2.setColor(Color.green);
			 r22= "G";
			 System.out.println("red[2][2]" + r22);
			}
			
			
			
			
			if(flag==3)
			{
			 g2.setColor(Color.blue);
			 r22= "B";
			 System.out.println("red[2][2]" + r22);
			 
			}
			if(flag==4)
			{
			 g2.setColor(Color.white);
			 r22= "W";
			 System.out.println("red[2][2]" + r22);
			 
			}
			
			if(flag==5)
			{
			 g2.setColor(Color.orange);
			 r22= "O";
			 System.out.println("red[2][2]" + r22);
			 
			}
			
			if(flag==6)
			{
			 g2.setColor(Color.yellow);
			 r22= "Y";
			 System.out.println("red[2][2]" + r22);
			 
			}
			
			
			
			
			
		 
		 g2.fill(rect27);
			
		}
		
		
		
		
		
		
		
		

		else if(nextbtncount==24)
		{
		
			if(flag==1)
			{
			 g2.setColor(Color.red);
			 b00= "R";
			 System.out.println("blue[0][0]" + b00);
			}
			
			
			
			
			if(flag==2)
			{
			 g2.setColor(Color.green);
			 b00= "G";
			 System.out.println("blue[0][0]" + b00);
			 
			}
			
			
			
			
			if(flag==3)
			{
			 g2.setColor(Color.blue);
			 b00= "B";
			 System.out.println("blue[0][0]" + b00);
			 
			}
			
			
			
			if(flag==4)
			{
			 g2.setColor(Color.white);
			 b00= "W";
			 System.out.println("blue[0][0]" + b00);
			 
			}
			
			if(flag==5)
			{
			 g2.setColor(Color.orange);
			 b00= "O";
			 System.out.println("blue[0][0]" + b00);
			 
			}
			
			if(flag==6)
			{
			 g2.setColor(Color.yellow);
			 b00= "Y";
			 System.out.println("blue[0][0]" + b00);
			 
			}
			
			
			
			
			
			
			
		 g2.fill(rect28);
		 
		}
		
		
		else if(nextbtncount==25)
		{
			
			if(flag==1)
			{
			 g2.setColor(Color.red);
			 b01= "R";
			 System.out.println("blue[0][1]" + b01);
			}
			
			
			
			
			if(flag==2)
			{
			 g2.setColor(Color.green);
			b01= "G";
			 System.out.println("blue[0][1]" + b01);
			}
			
			
			
			
			if(flag==3)
			{
			 g2.setColor(Color.blue);
			 b01= "B";
			 System.out.println("blue[0][1]" + b01);
			 
			}
			if(flag==4)
			{
			 g2.setColor(Color.white);
			 b01= "W";
			 System.out.println("blue[0][1]" + b01);
			 
			}
			
			if(flag==5)
			{
			 g2.setColor(Color.orange);
			 b01= "O";
			 System.out.println("blue[0][1]" + b01);
			 
			}
			
			if(flag==6)
			{
			 g2.setColor(Color.yellow);
			 b01= "Y";
			 System.out.println("blue[0][1]" + b01);
			 
			}
			
			
			
			
			
		 
		 g2.fill(rect29);
			
		}
		
		
		
		else if(nextbtncount==26)
		{
			
			if(flag==1)
			{
			 g2.setColor(Color.red);
			 b02= "R";
			 System.out.println("blue[0][2]" + b02);
			}
			
			
			
			
			if(flag==2)
			{
			 g2.setColor(Color.green);
			 b02= "G";
			 System.out.println("blue[0]2]" + b02);
			}
			
			
			
			
			if(flag==3)
			{
			 g2.setColor(Color.blue);
			 b02= "B";
			 System.out.println("blue[0][2]" + b02);
			 
			}
			if(flag==4)
			{
			 g2.setColor(Color.white);
			 b02= "W";
			 System.out.println("blue[0][2]" + b02);
			 
			}
			
			if(flag==5)
			{
			 g2.setColor(Color.orange);
			 b02= "O";
			 System.out.println("blue[0][2]" + b02);
			 
			}
			
			if(flag==6)
			{
			 g2.setColor(Color.yellow);
			 b02= "Y";
			 System.out.println("blue[0][2]" + b02);
			 
			}
			
			
			
			
			
		 
		 g2.fill(rect30);
			
		}
		
		
			
		

		else if(nextbtncount==27)
		{
			
			if(flag==1)
			{
			 g2.setColor(Color.red);
			 b10= "R";
			 System.out.println("blue[1][0]" + b10);
			}
			
			
			
			
			if(flag==2)
			{
			 g2.setColor(Color.green);
			b10= "G";
			 System.out.println("blue[1][0]" + b10);
			}
			
			
			
			
			if(flag==3)
			{
			 g2.setColor(Color.blue);
			b10= "B";
			 System.out.println("blue[1][0]" + b10);
			 
			}
			if(flag==4)
			{
			 g2.setColor(Color.white);
			 b10= "W";
			 System.out.println("blue[1][0]" + b10);
			 
			}
			
			if(flag==5)
			{
			 g2.setColor(Color.orange);
			 b10= "O";
			 System.out.println("blue[1][0]" + b10);
			 
			}
			
			if(flag==6)
			{
			 g2.setColor(Color.yellow);
			 b10= "Y";
			 System.out.println("blue[1][0]" + b10);
			 
			}
			
			
			
			
			
		 
		 g2.fill(rect31);
			
		}
		
        
		
    /*
		else if(nextbtncount==31)
		{
			
			
			g2.setColor(Color.BLUE);
			b11= "B";
			 System.out.println("blue[1][1]" + b11);
			
		 
		    g2.fill(rect32);
			
		}
		
	*/	
		


		else if(nextbtncount==28)
		{
			
			if(flag==1)
			{
			 g2.setColor(Color.red);
			 b12= "R";
			 System.out.println("blue[1][2]" + b12);
			}
			
			
			
			
			if(flag==2)
			{
			 g2.setColor(Color.green);
			 b12= "G";
			 System.out.println("blue[1][2]" + b12);
			}
			
			
			
			
			if(flag==3)
			{
			 g2.setColor(Color.blue);
			 b12= "B";
			 System.out.println("blue[1][2]" + b12);
			 
			}
			if(flag==4)
			{
			 g2.setColor(Color.white);
			 b12= "W";
			 System.out.println("blue[1][2]" + b12);
			 
			}
			
			if(flag==5)
			{
			 g2.setColor(Color.orange);
			 b12= "O";
			 System.out.println("blue[1][2]" + b12);
			 
			}
			
			if(flag==6)
			{
			 g2.setColor(Color.yellow);
			 b12= "Y";
			 System.out.println("blue[1][2]" + b12);
			 
			}
			
			
			
			
			
		 
		 g2.fill(rect33);
			
		}
			
		
		
		else if(nextbtncount==29)
		{
			
			if(flag==1)
			{
			 g2.setColor(Color.red);
			 b20= "R";
			 System.out.println("blue[2][0]" + b20);
			}
			
			
			
			
			if(flag==2)
			{
			 g2.setColor(Color.green);
			 b20= "G";
			 System.out.println("blue[2][0]" + b20);
			}
			
			
			
			
			if(flag==3)
			{
			 g2.setColor(Color.blue);
			 b20= "B";
			 System.out.println("blue[2][0]" + b20);
			 
			}
			if(flag==4)
			{
			 g2.setColor(Color.white);
			 b20= "W";
			 System.out.println("blue[2][0]" + b20);
			 
			}
			
			if(flag==5)
			{
			 g2.setColor(Color.orange);
			 b20= "O";
			 System.out.println("blue[2][0]" + b20);
			 
			}
			
			if(flag==6)
			{
			 g2.setColor(Color.yellow);
			 b20= "Y";
			 System.out.println("blue[2][0]" + b20);
			 
			}
			
			
			
			
			
		 
		 g2.fill(rect34);
			
		}
		
			
		
		
		else if(nextbtncount==30)
		{
			
			if(flag==1)
			{
			 g2.setColor(Color.red);
			 b21= "R";
			 System.out.println("blue[2][1]" + b21);
			}
			
			
			
			
			if(flag==2)
			{
			 g2.setColor(Color.green);
			 b21= "G";
			 System.out.println("blue[2][1]" + b21);
			}
			
			
			
			
			if(flag==3)
			{
			 g2.setColor(Color.blue);
			 b21= "B";
			 System.out.println("blue[2][1]" + b21);
			 
			}
			if(flag==4)
			{
			 g2.setColor(Color.white);
			 b21= "W";
			 System.out.println("blue[2][1]" + b21);
			 
			}
			
			if(flag==5)
			{
			 g2.setColor(Color.orange);
			 b21= "O";
			 System.out.println("blue[2][1]" + b21);
			 
			}
			
			if(flag==6)
			{
			 g2.setColor(Color.yellow);
			 b21= "Y";
			 System.out.println("blue[2][1]" + b21);
			 
			}
			
			
			
			
			
		 
		 g2.fill(rect35);
			
		}
		
		else if(nextbtncount==31)
		{
			
			if(flag==1)
			{
			 g2.setColor(Color.red);
			 b22= "R";
			 System.out.println("blue[2][2]" + b22);
			}
			
			
			
			
			if(flag==2)
			{
			 g2.setColor(Color.green);
			 b22= "R";
			 System.out.println("blue[2][2]" + b22);
			}
			
			
			
			
			if(flag==3)
			{
			 g2.setColor(Color.blue);
			 b22= "B";
			 System.out.println("blue[2][2]" + b22);
			 
			}
			if(flag==4)
			{
			 g2.setColor(Color.white);
			 b22= "W";
			 System.out.println("blue[2][2]" + b22);
			 
			}
			
			if(flag==5)
			{
			 g2.setColor(Color.orange);
			 b22= "O";
			 System.out.println("blue[2][2]" + b22);
			 
			}
			
			if(flag==6)
			{
			 g2.setColor(Color.yellow);
			 b22= "Y";
			 System.out.println("blue[2][2]" + b22);
			 
			}
			
			
			
			
			
		 
		 g2.fill(rect36);
			
		}
		
		//ORANGE
		
		
		else if(nextbtncount==32)
		{
		
			if(flag==1)
			{
			 g2.setColor(Color.red);
			 o00= "R";
			 System.out.println("orange[0][0]" + o00);
			}
			
			
			
			
			if(flag==2)
			{
			 g2.setColor(Color.green);
			 o00= "G";
			 System.out.println("orange[0][0]" + o00);
			 
			}
			
			
			
			
			if(flag==3)
			{
			 g2.setColor(Color.blue);
			 o00= "B";
			 System.out.println("orange[0][0]" + o00);
			 
			}
			
			
			
			if(flag==4)
			{
			 g2.setColor(Color.white);
			 o00= "W";
			 System.out.println("orange[0][0]" + o00);
			 
			}
			
			if(flag==5)
			{
			 g2.setColor(Color.orange);
			 o00= "O";
			 System.out.println("orange[0][0]" + o00);
			 
			}
			
			if(flag==6)
			{
			 g2.setColor(Color.yellow);
			 o00= "Y";
			 System.out.println("orange[0][0]" + o00);
			 
			}
			
			
			
			
			
			
			
		 g2.fill(rect37);
		 
		}
		
		
		else if(nextbtncount==33)
		{
			
			if(flag==1)
			{
			 g2.setColor(Color.red);
			 o01= "R";
			 System.out.println("orange[0][1]" + o01);
			}
			
			
			
			
			if(flag==2)
			{
			 g2.setColor(Color.green);
			o01= "G";
			 System.out.println("orange[0][1]" + o01);
			}
			
			
			
			
			if(flag==3)
			{
			 g2.setColor(Color.blue);
			 o01= "B";
			 System.out.println("orange[0][1]" + o01);
			 
			}
			if(flag==4)
			{
			 g2.setColor(Color.white);
			  o01= "W";
			 System.out.println("orange[0][1]" + o01);
			 
			}
			
			if(flag==5)
			{
			 g2.setColor(Color.orange);
			 o01= "O";
			 System.out.println("orange[0][1]" + o01);
			 
			}
			
			if(flag==6)
			{
			 g2.setColor(Color.yellow);
			 o01= "Y";
			 System.out.println("orange[0][1]" + o01);
			 
			}
			
			
			
			
			
		 
		 g2.fill(rect38);
			
		}
		
		
		
		else if(nextbtncount==34)
		{
			
			if(flag==1)
			{
			 g2.setColor(Color.red);
			 o02= "R";
			 System.out.println("orange[0][2]" + o02);
			}
			
			
			
			
			if(flag==2)
			{
			 g2.setColor(Color.green);
			 o02= "G";
			 System.out.println("orange[0]2]" + o02);
			}
			
			
			
			
			if(flag==3)
			{
			 g2.setColor(Color.blue);
			 o02= "B";
			 System.out.println("orange[0][2]" + o02);
			 
			}
			if(flag==4)
			{
			 g2.setColor(Color.white);
			 o02= "W";
			 System.out.println("orange[0][2]" + o02);
			 
			}
			
			if(flag==5)
			{
			 g2.setColor(Color.orange);
			 o02= "O";
			 System.out.println("orange[0][2]" + o02);
			 
			}
			
			if(flag==6)
			{
			 g2.setColor(Color.yellow);
			 o02= "Y";
			 System.out.println("orange[0][2]" + o02);
			 
			}
			
			
			
			
			
		 
		 g2.fill(rect39);
			
		}
		
		
			
		

		else if(nextbtncount==35)
		{
			
			if(flag==1)
			{
			 g2.setColor(Color.red);
			 o10= "R";
			 System.out.println("orange[1][0]" + o10);
			}
			
			
			
			
			if(flag==2)
			{
			 g2.setColor(Color.green);
			o10= "G";
			 System.out.println("orange[1][0]" + o10);
			}
			
			
			
			
			if(flag==3)
			{
			 g2.setColor(Color.blue);
			o10= "B";
			 System.out.println("orange[1][0]" + o10);
			 
			}
			if(flag==4)
			{
			 g2.setColor(Color.white);
			 o10= "W";
			 System.out.println("orange[1][0]" + o10);
			 
			}
			
			if(flag==5)
			{
			 g2.setColor(Color.orange);
			 o10= "O";
			 System.out.println("orange[1][0]" + o10);
			 
			}
			
			if(flag==6)
			{
			 g2.setColor(Color.yellow);
			 o10= "Y";
			 System.out.println("orange[1][0]" + o10);
			 
			}
			
			
			
			
			
		 
		 g2.fill(rect40);
			
		}
		
        
		
  /*
		else if(nextbtncount==40)
		{
			
			
			g2.setColor(Color.orange);
			o11= "O";
			 System.out.println("orange[1][1]" + o11);
			
		 
		     g2.fill(rect41);
			
		}
		
		*/
		


		else if(nextbtncount==36)
		{
			
			if(flag==1)
			{
			 g2.setColor(Color.red);
			 o12= "R";
			 System.out.println("orange[1][2]" + o12);
			}
			
			
			
			
			if(flag==2)
			{
			 g2.setColor(Color.green);
			 o12= "G";
			 System.out.println("orange[1][2]" + o12);
			}
			
			
			
			
			if(flag==3)
			{
			 g2.setColor(Color.blue);
			 o12= "B";
			 System.out.println("orange[1][2]" + o12);
			 
			}
			if(flag==4)
			{
			 g2.setColor(Color.white);
			o12= "W";
			 System.out.println("orange[1][2]" + o12);
			 
			}
			
			if(flag==5)
			{
			 g2.setColor(Color.orange);
			 o12= "O";
			 System.out.println("orange[1][2]" + o12);
			 
			}
			
			if(flag==6)
			{
			 g2.setColor(Color.yellow);
			 o12= "Y";
			 System.out.println("orange[1][2]" + o12);
			 
			}
			
			
			
			
			
		 
		 g2.fill(rect42);
			
		}
			
		
		
		else if(nextbtncount==37)
		{
			
			if(flag==1)
			{
			 g2.setColor(Color.red);
			 o20= "R";
			 System.out.println("orange[2][0]" + o20);
			}
			
			
			
			
			if(flag==2)
			{
			 g2.setColor(Color.green);
			 o20= "G";
			 System.out.println("orange[2][0]" + o20);
			}
			
			
			
			
			if(flag==3)
			{
			 g2.setColor(Color.blue);
			 o20= "B";
			 System.out.println("orange[2][0]" + o20);
			 
			}
			if(flag==4)
			{
			 g2.setColor(Color.white);
			 o20= "W";
			 System.out.println("orange[2][0]" + o20);
			 
			}
			
			if(flag==5)
			{
			 g2.setColor(Color.orange);
			 o20= "O";
			 System.out.println("orange[2][0]" + o20);
			 
			}
			
			if(flag==6)
			{
			 g2.setColor(Color.yellow);
			 o20= "Y";
			 System.out.println("orange[2][0]" + o20);
			 
			}
			
			
			
			
			
		 
		 g2.fill(rect43);
			
		}
		
			
		
		
		else if(nextbtncount==38)
		{
			
			if(flag==1)
			{
			 g2.setColor(Color.red);
			 o21= "R";
			 System.out.println("orange[2][1]" + o21);
			}
			
			
			
			
			if(flag==2)
			{
			 g2.setColor(Color.green);
			 o21= "G";
			 System.out.println("orange[2][1]" + o21);
			}
			
			
			
			
			if(flag==3)
			{
			 g2.setColor(Color.blue);
			 o21= "B";
			 System.out.println("orange[2][1]" + o21);
			 
			}
			if(flag==4)
			{
			 g2.setColor(Color.white);
			 o21= "W";
			 System.out.println("orange[2][1]" + o21);
			 
			}
			
			if(flag==5)
			{
			 g2.setColor(Color.orange);
			 o21= "O";
			 System.out.println("orange[2][1]" + o21);
			 
			}
			
			if(flag==6)
			{
			 g2.setColor(Color.yellow);
			o21= "Y";
			 System.out.println("orange[2][1]" + o21);
			 
			}
			
			
			
			
			
		 
		 g2.fill(rect44);
			
		}
		
		else if(nextbtncount==39)
		{
			
			if(flag==1)
			{
			 g2.setColor(Color.red);
			 o22= "R";
			 System.out.println("orange[2][2]" + o22);
			}
			
			
			
			
			if(flag==2)
			{
			 g2.setColor(Color.green);
			 o22= "R";
			 System.out.println("orange[2][2]" + o22);
			}
			
			
			
			
			if(flag==3)
			{
			 g2.setColor(Color.blue);
			 o22= "B";
			 System.out.println("orange[2][2]" + o22);
			 
			}
			if(flag==4)
			{
			 g2.setColor(Color.white);
			 o22= "W";
			 System.out.println("orange[2][2]" + o22);
			 
			}
			
			if(flag==5)
			{
			 g2.setColor(Color.orange);
			 o22= "O";
			 System.out.println("orange[2][2]" + o22);
			 
			}
			
			if(flag==6)
			{
			 g2.setColor(Color.yellow);
			 o22= "Y";
			 System.out.println("orange[2][2]" + o22);
			 
			}
			
			
			
			
			
		 
		 g2.fill(rect45);
			
		}
		
		
		//yellow
		
		
		else if(nextbtncount==40)
		{
		
			if(flag==1)
			{
			 g2.setColor(Color.red);
			 y00= "R";
			 System.out.println("yellow[0][0]" + y00);
			}
			
			
			
			
			if(flag==2)
			{
			 g2.setColor(Color.green);
			 y00= "G";
			 System.out.println("yellow[0][0]" + y00);
			 
			}
			
			
			
			
			if(flag==3)
			{
			 g2.setColor(Color.blue);
			 y00= "B";
			 System.out.println("yellow[0][0]" + y00);
			 
			}
			
			
			
			if(flag==4)
			{
			 g2.setColor(Color.white);
			 y00= "W";
			 System.out.println("yellow[0][0]" + y00);
			 
			}
			
			if(flag==5)
			{
			 g2.setColor(Color.orange);
			 y00= "O";
			 System.out.println("yellow[0][0]" + y00);
			 
			}
			
			if(flag==6)
			{
			 g2.setColor(Color.yellow);
			 y00= "Y";
			 System.out.println("yellow[0][0]" + y00);
			 
			}
			
			
			
			
			
			
			
		 g2.fill(rect46);
		 
		}
		
		
		else if(nextbtncount==41)
		{
			
			if(flag==1)
			{
			 g2.setColor(Color.red);
			 y01= "R";
			 System.out.println("yellow[0][1]" + y01);
			}
			
			
			
			
			if(flag==2)
			{
			 g2.setColor(Color.green);
			y01= "G";
			 System.out.println("yellow[0][1]" + y01);
			}
			
			
			
			
			if(flag==3)
			{
			 g2.setColor(Color.blue);
			 y01= "B";
			 System.out.println("yellow[0][1]" + y01);
			 
			}
			if(flag==4)
			{
			 g2.setColor(Color.white);
			  y01= "W";
			 System.out.println("yellow[0][1]" + y01);
			 
			}
			
			if(flag==5)
			{
			 g2.setColor(Color.orange);
			 y01= "O";
			 System.out.println("yellow[0][1]" + y01);
			 
			}
			
			if(flag==6)
			{
			 g2.setColor(Color.yellow);
			 y01= "Y";
			 System.out.println("yellow[0][1]" + y01);
			 
			}
			
			
			
			
			
		 
		 g2.fill(rect47);
			
		}
		
		
		
		else if(nextbtncount==42)
		{
			
			if(flag==1)
			{
			 g2.setColor(Color.red);
			 y02= "R";
			 System.out.println("yellow[0][2]" + o02);
			}
			
			
			
			
			if(flag==2)
			{
			 g2.setColor(Color.green);
			 y02= "G";
			 System.out.println("yellow[0]2]" + y02);
			}
			
			
			
			
			if(flag==3)
			{
			 g2.setColor(Color.blue);
			 y02= "B";
			 System.out.println("yellow[0][2]" + y02);
			 
			}
			if(flag==4)
			{
			 g2.setColor(Color.white);
			 y02= "W";
			 System.out.println("yellow[0][2]" + y02);
			 
			}
			
			if(flag==5)
			{
			 g2.setColor(Color.orange);
			 y02= "O";
			 System.out.println("yellow[0][2]" + y02);
			 
			}
			
			if(flag==6)
			{
			 g2.setColor(Color.yellow);
			 y02= "Y";
			 System.out.println("yellow[0][2]" + y02);
			 
			}
			
			
			
			
			
		 
		 g2.fill(rect48);
			
		}
		
		
			
		

		else if(nextbtncount==43)
		{
			
			if(flag==1)
			{
			 g2.setColor(Color.red);
			 y10= "R";
			 System.out.println("yellow[1][0]" + y10);
			}
			
			
			
			
			if(flag==2)
			{
			 g2.setColor(Color.green);
			y10= "G";
			 System.out.println("yellow[1][0]" + y10);
			}
			
			
			
			
			if(flag==3)
			{
			 g2.setColor(Color.blue);
			y10= "B";
			 System.out.println("yellow[1][0]" + y10);
			 
			}
			if(flag==4)
			{
			 g2.setColor(Color.white);
			 y10= "W";
			 System.out.println("yellow[1][0]" + y10);
			 
			}
			
			if(flag==5)
			{
			 g2.setColor(Color.orange);
			 y10= "O";
			 System.out.println("yellow[1][0]" + y10);
			 
			}
			
			if(flag==6)
			{
			 g2.setColor(Color.yellow);
			 y10= "Y";
			 System.out.println("yellow[1][0]" + y10);
			 
			}
			
			
			
			
			
		 
		 g2.fill(rect49);
			
		}
		
    
		/*
		

		else if(nextbtncount==49)
		{
			
			
			g2.setColor(Color.yellow);
			y11= "Y";
			 System.out.println("yellow[1][1]" + y11);
			
		 
		 g2.fill(rect50);
			
		}
		
		*/
		


		else if(nextbtncount==44)
		{
			
			if(flag==1)
			{
			 g2.setColor(Color.red);
			 y12= "R";
			 System.out.println("yellow[1][2]" + y12);
			}
			
			
			
			
			if(flag==2)
			{
			 g2.setColor(Color.green);
			 y12= "G";
			 System.out.println("yellow[1][2]" + y12);
			}
			
			
			
			
			if(flag==3)
			{
			 g2.setColor(Color.blue);
			 y12= "B";
			 System.out.println("yellow[1][2]" + y12);
			 
			}
			if(flag==4)
			{
			 g2.setColor(Color.white);
			y12= "W";
			 System.out.println("yellow[1][2]" + y12);
			 
			}
			
			if(flag==5)
			{
			 g2.setColor(Color.orange);
			 y12= "O";
			 System.out.println("yellow[1][2]" + y12);
			 
			}
			
			if(flag==6)
			{
			 g2.setColor(Color.yellow);
			 y12= "Y";
			 System.out.println("yellow[1][2]" + y12);
			 
			}
			
			
			
			
			
		 
		 g2.fill(rect51);
			
		}
			
		
		
		else if(nextbtncount==45)
		{
			
			if(flag==1)
			{
			 g2.setColor(Color.red);
			 y20= "R";
			 System.out.println("yellow[2][0]" + y20);
			}
			
			
			
			
			if(flag==2)
			{
			 g2.setColor(Color.green);
			 y20= "G";
			 System.out.println("yellow[2][0]" + y20);
			}
			
			
			
			
			if(flag==3)
			{
			 g2.setColor(Color.blue);
			 y20= "B";
			 System.out.println("yellow[2][0]" + y20);
			 
			}
			if(flag==4)
			{
			 g2.setColor(Color.white);
			 y20= "W";
			 System.out.println("yellow[2][0]" + y20);
			 
			}
			
			if(flag==5)
			{
			 g2.setColor(Color.orange);
			 y20= "O";
			 System.out.println("yellow[2][0]" + y20);
			 
			}
			
			if(flag==6)
			{
			 g2.setColor(Color.yellow);
			 y20= "Y";
			 System.out.println("yellow[2][0]" + y20);
			 
			}
			
			
			
			
			
		 
		 g2.fill(rect52);
			
		}
		
			
		
		
		else if(nextbtncount==46)
		{
			
			if(flag==1)
			{
			 g2.setColor(Color.red);
			 y21= "R";
			 System.out.println("yellow[2][1]" + y21);
			}
			
			
			
			
			if(flag==2)
			{
			 g2.setColor(Color.green);
			 y21= "G";
			 System.out.println("yellow[2][1]" + y21);
			}
			
			
			
			
			if(flag==3)
			{
			 g2.setColor(Color.blue);
			 y21= "B";
			 System.out.println("yellow[2][1]" + y21);
			 
			}
			if(flag==4)
			{
			 g2.setColor(Color.white);
			 y21= "W";
			 System.out.println("yellow[2][1]" + y21);
			 
			}
			
			if(flag==5)
			{
			 g2.setColor(Color.orange);
			 y21= "O";
			 System.out.println("yellow[2][1]" + y21);
			 
			}
			
			if(flag==6)
			{
			 g2.setColor(Color.yellow);
			y21= "Y";
			 System.out.println("yellow[2][1]" + y21);
			 
			}
			
			
			
			
			
		 
		 g2.fill(rect53);
			
		}
		
		else if(nextbtncount==47)
		{
			
			if(flag==1)
			{
			 g2.setColor(Color.red);
			 y22= "R";
			 System.out.println("yellow[2][2]" + y22);
			}
			
			
			
			
			if(flag==2)
			{
			 g2.setColor(Color.green);
			 y22= "G";
			 System.out.println("yellow[2][2]" + y22);
			}
			
			
			
			
			if(flag==3)
			{
			 g2.setColor(Color.blue);
			 y22= "B";
			 System.out.println("yellow[2][2]" + y22);
			 
			}
			if(flag==4)
			{
			 g2.setColor(Color.white);
			 y22= "W";
			 System.out.println("yellow[2][2]" + y22);
			 
			}
			
			if(flag==5)
			{
			 g2.setColor(Color.orange);
			 y22= "O";
			 System.out.println("yellow[2][2]" + y22);
			 
			}
			
			if(flag==6)
			{
			 g2.setColor(Color.yellow);
			 y22= "Y";
			 System.out.println("yellow[2][2]" + y22);
			 
			}
			
			
			
			
			
		 
		 g2.fill(rect54);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
			    Rectangle rectl1 = new Rectangle(145,185,120,6);
				g2.setColor(Color.BLACK);
				
				g2.fill(rectl1);
			
				Rectangle rectl2 = new Rectangle(145,225,240,4);
				g2.setColor(Color.BLACK);
				
				g2.fill(rectl2);
			
				
				Rectangle rectl3 = new Rectangle(145,305,240,4);
				g2.setColor(Color.BLACK);
				
				g2.fill(rectl3);
				
				
				
				Rectangle rectl4 = new Rectangle(145,345,120,4);
				g2.setColor(Color.BLACK);
				
				g2.fill(rectl4);
		
				
				
				Rectangle rectl4l = new Rectangle(145,265,120,4);
				g2.setColor(Color.BLACK);
				
				g2.fill(rectl4l);
			
				
				Rectangle rectl5 = new Rectangle(145,185,4,120);
				g2.setColor(Color.BLACK);
				
				g2.fill(rectl5);
				
				
				
				Rectangle rectl6 = new Rectangle(185,185,4,120);
				g2.setColor(Color.BLACK);
				
				g2.fill(rectl6);
				
				
				
				Rectangle rectl7 = new Rectangle(225,185,4,120);
				g2.setColor(Color.BLACK);
				
				g2.fill(rectl7);
				
				
				Rectangle rectl8 = new Rectangle(265,185,6,242);
				g2.setColor(Color.BLACK);
				
				g2.fill(rectl8);
				
				

			    Rectangle rectl11 = new Rectangle(145,345,120,4);
				g2.setColor(Color.BLACK);
				
				g2.fill(rectl11);
			
				Rectangle rectl12 = new Rectangle(145,385,120,4);
				g2.setColor(Color.BLACK);
				
				g2.fill(rectl12);
			
				
				Rectangle rectl13 = new Rectangle(145,425,120,4);
				g2.setColor(Color.BLACK);
				
				g2.fill(rectl13);
				
				
				Rectangle rectl14 = new Rectangle(185,185,4,240);
				g2.setColor(Color.BLACK);
				
				g2.fill(rectl14);
				
				
				Rectangle rectl15 = new Rectangle(225,185,4,240);
				g2.setColor(Color.BLACK);
				
				g2.fill(rectl15);
				
				Rectangle rectl16 = new Rectangle(145,185,6,240);
				g2.setColor(Color.BLACK);
				
				g2.fill(rectl16);
				
				
				
				Rectangle rectl18 =new Rectangle(145,305,124,4);
				g2.setColor(Color.BLACK);
				
				g2.fill(rectl18);
				
				
				

				
			    Rectangle rectl31 = new Rectangle(265,265,120,4);
				g2.setColor(Color.BLACK);
				
				g2.fill(rectl31);
			
				Rectangle rectl32 = new Rectangle(265,225,120,4);
				g2.setColor(Color.BLACK);
				
				g2.fill(rectl32);
			
				Rectangle rectl33 = new Rectangle(265,185,120,6);
				g2.setColor(Color.BLACK);
				
				g2.fill(rectl33);
				
				
				Rectangle rectl35 = new Rectangle(265,305,120,6);
				g2.setColor(Color.BLACK);
				
				g2.fill(rectl35);
				
				
				
				
				Rectangle rectl34 = new Rectangle(265,65,6,0);
				g2.setColor(Color.BLACK);
				
				g2.fill(rectl34);
				
				
				
				Rectangle rectl37 = new Rectangle(305,185,4,120);
				g2.setColor(Color.BLACK);
				
				g2.fill(rectl37);
				
				Rectangle rectl36 = new Rectangle(345,185,4,120);
				g2.setColor(Color.BLACK);
				
				g2.fill(rectl36);
				
				
				
				Rectangle rectl38 =new Rectangle(385,185,6,124);
				g2.setColor(Color.BLACK);
				
				g2.fill(rectl38);
				
			
				
				 Rectangle rectl21 = new Rectangle(145,65,120,6);
					g2.setColor(Color.BLACK);
					
					g2.fill(rectl21);
				
					Rectangle rectl22 = new Rectangle(145,105,120,4);
					g2.setColor(Color.BLACK);
					
					g2.fill(rectl22);
				
					
					Rectangle rectl23 = new Rectangle(145,145,120,4);
					g2.setColor(Color.BLACK);
			
					g2.fill(rectl23);
					
					
					Rectangle rectl24 = new Rectangle(145,65,6,240);
					g2.setColor(Color.BLACK);
					
					g2.fill(rectl24);
					
					
					Rectangle rectl25 = new Rectangle(265,65,6,240);
					g2.setColor(Color.BLACK);
					
					g2.fill(rectl25);
					
					Rectangle rectl26 = new Rectangle(185,65,4,240);
					g2.setColor(Color.BLACK);
					
					g2.fill(rectl26);
					
					
					
					Rectangle rectl28 =new Rectangle(225,65,4,240);
					g2.setColor(Color.BLACK);
					
					g2.fill(rectl28);
					
					
					

					
				    Rectangle rectl41 = new Rectangle(25,265,124,4);
					g2.setColor(Color.BLACK);
					
					g2.fill(rectl41);
				
					Rectangle rectl42 = new Rectangle(25,225,124,4);
					g2.setColor(Color.BLACK);
					
					g2.fill(rectl42);
				
					Rectangle rectl43 = new Rectangle(25,185,124,6);
					g2.setColor(Color.BLACK);
					
					g2.fill(rectl43);
					
					
					Rectangle rectl45 = new Rectangle(25,305,364,6);
					g2.setColor(Color.BLACK);
					
					g2.fill(rectl45);
					
					
					
					
					Rectangle rectl44 = new Rectangle(25,185,6,120);
					g2.setColor(Color.BLACK);
					
					g2.fill(rectl44);
					
					
					
					Rectangle rectl47 = new Rectangle(65,185,4,124);
					g2.setColor(Color.BLACK);
					
					g2.fill(rectl47);
					
					Rectangle rectl46 = new Rectangle(105,185,4,124);
					g2.setColor(Color.BLACK);
					
					g2.fill(rectl46);
					
					
					
					Rectangle rectl48 =new Rectangle(145,185,6,124);
					g2.setColor(Color.BLACK);
					
					g2.fill(rectl48);
					

				    Rectangle rectl51 = new Rectangle(145,425,124,6);
					g2.setColor(Color.BLACK);
					
					g2.fill(rectl51);
				
					Rectangle rectl52 = new Rectangle(145,465,124,4);
					g2.setColor(Color.BLACK);
					
					g2.fill(rectl52);
				
					Rectangle rectl53 = new Rectangle(145,505,124,4);
					g2.setColor(Color.BLACK);
					
					g2.fill(rectl53);
					
					
					Rectangle rectl54 = new Rectangle(145,545,124,6);
					g2.setColor(Color.BLACK);
					
					g2.fill(rectl54);
					
					
					
					
					Rectangle rectl55 = new Rectangle(145,425,6,120);
					g2.setColor(Color.BLACK);
					
					g2.fill(rectl55);
					
					
					
					Rectangle rectl57 = new Rectangle(185,425,4,124);
					g2.setColor(Color.BLACK);
					
					g2.fill(rectl57);
					
					Rectangle rectl56 = new Rectangle(225,425,4,124);
					g2.setColor(Color.BLACK);
					
					g2.fill(rectl56);
					
					
					
					Rectangle rectl58 =new Rectangle(265,425,6,124);
					g2.setColor(Color.BLACK);
					
					g2.fill(rectl58);
						
				
				
				
					
				
				
					
					
				
	}
	
}
