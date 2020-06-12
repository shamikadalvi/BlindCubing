


package model;

import java.sql.Connection;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.*;




public class Cube {

	
	public	static int ya= 1;
	public static int T= 2; 
	public static int F = 3;
	public static int FP= 33;
	public static int R = 7;
	public static int RP= 77;
	public static int U = 8;
	public static int UP= 88;
	public static int L = 4;
	public static int LP =44;
	public static int D = 5;
	public static int DP= 55;
	public  static int B = 6;
	public static int BP = 66;
	public static int Cori=0;
	public static int Edi=0;
	
   public static int flag=1;	
	
	
	static String[][] White;
	static String[][] Green;
	static String[][] Red;
	static String[][] Blue;
	static String[][] Orange;
	static String[][] Yellow;
	static String[][] PosCor;
	static String[][] PosEd;
	static String cor;
	static String ed;
	static String[][] cor1;
	static String[][] ed1;
	
	static String[][] ed0;
	static int P=0;
	static int M=0;
	static int data13;
	static int data14;
	static String [][] temp;
	static String [][] temp1;
	static String [][] temp2;
	static String data7;
	static String data8;
	static String data9;
	static int k;
	static int [] a;
	static int m;
	 static int n=0;
	 static int s=0;
	 public static int rubcor[][]= new int[1][200];
	 public static int rubed[][]= new int[1][200];
	 
	 
	 
	 
	 //public static draw draw = new draw();

	public static String[][] getColorWhite() {
		
		
			
			White = new String[3][3];
   
		   	
        	/*		
      
			White[0][0] = model.draw.w00;
			White[0][1] = model.draw.w01;
			White[0][2] = model.draw.w02;
			White[1][0] = model.draw.w10;
			White[1][1] = "W";          
			White[1][2] = model.draw.w12;
			White[2][0] = model.draw.w20;
			White[2][1] = model.draw.w21;
			White[2][2] = model.draw.w22;
			
			
             */
    
			
			
			White[0][0] = "B";
			White[0][1] = "Y";
			White[0][2] = "W";
			White[1][0] = "O";
			White[1][1] = "W";          
			White[1][2] = "W";
			White[2][0] = "R";
			White[2][1] = "W";
			White[2][2] = "O";
			
			
			
			return White;
			}
	
	public static String[][] getColorGreen() {
		
		
		
		Green = new String[3][3];
		
		
		/*
		Green[0][0] = model.draw.g00;
		Green[0][1] = model.draw.g01;
		Green[0][2] = model.draw.g02;
		Green[1][0] = model.draw.g10;
		Green[1][1] = "G";
		Green[1][2] = model.draw.g12;
		Green[2][0] = model.draw.g20;
		Green[2][1] = model.draw.g21;
		Green[2][2] = model.draw.g22;
        

          
         */
		
		
		Green[0][0] = "Y";
		Green[0][1] = "B";
		Green[0][2] = "Y";
		Green[1][0] = "B";
		Green[1][1] = "G";          
		Green[1][2] = "O";
		Green[2][0] = "R";
		Green[2][1] = "R";
		Green[2][2] = "R";
		
		
		
		return Green;
		}
	
	
	public  static String[][] getColorRed() {
		
		
		
		Red = new String[3][3];
		
		
		/*
		
		Red[0][0] = model.draw.r00;
		Red[0][1] = model.draw.r01;
		Red[0][2] = model.draw.r02;
		Red[1][0] = model.draw.r10;
		Red[1][1] = "R";
		Red[1][2] = model.draw.r12;
		Red[2][0] = model.draw.r20;
		Red[2][1] = model.draw.r21;
		Red[2][2] = model.draw.r22;

		*/
		
      
		
		Red[0][0] = "G";
		Red[0][1] = "G";
		Red[0][2] = "O";
		Red[1][0] = "G";
		Red[1][1] = "R";          
		Red[1][2] = "R";
		Red[2][0] = "G";
		Red[2][1] = "G";
		Red[2][2] = "W";
		
		
		
		
		return Red;
		}
	
	

	
	
    public static String[][] getColorBlue() {
		
		
		
    	Blue = new String[3][3];
		
    	/*
    	
    	Blue[0][0] = model.draw.b00;
    	Blue[0][1] = model.draw.b01;
    	Blue[0][2] = model.draw.b02;
    	Blue[1][0] = model.draw.b10;
    	Blue[1][1] = "B";
    	Blue[1][2]  = model.draw.b12;
    	Blue[2][0] = model.draw.b20;
    	Blue[2][1] = model.draw.b21;
    	Blue[2][2] = model.draw.b22;


       */
		
     
		
		
    	Blue[0][0] = "G";
    	Blue[0][1] = "G";
    	Blue[0][2] = "Y";
    	Blue[1][0] = "B";
    	Blue[1][1] = "B";          
    	Blue[1][2] = "Y";
    	Blue[2][0] = "O";
    	Blue[2][1] = "W";
    	Blue[2][2] = "R";	
		
		
		
		return Blue;
		}
	
	
	
  public static String[][] getColorOrange() {
		
		
		
	     Orange = new String[3][3];
		
        /*    
	        Orange[0][0] = model.draw.o00;
			Orange[0][1] = model.draw.o01;
			Orange[0][2] = model.draw.o02;
			Orange[1][0] = model.draw.o10;
			Orange[1][1] = "O";
			Orange[1][2] = model.draw.o12;
			Orange[2][0] = model.draw.o20;
			Orange[2][1] = model.draw.o21;
			Orange[2][2] = model.draw.o22;
          
			
			*/
        
        
		
	     Orange[0][0] = "O";
	     Orange[0][1] = "Y";
	     Orange[0][2] = "G";
	     Orange[1][0] = "B";
	     Orange[1][1] = "O";          
	     Orange[1][2] = "O";
	     Orange[2][0] = "B";
	     Orange[2][1] = "R";
	     Orange[2][2] = "B";	
			
		
		
		
		
		return Orange;
		}
	
	
  public static String[][] getColorYellow() {
		
		
		
	  Yellow = new String[3][3];
		
	     
       /*
	     Yellow[0][0] = model.draw.y00;
	     Yellow[0][1] = model.draw.y01;
	     Yellow[0][2] = model.draw.y02;
	     Yellow[1][0] = model.draw.y10;
	     Yellow[1][1] = "Y";
	     Yellow[1][2] = model.draw.y12;
	     Yellow[2][0] = model.draw.y20;
	     Yellow[2][1] = model.draw.y21;
	     Yellow[2][2] = model.draw.y22;

        
		
		*/
	
	  
	  
	  Yellow[0][0] = "W";
	  Yellow[0][1] = "Y";
	  Yellow[0][2] = "W";
	  Yellow[1][0] = "W";
	  Yellow[1][1] = "Y";          
	  Yellow[1][2] = "R";
	  Yellow[2][0] = "Y";
	  Yellow[2][1] = "O";
	  Yellow[2][2] = "B";	
	  
	  
	     
		return Yellow;
		}
	
	
  public static  void displayColorWhite() {
		
		
		
	  String[][] data3 = getColorWhite();
	     System.out.println(" White color " );
	     for (int i = 0; i < data3.length; i++)	 
	     {	 
	    	 for(int j=0;j< data3.length;j++)
	    	 {
	    		 System.out.print(data3[i][j]+"\t");
	    	 }
	    	 	System.out.print("\n");
	     } 	 
	     System.out.print("\n");
	}
		
  
  public static  void displayColorGreen() {
		
		
		
	  String[][] data3 = getColorGreen();
	     System.out.println(" Green color " );
	  
	     for (int i = 0; i < data3.length; i++)	 
	     {	 
	    	 for(int j=0;j< data3.length;j++)
	    	 {
	    		 System.out.print(data3[i][j]+"\t");
	    	 }
	    	 	System.out.print("\n");
	     } 	 
	     
	     System.out.print("\n");
	}
  
  public static  void displayColorRed() {
		
		
		
	  String[][] data3 = getColorRed();
	     System.out.println("Red color" );
	  
	     for (int i = 0; i < data3.length; i++)	 
	     {	 
	    	 for(int j=0;j< data3.length;j++)
	    	 {
	    		 System.out.print(data3[i][j]+"\t");
	    	 }
	    	 	System.out.print("\n");
	     } 	 
	     
	     System.out.print("\n");
	}
  
  public static  void displayColorBlue() {
		
		
		
	  String[][] data3 = getColorBlue();
	     System.out.println(" Blue color " );
	  
	     for (int i = 0; i < data3.length; i++)	 
	     {	 
	    	 for(int j=0;j< data3.length;j++)
	    	 {
	    		 System.out.print(data3[i][j]+"\t");
	    	 }
	    	 	System.out.print("\n");
	     } 	 
	     
	     System.out.print("\n");
	}
  

  public static  void displayColorOrange() {
		
		
		
	  String[][] data3 = getColorOrange();
	     System.out.println(" Orange color  " );
	  
	     for (int i = 0; i < data3.length; i++)	 
	     {	 
	    	 for(int j=0;j< data3.length;j++)
	    	 {
	    		 System.out.print(data3[i][j]+"\t");
	    	 }
	    	 	System.out.print("\n");
	     } 	
	     
	     System.out.print("\n");
	}
  
  public static  void displayColorYellow() {
		
		
		
	  String[][] data3 = getColorYellow();
	     System.out.println(" Yellow color  " );
	  
	     for (int i = 0; i < data3.length; i++)	 
	     {	 
	    	 for(int j=0;j< data3.length;j++)
	    	 {
	    		 System.out.print(data3[i][j]+"\t");
	    	 }
	    	 	System.out.print("\n");
	     } 	 
	}
  
  
  public static  void UpdateColorWhite() {
		
		
		
		//  String[][] data3 = getColorYellow();
		     System.out.println(" White color update  " );
		  
		     for (int i = 0; i < 3; i++)	 
		     {	 
		    	 for(int j=0;j< 3;j++)
		    	 {
		    		 System.out.print(White[i][j]+"\t");
		    	 }
		    	 	System.out.print("\n");
		     } 	 
		}
  
  public static  void UpdateColorGreen() {
		
		
		
		//  String[][] data3 = getColorYellow();
		     System.out.println(" Green color update " );
		  
		     for (int i = 0; i < 3; i++)	 
		     {	 
		    	 for(int j=0;j< 3;j++)
		    	 {
		    		 System.out.print(Green[i][j]+"\t");
		    	 }
		    	 	System.out.print("\n");
		     } 	 
		}
  
  
  
  
  
  
  
  public static  void UpdateColorRed() {
		
		
		
		//  String[][] data3 = getColorYellow();
		     System.out.println(" Red color  update" );
		  
		     for (int i = 0; i < 3; i++)	 
		     {	 
		    	 for(int j=0;j< 3;j++)
		    	 {
		    		 System.out.print(Red[i][j]+"\t");
		    	 }
		    	 	System.out.print("\n");
		     } 	 
		}
  
  
  
  public static  void UpdateColorBlue() {
		
		
		
		//  String[][] data3 = getColorYellow();
		     System.out.println(" Blue color update " );
		  
		     for (int i = 0; i < 3; i++)	 
		     {	 
		    	 for(int j=0;j< 3;j++)
		    	 {
		    		 System.out.print(Blue[i][j]+"\t");
		    	 }
		    	 	System.out.print("\n");
		     } 	 
		}
  
  
  public static  void UpdateColorOrange() {
		
		
		
		//  String[][] data3 = getColorYellow();
		     System.out.println(" Orange color update " );
		  
		     for (int i = 0; i < 3; i++)	 
		     {	 
		    	 for(int j=0;j< 3;j++)
		    	 {
		    		 System.out.print(Orange[i][j]+"\t");
		    	 }
		    	 	System.out.print("\n");
		     } 	 
		} 
  
  
  
  
  
  
  
  
  public static  void UpdateColorYellow() {
		
		
		
	//  String[][] data3 = getColorYellow();
	     System.out.println(" Yellow color  update" );
	  
	     for (int i = 0; i < 3; i++)	 
	     {	 
	    	 for(int j=0;j< 3;j++)
	    	 {
	    		 System.out.print(Yellow[i][j]+"\t");
	    	 }
	    	 	System.out.print("\n");
	     } 	 
	}
  
  
  
  
  public static String CheckPosCor() {
		
		
		
	  String[][] data4 = getColorOrange();
	  String[][] data5 = getColorWhite();
	  String[][] data6 = getColorBlue();
		
	 PosCor = new String [1][3];
	 PosCor[0][0] = data4 [0][0];
	 PosCor[0][1] = data5 [0][0];
 	 PosCor[0][2] = data6 [0][2];
	  
 	  cor=  (PosCor[0][0] +  PosCor[0][1] + PosCor[0][2] );
 	 
 	 
 	// System.out.println(" Corner Position  " );
 	 
	  for(int j=0;j<3;j++)
	  {
		//  System.out.print(PosCor[0][j]+"\t");
	  }
	   
	 // System.out.println(cor  + "\t" + "corner case ");
		
		
		return cor;
		}
  
  
  
  
  public static String CheckPosEd() {
		
		
		
	 
		
	 PosEd = new String [1][2];
	 PosEd[0][0] = White [1][2];
	 PosEd[0][1] = Red [0][1];
 	
	  
 	  ed=  (PosEd[0][0] +  PosEd[0][1] );
 	 
 	 
 	// System.out.println(" Corner Position  " );
 	 
	  
		
		
		return ed;
		}
  
  
  
  
  
  
  
  
  
  
  
  
  
  public static String getPosCor(String cube) {
	     
	    
	     cor1 = new String[1][3];
	     
	     
	     
	     
	     
	     switch (cube) 
	     {
	         case "BYO":
	        	 
	        	 System.out.println("1"  + "\t" + " DF' ya   FD'  ");
	        	 k=1;
	        	 
	        	 
	        	 rubcor[0][n+1]= D;
	             rubcor[0][n+2]=FP;
	             rubcor[0][n+3]=ya;
	             rubcor[0][n+4]=F;
	             rubcor[0][n+5]=DP;
	          
	             n=n+5;
	        	  
	        	 temp = new String[1][3];
	        	
	        	
	        	   temp[0][0] = Blue[2][2];
	        	   Blue[2][2] = Orange[0][0];
	               Orange[0][0] = temp[0][0];
	               
	             
	               
	               temp[0][1] = Yellow[2][0];
	              Yellow[2][0]= White[0][0];
	               White[0][0]= temp[0][1];
	               
	               
	              
	               
	               
	              temp[0][2] = Orange[2][0];
	               Orange[2][0] = Blue[0][2];
	               Blue[0][2]=  temp [0][2];
	               
	        	 
	               
	              cor1[0][0] = temp [0][0];
	          	 cor1[0][1] =  temp [0][1];
	           	  cor1[0][2] = temp [0][2];
	               
	               
	           	 
	           	for(int j=0;j<3;j++)
	      	  {
	      		//  System.out.print(cor1[0][j]+"\t");
	      	  }
	           	  
	           	data7=  (cor1[0][0] +  cor1[0][1] + cor1[0][2] );
	           	  
	           	  
	               
	             break;
	             
	             
	             
             case "OBY":
	        	 
	        	 System.out.println("1"  + "\t" + " DF2R' ya   RF2D'  ");
	        	 k=1;
	        	 
	        	 
	        	 

	             rubcor[0][n+1]= D;
	             rubcor[0][n+2]=F;
	             rubcor[0][n+3]=F;
	             rubcor[0][n+4]=RP;
	             rubcor[0][n+5]=ya;
	             rubcor[0][n+6]=R;
	             rubcor[0][n+7]=F;
	             rubcor[0][n+8]=F;
	             rubcor[0][n+9]=DP;
	              n=n+9;
	        	  
	        	 temp = new String[1][3];
	        	
	        	
	        	   temp[0][0] = Orange[2][0];
	        	   Orange[2][0] = Orange[0][0];
	               Orange[0][0] = temp[0][0];
	               
	             
	               
	               temp[0][1] = Blue[2][2];
	              Blue[2][2]= White[0][0];
	               White[0][0]= temp[0][1];
	               
	               
	              
	               
	               
	              temp[0][2] = Yellow[2][0];
	               Yellow[2][0] = Blue[0][2];
	               Blue[0][2]=  temp [0][2];
	               
	        	 
	               
	              cor1[0][0] = temp [0][0];
	          	 cor1[0][1] =  temp [0][1];
	           	  cor1[0][2] = temp [0][2];
	               
	               
	           	 
	           	for(int j=0;j<3;j++)
	      	  {
	      		//  System.out.print(cor1[0][j]+"\t");
	      	  }
	           	  
	           	data7=  (cor1[0][0] +  cor1[0][1] + cor1[0][2] );
	           	  
	           	  
	               
	             break;
	             
	             
	             
	             
	             
       case "YOB":
	        	 
	        	 System.out.println("1"  + "\t" + " D2 ya  D2  ");
	        	 k=1;
	        	  
	        	 
	        	  rubcor[0][n+1]=D;
	              rubcor[0][n+2]=D;
	              rubcor[0][n+3]=ya;
	              rubcor[0][n+4]=D;
	              rubcor[0][n+5]=D;
	                 
	               n=n+5;
	        	 
	        	 temp = new String[1][3];
	        	
	        	
	        	   temp[0][0] = Yellow[2][0];
	        	   Yellow[2][0] = Orange[0][0];
	               Orange[0][0] = temp[0][0];
	               
	             
	               
	               temp[0][1] = Orange[2][0];
	               Orange[2][0]= White[0][0];
	               White[0][0]= temp[0][1];
	               
	               
	              
	               
	               
	              temp[0][2] = Blue[2][2];
	               Blue[2][2] = Blue[0][2];
	               Blue[0][2]=  temp [0][2];
	               
	        	 
	               
	              cor1[0][0] = temp [0][0];
	          	 cor1[0][1] =  temp [0][1];
	           	  cor1[0][2] = temp [0][2];
	               
	               
	           	 
	           	for(int j=0;j<3;j++)
	      	  {
	      		//  System.out.print(cor1[0][j]+"\t");
	      	  }
	           	  
	           	data7=  (cor1[0][0] +  cor1[0][1] + cor1[0][2] );
	           	  
	           	  
	               
	             break;
	                  
	           
	             
	             
         case "WRB":
	        	 
	        	 System.out.println("2"  + "\t" + " R2 ya   R2  ");
	        	 k=2;
	        	  
	        	 
	        	    rubcor[0][n+1]=R;
	                rubcor[0][n+2]=R;
	                rubcor[0][n+3]=ya;
	                rubcor[0][n+4]=R;
	                rubcor[0][n+5]=R;
	                 n=n+5;
	        	 
	        	 temp = new String[1][3];
	        	
	        	
	        	   temp[0][0] = White[0][2];
	        	   White[0][2] = Orange[0][0];
	               Orange[0][0] = temp[0][0];
	               
	             
	               
	               temp[0][1] = Red[0][2];
	              Red[0][2]= White[0][0];
	               White[0][0]= temp[0][1];
	               
	               
	              
	               
	               
	               temp[0][2] = Blue[0][0];
	               Blue[0][0] = Blue[0][2];
	               Blue[0][2]=  temp [0][2];
	               
	        	 
	               
	              cor1[0][0] = temp [0][0];
	          	  cor1[0][1] =  temp [0][1];
	           	  cor1[0][2] = temp [0][2];
	               
	               
	           
	           	for(int j=0;j<3;j++)
	      	  {
	     // 		  System.out.print(cor1[0][j]+"\t");
	      	  }
	           	  
	           	data7=  (cor1[0][0] +  cor1[0][1] + cor1[0][2] );
	          
	             break;
	      
         case "RBW":
        	 
        	 System.out.println("2"  + "\t" + " R'F ya   F'R  ");
        	 
        	  k=2;
        	 temp = new String[1][3];
        	
        
        	 
        	 
        	  rubcor[0][n+1]=RP;
              rubcor[0][n+2]=F;
              rubcor[0][n+3]=ya;
              rubcor[0][n+4]=FP;
              rubcor[0][n+5]=R;
              n=n+5;
        	 
        	   temp[0][0] = Red[0][2];
        	   Red[0][2] = Orange[0][0];
               Orange[0][0] = temp[0][0];
               
             
               
               temp[0][1] = Blue[0][0];
              Blue[0][0]= White[0][0];
               White[0][0]= temp[0][1];
               
               
              
               
               
               temp[0][2] = White[0][2];
               White[0][2] = Blue[0][2];
               Blue[0][2]=  temp [0][2];
               
        	 
               
              cor1[0][0] = temp [0][0];
          	  cor1[0][1] =  temp [0][1];
           	  cor1[0][2] = temp [0][2];
               
               
           
           	for(int j=0;j<3;j++)
      	  {
     // 		  System.out.print(cor1[0][j]+"\t");
      	  }
           	  
           	data7=  (cor1[0][0] +  cor1[0][1] + cor1[0][2] );
          
             break;
           
	             
             
             
         case "BWR":
	        	 
	        	 System.out.println("2"  + "\t" + " RD' ya   DR'  ");
	        	 k=2;
	        	  
	        	 rubcor[0][n+1]=R;
                 rubcor[0][n+2]=DP;
                 rubcor[0][n+3]=ya;
                 rubcor[0][n+4]=D;
                 rubcor[0][n+5]=RP;

                  n=n+5; 
	        	 
	        	 temp = new String[1][3];
	        	
	        	
	        	   temp[0][0] = Blue[0][0];
	        	   Blue[0][0] = Orange[0][0];
	               Orange[0][0] = temp[0][0];
	               
	             
	               
	               temp[0][1] = White[0][2];
	              White[0][2]= White[0][0];
	               White[0][0]= temp[0][1];
	               
	               
	              
	               
	               
	               temp[0][2] = Red[0][2];
	               Red[0][2] = Blue[0][2];
	               Blue[0][2]=  temp [0][2];
	               
	        	 
	               
	              cor1[0][0] = temp [0][0];
	          	  cor1[0][1] =  temp [0][1];
	           	  cor1[0][2] = temp [0][2];
	               
	               
	           
	           	for(int j=0;j<3;j++)
	      	  {
	     // 		  System.out.print(cor1[0][j]+"\t");
	      	  }
	           	  
	           	data7=  (cor1[0][0] +  cor1[0][1] + cor1[0][2] );
	          
	             break;
             
             
	             
	           	
         case "OYG":
        	 
        	 
        	 
        	 System.out.println("3"  + "\t" + " F' ya   F  ");
        	 k=3;
       	  
        	 
        	 
        	 rubcor[0][n+1]=FP;
             rubcor[0][n+2]=ya;
             rubcor[0][n+3]=F;
             n=n+3;  
        	 
        	 temp = new String[1][3];
        	
        	
        	   temp[0][0] = Orange[2][2];
        	   Orange[2][2] = Orange[0][0];
               Orange[0][0] = temp[0][0];
               
             
               
               temp[0][1] = Yellow[0][0];
               Yellow[0][0]= White[0][0];
               White[0][0]= temp[0][1];
               
               
              
               
               
               temp[0][2] = Green[2][0];
               Green[2][0] = Blue[0][2];
               Blue[0][2]=  temp [0][2];
               
        	 
               
              cor1[0][0] = temp [0][0];
          	  cor1[0][1] =  temp [0][1];
           	  cor1[0][2] = temp [0][2];
               
               
           
           	for(int j=0;j<3;j++)
      	  {
      		//  System.out.print(cor1[0][j]+"\t");
      	  }
           	  
           	data7=  (cor1[0][0] +  cor1[0][1] + cor1[0][2] );
          
           	
           	break;
           	
           	
           	
         	
         case "YGO":
        	 
        	 
        	 
        	 System.out.println("3"  + "\t" + " D ya   D'  ");
        	 k=3;
        	 
        	 rubcor[0][n+1]=D;
             rubcor[0][n+2]=ya;
             rubcor[0][n+3]=DP;
             n=n+3;
       	  
        	 temp = new String[1][3];
        	
        	
        	   temp[0][0] = Yellow[0][0];
        	   Yellow[0][0] = Orange[0][0];
               Orange[0][0] = temp[0][0];
               
             
               
               temp[0][1] = Green[2][0];
               Green[2][0]= White[0][0];
               White[0][0]= temp[0][1];
               
               
              
               
               
               temp[0][2] = Orange[2][2];
               Orange[2][2] = Blue[0][2];
               Blue[0][2]=  temp [0][2];
               
        	 
               
              cor1[0][0] = temp [0][0];
          	  cor1[0][1] =  temp [0][1];
           	  cor1[0][2] = temp [0][2];
               
               
           
           	for(int j=0;j<3;j++)
      	  {
      		//  System.out.print(cor1[0][j]+"\t");
      	  }
           	  
           	data7=  (cor1[0][0] +  cor1[0][1] + cor1[0][2] );
          
           	
           	break;
           	
           	
        	
         case "GOY":
        	 
        	 
        	 
        	 System.out.println("3"  + "\t" + " F2R' ya   RF2  ");
        	 k=3;
        	 
        	 rubcor[0][n+1]=F;
             rubcor[0][n+2]=F;
             rubcor[0][n+3]=RP;
             rubcor[0][n+4]=ya;
             rubcor[0][n+5]=R;
             rubcor[0][n+6]=F;
             rubcor[0][n+7]=F;

             n=n+7;
       	  
        	 temp = new String[1][3];
        	
        	
        	   temp[0][0] = Green[2][0];
        	   Green[2][0] = Orange[0][0];
               Orange[0][0] = temp[0][0];
               
             
               
               temp[0][1] = Orange[2][2];
               Orange[2][2]= White[0][0];
               White[0][0]= temp[0][1];
               
               
              
               
               
               temp[0][2] = Yellow[0][0];
               Yellow[0][0] = Blue[0][2];
               Blue[0][2]=  temp [0][2];
               
        	 
               
              cor1[0][0] = temp [0][0];
          	  cor1[0][1] =  temp [0][1];
           	  cor1[0][2] = temp [0][2];
               
               
           
           	for(int j=0;j<3;j++)
      	  {
      		//  System.out.print(cor1[0][j]+"\t");
      	  }
           	  
           	data7=  (cor1[0][0] +  cor1[0][1] + cor1[0][2] );
          
           	
           	break;
           	
           	
           		
           	
	           	
         case "WOG":
        	 
        	 
        	 System.out.println("4"  + "\t" + " F2  ya   F2  ");
        	 k=4;
        	 
        	 rubcor[0][n+1]=F;
             rubcor[0][n+2]=F;
             rubcor[0][n+3]=ya;
             rubcor[0][n+4]=F;
             rubcor[0][n+5]=F;
              n=n+5;
       	  
        	 temp = new String[1][3];
        	
        	
        	   temp[0][0] = White[2][0];
        	   White[2][0] = Orange[0][0];
               Orange[0][0] = temp[0][0];
               
             
               
               temp[0][1] = Orange[0][2];
               Orange[0][2]= White[0][0];
               White[0][0]= temp[0][1];
               
               
              
               
               
               temp[0][2] = Green[0][0];
               Green[0][0] = Blue[0][2];
               Blue[0][2]=  temp [0][2];
               
        	 
               
              cor1[0][0] = temp [0][0];
          	  cor1[0][1] =  temp [0][1];
           	  cor1[0][2] = temp [0][2];
               
               
           
           	for(int j=0;j<3;j++)
      	  {
      		  //System.out.print(cor1[0][j]+"\t");
      	  }
           	  
           	data7=  (cor1[0][0] +  cor1[0][1] + cor1[0][2] );
          
          	  
           	break;
           	
           	
           	
   case "GWO":
        	 
        	 
        	 System.out.println("4"  + "\t" + " FR' ya   RF'  ");
        	 k=4;
       	  
        	    rubcor[0][n+1]=F;
                rubcor[0][n+2]=RP;
                rubcor[0][n+3]=ya;
                rubcor[0][n+4]=R;
                rubcor[0][n+5]=FP;  
                n=n+5;
        	 
        	 temp = new String[1][3];
        	
        	
        	   temp[0][0] = Green[0][0];
        	   Green[0][0] = Orange[0][0];
               Orange[0][0] = temp[0][0];
               
             
               
               temp[0][1] = White[2][0];
               White[2][0]= White[0][0];
               White[0][0]= temp[0][1];
               
               
              
               
               
               temp[0][2] = Orange[0][2];
               Orange[0][2] = Blue[0][2];
               Blue[0][2]=  temp [0][2];
               
        	 
               
              cor1[0][0] = temp [0][0];
          	  cor1[0][1] =  temp [0][1];
           	  cor1[0][2] = temp [0][2];
               
               
           
           	for(int j=0;j<3;j++)
      	  {
      		  //System.out.print(cor1[0][j]+"\t");
      	  }
           	  
           	data7=  (cor1[0][0] +  cor1[0][1] + cor1[0][2] );
          
          	  
           	break;
           	
           	
   case "OGW":
  	 
  	 
  	 System.out.println("4"  + "\t" + " F'D  ya   D'F  ");
  	 k=4;
 	  
  	 
  	 rubcor[0][n+1]=FP; 
     rubcor[0][n+2]=D; 
     rubcor[0][n+3]=ya; 
     rubcor[0][n+4]=DP; 
     rubcor[0][n+5]=F; 
     n=n+5;
  	 temp = new String[1][3];
  	
  	
  	   temp[0][0] = Orange[0][2];
  	   Orange[0][2] = Orange[0][0];
        Orange[0][0] = temp[0][0];
         
       
         
         temp[0][1] = Green[0][0];
         Green[0][0]= White[0][0];
         White[0][0]= temp[0][1];
         
         
        
         
         
         temp[0][2] = White[2][0];
         White[2][0] = Blue[0][2];
         Blue[0][2]=  temp [0][2];
         
  	 
         
        cor1[0][0] = temp [0][0];
    	  cor1[0][1] =  temp [0][1];
     	  cor1[0][2] = temp [0][2];
         
         
     
     	for(int j=0;j<3;j++)
	  {
		  //System.out.print(cor1[0][j]+"\t");
	  }
     	  
     	data7=  (cor1[0][0] +  cor1[0][1] + cor1[0][2] );
    
    	  
     	break;	
           	
           	
           	
           	
  /////the trick case///         	
           	
        
     	
     	
     	
   case "OWB":
   case "BOW":
   case "WBO":	   
	   
	   k=5;

	  	 
  	   if(Green[2][2].equals("G") && Red[2][0].equals("R") && Yellow[0][2].equals("Y"))  //1 
    	 {
    		 if(Green[2][0].equals("G") && Orange[2][2].equals("O") && Yellow[0][0].equals("Y")) //2 
    		 {

    			 if(Yellow[2][2].equals("Y") && Red[2][2].equals("R") && Blue[2][0].equals("B"))  //3 
    			 
    			 
    			 		{
    	         
    				 		if(Green[0][2].equals("G") && Red[0][0].equals("R") && White[2][2].equals("W")) //4
    				 			
    				 		{
    				 			
    				 			
    				 			if(White[2][0].equals("W") && Orange[0][2].equals("O") && Green[0][0].equals("G")) //5
    				 			{
    				 				
    				 				if(White[0][2].equals("W") && Red[0][2].equals("R") && Blue[0][0].equals("B"))//6
    				 					
    				 				{
    				 					
    				 					System.out.println("1"  + "\t" + " D2 ya  D2  ");
    				 		        	 k=1;
    				 		        	 
    				 		        	    rubcor[0][n+1]=D; 
    		           			            rubcor[0][n+2]=D; 
    		                      		    rubcor[0][n+3]=ya; 
    		                      			rubcor[0][n+4]=D; 
    		                      			rubcor[0][n+5]=D; 
    		                      			n=n+5;
    		                   
    		                           	    k=1;
    				 		        	  
    				 		        	 temp = new String[1][3];
    				 		        	
    				 		        	
    				 		        	   temp[0][0] = Yellow[2][0];
    				 		        	   Yellow[2][0] = Orange[0][0];
    				 		               Orange[0][0] = temp[0][0];
    				 		               
    				 		             
    				 		               
    				 		               temp[0][1] = Orange[2][0];
    				 		               Orange[2][0]= White[0][0];
    				 		               White[0][0]= temp[0][1];
    				 		               
    				 		               
    				 		              
    				 		               
    				 		               
    				 		              temp[0][2] = Blue[2][2];
    				 		               Blue[2][2] = Blue[0][2];
    				 		               Blue[0][2]=  temp [0][2];
    				 		               
    				 		        	 
    				 		               
    				 		              cor1[0][0] = temp [0][0];
    				 		          	 cor1[0][1] =  temp [0][1];
    				 		           	  cor1[0][2] = temp [0][2];
    				 		               
    				 		               
    				 		           	 
    				 		           	for(int j=0;j<3;j++)
    				 		      	  {
    				 		      		//  System.out.print(cor1[0][j]+"\t");
    				 		      	  }
    				 		           	  
    				 		           	data7=  (cor1[0][0] +  cor1[0][1] + cor1[0][2] );
    				 		           	  
    				 		           	  
    				 		               
    				 		             break;
    				 		                  
    				 		           
    				 		             
    				 				}
    				 				
    				 				else //6
    				 				{
    				 					 System.out.println("2"  + "\t" + " R2 ya   R2  ");
    				 		        	 k=2;
    				 		        	  
    				 		        	 
    				 		        	     rubcor[0][n+1]=R;
    				                         rubcor[0][n+2]=R;
    				                         rubcor[0][n+3]=ya;
    				                         rubcor[0][n+4]=R;
    				                         rubcor[0][n+5]=R;
    				                         n=n+5;
    				 		        	 
    				 		        	 temp = new String[1][3];
    				 		        	
    				 		        	
    				 		        	   temp[0][0] = White[0][2];
    				 		        	   White[0][2] = Orange[0][0];
    				 		               Orange[0][0] = temp[0][0];
    				 		               
    				 		             
    				 		               
    				 		               temp[0][1] = Red[0][2];
    				 		              Red[0][2]= White[0][0];
    				 		               White[0][0]= temp[0][1];
    				 		               
    				 		               
    				 		              
    				 		               
    				 		               
    				 		               temp[0][2] = Blue[0][0];
    				 		               Blue[0][0] = Blue[0][2];
    				 		               Blue[0][2]=  temp [0][2];
    				 		               
    				 		        	 
    				 		               
    				 		              cor1[0][0] = temp [0][0];
    				 		          	  cor1[0][1] =  temp [0][1];
    				 		           	  cor1[0][2] = temp [0][2];
    				 		               
    				 		               
    				 		           
    				 		           	for(int j=0;j<3;j++)
    				 		      	  {
    				 		     // 		  System.out.print(cor1[0][j]+"\t");
    				 		      	  }
    				 		           	  
    				 		           	data7=  (cor1[0][0] +  cor1[0][1] + cor1[0][2] );
    				 		          
    				 		             break;
    				 		      
    				 					
    				 				}
    				 				
    				 				
    				 			}
    				 			
    				 			
    				 			else //5 
    				 			{
    				 				
    				 				 System.out.println("4"  + "\t" + " F2  ya   F2  ");
    				 	        	 k=4;
    				 	       	  
    				 	        	 
    				 	        	  rubcor[0][n+1]=F;
    			                       rubcor[0][n+2]=F;
    			                       rubcor[0][n+3]=ya;
    			                       rubcor[0][n+4]=F;
    			                       rubcor[0][n+5]=F;
    			                          n=n+5;
    				 	        	 temp = new String[1][3];
    				 	        	
    				 	        	
    				 	        	   temp[0][0] = White[2][0];
    				 	        	   White[2][0] = Orange[0][0];
    				 	               Orange[0][0] = temp[0][0];
    				 	               
    				 	             
    				 	               
    				 	               temp[0][1] = Orange[0][2];
    				 	               Orange[0][2]= White[0][0];
    				 	               White[0][0]= temp[0][1];
    				 	               
    				 	               
    				 	              
    				 	               
    				 	               
    				 	               temp[0][2] = Green[0][0];
    				 	               Green[0][0] = Blue[0][2];
    				 	               Blue[0][2]=  temp [0][2];
    				 	               
    				 	        	 
    				 	               
    				 	              cor1[0][0] = temp [0][0];
    				 	          	  cor1[0][1] =  temp [0][1];
    				 	           	  cor1[0][2] = temp [0][2];
    				 	               
    				 	               
    				 	           
    				 	           	for(int j=0;j<3;j++)
    				 	      	  {
    				 	      		  //System.out.print(cor1[0][j]+"\t");
    				 	      	  }
    				 	           	  
    				 	           	data7=  (cor1[0][0] +  cor1[0][1] + cor1[0][2] );
    				 	          
    				 	          	  
    				 	           	break;
    				 	           	
    				 			}
    				 			
    				 		}
    				 		
    				 		else//4
    				 			
    				 		{
    				 			 System.out.println("7"  + "\t" + " R2D'  ya DR2   ");
    				 	      	 
    				 	      	 temp = new String[1][3];
    				 	       	
    				 	       	
    				 	      	 
    				 	      	 
    				 	      	   rubcor[0][n+1]=R;
				                   rubcor[0][n+2]=R;
				                   rubcor[0][n+3]=DP;
				                   rubcor[0][n+4]=ya;
				                   rubcor[0][n+5]=D;
				                   rubcor[0][n+6]=R;
				                   rubcor[0][n+7]=R;
				                  
                 
                     
				                     n=n+7;
    				 	      	 
    				 	      	 
    				 	    	   temp[0][0] = White[2][2];
    				 	    	   White[2][2] = Orange[0][0];
    				 	          Orange[0][0] = temp[0][0];
    				 	           
    				 	         
    				 	           
    				 	           temp[0][1] = Green[0][2];
    				 	           Green[0][2]= White[0][0];
    				 	           White[0][0]= temp[0][1];
    				 	           
    				 	           
    				 	          
    				 	           
    				 	           
    				 	           temp[0][2] = Red[0][0];
    				 	           Red[0][0] = Blue[0][2];
    				 	           Blue[0][2]=  temp [0][2];
    				 	           
    				 	    	 
    				 	           
    				 	          cor1[0][0] = temp [0][0];
    				 	      	  cor1[0][1] =  temp [0][1];
    				 	       	  cor1[0][2] = temp [0][2];
    				 	           
    				 	           
    				 	       
    				 	       	for(int j=0;j<3;j++)
    				 	   	  {
    				 	   	//	  System.out.print(cor1[0][j]+"\t");
    				 	   	  }
    				 	       	  
    				 	       	data7=  (cor1[0][0] +  cor1[0][1] + cor1[0][2] );
    				 	      break;
    				 	      	  
    				 	      
    				 	      
    				 	   
    				 			
    				 		}
    			 		} 
    			 
    			 
    			 //if ends
    			 
    			 
    			 				else  //3 
    			 			{
    			
    				 
    			 						System.out.println("5"  + "\t" + "  D' ya D   ");
                	 
                	  
    			 							temp = new String[1][3];
    			 							
    			 						    rubcor[0][n+1]=DP;
    			 		                      rubcor[0][n+2]=ya;
    			 		                      rubcor[0][n+3]=D;
    			 		                   
    			 		                    n=n+3;
                	
                	
    			 								temp[0][0] =  Yellow[2][2];
    			 								Yellow[2][2]=Orange[0][0];
    			 								Orange[0][0]= temp[0][0];
                       
                     
                       
    			 								temp[0][1] = Blue[2][0];
    			 								Blue[2][0]= White[0][0];
    			 								White[0][0]= temp[0][1];
                      
                       
                       
    			 								temp[0][2] = Red[2][2];
    			 								Red[2][2]= Blue[0][2];
    			 								Blue[0][2]=   temp[0][2];
                       
                	 
                       
    			 								cor1[0][0] = temp [0][0];
    			 								cor1[0][1] =  temp [0][1];
    			 								cor1[0][2] = temp [0][2];
                       
                       
                   
    			 									for(int j=0;j<3;j++)
    			 									{
//      							        		  	System.out.print(cor1[0][j]+"\t");
    			 									}
                   	  
    			 										data7=  (cor1[0][0] +  cor1[0][1] + cor1[0][2] );
        			 
    			 				} //else ends
        			 
    				 
    				 
    				 
    			 } //if ends
    			 
    			 
    			 
    		
    		 
    		 else  //2
    			 
    		 {
    			 
    			 
    			 
    			 System.out.println("5"  + "\t" + "  D ya D'   ");
            	 
             	  
            	 temp = new String[1][3];
            	
            	 rubcor[0][n+1]=D;
		          rubcor[0][n+2]=ya;
		          rubcor[0][n+3]=DP;
		               
            		   n=n+3;
            	 
            	 
            	   temp[0][0] =   Yellow[0][0];
            	   Yellow[0][0]=Orange[0][0];
            	   Orange[0][0]= temp[0][0];
                   
                 
                   
                   temp[0][1] = Green[2][0];
            	   Green[2][0]= White[0][0];
            	   White[0][0]= temp[0][1];
                  
                   
                   
                   temp[0][2] = Orange[2][2];
            	   Orange[2][2]= Blue[0][2];
            	   Blue[0][2]=   temp[0][2];
                   
            	 
                   
                  cor1[0][0] = temp [0][0];
              	  cor1[0][1] =  temp [0][1];
               	  cor1[0][2] = temp [0][2];
                   
                   
               
               	for(int j=0;j<3;j++)
          	  {
//          		  System.out.print(cor1[0][j]+"\t");
          	  }
               	  
               	data7=  (cor1[0][0] +  cor1[0][1] + cor1[0][2] );
    			 
    		 }
    			 
    		 
    	 }
    		 
     		 
    	 else //1
    	 {	 
    		 
    	 System.out.println("5"  + "\t" + "   ya    ");
    	 
      	  
    	 temp = new String[1][3];
    	
    	
    	 rubcor[0][n+1]=ya;
	       n=n+1;
    	 
    	 
    	   temp[0][0] =   Yellow[0][2];
    	   Yellow[0][2]=Orange[0][0];
    	   Orange[0][0]= temp[0][0];
           
         
           
           temp[0][1] = Red[2][0];
    	   Red[2][0]= White[0][0];
    	   White[0][0]= temp[0][1];
          
           
           
           temp[0][2] = Green[2][2];
    	   Green[2][2]= Blue[0][2];
    	   Blue[0][2]=   temp[0][2];
           
    	 
           
          cor1[0][0] = temp [0][0];
      	  cor1[0][1] =  temp [0][1];
       	  cor1[0][2] = temp [0][2];
           
           
       
       	for(int j=0;j<3;j++)
  	  {
//  		  System.out.print(cor1[0][j]+"\t");
  	  }
       	  
       	data7  = (cor1[0][0] +  cor1[0][1] + cor1[0][2] );
       
      
    	 }
       	
       	
       	break;



     	
     	
   
           	
    
           	
           	
    case "BRY":
        	 
        	 
        	 System.out.println("6"  + "\t" + " R  ya R'   ");
        	 k=6;
        	 temp = new String[1][3];
        	 
             rubcor[0][n+1]=R;
             rubcor[0][n+2]=ya;
             rubcor[0][n+3]=RP;
              n=n+3;
         	
         	
      	   temp[0][0] = Blue[2][0];
      	   Blue[2][0] = Orange[0][0];
            Orange[0][0] = temp[0][0];
             
           
             
             temp[0][1] = Red[2][2];
             Red[2][2]= White[0][0];
             White[0][0]= temp[0][1];
             
             
            
             
             
             temp[0][2] = Yellow[2][2];
             Yellow[2][2] = Blue[0][2];
             Blue[0][2]=  temp [0][2];
             
      	 
             
            cor1[0][0] = temp [0][0];
        	  cor1[0][1] =  temp [0][1];
         	  cor1[0][2] = temp [0][2];
             
             
         
         	for(int j=0;j<3;j++)
    	  {
  //  		  System.out.print(cor1[0][j]+"\t");
    	  }
         	  
         	data7=  (cor1[0][0] +  cor1[0][1] + cor1[0][2] );
        break;
        
        
        
        
    case "RYB":
   	 
   	 
   	 System.out.println("6"  + "\t" + " R2F  ya F'R2   ");
   	 k=6;
   	 temp = new String[1][3];
    	
    	
   	 
     rubcor[0][n+1]=R;
     rubcor[0][n+2]=R;
     rubcor[0][n+3]=F;
     rubcor[0][n+4]=ya;
     rubcor[0][n+5]=FP;
     rubcor[0][n+6]=R;
     rubcor[0][n+7]=R;
     n=n+7; 
   	 
   	 
 	   temp[0][0] = Red[2][2];
 	   Red[2][2] = Orange[0][0];
       Orange[0][0] = temp[0][0];
        
      
        
        temp[0][1] = Yellow[2][2];
        Yellow[2][2]= White[0][0];
        White[0][0]= temp[0][1];
        
        
       
        
        
        temp[0][2] = Blue[2][0];
        Blue[2][0] = Blue[0][2];
        Blue[0][2]=  temp [0][2];
        
 	 
        
       cor1[0][0] = temp [0][0];
   	  cor1[0][1] =  temp [0][1];
    	  cor1[0][2] = temp [0][2];
        
        
    
    	for(int j=0;j<3;j++)
	  {
//  		  System.out.print(cor1[0][j]+"\t");
	  }
    	  
    	data7=  (cor1[0][0] +  cor1[0][1] + cor1[0][2] );
   break;
        
        
        
        
	
case "YBR":
	 
	 
	 System.out.println("6"  + "\t" + " D'  ya  D   ");
	 
	 k=6;
	 
	 temp = new String[1][3];
	
	 
	 rubcor[0][n+1]=DP;
     rubcor[0 ][n+2]=ya;
     rubcor[0][n+3]=D;
     n=n+3;
    
	
	   temp[0][0] = Yellow[2][2];
	   Yellow[2][2] = Orange[0][0];
   Orange[0][0] = temp[0][0];
    
  
    
    temp[0][1] = Blue[2][0];
    Blue[2][0]= White[0][0];
    White[0][0]= temp[0][1];
    
    
   
    
    
    temp[0][2] = Red[2][2];
    Red[2][2] = Blue[0][2];
    Blue[0][2]=  temp [0][2];
    
	 
    
   cor1[0][0] = temp [0][0];
	  cor1[0][1] =  temp [0][1];
	  cor1[0][2] = temp [0][2];
    
    

	for(int j=0;j<3;j++)
 {
//  		  System.out.print(cor1[0][j]+"\t");
 }
	  
	data7=  (cor1[0][0] +  cor1[0][1] + cor1[0][2] );
break;


   
        
        
        
        	  
    case "RWG":
   	 
   	 
   	 System.out.println("7"  + "\t" + " F  ya F'   ");
   	 k=7;
   	 temp = new String[1][3];
    	
    	
   	rubcor[0][n+1]=F;
    rubcor[0][n+2]=ya;
    rubcor[0][n+3]=FP;
    n=n+3;
   	 
   	 
 	   temp[0][0] = Red[0][0];
 	   Red[0][0] = Orange[0][0];
       Orange[0][0] = temp[0][0];
        
      
        
        temp[0][1] = White[2][2];
        White[2][2]= White[0][0];
        White[0][0]= temp[0][1];
        
        
       
        
        
        temp[0][2] = Green[0][2];
        Green[0][2] = Blue[0][2];
        Blue[0][2]=  temp [0][2];
        
 	 
        
       cor1[0][0] = temp [0][0];
   	  cor1[0][1] =  temp [0][1];
    	  cor1[0][2] = temp [0][2];
        
        
    
    	for(int j=0;j<3;j++)
	  {
	//	  System.out.print(cor1[0][j]+"\t");
	  }
    	  
    	data7=  (cor1[0][0] +  cor1[0][1] + cor1[0][2] );
   break;
   	  
   
   
    case "WGR":
    	k=7;
      	 
      	 
      	 System.out.println("7"  + "\t" + " R2D'  ya DR2   ");
      	 
      	 temp = new String[1][3];
       	
      	 
      	 rubcor[0][n+1]=R;
         rubcor[0][n+2]=R;
         rubcor[0][n+3]=DP;
         rubcor[0][n+4]=ya;
         rubcor[0][n+5]=D;
         rubcor[0][n+6]=R;
          rubcor[0][n+7]=R;
       n=n+7;
      	 
       	
    	   temp[0][0] = White[2][2];
    	   White[2][2] = Orange[0][0];
          Orange[0][0] = temp[0][0];
           
         
           
           temp[0][1] = Green[0][2];
           Green[0][2]= White[0][0];
           White[0][0]= temp[0][1];
           
           
          
           
           
           temp[0][2] = Red[0][0];
           Red[0][0] = Blue[0][2];
           Blue[0][2]=  temp [0][2];
           
    	 
           
          cor1[0][0] = temp [0][0];
      	  cor1[0][1] =  temp [0][1];
       	  cor1[0][2] = temp [0][2];
           
           
       
       	for(int j=0;j<3;j++)
   	  {
   	//	  System.out.print(cor1[0][j]+"\t");
   	  }
       	  
       	data7=  (cor1[0][0] +  cor1[0][1] + cor1[0][2] );
      break;
      	  
      
      
   
      
	  
    case "GRW":
   	 
   	 
   	 System.out.println("7"  + "\t" + " R'  ya R   ");
   	 k=7;
   	 
   	 temp = new String[1][3];
    	
    	
   	 
     rubcor[0][n+1]=RP;
     rubcor[0][n+2]=ya;
     rubcor[0][n+3]=R;
     n=n+3;
   	 
 	   temp[0][0] = Green[0][2];
 	   Green[0][2] = Orange[0][0];
       Orange[0][0] = temp[0][0];
        
      
        
        temp[0][1] = Red[0][0];
        Red[0][0]= White[0][0];
        White[0][0]= temp[0][1];
        
        
       
        
        
        temp[0][2] = White[2][2];
        White[2][2] = Blue[0][2];
        Blue[0][2]=  temp [0][2];
        
 	 
        
       cor1[0][0] = temp [0][0];
   	  cor1[0][1] =  temp [0][1];
    	  cor1[0][2] = temp [0][2];
        
        
    
    	for(int j=0;j<3;j++)
	  {
	//	  System.out.print(cor1[0][j]+"\t");
	  }
    	  
    	data7=  (cor1[0][0] +  cor1[0][1] + cor1[0][2] );
   break;
   
   
   
   
   
   
   
    	
    case "YRG":
      	 
      	 
      	 System.out.println("8"  + "\t" + "   ya    ");
      	 k=8;
      	 
      	 
      	 
      	 temp = new String[1][3];
      	 
      	rubcor[0][n+1]=ya;
        n=n+1;
       	
       	
    	   temp[0][0] = Yellow[0][2];
    	   Yellow[0][2] = Orange[0][0];
          Orange[0][0] = temp[0][0];
           
         
           
           temp[0][1] = Red[2][0];
           Red[2][0]= White[0][0];
           White[0][0]= temp[0][1];
           
           
          
           
           
           temp[0][2] = Green[2][2];
           Green[2][2] = Blue[0][2];
           Blue[0][2]=  temp [0][2];
           
    	 
           
          cor1[0][0] = temp [0][0];
      	  cor1[0][1] =  temp [0][1];
       	  cor1[0][2] = temp [0][2];
           
           
       
       	for(int j=0;j<3;j++)
   	  {
   		//  System.out.print(cor1[0][j]+"\t");
   	  }
       	  
       	data7=  (cor1[0][0] +  cor1[0][1] + cor1[0][2] );
     break; 
      	  
       	
     
 	
    case "RGY":
      	 
      	 
      	 System.out.println("8"  + "\t" + " RF  ya F'R'   ");
      	 k=8;
      	 
      	 rubcor[0][n+1]=R;
         rubcor[0][n+2]=F;
         rubcor[0][n+3]=ya;
         rubcor[0][n+4]=FP;
         rubcor[0][n+5]=RP;
         n=n+5;
      	 
      	 temp = new String[1][3];
       	
       	
    	   temp[0][0] = Red[2][0];
    	   Red[2][0] = Orange[0][0];
          Orange[0][0] = temp[0][0];
           
         
           
           temp[0][1] = Green[2][2];
            Green[2][2]= White[0][0];
           White[0][0]= temp[0][1];
           
           
          
           
           
           temp[0][2] = Yellow[0][2];
           Yellow[0][2] = Blue[0][2];
           Blue[0][2]=  temp [0][2];
           
    	 
           
          cor1[0][0] = temp [0][0];
      	  cor1[0][1] =  temp [0][1];
       	  cor1[0][2] = temp [0][2];
           
           
       
       	for(int j=0;j<3;j++)
   	  {
   		//  System.out.print(cor1[0][j]+"\t");
   	  }
       	  
       	data7=  (cor1[0][0] +  cor1[0][1] + cor1[0][2] );
     break; 
      	  
           	
        
    case "GYR":
     	 
     	 
     	 System.out.println("8"  + "\t" + " R'D'  ya DR   ");
     	 k=8;
     	 
     	 temp = new String[1][3];
      	
     	 
     	 rubcor[0][n+1]=RP;
         rubcor[0][n+2]=DP;
         rubcor[0][n+3]=ya;
         rubcor[0][n+4]=D;
         rubcor[0][n+5]=R;
         n=n+5;
        		
      	
   	   temp[0][0] = Green[2][2];
   	   Green[2][2] = Orange[0][0];
         Orange[0][0] = temp[0][0];
          
        
          
          temp[0][1] = Yellow[0][2];
           Yellow[0][2]= White[0][0];
          White[0][0]= temp[0][1];
          
          
         
          
          
          temp[0][2] = Red[2][0];
          Red[2][0] = Blue[0][2];
          Blue[0][2]=  temp [0][2];
          
   	 
          
         cor1[0][0] = temp [0][0];
     	  cor1[0][1] =  temp [0][1];
      	  cor1[0][2] = temp [0][2];
          
          
      
      	for(int j=0;j<3;j++)
  	  {
  		//  System.out.print(cor1[0][j]+"\t");
  	  }
      	  
      	data7=  (cor1[0][0] +  cor1[0][1] + cor1[0][2] );
    break; 
     	  
          	  
	     }
	     return data7;
	     
	     
	     
	     
	}
  
  
  
  
  
  public static String getPosEd(String cube1) {
	     
	    
	     ed1 = new String[1][2];
	     
	     switch (cube1) 
	     {
	         case "OG":
	        	 
	        	 System.out.println("1"  + "\t" + " d'L  T   L'd  ");
	        	 k=1;
	        	  
	        	 temp2 = new String[1][2];
	        
	        	 
	        	 
	        	 rubed[0][s+1]=UP;
	             rubed[0][s+2]=F;
	             rubed[0][s+3]=U;
	             rubed[0][s+4]=T;
	             rubed[0][s+5]=UP;
				 rubed[0][s+6]=FP;
				 rubed[0][s+7]=U;
			 
             
             s=s+7;
	        	
	        	
	        	   temp2[0][0] = Orange[1][2];
	        	   Orange[1][2] = White[1][2];
	               White[1][2] = temp2[0][0];
	               
	             
	               
	               temp2[0][1] = Green[1][0];
	              Green[1][0]= Red[0][1];
	               Red[0][1]= temp2[0][1];
	               
	               
	              
	               
	               
	              
	               
	        	 
	               
	              ed1[0][0] = temp2 [0][0];
	          	  ed1[0][1] =  temp2 [0][1];
	           	  
	               
	               
	       
	           	  
	           	data9=  (ed1[0][0] +  ed1[0][1]  );
	           	  
	           	  
	               
	             break;
	             
	             
	             
              case "GO":
	        	 
	        	 System.out.println("1"  + "\t" + " L'  T   L  ");
	        	 k=1;
	        	  
	        	 temp2 = new String[1][2];
	        	 
	        	    rubed[0][s+1]=LP;
	                rubed[0][s+2]=T;
	                rubed[0][s+3]=L;
	                s=s+3;
	        	
	        	
	        	   temp2[0][0] = Green[1][0];
	        	   Green[1][0] = White[1][2];
	               White[1][2] = temp2[0][0];
	               
	             
	               
	               temp2[0][1] = Orange[1][2];
	              Orange[1][2]= Red[0][1];
	               Red[0][1]= temp2[0][1];
	               
	               
	              
	               
	               
	              
	               
	        	 
	               
	              ed1[0][0] = temp2 [0][0];
	          	  ed1[0][1] =  temp2 [0][1];
	           	  
	               
	               
	       
	           	  
	           	data9=  (ed1[0][0] +  ed1[0][1]  );
	            
	           	  
	           	  
	               
	             break;
	             
	             
	             
	             
              case "YO":
 	        	 
 	        	 System.out.println("2"  + "\t" + " L2  T   L2  ");
 	        	 k=2;
 	        	  
 	        	 temp2 = new String[1][2];
 	        	
 	        	
 	               rubed[0][s+1]=L;
	               rubed[0][s+2]=L;
	               rubed[0][s+3]=T;
	               rubed[0][s+4]=L;
	               rubed[0][s+5]=L;  
	               s=s+5;
 	        	 
 	        	 
 	        	 
 	        	   temp2[0][0] = Yellow[1][0];
 	        	   Yellow[1][0] = White[1][2];
 	               White[1][2] = temp2[0][0];
 	               
 	             
 	               
 	               temp2[0][1] = Orange[2][1];
 	              Orange[2][1]= Red[0][1];
 	               Red[0][1]= temp2[0][1];
 	               
 	               
 	              
 	               
 	               
 	              
 	               
 	        	 
 	               
 	              ed1[0][0] = temp2 [0][0];
 	          	  ed1[0][1] =  temp2 [0][1];
 	           	  
 	               
 	               
 	       
 	           	  
 	           	data9=  (ed1[0][0] +  ed1[0][1]  );
 	            
 	           	  
 	           	  
 	               
 	             break;    
	             
	             
	      
 	            
              case "OY":
 	        	 
 	        	 System.out.println("2"  + "\t" + " LdL'   T  Ld'L'   ");
 	        	 k=2;
 	        	  
 	        	 temp2 = new String[1][2];
 	        	
 	        	
 	        	  rubed[0][s+1]=L;
	              rubed[0][s+2]=U;
	              rubed[0][s+3]=BP;
	              rubed[0][s+4]=UP;
	              rubed[0][s+5]=T;
	              rubed[0][s+6]=U;
	              rubed[0][s+7]=B;
				  rubed[0][s+8]=UP;
				  rubed[0][s+9]=LP;
				 
	                  s=s+9; 
 	        	 
 	        	 
 	        	   temp2[0][0] = Orange[2][1];
 	        	   Orange[2][1] = White[1][2];
 	               White[1][2] = temp2[0][0];
 	               
 	             
 	               
 	               temp2[0][1] = Yellow[1][0];
 	              Yellow[1][0]= Red[0][1];
 	               Red[0][1]= temp2[0][1];
 	               
 	               
 	              
 	               
 	               
 	              
 	               
 	        	 
 	               
 	              ed1[0][0] = temp2 [0][0];
 	          	  ed1[0][1] =  temp2 [0][1];
 	           	  
 	               
 	               
 	       
 	           	  
 	           	data9=  (ed1[0][0] +  ed1[0][1]  );
 	            
 	           	  
 	           	  
 	               
 	             break;   
 	             
 	             
 	             
 	             
              case "YG":
  	        	 
  	        	 System.out.println("3"  + "\t" + " D'L2   T   L2'D  ");
  	        	 k=3;
  	        	  
  	        	 temp2 = new String[1][2];
  	        	
  	        	
  	        	 
  	           rubed[0][s+1]=DP;
	              rubed[0][s+2]=L;
	              rubed[0][s+3]=L;
	              rubed[0][s+4]=T;
	              rubed[0][s+5]=L;
	              rubed[0][s+6]=L;
	              rubed[0][s+7]=D;
	              s=s+7;
  	        	 
  	        	 
  	        	 
  	        	   temp2[0][0] = Yellow[0][1];
  	        	   Yellow[0][1] = White[1][2];
  	               White[1][2] = temp2[0][0];
  	               
  	             
  	               
  	               temp2[0][1] = Green[2][1];
  	              Green[2][1]= Red[0][1];
  	               Red[0][1]= temp2[0][1];
  	               
  	               
  	              
  	               
  	               
  	              
  	               
  	        	 
  	               
  	              ed1[0][0] = temp2 [0][0];
  	          	  ed1[0][1] =  temp2 [0][1];
  	           	  
  	               
  	               
  	       
  	           	  
  	           	data9=  (ed1[0][0] +  ed1[0][1]  );
  	            
  	           	  
  	           	  
  	               
  	             break;   
  	             
 	             
              case "GY":
   	        	 
   	        	 System.out.println("3"  + "\t" + " D'LdL'   T   Ld'L'D ");
   	        	 k=3;
   	        	  
   	        	 temp2 = new String[1][2];
   	        	
   	        	
   	        	 
   	             rubed[0][s+1]=DP;
	              rubed[0][s+2]=L;
	              rubed[0][s+3]=U;
	              rubed[0][s+4]=BP;
	              rubed[0][s+5]=UP;
	              rubed[0][s+6]=T;
	              rubed[0][s+7]=U;
	              rubed[0][s+8]=B;
	              rubed[0][s+9]=UP;
				  rubed[0][s+10]=LP;
				  rubed[0][s+11]=D;
	

                    s=s+11;
   	        	 
   	        	 
   	        	   temp2[0][0] = Green[2][1];
   	        	   Green[2][1] = White[1][2];
   	               White[1][2] = temp2[0][0];
   	               
   	             
   	               
   	               temp2[0][1] = Yellow[0][1];
   	              Yellow[0][1]= Red[0][1];
   	               Red[0][1]= temp2[0][1];
   	               
   	               
   	              
   	               
   	               
   	              
   	               
   	        	 
   	               
   	              ed1[0][0] = temp2 [0][0];
   	          	  ed1[0][1] =  temp2 [0][1];
   	           	  
   	               
   	               
   	       
   	           	  
   	           	data9=  (ed1[0][0] +  ed1[0][1]  );
   	            
   	           	  
   	           	  
   	               
   	             break;    
 	             
 	             
	             
   	             
              case "RW":
              case "WR":  	 
            	  
            	  
     k=4;
            	  
            	     
            	     
            	     if(White[1][0].equals("W") && Orange[0][1].equals("O") )    //1
            	    	 
            	    	 
            	     {
            	    	 
            	    	 if(Green[1][0].equals("G") && Orange[1][2].equals("O"))  //2
            	    		 
            	    	 {
            	    		 
            	    		 if(Blue[1][2].equals("B") && Orange[1][0].equals("O"))  //3
            	    		 {
            	    			 
            	    			 
            	    			 
            	    			 if(Yellow[1][0].equals("Y") && Orange[2][1].equals("O")) //4
            	    			 {
            	    				 
            	    				 if(Yellow[0][1].equals("Y") && Green[2][1].equals("G")) //5
            	    				 {
            	    					 
            	    				      if(Yellow[2][1].equals("Y") && Blue[2][1].equals("B")) //6
            	    				    	  
            	    				      {
            	    				    	  if(Green[1][2].equals("G") && Red[1][0].equals("R")) //7 
            	    				    	  {
            	    				    		  
            	    				    		  if(Blue[1][0].equals("B") && Red[1][2].equals("R"))//8 
            	    				    		  {
            	    				    			  
            	    				    			  
            	    				    			  if(Yellow[1][2].equals("Y") && Red[2][1].equals("R"))//9
            	    				    			  {
            	    				    				  
            	    				    				  
            	    				    				  
            	    				    				  if(White[2][1].equals("W") && Green[0][1].equals("G"))
            	    				    				  {
            	    				    					  
            	    				    					  
            	    				    					  System.out.println("12"  + "\t" + "   l2D'l2  T  l2Dl2    ");
            	    				    		   	        	 k=12;
            	    				    		   	        	 
            	    				    		   	        	 
            	    				    		   	        	rubed[0][s+1]=R;
            	                                                  rubed[0][s+2]=R;
            	                                                  rubed[0][s+3]=UP;
            	                                                  rubed[0][s+4]=R;
            	                                                  rubed[0][s+5]=R;
            	                                                  rubed[0][s+6]=T;
            	                                                  rubed[0][s+7]=R;
            	                                                  rubed[0][s+8]=R;
            	                                                  rubed[0][s+9]=U;
            	                                                  rubed[0][s+10]=R;
            	                                                  rubed[0][s+11]=R;
            	                                                  s=s+11;
            	    				    		   	        	  
            	    				    		   	        	 temp2 = new String[1][2];
            	    				    		   	        	
            	    				    		   	        	
            	    				    		   	        	     temp2[0][0] = White[0][1];
            	    				    		   	        	    White[0][1] = White[1][2];
            	    				    		   	                 White[1][2] = temp2[0][0];
            	    				    		   	               
            	    				    		   	             
            	    				    		   	               
            	    				    		   	                temp2[0][1] = Blue[0][1];
            	    				    		   	               Blue[0][1]= Red[0][1];
            	    				    		   	                Red[0][1]= temp2[0][1];
            	    				    		   	               
            	    				    		   	               
            	    				    		   	              
            	    				    		   	               
            	    				    		   	               
            	    				    		   	              
            	    				    		   	               
            	    				    		   	        	 
            	    				    		   	               
            	    				    		   	              ed1[0][0] = temp2 [0][0];
            	    				    		   	          	  ed1[0][1] =  temp2 [0][1];
            	    				    		   	           	  
            	    				    		   	               
            	    				    		   	               
            	    				    		   	       
            	    				    		   	           	  
            	    				    		   	           	data9=  (ed1[0][0] +  ed1[0][1]  );
            	    				    		   	            
            	    				    		   	           	  
            	    				    		   	           	  
            	    				    		   	               
            	    				    		   	             break;  
            	    				    		  	             
            	    				    		   	             
            	    				    					  
            	    				    					  
            	    				    					  
            	    				    					  
            	    				    				  }
            	    				    				  
            	    				    				  else
            	    				    				  {
            	    				    					  
            	    				    					  System.out.println("11"  + "\t" + "   l2Dl2  T  l2D'l2    ");
            	    				    		  	        	 k=11;
            	    				    		  	        	  
            	    				    		  	        	 temp2 = new String[1][2];
            	    				    		  	        	
            	    				    		  	        	 
            	    				    		  	        	 
            	    				    		  	              rubed[0][s+1]=R;
            	                                                  rubed[0][s+2]=R;
            	                                                  rubed[0][s+3]=U;
            	                                                  rubed[0][s+4]=R;
            	                                                  rubed[0][s+5]=R;
            	                                                  rubed[0][s+6]=T;
            	                                                  rubed[0][s+7]=R;
            	                                                  rubed[0][s+8]=R;
            	                                                  rubed[0][s+9]=UP;
            	                                                  rubed[0][s+10]=R;
            	                                                  rubed[0][s+11]=R;
            	                                                 s=s+11;              
            	    				    		  	        	
            	    				    		  	        	     temp2[0][0] = White[2][1];
            	    				    		  	        	    White[2][1] = White[1][2];
            	    				    		  	                 White[1][2] = temp2[0][0];
            	    				    		  	               
            	    				    		  	             
            	    				    		  	               
            	    				    		  	                temp2[0][1] = Green[0][1];
            	    				    		  	               Green[0][1]= Red[0][1];
            	    				    		  	                Red[0][1]= temp2[0][1];
            	    				    		  	               
            	    				    		  	               
            	    				    		  	              
            	    				    		  	               
            	    				    		  	               
            	    				    		  	              
            	    				    		  	               
            	    				    		  	        	 
            	    				    		  	               
            	    				    		  	              ed1[0][0] = temp2 [0][0];
            	    				    		  	          	  ed1[0][1] =  temp2 [0][1];
            	    				    		  	           	  
            	    				    		  	               
            	    				    		  	               
            	    				    		  	       
            	    				    		  	           	  
            	    				    		  	           	data9=  (ed1[0][0] +  ed1[0][1]  );
            	    				    		  	            
            	    				    		  	           	  
            	    				    		  	           	  
            	    				    		  	               
            	    				    		  	             break;  
            	    				    		 	             
            	    				    		  	             
            	    				    					  
            	    				    					  
            	    				    				  }
            	    				    				  
            	    				    			  }
            	    				    			  
            	    				    			  else //9
            	    				    			  {
            	    				    				  
            	    				    				  System.out.println("7"  + "\t" + " D2L2   T   L2D2    ");
            	    				     	        	 k=7;
            	    				     	        	  
            	    				     	        	 temp2 = new String[1][2];
            	    				     	        	
            	    				     	        	
            	    				     	        	 
            	    				     	        	 rubed[0][s+1]=D;
                                                         rubed[0][s+2]=D;
                                                         rubed[0][s+3]=L;
                                                         rubed[0][s+4]=L;
                                                         rubed[0][s+5]=T;
                                                         rubed[0][s+6]=L;
                                                         rubed[0][s+7]=L;
                                                         rubed[0][s+8]=D;
                                                         rubed[0][s+9]=D;
                                                         s=s+9;
            	    				     	        	 
            	    				     	        	 
            	    				     	        	   temp2[0][0] = Yellow[1][2];
            	    				                        Yellow[1][2] = White[1][2];
            	    				     	               White[1][2] = temp2[0][0];
            	    				     	               
            	    				     	             
            	    				     	               
            	    				     	               temp2[0][1] = Red[2][1];
            	    				     	              Red[2][1]= Red[0][1];
            	    				     	               Red[0][1]= temp2[0][1];
            	    				     	               
            	    				     	               
            	    				     	              
            	    				     	               
            	    				     	               
            	    				     	              
            	    				     	               
            	    				     	        	 
            	    				     	               
            	    				     	              ed1[0][0] = temp2 [0][0];
            	    				     	          	  ed1[0][1] =  temp2 [0][1];
            	    				     	           	  
            	    				     	               
            	    				     	               
            	    				     	       
            	    				     	           	  
            	    				     	           	data9=  (ed1[0][0] +  ed1[0][1]  );
            	    				     	            
            	    				     	           	  
            	    				     	           	  
            	    				     	               
            	    				     	             break;  
            	    				    			  }
            	    				    			  
            	    				    			  
            	    				    			  
            	    				    			  
            	    				    		  }
            	    				    		  
            	    				    		  else  //8
            	    				    		  {
            	    				    			  System.out.println("9"  + "\t" + "  d2L'  T  Ld2     ");
            	    				    	        	 k=9;
            	    				    	        	  
            	    				    	        	 temp2 = new String[1][2];
            	    				    	        	 
            	    				    	        	 
            	    				    	        	 
            	    				    	          rubed[0][s+1]=U;
   	                                                  rubed[0][s+2]=U;
   	                                                  rubed[0][s+3]=RP;
   	                                                  rubed[0][s+4]=U;
   	                                                  rubed[0][s+5]=U;
   	                                                  rubed[0][s+6]=T;
   	                                                  rubed[0][s+7]=U;
   													  rubed[0][s+8]=U;
   													  rubed[0][s+9]=R;
   													  rubed[0][s+10]=U;
   													  rubed[0][s+11]=U;
   	                                                   s=s+11;
            	    				    	        	
            	    				    	        	
            	    				    	        	     temp2[0][0] = Blue[1][0];
            	    				                        Blue[1][0] = White[1][2];
            	    				    	                 White[1][2] = temp2[0][0];
            	    				    	               
            	    				    	             
            	    				    	               
            	    				    	                temp2[0][1] = Red[1][2];
            	    				    	                Red[1][2]= Red[0][1];
            	    				    	                Red[0][1]= temp2[0][1];
            	    				    	               
            	    				    	               
            	    				    	              
            	    				    	               
            	    				    	               
            	    				    	              
            	    				    	               
            	    				    	        	 
            	    				    	               
            	    				    	              ed1[0][0] = temp2 [0][0];
            	    				    	          	  ed1[0][1] =  temp2 [0][1];
            	    				    	           	  
            	    				    	               
            	    				    	               
            	    				    	       
            	    				    	           	  
            	    				    	           	data9=  (ed1[0][0] +  ed1[0][1]  );
            	    				    	            
            	    				    	           	  
            	    				    	           	  
            	    				    	               
            	    				    	             break;  
            	    				    			  
            	    				    		  }
												  
												 
            	    				    	  }
            	    				    	  
            	    				    	  
            	    				    	  else  //7
            	    				    		  
            	    				    	  {
            	    				    		  
            	    				    		  System.out.println("10"  + "\t" + "  d2L  T  L'd2     ");
            	    				 	        	 k=10;
            	    				 	        	  
            	    				 	        	 temp2 = new String[1][2];
            	    				 	        	
            	    				 	        	
            	    				 	        	   rubed[0][s+1]=U;
                                                       rubed[0][s+2]=U;
                                                       rubed[0][s+3]=R;
                                                       rubed[0][s+4]=U;
                                                       rubed[0][s+5]=U;
                                                       rubed[0][s+6]=T;
                                                       rubed[0][s+7]=U;
                                                       rubed[0][s+8]=U;
     												  rubed[0][s+9]=RP;
     												  rubed[0][s+10]=U;
     												  rubed[0][s+11]=U;
                                                      s=s+11;
            	    				 	        	 
            	    				 	        	 
            	    				 	        	     temp2[0][0] = Green[1][2];
            	    				 	        	    Green[1][2] = White[1][2];
            	    				 	                 White[1][2] = temp2[0][0];
            	    				 	               
            	    				 	             
            	    				 	               
            	    				 	                temp2[0][1] = Red[1][0];
            	    				 	                Red[1][0]= Red[0][1];
            	    				 	                Red[0][1]= temp2[0][1];
            	    				 	               
            	    				 	               
            	    				 	              
            	    				 	               
            	    				 	               
            	    				 	              
            	    				 	               
            	    				 	        	 
            	    				 	               
            	    				 	              ed1[0][0] = temp2 [0][0];
            	    				 	          	  ed1[0][1] =  temp2 [0][1];
            	    				 	           	  
            	    				 	               
            	    				 	               
            	    				 	       
            	    				 	           	  
            	    				 	           	data9=  (ed1[0][0] +  ed1[0][1]  );
            	    				 	            
            	    				 	           	  
            	    				 	           	  
            	    				 	               
            	    				 	             break;  
            	    					             
            	    				    		  
            	    				    	  }
											  
											  
            	    				      }
            	    				      
            	    				      else   ///6 
            	    				      {
            	    				    	  
            	    				    	  System.out.println("6"  + "\t" + " DL2   T   L2D'    ");
            	    			  	        	 k=6;
            	    			  	        	  
            	    			  	        	 temp2 = new String[1][2];
            	    			  	        	
            	    			  	        	
            	    			  	        	 
            	    			  	        	rubed[0][s+1]=D;
                                                rubed[0][s+2]=L;
                                                rubed[0][s+3]=L;
                                                rubed[0][s+4]=T;
                                                rubed[0][s+5]=L;
                                                rubed[0][s+6]=L;
                                                rubed[0][s+7]=DP;
                                               s=s+7;
            	    			  	        	 
            	    			  	        	 
            	    			  	        	 
            	    			  	        	   temp2[0][0] = Yellow[2][1];
            	    			  	        	   Yellow[2][1] = White[1][2];
            	    			  	               White[1][2] = temp2[0][0];
            	    			  	               
            	    			  	             
            	    			  	               
            	    			  	               temp2[0][1] = Blue[2][1];
            	    			  	              Blue[2][1]= Red[0][1];
            	    			  	               Red[0][1]= temp2[0][1];
            	    			  	               
            	    			  	               
            	    			  	              
            	    			  	               
            	    			  	               
            	    			  	              
            	    			  	               
            	    			  	        	 
            	    			  	               
            	    			  	              ed1[0][0] = temp2 [0][0];
            	    			  	          	  ed1[0][1] =  temp2 [0][1];
            	    			  	           	  
            	    			  	               
            	    			  	               
            	    			  	       
            	    			  	           	  
            	    			  	           	data9=  (ed1[0][0] +  ed1[0][1]  );
            	    			  	            
            	    			  	           	  
            	    			  	           	  
            	    			  	               
            	    			  	             break;    
            	    			 	                 
            	    			     	                 
            	    				      }
										  
										 
            	    				 }
            	    				 
            	    				 else //5
            	    				 {
            	    					 
            	    					 System.out.println("3"  + "\t" + " D'L2   T   L2'D  ");
            	    	  	        	 k=3;
            	    	  	        	  
            	    	  	        	 temp2 = new String[1][2];
            	    	  	        	 
            	    	  	        	 

                                         rubed[0][s+1]=DP;
                                         rubed[0][s+2]=L;
                                         rubed[0][s+3]=L;
                                         rubed[0][s+4]=T;
                                         rubed[0][s+5]=L;
                                         rubed[0][s+6]=L;
                                         rubed[0][s+7]=D;
                                          s=s+7;
            	    	  	        	
            	    	  	        	
            	    	  	        	   temp2[0][0] = Yellow[0][1];
            	    	  	        	   Yellow[0][1] = White[1][2];
            	    	  	               White[1][2] = temp2[0][0];
            	    	  	               
            	    	  	             
            	    	  	               
            	    	  	               temp2[0][1] = Green[2][1];
            	    	  	              Green[2][1]= Red[0][1];
            	    	  	               Red[0][1]= temp2[0][1];
            	    	  	               
            	    	  	               
            	    	  	              
            	    	  	               
            	    	  	               
            	    	  	              
            	    	  	               
            	    	  	        	 
            	    	  	               
            	    	  	              ed1[0][0] = temp2 [0][0];
            	    	  	          	  ed1[0][1] =  temp2 [0][1];
            	    	  	           	  
            	    	  	               
            	    	  	               
            	    	  	       
            	    	  	           	  
            	    	  	           	data9=  (ed1[0][0] +  ed1[0][1]  );
            	    	  	            
            	    	  	           	  
            	    	  	           	  
            	    	  	               
            	    	  	             break;   
            	    	  	             
            	    				 }
            	    				 
            	    				 
            	    				 
            	    			 }
            	    			 
            	    			 else //4
            	    			 {
            	    				 
            	    				 System.out.println("2"  + "\t" + " L2  T   L2  ");
            	     	        	 k=2;
            	     	        	  
            	     	        	 temp2 = new String[1][2];
            	     	        	
            	     	        	 
            	     	        	 
            	     	        	 rubed[0][s+1]=L;
                                     rubed[0][s+2]=L;
                                     rubed[0][s+3]=T;
                                     rubed[0][s+4]=L;
                                     rubed[0][s+5]=L;
                                     s=s+5;
            	     	        	
            	     	        	   temp2[0][0] = Yellow[1][0];
            	     	        	   Yellow[1][0] = White[1][2];
            	     	               White[1][2] = temp2[0][0];
            	     	               
            	     	             
            	     	               
            	     	               temp2[0][1] = Orange[2][1];
            	     	              Orange[2][1]= Red[0][1];
            	     	               Red[0][1]= temp2[0][1];
            	     	               
            	     	               
            	     	              
            	     	               
            	     	               
            	     	              
            	     	               
            	     	        	 
            	     	               
            	     	              ed1[0][0] = temp2 [0][0];
            	     	          	  ed1[0][1] =  temp2 [0][1];
            	     	           	  
            	     	               
            	     	               
            	     	       
            	     	           	  
            	     	           	data9=  (ed1[0][0] +  ed1[0][1]  );
            	     	            
            	     	           	  
            	     	           	  
            	     	               
            	     	             break;    
            	    	             
            	    			 }
            	    			  
            	    			 
            	    		 }
            	    		 
            	    		 else //3 
            	    		 {
            	    			 
            	    			 
            	    			 
            	    			 System.out.println("5"  + "\t" + " L   T   L'");
                	        	 k=5;
                	        	  
                	        	 temp2 = new String[1][2];
                	        	
                	        	 
                	        	 
                	        	 rubed[0][s+1]=L;
                                 rubed[0][s+2]=T;
                                 rubed[0][s+3]=LP;
                                s=s+3;
                	        	
                	        	   temp2[0][0] = Blue[1][2];
                	        	   Blue[1][2] = White[1][2];
                	               White[1][2] = temp2[0][0];
                	               
                	             
                	               
                	               temp2[0][1] = Orange[1][0];
                	              Orange[1][0]= Red[0][1];
                	               Red[0][1]= temp2[0][1];
                	               
                	               
                	              
                	               
                	               
                	              
                	               
                	        	 
                	               
                	              ed1[0][0] = temp2 [0][0];
                	          	  ed1[0][1] =  temp2 [0][1];
                	           	  
                	               
                	               
                	       
                	           	  
                	           	data9=  (ed1[0][0] +  ed1[0][1]  );
                	            
                	           	  
                	           	  
                	               
                	             break;    
              	             
            	    			 
            	    			 
            	    		 }
            	    		 
            	    		   
            	    		 
            	    	 }
            	    	 
            	    	 
            	    	 else //2
            	    		 
            	    	 {
            	    		 
            	    		 System.out.println("1"  + "\t" + " L'  T   L  ");
            	        	 k=1;
            	        	  
            	        	 temp2 = new String[1][2];
            	        	
            	        	
            	        	 rubed[0][s+1]=LP;
                             rubed[0][s+2]=T;
                             rubed[0][s+3]=L;
                            s=s+3;
            	        	 
            	        	   temp2[0][0] = Green[1][0];
            	        	   Green[1][0] = White[1][2];
            	               White[1][2] = temp2[0][0];
            	               
            	             
            	               
            	               temp2[0][1] = Orange[1][2];
            	              Orange[1][2]= Red[0][1];
            	               Red[0][1]= temp2[0][1];
            	               
            	               
            	              
            	               
            	               
            	              
            	               
            	        	 
            	               
            	              ed1[0][0] = temp2 [0][0];
            	          	  ed1[0][1] =  temp2 [0][1];
            	           	  
            	               
            	               
            	       
            	           	  
            	           	data9=  (ed1[0][0] +  ed1[0][1]  );
            	            
            	           	  break;
            	    		 
            	    		 
            	    		 
            	    	 }
            	    	 
            	    	 
            	    	 
            	     }
            	     
            	     
            	     
            	     
            	     
            	     
            	     
            	     
            	     else  //1
            	    	 
            	     {
            	    	 
    	        	 System.out.println("4"  + "\t" +  "   T   ");
    	        	 
    	        	  
    	        	 								temp2 = new String[1][2];
    	        	                                
    	        	 								
    	        	 					           rubed[0][s+1]=T;
                                                   
                                                   s=s+1;
                    
    	        	
    	        	 								temp2[0][0] = White[1][0];
    	        	   								White[1][0] = White[1][2];
    	        	   								White[1][2] = temp2[0][0];
    	               
    	             
    	               
    	        	   								temp2[0][1] = Orange[0][1];
    	        	   								Orange[0][1]= Red[0][1];
    	        	   								Red[0][1]= temp2[0][1];
    	               
    	               
    	              
    	               
    	               
    	              
    	               
    	        	 
    	               
    	               					ed1[0][0] = temp2 [0][0];
    	              					ed1[0][1] =  temp2 [0][1];
    	           	  
    	               
    	               
    	       
    	           	  
    	          	  				data9=  (ed1[0][0] +  ed1[0][1]  );
    	            
            	     	}
    	           	  
    	               
    	             break;    
  	             
            	  
            	
       
 	             
 	            
              case "BO":
    	        	 
    	        	 System.out.println("5"  + "\t" + " L   T   L'");
    	        	 k=5;
    	        	  
    	        	 temp2 = new String[1][2];
    	        	 
    	        	 rubed[0][s+1]=L;
                     rubed[0][s+2]=T;
                     rubed[0][s+3]=LP;
                      s=s+3;
    	        	
    	        	
    	        	   temp2[0][0] = Blue[1][2];
    	        	   Blue[1][2] = White[1][2];
    	               White[1][2] = temp2[0][0];
    	               
    	             
    	               
    	               temp2[0][1] = Orange[1][0];
    	              Orange[1][0]= Red[0][1];
    	               Red[0][1]= temp2[0][1];
    	               
    	               
    	              
    	               
    	               
    	              
    	               
    	        	 
    	               
    	              ed1[0][0] = temp2 [0][0];
    	          	  ed1[0][1] =  temp2 [0][1];
    	           	  
    	               
    	               
    	       
    	           	  
    	           	data9=  (ed1[0][0] +  ed1[0][1]  );
    	            
    	           	  
    	           	  
    	               
    	             break;    
  	             
 	             
 	             
              
	             
	               
    	             
              case "OB":
  	        	 
  	        	 System.out.println("5"  + "\t" + " dL'   T   Ld'    ");
  	        	 k=5;
  	        	  
  	        	 temp2 = new String[1][2];
  	        	 
  	        	 
  	        	 
  	        	 rubed[0][s+1]=U;
                 rubed[0][s+2]=BP;
                 rubed[0][s+3]=UP;
                 rubed[0][s+4]=T;
                 rubed[0][s+5]=U;
				 rubed[0][s+6]=B;
				 rubed[0][s+7]=UP;
  	        		s=s+7;
  	        	
  	        	   temp2[0][0] = Orange[1][0];
  	        	   Orange[1][0] = White[1][2];
  	               White[1][2] = temp2[0][0];
  	               
  	             
  	               
  	               temp2[0][1] = Blue[1][2];
  	              Blue[1][2]= Red[0][1];
  	               Red[0][1]= temp2[0][1];
  	               
  	               
  	              
  	               
  	               
  	              
  	               
  	        	 
  	               
  	              ed1[0][0] = temp2 [0][0];
  	          	  ed1[0][1] =  temp2 [0][1];
  	           	  
  	               
  	               
  	       
  	           	  
  	           	data9=  (ed1[0][0] +  ed1[0][1]  );
  	            
  	           	  
  	           	  
  	               
  	             break;    
 	             
 	             
              case "YB":
  	        	 
  	        	 System.out.println("6"  + "\t" + " DL2   T   L2D'    ");
  	        	 k=6;
  	        	  
  	        	 temp2 = new String[1][2];
  	        	 
  	        	 
  	        	 
  	        	 rubed[0][s+1]=D;
                 rubed[0][s+2]=L;
                 rubed[0][s+3]=L;
                 rubed[0][s+4]=T;
                 rubed[0][s+5]=L;
                 rubed[0][s+6]=L;
                 rubed[0][s+7]=DP;
             
             s=s+7;
  	        	
  	        	
  	        	   temp2[0][0] = Yellow[2][1];
  	        	   Yellow[2][1] = White[1][2];
  	               White[1][2] = temp2[0][0];
  	               
  	             
  	               
  	               temp2[0][1] = Blue[2][1];
  	              Blue[2][1]= Red[0][1];
  	               Red[0][1]= temp2[0][1];
  	               
  	               
  	              
  	               
  	               
  	              
  	               
  	        	 
  	               
  	              ed1[0][0] = temp2 [0][0];
  	          	  ed1[0][1] =  temp2 [0][1];
  	           	  
  	               
  	               
  	       
  	           	  
  	           	data9=  (ed1[0][0] +  ed1[0][1]  );
  	            
  	           	  
  	           	  
  	               
  	             break;    
 	                 
     	                
   	        
  	             
              case "BY":
   	        	 
   	        	 System.out.println("6"  + "\t" + " DLdL'   T   Ld'L'D'    ");
   	        	 k=6;
   	        	  
   	        	 temp2 = new String[1][2];
   	        	
   	        	
   	        	 rubed[0][s+1]=D;
                 rubed[0][s+2]=L;
                 rubed[0][s+3]=U;
                 rubed[0][s+4]=BP;
                 rubed[0][s+5]=UP;
                 rubed[0][s+6]=T;
                 rubed[0][s+7]=U;
                 rubed[0][s+8]=B;
                 rubed[0][s+9]=UP;
				 rubed[0][s+10]=LP;
				 rubed[0][s+11]=DP;
         
          
          s=s+11;
          
   	        	 
   	        	 
   	        	 
   	        	   temp2[0][0] = Blue[2][1];
   	        	   Blue[2][1] = White[1][2];
   	               White[1][2] = temp2[0][0];
   	               
   	             
   	               
   	               temp2[0][1] = Yellow[2][1];
   	              Yellow[2][1]= Red[0][1];
   	               Red[0][1]= temp2[0][1];
   	               
   	               
   	              
   	               
   	               
   	              
   	               
   	        	 
   	               
   	              ed1[0][0] = temp2 [0][0];
   	          	  ed1[0][1] =  temp2 [0][1];
   	           	  
   	               
   	               
   	       
   	           	  
   	           	data9=  (ed1[0][0] +  ed1[0][1]  );
   	            
   	           	  
   	           	  
   	               
   	             break;  
   	             
   	             
   	             
   	             
              case "YR":
    	        	 
    	        	 System.out.println("7"  + "\t" + " D2L2   T   L2D2    ");
    	        	 k=7;
    	        	  
    	        	 temp2 = new String[1][2];
    	        	 
    	        	 
    	        	 rubed[0][s+1]=D;
                     rubed[0][s+2]=D;
                     rubed[0][s+3]=L;
                     rubed[0][s+4]=L;
                     rubed[0][s+5]=T;
                     rubed[0][s+6]=L;
                     rubed[0][s+7]=L;
                     rubed[0][s+8]=D;
                     rubed[0][s+9]=D;
                     
                      
                      s=s+9;
    	        	
    	        	
    	        	   temp2[0][0] = Yellow[1][2];
                       Yellow[1][2] = White[1][2];
    	               White[1][2] = temp2[0][0];
    	               
    	             
    	               
    	               temp2[0][1] = Red[2][1];
    	              Red[2][1]= Red[0][1];
    	               Red[0][1]= temp2[0][1];
    	               
    	               
    	              
    	               
    	               
    	              
    	               
    	        	 
    	               
    	              ed1[0][0] = temp2 [0][0];
    	          	  ed1[0][1] =  temp2 [0][1];
    	           	  
    	               
    	               
    	       
    	           	  
    	           	data9=  (ed1[0][0] +  ed1[0][1]  );
    	            
    	           	  
    	           	  
    	               
    	             break;  
    	             
  	             
	             
    	             
    	             
              case "RY":
 	        	 
 	        	 System.out.println("7"  + "\t" + " D2LdL'   T   Ld'L'D2   ");
 	        	 k=7;
 	        	  
 	        	 temp2 = new String[1][2];
 	        	 
 	        	   rubed[0][s+1]=D;
                   rubed[0][s+2]=D;
                   rubed[0][s+3]=L;
                   rubed[0][s+4]=U;
                   rubed[0][s+5]=BP;
                   rubed[0][s+6]=UP;
                   rubed[0][s+7]=T;
                   rubed[0][s+8]=U;
                   rubed[0][s+9]=B;
                   rubed[0][s+10]=UP;
                   rubed[0][s+11]=LP;
					 rubed[0][s+12]=D;
					 rubed[0][s+13]=D;
					 

                   
                    
                    s=s+13;
 	        	
 	        	
 	        	   temp2[0][0] = Red[2][1];
                    Red[2][1] = White[1][2];
 	               White[1][2] = temp2[0][0];
 	               
 	             
 	               
 	               temp2[0][1] = Yellow[1][2];
 	              Yellow[1][2]= Red[0][1];
 	               Red[0][1]= temp2[0][1];
 	               
 	               
 	              
 	               
 	               
 	              
 	               
 	        	 
 	               
 	              ed1[0][0] = temp2 [0][0];
 	          	  ed1[0][1] =  temp2 [0][1];
 	           	  
 	               
 	               
 	       
 	           	  
 	           	data9=  (ed1[0][0] +  ed1[0][1]  );
 	            
 	           	  
 	           	  
 	               
 	             break;  
 	             
    	             
    	             
              case "WO":
  	        	 
  	        	 System.out.println("8"  + "\t" + "   T      ");
  	        	 k=8;
  	        	  
  	        	 temp2 = new String[1][2];
  	        	
  	        	
  	        	 
  	        	  rubed[0][s+1]=T;
                  
                  
                  
                  s=s+1;
  	        	 
  	        	 
  	        	   temp2[0][0] = White[1][0];
                    White[1][0] = White[1][2];
  	               White[1][2] = temp2[0][0];
  	               
  	             
  	               
  	               temp2[0][1] = Orange[0][1];
  	              Orange[0][1]= Red[0][1];
  	               Red[0][1]= temp2[0][1];
  	               
  	               
  	              
  	               
  	               
  	              
  	               
  	        	 
  	               
  	              ed1[0][0] = temp2 [0][0];
  	          	  ed1[0][1] =  temp2 [0][1];
  	           	  
  	               
  	               
  	       
  	           	  
  	           	data9=  (ed1[0][0] +  ed1[0][1]  );
  	            
  	           	  
  	           	  
  	               
  	             break;  
  	                 
	             
  	             
  	             
  	             
  	             
              case "OW":
   	        	 
   	        	 System.out.println("8"  + "\t" + " L'dL'   T    Ld'L   ");
   	        	 k=8;
   	        	  
   	        	 temp2 = new String[1][2];
   	        	 
   	        	 rubed[0][s+1]=LP;
                 rubed[0][s+2]=U;
                 rubed[0][s+3]=BP;
                 rubed[0][s+4]=UP;
                 rubed[0][s+5]=T;
                 rubed[0][s+6]=U;
                 rubed[0][s+7]=B;
				 rubed[0][s+8]=UP;
				 rubed[0][s+9]=L;
       
	                      
	                      s=s+9;
   	        	
   	        	
   	        	     temp2[0][0] = Orange[0][1];
                     Orange[0][1] = White[1][2];
   	                 White[1][2] = temp2[0][0];
   	               
   	             
   	               
   	                temp2[0][1] = White[1][0];
   	                White[1][0]= Red[0][1];
   	                Red[0][1]= temp2[0][1];
   	               
   	               
   	              
   	               
   	               
   	              
   	               
   	        	 
   	               
   	              ed1[0][0] = temp2 [0][0];
   	          	  ed1[0][1] =  temp2 [0][1];
   	           	  
   	               
   	               
   	       
   	           	  
   	           	data9=  (ed1[0][0] +  ed1[0][1]  );
   	            
   	           	  
   	           	  
   	               
   	             break;  
  	             
  	             
  	             
  	             
              case "BR":
    	        	 
    	        	 System.out.println("9"  + "\t" + "  d2L'  T  Ld2     ");
    	        	 k=9;
    	        	  
    	        	 temp2 = new String[1][2];
    	        	 
    	        	 rubed[0][s+1]=U;
                     rubed[0][s+2]=U;
                     rubed[0][s+3]=RP;
                     rubed[0][s+4]=U;
                     rubed[0][s+5]=U;
                     rubed[0][s+6]=T;
                     rubed[0][s+7]=U;
					 rubed[0][s+8]=U;
					 rubed[0][s+9]=R;
					 rubed[0][s+10]=U;
					 rubed[0][s+11]=U;
                  
                     
                      
                      s=s+11;
    	        	
    	        	
    	        	     temp2[0][0] = Blue[1][0];
                        Blue[1][0] = White[1][2];
    	                 White[1][2] = temp2[0][0];
    	               
    	             
    	               
    	                temp2[0][1] = Red[1][2];
    	                Red[1][2]= Red[0][1];
    	                Red[0][1]= temp2[0][1];
    	               
    	               
    	              
    	               
    	               
    	              
    	               
    	        	 
    	               
    	              ed1[0][0] = temp2 [0][0];
    	          	  ed1[0][1] =  temp2 [0][1];
    	           	  
    	               
    	               
    	       
    	           	  
    	           	data9=  (ed1[0][0] +  ed1[0][1]  );
    	            
    	           	  
    	           	  
    	               
    	             break;  
   	             
   	             
              case "RB":
    	        	 
    	        	 System.out.println("9"  + "\t" + " dL  T  L'd    ");
    	        	 k=9;
    	        	  
    	        	 temp2 = new String[1][2];
    	        	
    	        	  rubed[0][s+1]=U;
                      rubed[0][s+2]=B;
                      rubed[0][s+3]=UP;
                      rubed[0][s+4]=T;
                      rubed[0][s+5]=U;
					  rubed[0][s+6]=BP;
					  rubed[0][s+7]=UP;
                     s=s+7;
    	        	 
    	        	
    	        	     temp2[0][0] = Red[1][2];
                         Red[1][2] = White[1][2];
    	                 White[1][2] = temp2[0][0];
    	               
    	             
    	               
    	                temp2[0][1] = Blue[1][0];
    	                Blue[1][0]= Red[0][1];
    	                Red[0][1]= temp2[0][1];
    	               
    	               
    	              
    	               
    	               
    	              
    	               
    	        	 
    	               
    	              ed1[0][0] = temp2 [0][0];
    	          	  ed1[0][1] =  temp2 [0][1];
    	           	  
    	               
    	               
    	       
    	           	  
    	           	data9=  (ed1[0][0] +  ed1[0][1]  );
    	            
    	           	  
    	           	  
    	               
    	             break;  
   	             
   	             
              case "GR":
 	        	 
 	        	 System.out.println("10"  + "\t" + "  d2L  T  L'd2     ");
 	        	 k=10;
 	        	  
 	        	 temp2 = new String[1][2];
 	        	 
 	        	 
 	        	 rubed[0][s+1]=U;
                 rubed[0][s+2]=U;
                 rubed[0][s+3]=R;
                 rubed[0][s+4]=U;
                 rubed[0][s+5]=U;
                 rubed[0][s+6]=T;
                 rubed[0][s+7]=U;
				 rubed[0][s+8]=U;
				 rubed[0][s+9]=RP;
				 rubed[0][s+10]=U;
				 rubed[0][s+11]=U;
                 
                 
                  
                  s=s+11;
 	        	
 	        	
 	        	     temp2[0][0] = Green[1][2];
 	        	    Green[1][2] = White[1][2];
 	                 White[1][2] = temp2[0][0];
 	               
 	             
 	               
 	                temp2[0][1] = Red[1][0];
 	                Red[1][0]= Red[0][1];
 	                Red[0][1]= temp2[0][1];
 	               
 	               
 	              
 	               
 	               
 	              
 	               
 	        	 
 	               
 	              ed1[0][0] = temp2 [0][0];
 	          	  ed1[0][1] =  temp2 [0][1];
 	           	  
 	               
 	               
 	       
 	           	  
 	           	data9=  (ed1[0][0] +  ed1[0][1]  );
 	            
 	           	  
 	           	  
 	               
 	             break;  
	             
 	             
              case "RG":
 	        	 
 	        	 System.out.println("10"  + "\t" + "  d'L'  T  Ld    ");
 	        	 k=10;
 	        	  
 	        	 temp2 = new String[1][2];
 	        	
 	        	
 	        	 
 	        	 rubed[0][s+1]=UP;
                 rubed[0][s+2]=FP;
                 rubed[0][s+3]=U;
                 rubed[0][s+4]=T;
                 rubed[0][s+5]=UP;
                 rubed[0][s+6]=F;
                 rubed[0][s+7]=U;
				
                 
                 
                  
                  s=s+7;
 	        	     temp2[0][0] = Red[1][0];
 	        	    Red[1][0] = White[1][2];
 	                 White[1][2] = temp2[0][0];
 	               
 	             
 	               
 	                temp2[0][1] = Green[1][2];
 	               Green[1][2]= Red[0][1];
 	                Red[0][1]= temp2[0][1];
 	               
 	               
 	              
 	               
 	               
 	              
 	               
 	        	 
 	               
 	              ed1[0][0] = temp2 [0][0];
 	          	  ed1[0][1] =  temp2 [0][1];
 	           	  
 	               
 	               
 	       
 	           	  
 	           	data9=  (ed1[0][0] +  ed1[0][1]  );
 	           
 	           	  
 	           	  
 	               
 	             break;  
	             
  	             
  	             
 	             
              case "WG":
  	        	 
  	        	 System.out.println("11"  + "\t" + "   l2Dl2  T  l2D'l2    ");
  	        	 k=11;
  	        	  
  	        	 temp2 = new String[1][2];
  	        	
  	        	
  	        	
  	        	 
  	        	 rubed[0][s+1]=R;
                 rubed[0][s+2]=R;
                 rubed[0][s+3]=U;
                 rubed[0][s+4]=R;
                 rubed[0][s+5]=R;
                 rubed[0][s+6]=T;
                 rubed[0][s+7]=R;
				 rubed[0][s+8]=R;
				 rubed[0][s+9]=UP;
				 rubed[0][s+10]=R;
				 rubed[0][s+11]=R;
                 
                  
                  s=s+11;
  	        	 
  	        	     temp2[0][0] = White[2][1];
  	        	    White[2][1] = White[1][2];
  	                 White[1][2] = temp2[0][0];
  	               
  	             
  	               
  	                temp2[0][1] = Green[0][1];
  	               Green[0][1]= Red[0][1];
  	                Red[0][1]= temp2[0][1];
  	               
  	               
  	              
  	               
  	               
  	              
  	               
  	        	 
  	               
  	              ed1[0][0] = temp2 [0][0];
  	          	  ed1[0][1] =  temp2 [0][1];
  	           	  
  	               
  	               
  	       
  	           	  
  	           	data9=  (ed1[0][0] +  ed1[0][1]  );
  	            
  	           	  
  	           	  
  	               
  	             break;  
 	             
  	             
  	             
              case "GW":
  	        	 
  	        	 System.out.println("11"  + "\t" + "  lD'l2   T  l2Dl'   ");
  	        	 k=11;
  	        	  
  	        	 temp2 = new String[1][2];
  	        	
  	        	 
  	        	 rubed[0][s+1]=R;
                 rubed[0][s+2]=FP;
                 rubed[0][s+3]=LP;
                 rubed[0][s+4]=RP;
                 rubed[0][s+5]=T;
                 rubed[0][s+6]=R;
                 rubed[0][s+7]=L;
				 rubed[0][s+8]=F;
				 rubed[0][s+9]=RP;
				 
                 
                  
                  s=s+9;
  	        	
  	        	     temp2[0][0] = Green[0][1];
  	        	    Green[0][1] = White[1][2];
  	                 White[1][2] = temp2[0][0];
  	               
  	             
  	               
  	                temp2[0][1] = White[2][1];
  	               White[2][1]= Red[0][1];
  	                Red[0][1]= temp2[0][1];
  	               
  	               
  	              
  	               
  	               
  	              
  	               
  	        	 
  	               
  	              ed1[0][0] = temp2 [0][0];
  	          	  ed1[0][1] =  temp2 [0][1];
  	           	  
  	               
  	               
  	       
  	           	  
  	           	data9=  (ed1[0][0] +  ed1[0][1]  );
  	            
  	           	  
  	           	  
  	               
  	             break;  
 	             
 	             
 	             
 	             
              case "WB":
   	        	 
   	        	 System.out.println("12"  + "\t" + "   l2D'l2  T  l2Dl2    ");
   	        	 k=12;
   	        	  
   	        	 temp2 = new String[1][2];
   	        	
   	        	
   	        	
   	        	 
   	        	 rubed[0][s+1]=R;
                 rubed[0][s+2]=R;
                 rubed[0][s+3]=UP;
                 rubed[0][s+4]=R;
                 rubed[0][s+5]=R;
                 rubed[0][s+6]=T;
                 rubed[0][s+7]=R;
				 rubed[0][s+8]=R;
				 rubed[0][s+9]=U;
				 rubed[0][s+10]=R;
				 rubed[0][s+11]=R;
                 
                  
                  s=s+11;


   	        	     temp2[0][0] = White[0][1];
   	        	    White[0][1] = White[1][2];
   	                 White[1][2] = temp2[0][0];
   	               
   	             
   	               
   	                temp2[0][1] = Blue[0][1];
   	               Blue[0][1]= Red[0][1];
   	                Red[0][1]= temp2[0][1];
   	               
   	               
   	              
   	               
   	               
   	              
   	               
   	        	 
   	               
   	              ed1[0][0] = temp2 [0][0];
   	          	  ed1[0][1] =  temp2 [0][1];
   	           	  
   	               
   	               
   	       
   	          
   	           	data9=  (ed1[0][0] +  ed1[0][1]  );
   	            
   	           	  
   	           	  
   	               
   	             break;  
  	             
   	             
   	             
               case "BW":
            	   
            	   
   	        	 
   	        	 System.out.println("12"  + "\t" + "  l'Dl2   T  l2D'l   ");
   	        	 k=12;
   	        	  
   	        	 temp2 = new String[1][2];
   	        	
   	        	
   	        	 
   	        	 rubed[0][s+1]=RP;
                 rubed[0][s+2]=B;
                 rubed[0][s+3]=L;
                 rubed[0][s+4]=R;
                 rubed[0][s+5]=T;
                 rubed[0][s+6]=RP;
                 rubed[0][s+7]=LP;
				 rubed[0][s+8]=BP;
				 rubed[0][s+9]=R;
				 
                 
                  
                  s=s+9;
   	        	 
   	        	 
   	        	     temp2[0][0] = Blue[0][1];
   	        	  Blue[0][1] = White[1][2];
   	                 White[1][2] = temp2[0][0];
   	               
   	             
   	               
   	                temp2[0][1] = White[0][1];
   	               White[0][1]= Red[0][1];
   	                Red[0][1]= temp2[0][1];
   	               
   	               
   	              
   	               
   	               
   	              
   	               
   	        	 
   	               
   	              ed1[0][0] = temp2 [0][0];
   	          	  ed1[0][1] =  temp2 [0][1];
   	           	  
   	               
   	               
   	       
   	           	  
   	           	data9=  (ed1[0][0] +  ed1[0][1]  );
   	            
   	           	  
   	           	  
   	               
   	             break;  
  	             
  	             
  	             
  	             
 	             
	     }
	     
	     
	     
	     
	     
	     
	     
		return data9;
  
  
  }
  
  
  
  public static void delay(int t)
  {
	  
	  
	  
	  for(int r=0;r<t*5;r++)
	  {
		  
		  for(int p=0;p<17;p++)
		  {
			  System.out.print("CUBE"+"\n");
			  
			  
		  
			  
		  }
	  }
  }
  
  
  public static void showUpdate()
  {
	  
	  drawingUpdate.UpdateWhite00= White[0][0];
      drawingUpdate.UpdateWhite01= White[0][1];
      drawingUpdate.UpdateWhite02= White[0][2];
      drawingUpdate.UpdateWhite10= White[1][0];
      drawingUpdate.UpdateWhite11= White[1][1];
      drawingUpdate.UpdateWhite12= White[1][2];
      drawingUpdate.UpdateWhite20= White[2][0];
      drawingUpdate.UpdateWhite21= White[2][1];
      drawingUpdate.UpdateWhite22= White[2][2];
      
      
      drawingUpdate.UpdateGreen00= Green[0][0];
      drawingUpdate.UpdateGreen01= Green[0][1];
      drawingUpdate.UpdateGreen02= Green[0][2];
      drawingUpdate.UpdateGreen10= Green[1][0];
      drawingUpdate.UpdateGreen11= Green[1][1];
      drawingUpdate.UpdateGreen12= Green[1][2];
      drawingUpdate.UpdateGreen20= Green[2][0];
      drawingUpdate.UpdateGreen21= Green[2][1];
      drawingUpdate.UpdateGreen22= Green[2][2];
      
      
      
      drawingUpdate.UpdateRed00= Red[0][0];
      drawingUpdate.UpdateRed01= Red[0][1];
      drawingUpdate.UpdateRed02= Red[0][2];
      drawingUpdate.UpdateRed10= Red[1][0];
      drawingUpdate.UpdateRed11= Red[1][1];
      drawingUpdate.UpdateRed12= Red[1][2];
      drawingUpdate.UpdateRed20= Red[2][0];
      drawingUpdate.UpdateRed21= Red[2][1];
      drawingUpdate.UpdateRed22= Red[2][2];
      
      
      
      drawingUpdate.UpdateBlue00= Blue[0][0];
      drawingUpdate.UpdateBlue01= Blue[0][1];
      drawingUpdate.UpdateBlue02= Blue[0][2];
      drawingUpdate.UpdateBlue10= Blue[1][0];
      drawingUpdate.UpdateBlue11= Blue[1][1];
      drawingUpdate.UpdateBlue12= Blue[1][2];
      drawingUpdate.UpdateBlue20= Blue[2][0];
      drawingUpdate.UpdateBlue21= Blue[2][1];
      drawingUpdate.UpdateBlue22= Blue[2][2];
      
      
      drawingUpdate.UpdateOrange00= Orange[0][0];
      drawingUpdate.UpdateOrange01= Orange[0][1];
      drawingUpdate.UpdateOrange02= Orange[0][2];
      drawingUpdate.UpdateOrange10= Orange[1][0];
      drawingUpdate.UpdateOrange11= Orange[1][1];
      drawingUpdate.UpdateOrange12= Orange[1][2];
      drawingUpdate.UpdateOrange20= Orange[2][0];
      drawingUpdate.UpdateOrange21= Orange[2][1];
      drawingUpdate.UpdateOrange22= Orange[2][2];
      
      
      drawingUpdate.UpdateYellow00= Yellow[0][0];
      drawingUpdate.UpdateYellow01= Yellow[0][1];
      drawingUpdate.UpdateYellow02= Yellow[0][2];
      drawingUpdate.UpdateYellow10= Yellow[1][0];
      drawingUpdate.UpdateYellow11= Yellow[1][1];
      drawingUpdate.UpdateYellow12= Yellow[1][2];
      drawingUpdate.UpdateYellow20= Yellow[2][0];
      drawingUpdate.UpdateYellow21= Yellow[2][1];
      drawingUpdate.UpdateYellow22= Yellow[2][2];
  }
  
  
  
  public static void displayScramble()
  {
	  
	  JFrame window = new JFrame();
      window.setSize(500,600);
      window.setTitle("Rubiks Cube Scramble");
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      window.setVisible(true);
      
      drawingComponent dc =new drawingComponent();
      window.add(dc);
      dc.repaint();
	  
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
      delay(500);
	// window.setVisible(false);
      
      
	  
  }
  
  public static void displayFinal()
  {
	  
	  JFrame window = new JFrame();
      window.setSize(500,600);
      window.setTitle("Rubiks Cube Final");
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      window.setVisible(true);
     
      //Cube.UpdateColorWhite();
      
      
      
      
      drawingFinal df = new drawingFinal();
      window.add(df);  
      
      
	  
  }
  
  public static void displayStep()
  {
	  
	  
	  JFrame window = new JFrame();
      window.setSize(500,600);
      window.setTitle("Rubiks Cube step");
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      window.setVisible(true);
     
      //Cube.UpdateColorWhite();
      
      
      
      
      drawingStep ds = new drawingStep();
      window.add(ds);  
      
	  
	  
  }
  
  
  
  
  public static void displayFont()
  {
	  
	  
     

	  JFrame window = new JFrame();
      window.setSize(2500,600);
      window.setTitle("Rubiks font step");
      window.setBackground(Color.WHITE);
    window.setLayout(new BorderLayout());
    window.setLocationRelativeTo(null);
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
    //  ImageIcon image =  new ImageIcon("rubiks.jpg");
      //JLabel labelimg= new JLabel(image);
      
      
      
      
      //window.add(labelimg,BorderLayout.AFTER_LINE_ENDS);
      
     
      //window.setContentPane(new JLabel(new ImageIcon("cube.jpg")));
     
     
      
      
      
      
      drawingFont dff = new drawingFont();
      window.add(dff);  
      window.setVisible(true);
	  
  }
  
  
  
  
  
  public static void displayinput()
  {
	  
	  JFrame window = new JFrame();
      window.setSize(600,800);
      window.setTitle("Rubiks Cube input");
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      window.setVisible(true);
      window.setBackground(Color.gray);
     
      //Cube.UpdateColorWhite();
      
      
      
      
      
     // window.add(draw);  
      
      
	  
  }
  
  
  
	public static int CheckEd()
		
		{

				Edi=rubed[0][M];
				
				switch(Edi)
				  {
			
				
				
				  case 2:
				  //Serial.println("the cube makes ya move");
					  System.out.print("T"+"\t\t");
						//R U R’ U’ R’ F R2 U’ R’ U’ R U R’ F’


							 	
				  break;
				   
				 case 3:
				  //Serial.println("the cube makes F move");
					 System.out.print("F"+"\t\t");



				  break;
				
				   case 33:
				 // Serial.println("the cube makes FP move");
					   System.out.print("F' "+"\t\t");
                      	 
				  break;
				
				   case 7:
				 // Serial.println("the cube makes R move");
					   System.out.print("R"+"\t\t");
                      	 
				  break;
				
				   case 77:
				  //Serial.println("the cube makes RP move");
					   System.out.print("R'"+"\t\t");
                      	 
				  break;
				
				   case 5:
				 // Serial.println("the cube makes D move");
					   System.out.print("D"+"\t\t");
                      	 
				  break;
				
				   case 55:
				 // Serial.println("the cube makes DP move");
					   System.out.print("D'"+"\t\t");
                      	 
				  break;
				
				   case 8:
				  //Serial.println("the cube makes U move");
					   System.out.print("U"+"\t\t");
				  break;
				
				   case 88:
				 // Serial.println("the cube makes UP move");
					   System.out.print("U'"+"\t\t");
                      	 
				  break;
				
				   case 4:
				  //Serial.println("the cube makes L move");
					   System.out.print("L"+"\t\t");
                      	 
				  break;
				
				   case 44:
				  //Serial.println("the cube makes LP move");
					   System.out.print("L'"+"\t\t");
				  break;
				
				  
						   case 6:
				  //Serial.println("the cube makes F move");
							   System.out.print("B"+"\t\t");

				  break;
                      	 
						    case 66:
				  //Serial.println("the cube makes F move");
						    	 System.out.print("B'"+"\t\t");

				  break;







				    
				  }
				
				 
				M=M+1;
				return Edi;
				  
}





  
  
  
  
  
  public static  int CheckCor()

  {

         Cori=rubcor[0][P];

           switch(Cori)
              {

                      case 1:
                    	  System.out.print("ya"+"\t");
                    	  
						 //R U’ R’ U’ R U R’ F’ R U R’ U’ R’ F R


										
                        break;

                         case 3:
                        	 System.out.print("F"+"\t");
					   
                    	
						 break;

							 case 33:
					
								 System.out.print("F' "+"\t");        
							   



                        				break;

                          case 7:
                        	  System.out.print("R"+"\t");
                            	         
								break;

						   case 77:
							   System.out.print("R'"+"\t");




						  break;
						
						   case 5:
							   System.out.print("D"+"\t");
						  break;
						
						 case 55:
							 System.out.print("D'"+"\t");
							break;
					
					   case 8:
						   System.out.print("U"+"\t");
                            	         
					  break;
					
					   case 88:
						   System.out.print("U'"+"\t");
                            	         
					  break;
					
					   case 4:
						   System.out.print("L"+"\t");
                            	         
					  break;
					
					   case 44:
						   System.out.print("L'"+"\t");
                            	         
					  break;
					
					  
					    
   	  }


							P=P+1;
							  System.out.print("\n");
							return Cori;

		}





  
  
  
  

	public static void main(String[] args) 
	
	{
	     
	     System.out.println("code is on line 1");
	     System.out.println("code is on trial");
	  
	     
	     
	     if(flag==0)
	    	 
	     {
	       Cube.displayinput();   
	       System.out.println("the value of flag is .. "+ flag);
	       
	     }
	   
	   System.out.println("code is on line 2");
	   
	   System.out.println("the value of flag is "+ flag);
	   
	   if(flag==1)
	   
	   
	   {
	     
		   
		   System.out.println("target achieved");
	     
	   Cube.displayColorWhite();
		
		Cube.displayColorGreen();
		
		Cube.displayColorRed();
		
       Cube.displayColorBlue();
	    
	   Cube.displayColorOrange();
	    
	    Cube.displayColorYellow();
	    
	    
	  // Cube.displayScramble();
	    
	    
	    
	    Cube.showUpdate();
        Cube.displayUpdate();
	    
	    
	    System.out.println("\n");
	   
	    data7 =  Cube.CheckPosCor();
	
	    
	    
	    
    	
	    while((  (White[0][0].equals("W"))   &&   (White[0][2].equals("W"))     && (White[2][0].equals("W"))   &&   (White[2][2].equals("W"))  &&    (Orange[0][0].equals("O")) &&   (Orange[0][2].equals("O"))    &&   (Orange[2][0].equals("O")) &&   (Orange[2][2].equals("O")) &&   (Green[0][0].equals("G")) &&   (Green[0][2].equals("G"))   &&    (Green[2][0].equals("G")) &&   (Green[2][2].equals("G")) &&   (Red[0][0].equals("R")) &&   (Red[0][2].equals("R")) &&   (Red[2][0].equals("R")) &&   (Red[2][2].equals("R"))   && (Blue[0][0].equals("B")) && (Blue[0][2].equals("B"))  && (Blue[2][0].equals("B"))  && (Blue[2][2].equals("B"))  && (Yellow[0][0].equals("Y"))  && (Yellow[0][2].equals("Y"))  && (Yellow[2][0].equals("Y"))  && (Yellow[2][2].equals("Y"))            ) == false)
	    {  	
	   Cube.getPosCor(data7);
	   Cube.UpdateColorWhite();
   	   Cube.UpdateColorGreen();
   	   Cube.UpdateColorRed();
   	   Cube.UpdateColorBlue();
   	   Cube.UpdateColorOrange();
       Cube.UpdateColorYellow();
       
       Cube.showUpdate();
       Cube.displayUpdate(); 
	   
	 
	   n++;
	  
	 
	    }
	    
	   // Cube.displayUpdate();
	    
	    if( n%2 == 0) 
	    {
	    	
	    	System.out.println("Corners position is correct");
	    }
	    
	    else
	    {
	    	 // Cube.getPosCor(data7);
	    	
	    	 System.out.println("Corners position is  now correct");
	    	 
	    	 
	    	 temp1 = new String[1][2];
	    	 ed0 = new String[1][2];
	    	 
	         temp1[0][0] = White[1][0];
             White[1][0]= White[0][1];
              White[0][1]= temp1[0][0];
              
              
             
              
              
             temp1[0][1] = Orange[0][1];
              Orange[0][1] = Blue[0][1];
              Blue[0][1]=  temp1[0][1];
              
       	 
              
             ed0[0][0] = temp1 [0][0];
         	 ed0[0][1] =  temp1 [0][1];
          	 
              
              
          	 
          	for(int j=0;j<2;j++)
     	  {
     		//  System.out.print(cor1[0][j]+"\t");
     	  }
          	  
          	data8=  (ed0[0][0] +  ed0[0][1] );
          	  
          	  
	    	 
	    	
	    }
	    
	    
	   // System.out.println("45");
	
	    
	    
	    System.out.println("rubcor");
	    while((   ( (rubcor[0][P])==0)&&((rubcor[0][P+1])==0) )  ==false   )

        {

                data13=CheckCor();
                Cube.UpdateColorWhite();
            	Cube.UpdateColorGreen();
            	Cube.UpdateColorRed();
            	Cube.UpdateColorBlue();
            	Cube.UpdateColorOrange();
                Cube.UpdateColorYellow();
                
              
	    	
	 
        }
	    //System.out.println("46");
	    
	    
    	
	  
    	Cube.UpdateColorWhite();
    	Cube.UpdateColorGreen();
    	Cube.UpdateColorRed();
    	Cube.UpdateColorBlue();
    	Cube.UpdateColorOrange();
        Cube.UpdateColorYellow();
        
        //cut & paste
        
        
        Cube.showUpdate();
        Cube.displayUpdate(); 
       
        
        
        
      // Cube.displayUpdate(); 
        
       
        
        
        
       
        System.out.println("\n");
 	   
	    data9 =  Cube.CheckPosEd();
	    
	    System.out.println("edge is " + data9);
	    
	    //repeat
	    
	   
	    
	    
	    
	    
	    
	    while((  (White[1][0].equals("W")) &&   (White[0][1].equals("W") )     && (White[1][2].equals("W"))   &&   (White[2][1].equals("W"))  &&  (Green[0][1].equals("G") ) &&   (Green[1][0].equals("G"))    &&   (Green[2][1].equals("G")) &&   (Green[1][2].equals("G")) &&   (Orange[0][1].equals("O")) &&   (Orange[1][0].equals("O"))   &&    (Orange[1][2].equals("O")) &&   (Orange[2][1].equals("O")) &&   (Red[0][1].equals("R")) &&   (Red[1][0].equals("R")) &&   (Red[1][2].equals("R")) &&   (Red[2][1].equals("R")) &&   (Blue[0][1].equals("B"))    && (Blue[1][0].equals("B"))    &&  (Blue[1][2].equals("B"))   && (Blue[2][1].equals("B"))   && (Yellow[0][1].equals("Y")) && (Yellow[1][0].equals("Y")) && (Yellow[1][2].equals("Y"))   && (Yellow[2][1].equals("Y"))  ) == false)
	    
	    {
	    	Cube.getPosEd(data9);
	    	 Cube.UpdateColorWhite();
	     	Cube.UpdateColorGreen();
	     	Cube.UpdateColorRed();
	     	Cube.UpdateColorBlue();
	     	Cube.UpdateColorOrange();
	         Cube.UpdateColorYellow();
	         Cube.showUpdate();
	         Cube.displayUpdate();
	    	
	    }
	    
	   
            
	    
	         
	    
	    
	  
        
        System.out.println("rubed");
	    while((   ( (rubed[0][M])==0)&&((rubed[0][M+1])==0) )  ==false   )

        {

                data14=CheckEd();
                Cube.UpdateColorWhite();
            	Cube.UpdateColorGreen();
            	Cube.UpdateColorRed();
            	Cube.UpdateColorBlue();
            	Cube.UpdateColorOrange();
                Cube.UpdateColorYellow();
              
	    	
	 
        }
        
        
        
        //displayStep();
        Cube.showUpdate();
        Cube.displayUpdate();
      //  Cube.displayFont();
        
 
        
        
        
       // Cube.displayFinal(); 
       
        //Cube.displayUpdate(); 
       // Cube.displayScramble();
        
        

		
       

	    
	    
	    }
	
	
	
	    
//D' R2 U' R2 U'  R2 B2 F2 U' R2 B2 R2 B' D2 U' F' D' R D'  B2 U2  //DONE (EVEN)
	
	}

}

