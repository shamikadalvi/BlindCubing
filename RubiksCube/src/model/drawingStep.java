package model;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class drawingStep extends JPanel

{
	
	
static int Cori;
static int P;
public static int rubcor[][]= new int[1][200];
static int data13;
	
	
public drawingStep()
{
	
	
	Border innerBorder = BorderFactory.createTitledBorder("Cube Steps");
	Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
	setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));
	
	
	
	
	setLayout(new GridLayout());
	GridBagConstraints gc =new GridBagConstraints();
	
	
	
	gc.weightx=1;
    gc.weighty=2;
    gc.gridx=0;
    gc.gridy=2;
    gc.fill=gc.NONE;
    gc.anchor=gc.LINE_END;
   
	
	
    System.out.println("rubcor");
    
    
    while((   ( (Cube.rubcor[0][P])==0)&&((Cube.rubcor[0][P+1])==0) )  ==false   )

    {

            Cube.data13=Cube.rubcor[0][P];
    //        System.out.println("data13--"+ Cube.data13);
      //      P=P+1;
    
     
            
            
            
            switch(Cube.data13)
            {

                    case 1:
                  	  System.out.print("ya"+"\t");
                  	 add(new JLabel("ya"),gc);
                  	  
     					 //R U’ R’ U’ R U R’ F’ R U R’ U’ R’ F R


     									
                      break;

                       case 3:
                      	 System.out.print("F"+"\t");
                      	add(new JLabel("F"),gc);
                  	
     					 break;

     						 case 33:
     				
     							 System.out.print("F' "+"\t");        
     							 add(new JLabel("F'"),gc);



                      				break;

                        case 7:
                      	  System.out.print("R"+"\t");
                      	 add(new JLabel("R"),gc);	         
     							break;

     					   case 77:
     						   System.out.print("R'"+"\t");
     						   add(new JLabel("R' "),gc);



     					  break;
     					
     					   case 5:
     						   System.out.print("D"+"\t");
     						   add(new JLabel("D"),gc);
     					  break;
     					
     					 case 55:
     						 System.out.print("D'"+"\t");
     						 add(new JLabel("D' "),gc);
     						break;
     				
     				   case 8:
     					   System.out.print("U"+"\t");
     					   add(new JLabel("U"),gc);         
     				  break;
     				
     				   case 88:
     					   System.out.print("U'"+"\t");
     					   add(new JLabel("U' "),gc);         
     				  break;
     				
     				   case 4:
     					   System.out.print("L"+"\t");
     					   add(new JLabel("L"),gc);        
     				  break;
     				
     				   case 44:
     					   System.out.print("L'"+"\t");
     					   add(new JLabel("L'"),gc);         
     				  break;
     				
     				  
     				    
                      }

                        //      gc.gridx++;
                              P=P+1;
	
              }
	
	/*
    gc.weightx=1;
    gc.weighty=5;
    gc.gridx=0;
    gc.gridy=4;
    gc.fill=gc.NONE;
   // gc.anchor=gc.LINE_START;
   // gc.insets= new Insets(0,0,0,5);
    add(new JLabel("ya : R U’ R’ U’ R U R’ F’ R U R’ U’ R’ F R"),gc);
	
    */
	     
      }
   



	
	
	}
