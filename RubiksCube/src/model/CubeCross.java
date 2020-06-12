package model;

public class CubeCross 


{

	static String[][] White;
	static String[][] Green;
	static String[][] Red;
	static String[][] Blue;
	static String[][] Orange;
	static String[][] Yellow;
	static String[][] ed;
	static String[][] cor;
	static int n=0;
	static String edges;
	static String corners;
	static String crossedges;
	static String ed1;
	static String ed2;
	static String ed3;
	static String ed4;
	static String cor1;
	static String cor2;
	static String cor3;
	static String cor4;
	static String edges2;
	static String edges3;
	static String edges4;
	static String crossedges2;
	static String crossedges3;
	static String crossedges4;
    static String F2LCor1;
    static String F2LCor2;
    static String F2LCor3;
    static String F2LCor4;
	static String F2Led1;
	static String F2Led2;
	static String F2Led3;
	static String F2Led4;
	static int F2LEdpos1;
	static int F2LEdpos2;
	static int F2LEdpos3;
	static int F2LEdpos4;
	
	
	static int crosspos;
	static int crosspos2;
	static int crosspos3;
	static int crosspos4;
	static int F2LCorpos1;
	static int F2LCorpos2;
	static int F2LCorpos3;
	static int F2LCorpos4;
	
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

		
     
		White[0][0] = "W";
		White[0][1] = "W";
		White[0][2] = "W";
		White[1][0] = "W";
		White[1][1] = "W";          
		White[1][2] = "W";
		White[2][0] = "W";
		White[2][1] = "W";
		White[2][2] = "W";
		
		
		
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
	Green[0][0] = "R";
	Green[0][1] = "G";
	Green[0][2] = "R";
	Green[1][0] = "G";
	Green[1][1] = "G";          
	Green[1][2] = "G";
	Green[2][0] = "G";
	Green[2][1] = "G";
	Green[2][2] = "G";

	
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
	
	
	
	
	Red[0][0] = "B";
	Red[0][1] = "O";
	Red[0][2] = "B";
	Red[1][0] = "R";
	Red[1][1] = "R";          
	Red[1][2] = "R";
	Red[2][0] = "R";
	Red[2][1] = "R";
	Red[2][2] = "R";

	
	
	
	
	
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
	Blue[0][0] = "O";
	Blue[0][1] = "B";
	Blue[0][2] = "O";
	Blue[1][0] = "B";
	Blue[1][1] = "B";          
	Blue[1][2] = "B";
	Blue[2][0] = "B";
	Blue[2][1] = "B";
	Blue[2][2] = "B";

	
	
	
	
	
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
		
     Orange[0][0] = "G";
     Orange[0][1] = "R";
     Orange[0][2] = "G";
     Orange[1][0] = "O";
     Orange[1][1] = "O";         
     Orange[1][2] = "O";
     Orange[2][0] = "O";
     Orange[2][1] = "O";
     Orange[2][2] = "O";
	
	
	
	
	
	
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
     Yellow[2][2] = model.draw.y22;
*/
       
  
	
  Yellow[0][0] = "Y";
  Yellow[0][1] = "Y";
  Yellow[0][2] = "Y";
  Yellow[1][0] = "Y";
  Yellow[1][1] = "Y";          
  Yellow[1][2] = "Y";
  Yellow[2][0] = "Y";
  Yellow[2][1] = "Y";
  Yellow[2][2] = "Y";
	

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





public static void moveR()
{
	
	String [][] temp;
	
	 temp = new String[3][3];
	 
	 
	 String [][] temp1;
		
	 temp1 = new String[3][3];
	 
	 temp[0][2]= White[0][2];
	 temp[1][2]= White[1][2];
	 temp[2][2]= White[2][2];
	 
	  White[0][2]=Green[0][2];
	  White[1][2]=Green[1][2];
	  White[2][2]=Green[2][2];
	  
	  Green[0][2]=Yellow[0][2];
	  Green[1][2]=Yellow[1][2];
	  Green[2][2]=Yellow[2][2];
	  
	  Yellow[0][2]=Blue[2][0];
	  Yellow[1][2]=Blue[1][0];
	  Yellow[2][2]=Blue[0][0];
	  
	  Blue[2][0]= temp[0][2];
	  Blue[1][0]= temp[1][2];
	  Blue[0][0]= temp[2][2];
	  
	  
	  
	  //for updating red
	  
	     temp1[0][0]= Red[0][0];
		 temp1[0][1]= Red[0][1];
		 temp1[0][2]= Red[0][2];
		 
		 Red[0][0]=Red[2][0];
		 Red[0][1]=Red[1][0];
		 Red[0][2]=temp1[0][0];
						 
		 Red[2][0]=Red[2][2];
		 Red[1][0]=Red[2][1];
		
		 Red[2][2]= temp1[0][2];
		 Red[2][1]= Red[1][2];
		 
	     Red[1][2]= temp1[0][1];
	
}

public static void moveRP()
{
	
	String [][] temp;
	
	 temp = new String[3][3];
	 

	 String [][] temp1;
		
	 temp1 = new String[3][3];
	 
	 temp[0][2]= White[0][2];
	 temp[1][2]= White[1][2];
	 temp[2][2]= White[2][2];
	 
	  White[0][2]=Blue[2][0];
	  White[1][2]=Blue[1][0];
	  White[2][2]=Blue[0][0];
	  
	  Blue[2][0]=Yellow[0][2];
	  Blue[1][0]=Yellow[1][2];
	  Blue[0][0]=Yellow[2][2];
	  
	  Yellow[0][2]=Green[0][2];
	  Yellow[1][2]=Green[1][2];
	  Yellow[2][2]=Green[2][2];
	  
	  Green[0][2]= temp[0][2];
	  Green[1][2]= temp[1][2];
	  Green[2][2]= temp[2][2];
	 
	
	  
	  
	  //for updating red
	  
	     temp1[0][0]= Red[0][0];
		 temp1[0][1]= Red[0][1];
		 temp1[0][2]= Red[0][2];
		 
		 Red[0][0]=temp1[0][2];
		 Red[0][1]=Red[1][2];
		 Red[0][2]=Red[2][2];
						 
		 Red[1][2]=Red[2][1];
		 Red[2][2]=Red[2][0];
		
		 Red[2][1]= Red[1][0];
		 Red[2][0]= temp1[0][0];
		 
	     Red[1][0]= temp1[0][1];
	
	  
	  
	  
}




public static void moveF()
{
	
	String [][] temp;
	
	 temp = new String[3][3];
	 
	 
	 String [][] temp1;
		
	 temp1 = new String[3][3];
	 
	 temp[2][0]= White[2][0];
	 temp[2][1]= White[2][1];
	 temp[2][2]= White[2][2];
	 
	  White[2][0]=Orange[2][2];
	  White[2][1]=Orange[1][2];
	  White[2][2]=Orange[0][2];
	  
	  Orange[2][2]=Yellow[0][2];
	  Orange[1][2]=Yellow[0][1];
	  Orange[0][2]=Yellow[0][0];
	  
	  Yellow[0][2]=Red[0][0];
	  Yellow[0][1]=Red[1][0];
	  Yellow[0][0]=Red[2][0];
	  
	  Red[0][0]= temp[2][0];
	  Red[1][0]= temp[2][1];
	  Red[2][0]= temp[2][2];
	  
	  
	  
	  //for updating green
	  
	     temp1[0][0]= Green[0][0];
		 temp1[0][1]= Green[0][1];
		 temp1[0][2]= Green[0][2];
		 
		 Green[0][0]=Green[2][0];
		 Green[0][1]=Green[1][0];
		 Green[0][2]=temp1[0][0];
						 
		 Green[2][0]=Green[2][2];
		 Green[1][0]=Green[2][1];
		
		 Green[2][2]= temp1[0][2];
		 Green[2][1]= Green[1][2];
		 
		 Green[1][2]= temp1[0][1];
	
}








public static void moveFP()
{
	
	String [][] temp;
	
	 temp = new String[3][3];
	 

	 String [][] temp1;
		
	 temp1 = new String[3][3];
	 
	 temp[2][0]= White[2][0];
	 temp[2][1]= White[2][1];
	 temp[2][2]= White[2][2];
	 
	  White[2][0]=Red[0][0];
	  White[2][1]=Red[1][0];
	  White[2][2]=Red[2][0];
	  
	  Red[0][0]=Yellow[0][2];
	  Red[1][0]=Yellow[0][1];
	  Red[2][0]=Yellow[0][0];
	  
	  Yellow[0][2]=Orange[2][2];
	  Yellow[0][1]=Orange[1][2];
	  Yellow[0][0]=Orange[0][2];
	  
	  Orange[2][2]= temp[2][0];
	  Orange[1][2]= temp[2][1];
	  Orange[0][2]= temp[2][2];
	 
	
	  
	  
	  //for updating GREEN
	  
	     temp1[0][0]= Green[0][0];
		 temp1[0][1]= Green[0][1];
		 temp1[0][2]= Green[0][2];
		 
		 Green[0][0]=temp1[0][2];
		 Green[0][1]=Green[1][2];
		 Green[0][2]=Green[2][2];
						 
		 Green[1][2]=Green[2][1];
		 Green[2][2]=Green[2][0];
		
		 Green[2][1]= Green[1][0];
		 Green[2][0]= temp1[0][0];
		 
		 Green[1][0]= temp1[0][1];
	
	  
	  
	  
}




public static void moveU()
{
	
	String [][] temp;
	
	 temp = new String[3][3];
	 
	 
	 String [][] temp1;
		
	 temp1 = new String[3][3];
	 
	 temp[0][0]= Green[0][0];
	 temp[0][1]= Green[0][1];
	 temp[0][2]= Green[0][2];
	 
	 Green[0][0]=Red[0][0];
	 Green[0][1]=Red[0][1];
	 Green[0][2]=Red[0][2];
	  
	 Red[0][0]=Blue[0][0];
	 Red[0][1]=Blue[0][1];
	 Red[0][2]=Blue[0][2];
	  
	 Blue[0][0]=Orange[0][0];
	 Blue[0][1]=Orange[0][1];
	 Blue[0][2]=Orange[0][2];
	  
	 Orange[0][0]= temp[0][0];
	 Orange[0][1]= temp[0][1];
	 Orange[0][2]= temp[0][2];
	  
	  
	  
	  //for updating White
	  
	     temp1[0][0]= White[0][0];
		 temp1[0][1]= White[0][1];
		 temp1[0][2]= White[0][2];
		 
		 White[0][0]=White[2][0];
		 White[0][1]=White[1][0];
		 White[0][2]=temp1[0][0];
						 
		 White[2][0]=White[2][2];
		 White[1][0]=White[2][1];
		
		 White[2][2]= temp1[0][2];
		 White[2][1]= White[1][2];
		 
		 White[1][2]= temp1[0][1];
	
}




public static void moveUP()
{
	
	String [][] temp;
	
	 temp = new String[3][3];
	 

	 String [][] temp1;
		
	 temp1 = new String[3][3];
	 
	 temp[0][0]= Green[0][0];
	 temp[0][1]= Green[0][1];
	 temp[0][2]= Green[0][2];
	 
	 Green[0][0]=Orange[0][0];
	 Green[0][1]=Orange[0][1];
	 Green[0][2]=Orange[0][2];
	  
	 Orange[0][0]=Blue[0][0];
	 Orange[0][1]=Blue[0][1];
	 Orange[0][2]=Blue[0][2];
	  
	 Blue[0][0]=Red[0][0];
	 Blue[0][1]=Red[0][1];
	 Blue[0][2]=Red[0][2];
	  
	 Red[0][0]= temp[0][0];
	 Red[0][1]= temp[0][1];
	 Red[0][2]= temp[0][2];
	 
	
	  
	  
	  //for updating White
	  
	     temp1[0][0]= White[0][0];
		 temp1[0][1]= White[0][1];
		 temp1[0][2]= White[0][2];
		 
		 White[0][0]=temp1[0][2];
		 White[0][1]=White[1][2];
		 White[0][2]=White[2][2];
						 
		 White[1][2]=White[2][1];
		 White[2][2]=White[2][0];
		
		 White[2][1]= White[1][0];
		 White[2][0]= temp1[0][0];
		 
		 White[1][0]= temp1[0][1];
	
	  
	  
	  
}





public static void moveLP()
{
	
	String [][] temp;
	
	 temp = new String[3][3];
	 
	 
	 String [][] temp1;
		
	 temp1 = new String[3][3];
	 
	 temp[0][0]= White[0][0];
	 temp[1][0]= White[1][0];
	 temp[2][0]= White[2][0];
	 
	 White[0][0]=Green[0][0];
	 White[1][0]=Green[1][0];
	 White[2][0]=Green[2][0];
	  
	 Green[0][0]=Yellow[0][0];
	 Green[1][0]=Yellow[1][0];
	 Green[2][0]=Yellow[2][0];
	  
	 Yellow[0][0]=Blue[2][2];
	 Yellow[1][0]=Blue[1][2];
	 Yellow[2][0]=Blue[0][2];
	  
	 Blue[2][2]= temp[0][0];
	 Blue[1][2]= temp[1][0];
	 Blue[0][2]= temp[2][0];
	  
	  
	//for updating ORANGE
	  
     temp1[0][0]= Orange[0][0];
	 temp1[0][1]= Orange[0][1];
	 temp1[0][2]= Orange[0][2];
	 
	 Orange[0][0]=temp1[0][2];
	 Orange[0][1]=Orange[1][2];
	 Orange[0][2]=Orange[2][2];
					 
	 Orange[1][2]=Orange[2][1];
	 Orange[2][2]=Orange[2][0];
	
	 Orange[2][1]= Orange[1][0];
	 Orange[2][0]= temp1[0][0];
	 
	 Orange[1][0]= temp1[0][1];

	 
	 
	 
	 
}




public static void moveL()
{
	
	String [][] temp;
	
	 temp = new String[3][3];
	 

	 String [][] temp1;
		
	 temp1 = new String[3][3];
	 
	 temp[0][0]= White[0][0];
	 temp[1][0]= White[1][0];
	 temp[2][0]= White[2][0];
	 
	 White[0][0]=Blue[2][2];
	 White[1][0]=Blue[1][2];
	 White[2][0]=Blue[0][2];
	  
	 Blue[2][2]=Yellow[0][0];
	 Blue[1][2]=Yellow[1][0];
	 Blue[0][2]=Yellow[2][0];
	  
	 Yellow[0][0]=Green[0][0];
	 Yellow[1][0]=Green[1][0];
	 Yellow[2][0]=Green[2][0];
	  
	 Green[0][0]= temp[0][0];
	 Green[1][0]= temp[1][0];
	 Green[2][0]= temp[2][0];
	 
	
	  
	  
	 //for updating Orange
	  
     temp1[0][0]= Orange[0][0];
	 temp1[0][1]= Orange[0][1];
	 temp1[0][2]= Orange[0][2];
	 
	 Orange[0][0]=Orange[2][0];
	 Orange[0][1]=Orange[1][0];
	 Orange[0][2]=temp1[0][0];
					 
	 Orange[2][0]=Orange[2][2];
	 Orange[1][0]=Orange[2][1];
	
	 Orange[2][2]= temp1[0][2];
	 Orange[2][1]= Orange[1][2];
	 
	 Orange[1][2]= temp1[0][1];

	  
	  
	  
}





public static void moveD()
{
	
	String [][] temp;
	
	 temp = new String[3][3];
	 
	 
	 String [][] temp1;
		
	 temp1 = new String[3][3];
	 
	 temp[2][0]= Green[2][0];
	 temp[2][1]= Green[2][1];
	 temp[2][2]= Green[2][2];
	 
	 Green[2][0]=Orange[2][0];
	 Green[2][1]=Orange[2][1];
	 Green[2][2]=Orange[2][2];
	  
	 Orange[2][0]=Blue[2][0];
	 Orange[2][1]=Blue[2][1];
	 Orange[2][2]=Blue[2][2];
	  
	 Blue[2][0]=Red[2][0];
	 Blue[2][1]=Red[2][1];
	 Blue[2][2]=Red[2][2];
	  
	 Red[2][0]= temp[2][0];
	 Red[2][1]= temp[2][1];
	 Red[2][2]= temp[2][2];
	  
	  
	  
	  //for updating yellow
	  
	     temp1[0][0]= Yellow[0][0];
		 temp1[0][1]= Yellow[0][1];
		 temp1[0][2]= Yellow[0][2];
		 
		 Yellow[0][0]=Yellow[2][0];
		 Yellow[0][1]=Yellow[1][0];
		 Yellow[0][2]=temp1[0][0];
						 
		 Yellow[2][0]=Yellow[2][2];
		 Yellow[1][0]=Yellow[2][1];
		
		 Yellow[2][2]= temp1[0][2];
		 Yellow[2][1]= Yellow[1][2];
		 
		 Yellow[1][2]= temp1[0][1];
	
}

public static void moveDP()
{
	
	String [][] temp;
	
	 temp = new String[3][3];
	 

	 String [][] temp1;
		
	 temp1 = new String[3][3];
	 
	 temp[2][0]= Green[2][0];
	 temp[2][1]= Green[2][1];
	 temp[2][2]= Green[2][2];
	 
	 Green[2][0]=Red[2][0];
	 Green[2][1]=Red[2][1];
	 Green[2][2]=Red[2][2];
	  
	 Red[2][0]=Blue[2][0];
	 Red[2][1]=Blue[2][1];
	 Red[2][2]=Blue[2][2];
	  
	 Blue[2][0]=Orange[2][0];
	 Blue[2][1]=Orange[2][1];
	 Blue[2][2]=Orange[2][2];
	  
	 Orange[2][0]= temp[2][0];
	 Orange[2][1]= temp[2][1];
	 Orange[2][2]= temp[2][2];
	 
	
	  
	  
	  //for updating yellow
	  
	     temp1[0][0]= Yellow[0][0];
		 temp1[0][1]= Yellow[0][1];
		 temp1[0][2]= Yellow[0][2];
		 
		 Yellow[0][0]=temp1[0][2];
		 Yellow[0][1]=Yellow[1][2];
		 Yellow[0][2]=Yellow[2][2];
						 
		 Yellow[1][2]=Yellow[2][1];
		 Yellow[2][2]=Yellow[2][0];
		
		 Yellow[2][1]= Yellow[1][0];
		 Yellow[2][0]= temp1[0][0];
		 
		 Yellow[1][0]= temp1[0][1];
	
	  
	  
	  
}


public static void moveB()
{
	
	String [][] temp;
	
	 temp = new String[3][3];
	 
	 
	 String [][] temp1;
		
	 temp1 = new String[3][3];
	 
	 temp[0][0]= White[0][0];
	 temp[0][1]= White[0][1];
	 temp[0][2]= White[0][2];
	 
	 White[0][0]=Red[0][2];
	 White[0][1]=Red[1][2];
	 White[0][2]=Red[2][2];
	  
	 Red[0][2]=Yellow[2][2];
	 Red[1][2]=Yellow[2][1];
	 Red[2][2]=Yellow[2][0];
	  
	 Yellow[2][2]=Orange[2][0];
	 Yellow[2][1]=Orange[1][0];
	 Yellow[2][0]=Orange[0][0];
	  
	 Orange[2][0]= temp[0][0];
	 Orange[1][0]= temp[0][1];
	 Orange[0][0]= temp[0][2];
	  
	  
	  
	  //for updating Blue
	  
	     temp1[0][0]= Blue[0][0];
		 temp1[0][1]= Blue[0][1];
		 temp1[0][2]= Blue[0][2];
		 
		 Blue[0][0]=Blue[2][0];
		 Blue[0][1]=Blue[1][0];
		 Blue[0][2]=temp1[0][0];
						 
		 Blue[2][0]=Blue[2][2];
		 Blue[1][0]=Blue[2][1];
		
		 Blue[2][2]= temp1[0][2];
		 Blue[2][1]= Blue[1][2];
		 
		 Blue[1][2]= temp1[0][1];
	
}




public static void moveBP()
{
	
	String [][] temp;
	
	 temp = new String[3][3];
	 

	 String [][] temp1;
		
	 temp1 = new String[3][3];
	 
	 temp[0][0]= White[0][0];
	 temp[0][1]= White[0][1];
	 temp[0][2]= White[0][2];
	 
	 White[0][0]=Orange[2][0];
	 White[0][1]=Orange[1][0];
	 White[0][2]=Orange[0][0];
	  
	 Orange[2][0]=Yellow[2][2];
	 Orange[1][0]=Yellow[2][1];
	 Orange[0][0]=Yellow[2][0];
	  
	 Yellow[2][2]=Red[0][2];
	 Yellow[2][1]=Red[1][2];
	 Yellow[2][0]=Red[2][2];
	  
	 Red[0][2]= temp[0][0];
	 Red[1][2]= temp[0][1];
	 Red[2][2]= temp[0][2];
	 
	
	  
	  
	  //for updating Blue
	  
	     temp1[0][0]= Blue[0][0];
		 temp1[0][1]= Blue[0][1];
		 temp1[0][2]= Blue[0][2];
		 
		 Blue[0][0]=temp1[0][2];
		 Blue[0][1]=Blue[1][2];
		 Blue[0][2]=Blue[2][2];
						 
		 Blue[1][2]=Blue[2][1];
		 Blue[2][2]=Blue[2][0];
		
		 Blue[2][1]= Blue[1][0];
		 Blue[2][0]= temp1[0][0];
		 
		 Blue[1][0]= temp1[0][1];
	
	  
	  
	  
}



public static void FindEdges()
{
	String [][] PosEd;
	
	 PosEd = new String [1][2];
	 ed= new String[1][12];
	 
	 
	 PosEd[0][0] = White[0][1];
	 PosEd[0][1] = Blue[0][1];
	
	 
	  ed[0][n]=  (PosEd[0][0] +  PosEd[0][1] );
	  
	     PosEd[0][0] = White[1][2];
		 PosEd[0][1] = Red[0][1];
		 n++;
		 
		     ed[0][n]=  (PosEd[0][0] +  PosEd[0][1] );
	  
	  
	  
		  PosEd[0][0] = White[2][1];
	      PosEd[0][1] = Green[0][1];
		  n++;
			 
			  ed[0][n]=  (PosEd[0][0] +  PosEd[0][1] );  
		  
		  
		  PosEd[0][0] = White[1][0];
		  PosEd[0][1] = Orange[0][1];
		  n++;
				 
			  ed[0][n]=  (PosEd[0][0] +  PosEd[0][1] );  
			  
			  
	          PosEd[0][0] = Yellow[0][1];
			  PosEd[0][1] = Green[2][1];
			  n++;
					 
				  ed[0][n]=  (PosEd[0][0] +  PosEd[0][1] );  
			  
				  
		          PosEd[0][0] = Yellow[1][2];
				  PosEd[0][1] = Red[2][1];
				  n++;
						 
					  ed[0][n]=  (PosEd[0][0] +  PosEd[0][1] );  
				  
					  
			          PosEd[0][0] = Yellow[2][1];
					  PosEd[0][1] = Blue[2][1];
					  n++;
							 
						  ed[0][n]=  (PosEd[0][0] +  PosEd[0][1] );  
				  
			  
						  PosEd[0][0] = Yellow[1][0];
						  PosEd[0][1] = Orange[2][1];
						  n++;
								 
							  ed[0][n]=  (PosEd[0][0] +  PosEd[0][1] );	  
				   		  
						  
							  PosEd[0][0] = Green[1][0];
							  PosEd[0][1] = Orange[1][2];
							  n++;
									 
								  ed[0][n]=  (PosEd[0][0] +  PosEd[0][1] );	    
							  
							  
								  PosEd[0][0] = Green[1][2];
								  PosEd[0][1] = Red[1][0];
								  n++;
										 
									  ed[0][n]=  (PosEd[0][0] +  PosEd[0][1] );	    
							  
							  
									  PosEd[0][0] = Blue[1][0];
									  PosEd[0][1] = Red[1][2];
									  n++;
											 
										  ed[0][n]=  (PosEd[0][0] +  PosEd[0][1] );	  
									  
										  
								  PosEd[0][0] = Blue[1][2];
								  PosEd[0][1] = Orange[1][0];
								  n++;
												 
									ed[0][n]=  (PosEd[0][0] +  PosEd[0][1] );	  
										  
									  n=0;
									  
	/*					  
		  System.out.println("the edges are  ");
		  for(int m=0;m<12;m++)
		  {
			  
			  //System.out.print(ed[0][m] +",");
			  edges=ed[0][m];
			  
			  System.out.print(edges);
			  
		  }
		
	  */
		 
	  
	
}





public static void solveYOBandOB()
{
	 System.out.println("find the location of YOB corner and orientation  ");
	 int t=0;
	 
	 
	 while(t<8)
	 {
		 corners=cor[0][t];
		 System.out.print(corners+",");
		 
		 if(cor[0][t].equals("YBO")|| cor[0][t].equals("OYB")||cor[0][t].equals("BOY")||cor[0][t].equals("YOB")||cor[0][t].equals("OBY")||cor[0][t].equals("BYO"))
		 {
			 cor1=cor[0][t];
			 F2LCor1=cor1;
			 System.out.println(F2LCor1);
			 F2LCorpos1=t;
			 System.out.println(F2LCorpos1);
			 
			 if(F2LCorpos1>3)
			 {
				 switch(F2LCorpos1)
				 
				 {
				 
						 case 4:
							 
						 {
							 System.out.println("L' U' L");
							 moveLP();
							 moveUP();
							 moveL();
							 
						 }
						 break;
						 
						 case 5:
						 {
							 
							 System.out.println("R U R'");
							 moveR();
							 moveU();
							 moveRP();
						 }
				         break;
				         
				         
						 case 6:
						 {
							 
							 System.out.println("R' U R");
							 moveRP();
							 moveU();
							 moveR();
						 }
				         break;
				         
				         
						 case 7:
						 {
							 
							 System.out.println("L U L'");
							 moveL();
							 moveU();
							 moveLP();
						 }
				         break;
				         
				        
				 }
				 
				 
			 }
		 }
		 
		 t++;
		 
		 
	 }
	 
	
	 
	 FindCorners();
	 
	 
	 System.out.println("the updated location of YOB corner and orientation  ");
	int  f=0;
	 
	 while(f<8)
	 {
		 corners=cor[0][f];
		 
		 if(cor[0][f].equals("YBO")|| cor[0][f].equals("OYB")||cor[0][f].equals("BOY")||cor[0][f].equals("YOB")||cor[0][f].equals("OBY")||cor[0][f].equals("BYO"))
		 {
			 cor1=cor[0][f];
			 F2LCor1=cor1;
			 System.out.println(F2LCor1);
			 F2LCorpos1=f;
			 System.out.println(F2LCorpos1);
			 
			 
		}
		 f++;
		 
		 
	 }
	 
	 
 FindEdges();
	 
	 
	 System.out.println("the location of OB edge is  ");
	int  s=0;
	 
	 while(s<12)
	 {
		 edges=ed[0][s];
		 
		 if(ed[0][s].equals("BO")|| ed[0][s].equals("OB"))
		 {
			 ed1=ed[0][s];
			 F2Led1=ed1;
			 System.out.println(F2Led1);
			 F2LEdpos1=s;
			 System.out.println(F2LEdpos1);
			 
			 if(F2LEdpos1>7)
			 {
				 switch(F2LEdpos1)
				 
				 {
				 
						 case 8:
	
							 
							 
						 {
							 if(F2LCorpos1==3)
							 {
								 
								 System.out.println("L' U U L");
								 moveLP();
								 moveU();
								 moveU();
								 moveL();
								 
							 }
							 
							 else
							 {
								 System.out.println("L'  U' L");
								 moveLP();
								
								 moveUP();
								 moveL();
								  
								 
							 }
						 }
						 break;
						 
						 case 9:
						 {
							 
							 if(F2LCorpos1==2)
							 {
								 
								 System.out.println("R U U R'");
								 moveR();
								 moveU();
								 moveU();
								 moveRP();
								 
							 }
							 
							 else
							 {
								 System.out.println("R  U R'");
								 moveR();
								
								 moveU();
								 moveRP();
								  
								 
							 }
						 }
				         break;
				         
				         
						 case 10:
						 {
							 
							 if(F2LCorpos1==1)
							 {
								 
								 System.out.println("R' U U R");
								 moveRP();
								 moveU();
								 moveU();
								 moveR();
								 
							 }
							 
							 else
							 {
								 System.out.println("R'  U' R");
								 moveRP();
								
								 moveUP();
								 moveR();
								  
								 
							 }
						 }
				         break;
				         
				         
						 case 11:
						 {
							 
							 if(F2LCorpos1==0)
							 {
								 
								 System.out.println("L U U L'");
								 moveL();
								 moveU();
								 moveU();
								 moveLP();
								 
							 }
							 
							 else
							 {
								 System.out.println("L U L'");
								 moveL();
								
								 moveU();
								 moveLP();
								  
								 
							 }
						 }
				         break;
				         
				        
				 }
				 
				 
			 }
			 
			 
			 
			 
			 
		}
		 s++;
		
		 
		 
	 }
	  
	 
	 
	 
	 FindCorners();
	 
	 
	 System.out.println("the updated location of YOB corner and orientation  ");
	  f=0;
	 
	 while(f<8)
	 {
		 corners=cor[0][f];
		 
		 if(cor[0][f].equals("YBO")|| cor[0][f].equals("OYB")||cor[0][f].equals("BOY")||cor[0][f].equals("YOB")||cor[0][f].equals("OBY")||cor[0][f].equals("BYO"))
		 {
			 cor1=cor[0][f];
			 F2LCor1=cor1;
			 System.out.println(F2LCor1);
			 F2LCorpos1=f;
			 System.out.println(F2LCorpos1);
			 
			 
		}
		 f++;
		 
		 
	 }
	 	 
	
	 
	 FindEdges();
	 
	 
	 System.out.println("the updated location of OB edge and orientation  ");
	  s=0;
	 
	 while(s<12)
	 {
		 edges=ed[0][s];
		 
		 if(ed[0][s].equals("BO")|| ed[0][s].equals("OB"))
		 {
			 ed1=ed[0][s];
			 F2Led1=ed1;
			 System.out.println(F2Led1);
			 F2LEdpos1=s;
			 System.out.println(F2LEdpos1);
			 
			 
		}
		 s++;
		 
		 
	 }
	 
	 
	System.out.println("now i know the location of the corner and the edge");
	
	 System.out.println("location of corner"+F2LCorpos1);
	 System.out.println("corner is"+F2LCor1);
	 System.out.println("location of edge"+F2LEdpos1);
	 System.out.println("edge is"+F2Led1);
	 
	 
	 int YOBOBpos= 10*F2LCorpos1+ F2LEdpos1;
	 System.out.println("the case to be executed");
	 System.out.println(YOBOBpos);
     String YOBOB=	 F2LCor1+F2Led1;
     
     switch(YOBOBpos)
     {
     
			     case 12:
			     {
			    	
			    	 if(White[0][2].equals("O")&&Red[0][2].equals("B")&&Blue[0][0].equals("Y")&&White[2][1].equals("B")&&Green[0][1].equals("O"))
			    	 {
			    		 
			    		 System.out.println(" R U R' U' L U L'  ");
			    		 moveR();
			    		 moveU();
			    		 moveRP();
			    		 moveUP();
			    		 moveL();
			    		 moveU();
			    		 moveLP();
			    		 
			    	 }
			    	 
			    	 if(White[0][2].equals("B")&&Red[0][2].equals("Y")&&Blue[0][0].equals("O")&&White[2][1].equals("B")&&Green[0][1].equals("O"))
			    	 {
			    		 
			    		 System.out.println(" R U U R' L U' L'  ");
			    		 moveR();
			    		 moveU();
			    		 moveU();
			    		 moveRP();
			    		 moveL();
			    		 moveUP();
			    		 moveLP(); 
			    	 }
			    	 //YB
			    	 
			    	 if(White[0][2].equals("Y")&&Red[0][2].equals("O")&&Blue[0][0].equals("B")&&White[2][1].equals("B")&&Green[0][1].equals("O"))
			    	 {
			    		 
			    		 System.out.println(" U L U L L B L B'  ");
			    		 moveU();
			    		 moveL();
			    		 moveU();
			    		 moveL();
			    		 moveL();
			    		 moveB();
			    		 moveL(); 
			    		 moveBP();
			    	 }
			    	 
			    	 //YO
			    	 if(White[0][2].equals("Y")&&Red[0][2].equals("O")&&Blue[0][0].equals("B")&&White[2][1].equals("O")&&Green[0][1].equals("B"))
			    	 {
			    		 
			    		 System.out.println(" U U B' U U B B L' B L ");
			    		 moveU();
			    		 moveU();
			    		 moveBP();
			    		 moveU();
			    		 moveU();
			    		 moveB();
			    		 moveB(); 
			    		 moveLP();
			    		 moveB();
			    		 moveL();
			    	 }
			    	 
			    	
			    	 //O O
			    	 if(White[0][2].equals("O")&&Red[0][2].equals("B")&&Blue[0][0].equals("Y")&&White[2][1].equals("O")&&Green[0][1].equals("B"))
			    	 {
			    		 
			    		 System.out.println(" U R' U' R U B' U B ");
			    		 moveU();
			    		 moveRP();
			    		 moveUP();
			    		 moveR();
			    		 moveU();
			    		 moveBP();
			    		 moveU(); 
			    		 moveB();
			    		
			    		
			    	 }
			    	 
			    	 
			    	 
			    	 //BO
			    	 if(White[0][2].equals("B")&&Red[0][2].equals("Y")&&Blue[0][0].equals("O")&&White[2][1].equals("O")&&Green[0][1].equals("B"))
			    	 {
			    		 
			    		 System.out.println(" R' U R B' U B");
			    		 
			    		 moveRP();
			    		 moveU();
			    		 moveR();
			    		
			    		 moveBP();
			    		 moveU(); 
			    		 moveB();
			    		
			    		
			    	 }
			    	 
			    	 
			    	 
			     }
			     break;
			     
			     
			     case 1:
			     {
			    	//OB
			    	 if(White[0][0].equals("O")&&Blue[0][2].equals("B")&&Orange[0][0].equals("Y")&&White[1][2].equals("B")&&Red[0][1].equals("O"))
			    	// if(White[0][0].equals("O")&&White[1][2].equals("B"))
			    	 {

				    	 System.out.println("U");
				    	 moveU();
			    		 System.out.println(" R U R' U' L U L'  ");
			    		 moveR();
			    		 moveU();
			    		 moveRP();
			    		 moveUP();
			    		 moveL();
			    		 moveU();
			    		 moveLP();
			    		 
			    	 }
			    	 
			    	 if(White[0][0].equals("B")&&Blue[0][2].equals("Y")&&Orange[0][0].equals("O")&&White[1][2].equals("O")&&Red[0][1].equals("O"))
			    	 //if(White[0][0].equals("B")&&White[1][2].equals("B"))
			    	 {

				    	 System.out.println("U");
				    	 moveU();
			    		 System.out.println(" R U U R' L U' L'  ");
			    		 moveR();
			    		 moveU();
			    		 moveU();
			    		 moveRP();
			    		 moveL();
			    		 moveUP();
			    		 moveLP(); 
			    	 }
			    	 
			    	 if(White[0][0].equals("Y")&&Blue[0][2].equals("O")&&Orange[0][0].equals("B")&&White[1][2].equals("B")&&Red[0][1].equals("O"))
			    	 //if(White[0][0].equals("Y")&&White[1][2].equals("B"))
			    	 {

				    	 System.out.println("U");
				    	 moveU();
			    		 System.out.println(" U L U L L B L B'  ");
			    		 moveU();
			    		 moveL();
			    		 moveU();
			    		 moveL();
			    		 moveL();
			    		 moveB();
			    		 moveL(); 
			    		 moveBP();
			    	 }
			    	 
			    	 if(White[0][0].equals("Y")&&Blue[0][2].equals("O")&&Orange[0][0].equals("B")&&White[1][2].equals("O")&&Red[0][1].equals("B"))
			    	 //if(White[0][0].equals("Y")&&White[1][2].equals("O"))
			    	 {

				    	
			    		 System.out.println(" U' B' U U B B L' B L ");
			    		 
			    		 moveUP();
			    		 moveBP();
			    		 moveU();
			    		 moveU();
			    		 moveB();
			    		 moveB(); 
			    		 moveLP();
			    		 moveB();
			    		 moveL();
			    	 }
			    	 
			    	
			    	 if(White[0][0].equals("O")&&Blue[0][2].equals("B")&&Orange[0][0].equals("Y")&&White[1][2].equals("O")&&Red[0][1].equals("B"))
			    	 //if(White[0][0].equals("O")&&White[1][2].equals("O"))
			    	 {

				    	 System.out.println("U");
				    	 moveU();
			    		 System.out.println(" U R' U' R U B' U B ");
			    		 moveU();
			    		 moveRP();
			    		 moveUP();
			    		 moveR();
			    		 moveU();
			    		 moveBP();
			    		 moveU(); 
			    		 moveB();
			    		
			    		
			    	 }
			    	 
			    	 
			    	 
			    	 if(White[0][0].equals("B")&&Blue[0][2].equals("Y")&&Orange[0][0].equals("O")&&White[1][2].equals("O")&&Red[0][1].equals("B"))
			    	// if(White[0][0].equals("B")&&White[1][2].equals("O"))
			    	 {

				    	 
			    		 System.out.println("  B' U B");
			    		 
			    		
			    		
			    		 moveBP();
			    		 moveU(); 
			    		 moveB();
			    		
			    		
			    	 }
			    	 
			    	 
			    	 
			     }
			     break;
			     
			     
			     case 23:
			     {
			    	
			    	 if(White[2][2].equals("O")&&Green[0][2].equals("B")&&Red[0][0].equals("Y")&&White[1][0].equals("B")&&Orange[0][1].equals("O"))
			    	 //if(White[2][2].equals("O")&&White[1][0].equals("B"))
			    	 {
			    		 System.out.println("U'");
				    	 moveUP();
			    		 System.out.println(" R U R' U' L U L'  ");
			    		 moveR();
			    		 moveU();
			    		 moveRP();
			    		 moveUP();
			    		 moveL();
			    		 moveU();
			    		 moveLP();
			    		 
			    	 }
			    	 
			    	 if(White[2][2].equals("B")&&Green[0][2].equals("Y")&&Red[0][0].equals("O")&&White[1][0].equals("B")&&Orange[0][1].equals("O"))
			    	 //if(White[2][2].equals("B")&&White[1][0].equals("B"))
			    	 {
			    		 
			    		 System.out.println("U'");
				    	 moveUP();
			    		 System.out.println(" R U U R' L U' L'  ");
			    		 moveR();
			    		 moveU();
			    		 moveU();
			    		 moveRP();
			    		 moveL();
			    		 moveUP();
			    		 moveLP(); 
			    	 }
			    	 
			    	 if(White[2][2].equals("Y")&&Green[0][2].equals("O")&&Red[0][0].equals("B")&&White[1][0].equals("B")&&Orange[0][1].equals("O"))
			    	 //if(White[2][2].equals("Y")&&White[1][0].equals("B"))
			    	 {
			    		 
			    		 System.out.println("L U L L B L B'  ");
			    		
			    		 moveL();
			    		 moveU();
			    		 moveL();
			    		 moveL();
			    		 moveB();
			    		 moveL(); 
			    		 moveBP();
			    	 }
			    	 
			    	 if(White[2][2].equals("Y")&&Green[0][2].equals("O")&&Red[0][0].equals("B")&&White[1][0].equals("O")&&Orange[0][1].equals("B"))
			    	// if(White[2][2].equals("Y")&&White[1][0].equals("O"))
			    	 {
			    		 
			    		 System.out.println(" U B' U U B B L' B L ");
			    		 
			    		 moveU();
			    		 moveBP();
			    		 moveU();
			    		 moveU();
			    		 moveB();
			    		 moveB(); 
			    		 moveLP();
			    		 moveB();
			    		 moveL();
			    	 }
			    	 
			    	
			    	 if(White[2][2].equals("O")&&Green[0][2].equals("B")&&Red[0][0].equals("Y")&&White[1][0].equals("O")&&Orange[0][1].equals("B"))
			    	// if(White[2][2].equals("O")&&White[1][0].equals("O"))
			    	 {
			    		
			    		 System.out.println(" R' U' R U B' U B ");
			    		
			    		 moveRP();
			    		 moveUP();
			    		 moveR();
			    		 moveU();
			    		 moveBP();
			    		 moveU(); 
			    		 moveB();
			    		
			    		
			    	 }
			    	 
			    	 
			    	 
			    	 if(White[2][2].equals("B")&&Green[0][2].equals("Y")&&Red[0][0].equals("O")&&White[1][0].equals("O")&&Orange[0][1].equals("B"))
			    	 //if(White[2][2].equals("B")&&White[1][0].equals("O"))
			    	 {
			    		 System.out.println("U'");
				    	 moveUP();
			    		 System.out.println(" R' U R B' U B");
			    		 
			    		 moveRP();
			    		 moveU();
			    		 moveR();
			    		
			    		 moveBP();
			    		 moveU(); 
			    		 moveB();
			    		
			    		
			    	 }
			    	 
			    	 
			    	 
			     }
			     break;
			     
			     
			     case 30:
			     {
			    	
			    	 
			    	 
			    	 if(White[2][0].equals("O")&&Orange[0][2].equals("B")&&Green[0][0].equals("Y")&&White[0][1].equals("B")&&Blue[0][1].equals("O"))
			    	 //if(White[2][0].equals("O")&&White[0][1].equals("B"))
			    	 {
			    		 System.out.println("U U");
				    	 moveU();
				    	 moveU();
			    		 System.out.println(" R U R' U' L U L'  ");
			    		 moveR();
			    		 moveU();
			    		 moveRP();
			    		 moveUP();
			    		 moveL();
			    		 moveU();
			    		 moveLP();
			    		 
			    	 }
			    	 if(White[2][0].equals("B")&&Orange[0][2].equals("Y")&&Green[0][0].equals("O")&&White[0][1].equals("B")&&Blue[0][1].equals("O"))
			    	 //if(White[2][0].equals("B")&&White[0][1].equals("B"))
			    	 {
			    		 System.out.println("U U");
				    	 moveU();
				    	 moveU();
			    		 System.out.println(" R U U R' L U' L'  ");
			    		 moveR();
			    		 moveU();
			    		 moveU();
			    		 moveRP();
			    		 moveL();
			    		 moveUP();
			    		 moveLP(); 
			    	 }
			    	 
			    	 if(White[2][0].equals("Y")&&Orange[0][2].equals("O")&&Green[0][0].equals("B")&&White[0][1].equals("B")&&Blue[0][1].equals("O"))
			    	// if(White[2][0].equals("Y")&&White[0][1].equals("B"))
			    	 {
			    		
			    		 System.out.println(" U' L U L L B L B'  ");
			    		 moveUP();
			    		 moveL();
			    		 moveU();
			    		 moveL();
			    		 moveL();
			    		 moveB();
			    		 moveL(); 
			    		 moveBP();
			    	 }
			    	 
			    	 if(White[2][0].equals("Y")&&Orange[0][2].equals("O")&&Green[0][0].equals("B")&&White[0][1].equals("O")&&Blue[0][1].equals("B"))
			    	 //if(White[2][0].equals("Y")&&White[0][1].equals("O"))
			    	 {
			    		
			    		 System.out.println("B' U U B B L' B L ");
			    		
			    		 moveBP();
			    		 moveU();
			    		 moveU();
			    		 moveB();
			    		 moveB(); 
			    		 moveLP();
			    		 moveB();
			    		 moveL();
			    	 }
			    	 
			    	
			    	 if(White[2][0].equals("O")&&Orange[0][2].equals("B")&&Green[0][0].equals("Y")&&White[0][1].equals("O")&&Blue[0][1].equals("B"))
			    	// if(White[2][0].equals("O")&&White[0][1].equals("O"))
			    	 {
			    		
			    		 System.out.println(" U' R' U' R U B' U B ");
			    		 moveUP();
			    		 moveRP();
			    		 moveUP();
			    		 moveR();
			    		 moveU();
			    		 moveBP();
			    		 moveU(); 
			    		 moveB();
			    		
			    		
			    	 }
			    	 
			    	 
			    	 
			    	 if(White[2][0].equals("B")&&Orange[0][2].equals("Y")&&Green[0][0].equals("O")&&White[0][1].equals("O")&&Blue[0][1].equals("B"))
			    	 //if(White[2][0].equals("B")&&White[0][1].equals("O"))
			    	 {
			    		 System.out.println("U U");
				    	 moveU();
				    	 moveU();
			    		 System.out.println(" R' U R B' U B");
			    		 
			    		 moveRP();
			    		 moveU();
			    		 moveR();
			    		
			    		 moveBP();
			    		 moveU(); 
			    		 moveB();
			    		
			    		
			    	 }
			    	 
			    	 
			    	 
			     }
			     break;
			     
			     
			     
			     case 0:
			     {
			    	
			    	 if(White[0][0].equals("Y")&&Blue[0][2].equals("O")&&Orange[0][0].equals("B")&&White[0][1].equals("B")&&Blue[0][1].equals("O"))
			    	 //if(White[0][0].equals("Y")&&White[0][1].equals("B"))
			    	 {
			    		 
			    		 System.out.println(" L' U L U U L U L L B L B' ");
			    		 moveLP();
			    		 moveU();
			    		 moveL();
			    		 moveU();
			    		 moveU();
			    		 moveL();
			    		 moveU();
			    		 moveL();
			    		 moveL();
			    		 moveB();
			    		 moveL();
			    		 moveBP();
			    		
			    		 
			    	 }
			    	 if(White[0][0].equals("B")&&Blue[0][2].equals("Y")&&Orange[0][0].equals("O")&&White[0][1].equals("B")&&Blue[0][1].equals("O"))
			    	 //if(White[0][0].equals("B")&&White[0][1].equals("B"))
			    	 {
			    		 
			    		 System.out.println("B' U B U U L U L'");
			    		 moveBP();
			    		 moveU();
			    		 moveB();
			    		 moveU();
			    		 moveU();
			    		 moveL();
			    		 moveU(); 
			    		 moveLP(); 
			    	 }
			    	 
			    	 if(White[0][0].equals("O")&&Blue[0][2].equals("B")&&Orange[0][0].equals("Y")&&White[0][1].equals("B")&&Blue[0][1].equals("O"))
			    	 //if(White[0][0].equals("O")&&White[0][1].equals("B"))
			    	 {
			    		 
			    		 System.out.println(" U B' U U B U' L U L' ");
			    		 moveU();
			    		 moveBP();
			    		 moveU();
			    		 moveU();
			    		 moveB();
			    		 moveUP();
			    		 moveL(); 
			    		 moveU(); 
			    		 moveLP(); 
			    		
			    	 }
			    	 
			    	 if(White[0][0].equals("Y")&&Blue[0][2].equals("O")&&Orange[0][0].equals("B")&&White[0][1].equals("O")&&Blue[0][1].equals("B"))
			    	// if(White[0][0].equals("Y")&&White[0][1].equals("O"))
			    	 {
			    		 
			    		 System.out.println(" B' U U B U B' U' B ");
			    		 moveBP();
			    		 moveU();
			    		 moveU();
			    		 moveB();
			    		 moveU();
			    		 moveBP();
			    		 moveUP(); 
			    		 moveB();
			    		
			    	 }
			    	 
			    	
			    	 if(White[0][0].equals("O")&&Blue[0][2].equals("B")&&Orange[0][0].equals("Y")&&White[0][1].equals("O")&&Blue[0][1].equals("B"))
			    	 //if(White[0][0].equals("O")&&White[0][1].equals("O"))
			    	 {
			    		 
			    		 System.out.println(" U' B' U B");
			    		 
			    		 
			    		 moveUP();
			    		 moveBP();
			    		 moveU(); 
			    		 moveB();
			    		
			    	 }
			    	 
			    	 
			    	 
			    	 if(White[0][0].equals("B")&&Blue[0][2].equals("Y")&&Orange[0][0].equals("O")&&White[0][1].equals("O")&&Blue[0][1].equals("B"))
			    	 //if(White[0][0].equals("B")&&White[0][1].equals("O"))
			    	 {
			    		 
			    		 System.out.println(" U B' U B U' B' U' B");
			    		 
			    		 moveU();
			    		 moveBP();
			    		 moveU();
			    		 moveB();
			    		 moveUP();
			    		 moveBP();
			    		 moveUP();
			    		 moveB();
			    		
			    		
			    	 }
			    	 
			    	 
			    	 
			     }
			     break;  
			     
			   
			     
			     case 11:
			     {
			    	
			    	 
			    	 ///////
			    	 if(White[0][2].equals("Y")&&Red[0][2].equals("O")&&Blue[0][0].equals("B")&&White[1][2].equals("B")&&Red[0][1].equals("O"))
			    	 //if(White[0][2].equals("Y")&&White[1][2].equals("B"))
			    	 {
			    		 
			    		 System.out.println(" U' ");
				    	 moveUP();
			    		 
			    		 
			    		 System.out.println(" L' U L U U L U L L B L B' ");
			    		 moveLP();
			    		 moveU();
			    		 moveL();
			    		 moveU();
			    		 moveU();
			    		 moveL();
			    		 moveU();
			    		 moveL();
			    		 moveL();
			    		 moveB();
			    		 moveL();
			    		 moveBP();
			    		
			    		 
			    	 }
			    	 if(White[0][2].equals("B")&&Red[0][2].equals("Y")&&Blue[0][0].equals("O")&&White[1][2].equals("B")&&Red[0][1].equals("O"))
			    	 //if(White[0][2].equals("B")&&White[1][2].equals("B"))
			    	 {
			    		 
			    		 
			    		 System.out.println(" U' ");
				    	 moveUP();
			    		 
			    		 System.out.println("B' U B U U L U L'");
			    		 moveBP();
			    		 moveU();
			    		 moveB();
			    		 moveU();
			    		 moveU();
			    		 moveL();
			    		 moveU(); 
			    		 moveLP(); 
			    	 }
			    	 
			    	 if(White[0][2].equals("O")&&Red[0][2].equals("B")&&Blue[0][0].equals("Y")&&White[1][2].equals("B")&&Red[0][1].equals("O"))
			    	 //if(White[0][2].equals("O")&&White[1][2].equals("B"))
			    	 {
			    		 
			    		 
			    		// System.out.println(" U' ");
				    	// moveUP();
			    		 System.out.println(" B' U U B U' L U L' ");
			    		
			    		 moveBP();
			    		 moveU();
			    		 moveU();
			    		 moveB();
			    		 moveUP();
			    		 moveL(); 
			    		 moveU(); 
			    		 moveLP(); 
			    		
			    	 }
			    	 
			    	 if(White[0][2].equals("Y")&&Red[0][2].equals("O")&&Blue[0][0].equals("B")&&White[1][2].equals("O")&&Red[0][1].equals("B"))
			    	 //if(White[0][2].equals("Y")&&White[1][2].equals("O"))
			    	 {
			    		 System.out.println(" U' ");
				    	 moveUP();
			    		 System.out.println(" B U U B' U B' U' B ");
			    		 moveB();
			    		 moveU();
			    		 moveU();
			    		 moveBP();
			    		 moveU();
			    		 moveBP();
			    		 moveUP(); 
			    		 moveB();
			    		
			    	 }
			    	 
			    	
			    	 if(White[0][2].equals("O")&&Red[0][2].equals("B")&&Blue[0][0].equals("Y")&&White[1][2].equals("O")&&Red[0][1].equals("B"))
			    	 //if(White[0][2].equals("O")&&White[1][2].equals("O"))
			    	 {
			    		 
			    		 System.out.println(" U' ");
				    	 moveUP();
			    		 System.out.println(" U' B' U B");
			    		 
			    		 
			    		 moveUP();
			    		 moveBP();
			    		 moveU(); 
			    		 moveB();
			    		
			    	 }
			    	 
			    	 
			    	 
			    	 if(White[0][2].equals("B")&&Red[0][2].equals("Y")&&Blue[0][0].equals("O")&&White[1][2].equals("O")&&Red[0][1].equals("B"))
			    	 //if(White[0][2].equals("B")&&White[1][2].equals("O"))
			    	 {
			    		 
			    		 System.out.println(" B' U B U' B' U' B");
			    		 
			    		
			    		 moveBP();
			    		 moveU();
			    		 moveB();
			    		 moveUP();
			    		 moveBP();
			    		 moveUP();
			    		 moveB();
			    		
			    		
			    	 }
			    	 
			    	 
			    	 
			     }
			     break;  
			     
			     
			     case 22:
			     {
			    	
			    	
			    	 if(White[2][2].equals("Y")&&Green[0][2].equals("O")&&Red[0][0].equals("B")&&White[2][1].equals("B")&&Green[0][1].equals("O"))
			    	 //if(White[2][2].equals("Y")&&White[2][1].equals("B"))
			    	 {
			    		 System.out.println(" U U ");
				    	 moveU();
				    	 moveU();
			    		 System.out.println(" L' U L U U L U L L B L B' ");
			    		 moveLP();
			    		 moveU();
			    		 moveL();
			    		 moveU();
			    		 moveU();
			    		 moveL();
			    		 moveU();
			    		 moveL();
			    		 moveL();
			    		 moveB();
			    		 moveL();
			    		 moveBP();
			    		
			    		 
			    	 }
			    	 if(White[2][2].equals("B")&&Green[0][2].equals("Y")&&Red[0][0].equals("O")&&White[2][1].equals("B")&&Green[0][1].equals("O"))
			    	 //if(White[2][2].equals("B")&&White[2][1].equals("B"))
			    	 {
			    		 System.out.println(" U U ");
				    	 moveU();
				    	 moveU();
			    		 System.out.println("B' U B U U L U L'");
			    		 moveBP();
			    		 moveU();
			    		 moveB();
			    		 moveU();
			    		 moveU();
			    		 moveL();
			    		 moveU(); 
			    		 moveLP(); 
			    	 }
			    	 
			    	 if(White[2][2].equals("O")&&Green[0][2].equals("B")&&Red[0][0].equals("Y")&&White[2][1].equals("B")&&Green[0][1].equals("O"))
			    	 //if(White[2][2].equals("O")&&White[2][1].equals("B"))
			    	 {
			    		 
			    		 System.out.println(" U' B' U U B U' L U L' ");
			    		 moveUP();
			    		 moveBP();
			    		 moveU();
			    		 moveU();
			    		 moveB();
			    		 moveUP();
			    		 moveL(); 
			    		 moveU(); 
			    		 moveLP(); 
			    		
			    	 }
			    	 
			    	 if(White[2][2].equals("Y")&&Green[0][2].equals("O")&&Red[0][0].equals("B")&&White[2][1].equals("O")&&Green[0][1].equals("B"))
			    	 //if(White[2][2].equals("Y")&&White[2][1].equals("O"))
			    	 {
			    		 System.out.println(" U U ");
				    	 moveU();
				    	 moveU();
			    		 System.out.println(" B U U B' U B' U' B ");
			    		 moveB();
			    		 moveU();
			    		 moveU();
			    		 moveBP();
			    		 moveU();
			    		 moveBP();
			    		 moveUP(); 
			    		 moveB();
			    		
			    	 }
			    	 
			    	
			    	 if(White[2][2].equals("O")&&Green[0][2].equals("B")&&Red[0][0].equals("Y")&&White[2][1].equals("O")&&Green[0][1].equals("B"))
			    	 //if(White[2][2].equals("O")&&White[2][1].equals("O"))
			    	 {
			    		 
			    		 System.out.println(" U B' U B");
			    		 
			    		 
			    		 moveU();
			    		 moveBP();
			    		 moveU(); 
			    		 moveB();
			    		
			    	 }
			    	 
			    	 
			    	 
			    	 if(White[2][2].equals("B")&&Green[0][2].equals("Y")&&Red[0][0].equals("O")&&White[2][1].equals("O")&&Green[0][1].equals("B"))
			    	// if(White[2][2].equals("B")&&White[2][1].equals("O"))
			    	 {
			    		
			    		 System.out.println(" U' B' U B U' B' U' B");
			    		 
			    		 moveUP();
			    		 moveBP();
			    		 moveU();
			    		 moveB();
			    		 moveUP();
			    		 moveBP();
			    		 moveUP();
			    		 moveB();
			    		
			    		
			    	 }
			    	 
			    	 
			    	 
			     }
			     break;  
			     
			     

			     case 33:
			     {
			    	
			    	 
			    	
			    	 
			    	 if(White[2][0].equals("Y")&&Orange[0][2].equals("O")&&Green[0][0].equals("B")&&White[1][0].equals("B")&&Orange[0][1].equals("O"))
			    	//(White[2][0].equals("Y")&&White[1][0].equals("B"))
			    	 {
			    		 System.out.println(" U  ");
				    	 moveU();
			    		 System.out.println(" L' U L U U L U L L B L B' ");
			    		 moveLP();
			    		 moveU();
			    		 moveL();
			    		 moveU();
			    		 moveU();
			    		 moveL();
			    		 moveU();
			    		 moveL();
			    		 moveL();
			    		 moveB();
			    		 moveL();
			    		 moveBP();
			    		
			    		 
			    	 }
			    	 if(White[2][0].equals("B")&&Orange[0][2].equals("Y")&&Green[0][0].equals("O")&&White[1][0].equals("B")&&Orange[0][1].equals("O"))
			    	 //if(White[2][0].equals("B")&&White[1][0].equals("B"))
			    	 {
			    		 System.out.println(" U  ");
				    	 moveU();
			    		 System.out.println("B' U B U U L U L'");
			    		 moveBP();
			    		 moveU();
			    		 moveB();
			    		 moveU();
			    		 moveU();
			    		 moveL();
			    		 moveU(); 
			    		 moveLP(); 
			    	 }
			    	 
			    	 if(White[2][0].equals("O")&&Orange[0][2].equals("B")&&Green[0][0].equals("Y")&&White[1][0].equals("B")&&Orange[0][1].equals("O"))
			    	// if(White[2][0].equals("O")&&White[1][0].equals("B"))
			    	 {
			    		 System.out.println(" U  ");
				    	 moveU();
			    		 System.out.println(" U B' U U B U' L U L' ");
			    		 moveU();
			    		 moveBP();
			    		 moveU();
			    		 moveU();
			    		 moveB();
			    		 moveUP();
			    		 moveL(); 
			    		 moveU(); 
			    		 moveLP(); 
			    		
			    	 }
			    	 
			    	 if(White[2][0].equals("Y")&&Orange[0][2].equals("O")&&Green[0][0].equals("B")&&White[1][0].equals("O")&&Orange[0][1].equals("B"))
			    	 //if(White[2][0].equals("Y")&&White[1][0].equals("O"))
			    	 {
			    		 System.out.println(" U  ");
				    	 moveU();
			    		 System.out.println(" B U U B' U B' U' B ");
			    		 moveB();
			    		 moveU();
			    		 moveU();
			    		 moveBP();
			    		 moveU();
			    		 moveBP();
			    		 moveUP(); 
			    		 moveB();
			    		
			    	 }
			    	 
			    	
			    	 if(White[2][0].equals("O")&&Orange[0][2].equals("B")&&Green[0][0].equals("Y")&&White[1][0].equals("O")&&Orange[0][1].equals("B"))
			    	 //if(White[2][0].equals("O")&&White[1][0].equals("O"))
			    	 {
			    		 
			    		 System.out.println("B' U B");
			    		 
			    		 
			    		
			    		 moveBP();
			    		 moveU(); 
			    		 moveB();
			    		
			    	 }
			    	 
			    	 
			    	 
			    	 if(White[2][0].equals("B")&&Orange[0][2].equals("Y")&&Green[0][0].equals("O")&&White[1][0].equals("O")&&Orange[0][1].equals("B"))
			    	// if(White[2][0].equals("B")&&White[1][0].equals("O"))
			    	 {
			    		 
			    		 System.out.println(" U  ");
				    	 moveU();
			    		 System.out.println(" U B' U B U' B' U' B");
			    		 
			    		 moveU();
			    		 moveBP();
			    		 moveU();
			    		 moveB();
			    		 moveUP();
			    		 moveBP();
			    		 moveUP();
			    		 moveB();
			    		
			    		
			    	 }
			    	 
			    	 
			    	 
			     }
			     break; 	
			     
			     
			     case 2:
			     {
			    	 if(White[0][0].equals("Y")&&Blue[0][2].equals("O")&&Orange[0][0].equals("B")&&White[2][1].equals("B")&&Green[0][1].equals("O"))
			    	 //if(White[0][0].equals("Y")&&White[2][1].equals("B"))
			    	 {
			    		 
			    		 System.out.println(" U L U U L' U L U' L' ");
			    		 moveU();
			    		 moveL();
			    		 moveU();
			    		 moveU();
			    		 moveLP();
			    		 moveU();
			    		 moveL();
			    		 moveUP();
			    		 moveLP();
			    		
			    		
			    		 
			    	 }
			    	 if(White[0][0].equals("B")&&Blue[0][2].equals("Y")&&Orange[0][0].equals("O")&&White[2][1].equals("B")&&Green[0][1].equals("O"))
			    	 //if(White[0][0].equals("B")&&White[2][1].equals("B"))
			    	 {
			    		 
			    		 System.out.println("  U' L U L' U U L U' L'   ");
			    		 moveUP();
			    		 moveL();
			    		 moveU();
			    		 moveLP();
			    		 moveU();
			    		 moveU();
			    		 moveL(); 
			    		 moveUP(); 
			    		 moveLP(); 
			    	 }
			    	 
			    	 if(White[0][0].equals("O")&&Blue[0][2].equals("B")&&Orange[0][0].equals("Y")&&White[2][1].equals("B")&&Green[0][1].equals("O"))
			    	 //if(White[0][0].equals("O")&&White[2][1].equals("B"))
			    	 {
			    		 
			    		 System.out.println(" L U L' ");
			    		 moveL();
			    		 moveU();
			    		 moveLP();
			    		
			    		
			    	 }
			    	 
			    	 if(White[0][0].equals("Y")&&Blue[0][2].equals("O")&&Orange[0][0].equals("B")&&White[2][1].equals("O")&&Green[0][1].equals("B"))
			    	 //if(White[0][0].equals("Y")&&White[2][1].equals("O"))
			    	 {
			    		 
			    		 System.out.println(" U U B' U' B U' B' U B");
			    		 moveU();
			    		 moveU();
			    		 moveBP();
			    		 moveUP();
			    		 moveB();
			    		 moveUP();
			    		 moveBP(); 
			    		 moveU();
			    		 moveB();
			    		
			    	 }
			    	 
			    	
			    	 if(White[0][0].equals("O")&&Blue[0][2].equals("B")&&Orange[0][0].equals("Y")&&White[2][1].equals("O")&&Green[0][1].equals("B"))
			    	 //if(White[0][0].equals("O")&&White[2][1].equals("O"))
			    	 {
			    		 
			    		 System.out.println(" U B' U U B U U B' U B");
			    		 
			    		 
			    		
			    		 moveU();
			    		 moveBP();
			    		 moveU();
			    		 moveU();
			    		 moveB();
			    		 moveU();
			    		 moveU();
			    		 moveBP();
			    		 moveU();
			    		 moveB();
			    		
			    	 }
			    	 
			    	 
			    	 
			    	 if(White[0][0].equals("B")&&Blue[0][2].equals("Y")&&Orange[0][0].equals("O")&&White[2][1].equals("O")&&Green[0][1].equals("B"))
			    	 //if(White[0][0].equals("B")&&White[2][1].equals("O"))
			    	 {
			    		 
			    		 System.out.println("  B U' B B U' B");
			    		 
			    		 moveU();
			    		 moveBP();
			    		 moveU();
			    		 moveB();
			    		 moveUP();
			    		 moveBP();
			    		 moveUP();
			    		 moveB();
			    		
			    		
			    	 }
			    	 
			    	 
			     }
			     break;
			     
			     
			     case 31:
			     {
			    	 ///////
			    	 
			    	 if(White[2][0].equals("Y")&&Orange[0][2].equals("O")&&Green[0][0].equals("B")&&White[1][2].equals("B")&&Red[0][1].equals("O"))
			    	 //if(White[0][2].equals("Y")&&White[1][2].equals("B"))
			    	 {
			    		 System.out.println(" U ");
			    		 moveU();
			    		 System.out.println(" U L U U L' U L U' L' ");
			    		 moveU();
			    		 moveL();
			    		 moveU();
			    		 moveU();
			    		 moveLP();
			    		 moveU();
			    		 moveL();
			    		 moveUP();
			    		 moveLP();
			    		
			    		
			    		 
			    	 }
			    	 if(White[2][0].equals("B")&&Orange[0][2].equals("Y")&&Green[0][0].equals("O")&&White[1][2].equals("B")&&Red[0][1].equals("O"))
			    	 //if(White[0][2].equals("B")&&White[1][2].equals("B"))
			    	 {
			    		
			    		 System.out.println(" L U L' U U L U' L'   ");
			    		
			    		 moveL();
			    		 moveU();
			    		 moveLP();
			    		 moveU();
			    		 moveU();
			    		 moveL(); 
			    		 moveUP(); 
			    		 moveLP(); 
			    	 }
			    	 
			    	 if(White[2][0].equals("O")&&Orange[0][2].equals("B")&&Green[0][0].equals("Y")&&White[1][2].equals("B")&&Red[0][1].equals("O"))
			    	 //if(White[0][2].equals("O")&&White[1][2].equals("B"))
			    	 {
			    		 System.out.println(" U ");
			    		 moveU();
			    		 System.out.println(" L U L' ");
			    		 moveL();
			    		 moveU();
			    		 moveLP();
			    		
			    		
			    	 }
			    	 
			    	 if(White[2][0].equals("Y")&&Orange[0][2].equals("O")&&Green[0][0].equals("B")&&White[1][2].equals("O")&&Red[0][1].equals("B"))
			    	// if(White[0][2].equals("Y")&&White[1][2].equals("O"))
			    	 {
			    		 
			    		 System.out.println(" U'  B' U' B U' B' U B");
			    		
			    		 moveUP();
			    		 moveBP();
			    		 moveUP();
			    		 moveB();
			    		 moveUP();
			    		 moveBP(); 
			    		 moveU();
			    		 moveB();
			    		
			    	 }
			    	 
			    	 if(White[2][0].equals("O")&&Orange[0][2].equals("B")&&Green[0][0].equals("Y")&&White[1][2].equals("O")&&Red[0][1].equals("B"))
			    	 
			    	// if(White[0][2].equals("O")&&White[1][2].equals("O"))
			    	 {
			    		 
			    		 System.out.println(" U ");
			    		 moveU();
			    		 System.out.println(" U B' U U B U U B' U B");
			    		 
			    		 
			    		
			    		 moveU();
			    		 moveBP();
			    		 moveU();
			    		 moveU();
			    		 moveB();
			    		 moveU();
			    		 moveU();
			    		 moveBP();
			    		 moveU();
			    		 moveB();
			    		
			    	 }
			    	 
			    	 
			    	 
			    	 if(White[2][0].equals("B")&&Orange[0][2].equals("Y")&&Green[0][0].equals("O")&&White[1][2].equals("O")&&Red[0][1].equals("B"))
			    	 //if(White[0][2].equals("B")&&White[1][2].equals("O"))
			    	 {
			    		 System.out.println(" U ");
			    		 moveU();
			    		 System.out.println("  B U' B B U' B");
			    		 
			    		 moveU();
			    		 moveBP();
			    		 moveU();
			    		 moveB();
			    		 moveUP();
			    		 moveBP();
			    		 moveUP();
			    		 moveB();
			    		
			    		
			    	 }
			    	 
			    	 
			     }
			     break;
			     
			     
			     
			     case 20:
			     {
			    	 
			    	 if(White[2][2].equals("Y")&&Green[0][2].equals("O")&&Red[0][0].equals("B")&&White[0][1].equals("B")&&Blue[0][1].equals("O"))
			    	 //if(White[2][2].equals("Y")&&White[0][1].equals("B"))
			    	 {
			    		 
			    		 System.out.println(" U' L U U L' U L U' L' ");
			    		 moveUP();
			    		 moveL();
			    		 moveU();
			    		 moveU();
			    		 moveLP();
			    		 moveU();
			    		 moveL();
			    		 moveUP();
			    		 moveLP();
			    		
			    		
			    		 
			    	 }
			    	 if(White[2][2].equals("B")&&Green[0][2].equals("Y")&&Red[0][0].equals("O")&&White[0][1].equals("B")&&Blue[0][1].equals("O"))
			    	 //if(White[2][2].equals("B")&&White[0][1].equals("B"))
			    	 {
			    		 
			    		 System.out.println("  U L U L' U U L U' L'   ");
			    		 moveU();
			    		 moveL();
			    		 moveU();
			    		 moveLP();
			    		 moveU();
			    		 moveU();
			    		 moveL(); 
			    		 moveUP(); 
			    		 moveLP(); 
			    	 }
			    	 
			    	 if(White[2][2].equals("O")&&Green[0][2].equals("B")&&Red[0][0].equals("Y")&&White[0][1].equals("B")&&Blue[0][1].equals("O"))
			    	 //if(White[2][2].equals("O")&&White[0][1].equals("B"))
			    	 {
			    		 System.out.println(" U U ");
			    		 moveU();
			    		 moveU();
			    		 System.out.println(" L U L' ");
			    		 moveL();
			    		 moveU();
			    		 moveLP();
			    		
			    		
			    	 }
			    	 
			    	 if(White[2][2].equals("Y")&&Green[0][2].equals("O")&&Red[0][0].equals("B")&&White[0][1].equals("O")&&Blue[0][1].equals("B"))
			    	 //if(White[2][2].equals("Y")&&White[0][1].equals("O"))
			    	 {
			    		
			    		 System.out.println(" B' U' B U' B' U B");
			    		
			    		 moveBP();
			    		 moveUP();
			    		 moveB();
			    		 moveUP();
			    		 moveBP(); 
			    		 moveU();
			    		 moveB();
			    		
			    	 }
			    	 
			    	
			    	 
			    	
		    		 if(White[2][2].equals("O")&&Green[0][2].equals("B")&&Red[0][0].equals("Y")&&White[0][1].equals("O")&&Blue[0][1].equals("B"))
		    		 //if(White[2][2].equals("O")&&White[0][1].equals("O"))
			    	 {
		    			 
			    		 System.out.println(" U' B' U U B U U B' U B");
			    		 
			    		 
			    		
			    		 moveUP();
			    		 moveBP();
			    		 moveU();
			    		 moveU();
			    		 moveB();
			    		 moveU();
			    		 moveU();
			    		 moveBP();
			    		 moveU();
			    		 moveB();
			    		
			    	 }
			    	 
			    	 
			    	 
		    		 if(White[2][2].equals("B")&&Green[0][2].equals("Y")&&Red[0][0].equals("O")&&White[0][1].equals("O")&&Blue[0][1].equals("B"))
			    	 //if(White[2][2].equals("B")&&White[0][1].equals("O"))
			    	 {
			    		 System.out.println(" U U ");
			    		 moveU();
			    		 moveU();
			    		 System.out.println(" B U' B B U' B");
			    		 
			    		 
			    		 moveBP();
			    		 moveU();
			    		 moveB();
			    		 moveB();
			    		 moveU();
			    		 moveU();
			    		 moveBP();
			    		 moveUP();
			    		 moveB();
			    		
			    	 }
			    	 
			    	 
			     }
			     break;
			     
			     
			     case 13:
			     {
			    	 
		    		 
			    	 if(White[0][2].equals("Y")&&Red[0][2].equals("O")&&Blue[0][0].equals("B")&&White[1][0].equals("B")&&Orange[0][1].equals("O"))
			    	 //if(White[0][2].equals("Y")&&White[1][0].equals("B"))
			    	 {
			    			 
			    		 System.out.println(" L U U L' U L U' L' ");
			    		
			    		 moveL();
			    		 moveU();
			    		 moveU();
			    		 moveLP();
			    		 moveU();
			    		 moveL();
			    		 moveUP();
			    		 moveLP();
			    		
			    		
			    		 
			    	 }
			    	 
			    	 if(White[0][2].equals("B")&&Red[0][2].equals("Y")&&Blue[0][0].equals("O")&&White[1][0].equals("B")&&Orange[0][1].equals("O"))
			    	 //if(White[0][2].equals("B")&&White[1][0].equals("B"))
			    	 {
			    		 System.out.println(" U' ");
			    		 moveUP();
			    		 System.out.println("  U' L U L' U U L U' L'   ");
			    		 moveUP();
			    		 moveL();
			    		 moveU();
			    		 moveLP();
			    		 moveU();
			    		 moveU();
			    		 moveL(); 
			    		 moveUP(); 
			    		 moveLP(); 
			    	 }
			    	 
			    	 if(White[0][2].equals("O")&&Red[0][2].equals("B")&&Blue[0][0].equals("Y")&&White[1][0].equals("B")&&Orange[0][1].equals("O"))
			    	 //if(White[0][2].equals("O")&&White[1][0].equals("B"))
			    	 {
			    		 System.out.println(" U' ");
			    		 moveUP();
			    		 System.out.println(" L U L' ");
			    		 moveL();
			    		 moveU();
			    		 moveLP();
			    		
			    		
			    	 }
			    	 
			    	 if(White[0][2].equals("Y")&&Red[0][2].equals("O")&&Blue[0][0].equals("B")&&White[1][0].equals("O")&&Orange[0][1].equals("B"))
			    	 //if(White[0][2].equals("Y")&&White[1][0].equals("O"))
			    	 {
			    		 
			    		 System.out.println("  U B' U' B U' B' U B");
			    		
			    		 moveU();
			    		 moveBP();
			    		 moveUP();
			    		 moveB();
			    		 moveUP();
			    		 moveBP(); 
			    		 moveU();
			    		 moveB();
			    		
			    	 }
			    	 
			    	
			    	 if(White[0][2].equals("O")&&Red[0][2].equals("B")&&Blue[0][0].equals("Y")&&White[1][0].equals("O")&&Orange[0][1].equals("B"))
			    	// if(White[0][2].equals("O")&&White[1][0].equals("O"))
			    	 {
			    		
			    		 System.out.println(" B' U U B U U B' U B");
			    		 
			    		
			    		 moveBP();
			    		 moveU();
			    		 moveU();
			    		 moveB();
			    		 moveU();
			    		 moveU();
			    		 moveBP();
			    		 moveU();
			    		 moveB();
			    		
			    	 }
			    	 
			    	 
			    	 
			    	 if(White[0][2].equals("B")&&Red[0][2].equals("Y")&&Blue[0][0].equals("O")&&White[1][0].equals("O")&&Orange[0][1].equals("B"))
			    	 //if(White[0][2].equals("B")&&White[1][0].equals("O"))
			    	 {
			    		 System.out.println(" U' ");
			    		 moveUP();
			    		 System.out.println(" B U' B B U' B");
			    		 
			    		 moveU();
			    		 moveBP();
			    		 moveU();
			    		 moveB();
			    		 moveUP();
			    		 moveBP();
			    		 moveUP();
			    		 moveB();
			    		
			    		
			    	 }
			    	 
			    	 
			     }
			     break;
			     
			     
			     
			     case 3:
			     {
			    	 
			    	 if(White[0][0].equals("Y")&&Blue[0][2].equals("O")&&Orange[0][0].equals("B")&&White[1][0].equals("B")&&Orange[0][1].equals("O"))
			    	// if(White[0][0].equals("Y")&&White[1][0].equals("B"))
			    	 {
			    		
			    		 System.out.println(" L U U L' U' L U L' ");
			    		 moveL();
			    		 moveU();
			    		 moveU();
			    		 moveLP();
			    		 moveUP();
			    		 moveL();
			    		 moveU();
			    		 moveLP();
			    		
			    		
			    		 
			    	 }
			    	 if(White[0][0].equals("B")&&Blue[0][2].equals("Y")&&Orange[0][0].equals("O")&&White[1][0].equals("B")&&Orange[0][1].equals("O"))
			    	 //if(White[0][0].equals("B")&&White[1][0].equals("B"))
			    	 {
			    		 System.out.println(" U ");
			    		 moveU();
			    		 System.out.println("L U' L' ");
			    		
			    		 moveL();
			    		 moveUP();
			    		 moveLP();
			    		 
			    	 }
			    	 
			    	 if(White[0][0].equals("O")&&Blue[0][2].equals("B")&&Orange[0][0].equals("Y")&&White[1][0].equals("B")&&Orange[0][1].equals("O"))
			    	// if(White[0][0].equals("O")&&White[1][0].equals("B"))
			    	 {
			    		 
			    		 System.out.println(" U'  L U' L' U L' U L");
			    		 moveUP();
			    		 moveL();
			    		 moveUP();
			    		 moveLP();
			    		 moveU();
			    		 moveLP();
			    		 moveU();
			    		 moveL();
			    		
			    	 }
			    	 
			    	 if(White[0][0].equals("Y")&&Blue[0][2].equals("O")&&Orange[0][0].equals("B")&&White[1][0].equals("O")&&Orange[0][1].equals("B"))
			    	 //if(White[0][0].equals("Y")&&White[1][0].equals("O"))
			    	 {
			    		 
			    		 System.out.println(" B' U' B U U B' U' B U B' U' B");
			    		 moveBP();
			    		 moveUP();
			    		 moveB();
			    		 moveU();
			    		 moveU();
			    		 moveBP();
			    		 moveUP(); 
			    		 moveB();
			    		 moveU();
			    		 moveBP();
			    		 moveUP();
			    		 moveB();
			    		
			    	 }
			    	 
			    	
			    	 if(White[0][0].equals("O")&&Blue[0][2].equals("B")&&Orange[0][0].equals("Y")&&White[1][0].equals("O")&&Orange[0][1].equals("B"))
			    	 //if(White[0][0].equals("O")&&White[1][0].equals("O"))
			    	 {
			    		 
			    		 System.out.println(" L U' L' U U B' U' B");
			    		 
			    		 
			    		
			    		 moveL();
			    		 moveUP();
			    		 moveLP();
			    		 moveU();
			    		 moveU();
			    		 moveBP();
			    		 moveUP();
			    		 moveB();
			    		 
			    		
			    	 }
			    	 
			    	 
			    	 
			    	 if(White[0][0].equals("B")&&Blue[0][2].equals("Y")&&Orange[0][0].equals("O")&&White[1][0].equals("O")&&Orange[0][1].equals("B"))
			    	 //if(White[0][0].equals("B")&&White[1][0].equals("O"))
			    	 {
			    		
			    		 System.out.println(" U'  L U U L' U  B' U' B");
			    		 
			    		 moveUP();
			    		 moveL();
			    		 moveU();
			    		 moveU();
			    		 moveLP();
			    		 moveU();
			    		 moveBP();
			    		 moveUP();
			    		 moveB();
			    		
			    		
			    	 }
			    	 
			    	 
			     }
			     break;
			     
			     
			     
			     
			     case 10:
			     {
			    	
			    	 if(White[0][2].equals("Y")&&Red[0][2].equals("O")&&Blue[0][0].equals("B")&&White[0][1].equals("B")&&Blue[0][1].equals("O"))
			    	// if(White[0][2].equals("Y")&&White[0][1].equals("B"))
			    	 {
			    		 System.out.println("U' ");
				    	 moveUP();	 
			    		 System.out.println(" L U U L' U' L U L' ");
			    		 moveL();
			    		 moveU();
			    		 moveU();
			    		 moveLP();
			    		 moveUP();
			    		 moveL();
			    		 moveU();
			    		 moveLP();
			    		
			    		
			    		 
			    	 }
			    	 if(White[0][2].equals("B")&&Red[0][2].equals("Y")&&Blue[0][0].equals("O")&&White[0][1].equals("B")&&Blue[0][1].equals("O"))
			    	 //if(White[0][2].equals("B")&&White[0][1].equals("B"))
			    	 {
			    		 
			    		 System.out.println(" L U' L' ");
			    		 moveU();
			    		 moveL();
			    		 moveUP();
			    		 moveLP();
			    		 
			    	 }
			    	 
			    	 if(White[0][2].equals("O")&&Red[0][2].equals("B")&&Blue[0][0].equals("Y")&&White[0][1].equals("B")&&Blue[0][1].equals("O"))
			    	// if(White[0][2].equals("O")&&White[0][1].equals("B"))
			    	 {
			    		 System.out.println("U'");
				    	 moveUP();
			    		 System.out.println(" L U' L' U L' U L");
			    	
			    		 moveL();
			    		 moveUP();
			    		 moveLP();
			    		 moveU();
			    		 moveLP();
			    		 moveU();
			    		 moveL();
			    		
			    	 }
			    	 
			    	 if(White[0][2].equals("Y")&&Red[0][2].equals("O")&&Blue[0][0].equals("B")&&White[0][1].equals("O")&&Blue[0][1].equals("B"))
			    	// if(White[0][2].equals("Y")&&White[0][1].equals("O"))
			    	 {
			    		 System.out.println("U'");
				    	 moveUP();
			    		 System.out.println(" B' U' B U U B' U' B U B' U' B");
			    		 moveBP();
			    		 moveUP();
			    		 moveB();
			    		 moveU();
			    		 moveU();
			    		 moveBP();
			    		 moveUP(); 
			    		 moveB();
			    		 moveU();
			    		 moveBP();
			    		 moveUP();
			    		 moveB();
			    		
			    	 }
			    	 
			    	
			    	 if(White[0][2].equals("O")&&Red[0][2].equals("B")&&Blue[0][0].equals("Y")&&White[0][1].equals("O")&&Blue[0][1].equals("B"))
			    	// if(White[0][2].equals("O")&&White[0][1].equals("O"))
			    	 {
			    		 System.out.println("U'");
				    	 moveUP();
			    		 System.out.println(" L U' L' U U B' U' B");
			    		 
			    		 
			    		
			    		 moveL();
			    		 moveUP();
			    		 moveLP();
			    		 moveU();
			    		 moveU();
			    		 moveBP();
			    		 moveUP();
			    		 moveB();
			    		 
			    		
			    	 }
			    	 
			    	 
			    	 
			    	 if(White[0][2].equals("B")&&Red[0][2].equals("Y")&&Blue[0][0].equals("O")&&White[0][1].equals("O")&&Blue[0][1].equals("B"))
			    	// if(White[0][2].equals("B")&&White[0][1].equals("O"))
			    	 {
			    		 System.out.println("U' U'");
				    	 moveUP();
				    	 moveUP();
			    		 System.out.println(" L U U L' U  B' U' B");
			    		 
			    	
			    		 moveL();
			    		 moveU();
			    		 moveU();
			    		 moveLP();
			    		 moveU();
			    		 moveBP();
			    		 moveUP();
			    		 moveB();
			    		
			    		
			    	 }
			    	 
			    	 
			     }
			     break;
			     
			     
			     
			     case 21:
			     {
			    	 
			    	 if(White[2][2].equals("Y")&&Green[0][2].equals("O")&&Red[0][0].equals("B")&&White[1][2].equals("B")&&Red[0][1].equals("O"))
			    	// if(White[2][2].equals("Y")&&White[1][2].equals("B"))
			    	 {
			    		 System.out.println("U U");
				    	 moveU();
				    	 moveU();	 
			    		 System.out.println(" L U U L' U' L U L' ");
			    		 moveL();
			    		 moveU();
			    		 moveU();
			    		 moveLP();
			    		 moveUP();
			    		 moveL();
			    		 moveU();
			    		 moveLP();
			    		
			    		
			    		 
			    	 }
			    	 if(White[2][2].equals("B")&&Green[0][2].equals("Y")&&Red[0][0].equals("O")&&White[1][2].equals("B")&&Red[0][1].equals("O"))
			    	 //if(White[2][2].equals("B")&&White[1][2].equals("B"))
			    	 {
			    		
			    		 System.out.println("  U' L U' L' ");
			    		 moveUP();
			    		 moveL();
			    		 moveUP();
			    		 moveLP();
			    		 
			    	 }
			    	 
			    	 if(White[2][2].equals("O")&&Green[0][2].equals("B")&&Red[0][0].equals("Y")&&White[1][2].equals("B")&&Red[0][1].equals("O"))
			    	 //if(White[2][2].equals("O")&&White[1][2].equals("B"))
			    	 {
			    		 
			    		 System.out.println(" U  L U' L' U L' U L");
			    		 moveU();
			    		 moveL();
			    		 moveUP();
			    		 moveLP();
			    		 moveU();
			    		 moveLP();
			    		 moveU();
			    		 moveL();
			    		
			    	 }
			    	 
			    	 if(White[2][2].equals("Y")&&Green[0][2].equals("O")&&Red[0][0].equals("B")&&White[1][2].equals("O")&&Red[0][1].equals("B"))
			    	 //if(White[2][2].equals("Y")&&White[1][2].equals("O"))
			    	 {
			    		 System.out.println("U U");
				    	 moveU();
				    	 moveU();
			    		 System.out.println(" B' U' B U U B' U' B U B' U' B");
			    		 moveBP();
			    		 moveUP();
			    		 moveB();
			    		 moveU();
			    		 moveU();
			    		 moveBP();
			    		 moveUP(); 
			    		 moveB();
			    		 moveU();
			    		 moveBP();
			    		 moveUP();
			    		 moveB();
			    		
			    	 }
			    	 
			    	
			    	 if(White[2][2].equals("O")&&Green[0][2].equals("B")&&Red[0][0].equals("Y")&&White[1][2].equals("O")&&Red[0][1].equals("B"))
			    	// if(White[2][2].equals("O")&&White[1][2].equals("O"))
			    	 {
			    		 System.out.println("U U");
				    	 moveU();
				    	 moveU();
			    		 System.out.println(" L U' L' U U B' U' B");
			    		 
			    		 
			    		
			    		 moveL();
			    		 moveUP();
			    		 moveLP();
			    		 moveU();
			    		 moveU();
			    		 moveBP();
			    		 moveUP();
			    		 moveB();
			    		 
			    		
			    	 }
			    	 
			    	 
			    	 
			    	 if(White[2][2].equals("B")&&Green[0][2].equals("Y")&&Red[0][0].equals("O")&&White[1][2].equals("O")&&Red[0][1].equals("B"))
			    	 //if(White[2][2].equals("B")&&White[1][2].equals("O"))
			    	 {
			    		
			    		 System.out.println(" U  L U U L' U  B' U' B");
			    		 
			    		 moveU();
			    		 moveL();
			    		 moveU();
			    		 moveU();
			    		 moveLP();
			    		 moveU();
			    		 moveBP();
			    		 moveUP();
			    		 moveB();
			    		
			    		
			    	 }
			    	 
			    	 
			     }
			     break;
			     
			     
			     
			     case 32:
			     {
			    	 
			    	 
			    	 if(White[2][0].equals("Y")&&Orange[0][2].equals("O")&&Green[0][0].equals("B")&&White[2][1].equals("B")&&Green[0][1].equals("O"))
			    	// if(White[2][0].equals("Y")&&White[2][1].equals("B"))
			    	 {
			    		 System.out.println("U");
				    	 moveU();	 
			    		 System.out.println(" L U U L' U' L U L' ");
			    		 moveL();
			    		 moveU();
			    		 moveU();
			    		 moveLP();
			    		 moveUP();
			    		 moveL();
			    		 moveU();
			    		 moveLP();
			    		
			    		
			    		 
			    	 }
			    	 if(White[2][0].equals("B")&&Orange[0][2].equals("Y")&&Green[0][0].equals("O")&&White[2][1].equals("B")&&Green[0][1].equals("O"))
			    	 //if(White[2][0].equals("B")&&White[2][1].equals("B"))
			    	 {
			    		 
			    		 System.out.println(" U L U' L' ");
			    		 moveU();
			    		 moveL();
			    		 moveUP();
			    		 moveLP();
			    		 
			    	 }
			    	 
			    	 if(White[2][0].equals("O")&&Orange[0][2].equals("B")&&Green[0][0].equals("Y")&&White[2][1].equals("B")&&Green[0][1].equals("O"))
			    	 //if(White[2][0].equals("O")&&White[2][1].equals("B"))
			    	 {
			    		 System.out.println("U'");
				    	 moveUP();
			    		 System.out.println(" U'  L U' L' U L' U L");
			    		 moveUP();
			    		 moveL();
			    		 moveUP();
			    		 moveLP();
			    		 moveU();
			    		 moveLP();
			    		 moveU();
			    		 moveL();
			    		
			    	 }
			    	 
			    	 if(White[2][0].equals("Y")&&Orange[0][2].equals("O")&&Green[0][0].equals("B")&&White[2][1].equals("O")&&Green[0][1].equals("B"))
			    	 //if(White[2][0].equals("Y")&&White[2][1].equals("O"))
			    	 {
			    		 System.out.println("U");
				    	 moveU();
			    		 System.out.println(" B' U' B U U B' U' B U B' U' B");
			    		 moveBP();
			    		 moveUP();
			    		 moveB();
			    		 moveU();
			    		 moveU();
			    		 moveBP();
			    		 moveUP(); 
			    		 moveB();
			    		 moveU();
			    		 moveBP();
			    		 moveUP();
			    		 moveB();
			    		
			    	 }
			    	 
			    	
			    	 if(White[2][0].equals("O")&&Orange[0][2].equals("B")&&Green[0][0].equals("Y")&&White[2][1].equals("O")&&Green[0][1].equals("B"))
			    	// if(White[2][0].equals("O")&&White[2][1].equals("O"))
			    	 {
			    		 System.out.println("U");
				    	 moveU();
			    		 System.out.println(" L U' L' U U B' U' B");
			    		 
			    		 
			    		
			    		 moveL();
			    		 moveUP();
			    		 moveLP();
			    		 moveU();
			    		 moveU();
			    		 moveBP();
			    		 moveUP();
			    		 moveB();
			    		 
			    		
			    	 }
			    	 
			    	 
			    	 
			    	 if(White[2][0].equals("B")&&Orange[0][2].equals("Y")&&Green[0][0].equals("O")&&White[2][1].equals("O")&&Green[0][1].equals("B"))
			    	 //if(White[2][0].equals("B")&&White[2][1].equals("O"))
			    	 {
			    		 
			    		 System.out.println("   L U U L' U  B' U' B");
			    		 
			    		
			    		 moveL();
			    		 moveU();
			    		 moveU();
			    		 moveLP();
			    		 moveU();
			    		 moveBP();
			    		 moveUP();
			    		 moveB();
			    		
			    		
			    	 }
			    	 
			    	 
			     }
			     break;
			     
     }
     
      
     
     
	 
}





public static void solveYRBandRB()
{
	 System.out.println("find the location of YRB corner and orientation  ");
	 int t=0;
	 
	 
	 while(t<8)
	 {
		 corners=cor[0][t];
		 System.out.print(corners+",");
		 
		 if(cor[0][t].equals("YBR")|| cor[0][t].equals("RYB")||cor[0][t].equals("BRY")||cor[0][t].equals("YRB")||cor[0][t].equals("RBY")||cor[0][t].equals("BYR"))
		 {
			 cor2=cor[0][t];
			 F2LCor2=cor2;
			 System.out.println(F2LCor2);
			 F2LCorpos2=t;
			 System.out.println(F2LCorpos2);
			 
			 if(F2LCorpos2>3)
			 {
				 switch(F2LCorpos2)
				 
				 {
				 
						 case 4:
							 
						 {
							 System.out.println("L' U' L");
							 moveLP();
							 moveUP();
							 moveL();
							 
						 }
						 break;
						 
						 case 5:
						 {
							 
							 System.out.println("R U R'");
							 moveR();
							 moveU();
							 moveRP();
						 }
				         break;
				         
				         
						 case 6:
						 {
							 
							 System.out.println("R' U R");
							 moveRP();
							 moveU();
							 moveR();
						 }
				         break;
				         
				         
						 case 7:
						 {
							 
							 System.out.println("L U L'");
							 moveL();
							 moveU();
							 moveLP();
						 }
				         break;
				         
				        
				 }
				 
				 
			 }
		 }
		 
		 t++;
		 
		 
	 }
	 
	
	 
	 FindCorners();
	 
	 
	 System.out.println("the updated location of YRB corner and orientation  ");
	int  f=0;
	 
	 while(f<8)
	 {
		 corners=cor[0][f];
		 
		 if(cor[0][f].equals("YBR")|| cor[0][f].equals("RYB")||cor[0][f].equals("BRY")||cor[0][f].equals("YRB")||cor[0][f].equals("RBY")||cor[0][f].equals("BYR"))
		 {
			 cor2=cor[0][f];
			 F2LCor2=cor2;
			 System.out.println(F2LCor2);
			 F2LCorpos2=f;
			 System.out.println(F2LCorpos2);
			 
			 
		}
		 f++;
		 
		 
	 }
	 
	 
 FindEdges();
	 
	 
	 System.out.println("the location of BR edge is  ");
	int  s=0;
	 
	 while(s<12)
	 {
		 edges=ed[0][s];
		 
		 if(ed[0][s].equals("BR")|| ed[0][s].equals("RB"))
		 {
			 ed2=ed[0][s];
			 F2Led2=ed2;
			 System.out.println(F2Led2);
			 F2LEdpos2=s;
			 System.out.println(F2LEdpos2);
			 
			 if(F2LEdpos2>7)
			 {
				 switch(F2LEdpos2)
				 
				 {
				 
						 case 8:
	
							 
							 
						 {
							 if(F2LCorpos2==3)
							 {
								 
								 System.out.println("L' U U L");
								 moveLP();
								 moveU();
								 moveU();
								 moveL();
								 
							 }
							 
							 else
							 {
								 System.out.println("L'  U' L");
								 moveLP();
								
								 moveUP();
								 moveL();
								  
								 
							 }
						 }
						 break;
						 
						 case 9:
						 {
							 
							 if(F2LCorpos2==2)
							 {
								 
								 System.out.println("R U U R'");
								 moveR();
								 moveU();
								 moveU();
								 moveRP();
								 
							 }
							 
							 else
							 {
								 System.out.println("R  U R'");
								 moveR();
								
								 moveU();
								 moveRP();
								  
								 
							 }
						 }
				         break;
				         
				         
						 case 10:
						 {
							 
							 if(F2LCorpos2==1)
							 {
								 
								 System.out.println("R' U U R");
								 moveRP();
								 moveU();
								 moveU();
								 moveR();
								 
							 }
							 
							 else
							 {
								 System.out.println("R'  U' R");
								 moveRP();
								
								 moveUP();
								 moveR();
								  
								 
							 }
						 }
				         break;
				         
				         
						 case 11:
						 {
							 
							 if(F2LCorpos2==0)
							 {
								 
								 System.out.println("L U U L'");
								 moveL();
								 moveU();
								 moveU();
								 moveLP();
								 
							 }
							 
							 else
							 {
								 System.out.println("L U L'");
								 moveL();
								
								 moveU();
								 moveLP();
								  
								 
							 }
						 }
				         break;
				         
				        
				 }
				 
				 
			 }
			 
			 
			 
			 
			 
		}
		 s++;
		
		 
		 
	 }
	  
	 
	 
	 
	 FindCorners();
	 
	 
	 System.out.println("the updated location of YRB corner and orientation  ");
	  f=0;
	 
	 while(f<8)
	 {
		 corners=cor[0][f];
		 
		 if(cor[0][f].equals("YBR")|| cor[0][f].equals("RYB")||cor[0][f].equals("BRY")||cor[0][f].equals("YRB")||cor[0][f].equals("RBY")||cor[0][f].equals("BYR"))
		 {
			 cor2=cor[0][f];
			 F2LCor2=cor2;
			 System.out.println(F2LCor2);
			 F2LCorpos2=f;
			 System.out.println(F2LCorpos2);
			 
			 
		}
		 f++;
		 
		 
	 }
	 	 
	
	 
	 FindEdges();
	 
	 
	 System.out.println("the updated location of YB edge and orientation  ");
	  s=0;
	 
	 while(s<12)
	 {
		 edges=ed[0][s];
		 
		 if(ed[0][s].equals("BR")|| ed[0][s].equals("RB"))
		 {
			 ed2=ed[0][s];
			 F2Led2=ed2;
			 System.out.println(F2Led2);
			 F2LEdpos2=s;
			 System.out.println(F2LEdpos2);
			 
			 
		}
		 s++;
		 
		 
	 }
	 
	 
	System.out.println("now i know the location of the corner and the edge");
	
	 System.out.println("location of corner"+F2LCorpos2);
	 System.out.println("corner is"+F2LCor2);
	 System.out.println("location of edge"+F2LEdpos2);
	 System.out.println("edge is"+F2Led2);
	 
	 
	 int YRBRBpos= 10*F2LCorpos2+ F2LEdpos2;
	 System.out.println("the case to be executed");
	 System.out.println(YRBRBpos);
     String YRBRB=	 F2LCor2+F2Led2;
     
     switch(YRBRBpos)
     {
     
			     case 12:
			     {
			    	
			    	 if(White[0][2].equals("R")&&Red[0][2].equals("Y")&&Blue[0][0].equals("B")&&White[2][1].equals("B")&&Green[0][1].equals("R"))
			    	 {
			    		 
			    		 System.out.println(" R' U' R   ");
			    		 moveRP();
			    		 moveUP();
			    		 moveR();
			    		
			    		 
			    	 }
			    	 
			    	 if(White[0][2].equals("Y")&&Red[0][2].equals("B")&&Blue[0][0].equals("R")&&White[2][1].equals("B")&&Green[0][1].equals("R"))
			    	 {
			    		 
			    		 System.out.println(" U' R' U U R U' R' U R ");
			    		 moveUP();
			    		 moveRP();
			    		 moveU();
			    		 moveU();
			    		 moveR();
			    		 moveUP();
			    		 moveRP(); 
			    		 moveU(); 
			    		 moveR(); 
			    	 }
			    	 //YB
			    	 
			    	 if(White[0][2].equals("B")&&Red[0][2].equals("R")&&Blue[0][0].equals("Y")&&White[2][1].equals("B")&&Green[0][1].equals("R"))
			    	 {
			    		 
			    		 System.out.println(" U R' U' R U U R' U R  ");
			    		 moveU();
			    		 moveRP();
			    		 moveUP();
			    		 moveR();
			    		 moveU();
			    		 moveU();
			    		 moveRP(); 
			    		 moveU();
			    		 moveR();
			    	 }
			    	 
			    	 //YO
			    	 if(White[0][2].equals("Y")&&Red[0][2].equals("B")&&Blue[0][0].equals("R")&&White[2][1].equals("R")&&Green[0][1].equals("B"))
			    	 {
			    		 
			    		 System.out.println(" U U B U B' U B U' B' ");
			    		 moveU();
			    		 moveU();
			    		 moveB();
			    		 moveU();
			    		 moveBP();
			    		 moveU();
			    		 moveB(); 
			    		 moveUP();
			    		 moveBP();
			    		 
			    	 }
			    	 
			    	
			    	 //O O
			    	 if(White[0][2].equals("R")&&Red[0][2].equals("Y")&&Blue[0][0].equals("B")&&White[2][1].equals("R")&&Green[0][1].equals("B"))
			    	 {
			    		 
			    		 System.out.println(" U' B U U B' U U B U' B'");
			    		 moveUP();
			    		 moveB();
			    		 moveU();
			    		 moveU();
			    		 moveBP();
			    		 moveU();
			    		 moveU(); 
			    		 moveB();
			    		 moveUP();
			    		 moveBP();
			    		
			    		
			    	 }
			    	 
			    	 
			    	 
			    	 //BO
			    	 if(White[0][2].equals("B")&&Red[0][2].equals("R")&&Blue[0][0].equals("Y")&&White[2][1].equals("R")&&Green[0][1].equals("B"))
			    	 {
			    		 
			    		 System.out.println(" U' B U B' U B U B'");
			    		 
			    		 moveUP();
			    		 moveB();
			    		 moveU();
			    		 moveBP();
			    		 moveU();
			    		 moveB(); 
			    		 moveU();
			    		 moveBP();
			    		
			    	 }
			    	 
			    	 
			    	 
			     }
			     break;
			     
			     
			     case 1:
			     {
			    	//OB
			    	 if(White[0][0].equals("R")&&Blue[0][2].equals("Y")&&Orange[0][0].equals("B")&&White[1][2].equals("B")&&Red[0][1].equals("R"))
			    	// if(White[0][0].equals("O")&&White[1][2].equals("B"))
			    	 {

				    	 System.out.println("U");
				    	 moveU();
				    	 System.out.println(" R' U' R   ");
			    		 moveRP();
			    		 moveUP();
			    		 moveR();
			    		 
			    	 }
			    	 
			    	 if(White[0][0].equals("Y")&&Blue[0][2].equals("B")&&Orange[0][0].equals("R")&&White[1][2].equals("B")&&Red[0][1].equals("R"))
			    	 //if(White[0][0].equals("B")&&White[1][2].equals("B"))
			    	 {

				    	
				    	 System.out.println(" R' U U R U' R' U R ");
			    		
			    		 moveRP();
			    		 moveU();
			    		 moveU();
			    		 moveR();
			    		 moveUP();
			    		 moveRP(); 
			    		 moveU(); 
			    		 moveR(); 
			    	 }
			    	 
			    	 if(White[0][0].equals("B")&&Blue[0][2].equals("R")&&Orange[0][0].equals("Y")&&White[1][2].equals("B")&&Red[0][1].equals("R"))
			    	 //if(White[0][0].equals("Y")&&White[1][2].equals("B"))
			    	 {

				    	 System.out.println("U");
				    	 moveU();
				    	 System.out.println(" U R' U' R U U R' U R  ");
			    		 moveU();
			    		 moveRP();
			    		 moveUP();
			    		 moveR();
			    		 moveU();
			    		 moveU();
			    		 moveRP(); 
			    		 moveU();
			    		 moveR();
			    	 }
			    	 
			    	 if(White[0][0].equals("Y")&&Blue[0][2].equals("B")&&Orange[0][0].equals("R")&&White[1][2].equals("R")&&Red[0][1].equals("B"))
			    	 //if(White[0][0].equals("Y")&&White[1][2].equals("O"))
			    	 {
			    		
			    		 System.out.println(" U' B U B' U B U' B' ");
			    		 
			    		 moveUP();
			    		 moveB();
			    		 moveU();
			    		 moveBP();
			    		 moveU();
			    		 moveB(); 
			    		 moveUP();
			    		 moveBP();
			    	 }
			    	 
			    	
			    	 if(White[0][0].equals("R")&&Blue[0][2].equals("Y")&&Orange[0][0].equals("B")&&White[1][2].equals("R")&&Red[0][1].equals("B"))
			    	 //if(White[0][0].equals("O")&&White[1][2].equals("O"))
			    	 {

				    	 System.out.println("U");
				    	 moveU();
				    	 System.out.println(" U' B U U B' U U B U' B'");
			    		 moveUP();
			    		 moveB();
			    		 moveU();
			    		 moveU();
			    		 moveBP();
			    		 moveU();
			    		 moveU(); 
			    		 moveB();
			    		 moveUP();
			    		 moveBP();
			    		
			    		
			    	 }
			    	 
			    	 
			    	 
			    	 if(White[0][0].equals("B")&&Blue[0][2].equals("R")&&Orange[0][0].equals("Y")&&White[1][2].equals("R")&&Red[0][1].equals("B"))
			    	// if(White[0][0].equals("B")&&White[1][2].equals("O"))
			    	 {

				    	 
			    		 
                         System.out.println(" B U B' U B U B'");
			    		 
			    		
			    		 moveB();
			    		 moveU();
			    		 moveBP();
			    		 moveU();
			    		 moveB(); 
			    		 moveU();
			    		 moveBP();
			    		
			    	 }
			    	 
			    	 
			    	 
			     }
			     break;
			     
			     ////REMAINING
			     case 23:
			     {
			    	
			    	 if(White[2][2].equals("R")&&Green[0][2].equals("Y")&&Red[0][0].equals("B")&&White[1][0].equals("B")&&Orange[0][1].equals("R"))
			    	 //if(White[2][2].equals("O")&&White[1][0].equals("B"))
			    	 {
			    		 System.out.println("U'");
				    	 moveUP();
				    	 System.out.println(" R' U' R   ");
			    		 moveRP();
			    		 moveUP();
			    		 moveR();
			    		

			    		 
			    	 }
			    	 
			    	 if(White[2][2].equals("Y")&&Green[0][2].equals("B")&&Red[0][0].equals("R")&&White[1][0].equals("B")&&Orange[0][1].equals("R"))
			    	 //if(White[2][2].equals("B")&&White[1][0].equals("B"))
			    	 {
			    		 
			    		 System.out.println("U'");
				    	 moveUP();
				    	 System.out.println(" U' R' U U R U' R' U R ");
			    		 moveUP();
			    		 moveRP();
			    		 moveU();
			    		 moveU();
			    		 moveR();
			    		 moveUP();
			    		 moveRP(); 
			    		 moveU(); 
			    		 moveR(); 

			    		
			    	 }
			    	 
			    	 if(White[2][2].equals("B")&&Green[0][2].equals("R")&&Red[0][0].equals("Y")&&White[1][0].equals("B")&&Orange[0][1].equals("R"))
			    	 //if(White[2][2].equals("Y")&&White[1][0].equals("B"))
			    	 {
			    		 
				    	 System.out.println(" R' U' R U U R' U R  ");
			    		 
			    		 moveRP();
			    		 moveUP();
			    		 moveR();
			    		 moveU();
			    		 moveU();
			    		 moveRP(); 
			    		 moveU();
			    		 moveR();

			    	 }
			    	 
			    	 if(White[2][2].equals("Y")&&Green[0][2].equals("B")&&Red[0][0].equals("R")&&White[1][0].equals("R")&&Orange[0][1].equals("B"))
			    	// if(White[2][2].equals("Y")&&White[1][0].equals("O"))
			    	 {
			    		 
			    		 System.out.println("  U B U B' U B U' B' ");
			    		
			    		 moveU();
			    		 moveB();
			    		 moveU();
			    		 moveBP();
			    		 moveU();
			    		 moveB(); 
			    		 moveUP();
			    		 moveBP();
			    		 

			    	 }
			    	 
			    	
			    	 if(White[2][2].equals("R")&&Green[0][2].equals("Y")&&Red[0][0].equals("B")&&White[1][0].equals("R")&&Orange[0][1].equals("B"))
			    	// if(White[2][2].equals("O")&&White[1][0].equals("O"))
			    	 {   
			    		 
			    		 
			    		 System.out.println(" U' U' B U U B' U U B U' B'");
			    		 moveUP();
			    		 moveUP();
			    		 moveB();
			    		 moveU();
			    		 moveU();
			    		 moveBP();
			    		 moveU();
			    		 moveU(); 
			    		 moveB();
			    		 moveUP();
			    		 moveBP();
			    		



			    		
			    		
			    	 }
			    	 
			    	 
			    	 
			    	 if(White[2][2].equals("B")&&Green[0][2].equals("R")&&Red[0][0].equals("Y")&&White[1][0].equals("R")&&Orange[0][1].equals("B"))
			    	 //if(White[2][2].equals("B")&&White[1][0].equals("O"))
			    	 {
			    		 System.out.println("U'");
				    	 moveUP();
	                System.out.println(" U' B U B' U B U B'");
			    		 
			    		 moveUP();
			    		 moveB();
			    		 moveU();
			    		 moveBP();
			    		 moveU();
			    		 moveB(); 
			    		 moveU();
			    		 moveBP();

			    		
			    		
			    	 }
			    	 
			    	 
			    	 
			     }
			     break;
			     
			     
			     case 30:
			     {
			    	
			    	 
			    	 
			    	 if(White[2][0].equals("R")&&Orange[0][2].equals("Y")&&Green[0][0].equals("B")&&White[0][1].equals("B")&&Blue[0][1].equals("R"))
			    	 //if(White[2][0].equals("O")&&White[0][1].equals("B"))
			    	 {
			    		 System.out.println("U U");
				    	 moveU();
				    	 moveU();
				    	 System.out.println(" R' U' R   ");
			    		 moveRP();
			    		 moveUP();
			    		 moveR();
			    		 
			    	 }
			    	 if(White[2][0].equals("Y")&&Orange[0][2].equals("B")&&Green[0][0].equals("R")&&White[0][1].equals("B")&&Blue[0][1].equals("R"))
			    	 //if(White[2][0].equals("B")&&White[0][1].equals("B"))
			    	 {
			    		 
						 System.out.println(" U R' U U R U' R' U R ");
			    		 moveU();
			    		 moveRP();
			    		 moveU();
			    		 moveU();
			    		 moveR();
			    		 moveUP();
			    		 moveRP(); 
			    		 moveU(); 
			    		 moveR(); 
			    	 

			    	 }
			    	 
			    	 if(White[2][0].equals("B")&&Orange[0][2].equals("R")&&Green[0][0].equals("Y")&&White[0][1].equals("B")&&Blue[0][1].equals("R"))
			    	// if(White[2][0].equals("Y")&&White[0][1].equals("B"))
			    	 {
			    		
			    		 System.out.println(" U' L U L L B L B'  ");
			    		 moveUP();
			    		 moveL();
			    		 moveU();
			    		 moveL();
			    		 moveL();
			    		 moveB();
			    		 moveL(); 
			    		 moveBP();
			    	 }
			    	 
			    	 if(White[2][0].equals("Y")&&Orange[0][2].equals("B")&&Green[0][0].equals("R")&&White[0][1].equals("R")&&Blue[0][1].equals("B"))
			    	 //if(White[2][0].equals("Y")&&White[0][1].equals("O"))
			    	 {
			    		
			    		 System.out.println("  B U B' U B U' B' ");
			    		
			    		 moveB();
			    		 moveU();
			    		 moveBP();
			    		 moveU();
			    		 moveB(); 
			    		 moveUP();
			    		 moveBP();
			    	 }
			    	 
			    	
			    	 if(White[2][0].equals("R")&&Orange[0][2].equals("Y")&&Green[0][0].equals("B")&&White[0][1].equals("R")&&Blue[0][1].equals("B"))
			    	// if(White[2][0].equals("O")&&White[0][1].equals("O"))
			    	 {
			    		
			    		 System.out.println(" U B U U B' U U B U' B'");
			    		 moveU();
			    		 moveB();
			    		 moveU();
			    		 moveU();
			    		 moveBP();
			    		 moveU();
			    		 moveU(); 
			    		 moveB();
			    		 moveUP();
			    		 moveBP();
			    		
			    		

			    		
			    		
			    	 }
			    	 
			    	 
			    	 
			    	 if(White[2][0].equals("B")&&Orange[0][2].equals("R")&&Green[0][0].equals("Y")&&White[0][1].equals("R")&&Blue[0][1].equals("B"))
			    	 //if(White[2][0].equals("B")&&White[0][1].equals("O"))
			    	 {
			    		 
				    	 
			    		 System.out.println(" U B U B' U B U B'");
			    		 
			    		 moveU();
			    		 moveB();
			    		 moveU();
			    		 moveBP();
			    		 moveU();
			    		 moveB(); 
			    		 moveU();
			    		 moveBP();
			    		
			    	 }
			    	 
			    	 
			    	 
			     }
			     break;
			     
			     /////REMAINING
			     
			     case 0:
			     {
			    	
			    	 if(White[0][0].equals("R")&&Blue[0][2].equals("Y")&&Orange[0][0].equals("B")&&White[0][1].equals("B")&&Blue[0][1].equals("R"))
			    	 //if(White[0][0].equals("Y")&&White[0][1].equals("B"))
			    	 {
			    		 System.out.println("U");
				    	 moveU();
			    		 System.out.println(" U R' U R U' R' U' R");
			    		 moveU();
			    		 moveRP();
			    		 moveU();
			    		 moveR();
			    		 moveUP();
			    		 moveRP();
			    		 moveUP();
			    		 moveR();
			    		 
			    		
			    		 
			    	 }
			    	 if(White[0][0].equals("B")&&Blue[0][2].equals("R")&&Orange[0][0].equals("Y")&&White[0][1].equals("B")&&Blue[0][1].equals("R"))
			    	 //if(White[0][0].equals("B")&&White[0][1].equals("B"))
			    	 {
			    		 
			    		 System.out.println("R' U  R");
			    		 moveRP();
			    		 moveU();
			    		 moveR();
			    		 
			    	 }
			    	 
			    	 if(White[0][0].equals("Y")&&Blue[0][2].equals("B")&&Orange[0][0].equals("R")&&White[0][1].equals("B")&&Blue[0][1].equals("R"))
			    	 //if(White[0][0].equals("O")&&White[0][1].equals("B"))
			    	 {
			    		 
			    		 
			    		 System.out.println("U");
				    	 moveU();
			    		 System.out.println(" R' U U R U R' U' R ");
			    		 moveRP();
			    		 moveU();
			    		 moveU();
			    		 moveR();
			    		 moveU();
			    		 moveRP();
			    		 moveUP(); 
			    		 moveR(); 
			    		
			    		
			    	 }
			    	 
			    	 if(White[0][0].equals("R")&&Blue[0][2].equals("Y")&&Orange[0][0].equals("B")&&White[0][1].equals("R")&&Blue[0][1].equals("B"))
			    	// if(White[0][0].equals("Y")&&White[0][1].equals("O"))
			    	 {
			    		 System.out.println("U");
				    	 moveU();
			    		 System.out.println("R' U R U U B U B' ");
			    		 moveRP();
			    		 moveU();
			    		 moveR();
			    		 moveU();
			    		 moveU();
			    		 moveB();
			    		 moveU(); 
			    		 moveBP();
			    		
			    	 }
			    	 
			    	
			    	 if(White[0][0].equals("B")&&Blue[0][2].equals("R")&&Orange[0][0].equals("Y")&&White[0][1].equals("R")&&Blue[0][1].equals("B"))
			    	 //if(White[0][0].equals("O")&&White[0][1].equals("O"))
			    	 {
			    		 
			    		 System.out.println("U");
				    	 moveU();
			    		 System.out.println("U R' U U R U' B U B' ");
			    		 moveU();
			    		 moveRP();
			    		 moveU();
			    		 moveU();
			    		 moveR();
			    		 moveUP();
			    		 moveB(); 
			    		 moveU();
			    		 moveBP();
			    	 }
			    	 
			    	 
			    	 
			    	 if(White[0][0].equals("Y")&&Blue[0][2].equals("B")&&Orange[0][0].equals("R")&&White[0][1].equals("R")&&Blue[0][1].equals("B"))
			    	 //if(White[0][0].equals("B")&&White[0][1].equals("O"))
			    	 {
			    		 
			    		 System.out.println("U");
				    	 moveU();
			    		 System.out.println("B U B' U' U' B U B' U' B U B' ");
			    		 moveB();
			    		 moveU();
			    		 moveBP();
			    		 moveUP();
			    		 moveUP();
			    		 moveB();
			    		 moveU(); 
			    		 moveBP();
			    		 moveUP();
			    		 moveB();
			    		 moveU();
			    		 moveBP();
			    		
			    	 }
			    	 
			    	 
			    	 
			     }
			     break;  
			     
			   
			     
			     case 11:
			     {
			    	
			    	 
			    	 ///////
			    	 if(White[0][2].equals("R")&&Red[0][2].equals("Y")&&Blue[0][0].equals("B")&&White[1][2].equals("B")&&Red[0][1].equals("R"))
			    	 //if(White[0][2].equals("Y")&&White[1][2].equals("B"))
			    	 {
			    		 
			    		 System.out.println(" U R' U R U' R' U' R");
			    		 moveU();
			    		 moveRP();
			    		 moveU();
			    		 moveR();
			    		 moveUP();
			    		 moveRP();
			    		 moveUP();
			    		 moveR();
			    		
			    		 
			    	 }
			    	 if(White[0][2].equals("B")&&Red[0][2].equals("R")&&Blue[0][0].equals("Y")&&White[1][2].equals("B")&&Red[0][1].equals("R"))
			    	 //if(White[0][2].equals("B")&&White[1][2].equals("B"))
			    	 {
			    		 
			    		 
			    		 System.out.println("U' R' U R");
			    		 moveUP();
			    		 moveRP();
			    		 moveU();
			    		 moveR();
			    	 }
			    	 
			    	 if(White[0][2].equals("Y")&&Red[0][2].equals("B")&&Blue[0][0].equals("R")&&White[1][2].equals("B")&&Red[0][1].equals("R"))
			    	 //if(White[0][2].equals("O")&&White[1][2].equals("B"))
			    	 {
			    		 
			    		 
			    		 System.out.println(" R' U U R U R' U' R ");
			    		 moveRP();
			    		 moveU();
			    		 moveU();
			    		 moveR();
			    		 moveU();
			    		 moveRP();
			    		 moveUP(); 
			    		 moveR(); 
			    		
			    	 }
			    	 
			    	 if(White[0][2].equals("R")&&Red[0][2].equals("Y")&&Blue[0][0].equals("B")&&White[1][2].equals("R")&&Red[0][1].equals("B"))
			    	 //if(White[0][2].equals("Y")&&White[1][2].equals("O"))
			    	 {
			    		 System.out.println("R' U R U U B U B' ");
			    		 moveRP();
			    		 moveU();
			    		 moveR();
			    		 moveU();
			    		 moveU();
			    		 moveB();
			    		 moveU(); 
			    		 moveBP();
			    		
			    	 }
			    	 
			    	
			    	 if(White[0][2].equals("B")&&Red[0][2].equals("R")&&Blue[0][0].equals("Y")&&White[1][2].equals("R")&&Red[0][1].equals("B"))
			    	 //if(White[0][2].equals("O")&&White[1][2].equals("O"))
			    	 {
			    		 
			    		 System.out.println("U R' U U R U' B U B' ");
			    		 moveU();
			    		 moveRP();
			    		 moveU();
			    		 moveU();
			    		 moveR();
			    		 moveUP();
			    		 moveB(); 
			    		 moveU();
			    		 moveBP();
			    		
			    	 }
			    	 
			    	 
			    	 
			    	 if(White[0][2].equals("Y")&&Red[0][2].equals("B")&&Blue[0][0].equals("R")&&White[1][2].equals("R")&&Red[0][1].equals("B"))
			    	 //if(White[0][2].equals("B")&&White[1][2].equals("O"))
			    	 {
			    		 
			    		
			    		 System.out.println("B U B' U' U' B U B' U' B U B' ");
			    		 moveB();
			    		 moveU();
			    		 moveBP();
			    		 moveUP();
			    		 moveUP();
			    		 moveB();
			    		 moveU(); 
			    		 moveBP();
			    		 moveUP();
			    		 moveB();
			    		 moveU();
			    		 moveBP();
			    		
			    	 }
			    	 
			    	 
			    	 
			     }
			     break;  
			     
			     
			     case 22:
			     {
			    	
			    	
			    	 
			    	 if(White[2][2].equals("R")&&Green[0][2].equals("Y")&&Red[0][0].equals("B")&&White[2][1].equals("B")&&Green[0][1].equals("R"))
			    	 //if(White[2][2].equals("Y")&&White[2][1].equals("B"))
			    	 {
			    		
				    	
				    	 System.out.println(" R' U R U' R' U' R");
			    		
			    		 moveRP();
			    		 moveU();
			    		 moveR();
			    		 moveUP();
			    		 moveRP();
			    		 moveUP();
			    		 moveR();
			    		
			    		
			    		 
			    	 }
			    	 if(White[2][2].equals("B")&&Green[0][2].equals("R")&&Red[0][0].equals("Y")&&White[2][1].equals("B")&&Green[0][1].equals("R"))
			    	 //if(White[2][2].equals("B")&&White[2][1].equals("B"))
			    	 {
			    		 System.out.println(" U'");
				    	 moveUP();
				    	 
				    	 System.out.println("U' R' U R");
			    		 moveUP();
			    		 moveRP();
			    		 moveU();
			    		 moveR();
			    	 }
			    	 
			    	 if(White[2][2].equals("Y")&&Green[0][2].equals("B")&&Red[0][0].equals("R")&&White[2][1].equals("B")&&Green[0][1].equals("R"))
			    	 //if(White[2][2].equals("O")&&White[2][1].equals("B"))
			    	 {
			    		 
			    		 System.out.println(" U'");
				    	 moveUP();
				    	 System.out.println(" R' U U R U R' U' R ");
			    		 moveRP();
			    		 moveU();
			    		 moveU();
			    		 moveR();
			    		 moveU();
			    		 moveRP();
			    		 moveUP(); 
			    		 moveR(); 
			    		
			    	 }
			    	 
			    	 if(White[2][2].equals("R")&&Green[0][2].equals("Y")&&Red[0][0].equals("B")&&White[2][1].equals("R")&&Green[0][1].equals("B"))
			    	 //if(White[2][2].equals("Y")&&White[2][1].equals("O"))
			    	 {
			    		 System.out.println(" U'");
				    	 moveUP();
			    		 System.out.println("R' U R U U B U B' ");
			    		 moveRP();
			    		 moveU();
			    		 moveR();
			    		 moveU();
			    		 moveU();
			    		 moveB();
			    		 moveU(); 
			    		 moveBP();
			    		
			    	 }
			    	 
			    	
			    	 if(White[2][2].equals("B")&&Green[0][2].equals("R")&&Red[0][0].equals("Y")&&White[2][1].equals("R")&&Green[0][1].equals("B"))
			    	 //if(White[2][2].equals("O")&&White[2][1].equals("O"))
			    	 {
			    		 
			    		
				    	 System.out.println(" R' U U R U' B U B' ");
			    		
			    		 moveRP();
			    		 moveU();
			    		 moveU();
			    		 moveR();
			    		 moveUP();
			    		 moveB(); 
			    		 moveU();
			    		 moveBP();
			    		
			    	 }
			    	 
			    	 
			    	 
			    	 if(White[2][2].equals("Y")&&Green[0][2].equals("B")&&Red[0][0].equals("R")&&White[2][1].equals("R")&&Green[0][1].equals("B"))
			    	// if(White[2][2].equals("B")&&White[2][1].equals("O"))
			    	 {
			    		
			    		 System.out.println(" U'");
				    	 moveUP();
				    	 System.out.println("B U B' U' U' B U B' U' B U B' ");
			    		 moveB();
			    		 moveU();
			    		 moveBP();
			    		 moveUP();
			    		 moveUP();
			    		 moveB();
			    		 moveU(); 
			    		 moveBP();
			    		 moveUP();
			    		 moveB();
			    		 moveU();
			    		 moveBP();
			    		
			    		
			    	 }
			    	 
			    	 
			    	 
			     }
			     break;  
			     
			     

			     case 33:
			     {
			    	
			    	 
			    	
			    	 
			    	 if(White[2][0].equals("R")&&Orange[0][2].equals("Y")&&Green[0][0].equals("B")&&White[1][0].equals("B")&&Orange[0][1].equals("R"))
			    	//(White[2][0].equals("Y")&&White[1][0].equals("B"))
			    	 {
			    		
				    	 System.out.println(" U' R' U R U' R' U' R");
			    		 moveUP();
			    		 moveRP();
			    		 moveU();
			    		 moveR();
			    		 moveUP();
			    		 moveRP();
			    		 moveUP();
			    		 moveR();
			    		
			    		 
			    	 }
			    	 if(White[2][0].equals("B")&&Orange[0][2].equals("R")&&Green[0][0].equals("Y")&&White[1][0].equals("B")&&Orange[0][1].equals("R"))
			    	 //if(White[2][0].equals("B")&&White[1][0].equals("B"))
			    	 {
			    		
				    	 System.out.println("U R' U R");
			    		 moveU();
			    		 moveRP();
			    		 moveU();
			    		 moveR();
			    	 }
			    	 
			    	 if(White[2][0].equals("Y")&&Orange[0][2].equals("B")&&Green[0][0].equals("R")&&White[1][0].equals("B")&&Orange[0][1].equals("R"))
			    	// if(White[2][0].equals("O")&&White[1][0].equals("B"))
			    	 {
			    		 System.out.println(" U  U");
				    	 moveU();
				    	 moveU();
				    	 System.out.println(" R' U U R U R' U' R ");
			    		 moveRP();
			    		 moveU();
			    		 moveU();
			    		 moveR();
			    		 moveU();
			    		 moveRP();
			    		 moveUP(); 
			    		 moveR(); 
			    		
			    	 }
			    	 
			    	 if(White[2][0].equals("R")&&Orange[0][2].equals("Y")&&Green[0][0].equals("B")&&White[1][0].equals("R")&&Orange[0][1].equals("B"))
			    	 //if(White[2][0].equals("Y")&&White[1][0].equals("O"))
			    	 {
			    		 System.out.println(" U U ");
				    	 moveU();
				    	 moveU();
				    	 System.out.println("R' U R U U B U B' ");
			    		 moveRP();
			    		 moveU();
			    		 moveR();
			    		 moveU();
			    		 moveU();
			    		 moveB();
			    		 moveU(); 
			    		 moveBP();
			    		
			    	 }
			    	 
			    	
			    	 if(White[2][0].equals("B")&&Orange[0][2].equals("R")&&Green[0][0].equals("Y")&&White[1][0].equals("R")&&Orange[0][1].equals("B"))
			    	 //if(White[2][0].equals("O")&&White[1][0].equals("O"))
			    	 {
			    		 
			    		 
				    	 System.out.println("U' R' U U R U' B U B' ");
			    		 moveUP();
			    		 moveRP();
			    		 moveU();
			    		 moveU();
			    		 moveR();
			    		 moveUP();
			    		 moveB(); 
			    		 moveU();
			    		 moveBP();
			    	 }
			    	 
			    	 
			    	 
			    	 if(White[2][0].equals("Y")&&Orange[0][2].equals("B")&&Green[0][0].equals("R")&&White[1][0].equals("R")&&Orange[0][1].equals("B"))
			    	// if(White[2][0].equals("B")&&White[1][0].equals("O"))
			    	 {
			    		 
			    		 System.out.println(" U U ");
				    	 moveU();
				    	 moveU();
				    	 System.out.println("B U B' U' U' B U B' U' B U B' ");
			    		 moveB();
			    		 moveU();
			    		 moveBP();
			    		 moveUP();
			    		 moveUP();
			    		 moveB();
			    		 moveU(); 
			    		 moveBP();
			    		 moveUP();
			    		 moveB();
			    		 moveU();
			    		 moveBP();
			    		
			    		
			    	 }
			    	 
			    	 
			    	 
			     }
			     break; 	
			     
			     
			     case 2:
			     {
			    	 if(White[0][0].equals("R")&&Blue[0][2].equals("Y")&&Orange[0][0].equals("B")&&White[2][1].equals("B")&&Green[0][1].equals("R"))
			    	 //if(White[0][0].equals("Y")&&White[2][1].equals("B"))
			    	 {
			    		 
			    		 System.out.println(" B U' B' U R' U' R ");
			    		 moveB();
			    		 moveUP();
			    		 moveBP();
			    		 moveU();
			    		 moveRP();
			    		 moveUP();
			    		 moveR();
			    		    		
			    		
			    		
			    		 
			    	 }
			    	 if(White[0][0].equals("B")&&Blue[0][2].equals("R")&&Orange[0][0].equals("Y")&&White[2][1].equals("B")&&Green[0][1].equals("R"))
			    	 //if(White[0][0].equals("B")&&White[2][1].equals("B"))
			    	 {
			    		 
			    		 System.out.println("  U U R' U U R U U R' U R ");
			    		 moveU();
			    		 moveU();
			    		 moveRP();
			    		 moveU();
			    		 moveU();
			    		 moveR();
			    		 moveU(); 
			    		 moveU(); 
			    		 moveRP(); 
			    		 moveU(); 
			    		 moveR(); 
			    	 }
			    	 
			    	 if(White[0][0].equals("Y")&&Blue[0][2].equals("B")&&Orange[0][0].equals("R")&&White[2][1].equals("B")&&Green[0][1].equals("R"))
			    	 //if(White[0][0].equals("O")&&White[2][1].equals("B"))
			    	 {
			    		 
			    		 System.out.println(" U' R' U' R U R' U R");
			    		 moveUP();
			    		 moveRP();
			    		 moveUP();
			    		 moveR();
			    		 moveU();
			    		 moveRP();
			    		 moveU();
			    		 moveR();
			    		
			    		
			    	 }
			    	 
			    	 if(White[0][0].equals("R")&&Blue[0][2].equals("Y")&&Orange[0][0].equals("B")&&White[2][1].equals("R")&&Green[0][1].equals("B"))
			    	 //if(White[0][0].equals("Y")&&White[2][1].equals("O"))
			    	 {
			    		 
			    		 System.out.println("B U B' U U  B U' B'");
			    		 moveB();
			    		 moveU();
			    		 moveBP();
			    		 moveU();
			    		 moveU();
			    		 moveB();
			    		 moveUP(); 
			    		 moveBP();
			    		
			    		
			    	 }
			    	 
			    	
			    	 if(White[0][0].equals("B")&&Blue[0][2].equals("R")&&Orange[0][0].equals("Y")&&White[2][1].equals("R")&&Green[0][1].equals("B"))
			    	 //if(White[0][0].equals("O")&&White[2][1].equals("O"))
			    	 {
			    		 
			    		 System.out.println(" U  B U B'");
			    		 
			    		 
			    		
			    		 moveU();
			    		 moveB();
			    		 moveU();
			    		 moveBP();
			    		 
			    		
			    	 }
			    	 
			    	 
			    	 
			    	 if(White[0][0].equals("Y")&&Blue[0][2].equals("B")&&Orange[0][0].equals("R")&&White[2][1].equals("R")&&Green[0][1].equals("B"))
			    	 //if(White[0][0].equals("B")&&White[2][1].equals("O"))
			    	 {
			    		 
			    		 System.out.println(" U U B U U B' U B U' B'");
			    		 
			    		 moveU();
			    		 moveU();
			    		 moveB();
			    		 moveU();
			    		 moveU();
			    		 moveBP();
			    		 moveU();
			    		 moveB();
			    		 moveUP();
			    		 moveBP();
			    		
			    		
			    	 }
			    	 
			    	 
			     }
			     break;
			     
			     
			     case 31:
			     {
			    	 ///////
			    	 System.out.println("reached here ====");
			    	 
			    	 if(White[2][0].equals("R")&&Orange[0][2].equals("Y")&&Green[0][0].equals("B")&&White[1][2].equals("B")&&Red[0][1].equals("R"))
			    	 //if(White[0][2].equals("Y")&&White[1][2].equals("B"))
			    	 {
			    		 System.out.println(" U ");
			    		 moveU();
			    		 System.out.println(" B U' B' U R' U' R ");
			    		 moveB();
			    		 moveUP();
			    		 moveBP();
			    		 moveU();
			    		 moveRP();
			    		 moveUP();
			    		 moveR();
			    		
			    		
			    		 
			    	 }
			    	 if(White[2][0].equals("B")&&Orange[0][2].equals("R")&&Green[0][0].equals("Y")&&White[1][2].equals("B")&&Red[0][1].equals("R"))
			    	 //if(White[0][2].equals("B")&&White[1][2].equals("B"))
			    	 {
			    		
			    		
			    		 
			    		 System.out.println("  U' R' U U R U U R' U R ");
			    		 
			    		 moveUP();
			    		 moveRP();
			    		 moveU();
			    		 moveU();
			    		 moveR();
			    		 moveU(); 
			    		 moveU(); 
			    		 moveRP(); 
			    		 moveU(); 
			    		 moveR(); 
			    	 }
			    	 
			    	 if(White[2][0].equals("Y")&&Orange[0][2].equals("B")&&Green[0][0].equals("R")&&White[1][2].equals("B")&&Red[0][1].equals("R"))
			    	 //if(White[0][2].equals("O")&&White[1][2].equals("B"))
			    	 {
			    		
			    		 System.out.println(" R' U' R U R' U R");
			    		
			    		 moveRP();
			    		 moveUP();
			    		 moveR();
			    		 moveU();
			    		 moveRP();
			    		 moveU();
			    		 moveR();
			    		
			    		
			    	 }
			    	 
			    	 if(White[2][0].equals("R")&&Orange[0][2].equals("Y")&&Green[0][0].equals("B")&&White[1][2].equals("R")&&Red[0][1].equals("B"))
			    	// if(White[0][2].equals("Y")&&White[1][2].equals("O"))
			    	 {
			    		 
			    		 System.out.println(" U ");
			    		 moveU();
			    		 System.out.println("B U B' U U  B U' B'");
			    		 moveB();
			    		 moveU();
			    		 moveBP();
			    		 moveU();
			    		 moveU();
			    		 moveB();
			    		 moveUP(); 
			    		 moveBP();
			    		
			    	 }
			    	 
			    	 if(White[2][0].equals("B")&&Orange[0][2].equals("R")&&Green[0][0].equals("Y")&&White[1][2].equals("R")&&Red[0][1].equals("B"))
			    	 
			    	// if(White[0][2].equals("O")&&White[1][2].equals("O"))
			    	 {
			    		 
			    		 System.out.println(" U ");
			    		 moveU();
			    		 System.out.println(" U  B U B'");
			    		 
			    		 
				    		
			    		 moveU();
			    		 moveB();
			    		 moveU();
			    		 moveBP();
			    		
			    	 }
			    	 
			    	 
			    	 
			    	 if(White[2][0].equals("Y")&&Orange[0][2].equals("B")&&Green[0][0].equals("R")&&White[1][2].equals("R")&&Red[0][1].equals("B"))
			    	 //if(White[0][2].equals("B")&&White[1][2].equals("O"))
			    	 {
			    		
                         System.out.println(" U' B U U B' U B U' B'");
			    		 
			    		 
			    		 moveUP();
			    		 moveB();
			    		 moveU();
			    		 moveU();
			    		 moveBP();
			    		 moveU();
			    		 moveB();
			    		 moveUP();
			    		 moveBP();
			    		
			    		
			    	 }
			    	 
			    	 
			     }
			     break;
			     
			     
			     
			     case 20:
			     {
			    	 
			    	 if(White[2][2].equals("R")&&Green[0][2].equals("Y")&&Red[0][0].equals("B")&&White[0][1].equals("B")&&Blue[0][1].equals("R"))
			    	 //if(White[2][2].equals("Y")&&White[0][1].equals("B"))
			    	 {
			    		 System.out.println(" U U ");
			    		 moveU();
			    		 moveU();
			    		 System.out.println("B U' B' U R' U' R ");
			    		 moveB();
			    		 moveUP();
			    		 moveBP();
			    		 moveU();
			    		 moveRP();
			    		 moveUP();
			    		 moveR();
			    		
			    		 
			    	 }
			    	 if(White[2][2].equals("B")&&Green[0][2].equals("R")&&Red[0][0].equals("Y")&&White[0][1].equals("B")&&Blue[0][1].equals("R"))
			    	 //if(White[2][2].equals("B")&&White[0][1].equals("B"))
			    	 {
			    		
			    		 System.out.println(" R' U U R U U R' U R ");
			    		
			    		 moveRP();
			    		 moveU();
			    		 moveU();
			    		 moveR();
			    		 moveU(); 
			    		 moveU(); 
			    		 moveRP(); 
			    		 moveU(); 
			    		 moveR(); 
			    		 
			    	 }
			    	 
			    	 if(White[2][2].equals("Y")&&Green[0][2].equals("B")&&Red[0][0].equals("R")&&White[0][1].equals("B")&&Blue[0][1].equals("R"))
			    	 //if(White[2][2].equals("O")&&White[0][1].equals("B"))
			    	 {
			    		 
			    		 System.out.println(" U R' U' R U R' U R");
			    		 moveU();
			    		 moveRP();
			    		 moveUP();
			    		 moveR();
			    		 moveU();
			    		 moveRP();
			    		 moveU();
			    		 moveR();
			    		
			    		
			    	 }
			    	 
			    	 if(White[2][2].equals("R")&&Green[0][2].equals("Y")&&Red[0][0].equals("B")&&White[0][1].equals("R")&&Blue[0][1].equals("B"))
			    	 //if(White[2][2].equals("Y")&&White[0][1].equals("O"))
			    	 {
			    		 System.out.println(" U U ");
			    		 moveU();
			    		 moveU();
			    		 System.out.println("B U B' U U  B U' B'");
			    		 moveB();
			    		 moveU();
			    		 moveBP();
			    		 moveU();
			    		 moveU();
			    		 moveB();
			    		 moveUP(); 
			    		 moveBP();
			    		
			    	 }
			    	 
			    	
			    	 
			    	
		    		 if(White[2][2].equals("B")&&Green[0][2].equals("R")&&Red[0][0].equals("Y")&&White[0][1].equals("R")&&Blue[0][1].equals("B"))
		    		 //if(White[2][2].equals("O")&&White[0][1].equals("O"))
			    	 {
		    			 
		    			
			    		 System.out.println(" U'  B U B'");
			    		 
			    		 
				    		
			    		 moveUP();
			    		 moveB();
			    		 moveU();
			    		 moveBP();
			    		
			    	 }
			    	 
			    	 
			    	 
		    		 if(White[2][2].equals("Y")&&Green[0][2].equals("B")&&Red[0][0].equals("R")&&White[0][1].equals("R")&&Blue[0][1].equals("B"))
			    	 //if(White[2][2].equals("B")&&White[0][1].equals("O"))
			    	 {
			    		
                         System.out.println(" B U U B' U B U' B'");
			    		 
			    		
			    		 moveB();
			    		 moveU();
			    		 moveU();
			    		 moveBP();
			    		 moveU();
			    		 moveB();
			    		 moveUP();
			    		 moveBP();
			    		
			    	 }
			    	 
			    	 
			     }
			     break;
			     
			     
			     case 13:
			     {
			    	 
		    		 
			    	 if(White[0][2].equals("R")&&Red[0][2].equals("Y")&&Blue[0][0].equals("B")&&White[1][0].equals("B")&&Orange[0][1].equals("R"))
			    	 //if(White[0][2].equals("Y")&&White[1][0].equals("B"))
			    	 {
			    			 
			    		 System.out.println(" U'");
			    	 	
			    		 moveUP();
			    		 System.out.println(" B U' B' U R' U' R");
			    		 moveB();
			    		 moveUP();
			    		 moveBP();
			    		 moveU();
			    		 moveRP();
			    		 moveUP();
			    		 moveR();
			    		
			    		 
			    	 }
			    	 
			    	 if(White[0][2].equals("B")&&Red[0][2].equals("R")&&Blue[0][0].equals("Y")&&White[1][0].equals("B")&&Orange[0][1].equals("R"))
			    	 //if(White[0][2].equals("B")&&White[1][0].equals("B"))
			    	 {
			    		
			    		 System.out.println(" U R' U U R U U R' U R ");
			    		
			    		 moveU();
			    		 moveRP();
			    		 moveU();
			    		 moveU();
			    		 moveR();
			    		 moveU(); 
			    		 moveU(); 
			    		 moveRP(); 
			    		 moveU(); 
			    		 moveR(); 
			    	 }
			    	 
			    	 if(White[0][2].equals("Y")&&Red[0][2].equals("B")&&Blue[0][0].equals("R")&&White[1][0].equals("B")&&Orange[0][1].equals("R"))
			    	 //if(White[0][2].equals("O")&&White[1][0].equals("B"))
			    	 {
			    		 System.out.println(" U' ");
			    		 moveUP();
			    		 System.out.println(" U' R' U' R U R' U R");
			    		 moveUP();
			    		 moveRP();
			    		 moveUP();
			    		 moveR();
			    		 moveU();
			    		 moveRP();
			    		 moveU();
			    		 moveR();
			    		
			    		
			    	 }
			    	 
			    	 if(White[0][2].equals("R")&&Red[0][2].equals("Y")&&Blue[0][0].equals("B")&&White[1][0].equals("R")&&Orange[0][1].equals("B"))
			    	 //if(White[0][2].equals("Y")&&White[1][0].equals("O"))
			    	 {
			    		 
			    		 System.out.println(" U' ");
			    		 moveUP();
			    		 System.out.println("B U B' U U  B U' B'");
			    		 moveB();
			    		 moveU();
			    		 moveBP();
			    		 moveU();
			    		 moveU();
			    		 moveB();
			    		 moveUP(); 
			    		 moveBP();
			    		
			    	 }
			    	 
			    	
			    	 if(White[0][2].equals("B")&&Red[0][2].equals("R")&&Blue[0][0].equals("Y")&&White[1][0].equals("R")&&Orange[0][1].equals("B"))
			    	// if(White[0][2].equals("O")&&White[1][0].equals("O"))
			    	 {
			    		 
			    		 System.out.println("   B U B'");
			    		 
			    		 
				    		
			    		
			    		 moveB();
			    		 moveU();
			    		 moveBP();
			    		
			    	 }
			    	 
			    	 
			    	 
			    	 if(White[0][2].equals("Y")&&Red[0][2].equals("B")&&Blue[0][0].equals("R")&&White[1][0].equals("R")&&Orange[0][1].equals("B"))
			    	 //if(White[0][2].equals("B")&&White[1][0].equals("O"))
			    	 {
			    		
                       System.out.println(" U B U U B' U B U' B'");
			    		 
			    		
			    		 moveU();
			    		 moveB();
			    		 moveU();
			    		 moveU();
			    		 moveBP();
			    		 moveU();
			    		 moveB();
			    		 moveUP();
			    		 moveBP();
			    		
			    		
			    	 }
			    	 
			    	 
			     }
			     break;
			     
			     
			     
			     case 10:
			     {
			    	
			    	 if(White[0][2].equals("R")&&Red[0][2].equals("Y")&&Blue[0][0].equals("B")&&White[0][1].equals("B")&&Blue[0][1].equals("R"))
			    	// if(White[0][2].equals("Y")&&White[0][1].equals("B"))
			    	 {
			    		 
			    		 System.out.println("U' B U U B' U R' U' R");
			    		 moveUP();
			    		 moveB();
			    		 moveU();
			    		 moveU();
			    		 moveBP();
			    		 moveU();
			    		 moveRP();
			    		 moveUP();
			    		 moveR();
			    		
			    		 
			    	 }
			    	 if(White[0][2].equals("B")&&Red[0][2].equals("R")&&Blue[0][0].equals("Y")&&White[0][1].equals("B")&&Blue[0][1].equals("R"))
			    	 //if(White[0][2].equals("B")&&White[0][1].equals("B"))
			    	 {
			    		
			    		 System.out.println(" B U' B' U U R' U' R ");
			    		 moveB();
			    		 moveUP();
			    		 moveBP();
			    		 moveU();
			    		 moveU();
			    		 moveRP();
			    		 moveUP();
			    		 moveR();
			    		 
			    	 }
			    	 
			    	 if(White[0][2].equals("Y")&&Red[0][2].equals("B")&&Blue[0][0].equals("R")&&White[0][1].equals("B")&&Blue[0][1].equals("R"))
			    	// if(White[0][2].equals("O")&&White[0][1].equals("B"))
			    	 {
			    		
			    		 System.out.println("R U R' U R U' R' R' U R");
					    	
			    		 moveR();
			    		 moveU();
			    		 moveRP();
			    		 moveU();
			    		 moveR();
			    		 moveUP();
			    		 moveRP();
			    		 moveRP();
			    		 moveU();
			    		 moveR();
			    		
			    	 }
			    	 
			    	 if(White[0][2].equals("R")&&Red[0][2].equals("Y")&&Blue[0][0].equals("B")&&White[0][1].equals("R")&&Blue[0][1].equals("B"))
			    	// if(White[0][2].equals("Y")&&White[0][1].equals("O"))
			    	 {
			    		 
			    		 System.out.println("U B U' B'");
			    		 moveU();
			    		 moveB();
			    		 moveUP();
			    		 moveBP();
			    		
			    		
			    	 }
			    	 
			    	
			    	 if(White[0][2].equals("B")&&Red[0][2].equals("R")&&Blue[0][0].equals("Y")&&White[0][1].equals("R")&&Blue[0][1].equals("B"))
			    	// if(White[0][2].equals("O")&&White[0][1].equals("O"))
			    	 {
			    		
			    		 System.out.println(" U' B U' B' U B U B'");
			    		 
			    		 
			    		
			    		 moveUP();
			    		 moveB();
			    		 moveUP();
			    		 moveBP();
			    		 moveU();
			    		 moveB();
			    		 moveU();
			    		 moveBP();
			    		 
			    		
			    	 }
			    	 
			    	 
			    	 
			    	 if(White[0][2].equals("Y")&&Red[0][2].equals("B")&&Blue[0][0].equals("R")&&White[0][1].equals("R")&&Blue[0][1].equals("B"))
			    	// if(White[0][2].equals("B")&&White[0][1].equals("O"))
			    	 {
			    		
			    		 System.out.println(" B U U B' U' B U B'");
			    		 
			    	
			    		 moveB();
			    		 moveU();
			    		 moveU();
			    		 moveBP();
			    		 moveUP();
			    		 moveB();
			    		 moveU();
			    		 moveBP();
			    		
			    		
			    	 }
			    	 
			    	 
			     }
			     break;
			     
			     
			     
			     
			     
			     case 3:
			     {
			    	 
			    	 if(White[0][0].equals("R")&&Blue[0][2].equals("Y")&&Orange[0][0].equals("B")&&White[1][0].equals("B")&&Orange[0][1].equals("R"))
			    	// if(White[0][0].equals("Y")&&White[1][0].equals("B"))
			    	 {
			    		 
			    		 System.out.println(" B U U B' U R' U' R");
			    	
			    		 moveB();
			    		 moveU();
			    		 moveU();
			    		 moveBP();
			    		 moveU();
			    		 moveRP();
			    		 moveUP();
			    		 moveR();
			    		
			    		
			    		 
			    	 }
			    	 if(White[0][0].equals("B")&&Blue[0][2].equals("R")&&Orange[0][0].equals("Y")&&White[1][0].equals("B")&&Orange[0][1].equals("R"))
			    	 //if(White[0][0].equals("B")&&White[1][0].equals("B"))
			    	 {
			    		
			    		 System.out.println("U ");
			    		
			    		 moveU();
			    		 System.out.println(" B U' B' U U R' U' R ");
			    		 moveB();
			    		 moveUP();
			    		 moveBP();
			    		 moveU();
			    		 moveU();
			    		 moveRP();
			    		 moveUP();
			    		 moveR();
			    		 
			    	 }
			    	 
			    	 if(White[0][0].equals("Y")&&Blue[0][2].equals("B")&&Orange[0][0].equals("R")&&White[1][0].equals("B")&&Orange[0][1].equals("R"))
			    	// if(White[0][0].equals("O")&&White[1][0].equals("B"))
			    	 {
			    		 System.out.println(" U ");
			    		 moveU();
			    		 System.out.println("R U R' U R U' R' R' U R");
					    	
			    		 moveR();
			    		 moveU();
			    		 moveRP();
			    		 moveU();
			    		 moveR();
			    		 moveUP();
			    		 moveRP();
			    		 moveRP();
			    		 moveU();
			    		 moveR();
			    		
			    	 }
			    	 
			    	 if(White[0][0].equals("R")&&Blue[0][2].equals("Y")&&Orange[0][0].equals("B")&&White[1][0].equals("R")&&Orange[0][1].equals("B"))
			    	 //if(White[0][0].equals("Y")&&White[1][0].equals("O"))
			    	 {
			    		 System.out.println(" U ");
			    		 moveU();
			    		 
			    		 System.out.println("U B U' B'");
			    		 moveU();
			    		 moveB();
			    		 moveUP();
			    		 moveBP();
			    		
			    		
			    	 }
			    	 
			    	
			    	 if(White[0][0].equals("B")&&Blue[0][2].equals("R")&&Orange[0][0].equals("Y")&&White[1][0].equals("R")&&Orange[0][1].equals("B"))
			    	 //if(White[0][0].equals("O")&&White[1][0].equals("O"))
			    	 {
			    		
			    		 System.out.println(" B U' B' U B U B'");
			    		 
			    		
			    		 moveB();
			    		 moveUP();
			    		 moveBP();
			    		 moveU();
			    		 moveB();
			    		 moveU();
			    		 moveBP();
			    		 
			    		
			    	 }
			    	 
			    	 
			    	 
			    	 if(White[0][0].equals("Y")&&Blue[0][2].equals("B")&&Orange[0][0].equals("R")&&White[1][0].equals("R")&&Orange[0][1].equals("B"))
			    	 //if(White[0][0].equals("B")&&White[1][0].equals("O"))
			    	 {
			    		 System.out.println(" U ");
			    		 moveU();
			    		 System.out.println(" B U U B' U' B U B'");
			    		 
					    	
			    		 moveB();
			    		 moveU();
			    		 moveU();
			    		 moveBP();
			    		 moveUP();
			    		 moveB();
			    		 moveU();
			    		 moveBP();
			    		
			    		
			    	 }
			    	 
			    	 
			     }
			     break;
			     
			     
			     
			     
			    
			     case 21:
			     {
			    	 
			    	 if(White[2][2].equals("R")&&Green[0][2].equals("Y")&&Red[0][0].equals("B")&&White[1][2].equals("B")&&Red[0][1].equals("R"))
			    	// if(White[2][2].equals("Y")&&White[1][2].equals("B"))
			    	 {
			    		 System.out.println("U'");
				    	 moveUP();
				    	 System.out.println("U' B U U B' U R' U' R");
			    		 moveUP();
			    		 moveB();
			    		 moveU();
			    		 moveU();
			    		 moveBP();
			    		 moveU();
			    		 moveRP();
			    		 moveUP();
			    		 moveR();
			    		
			    		 
	 
			    		
			    		
			    		 
			    	 }
			    	 if(White[2][2].equals("B")&&Green[0][2].equals("R")&&Red[0][0].equals("Y")&&White[1][2].equals("B")&&Red[0][1].equals("R"))
			    	 //if(White[2][2].equals("B")&&White[1][2].equals("B"))
			    	 {
			    		
			    		 System.out.println("  U'  ");
			    		 moveUP();
			    		 System.out.println(" B U' B' U U R' U' R ");
			    		 moveB();
			    		 moveUP();
			    		 moveBP();
			    		 moveU();
			    		 moveU();
			    		 moveRP();
			    		 moveUP();
			    		 moveR();

			    		 
			    	 }
			    	 
			    	 if(White[2][2].equals("Y")&&Green[0][2].equals("B")&&Red[0][0].equals("R")&&White[1][2].equals("B")&&Red[0][1].equals("R"))
			    	 //if(White[2][2].equals("O")&&White[1][2].equals("B"))
			    	 {
			    		 
			    		 System.out.println(" U'");
			    		 moveUP();
			    		 System.out.println("R U R' U R U' R' R' U R");
					    	
			    		 moveR();
			    		 moveU();
			    		 moveRP();
			    		 moveU();
			    		 moveR();
			    		 moveUP();
			    		 moveRP();
			    		 moveRP();
			    		 moveU();
			    		 moveR();

			    	 }
			    	 
			    	 if(White[2][2].equals("R")&&Green[0][2].equals("Y")&&Red[0][0].equals("B")&&White[1][2].equals("R")&&Red[0][1].equals("B"))
			    	 //if(White[2][2].equals("Y")&&White[1][2].equals("O"))
			    	 {
			    		 			    	 
				    	 System.out.println(" B U' B'");
			    		
			    		 moveB();
			    		 moveUP();
			    		 moveBP();

			    		
			    	 }
			    	 
			    	
			    	 if(White[2][2].equals("B")&&Green[0][2].equals("R")&&Red[0][0].equals("Y")&&White[1][2].equals("R")&&Red[0][1].equals("B"))
			    	// if(White[2][2].equals("O")&&White[1][2].equals("O"))
			    	 {
			    		 System.out.println("U'");
				    	 moveUP();
				    	 
				    	 System.out.println(" U' B U' B' U B U B'");
			    		 
			    		 
				    		
			    		 moveUP();
			    		 moveB();
			    		 moveUP();
			    		 moveBP();
			    		 moveU();
			    		 moveB();
			    		 moveU();
			    		 moveBP();

			    		
			    	 }
			    	 
			    	 
			    	 
			    	 if(White[2][2].equals("Y")&&Green[0][2].equals("B")&&Red[0][0].equals("R")&&White[1][2].equals("R")&&Red[0][1].equals("B"))
			    	 //if(White[2][2].equals("B")&&White[1][2].equals("O"))
			    	 {
			    		
			    		 System.out.println(" U'");
			    		 
			    		 moveUP();

			    		 System.out.println(" B U U B' U' B U B'");
			    		 
			    	
			    		 moveB();
			    		 moveU();
			    		 moveU();
			    		 moveBP();
			    		 moveUP();
			    		 moveB();
			    		 moveU();
			    		 moveBP();

			    		
			    		
			    	 }
			    	 
			    	 
			     }
			     break;
			     
			     
			     
			     case 32:
			     {
			    	 
			    	 
			    	 if(White[2][0].equals("R")&&Orange[0][2].equals("Y")&&Green[0][0].equals("B")&&White[2][1].equals("B")&&Green[0][1].equals("R"))
			    	// if(White[2][0].equals("Y")&&White[2][1].equals("B"))
			    	 {
			    		 
				    	 System.out.println("U B U U B' U R' U' R");
			    		 moveU();
			    		 moveB();
			    		 moveU();
			    		 moveU();
			    		 moveBP();
			    		 moveU();
			    		 moveRP();
			    		 moveUP();
			    		 moveR();

			    		 
			    	 }
			    	 if(White[2][0].equals("B")&&Orange[0][2].equals("R")&&Green[0][0].equals("Y")&&White[2][1].equals("B")&&Green[0][1].equals("R"))
			    	 //if(White[2][0].equals("B")&&White[2][1].equals("B"))
			    	 {
			    		 
			    		 System.out.println("U U ");
			    	
			    		 moveU();
			    		 moveU();
			    		 System.out.println(" B U' B' U U R' U' R ");
			    		 moveB();
			    		 moveUP();
			    		 moveBP();
			    		 moveU();
			    		 moveU();
			    		 moveRP();
			    		 moveUP();
			    		 moveR();

			    		 
			    	 }
			    	 
			    	 if(White[2][0].equals("Y")&&Orange[0][2].equals("B")&&Green[0][0].equals("R")&&White[2][1].equals("B")&&Green[0][1].equals("R"))
			    	 //if(White[2][0].equals("O")&&White[2][1].equals("B"))
			    	 {
			    		 System.out.println("U U");
				    	 moveU();
				    	 moveU();
				    	 System.out.println("R U R' U R U' R' R' U R");
					    	
			    		 moveR();
			    		 moveU();
			    		 moveRP();
			    		 moveU();
			    		 moveR();
			    		 moveUP();
			    		 moveRP();
			    		 moveRP();
			    		 moveU();
			    		 moveR();

			    		
			    	 }
			    	 
			    	 if(White[2][0].equals("R")&&Orange[0][2].equals("Y")&&Green[0][0].equals("B")&&White[2][1].equals("R")&&Green[0][1].equals("B"))
			    	 //if(White[2][0].equals("Y")&&White[2][1].equals("O"))
			    	 {
			    		
				    	 System.out.println("U' B U' B'");
			    		 moveUP();
			    		 moveB();
			    		 moveUP();
			    		 moveBP();

			    		
			    	 }
			    	 
			    	
			    	 if(White[2][0].equals("B")&&Orange[0][2].equals("R")&&Green[0][0].equals("Y")&&White[2][1].equals("R")&&Green[0][1].equals("B"))
			    	// if(White[2][0].equals("O")&&White[2][1].equals("O"))
			    	 {
			    		
				    	 System.out.println(" U B U' B' U B U B'");
			    		 
			    		 
				    		
			    		 moveU();
			    		 moveB();
			    		 moveUP();
			    		 moveBP();
			    		 moveU();
			    		 moveB();
			    		 moveU();
			    		 moveBP();

			    		
			    	 }
			    	 
			    	 
			    	 
			    	 if(White[2][0].equals("Y")&&Orange[0][2].equals("B")&&Green[0][0].equals("R")&&White[2][1].equals("R")&&Green[0][1].equals("B"))
			    	 //if(White[2][0].equals("B")&&White[2][1].equals("O"))
			    	 {
			    		 
			    		 System.out.println(" U U ");
			    		 
			    		 moveU();
			    		 moveU();
			    		 System.out.println(" B U U B' U' B U B'");
			    		 
					    	
			    		 moveB();
			    		 moveU();
			    		 moveU();
			    		 moveBP();
			    		 moveUP();
			    		 moveB();
			    		 moveU();
			    		 moveBP();

			    		 
			    		 
			    		
			    	 }
			    	 
			    	 
			     }
			     break;
			     
     }
     
      
     
     
	 
}




public static void solveYOGandOG()
{
	 System.out.println("find the location of YOG corner and orientation  ");
	 int t=0;
	 
	 
	 while(t<8)
	 {
		 corners=cor[0][t];
		 System.out.print(corners+",");
		 
		 if(cor[0][t].equals("YGO")|| cor[0][t].equals("OYG")||cor[0][t].equals("GOY")||cor[0][t].equals("YOG")||cor[0][t].equals("OGY")||cor[0][t].equals("GYO"))
		 {
			 cor3=cor[0][t];
			 F2LCor3=cor3;
			 System.out.println(F2LCor3);
			 F2LCorpos3=t;
			 System.out.println(F2LCorpos3);
			 
			 if(F2LCorpos3>3)
			 {
				 switch(F2LCorpos3)
				 
				 {
				 
						 case 4:
							 
						 {
							 System.out.println("L' U' L");
							 moveLP();
							 moveUP();
							 moveL();
							 
						 }
						 break;
						 
						 case 5:
						 {
							 
							 System.out.println("R U R'");
							 moveR();
							 moveU();
							 moveRP();
						 }
				         break;
				         
				         
						 case 6:
						 {
							 
							 System.out.println("R' U R");
							 moveRP();
							 moveU();
							 moveR();
						 }
				         break;
				         
				         
						 case 7:
						 {
							 
							 System.out.println("L U L'");
							 moveL();
							 moveU();
							 moveLP();
						 }
				         break;
				         
				        
				 }
				 
				 
			 }
		 }
		 
		 t++;
		 
		 
	 }
	 
	
	 
	 FindCorners();
	 
	 
	 System.out.println("the updated location of YOG corner and orientation  ");
	int  f=0;
	 
	 while(f<8)
	 {
		 corners=cor[0][f];
		 
		 if(cor[0][f].equals("YGO")|| cor[0][f].equals("OYG")||cor[0][f].equals("GOY")||cor[0][f].equals("YOG")||cor[0][f].equals("OGY")||cor[0][f].equals("GYO"))
		 {
			 cor3=cor[0][f];
			 F2LCor3=cor3;
			 System.out.println(F2LCor3);
			 F2LCorpos3=f;
			 System.out.println(F2LCorpos3);
			 
			 
		}
		 f++;
		 
		 
	 }
	 
	 
 FindEdges();
	 
	 
	 System.out.println("the location of GO edge is  ");
	int  s=0;
	 
	 while(s<12)
	 {
		 edges=ed[0][s];
		 
		 if(ed[0][s].equals("GO")|| ed[0][s].equals("OG"))
		 {
			 ed3=ed[0][s];
			 F2Led3=ed3;
			 System.out.println(F2Led3);
			 F2LEdpos3=s;
			 System.out.println(F2LEdpos3);
			 
			 if(F2LEdpos3>7)
			 {
				 switch(F2LEdpos3)
				 
				 {
				 
						 case 8:
	
							 
							 
						 {
							 if(F2LCorpos3==3)
							 {
								 
								 System.out.println("L' U U L");
								 moveLP();
								 moveU();
								 moveU();
								 moveL();
								 
							 }
							 
							 else
							 {
								 System.out.println("L'  U' L");
								 moveLP();
								
								 moveUP();
								 moveL();
								  
								 
							 }
						 }
						 break;
						 
						 case 9:
						 {
							 
							 if(F2LCorpos3==2)
							 {
								 
								 System.out.println("R U U R'");
								 moveR();
								 moveU();
								 moveU();
								 moveRP();
								 
							 }
							 
							 else
							 {
								 System.out.println("R  U R'");
								 moveR();
								
								 moveU();
								 moveRP();
								  
								 
							 }
						 }
				         break;
				         
				         
						 case 10:
						 {
							 
							 if(F2LCorpos3==1)
							 {
								 
								 System.out.println("R' U U R");
								 moveRP();
								 moveU();
								 moveU();
								 moveR();
								 
							 }
							 
							 else
							 {
								 System.out.println("R'  U' R");
								 moveRP();
								
								 moveUP();
								 moveR();
								  
								 
							 }
						 }
				         break;
				         
				         
						 case 11:
						 {
							 
							 if(F2LCorpos3==0)
							 {
								 
								 System.out.println("L U U L'");
								 moveL();
								 moveU();
								 moveU();
								 moveLP();
								 
							 }
							 
							 else
							 {
								 System.out.println("L U L'");
								 moveL();
								
								 moveU();
								 moveLP();
								  
								 
							 }
						 }
				         break;
				         
				        
				 }
				 
				 
			 }
			 
			 
			 
			 
			 
		}
		 s++;
		
		 
		 
	 }
	  
	 
	 
	 
	 FindCorners();
	 
	 
	 System.out.println("the updated location of YOG corner and orientation  ");
	  f=0;
	 
	 while(f<8)
	 {
		 corners=cor[0][f];
		 
		 if(cor[0][f].equals("YGO")|| cor[0][f].equals("OYG")||cor[0][f].equals("GOY")||cor[0][f].equals("YOG")||cor[0][f].equals("OGY")||cor[0][f].equals("GYO"))
		 {
			 cor3=cor[0][f];
			 F2LCor3=cor3;
			 System.out.println(F2LCor3);
			 F2LCorpos3=f;
			 System.out.println(F2LCorpos3);
			 
			 
		}
		 f++;
		 
		 
	 }
	 	 
	
	 
	 FindEdges();
	 
	 
	 System.out.println("the updated location of GO edge and orientation  ");
	  s=0;
	 
	 while(s<12)
	 {
		 edges=ed[0][s];
		 
		 if(ed[0][s].equals("GO")|| ed[0][s].equals("OG"))
		 {
			 ed3=ed[0][s];
			 F2Led3=ed3;
			 System.out.println(F2Led3);
			 F2LEdpos3=s;
			 System.out.println(F2LEdpos3);
			 
			 
		}
		 s++;
		 
		 
	 }
	 
	 
	System.out.println("now i know the location of the corner and the edge");
	
	 System.out.println("location of corner"+F2LCorpos3);
	 System.out.println("corner is"+F2LCor3);
	 System.out.println("location of edge"+F2LEdpos3);
	 System.out.println("edge is"+F2Led3);
	 
	 
	 int YOGOGpos= 10*F2LCorpos3+ F2LEdpos3;
	 System.out.println("the case to be executed");
	 System.out.println(YOGOGpos);
     String YOGOG=	 F2LCor3+F2Led3;
     
     switch(YOGOGpos)
     {
     
			     case 12:
			     {
			    	
			    	 if(White[0][2].equals("O")&&Red[0][2].equals("Y")&&Blue[0][0].equals("G")&&White[2][1].equals("G")&&Green[0][1].equals("O"))
			    	 {
			    		 
			    		 System.out.println(" U U L' U' L  ");
			    		 moveU();
			    		 moveU();
			    		 moveLP();
			    		 moveUP();
			    		 moveL();
			    		
			    		 
			    	 }
			    	 
			    	 if(White[0][2].equals("Y")&&Red[0][2].equals("G")&&Blue[0][0].equals("O")&&White[2][1].equals("G")&&Green[0][1].equals("O"))
			    	 {
			    		 
			    		 System.out.println("U L' U U L U' L' U L ");
			    		 moveU();
			    		 moveLP();
			    		 moveU();
			    		 moveU();
			    		 moveL();
			    		 moveUP();
			    		 moveLP(); 
			    		 moveU(); 
			    		 moveL(); 
			    	 }
			    	 //YB
			    	 
			    	 if(White[0][2].equals("G")&&Red[0][2].equals("O")&&Blue[0][0].equals("Y")&&White[2][1].equals("G")&&Green[0][1].equals("O"))
			    	 {
			    		 
			    		 System.out.println(" U' L' U' L U U L' U L ");
			    		 moveUP();
			    		 moveLP();
			    		 moveUP();
			    		 moveL();
			    		 moveU();
			    		 moveU();
			    		 moveLP(); 
			    		 moveU();
			    		 moveL();
			    	 }
			    	 
			    	 //YO
			    	 if(White[0][2].equals("Y")&&Red[0][2].equals("G")&&Blue[0][0].equals("O")&&White[2][1].equals("O")&&Green[0][1].equals("G"))
			    	 {
			    		 
			    		 System.out.println(" F U F' U F U' F' ");
			    		 moveF();
			    		 moveU();
			    		 moveFP();
			    		 moveU();
			    		 moveF();
			    		 moveUP();
			    		 moveFP(); 
			    		 
			    		 
			    	 }
			    	 
			    	
			    	 //O O
			    	 if(White[0][2].equals("O")&&Red[0][2].equals("Y")&&Blue[0][0].equals("G")&&White[2][1].equals("O")&&Green[0][1].equals("G"))
			    	 {
			    		 
			    		 System.out.println("U F U U F' U U F U' F'");
			    		 moveU();
			    		 moveF();
			    		 moveU();
			    		 moveU();
			    		 moveFP();
			    		 moveU();
			    		 moveU(); 
			    		 moveF();
			    		 moveUP();
			    		 moveFP();
			    		
			    		
			    	 }
			    	 
			    	 
			    	 
			    	 //BO
			    	 if(White[0][2].equals("G")&&Red[0][2].equals("O")&&Blue[0][0].equals("Y")&&White[2][1].equals("O")&&Green[0][1].equals("G"))
			    	 {
			    		 
			    		 System.out.println(" U  F U F' U F U F'");
			    		 
			    		 moveU();
			    		 moveF();
			    		 moveU();
			    		 moveFP();
			    		 moveU();
			    		 moveF(); 
			    		 moveU();
			    		 moveFP();
			    		
			    	 }
			    	 
			    	 
			    	 
			     }
			     break;
			     
			     
			     case 1:
			     {
			    	//OB
			    	 if(White[0][0].equals("O")&&Blue[0][2].equals("Y")&&Orange[0][0].equals("G")&&White[1][2].equals("G")&&Red[0][1].equals("O"))
			    	// if(White[0][0].equals("O")&&White[1][2].equals("B"))
			    	 {

				    	
				    	 System.out.println(" U' L' U' L  ");
			    		
			    		 moveUP();
			    		 moveLP();
			    		 moveUP();
			    		 moveL();
			    		 
			    	 }
			    	 
			    	 if(White[0][0].equals("Y")&&Blue[0][2].equals("G")&&Orange[0][0].equals("O")&&White[1][2].equals("G")&&Red[0][1].equals("O"))
			    	 //if(White[0][0].equals("B")&&White[1][2].equals("B"))
			    	 {

			    		 System.out.println("U");
				    	 moveU();
				    	 System.out.println("U L' U U L U' L' U L ");
			    		 moveU();
			    		 moveLP();
			    		 moveU();
			    		 moveU();
			    		 moveL();
			    		 moveUP();
			    		 moveLP(); 
			    		 moveU(); 
			    		 moveL(); 
			    	 }
			    	 
			    	 if(White[0][0].equals("G")&&Blue[0][2].equals("O")&&Orange[0][0].equals("Y")&&White[1][2].equals("G")&&Red[0][1].equals("O"))
			    	 //if(White[0][0].equals("Y")&&White[1][2].equals("B"))
			    	 {

				    	 
				    	 System.out.println(" L' U' L U U L' U L ");
			    		
			    		 moveLP();
			    		 moveUP();
			    		 moveL();
			    		 moveU();
			    		 moveU();
			    		 moveLP(); 
			    		 moveU();
			    		 moveL();
			    	 }
			    	 
			    	 if(White[0][0].equals("Y")&&Blue[0][2].equals("G")&&Orange[0][0].equals("O")&&White[1][2].equals("O")&&Red[0][1].equals("G"))
			    	 //if(White[0][0].equals("Y")&&White[1][2].equals("O"))
			    	 {
			    		
			    		 System.out.println("U");
				    	 moveU();
				    	 System.out.println(" F U F' U F U' F' ");
			    		 moveF();
			    		 moveU();
			    		 moveFP();
			    		 moveU();
			    		 moveF();
			    		 moveUP();
			    		 moveFP();
			    	 }
			    	 
			    	
			    	 if(White[0][0].equals("O")&&Blue[0][2].equals("Y")&&Orange[0][0].equals("G")&&White[1][2].equals("O")&&Red[0][1].equals("G"))
			    	 //if(White[0][0].equals("O")&&White[1][2].equals("O"))
			    	 {

				    	 System.out.println("U");
				    	 moveU();
				    	 System.out.println("U F U U F' U U F U' F'");
			    		 moveU();
			    		 moveF();
			    		 moveU();
			    		 moveU();
			    		 moveFP();
			    		 moveU();
			    		 moveU(); 
			    		 moveF();
			    		 moveUP();
			    		 moveFP();
			    		
			    		
			    	 }
			    	 
			    	 
			    	 
			    	 if(White[0][0].equals("G")&&Blue[0][2].equals("O")&&Orange[0][0].equals("Y")&&White[1][2].equals("O")&&Red[0][1].equals("G"))
			    	// if(White[0][0].equals("B")&&White[1][2].equals("O"))
			    	 {

				    	 
			    		 
			    		 System.out.println("U");
				    	 moveU();
				    	 
			    		 System.out.println(" U  F U F' U F U F'");
			    		 
			    		 moveU();
			    		 moveF();
			    		 moveU();
			    		 moveFP();
			    		 moveU();
			    		 moveF(); 
			    		 moveU();
			    		 moveFP();
			    		
			    	 }
			    	 
			    	 
			    	 
			     }
			     break;
			     
			     ////REMAINING
			     case 23:
			     {
			    	
			    	 if(White[2][2].equals("O")&&Green[0][2].equals("Y")&&Red[0][0].equals("G")&&White[1][0].equals("G")&&Orange[0][1].equals("O"))
			    	 //if(White[2][2].equals("O")&&White[1][0].equals("B"))
			    	 {
			    		 
				    	 System.out.println("U L' U' L  ");
			    		 
			    		 moveU();
			    		 moveLP();
			    		 moveUP();
			    		 moveL();
			    		
				    	
			    		

			    		 
			    	 }
			    	 
			    	 if(White[2][2].equals("Y")&&Green[0][2].equals("G")&&Red[0][0].equals("O")&&White[1][0].equals("G")&&Orange[0][1].equals("O"))
			    	 //if(White[2][2].equals("B")&&White[1][0].equals("B"))
			    	 {
			    		 
			    		
				    	 System.out.println(" L' U U L U' L' U L ");
			    		 
			    		 moveLP();
			    		 moveU();
			    		 moveU();
			    		 moveL();
			    		 moveUP();
			    		 moveLP(); 
			    		 moveU(); 
			    		 moveL(); 

			    		
			    	 }
			    	 
			    	 if(White[2][2].equals("G")&&Green[0][2].equals("O")&&Red[0][0].equals("Y")&&White[1][0].equals("G")&&Orange[0][1].equals("O"))
			    	 //if(White[2][2].equals("Y")&&White[1][0].equals("B"))
			    	 {
			    		 
			    		 System.out.println("U'");
				    	 moveUP();
				    	 System.out.println(" U' L' U' L U U L' U L ");
			    		 moveUP();
			    		 moveLP();
			    		 moveUP();
			    		 moveL();
			    		 moveU();
			    		 moveU();
			    		 moveLP(); 
			    		 moveU();
			    		 moveL();

			    	 }
			    	 
			    	 if(White[2][2].equals("Y")&&Green[0][2].equals("G")&&Red[0][0].equals("O")&&White[1][0].equals("O")&&Orange[0][1].equals("G"))
			    	// if(White[2][2].equals("Y")&&White[1][0].equals("O"))
			    	 {
			    		 
			    		 System.out.println("U'");
				    	 moveUP();
				    	 System.out.println(" F U F' U F U' F' ");
			    		 moveF();
			    		 moveU();
			    		 moveFP();
			    		 moveU();
			    		 moveF();
			    		 moveUP();
			    		 moveFP(); 
			    		 

			    	 }
			    	 
			    	
			    	 if(White[2][2].equals("O")&&Green[0][2].equals("Y")&&Red[0][0].equals("G")&&White[1][0].equals("O")&&Orange[0][1].equals("G"))
			    	// if(White[2][2].equals("O")&&White[1][0].equals("O"))
			    	 {   
			    		 
			    		 
			    		 
				    	 System.out.println(" F U U F' U U F U' F'");
			    		
			    		 moveF();
			    		 moveU();
			    		 moveU();
			    		 moveFP();
			    		 moveU();
			    		 moveU(); 
			    		 moveF();
			    		 moveUP();
			    		 moveFP();



			    		
			    		
			    	 }
			    	 
			    	 
			    	 
			    	 if(White[2][2].equals("G")&&Green[0][2].equals("O")&&Red[0][0].equals("Y")&&White[1][0].equals("O")&&Orange[0][1].equals("G"))
			    	 //if(White[2][2].equals("B")&&White[1][0].equals("O"))
			    	 {
			    		
                         System.out.println(" F U F' U F U F'");
			    		 
			    		
			    		 moveF();
			    		 moveU();
			    		 moveFP();
			    		 moveU();
			    		 moveF(); 
			    		 moveU();
			    		 moveFP();

			    		
			    		
			    	 }
			    	 
			    	 
			    	 
			     }
			     break;
			     
			     
			     case 30:
			     {
			    	
			    	 
			    	 
			    	 if(White[2][0].equals("O")&&Orange[0][2].equals("Y")&&Green[0][0].equals("G")&&White[0][1].equals("G")&&Blue[0][1].equals("O"))
			    	 //if(White[2][0].equals("O")&&White[0][1].equals("B"))
			    	 {
			    		
				    	 System.out.println(" L' U' L  ");
			    		
			    		 moveLP();
			    		 moveUP();
			    		 moveL();
				    	
			    		 
			    	 }
			    	 if(White[2][0].equals("Y")&&Orange[0][2].equals("G")&&Green[0][0].equals("O")&&White[0][1].equals("G")&&Blue[0][1].equals("O"))
			    	 //if(White[2][0].equals("B")&&White[0][1].equals("B"))
			    	 {
			    		 
			    	
				    	 System.out.println("U' L' U U L U' L' U L ");
			    		 moveUP();
			    		 moveLP();
			    		 moveU();
			    		 moveU();
			    		 moveL();
			    		 moveUP();
			    		 moveLP(); 
			    		 moveU(); 
			    		 moveL(); 

			    	 }
			    	 
			    	 if(White[2][0].equals("G")&&Orange[0][2].equals("O")&&Green[0][0].equals("Y")&&White[0][1].equals("G")&&Blue[0][1].equals("O"))
			    	// if(White[2][0].equals("Y")&&White[0][1].equals("B"))
			    	 {
			    		
			    		
				    	 System.out.println(" U L' U' L U U L' U L ");
			    		 moveU();
			    		 moveLP();
			    		 moveUP();
			    		 moveL();
			    		 moveU();
			    		 moveU();
			    		 moveLP(); 
			    		 moveU();
			    		 moveL();
			    	 }
			    	 
			    	 if(White[2][0].equals("Y")&&Orange[0][2].equals("G")&&Green[0][0].equals("O")&&White[0][1].equals("O")&&Blue[0][1].equals("G"))
			    	 //if(White[2][0].equals("Y")&&White[0][1].equals("O"))
			    	 {
			    		
			    		 System.out.println("U U");
				    	 moveU();
				    	 moveU();
				    	 System.out.println(" F U F' U F U' F' ");
			    		 moveF();
			    		 moveU();
			    		 moveFP();
			    		 moveU();
			    		 moveF();
			    		 moveUP();
			    		 moveFP(); 
			    	 }
			    	 
			    	
			    	 if(White[2][0].equals("O")&&Orange[0][2].equals("Y")&&Green[0][0].equals("G")&&White[0][1].equals("O")&&Blue[0][1].equals("G"))
			    	// if(White[2][0].equals("O")&&White[0][1].equals("O"))
			    	 {
			    		
			    		
			    		 System.out.println("U' F U U F' U U F U' F'");
			    		 moveUP();
			    		 moveF();
			    		 moveU();
			    		 moveU();
			    		 moveFP();
			    		 moveU();
			    		 moveU(); 
			    		 moveF();
			    		 moveUP();
			    		 moveFP();
			    		
			    		

			    		
			    		
			    	 }
			    	 
			    	 
			    	 
			    	 if(White[2][0].equals("G")&&Orange[0][2].equals("O")&&Green[0][0].equals("Y")&&White[0][1].equals("O")&&Blue[0][1].equals("G"))
			    	 //if(White[2][0].equals("B")&&White[0][1].equals("O"))
			    	 {
			    		 
			    		
	                 System.out.println(" U'  F U F' U F U F'");
			    		 
			    		 moveUP();
			    		 moveF();
			    		 moveU();
			    		 moveFP();
			    		 moveU();
			    		 moveF(); 
			    		 moveU();
			    		 moveFP();
			    		
			    		
			    	 }
			    	 
			    	 
			    	 
			     }
			     break;
			     
			     /////REMAINING
			     
			     case 0:
			     {
			    	
			    	 if(White[0][0].equals("O")&&Blue[0][2].equals("Y")&&Orange[0][0].equals("G")&&White[0][1].equals("G")&&Blue[0][1].equals("O"))
			    	 //if(White[0][0].equals("Y")&&White[0][1].equals("B"))
			    	 {
			    		
			    		 System.out.println(" L' U L U' L' U' L");
			    		
			    		 moveLP();
			    		 moveU();
			    		 moveL();
			    		 moveUP();
			    		 moveLP();
			    		 moveUP();
			    		 moveL();
			    		 
			    		
			    		 
			    	 }
			    	 if(White[0][0].equals("G")&&Blue[0][2].equals("O")&&Orange[0][0].equals("Y")&&White[0][1].equals("G")&&Blue[0][1].equals("O"))
			    	 //if(White[0][0].equals("B")&&White[0][1].equals("B"))
			    	 {
			    		 
			    		 System.out.println("U U L' U  L");
			    		 moveU();
			    		 moveU();
			    		 moveLP();
			    		 moveU();
			    		 moveL();
			    		 
			    	 }
			    	 
			    	 if(White[0][0].equals("Y")&&Blue[0][2].equals("G")&&Orange[0][0].equals("O")&&White[0][1].equals("G")&&Blue[0][1].equals("O"))
			    	 //if(White[0][0].equals("O")&&White[0][1].equals("B"))
			    	 {
			    		 
			    		 
			    		
			    		 System.out.println("U' L' U U L U L' U' L ");
			    		 moveUP();
			    		 moveLP();
			    		 moveU();
			    		 moveU();
			    		 moveL();
			    		 moveU();
			    		 moveLP();
			    		 moveUP(); 
			    		 moveL(); 
			    		
			    		
			    	 }
			    	 
			    	 if(White[0][0].equals("O")&&Blue[0][2].equals("Y")&&Orange[0][0].equals("G")&&White[0][1].equals("O")&&Blue[0][1].equals("G"))
			    	// if(White[0][0].equals("Y")&&White[0][1].equals("O"))
			    	 {
			    		 
			    		 System.out.println("L' U L U U F U F' ");
			    		 moveLP();
			    		 moveU();
			    		 moveL();
			    		 moveU();
			    		 moveU();
			    		 moveF();
			    		 moveU(); 
			    		 moveFP();
			    		
			    	 }
			    	 
			    	
			    	 if(White[0][0].equals("G")&&Blue[0][2].equals("O")&&Orange[0][0].equals("Y")&&White[0][1].equals("O")&&Blue[0][1].equals("G"))
			    	 //if(White[0][0].equals("O")&&White[0][1].equals("O"))
			    	 {
			    		 
			    		 
			    		 System.out.println("L' U U L U' F U F' ");
			    		 
			    		 moveLP();
			    		 moveU();
			    		 moveU();
			    		 moveL();
			    		 moveUP();
			    		 moveF(); 
			    		 moveU();
			    		 moveFP();
			    	 }
			    	 
			    	 
			    	 
			    	 if(White[0][0].equals("Y")&&Blue[0][2].equals("B")&&Orange[0][0].equals("R")&&White[0][1].equals("R")&&Blue[0][1].equals("B"))
			    	 //if(White[0][0].equals("B")&&White[0][1].equals("O"))
			    	 {
			    		 
			    		 System.out.println("U'");
				    	 moveUP();
			    		 System.out.println("F U F' U' U' F U F' U' F U F' ");
			    		 moveF();
			    		 moveU();
			    		 moveFP();
			    		 moveUP();
			    		 moveUP();
			    		 moveF();
			    		 moveU(); 
			    		 moveFP();
			    		 moveUP();
			    		 moveF();
			    		 moveU();
			    		 moveFP();
			    		
			    	 }
			    	 
			    	 
			    	 
			     }
			     break;  
			     
			   
			     
			     case 11:
			     {
			    	
			    	 
			    	 ///////
			    	 if(White[0][2].equals("O")&&Red[0][2].equals("Y")&&Blue[0][0].equals("G")&&White[1][2].equals("G")&&Red[0][1].equals("O"))
			    	 //if(White[0][2].equals("Y")&&White[1][2].equals("B"))
			    	 {
			    		 
			    		 System.out.println("U'");
				    	 moveUP();
				    	 System.out.println(" L' U L U' L' U' L");
				    		
			    		 moveLP();
			    		 moveU();
			    		 moveL();
			    		 moveUP();
			    		 moveLP();
			    		 moveUP();
			    		 moveL();
			    		 
			    		 
			    	 }
			    	 if(White[0][2].equals("G")&&Red[0][2].equals("O")&&Blue[0][0].equals("Y")&&White[1][2].equals("G")&&Red[0][1].equals("O"))
			    	 //if(White[0][2].equals("B")&&White[1][2].equals("B"))
			    	 {
			    		 
			    		
				    	 System.out.println(" U L' U  L");
			    	
			    		 moveU();
			    		 moveLP();
			    		 moveU();
			    		 moveL();
			    		
			    	 }
			    	 
			    	 if(White[0][2].equals("Y")&&Red[0][2].equals("G")&&Blue[0][0].equals("O")&&White[1][2].equals("G")&&Red[0][1].equals("O"))
			    	 //if(White[0][2].equals("O")&&White[1][2].equals("B"))
			    	 {
			    		 
			    		 System.out.println("U'");
				    	 moveUP();
			    		 System.out.println("U' L' U U L U L' U' L ");
			    		 moveUP();
			    		 moveLP();
			    		 moveU();
			    		 moveU();
			    		 moveL();
			    		 moveU();
			    		 moveLP();
			    		 moveUP(); 
			    		 moveL(); 
			    		 
			    		
			    	 }
			    	 
			    	 if(White[0][2].equals("O")&&Red[0][2].equals("Y")&&Blue[0][0].equals("G")&&White[1][2].equals("O")&&Red[0][1].equals("G"))
			    	 //if(White[0][2].equals("Y")&&White[1][2].equals("O"))
			    	 {
			    		 System.out.println("U'");
				    	 moveUP();
				    	 System.out.println("L' U L U U F U F' ");
			    		 moveLP();
			    		 moveU();
			    		 moveL();
			    		 moveU();
			    		 moveU();
			    		 moveF();
			    		 moveU(); 
			    		 moveFP();
			    		 
			    		 
			    	 }
			    	 
			    	
			    	 if(White[0][2].equals("G")&&Red[0][2].equals("O")&&Blue[0][0].equals("Y")&&White[1][2].equals("O")&&Red[0][1].equals("G"))
			    	 //if(White[0][2].equals("O")&&White[1][2].equals("O"))
			    	 {
			    		 
			    		
			    		 System.out.println("U'");
				    	 moveUP();
                      System.out.println("L' U U L U' F U F' ");
			    		 
			    		 moveLP();
			    		 moveU();
			    		 moveU();
			    		 moveL();
			    		 moveUP();
			    		 moveF(); 
			    		 moveU();
			    		 moveFP();
			    		
			    	 }
			    	 
			    	 
			    	 
			    	 if(White[0][2].equals("Y")&&Red[0][2].equals("G")&&Blue[0][0].equals("O")&&White[1][2].equals("O")&&Red[0][1].equals("G"))
			    	 //if(White[0][2].equals("B")&&White[1][2].equals("O"))
			    	 {
			    		 
			    		
			    		 System.out.println(" U U F U F' U' U' F U F' U' F U F' ");
			    		 
			    		 moveU();
			    		 moveU();
			    		 moveF();
			    		 moveU();
			    		 moveFP();
			    		 moveUP();
			    		 moveUP();
			    		 moveF();
			    		 moveU(); 
			    		 moveFP();
			    		 moveUP();
			    		 moveF();
			    		 moveU();
			    		 moveFP();
			    		 
			    		
			    		
			    	 }
			    	 
			    	 
			    	 
			     }
			     break;  
			     
			     
			     case 22:
			     {
			    	
			    	
			    	 
			    	 if(White[2][2].equals("O")&&Green[0][2].equals("Y")&&Red[0][0].equals("G")&&White[2][1].equals("G")&&Green[0][1].equals("O"))
			    	 //if(White[2][2].equals("Y")&&White[2][1].equals("B"))
			    	 {
			    		
				    	
                       System.out.println(" U U ");
			    		 
			    		 moveU();
			    		 moveU();
			    		 System.out.println(" L' U L U' L' U' L");
				    		
			    		 moveLP();
			    		 moveU();
			    		 moveL();
			    		 moveUP();
			    		 moveLP();
			    		 moveUP();
			    		 moveL();
			    		 
			    		
			    		
			    		 
			    	 }
			    	 if(White[2][2].equals("G")&&Green[0][2].equals("O")&&Red[0][0].equals("Y")&&White[2][1].equals("G")&&Green[0][1].equals("O"))
			    	 //if(White[2][2].equals("B")&&White[2][1].equals("B"))
			    	 {
			    		   
				    		 
				    		
				    		 System.out.println(" L' U  L");
				    	
				    		 moveLP();
				    		 moveU();
				    		 moveL();
				    		
			    	 }
			    	 
			    	 if(White[2][2].equals("Y")&&Green[0][2].equals("G")&&Red[0][0].equals("O")&&White[2][1].equals("G")&&Green[0][1].equals("O"))
			    	 //if(White[2][2].equals("O")&&White[2][1].equals("B"))
			    	 {
			    		 
			    		  
				    		 
				    		

				    		 System.out.println("U L' U U L U L' U' L ");
				    		 moveU();
				    		 moveLP();
				    		 moveU();
				    		 moveU();
				    		 moveL();
				    		 moveU();
				    		 moveLP();
				    		 moveUP(); 
				    		 moveL(); 
				    		
				    		
			    		
			    	 }
			    	 
			    	 if(White[2][2].equals("O")&&Green[0][2].equals("Y")&&Red[0][0].equals("G")&&White[2][1].equals("O")&&Green[0][1].equals("G"))
			    	 //if(White[2][2].equals("Y")&&White[2][1].equals("O"))
			    	 {
			    		 
			    		   System.out.println(" U U ");
				    		 
				    		 moveU();
				    		 moveU();
				    		 System.out.println("L' U L U U F U F' ");
				    		 moveLP();
				    		 moveU();
				    		 moveL();
				    		 moveU();
				    		 moveU();
				    		 moveF();
				    		 moveU(); 
				    		 moveFP();
				    		
			    	 }
			    	 
			    	
			    	 if(White[2][2].equals("G")&&Green[0][2].equals("O")&&Red[0][0].equals("Y")&&White[2][1].equals("O")&&Green[0][1].equals("G"))
			    	 //if(White[2][2].equals("O")&&White[2][1].equals("O"))
			    	 {
			    		 
			    		
			    		   System.out.println(" U U ");
				    		 
				    		 moveU();
				    		 moveU();
				    		 System.out.println("L' U U L U' F U F' ");
				    		 
				    		 moveLP();
				    		 moveU();
				    		 moveU();
				    		 moveL();
				    		 moveUP();
				    		 moveF(); 
				    		 moveU();
				    		 moveFP();
				    		
			    		
			    	 }
			    	 
			    	 
			    	 
			    	 if(White[2][2].equals("Y")&&Green[0][2].equals("G")&&Red[0][0].equals("O")&&White[2][1].equals("O")&&Green[0][1].equals("G"))
			    	// if(White[2][2].equals("B")&&White[2][1].equals("O"))
			    	 {
			    		
			    		 
			    		 
				    		 System.out.println(" U F U F' U' U' F U F' U' F U F' ");
				    		 moveU();
				    		 moveF();
				    		 moveU();
				    		 moveFP();
				    		 moveUP();
				    		 moveUP();
				    		 moveF();
				    		 moveU(); 
				    		 moveFP();
				    		 moveUP();
				    		 moveF();
				    		 moveU();
				    		 moveFP();
				    		
			    		
			    	 }
			    	 
			    	 
			    	 
			     }
			     break;  
			     
			     

			     case 33:
			     {
			    	
			    	 
			    	
			    	 
			    	 if(White[2][0].equals("O")&&Orange[0][2].equals("Y")&&Green[0][0].equals("G")&&White[1][0].equals("G")&&Orange[0][1].equals("O"))
			    	//(White[2][0].equals("Y")&&White[1][0].equals("B"))
			    	 {
			    		
			    		 System.out.println(" U'");
			    		 
			    		 moveUP();
			    		 System.out.println(" L' U L U' L' U' L");
				    		
			    		 moveLP();
			    		 moveU();
			    		 moveL();
			    		 moveUP();
			    		 moveLP();
			    		 moveUP();
			    		 moveL();
			    		
			    		 
			    	 }
			    	 if(White[2][0].equals("G")&&Orange[0][2].equals("O")&&Green[0][0].equals("Y")&&White[1][0].equals("G")&&Orange[0][1].equals("O"))
			    	 //if(White[2][0].equals("B")&&White[1][0].equals("B"))
			    	 {
                        
			    		 System.out.println(" U L' U  L");
			    		
			    		 moveU();
			    		 moveLP();
			    		 moveU();
			    		 moveL();
				    	
			    	 }
			    	 
			    	 if(White[2][0].equals("Y")&&Orange[0][2].equals("G")&&Green[0][0].equals("O")&&White[1][0].equals("G")&&Orange[0][1].equals("O"))
			    	// if(White[2][0].equals("O")&&White[1][0].equals("B"))
			    	 {
			    		 
	                        System.out.println(" U'");
				    		 
				    		 moveUP();
				    		 System.out.println("U' L' U U L U L' U' L ");
				    		 moveUP();
				    		 moveLP();
				    		 moveU();
				    		 moveU();
				    		 moveL();
				    		 moveU();
				    		 moveLP();
				    		 moveUP(); 
				    		 moveL(); 
			    	 }
			    	 
			    	 if(White[2][0].equals("O")&&Orange[0][2].equals("Y")&&Green[0][0].equals("G")&&White[1][0].equals("O")&&Orange[0][1].equals("G"))
			    	 //if(White[2][0].equals("Y")&&White[1][0].equals("O"))
			    	 {
			    		 
	                        System.out.println(" U'");
				    		 
				    		 moveUP();
				    		 System.out.println("L' U L U U F U F' ");
				    		 moveLP();
				    		 moveU();
				    		 moveL();
				    		 moveU();
				    		 moveU();
				    		 moveF();
				    		 moveU(); 
				    		 moveFP();
			    	 }
			    	 
			    	
			    	 if(White[2][0].equals("G")&&Orange[0][2].equals("O")&&Green[0][0].equals("Y")&&White[1][0].equals("O")&&Orange[0][1].equals("G"))
			    	 //if(White[2][0].equals("O")&&White[1][0].equals("O"))
			    	 {
			    		 
	                        System.out.println(" U'");
				    		 
				    		 moveUP();
				    		 System.out.println("L' U U L U' F U F' ");
				    		 
				    		 moveLP();
				    		 moveU();
				    		 moveU();
				    		 moveL();
				    		 moveUP();
				    		 moveF(); 
				    		 moveU();
				    		 moveFP();
			    	 }
			    	 
			    	 
			    	 
			    	 if(White[2][0].equals("Y")&&Orange[0][2].equals("G")&&Green[0][0].equals("O")&&White[1][0].equals("O")&&Orange[0][1].equals("G"))
			    	// if(White[2][0].equals("B")&&White[1][0].equals("O"))
			    	 {
			    		 
	                        System.out.println(" U'");
				    		 
				    		 moveUP();
				    		 System.out.println("U'");
					    	 moveUP();
				    		 System.out.println("F U F' U' U' F U F' U' F U F' ");
				    		 moveF();
				    		 moveU();
				    		 moveFP();
				    		 moveUP();
				    		 moveUP();
				    		 moveF();
				    		 moveU(); 
				    		 moveFP();
				    		 moveUP();
				    		 moveF();
				    		 moveU();
				    		 moveFP();
			    		
			    	 }
			    	 
			    	 
			    	 
			     }
			     break; 	
			     
			     
			     case 2:
			     {
			    	 if(White[0][0].equals("O")&&Blue[0][2].equals("Y")&&Orange[0][0].equals("G")&&White[2][1].equals("G")&&Green[0][1].equals("O"))
			    	 //if(White[0][0].equals("Y")&&White[2][1].equals("B"))
			    	 {
			    		 
			    		 System.out.println("L' U' L U'  L' U' L ");
			    		 moveLP();
			    		 moveUP();
			    		 moveL();
			    		 moveUP();
			    		 moveLP();
			    		 moveUP();
			    		 moveL();
			    		    		
			    		
			    		
			    		 
			    	 }
			    	 if(White[0][0].equals("G")&&Blue[0][2].equals("O")&&Orange[0][0].equals("Y")&&White[2][1].equals("G")&&Green[0][1].equals("O"))
			    	 //if(White[0][0].equals("B")&&White[2][1].equals("B"))
			    	 {
			    		 
			    		 System.out.println(" L' U U L U U L' U L ");
			    	
			    		 moveLP();
			    		 moveU();
			    		 moveU();
			    		 moveL();
			    		 moveU(); 
			    		 moveU(); 
			    		 moveLP(); 
			    		 moveU(); 
			    		 moveL(); 
			    	 }
			    	 
			    	 if(White[0][0].equals("Y")&&Blue[0][2].equals("G")&&Orange[0][0].equals("O")&&White[2][1].equals("G")&&Green[0][1].equals("O"))
			    	 //if(White[0][0].equals("O")&&White[2][1].equals("B"))
			    	 {
			    		 
			    		 System.out.println(" U L' U' L U' L' U L");
			    		 moveU();
			    		 moveLP();
			    		 moveUP();
			    		 moveL();
			    		 moveUP();
			    		 moveLP();
			    		 moveU();
			    		 moveL();
			    		
			    		
			    	 }
			    	 
			    	 if(White[0][0].equals("O")&&Blue[0][2].equals("Y")&&Orange[0][0].equals("G")&&White[2][1].equals("O")&&Green[0][1].equals("G"))
			    	 //if(White[0][0].equals("Y")&&White[2][1].equals("O"))
			    	 {
			    		 
			    		 System.out.println("U U F U F' U U  F U' F'");
			    		 moveU();
			    		 moveU();
			    		 moveF();
			    		 moveU();
			    		 moveFP();
			    		 moveU();
			    		 moveU();
			    		 moveF();
			    		 moveUP(); 
			    		 moveFP();
			    		
			    		
			    	 }
			    	 
			    	
			    	 if(White[0][0].equals("G")&&Blue[0][2].equals("O")&&Orange[0][0].equals("Y")&&White[2][1].equals("O")&&Green[0][1].equals("G"))
			    	 //if(White[0][0].equals("O")&&White[2][1].equals("O"))
			    	 {
			    		 
			    		 System.out.println(" U'  F U F'");
			    		 
			    		 
			    		
			    		 moveUP();
			    		 moveF();
			    		 moveU();
			    		 moveFP();
			    		 
			    		
			    	 }
			    	 
			    	 
			    	 
			    	 if(White[0][0].equals("Y")&&Blue[0][2].equals("G")&&Orange[0][0].equals("O")&&White[2][1].equals("O")&&Green[0][1].equals("G"))
			    	 //if(White[0][0].equals("B")&&White[2][1].equals("O"))
			    	 {
			    		 
			    		 System.out.println("  F U U F' U F U' F'");
			    		 
			    	
			    		 moveF();
			    		 moveU();
			    		 moveU();
			    		 moveFP();
			    		 moveU();
			    		 moveF();
			    		 moveUP();
			    		 moveFP();
			    		
			    		
			    	 }
			    	 
			    	 
			     }
			     break;
			     
			     
			     case 31:
			     {
			    	 ///////
			    	 
			    	 System.out.println("reached here-=-=-");
			    	 
			    	 if(White[2][0].equals("O")&&Orange[0][2].equals("Y")&&Green[0][0].equals("G")&&White[1][2].equals("G")&&Red[0][1].equals("O"))
			    	 //if(White[0][2].equals("Y")&&White[1][2].equals("B"))
			    	 {
			    		
			    		 System.out.println("U");
			    		 moveU();
			    		 System.out.println("L' U' L U'  L' U' L ");
			    		 moveLP();
			    		 moveUP();
			    		 moveL();
			    		 moveUP();
			    		 moveLP();
			    		 moveUP();
			    		 moveL();
			    		
			    		 
			    	 }
			    	 if(White[2][0].equals("G")&&Orange[0][2].equals("O")&&Green[0][0].equals("Y")&&White[1][2].equals("G")&&Red[0][1].equals("O"))
			    	 //if(White[0][2].equals("B")&&White[1][2].equals("B"))
			    	 {
			    		
			    		 System.out.println("U");
			    		 moveU();
			    		 System.out.println(" L' U U L U U L' U L ");
					    	
			    		 moveLP();
			    		 moveU();
			    		 moveU();
			    		 moveL();
			    		 moveU(); 
			    		 moveU(); 
			    		 moveLP(); 
			    		 moveU(); 
			    		 moveL(); 
			    		
			    	 }
			    	 
			    	 if(White[2][0].equals("Y")&&Orange[0][2].equals("G")&&Green[0][0].equals("O")&&White[1][2].equals("G")&&Red[0][1].equals("O"))
			    	 //if(White[0][2].equals("O")&&White[1][2].equals("B"))
			    	 {
			    		
			    		 System.out.println("U");
			    		 moveU();
			    		 System.out.println(" U L' U' L U' L' U L");
			    		 moveU();
			    		 moveLP();
			    		 moveUP();
			    		 moveL();
			    		 moveUP();
			    		 moveLP();
			    		 moveU();
			    		 moveL();
			    		
			    	 }
			    	 
			    	 if(White[2][0].equals("O")&&Orange[0][2].equals("Y")&&Green[0][0].equals("G")&&White[1][2].equals("O")&&Red[0][1].equals("G"))
			    	// if(White[0][2].equals("Y")&&White[1][2].equals("O"))
			    	 {
			    		 
			    		
			    		 System.out.println("U' F U F' U U  F U' F'");
			    		 
			    		 moveUP();
			    		 moveF();
			    		 moveU();
			    		 moveFP();
			    		 moveU();
			    		 moveU();
			    		 moveF();
			    		 moveUP(); 
			    		 moveFP();
			    		
			    	 }
			    	 
			    	 if(White[2][0].equals("G")&&Orange[0][2].equals("O")&&Green[0][0].equals("Y")&&White[1][2].equals("O")&&Red[0][1].equals("G"))
			    	 
			    	// if(White[0][2].equals("O")&&White[1][2].equals("O"))
			    	 {
			    		 
			    		
			    		 System.out.println("  F U F'");
			    		 
			    		 
				    		
			    		
			    		 moveF();
			    		 moveU();
			    		 moveFP();
			    		
			    	 }
			    	 
			    	 
			    	 
			    	 if(White[2][0].equals("Y")&&Orange[0][2].equals("G")&&Green[0][0].equals("O")&&White[1][2].equals("O")&&Red[0][1].equals("G"))
			    	 //if(White[0][2].equals("B")&&White[1][2].equals("O"))
			    	 {
			    		System.out.println("reached here");
                     
			    		 System.out.println("U");
			    		 moveU();
			    		 System.out.println("  F U U F' U F U' F'");
			    		 
					    	
			    		 moveF();
			    		 moveU();
			    		 moveU();
			    		 moveFP();
			    		 moveU();
			    		 moveF();
			    		 moveUP();
			    		 moveFP();
			    		
			    	 }
			    	 
			    	 
			     }
			     break;
			     
			     
			     
			     case 20:
			     {
			    	 
			    	 if(White[2][2].equals("O")&&Green[0][2].equals("Y")&&Red[0][0].equals("G")&&White[0][1].equals("G")&&Blue[0][1].equals("O"))
			    	 //if(White[2][2].equals("Y")&&White[0][1].equals("B"))
			    	 {
			    		 System.out.println("U U");
			    		 moveU();
			    		 moveU();
			    		 System.out.println("L' U' L U'  L' U' L ");
			    		 moveLP();
			    		 moveUP();
			    		 moveL();
			    		 moveUP();
			    		 moveLP();
			    		 moveUP();
			    		 moveL();
			    		 
			    	 }
			    	 if(White[2][2].equals("G")&&Green[0][2].equals("O")&&Red[0][0].equals("Y")&&White[0][1].equals("G")&&Blue[0][1].equals("O"))
			    	 //if(White[2][2].equals("B")&&White[0][1].equals("B"))
			    	 {
			    		
			    		 System.out.println("U U");
			    		 moveU();
			    		 moveU();
			    		 
			    		 System.out.println(" L' U U L U U L' U L ");
			    	
			    		 moveLP();
			    		 moveU();
			    		 moveU();
			    		 moveL();
			    		 moveU(); 
			    		 moveU(); 
			    		 moveLP(); 
			    		 moveU(); 
			    		 moveL(); 
			    		 
			    	 }
			    	 
			    	 if(White[2][2].equals("Y")&&Green[0][2].equals("G")&&Red[0][0].equals("O")&&White[0][1].equals("G")&&Blue[0][1].equals("O"))
			    	 //if(White[2][2].equals("O")&&White[0][1].equals("B"))
			    	 {
			    		 
			    		
			    		 System.out.println(" U' L' U' L U' L' U L");
			    		 moveUP();
			    		 moveLP();
			    		 moveUP();
			    		 moveL();
			    		 moveUP();
			    		 moveLP();
			    		 moveU();
			    		 moveL();
			    		
			    		
			    	 }
			    	 
			    	 if(White[2][2].equals("O")&&Green[0][2].equals("Y")&&Red[0][0].equals("G")&&White[0][1].equals("O")&&Blue[0][1].equals("G"))
			    	 //if(White[2][2].equals("Y")&&White[0][1].equals("O"))
			    	 {
			    		
			    		 
			    		 System.out.println(" F U F' U U  F U' F'");
			    		 
			    		 moveF();
			    		 moveU();
			    		 moveFP();
			    		 moveU();
			    		 moveU();
			    		 moveF();
			    		 moveUP(); 
			    		 moveFP();
			    		
			    	 }
			    	 
			    	
			    	 
			    	
		    		 if(White[2][2].equals("G")&&Green[0][2].equals("O")&&Red[0][0].equals("Y")&&White[0][1].equals("O")&&Blue[0][1].equals("G"))
		    		 //if(White[2][2].equals("O")&&White[0][1].equals("O"))
			    	 {
		    			 
			    		
			    		 System.out.println(" U  F U F'");
			    		 
				    		
			    		 moveU();
			    		 moveF();
			    		 moveU();
			    		 moveFP();
			    		 
			    		
			    		
			    	 }
			    	 
			    	 
			    	 
		    		 if(White[2][2].equals("Y")&&Green[0][2].equals("G")&&Red[0][0].equals("O")&&White[0][1].equals("O")&&Blue[0][1].equals("G"))
			    	 //if(White[2][2].equals("B")&&White[0][1].equals("O"))
			    	 {
			    		
			    		 System.out.println("U U");
			    		 moveU();
			    		 moveU();
			    		 
			    		 System.out.println("  F U U F' U F U' F'");
			    		 
			    	
			    		 moveF();
			    		 moveU();
			    		 moveU();
			    		 moveFP();
			    		 moveU();
			    		 moveF();
			    		 moveUP();
			    		 moveFP();
			    		
			    	 }
			    	 
			    	 
			     }
			     break;
			     
			     
			     case 13:
			     {
			    	 
		    		 
			    	 if(White[0][2].equals("O")&&Red[0][2].equals("Y")&&Blue[0][0].equals("G")&&White[1][0].equals("G")&&Orange[0][1].equals("O"))
			    	 //if(White[0][2].equals("Y")&&White[1][0].equals("B"))
			    	 {
			    			 
			    		 System.out.println(" U'");
			    	 	
			    		 moveUP();
			    		 System.out.println("L' U' L U'  L' U' L ");
			    		 moveLP();
			    		 moveUP();
			    		 moveL();
			    		 moveUP();
			    		 moveLP();
			    		 moveUP();
			    		 moveL();
			    			    		
			    		 
			    	 }
			    	 
			    	 if(White[0][2].equals("G")&&Red[0][2].equals("O")&&Blue[0][0].equals("Y")&&White[1][0].equals("G")&&Orange[0][1].equals("O"))
			    	 //if(White[0][2].equals("B")&&White[1][0].equals("B"))
			    	 {
			    		 System.out.println(" U'");
				    	 	
			    		 moveUP();
			    		 System.out.println(" L' U U L U U L' U L ");
					    	
			    		 moveLP();
			    		 moveU();
			    		 moveU();
			    		 moveL();
			    		 moveU(); 
			    		 moveU(); 
			    		 moveLP(); 
			    		 moveU(); 
			    		 moveL(); 
			    		
			    	 }
			    	 
			    	 if(White[0][2].equals("Y")&&Red[0][2].equals("G")&&Blue[0][0].equals("O")&&White[1][0].equals("G")&&Orange[0][1].equals("O"))
			    	 //if(White[0][2].equals("O")&&White[1][0].equals("B"))
			    	 {
			    		
			    		
			    		 System.out.println("  L' U' L U' L' U L");
			    		
			    		 moveLP();
			    		 moveUP();
			    		 moveL();
			    		 moveU();
			    		 moveLP();
			    		 moveUP();
			    		 moveL();
			    		
			    	 }
			    	 
			    	 if(White[0][2].equals("O")&&Red[0][2].equals("Y")&&Blue[0][0].equals("G")&&White[1][0].equals("O")&&Orange[0][1].equals("G"))
			    	 //if(White[0][2].equals("Y")&&White[1][0].equals("O"))
			    	 {
			    		 
			    		 System.out.println("U F U F' U U  F U' F'");
			    		
			    		 moveU();
			    		 moveF();
			    		 moveU();
			    		 moveFP();
			    		 moveU();
			    		 moveU();
			    		 moveF();
			    		 moveUP(); 
			    		 moveFP();
			    		 
			    	 }
			    	 
			    	
			    	 if(White[0][2].equals("G")&&Red[0][2].equals("O")&&Blue[0][0].equals("Y")&&White[1][0].equals("O")&&Orange[0][1].equals("G"))
			    	// if(White[0][2].equals("O")&&White[1][0].equals("O"))
			    	 {
			    		 System.out.println(" U'");
				    	 	
			    		 moveUP();
			    		 System.out.println(" U'  F U F'");
			    		 
			    		 
				    		
			    		 moveUP();
			    		 moveF();
			    		 moveU();
			    		 moveFP();
			    		
			    	 }
			    	 
			    	 
			    	 
			    	 if(White[0][2].equals("Y")&&Red[0][2].equals("G")&&Blue[0][0].equals("O")&&White[1][0].equals("O")&&Orange[0][1].equals("G"))
			    	 //if(White[0][2].equals("B")&&White[1][0].equals("O"))
			    	 {
			    		
			    		 System.out.println(" U'");
				    	 	
			    		 moveUP();
			    		 
			    		 System.out.println("  F U U F' U F U' F'");
			    		 
			    	
			    		 moveF();
			    		 moveU();
			    		 moveU();
			    		 moveFP();
			    		 moveU();
			    		 moveF();
			    		 moveUP();
			    		 moveFP();
			    	 }
			    	 
			    	 
			     }
			     break;
			     
			     
			     case 32:
			     {
			    	 
			    	 
			    	 if(White[2][0].equals("O")&&Orange[0][2].equals("Y")&&Green[0][0].equals("G")&&White[2][1].equals("G")&&Green[0][1].equals("O"))
			    	// if(White[2][0].equals("Y")&&White[2][1].equals("B"))
			    	 {
			    		 
				    	 System.out.println("U' F U U F' U L' U' L");
			    		 moveUP();
			    		 moveF();
			    		 moveU();
			    		 moveU();
			    		 moveFP();
			    		 moveU();
			    		 moveLP();
			    		 moveUP();
			    		 moveL();

			    		 
			    	 }
			    	 if(White[2][0].equals("G")&&Orange[0][2].equals("O")&&Green[0][0].equals("Y")&&White[2][1].equals("G")&&Green[0][1].equals("O"))
			    	 //if(White[2][0].equals("B")&&White[2][1].equals("B"))
			    	 {
			    		 
			    		 
			    		 System.out.println(" F U' F' U U L' U' L ");
			    		 moveF();
			    		 moveUP();
			    		 moveFP();
			    		 moveU();
			    		 moveU();
			    		 moveLP();
			    		 moveUP();
			    		 moveL();

			    		 
			    	 }
			    	 
			    	 if(White[2][0].equals("Y")&&Orange[0][2].equals("G")&&Green[0][0].equals("O")&&White[2][1].equals("G")&&Green[0][1].equals("O"))
			    	 //if(White[2][0].equals("O")&&White[2][1].equals("B"))
			    	 {
			    		 
				    	 System.out.println("L U L' U L U' L' U L");
					    	
			    		 moveL();
			    		 moveU();
			    		 moveLP();
			    		 moveU();
			    		 moveL();
			    		 moveUP();
			    		 moveLP();
			    		 moveU();
			    		 moveL();

			    		
			    	 }
			    	 
			    	 if(White[2][0].equals("O")&&Orange[0][2].equals("Y")&&Green[0][0].equals("G")&&White[2][1].equals("O")&&Green[0][1].equals("G"))
			    	 //if(White[2][0].equals("Y")&&White[2][1].equals("O"))
			    	 {
			    		
				    	 System.out.println("U F U' F'");
			    		 moveU();
			    		 moveF();
			    		 moveUP();
			    		 moveFP();

			    		
			    	 }
			    	 
			    	
			    	 if(White[2][0].equals("G")&&Orange[0][2].equals("O")&&Green[0][0].equals("Y")&&White[2][1].equals("O")&&Green[0][1].equals("G"))
			    	// if(White[2][0].equals("O")&&White[2][1].equals("O"))
			    	 {
			    		
				    	 System.out.println(" U' F U' F' U F U F'");
			    		 
			    		 
				    		
			    		 moveUP();
			    		 moveF();
			    		 moveUP();
			    		 moveFP();
			    		 moveU();
			    		 moveF();
			    		 moveU();
			    		 moveFP();

			    		
			    	 }
			    	 
			    	 
			    	 
			    	 if(White[2][0].equals("Y")&&Orange[0][2].equals("G")&&Green[0][0].equals("O")&&White[2][1].equals("O")&&Green[0][1].equals("G"))
			    	 //if(White[2][0].equals("B")&&White[2][1].equals("O"))
			    	 {
			    		 
			    		 
			    		 System.out.println(" F U U F' U' F U F'");
			    		 
					    	
			    		 moveF();
			    		 moveU();
			    		 moveU();
			    		 moveFP();
			    		 moveUP();
			    		 moveF();
			    		 moveU();
			    		 moveFP();

			    		 
			    		 
			    		
			    	 }
			    	 
			    	 
			     }
			     break;
			       
     
			     
			     case 10:
			     {
			    	
			    	 if(White[0][2].equals("O")&&Red[0][2].equals("Y")&&Blue[0][0].equals("G")&&White[0][1].equals("G")&&Blue[0][1].equals("O"))
			    	// if(White[0][2].equals("Y")&&White[0][1].equals("B"))
			    	 {
			    		 
			    	
				    	 System.out.println("U F U U F' U L' U' L");
			    		 moveU();
			    		 moveF();
			    		 moveU();
			    		 moveU();
			    		 moveFP();
			    		 moveU();
			    		 moveLP();
			    		 moveUP();
			    		 moveL();


			    		 
			    		
			    		 
			    	 }
			    	 if(White[0][2].equals("G")&&Red[0][2].equals("O")&&Blue[0][0].equals("Y")&&White[0][1].equals("G")&&Blue[0][1].equals("O"))
			    	 //if(White[0][2].equals("B")&&White[0][1].equals("B"))
			    	 {
			    		
			    		 System.out.println(" U U ");
			    		 moveU();
			    		 moveU();
			    		 
			    		 System.out.println(" F U' F' U U L' U' L ");
			    		 moveF();
			    		 moveUP();
			    		 moveFP();
			    		 moveU();
			    		 moveU();
			    		 moveLP();
			    		 moveUP();
			    		 moveL();

			    		 
			    	 }
			    	 
			    	 if(White[0][2].equals("Y")&&Red[0][2].equals("G")&&Blue[0][0].equals("O")&&White[0][1].equals("G")&&Blue[0][1].equals("O"))
			    	// if(White[0][2].equals("O")&&White[0][1].equals("B"))
			    	 {
			    		
			    		 System.out.println(" U U ");
			    		 moveU();
			    		 moveU();
			    		 System.out.println("L U L' U L U' L' U L");
					    	
			    		 moveL();
			    		 moveU();
			    		 moveLP();
			    		 moveU();
			    		 moveL();
			    		 moveUP();
			    		 moveLP();
			    		 moveU();
			    		 moveL();

			    		
			    	 }
			    	 
			    	 if(White[0][2].equals("O")&&Red[0][2].equals("Y")&&Blue[0][0].equals("G")&&White[0][1].equals("O")&&Blue[0][1].equals("G"))
			    	// if(White[0][2].equals("Y")&&White[0][1].equals("O"))
			    	 {
			    		 
			    		 

				    	 System.out.println("U' F U' F'");
			    		 moveUP();
			    		 moveF();
			    		 moveUP();
			    		 moveFP();

			    		 
			    		
			    	 }
			    	 
			    	
			    	 if(White[0][2].equals("G")&&Red[0][2].equals("O")&&Blue[0][0].equals("Y")&&White[0][1].equals("O")&&Blue[0][1].equals("G"))
			    	// if(White[0][2].equals("O")&&White[0][1].equals("O"))
			    	 {
			    		
			    		
			    		 System.out.println(" U F U' F' U F U F'");
			    		 
			    		 
				    		
			    		 moveU();
			    		 moveF();
			    		 moveUP();
			    		 moveFP();
			    		 moveU();
			    		 moveF();
			    		 moveU();
			    		 moveFP();


			    		
			    		
			    	 }
			    	 
			    	 
			    	 
			    	 if(White[0][2].equals("Y")&&Red[0][2].equals("G")&&Blue[0][0].equals("O")&&White[0][1].equals("O")&&Blue[0][1].equals("G"))
			    	// if(White[0][2].equals("B")&&White[0][1].equals("O"))
			    	 {
			    		
			    		 System.out.println(" U U ");
			    		 moveU();
			    		 moveU();
			    		 
			    		 System.out.println(" F U U F' U' F U F'");
			    		 
					    	
			    		 moveF();
			    		 moveU();
			    		 moveU();
			    		 moveFP();
			    		 moveUP();
			    		 moveF();
			    		 moveU();
			    		 moveFP();

			    		
			    		
			    	 }
			    	 
			    	 
			     }
			     break;
			     
			     
			     
			     
			     
			     case 3:
			     {
			    	 
			    	 if(White[0][0].equals("O")&&Blue[0][2].equals("Y")&&Orange[0][0].equals("G")&&White[1][0].equals("G")&&Orange[0][1].equals("O"))
			    	// if(White[0][0].equals("Y")&&White[1][0].equals("B"))
			    	 {
			    		 
			    		
			    		 System.out.println(" U' ");
			    		 moveUP();
				    	 System.out.println("U' F U U F' U L' U' L");
			    		 moveUP();
			    		 moveF();
			    		 moveU();
			    		 moveU();
			    		 moveFP();
			    		 moveU();
			    		 moveLP();
			    		 moveUP();
			    		 moveL();

			    		 
			    	 }
			    	 if(White[0][0].equals("G")&&Blue[0][2].equals("O")&&Orange[0][0].equals("Y")&&White[1][0].equals("G")&&Orange[0][1].equals("O"))
			    	 //if(White[0][0].equals("B")&&White[1][0].equals("B"))
			    	 {
			    		 System.out.println(" U' ");
			    		 moveUP();
			    		 System.out.println(" F U' F' U U L' U' L ");
			    		 moveF();
			    		 moveUP();
			    		 moveFP();
			    		 moveU();
			    		 moveU();
			    		 moveLP();
			    		 moveUP();
			    		 moveL();

			    		
			    	 }
			    	 
			    	 if(White[0][0].equals("Y")&&Blue[0][2].equals("G")&&Orange[0][0].equals("O")&&White[1][0].equals("G")&&Orange[0][1].equals("O"))
			    	// if(White[0][0].equals("O")&&White[1][0].equals("B"))
			    	 {
			    		 System.out.println(" U' ");
			    		 moveUP();
			    		 
			    		 
				    	 System.out.println("L U L' U L U' L' U L");
					    	
			    		 moveL();
			    		 moveU();
			    		 moveLP();
			    		 moveU();
			    		 moveL();
			    		 moveUP();
			    		 moveLP();
			    		 moveU();
			    		 moveL();


			    	 }
			    	 
			    	 if(White[0][0].equals("O")&&Blue[0][2].equals("Y")&&Orange[0][0].equals("G")&&White[1][0].equals("O")&&Orange[0][1].equals("G"))
			    	 //if(White[0][0].equals("Y")&&White[1][0].equals("O"))
			    	 {
			    		
			    		 
			    		 System.out.println(" F U' F'");
			    		 
			    		 moveF();
			    		 moveUP();
			    		 moveFP();

			    		
			    	 }
			    	 
			    	
			    	 if(White[0][0].equals("G")&&Blue[0][2].equals("O")&&Orange[0][0].equals("Y")&&White[1][0].equals("O")&&Orange[0][1].equals("G"))
			    	 //if(White[0][0].equals("O")&&White[1][0].equals("O"))
			    	 {
			    		
			    		 System.out.println(" U' ");
			    		 moveUP();
			    		 System.out.println(" U' F U' F' U F U F'");
			    		 
			    		 
				    		
			    		 moveUP();
			    		 moveF();
			    		 moveUP();
			    		 moveFP();
			    		 moveU();
			    		 moveF();
			    		 moveU();
			    		 moveFP();

			    		
			    	 }
			    	 
			    	 
			    	 
			    	 if(White[0][0].equals("Y")&&Blue[0][2].equals("G")&&Orange[0][0].equals("O")&&White[1][0].equals("O")&&Orange[0][1].equals("G"))
			    	 //if(White[0][0].equals("B")&&White[1][0].equals("O"))
			    	 {
			    		 
			    		 System.out.println(" U' ");
			    		 moveUP();
			    		 
			    		 System.out.println(" F U U F' U' F U F'");
			    		 
					    	
			    		 moveF();
			    		 moveU();
			    		 moveU();
			    		 moveFP();
			    		 moveUP();
			    		 moveF();
			    		 moveU();
			    		 moveFP();


			    		
			    	 }
			    	 
			    	 
			     }
			     break;
			     
			     
			     
			     
			    
			     case 21:
			     {
			    	 
			    	 if(White[2][2].equals("O")&&Green[0][2].equals("Y")&&Red[0][0].equals("G")&&White[1][2].equals("G")&&Red[0][1].equals("O"))
			    	// if(White[2][2].equals("Y")&&White[1][2].equals("B"))
			    	 {
			    		 System.out.println("U'");
				    	 moveUP();
				    	 System.out.println("U' F U U F' U L' U' L");
			    		 moveUP();
			    		 moveF();
			    		 moveU();
			    		 moveU();
			    		 moveFP();
			    		 moveU();
			    		 moveLP();
			    		 moveUP();
			    		 moveL();
			    		
			    		 
	 
			    		
			    		
			    		 
			    	 }
			    	 if(White[2][2].equals("G")&&Green[0][2].equals("O")&&Red[0][0].equals("Y")&&White[1][2].equals("G")&&Red[0][1].equals("O"))
			    	 //if(White[2][2].equals("B")&&White[1][2].equals("B"))
			    	 {
			    		
			    		 System.out.println("  U  ");
			    		 moveU();
			    		 System.out.println(" F U' F' U U L' U' L ");
			    		 moveF();
			    		 moveUP();
			    		 moveFP();
			    		 moveU();
			    		 moveU();
			    		 moveLP();
			    		 moveUP();
			    		 moveL();

			    		 
			    	 }
			    	 
			    	 if(White[2][2].equals("Y")&&Green[0][2].equals("G")&&Red[0][0].equals("O")&&White[1][2].equals("G")&&Red[0][1].equals("O"))
			    	 //if(White[2][2].equals("O")&&White[1][2].equals("B"))
			    	 {
			    		 
			    		 System.out.println(" U");
			    		 moveU();
			    		 System.out.println("L U L' U L U' L' U L");
					    	
			    		 moveL();
			    		 moveU();
			    		 moveLP();
			    		 moveU();
			    		 moveL();
			    		 moveUP();
			    		 moveLP();
			    		 moveU();
			    		 moveL();

			    	 }
			    	 
			    	 if(White[2][2].equals("O")&&Green[0][2].equals("Y")&&Red[0][0].equals("G")&&White[1][2].equals("O")&&Red[0][1].equals("G"))
			    	 //if(White[2][2].equals("Y")&&White[1][2].equals("O"))
			    	 {
			    		 			    	 
				    	 System.out.println(" F U' F'");
			    		
			    		 moveF();
			    		 moveUP();
			    		 moveFP();

			    		
			    	 }
			    	 
			    	
			    	 if(White[2][2].equals("G")&&Green[0][2].equals("O")&&Red[0][0].equals("Y")&&White[1][2].equals("O")&&Red[0][1].equals("G"))
			    	// if(White[2][2].equals("O")&&White[1][2].equals("O"))
			    	 {
			    		 System.out.println("U");
				    	 moveU();
				    	 
				    	 System.out.println(" U F U' F' U F U F'");
			    		 
			    		 
				    		
			    		 moveU();
			    		 moveF();
			    		 moveUP();
			    		 moveFP();
			    		 moveU();
			    		 moveF();
			    		 moveU();
			    		 moveFP();

			    		
			    	 }
			    	 
			    	 
			    	 
			    	 if(White[2][2].equals("Y")&&Green[0][2].equals("G")&&Red[0][0].equals("O")&&White[1][2].equals("O")&&Red[0][1].equals("G"))
			    	 //if(White[2][2].equals("B")&&White[1][2].equals("O"))
			    	 {
			    		
			    		 System.out.println(" U");
			    		 
			    		 moveU();

			    		 System.out.println(" F U U F' U' F U F'");
			    		 
			    	
			    		 moveF();
			    		 moveU();
			    		 moveU();
			    		 moveFP();
			    		 moveUP();
			    		 moveF();
			    		 moveU();
			    		 moveFP();

			    		
			    		
			    	 }
			    	 
			    	 
			     }
			     break;
			     
			     
			     
			   
			     
			     
			  
     }
     
      
     
     
	 
}




public static void solveYRGandRG()
{
	 System.out.println("find the location of YRG corner and orientation  ");
	 int t=0;
	 
	 
	 while(t<8)
	 {
		 corners=cor[0][t];
		 System.out.print(corners+",");
		 
		 if(cor[0][t].equals("YGR")|| cor[0][t].equals("RYG")||cor[0][t].equals("GRY")||cor[0][t].equals("YRG")||cor[0][t].equals("RGY")||cor[0][t].equals("GYR"))
		 {
			 cor4=cor[0][t];
			 F2LCor4=cor4;
			 System.out.println(F2LCor4);
			 F2LCorpos4=t;
			 System.out.println(F2LCorpos4);
			 
			 if(F2LCorpos4>3)
			 {
				 switch(F2LCorpos4)
				 
				 {
				 
						 case 4:
							 
						 {
							 System.out.println("L' U' L");
							 moveLP();
							 moveUP();
							 moveL();
							 
						 }
						 break;
						 
						 case 5:
						 {
							 
							 System.out.println("R U R'");
							 moveR();
							 moveU();
							 moveRP();
						 }
				         break;
				         
				         
						 case 6:
						 {
							 
							 System.out.println("R' U R");
							 moveRP();
							 moveU();
							 moveR();
						 }
				         break;
				         
				         
						 case 7:
						 {
							 
							 System.out.println("L U L'");
							 moveL();
							 moveU();
							 moveLP();
						 }
				         break;
				         
				        
				 }
				 
				 
			 }
		 }
		 
		 t++;
		 
		 
	 }
	 
	
	 
	 FindCorners();
	 
	 
	 System.out.println("the updated location of YRG corner and orientation  ");
	int  f=0;
	 
	 while(f<8)
	 {
		 corners=cor[0][f];
		 
		 if(cor[0][f].equals("YGR")|| cor[0][f].equals("RYG")||cor[0][f].equals("GRY")||cor[0][f].equals("YRG")||cor[0][f].equals("RGY")||cor[0][f].equals("GYR"))
		 {
			 cor4=cor[0][f];
			 F2LCor4=cor4;
			 System.out.println(F2LCor4);
			 F2LCorpos4=f;
			 System.out.println(F2LCorpos4);
			 
			 
		}
		 f++;
		 
		 
	 }
	 
	 
 FindEdges();
	 
	 
	 System.out.println("the location of RG edge is  ");
	int  s=0;
	 
	 while(s<12)
	 {
		 edges=ed[0][s];
		 
		 if(ed[0][s].equals("GR")|| ed[0][s].equals("RG"))
		 {
			 ed4=ed[0][s];
			 F2Led4=ed4;
			 System.out.println(F2Led4);
			 F2LEdpos4=s;
			 System.out.println(F2LEdpos4);
			 
			 if(F2LEdpos4>7)
			 {
				 switch(F2LEdpos4)
				 
				 {
				 
						 case 8:
	
							 
							 
						 {
							 if(F2LCorpos4==3)
							 {
								 
								 System.out.println("L' U U L");
								 moveLP();
								 moveU();
								 moveU();
								 moveL();
								 
							 }
							 
							 else
							 {
								 System.out.println("L'  U' L");
								 moveLP();
								
								 moveUP();
								 moveL();
								  
								 
							 }
						 }
						 break;
						 
						 case 9:
						 {
							 
							 if(F2LCorpos4==2)
							 {
								 
								 System.out.println("R U U R'");
								 moveR();
								 moveU();
								 moveU();
								 moveRP();
								 
							 }
							 
							 else
							 {
								 System.out.println("R  U' R'");
								 moveR();
								
								 moveUP();
								 moveRP();
								  
								 
							 }
						 }
				         break;
				         
				         
						 case 10:
						 {
							 
							 if(F2LCorpos4==1)
							 {
								 
								 System.out.println("R' U U R");
								 moveRP();
								 moveU();
								 moveU();
								 moveR();
								 
							 }
							 
							 else
							 {
								 System.out.println("R'  U' R");
								 moveRP();
								
								 moveUP();
								 moveR();
								  
								 
							 }
						 }
				         break;
				         
				         
						 case 11:
						 {
							 
							 if(F2LCorpos4==0)
							 {
								 
								 System.out.println("L U U L'");
								 moveL();
								 moveU();
								 moveU();
								 moveLP();
								 
							 }
							 
							 else
							 {
								 System.out.println("L U L'");
								 moveL();
								
								 moveU();
								 moveLP();
								  
								 
							 }
						 }
				         break;
				         
				        
				 }
				 
				 
			 }
			 
			 
			 
			 
			 
		}
		 s++;
		
		 
		 
	 }
	  
	 
	 
	 
	 FindCorners();
	 
	 
	 System.out.println("the updated location of YRG corner and orientation  ");
	  f=0;
	 
	 while(f<8)
	 {
		 corners=cor[0][f];
		 
		 if(cor[0][f].equals("YGR")|| cor[0][f].equals("RYG")||cor[0][f].equals("GRY")||cor[0][f].equals("YRG")||cor[0][f].equals("RGY")||cor[0][f].equals("GYR"))
		 {
			 cor4=cor[0][f];
			 F2LCor4=cor4;
			 System.out.println(F2LCor4);
			 F2LCorpos4=f;
			 System.out.println(F2LCorpos4);
			 
			 
		}
		 f++;
		 
		 
	 }
	 	 
	
	 
	 FindEdges();
	 
	 
	 System.out.println("the updated location of RG edge and orientation  ");
	  s=0;
	 
	 while(s<12)
	 {
		 edges=ed[0][s];
		 
		 if(ed[0][s].equals("GR")|| ed[0][s].equals("RG"))
		 {
			 ed4=ed[0][s];
			 F2Led4=ed4;
			 System.out.println(F2Led4);
			 F2LEdpos4=s;
			 System.out.println(F2LEdpos4);
			 
			 
		}
		 s++;
		 
		 
	 }
	 
	 
	System.out.println("now i know the location of the corner and the edge");
	
	 System.out.println("location of corner"+F2LCorpos4);
	 System.out.println("corner is"+F2LCor4);
	 System.out.println("location of edge"+F2LEdpos4);
	 System.out.println("edge is"+F2Led4);
	 
	 
	 int YRGRGpos= 10*F2LCorpos4+ F2LEdpos4;
	 System.out.println("the case to be executed");
	 System.out.println(YRGRGpos);
     String YRGRG=	 F2LCor1+F2Led1;
     
     switch(YRGRGpos)
     {
     
			     case 12:
			     {
			    	
			    	 if(White[0][2].equals("R")&&Red[0][2].equals("G")&&Blue[0][0].equals("Y")&&White[2][1].equals("G")&&Green[0][1].equals("R"))
			    	 {
			    		 
			    		 System.out.println(" R U R' U  R U R'  ");
			    		 moveR();
			    		 moveU();
			    		 moveRP();
			    		 moveU();
			    		 moveR();
			    		 moveU();
			    		 moveRP();
			    		 
			    	 }
			    	 
			    	 if(White[0][2].equals("G")&&Red[0][2].equals("Y")&&Blue[0][0].equals("R")&&White[2][1].equals("G")&&Green[0][1].equals("R"))
			    	 {
			    		 
			    		 System.out.println(" R U U R' U U R U' R'  ");
			    		 moveR();
			    		 moveU();
			    		 moveU();
			    		 moveRP();
			    		 moveU();
			    		 moveU();
			    		 
			    		 moveR();
			    		 moveUP();
			    		 moveRP(); 
			    	 }
			    	 //YB
			    	 
			    	 if(White[0][2].equals("Y")&&Red[0][2].equals("R")&&Blue[0][0].equals("G")&&White[2][1].equals("G")&&Green[0][1].equals("R"))
			    	 {
			    		 
			    		 System.out.println(" U R U R R F R F'  ");
			    		 moveU();
			    		 moveR();
			    		 moveU();
			    		 moveR();
			    		 moveR();
			    		 moveF();
			    		 moveR(); 
			    		 moveFP();
			    	 }
			    	 
			    	 //YO
			    	 if(White[0][2].equals("Y")&&Red[0][2].equals("R")&&Blue[0][0].equals("G")&&White[2][1].equals("R")&&Green[0][1].equals("G"))
			    	 {
			    		 
			    		 System.out.println("  F' U U F U' F' U F ");
			    	
			    		 moveFP();
			    		 moveU();
			    		 moveU();
			    		 moveF();
			    		 moveUP(); 
			    		 moveFP();
			    		 moveU();
			    		 moveF();
			    	 }
			    	 
			    	
			    	 //O O
			    	 if(White[0][2].equals("R")&&Red[0][2].equals("G")&&Blue[0][0].equals("Y")&&White[2][1].equals("R")&&Green[0][1].equals("G"))
			    	 {
			    		 
			    		 System.out.println(" U U F' U' F U U F' U F");
			    		 moveU();
			    		 moveU();
			    		 moveFP();
			    		 moveUP();
			    		 moveF();
			    		 moveU();
			    		 moveU(); 
			    		 moveFP();
			    		 moveU();
			    		 moveF();
			    		
			    	 }
			    	 
			    	 
			    	 
			    	 //BO
			    	 if(White[0][2].equals("G")&&Red[0][2].equals("Y")&&Blue[0][0].equals("R")&&White[2][1].equals("R")&&Green[0][1].equals("G"))
			    	 {
			    		 
			    		 System.out.println(" U F' U' F");
			    		 
			    		
			    		 moveU();
			    		
			    		 moveFP();
			    		 moveUP(); 
			    		 moveF();
			    		
			    		
			    	 }
			    	 
			    	 
			    	 
			     }
			     break;
			     
			     
			     case 1:
			     {
			    	//OB
			    	 if(White[0][0].equals("R")&&Blue[0][2].equals("G")&&Orange[0][0].equals("Y")&&White[1][2].equals("G")&&Red[0][1].equals("R"))
			    	// if(White[0][0].equals("O")&&White[1][2].equals("B"))
			    	 {

			    		 System.out.println("U");
				    	 moveU();
				    	 System.out.println(" R U R' U  R U R'  ");
			    		 moveR();
			    		 moveU();
			    		 moveRP();
			    		 moveU();
			    		 moveR();
			    		 moveU();
			    		 moveRP();
				    	 
			    		 
			    	 }
			    	 
			    	 if(White[0][0].equals("G")&&Blue[0][2].equals("Y")&&Orange[0][0].equals("R")&&White[1][2].equals("G")&&Red[0][1].equals("R"))
			    	 //if(White[0][0].equals("B")&&White[1][2].equals("B"))
			    	 {
			    		 System.out.println("U");
				    	 moveU();
				    	 System.out.println(" R U U R' U U R U' R'  ");
			    		 moveR();
			    		 moveU();
			    		 moveU();
			    		 moveRP();
			    		 moveU();
			    		 moveU();
			    		 
			    		 moveR();
			    		 moveUP();
			    		 moveRP(); 
				    	
			    	 }
			    	 
			    	 if(White[0][0].equals("Y")&&Blue[0][2].equals("R")&&Orange[0][0].equals("G")&&White[1][2].equals("G")&&Red[0][1].equals("R"))
			    	 //if(White[0][0].equals("Y")&&White[1][2].equals("B"))
			    	 {

			    		 System.out.println("U");
				    	 moveU();
				    	 System.out.println(" U R U R R F R F'  ");
			    		 moveU();
			    		 moveR();
			    		 moveU();
			    		 moveR();
			    		 moveR();
			    		 moveF();
			    		 moveR(); 
			    		 moveFP();
			    		
			    	 }
			    	 
			    	 if(White[0][0].equals("Y")&&Blue[0][2].equals("R")&&Orange[0][0].equals("G")&&White[1][2].equals("R")&&Red[0][1].equals("G"))
			    	 //if(White[0][0].equals("Y")&&White[1][2].equals("O"))
			    	 {

			    		 System.out.println("U");
				    	 moveU();
				    	 System.out.println("  F' U U F U' F' U F ");
					    	
			    		 moveFP();
			    		 moveU();
			    		 moveU();
			    		 moveF();
			    		 moveUP(); 
			    		 moveFP();
			    		 moveU();
			    		 moveF();
			    		
			    	 }
			    	 
			    	
			    	 if(White[0][0].equals("R")&&Blue[0][2].equals("G")&&Orange[0][0].equals("Y")&&White[1][2].equals("R")&&Red[0][1].equals("G"))
			    	 //if(White[0][0].equals("O")&&White[1][2].equals("O"))
			    	 {

				    	
			    		
				    	 System.out.println(" U' F' U' F U U F' U F");
			    		
			    		 moveUP();
			    		 moveFP();
			    		 moveUP();
			    		 moveF();
			    		 moveU();
			    		 moveU(); 
			    		 moveFP();
			    		 moveU();
			    		 moveF();
			    		
			    	 }
			    	 
			    	 
			    	 
			    	 if(White[0][0].equals("G")&&Blue[0][2].equals("Y")&&Orange[0][0].equals("R")&&White[1][2].equals("R")&&Red[0][1].equals("G"))
			    	// if(White[0][0].equals("B")&&White[1][2].equals("O"))
			    	 {

			    		 System.out.println("U");
				    	 moveU();
				    	 System.out.println(" U F' U' F");
			    		 
				    		
			    		 moveU();
			    		
			    		 moveFP();
			    		 moveUP(); 
			    		 moveF();
			    		
			    		
			    		
			    	 }
			    	 
			    	 
			    	 
			     }
			     break;
			     
			     
			     case 23:
			     {
			    	
			    	 if(White[2][2].equals("R")&&Green[0][2].equals("G")&&Red[0][0].equals("Y")&&White[1][0].equals("G")&&Orange[0][1].equals("R"))
			    	 //if(White[2][2].equals("O")&&White[1][0].equals("B"))
			    	 {
			    		 System.out.println("U'");
				    	 moveUP();
				    	 System.out.println(" R U R' U  R U R'  ");
			    		 moveR();
			    		 moveU();
			    		 moveRP();
			    		 moveU();
			    		 moveR();
			    		 moveU();
			    		 moveRP();
				    	 
			    		
			    		 
			    	 }
			    	 
			    	 if(White[2][2].equals("G")&&Green[0][2].equals("Y")&&Red[0][0].equals("R")&&White[1][0].equals("G")&&Orange[0][1].equals("R"))
			    	 //if(White[2][2].equals("B")&&White[1][0].equals("B"))
			    	 {
			    		 
			    		 System.out.println("U'");
				    	 moveUP();
				    	 System.out.println(" R U U R' U U R U' R'  ");
			    		 moveR();
			    		 moveU();
			    		 moveU();
			    		 moveRP();
			    		 moveU();
			    		 moveU();
			    		 
			    		 moveR();
			    		 moveUP();
			    		 moveRP(); 
			    		
			    	 }
			    	 
			    	 if(White[2][2].equals("Y")&&Green[0][2].equals("R")&&Red[0][0].equals("G")&&White[1][0].equals("G")&&Orange[0][1].equals("R"))
			    	 //if(White[2][2].equals("Y")&&White[1][0].equals("B"))
			    	 {
			    		
				    	 System.out.println(" R U R R F R F'  ");
			    	
			    		 moveR();
			    		 moveU();
			    		 moveR();
			    		 moveR();
			    		 moveF();
			    		 moveR(); 
			    		 moveFP();
			    		
			    		
			    	 }
			    	 
			    	 if(White[2][2].equals("Y")&&Green[0][2].equals("R")&&Red[0][0].equals("G")&&White[1][0].equals("R")&&Orange[0][1].equals("G"))
			    	// if(White[2][2].equals("Y")&&White[1][0].equals("O"))
			    	 {
			    		 
			    		 System.out.println("U'");
				    	 moveUP();
				    	 System.out.println("  F' U U F U' F' U F ");
					    	
			    		 moveFP();
			    		 moveU();
			    		 moveU();
			    		 moveF();
			    		 moveUP(); 
			    		 moveFP();
			    		 moveU();
			    		 moveF();
			    		
			    	 }
			    	 
			    	
			    	 if(White[2][2].equals("R")&&Green[0][2].equals("G")&&Red[0][0].equals("Y")&&White[1][0].equals("R")&&Orange[0][1].equals("G"))
			    	// if(White[2][2].equals("O")&&White[1][0].equals("O"))
			    	 {
			    		 
				    	 System.out.println(" U F' U' F U U F' U F");
			    		
			    		 moveU();
			    		 moveFP();
			    		 moveUP();
			    		 moveF();
			    		 moveU();
			    		 moveU(); 
			    		 moveFP();
			    		 moveU();
			    		 moveF();
			    		
			    		
			    		
			    	 }
			    	 
			    	 
			    	 
			    	 if(White[2][2].equals("G")&&Green[0][2].equals("Y")&&Red[0][0].equals("R")&&White[1][0].equals("R")&&Orange[0][1].equals("G"))
			    	 //if(White[2][2].equals("B")&&White[1][0].equals("O"))
			    	 {
			    		
				    	 System.out.println("F' U' F");
			    		 
				    		
			    		 
			    		
			    		 moveFP();
			    		 moveUP(); 
			    		 moveF();
			    		
			    		
			    	 }
			    	 
			    	 
			    	 
			     }
			     break;
			     
			     
			     case 30:
			     {
			    	
			    	 
			    	 
			    	 if(White[2][0].equals("R")&&Orange[0][2].equals("G")&&Green[0][0].equals("Y")&&White[0][1].equals("G")&&Blue[0][1].equals("R"))
			    	 //if(White[2][0].equals("O")&&White[0][1].equals("B"))
			    	 {
			    		 System.out.println("U U");
				    	 moveU();
				    	 moveU();
				    	 System.out.println(" R U R' U  R U R'  ");
			    		 moveR();
			    		 moveU();
			    		 moveRP();
			    		 moveU();
			    		 moveR();
			    		 moveU();
			    		 moveRP();
			    		 
			    		 
			    	 }
			    	 if(White[2][0].equals("G")&&Orange[0][2].equals("Y")&&Green[0][0].equals("R")&&White[0][1].equals("G")&&Blue[0][1].equals("R"))
			    	 //if(White[2][0].equals("B")&&White[0][1].equals("B"))
			    	 {
			    		 System.out.println("U U");
				    	 moveU();
				    	 moveU();
				    	 System.out.println(" R U U R' U U R U' R'  ");
			    		 moveR();
			    		 moveU();
			    		 moveU();
			    		 moveRP();
			    		 moveU();
			    		 moveU();
			    		 
			    		 moveR();
			    		 moveUP();
			    		 moveRP(); 
			    		
			    	 }
			    	 
			    	 if(White[2][0].equals("Y")&&Orange[0][2].equals("R")&&Green[0][0].equals("G")&&White[0][1].equals("G")&&Blue[0][1].equals("R"))
			    	// if(White[2][0].equals("Y")&&White[0][1].equals("B"))
			    	 {
			    		
			    		
				    	 System.out.println(" U' R U R R F R F'  ");
			    		 moveUP();
			    		 moveR();
			    		 moveU();
			    		 moveR();
			    		 moveR();
			    		 moveF();
			    		 moveR(); 
			    		 moveFP();
			    		
			    	 }
			    	 
			    	 if(White[2][0].equals("Y")&&Orange[0][2].equals("R")&&Green[0][0].equals("G")&&White[0][1].equals("R")&&Blue[0][1].equals("G"))
			    	 //if(White[2][0].equals("Y")&&White[0][1].equals("O"))
			    	 {
			    		
			    		 System.out.println("U U");
				    	 moveU();
				    	 moveU();
				    	 System.out.println("  F' U U F U' F' U F ");
					    	
			    		 moveFP();
			    		 moveU();
			    		 moveU();
			    		 moveF();
			    		 moveUP(); 
			    		 moveFP();
			    		 moveU();
			    		 moveF();
			    		
			    	 }
			    	 
			    	
			    	 if(White[2][0].equals("R")&&Orange[0][2].equals("G")&&Green[0][0].equals("Y")&&White[0][1].equals("R")&&Blue[0][1].equals("G"))
			    	// if(White[2][0].equals("O")&&White[0][1].equals("O"))
			    	 {
			    		
			    		
				    	 System.out.println("  F' U' F U U F' U F");
			    		
			    		 moveFP();
			    		 moveUP();
			    		 moveF();
			    		 moveU();
			    		 moveU(); 
			    		 moveFP();
			    		 moveU();
			    		 moveF();
			    		
			    		
			    		
			    	 }
			    	 
			    	 
			    	 
			    	 if(White[2][0].equals("G")&&Orange[0][2].equals("Y")&&Green[0][0].equals("R")&&White[0][1].equals("R")&&Blue[0][1].equals("G"))
			    	 //if(White[2][0].equals("B")&&White[0][1].equals("O"))
			    	 {
			    		 
				    	 System.out.println(" U' F' U' F");
			    		 
				    		
			    		 moveUP();
			    		
			    		 moveFP();
			    		 moveUP(); 
			    		 moveF();
			    		
			    		
			    		
			    	 }
			    	 
			    	 
			    	 
			     }
			     break;
			     
			     
			     
			     case 0:
			     {
			    	
			    	 if(White[0][0].equals("Y")&&Blue[0][2].equals("R")&&Orange[0][0].equals("G")&&White[0][1].equals("G")&&Blue[0][1].equals("R"))
			    	 //if(White[0][0].equals("Y")&&White[0][1].equals("B"))
			    	 {
			    		 
			    		 System.out.println(" U U R U R' U' U' R U R' U' R U R' ");
			    		 moveU();
			    		 moveU();
			    		 moveR();
			    		 moveU();
			    		 moveRP();
			    		 moveUP();
			    		 moveUP();
			    		 moveR();
			    		 moveU();
			    		 moveRP();
			    		 moveUP();
			    		 moveR();
			    		 moveU();
			    		 moveRP();
			    		
			    		
			    		 
			    	 }
			    	 if(White[0][0].equals("G")&&Blue[0][2].equals("Y")&&Orange[0][0].equals("R")&&White[0][1].equals("G")&&Blue[0][1].equals("R"))
			    	 //if(White[0][0].equals("B")&&White[0][1].equals("B"))
			    	 {
			    		 
			    		 System.out.println("U U F' U F U U R U R'");
			    		 moveU();
			    		 moveU();
			    		 moveFP();
			    		 moveU();
			    		 moveF();
			    		 moveU();
			    		 moveU();
			    		 moveF();
			    		 moveU(); 
			    		 moveFP(); 
			    	 }
			    	 
			    	 if(White[0][0].equals("R")&&Blue[0][2].equals("G")&&Orange[0][0].equals("Y")&&White[0][1].equals("G")&&Blue[0][1].equals("R"))
			    	 //if(White[0][0].equals("O")&&White[0][1].equals("B"))
			    	 {
			    		 
			    		 System.out.println("U' F' U U F U' R U R' ");
			    		 moveUP();
			    		 moveFP();
			    		 moveU();
			    		 moveU();
			    		 moveF();
			    		 moveUP();
			    		 moveR(); 
			    		 moveU(); 
			    		 moveRP(); 
			    		
			    	 }
			    	 
			    	 if(White[0][0].equals("Y")&&Blue[0][2].equals("R")&&Orange[0][0].equals("G")&&White[0][1].equals("R")&&Blue[0][1].equals("G"))
			    	// if(White[0][0].equals("Y")&&White[0][1].equals("O"))
			    	 {
			    		 
			    		 System.out.println("U U  F' U U F U F' U' F ");
			    		 moveU();
			    		 moveU();
			    		 moveFP();
			    		 moveU();
			    		 moveU();
			    		 moveF();
			    		 moveU();
			    		 moveFP();
			    		 moveUP(); 
			    		 moveF();
			    		
			    	 }
			    	 
			    	
			    	 if(White[0][0].equals("R")&&Blue[0][2].equals("G")&&Orange[0][0].equals("Y")&&White[0][1].equals("R")&&Blue[0][1].equals("G"))
			    	 //if(White[0][0].equals("O")&&White[0][1].equals("O"))
			    	 {
			    		 
			    		 System.out.println(" U F' U F");
			    		 
			    		 
			    		 moveU();
			    		 moveFP();
			    		 moveU(); 
			    		 moveF();
			    		
			    	 }
			    	 
			    	 
			    	 //&//
			    	 if(White[0][0].equals("G")&&Blue[0][2].equals("Y")&&Orange[0][0].equals("R")&&White[0][1].equals("R")&&Blue[0][1].equals("G"))
			    	 //if(White[0][0].equals("B")&&White[0][1].equals("O"))
			    	 {
			    		 
			    		 System.out.println(" U' F'U F U' F' U' F");
			    		 
			    		
			    		 moveUP();
			    		 moveFP();
			    		 moveU();
			    		 moveF();
			    		 moveUP();
			    		
			    		 moveFP();
			    		 moveUP();
			    		 moveF();
			    		
			    		
			    	 }
			    	 
			    	 
			    	 
			     }
			     break;  
			     
			   
			     
			     case 11:
			     {
			    	
			    	 
			    	 ///////
			    	 if(White[0][2].equals("Y")&&Red[0][2].equals("R")&&Blue[0][0].equals("G")&&White[1][2].equals("G")&&Red[0][1].equals("R"))
			    	 //if(White[0][2].equals("Y")&&White[1][2].equals("B"))
			    	 {
			    		 
			    		
				    	 System.out.println(" U  R U R' U' U' R U R' U' R U R' ");
			    		
			    		 moveU();
			    		 moveR();
			    		 moveU();
			    		 moveRP();
			    		 moveUP();
			    		 moveUP();
			    		 moveR();
			    		 moveU();
			    		 moveRP();
			    		 moveUP();
			    		 moveR();
			    		 moveU();
			    		 moveRP();
			    		
			    		 
			    		
			    		
			    		 
			    	 }
			    	 if(White[0][2].equals("G")&&Red[0][2].equals("Y")&&Blue[0][0].equals("R")&&White[1][2].equals("G")&&Red[0][1].equals("R"))
			    	 //if(White[0][2].equals("B")&&White[1][2].equals("B"))
			    	 {
			    		 
			    		 
			    		
				    	 System.out.println(" U F' U F U U R U R'");
			    		 
			    		 moveU();
			    		 moveFP();
			    		 moveU();
			    		 moveF();
			    		 moveU();
			    		 moveU();
			    		 moveF();
			    		 moveU(); 
			    		 moveFP(); 
			    		 
			    		
			    	 }
			    	 
			    	 if(White[0][2].equals("R")&&Red[0][2].equals("G")&&Blue[0][0].equals("Y")&&White[1][2].equals("G")&&Red[0][1].equals("R"))
			    	 //if(White[0][2].equals("O")&&White[1][2].equals("B"))
			    	 {
			    		 
			    		 
			    		 System.out.println(" U' ");
				    	 moveUP();
				    	 System.out.println("U' F' U U F U' R U R' ");
			    		 moveUP();
			    		 moveFP();
			    		 moveU();
			    		 moveU();
			    		 moveF();
			    		 moveUP();
			    		 moveR(); 
			    		 moveU(); 
			    		 moveRP(); 
			    		 
			    	 }
			    	 
			    	 if(White[0][2].equals("Y")&&Red[0][2].equals("R")&&Blue[0][0].equals("G")&&White[1][2].equals("R")&&Red[0][1].equals("G"))
			    	 //if(White[0][2].equals("Y")&&White[1][2].equals("O"))
			    	 {
			    		
				    	 System.out.println("U   F' U U F U F' U' F ");
			    		
			    		 moveU();
			    		 moveFP();
			    		 moveU();
			    		 moveU();
			    		 moveF();
			    		 moveU();
			    		 moveFP();
			    		 moveUP(); 
			    		 moveF();
			    		 
			    		
			    	 }
			    	 
			    	
			    	 if(White[0][2].equals("R")&&Red[0][2].equals("G")&&Blue[0][0].equals("Y")&&White[1][2].equals("R")&&Red[0][1].equals("G"))
			    	 //if(White[0][2].equals("O")&&White[1][2].equals("O"))
			    	 {
			    		 
			    		
			    		 System.out.println("  F' U F");
			    		 
			    		 
			    		
			    		 moveFP();
			    		 moveU(); 
			    		 moveF();
			    		
			    		
			    		
			    	 }
			    	 
			    	 
			    	 
			    	 if(White[0][2].equals("G")&&Red[0][2].equals("Y")&&Blue[0][0].equals("R")&&White[1][2].equals("R")&&Red[0][1].equals("G"))
			    	 //if(White[0][2].equals("B")&&White[1][2].equals("O"))
			    	 {
			    		 
			    		
				    	 
			    		 System.out.println(" U U F' U F U' F' U' F  ");
			    		 
			    		 moveU();
			    		 moveU();
			    		 moveFP();
			    		 moveU();
			    		 moveF();
			    		 moveUP();
			    		 
			    		 moveFP();
			    		 moveUP();
			    		 moveF();
			    		 
			    		
			    		
			    	 }
			    	 
			    	 
			    	 
			     }
			     break;  
			     
			     
			     case 22:
			     {
			    	
			    	
			    	 if(White[2][2].equals("Y")&&Green[0][2].equals("R")&&Red[0][0].equals("G")&&White[2][1].equals("G")&&Green[0][1].equals("R"))
			    	 //if(White[2][2].equals("Y")&&White[2][1].equals("B"))
			    	 {
			    		
				    	 System.out.println("  R U R' U' U' R U R' U' R U R' ");
			    	
			    		 moveR();
			    		 moveU();
			    		 moveRP();
			    		 moveUP();
			    		 moveUP();
			    		 moveR();
			    		 moveU();
			    		 moveRP();
			    		 moveUP();
			    		 moveR();
			    		 moveU();
			    		 moveRP();
			    		
			    		
			    		 
			    	 }
			    	 if(White[2][2].equals("G")&&Green[0][2].equals("Y")&&Red[0][0].equals("R")&&White[2][1].equals("G")&&Green[0][1].equals("R"))
			    	 //if(White[2][2].equals("B")&&White[2][1].equals("B"))
			    	 {
			    		 
				    	 System.out.println(" F' U F U U R U R'");
			    		
			    		 moveFP();
			    		 moveU();
			    		 moveF();
			    		 moveU();
			    		 moveU();
			    		 moveF();
			    		 moveU(); 
			    		 moveFP(); 
			    		 
			    	 }
			    	 
			    	 if(White[2][2].equals("R")&&Green[0][2].equals("G")&&Red[0][0].equals("Y")&&White[2][1].equals("G")&&Green[0][1].equals("R"))
			    	 //if(White[2][2].equals("O")&&White[2][1].equals("B"))
			    	 {
			    		 
			    	
				    	 System.out.println("U F' U U F U' R U R' ");
			    		 moveU();
			    		 moveFP();
			    		 moveU();
			    		 moveU();
			    		 moveF();
			    		 moveUP();
			    		 moveR(); 
			    		 moveU(); 
			    		 moveRP(); 
			    		 
			    		
			    	 }
			    	 
			    	 if(White[2][2].equals("Y")&&Green[0][2].equals("R")&&Red[0][0].equals("G")&&White[2][1].equals("R")&&Green[0][1].equals("G"))
			    	 //if(White[2][2].equals("Y")&&White[2][1].equals("O"))
			    	 {
			    		
				    	 System.out.println("  F' U U F U F' U' F ");
			    		
			    		 moveFP();
			    		 moveU();
			    		 moveU();
			    		 moveF();
			    		 moveU();
			    		 moveFP();
			    		 moveUP(); 
			    		 moveF();
			    		
			    	 }
			    	 
			    	
			    	 if(White[2][2].equals("R")&&Green[0][2].equals("G")&&Red[0][0].equals("Y")&&White[2][1].equals("R")&&Green[0][1].equals("G"))
			    	 //if(White[2][2].equals("O")&&White[2][1].equals("O"))
			    	 {
			    		 
			    		
                        System.out.println(" U' F' U F");
			    		 
			    		 
			    		 moveUP();
			    		 moveFP();
			    		 moveU(); 
			    		 moveF();
			    		
			    		
			    	 }
			    	 
			    	 
			    	 
			    	 if(White[2][2].equals("G")&&Green[0][2].equals("Y")&&Red[0][0].equals("R")&&White[2][1].equals("R")&&Green[0][1].equals("G"))
			    	// if(White[2][2].equals("B")&&White[2][1].equals("O"))
			    	 {
			    		
			    	
				    	 
			    		 System.out.println("U F' U F U' F' U' F  ");
			    		
			    		 moveU();
			    		 moveFP();
			    		 moveU();
			    		 moveF();
			    		 moveUP();
			    		 moveFP();
			    		 moveUP();
			    		 moveF();
			    		 
			    		
			    		
			    		
			    	 }
			    	 
			    	 
			    	 
			     }
			     break;  
			     
			     

			     case 33:
			     {
			    	
			    	 
			    	
			    	 
			    	 if(White[2][0].equals("Y")&&Orange[0][2].equals("R")&&Green[0][0].equals("G")&&White[1][0].equals("G")&&Orange[0][1].equals("R"))
			    	//(White[2][0].equals("Y")&&White[1][0].equals("B"))
			    	 {
			    		
				    	 System.out.println(" U' R U R' U' U' R U R' U' R U R' ");
			    		
			    		 moveUP();
			    		 moveR();
			    		 moveU();
			    		 moveRP();
			    		 moveUP();
			    		 moveUP();
			    		 moveR();
			    		 moveU();
			    		 moveRP();
			    		 moveUP();
			    		 moveR();
			    		 moveU();
			    		 moveRP();
			    		
			    		
			    		 
			    	 }
			    	 if(White[2][0].equals("G")&&Orange[0][2].equals("Y")&&Green[0][0].equals("R")&&White[1][0].equals("G")&&Orange[0][1].equals("R"))
			    	 //if(White[2][0].equals("B")&&White[1][0].equals("B"))
			    	 {
			    		
				    	 System.out.println("U' F' U F U U R U R'");
			    		
			    		 moveUP();
			    		 moveFP();
			    		 moveU();
			    		 moveF();
			    		 moveU();
			    		 moveU();
			    		 moveF();
			    		 moveU(); 
			    		 moveFP(); 
			    		
			    	 }
			    	 
			    	 if(White[2][0].equals("R")&&Orange[0][2].equals("G")&&Green[0][0].equals("Y")&&White[1][0].equals("G")&&Orange[0][1].equals("R"))
			    	// if(White[2][0].equals("O")&&White[1][0].equals("B"))
			    	 {
			    		
				    	 System.out.println(" F' U U F U' R U R' ");
			    		
			    		 moveFP();
			    		 moveU();
			    		 moveU();
			    		 moveF();
			    		 moveUP();
			    		 moveR(); 
			    		 moveU(); 
			    		 moveRP(); 
			    		 
			    		
			    	 }
			    	 
			    	 if(White[2][0].equals("Y")&&Orange[0][2].equals("R")&&Green[0][0].equals("G")&&White[1][0].equals("R")&&Orange[0][1].equals("G"))
			    	 //if(White[2][0].equals("Y")&&White[1][0].equals("O"))
			    	 {
			    		 
				    	 System.out.println("U' F' U U F U F' U' F ");
			    		
			    		 moveUP();
			    		 moveFP();
			    		 moveU();
			    		 moveU();
			    		 moveF();
			    		 moveU();
			    		 moveFP();
			    		 moveUP(); 
			    		 moveF();
			    		 
			    		
			    	 }
			    	 
			    	
			    	 if(White[2][0].equals("R")&&Orange[0][2].equals("G")&&Green[0][0].equals("Y")&&White[1][0].equals("R")&&Orange[0][1].equals("G"))
			    	 //if(White[2][0].equals("O")&&White[1][0].equals("O"))
			    	 {
			    		 
			    		 System.out.println(" U  ");
				    	 moveU();
                         System.out.println(" U F' U F");
			    		 
			    		 
			    		 moveU();
			    		 moveFP();
			    		 moveU(); 
			    		 moveF();
			    		
			    	 }
			    	 
			    	 
			    	 
			    	 if(White[2][0].equals("G")&&Orange[0][2].equals("Y")&&Green[0][0].equals("R")&&White[1][0].equals("R")&&Orange[0][1].equals("G"))
			    	// if(White[2][0].equals("B")&&White[1][0].equals("O"))
			    	 {
			    		 
			    		 
                         System.out.println("F' U F U' F' U' F ");
			    		 
			    		
			    		
			    		 moveFP();
			    		 moveU();
			    		 moveF();
			    		 moveUP();
			    		 moveFP();
			    		 moveUP();
			    		 moveF();
			    		
			    		 
			    		
			    	 }
			    	 
			    	 
			    	 
			     }
			     break; 	
			     
			     ///REMAINING
			     case 2:
			     {
			    	 if(White[0][0].equals("Y")&&Blue[0][2].equals("R")&&Orange[0][0].equals("G")&&White[2][1].equals("G")&&Green[0][1].equals("R"))
			    	 //if(White[0][0].equals("Y")&&White[2][1].equals("B"))
			    	 {
			    		 
			    		 System.out.println(" U' R U U R' U R U' R' ");
			    		 moveUP();
			    		 moveR();
			    		 moveU();
			    		 moveU();
			    		 moveRP();
			    		 moveU();
			    		 moveR();
			    		 moveUP();
			    		 moveRP();
			    		
			    		
			    		 
			    	 }
			    	 if(White[0][0].equals("G")&&Blue[0][2].equals("Y")&&Orange[0][0].equals("R")&&White[2][1].equals("G")&&Green[0][1].equals("R"))
			    	 //if(White[0][0].equals("B")&&White[2][1].equals("B"))
			    	 {
			    		 
			    		 System.out.println("  U R U R' U U R U' R'   ");
			    		 moveU();
			    		 moveR();
			    		 moveU();
			    		 moveRP();
			    		 moveU();
			    		 moveU();
			    		 moveR(); 
			    		 moveUP(); 
			    		 moveRP(); 
			    	 }
			    	 
			    	 if(White[0][0].equals("R")&&Blue[0][2].equals("G")&&Orange[0][0].equals("Y")&&White[2][1].equals("G")&&Green[0][1].equals("R"))
			    	 //if(White[0][0].equals("O")&&White[2][1].equals("B"))
			    	 {
			    		 
			    		 System.out.println(" U U R U R' ");
			    		 moveU();
			    		 moveU();
			    		 moveR();
			    		 moveU();
			    		 moveRP();
			    		
			    		
			    	 }
			    	 
			    	 if(White[0][0].equals("Y")&&Blue[0][2].equals("R")&&Orange[0][0].equals("G")&&White[2][1].equals("R")&&Green[0][1].equals("G"))
			    	 //if(White[0][0].equals("Y")&&White[2][1].equals("O"))
			    	 {
			    		 
			    		 System.out.println("  F' U' F U' F' U F");
			    		 
			    		 moveFP();
			    		 moveUP();
			    		 moveF();
			    		 moveUP();
			    		 moveFP(); 
			    		 moveU();
			    		 moveF();
			    		
			    	 }
			    	 
			    	
			    	 if(White[0][0].equals("R")&&Blue[0][2].equals("G")&&Orange[0][0].equals("Y")&&White[2][1].equals("R")&&Green[0][1].equals("G"))
			    	 //if(White[0][0].equals("O")&&White[2][1].equals("O"))
			    	 {
			    		 
			    		 System.out.println(" U' F' U U F U U F' U' F");
			    		 
			    		 
			    		
			    		 moveUP();
			    		 moveFP();
			    		 moveU();
			    		 moveU();
			    		 moveF();
			    		 moveU();
			    		 moveU();
			    		 moveFP();
			    		 moveUP();
			    		 moveF();
			    		
			    	 }
			    	 
			    	 
			    	 
			    	 if(White[0][0].equals("G")&&Blue[0][2].equals("Y")&&Orange[0][0].equals("R")&&White[2][1].equals("R")&&Green[0][1].equals("G"))
			    	 //if(White[0][0].equals("B")&&White[2][1].equals("O"))
			    	 {
			    		 
			    		 System.out.println("  U' F' U' F  U' F' U' F");
			    		 
			    		 moveUP();
			    		 moveFP();
			    		 moveUP();
			    		 moveF();
			    		 moveUP();
			    		 moveFP();
			    		 moveUP();
			    		 moveF();
			    		
			    		
			    	 }
			    	 
			    	 
			     }
			     break;
			     
			     
			     case 31:
			     {
			    	 ///////
			    	 
			    	 if(White[2][0].equals("Y")&&Orange[0][2].equals("R")&&Green[0][0].equals("G")&&White[1][2].equals("G")&&Red[0][1].equals("R"))
			    	 //if(White[0][2].equals("Y")&&White[1][2].equals("B"))
			    	 {
			    		 
			    		 System.out.println("  R U U R' U R U' R' ");
			    		
			    		 moveR();
			    		 moveU();
			    		 moveU();
			    		 moveRP();
			    		 moveU();
			    		 moveR();
			    		 moveUP();
			    		 moveRP();	
			    		
			    		
			    		 
			    	 }
			    	 if(White[2][0].equals("G")&&Orange[0][2].equals("Y")&&Green[0][0].equals("R")&&White[1][2].equals("G")&&Red[0][1].equals("R"))
			    	 //if(White[0][2].equals("B")&&White[1][2].equals("B"))
			    	 {
			    		
			    		 System.out.println(" U ");
			    		 moveU();
			    		 System.out.println("  U R U R' U U R U' R'   ");
			    		 moveU();
			    		 moveR();
			    		 moveU();
			    		 moveRP();
			    		 moveU();
			    		 moveU();
			    		 moveR(); 
			    		 moveUP(); 
			    		 moveRP(); 
			    		 
			    	 }
			    	 
			    	 if(White[2][0].equals("R")&&Orange[0][2].equals("G")&&Green[0][0].equals("Y")&&White[1][2].equals("G")&&Red[0][1].equals("R"))
			    	 //if(White[0][2].equals("O")&&White[1][2].equals("B"))
			    	 {
			    		 
			    		 System.out.println(" U' R U R' ");
			    		
			    		 moveUP();
			    		 moveR();
			    		 moveU();
			    		 moveRP();
			    		
			    		
			    		
			    	 }
			    	 
			    	 if(White[2][0].equals("Y")&&Orange[0][2].equals("R")&&Green[0][0].equals("G")&&White[1][2].equals("R")&&Red[0][1].equals("G"))
			    	// if(White[0][2].equals("Y")&&White[1][2].equals("O"))
			    	 {
			    		 
			    		 System.out.println(" U ");
			    		 moveU();
			    		 
                         System.out.println("  F' U' F U' F' U F");
			    		 
			    		 moveFP();
			    		 moveUP();
			    		 moveF();
			    		 moveUP();
			    		 moveFP(); 
			    		 moveU();
			    		 moveF();
			    		
			    	 }
			    	 
			    	 if(White[2][0].equals("R")&&Orange[0][2].equals("G")&&Green[0][0].equals("Y")&&White[1][2].equals("R")&&Red[0][1].equals("G"))
			    	 
			    	// if(White[0][2].equals("O")&&White[1][2].equals("O"))
			    	 {
			    		 
			    		
			    		 System.out.println("  F' U U F U U F' U' F");
			    		 
			    		 
				    		
			    		
			    		 moveFP();
			    		 moveU();
			    		 moveU();
			    		 moveF();
			    		 moveU();
			    		 moveU();
			    		 moveFP();
			    		 moveUP();
			    		 moveF();			    		
			    		 
			    		 
			    		
			    		
			    	 }
			    	 
			    	 
			    	 
			    	 if(White[2][0].equals("G")&&Orange[0][2].equals("Y")&&Green[0][0].equals("R")&&White[1][2].equals("R")&&Red[0][1].equals("G"))
			    	 //if(White[0][2].equals("B")&&White[1][2].equals("O"))
			    	 {
			    		 
                       System.out.println(" F' U' F  U' F' U' F");
			    		 
			    		 
			    		 moveFP();
			    		 moveUP();
			    		 moveF();
			    		 moveUP();
			    		 moveFP();
			    		 moveUP();
			    		 moveF();
			    		
			    	 }
			    	 
			    	 
			     }
			     break;
			     
			     
			     
			     case 20:
			     {
			    	 
			    	 if(White[2][2].equals("Y")&&Green[0][2].equals("R")&&Red[0][0].equals("G")&&White[0][1].equals("G")&&Blue[0][1].equals("R"))
			    	 //if(White[2][2].equals("Y")&&White[0][1].equals("B"))
			    	 {
			    		 
			    		
			    		 System.out.println(" U R U U R' U R U' R' ");
			    		 moveU();
			    		 moveR();
			    		 moveU();
			    		 moveU();
			    		 moveRP();
			    		 moveU();
			    		 moveR();
			    		 moveUP();
			    		 moveRP(); 
			    		
			    		
			    		 
			    	 }
			    	 if(White[2][2].equals("G")&&Green[0][2].equals("Y")&&Red[0][0].equals("R")&&White[0][1].equals("G")&&Blue[0][1].equals("R"))
			    	 //if(White[2][2].equals("B")&&White[0][1].equals("B"))
			    	 {
			    		
			    		 System.out.println("  U' R U R' U U R U' R'   ");
			    		 moveUP();
			    		 moveR();
			    		 moveU();
			    		 moveRP();
			    		 moveU();
			    		 moveU();
			    		 moveR(); 
			    		 moveUP(); 
			    		 moveRP(); 
			    		
			    	 }
			    	 
			    	 if(White[2][2].equals("R")&&Green[0][2].equals("G")&&Red[0][0].equals("Y")&&White[0][1].equals("G")&&Blue[0][1].equals("R"))
			    	 //if(White[2][2].equals("O")&&White[0][1].equals("B"))
			    	 {
			    		 
			    		 System.out.println(" R U R' ");
			    		 
			    		 moveR();
			    		 moveU();
			    		 moveRP();
			    		
			    		
			    		
			    	 }
			    	 
			    	 if(White[2][2].equals("Y")&&Green[0][2].equals("R")&&Red[0][0].equals("G")&&White[0][1].equals("R")&&Blue[0][1].equals("G"))
			    	 //if(White[2][2].equals("Y")&&White[0][1].equals("O"))
			    	 {
			    		
			    		 System.out.println(" U U ");
			    		 moveU();
			    		 moveU();
                       System.out.println("  F' U' F U' F' U F");
			    		 
			    		 moveFP();
			    		 moveUP();
			    		 moveF();
			    		 moveUP();
			    		 moveFP(); 
			    		 moveU();
			    		 moveF();
			    	 }
			    	 
			    	
			    	 
			    	
		    		 if(White[2][2].equals("R")&&Green[0][2].equals("G")&&Red[0][0].equals("Y")&&White[0][1].equals("R")&&Blue[0][1].equals("G"))
		    		 //if(White[2][2].equals("O")&&White[0][1].equals("O"))
			    	 {
		    			
			    		 System.out.println(" U F' U U F U U F' U' F");
			    		 
			    		 
				    		
			    		 moveU();
			    		 moveFP();
			    		 moveU();
			    		 moveU();
			    		 moveF();
			    		 moveU();
			    		 moveU();
			    		 moveFP();
			    		 moveUP();
			    		 moveF();
			    		 
			    	 }
			    	 
			    	 
			    	 
		    		 if(White[2][2].equals("G")&&Green[0][2].equals("Y")&&Red[0][0].equals("R")&&White[0][1].equals("R")&&Blue[0][1].equals("G"))
			    	 //if(White[2][2].equals("B")&&White[0][1].equals("O"))
			    	 {
			    		
                      System.out.println("  U F' U' F  U' F' U' F");
			    		 
			    		 moveU();
			    		 moveFP();
			    		 moveUP();
			    		 moveF();
			    		 moveUP();
			    		 moveFP();
			    		 moveUP();
			    		 moveF();
			    		 
			    	 }
			    	 
			    	 
			     }
			     break;
			     
			     //U'
			     case 13:
			     {
			    	 
		    		 
			    	 if(White[0][2].equals("Y")&&Red[0][2].equals("R")&&Blue[0][0].equals("G")&&White[1][0].equals("G")&&Orange[0][1].equals("R"))
			    	 //if(White[0][2].equals("Y")&&White[1][0].equals("B"))
			    	 {
			    			 
			    		 System.out.println(" U' ");
			    		 moveUP();
			    		 
			    		 System.out.println(" U' R U U R' U R U' R' ");
			    		 moveUP();
			    		 moveR();
			    		 moveU();
			    		 moveU();
			    		 moveRP();
			    		 moveU();
			    		 moveR();
			    		 moveUP();
			    		 moveRP();
			    		
			    		 
			    	 }
			    	 
			    	 if(White[0][2].equals("G")&&Red[0][2].equals("Y")&&Blue[0][0].equals("R")&&White[1][0].equals("G")&&Orange[0][1].equals("R"))
			    	 //if(White[0][2].equals("B")&&White[1][0].equals("B"))
			    	 {
			    		
			    		 System.out.println(" R U R' U U R U' R'   ");
			    		
			    		 moveR();
			    		 moveU();
			    		 moveRP();
			    		 moveU();
			    		 moveU();
			    		 moveR(); 
			    		 moveUP(); 
			    		 moveRP(); 
			    	 }
			    	 
			    	 if(White[0][2].equals("R")&&Red[0][2].equals("G")&&Blue[0][0].equals("Y")&&White[1][0].equals("G")&&Orange[0][1].equals("R"))
			    	 //if(White[0][2].equals("O")&&White[1][0].equals("B"))
			    	 {
			    		 
			    	
			    		 System.out.println(" U  R U R' ");
			    		
			    		 moveU();
			    		 moveR();
			    		 moveU();
			    		 moveRP();
			    		
			    	 }
			    	 
			    	 if(White[0][2].equals("Y")&&Red[0][2].equals("R")&&Blue[0][0].equals("G")&&White[1][0].equals("R")&&Orange[0][1].equals("G"))
			    	 //if(White[0][2].equals("Y")&&White[1][0].equals("O"))
			    	 {
			    		 
			    		 System.out.println(" U' ");
			    		 moveUP();
                       System.out.println("  F' U' F U' F' U F");
			    		 
			    		 moveFP();
			    		 moveUP();
			    		 moveF();
			    		 moveUP();
			    		 moveFP(); 
			    		 moveU();
			    		 moveF();
			    	 }
			    	 
			    	
			    	 if(White[0][2].equals("R")&&Red[0][2].equals("G")&&Blue[0][0].equals("Y")&&White[1][0].equals("R")&&Orange[0][1].equals("G"))
			    	// if(White[0][2].equals("O")&&White[1][0].equals("O"))
			    	 {
			    		
			    		 System.out.println(" U' ");
			    		 moveUP();
			    		 System.out.println(" U' F' U U F U U F' U' F");
			    		 
			    		 
				    		
			    		 moveUP();
			    		 moveFP();
			    		 moveU();
			    		 moveU();
			    		 moveF();
			    		 moveU();
			    		 moveU();
			    		 moveFP();
			    		 moveUP();
			    		 moveF();
			    	 }
			    	 
			    	 
			    	 
			    	 if(White[0][2].equals("G")&&Red[0][2].equals("Y")&&Blue[0][0].equals("R")&&White[1][0].equals("R")&&Orange[0][1].equals("G"))
			    	 //if(White[0][2].equals("B")&&White[1][0].equals("O"))
			    	 {
			    		 System.out.println(" U' ");
			    		 moveUP();
                       System.out.println("  U' F' U' F  U' F' U' F");
			    		 
			    		 moveUP();
			    		 moveFP();
			    		 moveUP();
			    		 moveF();
			    		 moveUP();
			    		 moveFP();
			    		 moveUP();
			    		 moveF();
			    		 
			    		
			    		
			    	 }
			    	 
			    	 
			     }
			     break;
			     
			     
			     
			     case 3:
			     {
			    	 
			    	 if(White[0][0].equals("Y")&&Blue[0][2].equals("R")&&Orange[0][0].equals("G")&&White[1][0].equals("G")&&Orange[0][1].equals("R"))
			    	// if(White[0][0].equals("Y")&&White[1][0].equals("B"))
			    	 {
			    		
			    		 System.out.println(" U U  R U U R' U' R U R' ");
			    		 moveU();
			    		 moveU();
			    		 moveR();
			    		 moveU();
			    		 moveU();
			    		 moveRP();
			    		 moveUP();
			    		 moveR();
			    		 moveU();
			    		 moveRP();
			    		
			    		
			    		 
			    	 }
			    	 if(White[0][0].equals("G")&&Blue[0][2].equals("Y")&&Orange[0][0].equals("R")&&White[1][0].equals("G")&&Orange[0][1].equals("R"))
			    	 //if(White[0][0].equals("B")&&White[1][0].equals("B"))
			    	 {
			    		 
			    		 
			    		 System.out.println(" U' R U' R' ");
			    		 moveUP();
			    		 moveL();
			    		 moveUP();
			    		 moveLP();
			    		 
			    	 }
			    	 
			    	 if(White[0][0].equals("R")&&Blue[0][2].equals("G")&&Orange[0][0].equals("Y")&&White[1][0].equals("G")&&Orange[0][1].equals("R"))
			    	// if(White[0][0].equals("O")&&White[1][0].equals("B"))
			    	 {
			    		 
			    		 System.out.println(" U  R U' R' U R' U R");
			    		 moveU();
			    		 moveR();
			    		 moveUP();
			    		 moveRP();
			    		 moveU();
			    		 moveRP();
			    		 moveU();
			    		 moveR();
			    		
			    	 }
			    	 
			    	 if(White[0][0].equals("Y")&&Blue[0][2].equals("R")&&Orange[0][0].equals("G")&&White[1][0].equals("R")&&Orange[0][1].equals("G"))
			    	 //if(White[0][0].equals("Y")&&White[1][0].equals("O"))
			    	 {
			    		 
			    		 System.out.println(" U U  F' U' F U U F' U' F U F' U' F");
			    		 moveU();
			    		 moveU();
			    		 moveFP();
			    		 moveUP();
			    		 moveF();
			    		 moveU();
			    		 moveU();
			    		 moveFP();
			    		 moveUP(); 
			    		 moveF();
			    		 moveU();
			    		 moveFP();
			    		 moveUP();
			    		 moveF();
			    		
			    	 }
			    	 
			    	
			    	 if(White[0][0].equals("R")&&Blue[0][2].equals("G")&&Orange[0][0].equals("Y")&&White[1][0].equals("R")&&Orange[0][1].equals("G"))
			    	 //if(White[0][0].equals("O")&&White[1][0].equals("O"))
			    	 {
			    		 
			    		 System.out.println("  U U R U' R' U U F' U' F");
			    		 
			    		 moveU();
			    		 moveU();
			    		
			    		 moveR();
			    		 moveUP();
			    		 moveRP();
			    		 moveU();
			    		 moveU();
			    		 moveFP();
			    		 moveUP();
			    		 moveF();
			    		 
			    		
			    	 }
			    	 
			    	 
			    	 
			    	 if(White[0][0].equals("G")&&Blue[0][2].equals("Y")&&Orange[0][0].equals("R")&&White[1][0].equals("R")&&Orange[0][1].equals("G"))
			    	 //if(White[0][0].equals("B")&&White[1][0].equals("O"))
			    	 {
			    		
			    		 System.out.println(" U  R U U R' U  F' U' F");
			    		 
			    		 moveU();
			    		 moveR();
			    		 moveU();
			    		 moveU();
			    		 moveRP();
			    		 moveU();
			    		 moveFP();
			    		 moveUP();
			    		 moveF();
			    		
			    		
			    	 }
			    	 
			    	 
			     }
			     break;
			     
			     
			     
			     //REMAINING
			     case 10:
			     {
			    	
			    	 if(White[0][2].equals("Y")&&Red[0][2].equals("R")&&Blue[0][0].equals("G")&&White[0][1].equals("G")&&Blue[0][1].equals("R"))
			    	// if(White[0][2].equals("Y")&&White[0][1].equals("B"))
			    	 {
			    		 	 
				    	 System.out.println("  U  R U U R' U' R U R' ");
			    		
			    		 moveU();
			    		 moveR();
			    		 moveU();
			    		 moveU();
			    		 moveRP();
			    		 moveUP();
			    		 moveR();
			    		 moveU();
			    		 moveRP();
			    		 
			    		
			    		
			    		 
			    	 }
			    	 if(White[0][2].equals("G")&&Red[0][2].equals("Y")&&Blue[0][0].equals("R")&&White[0][1].equals("G")&&Blue[0][1].equals("R"))
			    	 //if(White[0][2].equals("B")&&White[0][1].equals("B"))
			    	 {
			    		 
			    		 System.out.println("U'");
				    	 moveUP();	
				    	 System.out.println(" U' R U' R' ");
			    		 moveUP();
			    		 moveL();
			    		 moveUP();
			    		 moveLP();
			    		 
			    	 }
			    	 
			    	 if(White[0][2].equals("R")&&Red[0][2].equals("G")&&Blue[0][0].equals("Y")&&White[0][1].equals("G")&&Blue[0][1].equals("R"))
			    	// if(White[0][2].equals("O")&&White[0][1].equals("B"))
			    	 {
			    			 
				    	 System.out.println("  R U' R' U R' U R");
			    		
			    		 moveR();
			    		 moveUP();
			    		 moveRP();
			    		 moveU();
			    		 moveRP();
			    		 moveU();
			    		 moveR();
			    		
			    		
			    	 }
			    	 
			    	 if(White[0][2].equals("Y")&&Red[0][2].equals("R")&&Blue[0][0].equals("G")&&White[0][1].equals("R")&&Blue[0][1].equals("G"))
			    	// if(White[0][2].equals("Y")&&White[0][1].equals("O"))
			    	 {
			    		
				    	 System.out.println(" U   F' U' F U U F' U' F U F' U' F");
			    	
			    		 moveU();
			    		 moveFP();
			    		 moveUP();
			    		 moveF();
			    		 moveU();
			    		 moveU();
			    		 moveFP();
			    		 moveUP(); 
			    		 moveF();
			    		 moveU();
			    		 moveFP();
			    		 moveUP();
			    		 moveF();
			    		
			    		
			    	 }
			    	 
			    	
			    	 if(White[0][2].equals("R")&&Red[0][2].equals("G")&&Blue[0][0].equals("Y")&&White[0][1].equals("R")&&Blue[0][1].equals("G"))
			    	// if(White[0][2].equals("O")&&White[0][1].equals("O"))
			    	 {
			    		
                           System.out.println("  U  R U' R' U U F' U' F");
			    		 
			    		
			    		 moveU();
			    		
			    		 moveR();
			    		 moveUP();
			    		 moveRP();
			    		 moveU();
			    		 moveU();
			    		 moveFP();
			    		 moveUP();
			    		 moveF();
			    		
			    		 
			    		 
			    		
			    		
			    		 
			    		
			    	 }
			    	 
			    	 
			    	 
			    	 if(White[0][2].equals("G")&&Red[0][2].equals("Y")&&Blue[0][0].equals("R")&&White[0][1].equals("R")&&Blue[0][1].equals("G"))
			    	// if(White[0][2].equals("B")&&White[0][1].equals("O"))
			    	 {
			    		 
                      System.out.println("   R U U R' U  F' U' F");
			    		 
			    		 
			    		 moveR();
			    		 moveU();
			    		 moveU();
			    		 moveRP();
			    		 moveU();
			    		 moveFP();
			    		 moveUP();
			    		 moveF();
			    		
			    		
			    	 }
			    	 
			    	 
			     }
			     break;
			     
			     
			     
			     case 21:
			     {
			    	 
			    	 if(White[2][2].equals("Y")&&Green[0][2].equals("R")&&Red[0][0].equals("G")&&White[1][2].equals("G")&&Red[0][1].equals("R"))
			    	// if(White[2][2].equals("Y")&&White[1][2].equals("B"))
			    	 {
			    		
				    	 System.out.println("  R U U R' U' R U R' ");
			    	
			    		 moveR();
			    		 moveU();
			    		 moveU();
			    		 moveRP();
			    		 moveUP();
			    		 moveR();
			    		 moveU();
			    		 moveRP();
			    		
			    		
			    		
			    		 
			    	 }
			    	 if(White[2][2].equals("G")&&Green[0][2].equals("Y")&&Red[0][0].equals("R")&&White[1][2].equals("G")&&Red[0][1].equals("R"))
			    	 //if(White[2][2].equals("B")&&White[1][2].equals("B"))
			    	 {
			    		
				    	 System.out.println(" U R U' R' ");
			    		 moveU();
			    		 moveL();
			    		 moveUP();
			    		 moveLP();
			    		
			    		 
			    	 }
			    	 
			    	 if(White[2][2].equals("R")&&Green[0][2].equals("G")&&Red[0][0].equals("Y")&&White[1][2].equals("G")&&Red[0][1].equals("R"))
			    	 //if(White[2][2].equals("O")&&White[1][2].equals("B"))
			    	 {
			    		 
			    		
				    	 System.out.println(" U'  R U' R' U R' U R");
			    		 moveUP();
			    		 moveR();
			    		 moveUP();
			    		 moveRP();
			    		 moveU();
			    		 moveRP();
			    		 moveU();
			    		 moveR();
			    		
			    	 }
			    	 
			    	 if(White[2][2].equals("Y")&&Green[0][2].equals("R")&&Red[0][0].equals("G")&&White[1][2].equals("R")&&Red[0][1].equals("G"))
			    	 //if(White[2][2].equals("Y")&&White[1][2].equals("O"))
			    	 {
			    		
				    	 System.out.println(" F' U' F U U F' U' F U F' U' F");
			    		 moveU();
			    		 moveU();
			    		 moveFP();
			    		 moveUP();
			    		 moveF();
			    		 moveU();
			    		 moveU();
			    		 moveFP();
			    		 moveUP(); 
			    		 moveF();
			    		 moveU();
			    		 moveFP();
			    		 moveUP();
			    		 moveF();
			    		
			    		
			    	 }
			    	 
			    	
			    	 if(White[2][2].equals("R")&&Green[0][2].equals("G")&&Red[0][0].equals("Y")&&White[1][2].equals("R")&&Red[0][1].equals("G"))
			    	// if(White[2][2].equals("O")&&White[1][2].equals("O"))
			    	 {
			    		
				    	 
			    		 System.out.println("  R U' R' U U F' U' F");
			    		 
			    		
			    		
			    		 moveR();
			    		 moveUP();
			    		 moveRP();
			    		 moveU();
			    		 moveU();
			    		 moveFP();
			    		 moveUP();
			    		 moveF();
			    		
			    		 
			    		 
			    		
			    		
			    		 
			    		
			    	 }
			    	 
			    	 
			    	 
			    	 if(White[2][2].equals("G")&&Green[0][2].equals("Y")&&Red[0][0].equals("R")&&White[1][2].equals("R")&&Red[0][1].equals("G"))
			    	 //if(White[2][2].equals("B")&&White[1][2].equals("O"))
			    	 {
			    		
			    		
                         System.out.println(" U'  R U U R' U  F' U' F");
			    		 
			    		 moveUP();
			    		 moveR();
			    		 moveU();
			    		 moveU();
			    		 moveRP();
			    		 moveU();
			    		 moveFP();
			    		 moveUP();
			    		 moveF();
			    		
			    		
			    	 }
			    	 
			    	 
			     }
			     break;
			     
			     
			     
			     case 32:
			     {
			    	 
			    	 
			    	 if(White[2][0].equals("Y")&&Orange[0][2].equals("R")&&Green[0][0].equals("G")&&White[2][1].equals("G")&&Green[0][1].equals("R"))
			    	// if(White[2][0].equals("Y")&&White[2][1].equals("B"))
			    	 {
			    		
				    	 System.out.println(" U' R U U R' U' R U R' ");
			    		
			    		 moveUP();
			    		 moveR();
			    		 moveU();
			    		 moveU();
			    		 moveRP();
			    		 moveUP();
			    		 moveR();
			    		 moveU();
			    		 moveRP();
			    		
			    		
			    		
			    		 
			    	 }
			    	 if(White[2][0].equals("G")&&Orange[0][2].equals("Y")&&Green[0][0].equals("R")&&White[2][1].equals("G")&&Green[0][1].equals("R"))
			    	 //if(White[2][0].equals("B")&&White[2][1].equals("B"))
			    	 {
			    		 
			    		
				    	 System.out.println("  R U' R' ");
			    		 moveUP();
			    		 moveL();
			    		 moveUP();
			    		 moveLP();
			    		
			    		 
			    	 }
			    	 
			    	 if(White[2][0].equals("R")&&Orange[0][2].equals("G")&&Green[0][0].equals("Y")&&White[2][1].equals("G")&&Green[0][1].equals("R"))
			    	 //if(White[2][0].equals("O")&&White[2][1].equals("B"))
			    	 {
			    		 System.out.println("U");
				    	 moveU();
				    	 System.out.println(" U  R U' R' U R' U R");
			    		 moveU();
			    		 moveR();
			    		 moveUP();
			    		 moveRP();
			    		 moveU();
			    		 moveRP();
			    		 moveU();
			    		 moveR();
			    		
			    		
			    		
			    	 }
			    	 
			    	 if(White[2][0].equals("Y")&&Orange[0][2].equals("R")&&Green[0][0].equals("G")&&White[2][1].equals("R")&&Green[0][1].equals("G"))
			    	 //if(White[2][0].equals("Y")&&White[2][1].equals("O"))
			    	 {
			    			
				    	 System.out.println(" U'  F' U' F U U F' U' F U F' U' F");
			    		
			    		 moveUP();
			    		 moveFP();
			    		 moveUP();
			    		 moveF();
			    		 moveU();
			    		 moveU();
			    		 moveFP();
			    		 moveUP(); 
			    		 moveF();
			    		 moveU();
			    		 moveFP();
			    		 moveUP();
			    		 moveF();
			    		
			    		
			    	 }
			    	 
			    	
			    	 if(White[2][0].equals("R")&&Orange[0][2].equals("G")&&Green[0][0].equals("Y")&&White[2][1].equals("R")&&Green[0][1].equals("G"))
			    	// if(White[2][0].equals("O")&&White[2][1].equals("O"))
			    	 {
			    		
                        System.out.println("  U' R U' R' U U F' U' F");
			    		 
			    		
			    		 moveUP();
			    		
			    		 moveR();
			    		 moveUP();
			    		 moveRP();
			    		 moveU();
			    		 moveU();
			    		 moveFP();
			    		 moveUP();
			    		 moveF();
			    		
			    		 
			    		
			    		
			    		 
			    		
			    	 }
			    	 
			    	 
			    	 
			    	 if(White[2][0].equals("G")&&Orange[0][2].equals("Y")&&Green[0][0].equals("R")&&White[2][1].equals("R")&&Green[0][1].equals("G"))
			    	 //if(White[2][0].equals("B")&&White[2][1].equals("O"))
			    	 {
			    		 System.out.println("U");
				    	 moveU();	
                       System.out.println(" U  R U U R' U  F' U' F");
			    		 
			    		 moveU();
			    		 moveR();
			    		 moveU();
			    		 moveU();
			    		 moveRP();
			    		 moveU();
			    		 moveFP();
			    		 moveUP();
			    		 moveF();
			    		
			    		
			    	 }
			    	 
			    	 
			     }
			     break;
			     
     }
     
      
     
     
	 
}







public static void solvecrossRY()
{
	 System.out.println("the edges are  ");
	 int m=0;
	  while( m<12)
	  {
		  
		  //System.out.print(ed[0][m] +",");
		  edges=ed[0][m];
		  
		 // System.out.println(edges);
		  
		  if(ed[0][m].equals("YR")|| ed[0][m].equals("RY"))
		  {
			   ed1= ed[0][m];
			 
			   
			   
			   //System.out.print("the edge found at loc" +m +"is "+ed1);
			   
			      crossedges=ed1;
				  System.out.println(crossedges);
				  
				  crosspos=m;
				  System.out.println(crosspos);
				  
				if(ed[0][m].equals("RY"))  
				{
					  
					  switch(crosspos)
					  {
					  
					  
								  case 0:
								  {
									  System.out.println("B' R B");
									moveBP();
									moveR();
									moveB();
								  }
					              break;
					              
								  case 1:
								  {  
									  System.out.println("U F R' F' ");
									moveU();
									moveF();
									moveRP();
									moveFP();
								  }
								  
								  break;
								  
								  
								  case 2:
									  
								  {
									  System.out.println("F R' F'");
									  moveF();
									  moveRP();
									  moveFP();
								  }
								  
								  break;
								  
								  case 3:
									  
								  {
									  System.out.println("U' F R' F'");
									  moveUP();
									  moveF();
									  moveRP();
									  moveFP();
									  
								  }
								  break;
								  case 4:
								  {
									  System.out.println("F' R' F");
									  moveFP();
									  moveRP();
									  moveF();
							 
								  }
								  break;
								  
								  
								  case 5:
								  {
									  System.out.println("D' F' D R'");
									  moveDP();
									  moveFP();
									  moveD();
									  moveRP();
								  }
								  break;
								  
								  case 6:
								  {  
									  System.out.println("B R B'");
									  moveB();
									  moveR();
									  moveBP();
								  }
								  break;
								  
								  case 7:
								  {
									  System.out.println("L L U B' R B"); 
									moveL();
									moveL();
									moveU();
									moveBP();
									moveR();
									moveB();
									
								  }
								  break;
								  
								  case 8:
									  
								  {
									  System.out.println("F U' F' R R ");
									  moveF();
									  moveUP();
									  moveFP();
									  moveR();
									  moveR();
									  
								  }
								  break;
								  
								  
								  case 9:
								  {
									  System.out.println("F' U' F R R ");
									  moveFP();
									  moveUP();
									  moveF();
									  moveR();
									  moveR();
									  
									  
								  }
								  
								  break;
								  
								  case 10:
								  {
									  System.out.println("B U B' R R ");
									  
									  moveB();
									  moveU();
									  moveBP();
									  moveR();
									  moveR();
									  
								  }
								  
								  break;
								  
								  case 11:
								  {
									  System.out.println("B' U B R R ");
									  moveBP();
									  moveU();
									  moveB();
									  moveR();
									  moveR();
									  
									
								  }
								  
								  break;
					  }
					  
				  }
				  
				  
		  
		  else
			  
		  {
					  switch(crosspos)
					  {
					  
					  
								  case 0:
								  {
									  System.out.println("U  R R");
									moveU();
									moveR();
									moveR();
								  }
					              break;
					              
								  case 1:
								  {  
									  System.out.println(" R R");
									moveR();
									moveR();
								  }
								  
								  break;
								  
								  
								  case 2:
									  
								  {
									  System.out.println("U'  R R");
									  moveUP();
									  moveR();
									  moveR();
									 
								  }
								  
								  break;
								  
								  case 3:
									  
								  {
									  System.out.println("U  U R R");
									  moveU();
									  moveU();
									  moveR();
									  moveR();
									  
								  }
								  break;
								  case 4:
								  {
									  System.out.println(" F F U'  R R");
									  moveF();
									  
									  moveF();
									  moveUP();
									  moveR();
									  moveR();
							 
								  }
								  break;
								  
								  
								  case 5:
								  {
									  
									 
								  }
								  break;
								  
								  case 6:
								  {  
									  System.out.println("B B U   R R");
									  moveB();
									  moveB();
									  moveU();
									  moveR();
									  moveR();
								  }
								  break;
								  
								  case 7:
								  {
									  System.out.println("L L U U  R R");
									moveL();
									moveL();
									moveU();
									moveU();
									moveR();
									moveR();
									
								  }
								  break;
								  
								  case 8:
									  
								  {
									  System.out.println("F F R'  F F");
									  moveF();
									  moveF();
									  moveRP();
									  moveF();
									  moveF();
									  
									  
								  }
								  break;
								  
								  
								  case 9:
								  {
									  
									  System.out.println("R'");
									  moveRP();
									  
									  
								  }
								  
								  break;
								  
								  case 10:
								  {
									  
									  
									  System.out.println(" R");
									  moveR();
									  
								  }
								  
								  break;
								  
								  case 11:
								  {
									  System.out.println("B B R  B B");
									  moveB();
									  moveB();
									  moveR();
									  moveB();
									  moveB();
									  
									
								  }
								  
								  break;
					  }
					  
				  }
				  
				  
				  
				  
		
		  
		  
		  }
		  
		  m++;
		   
		
	  }
	  
	
	  
	
}



public static void solvecrossBY()
{
	 System.out.println("the edges are  ");
	 int m=0;
	  while( m<12)
	  {
		  
		  //System.out.print(ed[0][m] +",");
		  edges2=ed[0][m];
		  
		 // System.out.println(edges);
		  
		  if(ed[0][m].equals("YB")|| ed[0][m].equals("BY"))
		  {
			   ed2= ed[0][m];
			 
			   
			   
			   //System.out.print("the edge found at loc" +m +"is "+ed1);
			   
			      crossedges2=ed2;
				  System.out.println(crossedges2);
				  
				  crosspos2=m;
				  System.out.println(crosspos2);
				  
				if(ed[0][m].equals("BY"))  
				{
					  
					  switch(crosspos2)
					  {
					  
					  
								  case 0:
								  {
									  System.out.println("U R B' R'");
									moveU();
									moveR();
									moveBP();
									moveRP();
								  }
					              break;
					              
								  case 1:
								  {  
									  System.out.println(" R B' R'");
										
										moveR();
										moveBP();
										moveRP();
								  }
								  
								  break;
								  
								  
								  case 2:
									  
								  {
									  System.out.println("U' R B' R'");
										moveUP();
										moveR();
										moveBP();
										moveRP();
								  }
								  
								  break;
								  
								  case 3:
									  
								  {
									  System.out.println("U U R B' R'");
									    moveU();
									    moveU();
										moveR();
										moveBP();
										moveRP();
									  
								  }
								  break;
								  case 4:
								  {
									  System.out.println(" F F U' R B' R'");
										
									    moveF();
									    moveF();
									    moveUP();
										moveR();
										moveBP();
										moveRP();
							 
								  }
								  break;
								  
								  
								  case 5:
								  {
									  
									  System.out.println(" R' B' ");
										
									  
										moveRP();
										moveBP();
									
								  }
								  break;
								  
								  case 6:
								  {  
									  System.out.println("B B U R B' R'");
										
									  
									    moveB();
									    moveB();
									    moveU();
										moveR();
										moveBP();
										moveRP();
								  }
								  break;
								  
								  case 7:
								  {
									  System.out.println("L L U U R B' R'");
										
									    moveL();
									    moveL();
									    moveU();
									    moveU();
									    moveR();
										
								        moveBP();
										moveRP();
									
								  }
								  break;
								  
								  case 8:
									  
								  {
									  System.out.println("F U U F' B B ");
									  moveF();
									  moveU();
									  moveU();
									  moveFP();
									  moveB();
									  moveB();
									  
								  }
								  break;
								  
								  
								  case 9:
								  {
									  System.out.println("F' U U F B B ");
									  moveFP();
									  moveU();
									  moveU();
									  moveF();
									  moveB();
									  moveB();
									  
								  }
								  
								  break;
								  
								  case 10:
								  {
									  System.out.println("B'");
									  
									  moveBP();
									 
									  
								  }
								  
								  break;
								  
								  case 11:
								  {
									  System.out.println("B");
									  moveB();
									  
									
								  }
								  
								  break;
					  }
					  
				  }
				  
				  
		  
		  else
			  
		  {
					  switch(crosspos2)
					  {
					  
					  
								  case 0:
								  {
									  System.out.println("B B");
									moveB();
									moveB();
									
								  }
					              break;
					              
								  case 1:
								  {  
									  System.out.println(" U' B B");
									  moveUP();
									  moveB();
									  moveB();
								  }
								  
								  break;
								  
								  
								  case 2:
									  
								  {
									  System.out.println(" U U  B B");
									  moveU();
									  moveU();
									  moveB();
									  moveB();
									 
								  }
								  
								  break;
								  
								  case 3:
									  
								  {
									  System.out.println("U  B B");
									  moveU();
									  moveB();
									  moveB();
									
									  
								  }
								  break;
								  case 4:
								  {
									  System.out.println("F F U U  B B");
									  moveF();
									  moveF();
									  moveU();
									  moveU();
									  moveB();
									  moveB();
								  }
								  break;
								  
								  
								  case 5:
								  {
									  System.out.println("R  R U'   B B");
									  moveR();
									  moveR();
									  moveUP();
									 
									  moveB();
									  moveB();
									 
								  }
								  break;
								  
								  case 6:
								  {  
									  
								  }
								  break;
								  
								  case 7:
								  {
									  
									  System.out.println("L  L U   B B");
									  moveL();
									  moveL();
									  moveU();
									 
									  moveB();
									  moveB();
									
								  }
								  break;
								  
								  case 8:
									  
								  {
									  System.out.println(" L' U L B B");
									  moveLP();
									  
									  moveU();
									  moveL();
									  moveB();
									  moveB();
									  
									  
								  }
								  break;
								  
								  
								  case 9:
								  {
									  
									  System.out.println("R U' R' B B");
									  moveR();
									  moveUP();
									  moveRP();
									  moveB();
									  moveB();
									  
									  
								  }
								  
								  break;
								  
								  case 10:
								  {
									  
									  System.out.println("R' U' R  B B");
									  moveRP();
									  moveUP();
									  moveR();
									  moveB();
									  moveB(); 

									  
								  }
								  
								  break;
								  
								  case 11:
								  {
									 
									  System.out.println("L U L'  B B");
									  moveL();
									  moveU();
									  moveLP();
									  moveB();
									  moveB(); 
									
								  }
								  
								  break;
					  }
					  
				  }
				  
				  
				  
				  
		
		  
		  
		  }
		  
		  m++;
		   
		
	  }
	  
	
	  
	
}







public static void solvecrossOY()
{
	 System.out.println("the edges are  ");
	 int m=0;
	  while( m<12)
	  {
		  
		  //System.out.print(ed[0][m] +",");
		  edges3=ed[0][m];
		  
		 // System.out.println(edges);
		  
		  if(ed[0][m].equals("YO")|| ed[0][m].equals("OY"))
		  {
			   ed3= ed[0][m];
			 
			   
			   
			   //System.out.print("the edge found at loc" +m +"is "+ed1);
			   
			      crossedges3=ed3;
				  System.out.println(crossedges3);
				  
				  crosspos3=m;
				  System.out.println(crosspos3);
				  
				if(ed[0][m].equals("OY"))  
				{
					  
					  switch(crosspos3)
					  {
					  
					  
								  case 0:
								  {
									  System.out.println("B L' B'");
									moveB();
									moveLP();
									moveBP();
									
								  }
					              break;
					              
								  case 1:
								  {  
									  
									  System.out.println(" U' B L' B'");
										
									  moveUP();
									    moveB();
										moveLP();
										moveBP();
										
								  }
								  
								  break;
								  
								  
								  case 2:
									  
								  {
									  
									  System.out.println(" U U B L' B'");
										
									   moveU();
									   moveU();
									    moveB();
										moveLP();
										moveBP();
									  
								  }
								  
								  break;
								  
								  case 3:
									  
								  {
									  System.out.println(" U  B L' B'");
										
									 
									   moveU();
									    moveB();
										moveLP();
										moveBP();
									  
								  }
								  break;
								  case 4:
								  {
									  
									  System.out.println(" F L");
										
									   moveF();
									   moveL();
									  
							 
								  }
								  break;
								  
								  
								  case 5:
								  {
									  
									  System.out.println(" R R U' B L' B'");
										
									    moveR();
								     	moveR();
									    moveUP();
										moveB();
										moveLP();
										moveBP();
									
								  }
								  break;
								  
								  case 6:
								  {  
									  System.out.println("B' L' ");
										
									    moveBP();
									    moveLP();
									
								  }
								  break;
								  
								  case 7:
								  {
									  System.out.println(" L L U B L' B'");
										
									    moveL();
								     	moveL();
									    moveU();
										moveB();
										moveLP();
										moveBP();
									
									
								  }
								  break;
								  
								  case 8:
									  
								  {
									  System.out.println(" F U F'  L L ");
										
									    moveF();
								     	moveU();
									    moveFP();
										moveL();
										moveL();
										
								  }
								  break;
								  
								  
								  case 9:
								  {
									  System.out.println("F' U F L L ");
									  moveFP();
									  moveU();
									  moveF();
									  moveL();
									  moveL();
									  
									  
								  }
								  
								  break;
								  
								  case 10:
								  {
									 
									  System.out.println("B U'  B'  L L ");
									  moveB();
									  moveUP();
									  moveBP();
									  moveL();
									  moveL();
									  
								  }
								  
								  break;
								  
								  case 11:
								  {
									  
									  System.out.println("B' U'  B L L ");
									  moveBP();
									  moveUP();
									  moveB();
									  moveL();
									  moveL();
									
								  }
								  
								  break;
					  }
					  
				  }
				  
				  
		  
		  else
			  
		  {
					  switch(crosspos3)
					  {
					  
					  
								  case 0:
								  {
									  System.out.println("U' L L");
									moveUP();
									moveL();
									moveL();
									
								  }
					              break;
					              
								  case 1:
								  {  
									  System.out.println(" U U L L");
									  moveU();
									  moveU();
									  moveL();
									  moveL();
								  }
								  
								  break;
								  
								  
								  case 2:
									  
								  {
									  System.out.println("  U  L L");
									  
									  moveU();
									  moveL();
									  moveL();
									 
								  }
								  
								  break;
								  
								  case 3:
									  
								  {
									  System.out.println("L L ");
									  
									  moveL();
									  moveL();
									
									  
								  }
								  break;
								  case 4:
								  {
									  System.out.println("F F U   L L");
									  moveF();
									  moveF();
									  moveU();
									 
									  moveL();
									  moveL();
								  }
								  break;
								  
								  
								  case 5:
								  {
									  System.out.println("R  R U U    L L");
									  moveR();
									  moveR();
									  moveU();
									 
									  moveU();
									  moveL();
									  moveL();
									 
								  }
								  break;
								  
								  case 6:
								  {  
									  System.out.println("B  B U'   L L");
									  moveB();
									  moveB();
									  moveUP();
									 
									  moveL();
									  moveL();
								  }
								  break;
								  
								  case 7:
								  {
									  
									
									
								  }
								  break;
								  
								  case 8:
									  
								  {
									  System.out.println(" L");
									
									  moveL();
									
									  
									  
								  }
								  break;
								  
								  
								  case 9:
								  {
									  
									  System.out.println("R U U  R' L L");
									  moveR();
									  moveU();
									  moveU();
									  moveRP();
									  moveL();
									  moveL();
									  
								  }
								  
								  break;
								  
								  case 10:
								  {
									  
									 
									  System.out.println("R' U U  R L L");
									  moveRP();
									  moveU();
									  moveU();
									  moveR();
									  moveL();
									  moveL();
									  
									  
								  }
								  
								  break;
								  
								  case 11:
								  {
									 
									  System.out.println("L'");
									 
									  moveLP();
									  
									
								  }
								  
								  break;
					  }
					  
				  }
				  
				  
				  
				  
		
		  
		  
		  }
		  
		  m++;
		   
		
	  }
	  
	
	  
	
}



public static void solvecrossGY()
{
	 System.out.println("the edges are  ");
	 int m=0;
	  while( m<12)
	  {
		  
		  //System.out.print(ed[0][m] +",");
		  edges4=ed[0][m];
		  
		 // System.out.println(edges);
		  
		  if(ed[0][m].equals("YG")|| ed[0][m].equals("GY"))
		  {
			   ed4= ed[0][m];
			 
			   
			   
			   //System.out.print("the edge found at loc" +m +"is "+ed1);
			   
			      crossedges4=ed4;
				  System.out.println(crossedges4);
				  
				  crosspos4=m;
				  System.out.println(crosspos4);
				  
				if(ed[0][m].equals("GY"))  
				{
					  
					  switch(crosspos4)
					  {
					  
					  
								  case 0:
								  {
									  System.out.println("U R' F R");
									moveU();
									moveRP();
									moveF();
									moveR();
									
								  }
					              break;
					              
								  case 1:
								  {  
									  
									  System.out.println(" R' F R");
										
										moveRP();
										moveF();
										moveR();
										
								  }
								  
								  break;
								  
								  
								  case 2:
									  
								  {
									  
									  System.out.println("U' R' F R");
										moveUP();
										moveRP();
										moveF();
										moveR();
									  
								  }
								  
								  break;
								  
								  case 3:
									  
								  {
									  System.out.println(" L F' L'");
										
									 
									    moveL();
									    moveFP();
										moveLP();
										
									  
								  }
								  break;
								  case 4:
								  {
									  
									  System.out.println(" F F U' R' F R ");
										
									  moveF();
									  moveF();
									  moveUP();
									  moveRP();
									  moveF();
									  moveR();
									  
									  
							 
								  }
								  break;
								  
								  
								  case 5:
								  {
									  
									  System.out.println(" R  F");
										
									    moveR();
								     	moveF();
									   
										
									
								  }
								  break;
								  
								  case 6:
								  {  
									  System.out.println("B B U' R' F R ");
										
									    moveB();
									    moveB();
									    moveUP();
									    moveRP();
									    moveF();
									    moveR();
									
								  }
								  break;
								  
								  case 7:
								  {
									  System.out.println(" L' F' ");
										
									    moveLP();
								     	moveFP();
									   
									
									
								  }
								  break;
								  
								  case 8:
									  
								  {
									  System.out.println(" F'  ");
										
									   
									    moveFP();
										
										
								  }
								  break;
								  
								  
								  case 9:
								  {
									  System.out.println("F ");
									
									  moveF();
									
									  
									  
								  }
								  
								  break;
								  
								  case 10:
								  {
									 
									  System.out.println("R R F R R ");
									  moveR();
									  moveR();
									  moveF();
									  moveR();
									  moveR();
									  
								  }
								  
								  break;
								  
								  case 11:
								  {
									  
									  System.out.println("LL   F' L L ");
									  moveL();
									  moveL();
									  moveFP();
									  moveL();
									  moveL();
									
								  }
								  
								  break;
					  }
					  
				  }
				  
				  
		  
		  else
			  
		  {
					  switch(crosspos4)
					  {
					  
					  
								  case 0:
								  {
									  System.out.println("U U F F ");
									moveU();
									moveU();
									moveF();
									moveF();
									
								  }
					              break;
					              
								  case 1:
								  {  
									  System.out.println(" U  F F");
									 
									  moveU();
									  moveF();
									  moveF();
								  }
								  
								  break;
								  
								  
								  case 2:
									  
								  {
									  System.out.println("  F F ");
									  
									  
									  moveF();
									  moveF();
									 
								  }
								  
								  break;
								  
								  case 3:
									  
								  {
									  System.out.println(" U' F F ");
									  
									  moveUP();
									  moveF();
									  moveF();
									
									  
								  }
								  break;
								  case 4:
								  {
									  
								  }
								  break;
								  
								  
								  case 5:
								  {
									  System.out.println("R  R U  F F");
									  moveR();
									  moveR();
									  moveU();
									 
									 
									  moveF();
									  moveF();
									  
									 
								  }
								  break;
								  
								  case 6:
								  {  
									  System.out.println("B  B U U   F  F ");
									  moveB();
									  moveB();
									  moveU();
									  moveU();
									 
									  moveF();
									  moveF();
								  }
								  break;
								  
								  case 7:
								  {
									  
									  System.out.println("L L  U'   F  F ");
									  moveL();
									  moveL();
									  moveUP();
									 
									  moveF();
									  moveF();
									
								  }
								  break;
								  
								  case 8:
									  
								  {
									  System.out.println(" L' U' L F F ");
									
									  moveLP();
									  moveUP();
									  moveL();
									  moveF();
									  moveF();
									  
									
									  
									  
								  }
								  break;
								  
								  
								  case 9:
								  {
									  
									  System.out.println("R U R'  F F");
									  moveR();
									  moveU();
									  moveRP();
									  moveF();
									  moveF();
									 
									  
								  }
								  
								  break;
								  
								  case 10:
								  {
									  
									 
									  System.out.println("R' U   R F F");
									  moveRP();
									  moveU();
									  moveR();
									  moveF();
									  moveF();
									  
									  
									  
								  }
								  
								  break;
								  
								  case 11:
								  {
									 
									  System.out.println("L U' L' F F");
									 
									  moveL();
									  moveUP();
									  moveLP();
									  moveF();
									  moveF();
									  
									
								  }
								  
								  break;
					  }
					  
				  }
				  
				  
				  
				  
		
		  
		  
		  }
		  
		  m++;
		   
		
	  }
	  
	
	  
	
}




public static void FindCorners()
{
	
	
	String [][] PosCor;
	
	 PosCor = new String [1][3];
	 cor= new String[1][8];
	 
	 
	 PosCor[0][0] = White[0][0];
	 PosCor[0][1] = Blue[0][2];
	 PosCor[0][2] = Orange[0][0];
	
	 
	 cor[0][n]=  (PosCor[0][0] +  PosCor[0][1]+ PosCor[0][2]  );
	  
	     PosCor[0][0] = White[0][2];
		 PosCor[0][1] = Blue[0][0];
		 PosCor[0][2] = Red[0][2];		
		 n++;
		 
		 cor[0][n]=  (PosCor[0][0] +  PosCor[0][1] + PosCor[0][2] );
	  
	  
		 

	     PosCor[0][0] = White[2][2];
		 PosCor[0][1] = Green[0][2];
		 PosCor[0][2] = Red[0][0];		
		 n++;
		 
		 
		 
		 cor[0][n]=  (PosCor[0][0] +  PosCor[0][1] + PosCor[0][2] );
	   
								

	     PosCor[0][0] = White[2][0];
		 PosCor[0][1] = Green[0][0];
		 PosCor[0][2] = Orange[0][2];		
		 n++;
		 
		 
		 
		 cor[0][n]=  (PosCor[0][0] +  PosCor[0][1] + PosCor[0][2] );
		 
		 
		     PosCor[0][0] = Yellow[0][0];
			 PosCor[0][1] = Green[2][0];
			 PosCor[0][2] = Orange[2][2];		
			 n++;
			 
			 
			 
			 cor[0][n]=  (PosCor[0][0] +  PosCor[0][1] + PosCor[0][2] );
			 
		 
		 
			     PosCor[0][0] = Yellow[0][2];
				 PosCor[0][1] = Green[2][2];
				 PosCor[0][2] = Red[2][0];		
				 n++;
				 
				 
				 
				 cor[0][n]=  (PosCor[0][0] +  PosCor[0][1] + PosCor[0][2] );
				 
		 
				 
				    PosCor[0][0] = Yellow[2][2];
					 PosCor[0][1] = Blue[2][0];
					 PosCor[0][2] = Red[2][2];		
					 n++;
					 
					 
					 
					 cor[0][n]=  (PosCor[0][0] +  PosCor[0][1] + PosCor[0][2] );
					 
				 
					 
					     PosCor[0][0] = Yellow[2][0];
						 PosCor[0][1] = Blue[2][2];
						 PosCor[0][2] = Orange[2][0];		
						 n++;
						 
						 
						 
						 cor[0][n]=  (PosCor[0][0] +  PosCor[0][1] + PosCor[0][2] );
						 
		 
						  n=0;
									  
		/*				  
		  System.out.println("the corners are  ");
		  for(int m=0;m<8;m++)
		  {
			  
			  //System.out.print(ed[0][m] +",");
			  corners=cor[0][m];
			  
			  System.out.print(corners);
			  
		  }
		*/
	  
		 
	  
	
}




public static void solveOLL()
{
	int y=1;
	boolean flagOLL=false;
	 System.out.print(" reached here");
	
	 if(flagOLL==false)
	{		
	
	
	
	                
	        	 int m=0;
	        	 boolean flag=false;
	        	 int k=0;
	        	
	        		if(White[0][1].equals("W")&&White[1][0].equals("W")&&White[1][2].equals("W")&&White[2][1].equals("W"))
	        		{
	        			k=1;
	        			
	        		}
	        		
	        		
	        		 if((White[1][0].equals("W")&&White[1][2].equals("W"))&&(m==0)&&(k==0))
		        	  {
		        		  //flagOLL=true;
		        		  System.out.print(" F R U R' U' F' ");
		        		     
		        		     
		        		     moveF();
		        		     moveR();
		        		     moveU();
		        		     moveRP();
			        		 moveUP();
			        		 moveFP();	
			       		m=1;	
			       		flag=true;
			       			
		        		  
		        	  }
	        		 
	        		 
	        		 if(White[0][1].equals("W")&&White[2][1].equals("W")&&(m==0)&&(k==0))
		        	  {
		        		  //flagOLL=true;
		        		  System.out.print("U F R U R' U' F' ");
		        		     
		        		     moveU();
		        		     moveF();
		        		     moveR();
		        		     moveU();
		        		     moveRP();
			        		 moveUP();
			        		 moveFP();	
			       			
			       			m=1;
			       			flag=true;
		        		  
		        	  }
	        		 
	        		 
	        		 if(White[1][2].equals("W")&&White[2][1].equals("W")&&(m==0)&&(k==0))
		        	  {
		        		  //flagOLL=true;
		        		  System.out.print("B U L U' L' B' ");
		        		     
		        		     moveB();
		        		     moveU();
		        		     moveL();
		        		     moveUP();
		        		     moveLP();
			        		 moveBP();
			        			
			        		 m=1;	
			        		 flag=true;
			       			
		        		  
		        	  }
	        		 
	        		 if(White[1][0].equals("W")&&White[2][1].equals("W")&&(m==0)&&(k==0))
		        	  {
		        		  //flagOLL=true;
		        		  System.out.print(" U' B U L U' L' B' ");
		        		     
		        		     moveUP();
		        		     moveB();
		        		     moveU();
		        		     moveL();
		        		     moveUP();
		        		     moveLP();
			        		 moveBP();
			        			
			        		 m=1;
			        		 flag=true;
			       			
		        		  
		        	  }
	        		 
	        		 
	        		 if(White[0][1].equals("W")&&White[1][2].equals("W")&&(m==0)&&(k==0))
		        	  {
		        		  //flagOLL=true;
		        		  System.out.print(" U B U L U' L' B' ");
		        		     
		        		     moveU();
		        		     moveB();
		        		     moveU();
		        		     moveL();
		        		     moveUP();
		        		     moveLP();
			        		 moveBP();
			        			
			       			
			        		 m=1;
			        		 flag=true;
		        		  
		        	  }
	        		 
	        		 
	        		 if(White[0][1].equals("W")&&White[1][0].equals("W")&&(m==0)&&(k==0))
		        	  {
		        		  //flagOLL=true;
		        		  System.out.print(" U U B U L U' L' B' ");
		        		     
		        		     moveU();
		        		     moveU();
		        		     moveB();
		        		     moveU();
		        		     moveL();
		        		     moveUP();
		        		     moveLP();
			        		 moveBP();
			        			
			       			
			        		 m=1;
			        		 flag=true;
		        		  
		        	  }
	        		 
	        		 
	        		 
	        		 
	        		
	        	
	        		 System.out.print(" rh");
	        	
	        if((k==0)&&(flag==false))
	        	{
	        	System.out.print(" rh1");
	        		// m=0;
				         
		        		  System.out.print(" F R U R' U' F' ");
		        		     
		        		     
		        		     moveF();
		        		     moveR();
		        		     moveU();
		        		     moveRP();
			        		 moveUP();
			        		 moveFP();	
			       		
			       			
							
		        		 
		        		  System.out.print("B U L U' L' B' ");
		        		     
		        		     moveB();
		        		     moveU();
		        		     moveL();
		        		     moveUP();
		        		     moveLP();
			        		 moveBP();
			        			
			        		 m=1;	
			       			
		        		  
		        	  
		        		  
		        	  
	        		
	        		
	        	}
	        
	        
	        if(White[0][1].equals("W")&&White[1][0].equals("W")&&White[1][2].equals("W")&&White[2][1].equals("W"))
    		{
    			k=1;
    			
    		}
	        	
	      
	
		if(White[0][0].equals("W")&&White[0][1].equals("W")&&White[0][2].equals("W")&&White[1][0].equals("W")&&White[1][2].equals("W")&&White[2][1].equals("W")&&Green[0][0].equals("W")&&Green[0][2].equals("W")&&(k==1))
		{
			 System.out.print(" R R D R' U U R D' R' U U R'");
			 flagOLL=true;
			 moveR();
			 moveR();
			 moveD();
			 moveRP();
			 moveU();
			 moveU();
			 moveR();
			 moveDP();
			 moveRP();
			 moveU();
			 moveU();
			 moveRP();
			 
			
		}
		
		if(White[0][0].equals("W")&&White[0][1].equals("W")&&White[1][0].equals("W")&&White[2][0].equals("W")&&White[2][1].equals("W")&&White[1][2].equals("W")&&Red[0][0].equals("W")&&Red[0][2].equals("W")&&(k==1))
		{
			
			
			System.out.print("U R R D R' U U R D' R' U U R' ");
			flagOLL=true; 
			moveU();
			 moveR();
			 moveR();
			 moveD();
			 moveRP();
			 moveU();
			 moveU();
			 moveR();
			 moveDP();
			 moveRP();
			 moveU();
			 moveU();
			 moveRP();
			 
		}
		
		
		if(White[1][0].equals("W")&&White[1][2].equals("W")&&White[2][0].equals("W")&&White[2][1].equals("W")&&White[2][2].equals("W")&&White[0][1].equals("W")&&Blue[0][0].equals("W")&&Blue[0][2].equals("W")&&(k==1))
		{
			
			
			System.out.print("U U R R D R' U U R D' R' U U R'");
			flagOLL=true; 
			moveU();
			 moveU();
			 moveR();
			 moveR();
			 moveD();
			 moveRP();
			 moveU();
			 moveU();
			 moveR();
			 moveDP();
			 moveRP();
			 moveU();
			 moveU();
			 moveRP();
			
		}
		
		if(White[0][1].equals("W")&&White[0][2].equals("W")&&White[1][2].equals("W")&&White[2][1].equals("W")&&White[2][2].equals("W")&&White[1][0].equals("W")&&Orange[0][0].equals("W")&&Orange[0][2].equals("W")&&(k==1))
		{
			
			
			System.out.print(" U' R R D R' U U R D' R' U U R'");
			flagOLL=true;
			 moveUP();
			 moveR();
			 moveR();
			 moveD();
			 moveRP();
			 moveU();
			 moveU();
			 moveR();
			 moveDP();
			 moveRP();
			 moveU();
			 moveU();
			 moveRP();
			
		}
		
	     
			
	        	  if(White[0][1].equals("W")&&White[1][0].equals("W")&&White[1][2].equals("W")&&White[2][0].equals("W")&&White[2][1].equals("W")&&Blue[0][2].equals("W")&&Red[0][2].equals("W")&&Green[0][2].equals("W")&&(k==1))
	        	  {
	        			System.out.print("R U R' U R U U R' ");
	        			flagOLL=true;	
	       			 moveR();
	       			 moveU();
	       			 moveRP();
	       			 moveU();
	       			 moveR();
	       			 moveU();
	       			 moveU();
	       			 moveRP();
	       			
	        		  
	        	  }
	        	  
	        	  
	        	  if(White[0][0].equals("W")&&White[0][1].equals("W")&&White[1][0].equals("W")&&White[1][2].equals("W")&&White[2][1].equals("W")&&Orange[0][2].equals("W")&&Red[0][2].equals("W")&&Green[0][2].equals("W")&&(k==1))
	        	  {
	        			System.out.print(" U' R U R' U R U U R' ");
	        			flagOLL=true;
	        	     moveUP();	
	       			 moveR();
	       			 moveU();
	       			 moveRP();
	       			 moveU();
	       			 moveR();
	       			 moveU();
	       			 moveU();
	       			 moveRP();
	       			
	        		  
	        	  }
	        	  
	        	  
	        	  if(White[0][1].equals("W")&&White[0][2].equals("W")&&White[1][0].equals("W")&&White[1][2].equals("W")&&White[2][1].equals("W")&&Blue[0][2].equals("W")&&Green[0][2].equals("W")&&Orange[0][2].equals("W")&&(k==1))
	        	  {
	        			System.out.print(" U U R U R' U R U U R' ");
	        			flagOLL=true;
	        	     moveU();	
	        	     moveU();
	       			 moveR();
	       			 moveU();
	       			 moveRP();
	       			 moveU();
	       			 moveR();
	       			 moveU();
	       			 moveU();
	       			 moveRP();
	       			
	        		  
	        	  }
	        	  
	        	  
	        	  if(White[0][1].equals("W")&&White[1][0].equals("W")&&White[1][2].equals("W")&&White[2][1].equals("W")&&White[2][2].equals("W")&&Orange[0][2].equals("W")&&Blue[0][2].equals("W")&&Red[0][2].equals("W")&&(k==1))
	        	  {
	        			System.out.print(" U R U R' U R U U R' ");
	        			flagOLL=true;
	        	     moveU();	
	       			 moveR();
	       			 moveU();
	       			 moveRP();
	       			 moveU();
	       			 moveR();
	       			 moveU();
	       			 moveU();
	       			 moveRP();
	       			
	        		  
	        	    }
	          
	        	  if(White[0][0].equals("W")&&White[0][1].equals("W")&&White[1][0].equals("W")&&White[1][2].equals("W")&&White[2][1].equals("W")&&Blue[0][0].equals("W")&&Red[0][0].equals("W")&&Green[0][0].equals("W")&&(k==1))
	        	  {
	        			System.out.print(" R' U' R U' R' U U R ");
	        			flagOLL=true;
	        	     moveRP();	
	       			 moveUP();
	       			 moveR();
	       			 moveUP();
	       			 moveRP();
	       			 moveU();
	       			 moveU();
	       			 moveR();
	       			
	       			
	        		  
	        	    }  
	        	  
	        	  
	        	  if(White[0][1].equals("W")&&White[1][0].equals("W")&&White[1][2].equals("W")&&White[2][0].equals("W")&&White[2][1].equals("W")&&Orange[0][0].equals("W")&&Blue[0][0].equals("W")&&Red[0][0].equals("W")&&(k==1))
	        	  {
	        			System.out.print(" U  R' U' R U' R' U U R ");
	        			flagOLL=true;
	        		 moveU();
	        		 moveRP();	
	       			 moveUP();
	       			 moveR();
	       			 moveUP();
	       			 moveRP();
	       			 moveU();
	       			 moveU();
	       			 moveR();
	       			
	       			
	        		  
	        	    }  
	        	  
	        	  if(White[0][1].equals("W")&&White[1][0].equals("W")&&White[1][2].equals("W")&&White[2][1].equals("W")&&White[2][2].equals("W")&&Orange[0][0].equals("W")&&Blue[0][0].equals("W")&&Green[0][0].equals("W")&&(k==1))
	        	  {
	        			System.out.print(" U U R' U' R U' R' U U R ");
	        			flagOLL=true;
	        		 moveU();
	        		 moveU();
	        		 moveRP();	
	       			 moveUP();
	       			 moveR();
	       			 moveUP();
	       			 moveRP();
	       			 moveU();
	       			 moveU();
	       			 moveR();
	       			
	       			
	        		  
	        	    }  
	        	  
	        	  
	        	  if(White[0][1].equals("W")&&White[0][2].equals("W")&&White[1][0].equals("W")&&White[1][2].equals("W")&&White[2][1].equals("W")&&Orange[0][0].equals("W")&&Red[0][0].equals("W")&&Green[0][0].equals("W")&&(k==1))
	        	  {
	        			System.out.print(" U' R' U' R U' R' U U R ");
	        			flagOLL=true;
	        	    
	        		 moveUP();
	        		 moveRP();	
	       			 moveUP();
	       			 moveR();
	       			 moveUP();
	       			 moveRP();
	       			 moveU();
	       			 moveU();
	       			 moveR();
	       			
	       			
	        		  
	        	    }  
	        	  
	        
	        	  if(White[0][0].equals("W")&&White[0][1].equals("W")&&White[1][0].equals("W")&&White[1][2].equals("W")&&White[2][1].equals("W")&&White[2][2].equals("W")&&Red[0][2].equals("W")&&Green[0][0].equals("W")&&(k==1))
	        	  {
	        			System.out.print(" R' F R B' R' F' R B");
	        			flagOLL=true;
	        	    
	        		 moveRP();
	        		 moveF();	
	       			 moveR();
	       			 moveBP();
	       			 moveRP();
	       			 moveFP();
	       			 moveR();
	       			 moveB();
	       			 
	       			
	       			
	        		  
	        	    }   
	        	  
	        	  
	        	  if(White[0][1].equals("W")&&White[0][2].equals("W")&&White[1][0].equals("W")&&White[1][2].equals("W")&&White[2][0].equals("W")&&White[2][1].equals("W")&&Orange[0][0].equals("W")&&Green[0][2].equals("W")&&(k==1))
	        	  {
	        			System.out.print(" U' R' F R B' R' F' R B");
	        			flagOLL=true;
	        		 moveUP();
	        		 moveRP();
	        		 moveF();	
	       			 moveR();
	       			 moveBP();
	       			 moveRP();
	       			 moveFP();
	       			 moveR();
	       			 moveB();
	       			 
	       			
	       			
	        		  
	        	    }    
	        	  
	        	  if(White[0][0].equals("W")&&White[0][1].equals("W")&&White[1][0].equals("W")&&White[1][2].equals("W")&&White[2][1].equals("W")&&White[2][2].equals("W")&&Orange[0][2].equals("W")&&Blue[0][0].equals("W")&&(k==1))
	        	  {
	        			System.out.print("U U  R' F R B' R' F' R B");
	        			flagOLL=true;
	        		moveU();
	        		moveU();
	        		 moveRP();
	        		 moveF();	
	       			 moveR();
	       			 moveBP();
	       			 moveRP();
	       			 moveFP();
	       			 moveR();
	       			 moveB();
	       			 
	       			
	       			
	        		  
	        	    }   
	        	  
	        	  
	        	  if(White[0][1].equals("W")&&White[0][2].equals("W")&&White[1][0].equals("W")&&White[1][2].equals("W")&&White[2][0].equals("W")&&White[2][1].equals("W")&&Blue[0][2].equals("W")&&Red[0][0].equals("W")&&(k==1))
	        	  {
	        		System.out.print("U R' F R B' R' F' R B");
	        		flagOLL=true;
	        		moveU();
	        		 moveRP();
	        		 moveF();	
	       			 moveR();
	       			 moveBP();
	       			 moveRP();
	       			 moveFP();
	       			 moveR();
	       			 moveB();
	       			 
	       			
	       			
	        		  
	        	    }   
	        	  
	        	
	        	  
	      
	        	  if(White[0][1].equals("W")&&White[1][0].equals("W")&&White[1][2].equals("W")&&White[2][1].equals("W")&&Orange[0][0].equals("W")&&Orange[0][2].equals("W")&&Green[0][2].equals("W")&&Blue[0][0].equals("W")&&(k==1))
	        	  {
	        		  System.out.print("R U U R R U' R R U' R R U U R");
	        		  flagOLL=true;
		        		 moveR();
		        		 moveU();
		        		 moveU();	
		       			 moveR();
		       			 moveR();
		       			 moveUP();
		       			 moveR();
		       			 moveR();
		       			 moveUP();
		       			 moveR();
		       			 moveR();
		       			 moveU();
		       			 moveU();
		       			 moveR();
		       			
	        		  
	        	  }
	        	  
	        	  
	        	  
	        	  if(White[0][1].equals("W")&&White[1][0].equals("W")&&White[1][2].equals("W")&&White[2][1].equals("W")&&Blue[0][0].equals("W")&&Blue[0][2].equals("W")&&Orange[0][2].equals("W")&&Red[0][0].equals("W")&&(k==1))
	        	  {
	        		  System.out.print(" U' R U U R R U' R R U' R R U U R");
	        		  flagOLL=true;  
	        		  moveUP();
	        		     moveR();
		        		 moveU();
		        		 moveU();	
		       			 moveR();
		       			 moveR();
		       			 moveUP();
		       			 moveR();
		       			 moveR();
		       			 moveUP();
		       			 moveR();
		       			 moveR();
		       			 moveU();
		       			 moveU();
		       			 moveR();
		       			
	        		  
	        	  }
	        	  
	        	  if(White[0][1].equals("W")&&White[1][0].equals("W")&&White[1][2].equals("W")&&White[2][1].equals("W")&&Red[0][0].equals("W")&&Red[0][2].equals("W")&&Blue[0][2].equals("W")&&Green[0][0].equals("W")&&(k==1))
	        	  {   flagOLL=true;
	        		  System.out.print(" U U R U U R R U' R R U' R R U U R");
	        		     moveU();
	        		     moveU();
	        		     moveR();
		        		 moveU();
		        		 moveU();	
		       			 moveR();
		       			 moveR();
		       			 moveUP();
		       			 moveR();
		       			 moveR();
		       			 moveUP();
		       			 moveR();
		       			 moveR();
		       			 moveU();
		       			 moveU();
		       			 moveR();
		       			
	        		  
	        	  }
	        	  
	        	  
	        	  if(White[0][1].equals("W")&&White[1][0].equals("W")&&White[1][2].equals("W")&&White[2][1].equals("W")&&Green[0][0].equals("W")&&Green[0][2].equals("W")&&Red[0][2].equals("W")&&Orange[0][0].equals("W")&&(k==1))
	        	  {   
	        		  System.out.print(" U  R U U R R U' R R U' R R U U R");
	        		  flagOLL=true;
	        		     moveU();
	        		     moveR();
		        		 moveU();
		        		 moveU();	
		       			 moveR();
		       			 moveR();
		       			 moveUP();
		       			 moveR();
		       			 moveR();
		       			 moveUP();
		       			 moveR();
		       			 moveR();
		       			 moveU();
		       			 moveU();
		       			 moveR();
		       			
	        		  
	        	  }
	        	  
	        
	        	  if(White[0][1].equals("W")&&White[1][0].equals("W")&&White[1][2].equals("W")&&White[2][1].equals("W")&&Green[0][0].equals("W")&&Green[0][2].equals("W")&&Blue[0][2].equals("W")&&Blue[0][0].equals("W")&&(k==1))
	        	  {   
	        		  System.out.print(" F R U R' U' R U R' U' R U R' U' F'");
	        		  flagOLL=true;   
	        		     moveF();
	        		     moveR();
		        		 moveU();
		        		 moveRP();	
		       			 moveUP();
		       			 moveR();
		       			 moveU();
		       			 moveRP();
		       			 moveUP();
		       			 moveR();
		       			 moveU();
		       			 moveRP();
		       			 moveUP();
		       			 moveFP();
		       			 moveR();
	        		  
	        	  }
	        	  
	        	  
	        	  
	        	  if(White[0][1].equals("W")&&White[1][0].equals("W")&&White[1][2].equals("W")&&White[2][1].equals("W")&&Orange[0][0].equals("W")&&Orange[0][2].equals("W")&&Red[0][2].equals("W")&&Red[0][0].equals("W")&&(k==1))
	        	  {
	        		  System.out.print("U F R U R' U' R U R' U' R U R' U' F'");
	        		  flagOLL=true;
	        		     moveU();
	        		     moveF();
	        		     moveR();
		        		 moveU();
		        		 moveRP();	
		       			 moveUP();
		       			 moveR();
		       			 moveU();
		       			 moveRP();
		       			 moveUP();
		       			 moveR();
		       			 moveU();
		       			 moveRP();
		       			 moveUP();
		       			 moveFP();
		       			 moveR();
	        		  
	        	  }
	        	  
	        	
	        	  
	        	  if(White[0][1].equals("W")&&White[0][2].equals("W")&&White[1][0].equals("W")&&White[1][2].equals("W")&&White[2][1].equals("W")&&White[2][2].equals("W")&&Blue[0][2].equals("W")&&Green[0][0].equals("W")&&(k==1))
	        	  {
	        		  flagOLL=true;
	        		  System.out.print("L F R' F' L'  F R F' ");
	        		     
	        		     moveL();
	        		     moveF();
	        		     moveRP();
		        		 moveFP();
		        		 moveLP();	
		       			 moveF();
		       			 moveR();
		       			 moveFP();
		       			
	        		  
	        	  }
	        	  
	        	  

	        	  if(White[0][0].equals("W")&&White[0][1].equals("W")&&White[0][2].equals("W")&&White[1][0].equals("W")&&White[1][2].equals("W")&&White[2][1].equals("W")&&Orange[0][2].equals("W")&&Red[0][0].equals("W")&&(k==1))
	        	  {
	        		  flagOLL=true;
	        		  System.out.print(" U L F R' F' L'  F R F' ");
	        		     moveU();
	        		     moveL();
	        		     moveF();
	        		     moveRP();
		        		 moveFP();
		        		 moveLP();	
		       			 moveF();
		       			 moveR();
		       			 moveFP();
		       			
	        		  
	        	  }
	        	  
	        	  
	        	  

	        	  if(White[1][0].equals("W")&&White[1][2].equals("W")&&White[2][0].equals("W")&&White[2][1].equals("W")&&White[2][2].equals("W")&&White[0][1].equals("W")&&Red[0][2].equals("W")&&Orange[0][0].equals("W")&&(k==1))
	        	  {
	        		  System.out.print(" U' L F R' F' L'  F R F' ");
	        		  flagOLL=true;   
	        		  moveUP();
	        		     moveL();
	        		     moveF();
	        		     moveRP();
		        		 moveFP();
		        		 moveLP();	
		       			 moveF();
		       			 moveR();
		       			 moveFP();
		       			
	        		  
	        	  }
	        	  

	        	  if(White[0][0].equals("W")&&White[0][1].equals("W")&&White[1][0].equals("W")&&White[1][2].equals("W")&&White[2][0].equals("W")&&White[2][2].equals("W")&&Green[0][2].equals("W")&&Blue[0][0].equals("W")&&(k==1))
	        	  {
	        		  flagOLL=true;
	        		  System.out.print(" U U L F R' F' L'  F R F' ");
	        		     
	        		     moveU();
	        		     moveU();
	        		     moveL();
	        		     moveF();
	        		     moveRP();
		        		 moveFP();
		        		 moveLP();	
		       			 moveF();
		       			 moveR();
		       			 moveFP();
		       			
	        		  
	        	  }
	        	  
	        	
	        	  
	        	  
	     
	        	
	        	
	        	  
	                 
      	}
	
	
	
	
	
}


public static void solvePLL()
{
	


	int m=0;
	int k=0;
	
	
	
	
			if(Green[0][0].equals("G")&&Green[0][2].equals("G")||Green[0][0].equals("B")&&Green[0][2].equals("B")||Green[0][0].equals("R")&&Green[0][2].equals("R")||Green[0][0].equals("O")&&Green[0][2].equals("O")&&(m==0))
			{
				System.out.print(" U  R U R' U' R' F R R U' R' U' R U R' F'  U'");
			     
			        moveU();
			        moveR();
			        moveU();
			        moveRP();
			        moveUP();
			        moveRP();
			        moveF();
			        moveR();
			        moveR();
			        moveUP();
			        moveRP();
			        moveUP();
			        moveR();
			        moveU();
			        moveRP();
			        moveFP();
			       moveUP();
			         m=1;
			         k=1;
			  	
				
			}
			
			
			
			if((Blue[0][0].equals("G")&&Blue[0][2].equals("G")||Blue[0][0].equals("B")&&Blue[0][2].equals("B")||Blue[0][0].equals("R")&&Blue[0][2].equals("R")||Blue[0][0].equals("O")&&Blue[0][2].equals("O"))&&m==0)
			{
				System.out.print(" U'  R U R' U' R' F R R U' R' U' R U R' F' U ");
			     
			        moveUP();
			        moveR();
			        moveU();
			        moveRP();
			        moveUP();
			        moveRP();
			        moveF();
			        moveR();
			        moveR();
			        moveUP();
			        moveRP();
			        moveUP();
			        moveR();
			        moveU();
			        moveRP();
			        moveFP();
			        moveU();
			         m=1;
			         k=1;
			  	
				
			}
			

			if((Red[0][0].equals("G")&&Red[0][2].equals("G")||Red[0][0].equals("B")&&Red[0][2].equals("B")||Red[0][0].equals("R")&&Red[0][2].equals("R")||Red[0][0].equals("O")&&Red[0][2].equals("O"))&&m==0)
			{
				System.out.print(" U U  R U R' U' R' F R R U' R' U' R U R' F' U U  ");
			        
				    moveU();
			        moveU();
			        moveR();
			        moveU();
			        moveRP();
			        moveUP();
			        moveRP();
			        moveF();
			        moveR();
			        moveR();
			        moveUP();
			        moveRP();
			        moveUP();
			        moveR();
			        moveU();
			        moveRP();
			        moveFP();
					moveU();
			        moveU();
			       
			         m=1;
			  	     k=1;
				
			}
			
			
	
	
			
			if((Orange[0][0].equals("G")&&Orange[0][2].equals("G")||Orange[0][0].equals("B")&&Orange[0][2].equals("B")||Orange[0][0].equals("R")&&Orange[0][2].equals("R")||Orange[0][0].equals("O")&&Orange[0][2].equals("O"))&&(m==0))
			{
				System.out.print("  R U R' U' R' F R R U' R' U' R U R' F' ");
			        

			        moveR();
			        moveU();
			        moveRP();
			        moveUP();
			        moveRP();
			        moveF();
			        moveR();
			        moveR();
			        moveUP();
			        moveRP();
			        moveUP();
			        moveR();
			        moveU();
			        moveRP();
			        moveFP();
			       
			         m=1;
			  	    k=1;
				
			}
			
			if(k==0)
			{
				m=0;
				System.out.print("  R U R' U' R' F R R U' R' U' R U R' F' ");
		        

		        moveR();
		        moveU();
		        moveRP();
		        moveUP();
		        moveRP();
		        moveF();
		        moveR();
		        moveR();
		        moveUP();
		        moveRP();
		        moveUP();
		        moveR();
		        moveU();
		        moveRP();
		        moveFP();
		       
		        
		        if((Green[0][0].equals("G")&&Green[0][2].equals("G")||Green[0][0].equals("B")&&Green[0][2].equals("B")||Green[0][0].equals("R")&&Green[0][2].equals("R")||Green[0][0].equals("O")&&Green[0][2].equals("O"))&&(m==0))
				{
					System.out.print(" U  R U R' U' R' F R R U' R' U' R U R' F' ");
				     
				        moveU();
				        moveR();
				        moveU();
				        moveRP();
				        moveUP();
				        moveRP();
				        moveF();
				        moveR();
				        moveR();
				        moveUP();
				        moveRP();
				        moveUP();
				        moveR();
				        moveU();
				        moveRP();
				        moveFP();
				       
				         m=1;
				  	
					
				}
				
				
				
				if((Blue[0][0].equals("G")&&Blue[0][2].equals("G")||Blue[0][0].equals("B")&&Blue[0][2].equals("B")||Blue[0][0].equals("R")&&Blue[0][2].equals("R")||Blue[0][0].equals("O")&&Blue[0][2].equals("O"))&&(m==0))
				{
					System.out.print(" U'  R U R' U' R' F R R U' R' U' R U R' F' ");
				     
				        moveUP();
				        moveR();
				        moveU();
				        moveRP();
				        moveUP();
				        moveRP();
				        moveF();
				        moveR();
				        moveR();
				        moveUP();
				        moveRP();
				        moveUP();
				        moveR();
				        moveU();
				        moveRP();
				        moveFP();
				       
				         m=1;
				  	
					
				}
				

				if((Red[0][0].equals("G")&&Red[0][2].equals("G")||Red[0][0].equals("B")&&Red[0][2].equals("B")||Red[0][0].equals("R")&&Red[0][2].equals("R")||Red[0][0].equals("O")&&Red[0][2].equals("O"))&&(m==0))
				{
					System.out.print(" U U  R U R' U' R' F R R U' R' U' R U R' F' U U ");
				        
					    moveU();
				        moveU();
				        moveR();
				        moveU();
				        moveRP();
				        moveUP();
				        moveRP();
				        moveF();
				        moveR();
				        moveR();
				        moveUP();
				        moveRP();
				        moveUP();
				        moveR();
				        moveU();
				        moveRP();
				        moveFP();
				        moveU();
				        moveU();
				       
				         m=1;
				  	
					
				}
				
			
		
		
				
				if((Orange[0][0].equals("G")&&Orange[0][2].equals("G")||Orange[0][0].equals("B")&&Orange[0][2].equals("B")||Orange[0][0].equals("R")&&Orange[0][2].equals("R")||Orange[0][0].equals("O")&&Orange[0][2].equals("O"))&&(m==0))
				{
					System.out.print("  R U R' U' R' F R R U' R' U' R U R' F' ");
				        

				        moveR();
				        moveU();
				        moveRP();
				        moveUP();
				        moveRP();
				        moveF();
				        moveR();
				        moveR();
				        moveUP();
				        moveRP();
				        moveUP();
				        moveR();
				        moveU();
				        moveRP();
				        moveFP();
				       
				         m=1;
				  	
					
				}
		        
		        
		  	
			}
			

			
			
			
			int n=0;
			
			
			
			if(Orange[0][0].equals("O")&&Orange[0][2].equals("O")&&Blue[0][0].equals("B")&&Blue[0][2].equals("B")&&Red[0][0].equals("R")&&Red[0][2].equals("R")&&Green[0][0].equals("G")&&Green[0][2].equals("G")&&Green[0][1].equals("R")&&Red[0][1].equals("G")&&Blue[0][1].equals("O")&&Orange[0][1].equals("B")&&(n==0))
			{

				
		       System.out.print("  	U2 M2 U M2 U M U2 M2 U2 M   ");
		       
		       moveU();
		       moveU();
		        moveR();
		        moveR();
		        moveL();
		        moveL();
		        moveU();
		        moveR();
		        moveR();
		        moveL();
		        moveL();
		        moveU();
		        moveRP();
		        moveL();
		        moveU();
		        moveU();
		        moveR();
		        moveR();
		        moveL();
		        moveL();
		        moveU();
		        moveU();
		        moveRP();
		        moveL();
		        n=1;
		        
		        
			}
			
			
			
			
			
			if(Orange[0][0].equals("B")&&Orange[0][2].equals("B")&&Blue[0][0].equals("R")&&Blue[0][2].equals("R")&&Red[0][0].equals("G")&&Red[0][2].equals("G")&&Green[0][0].equals("O")&&Green[0][2].equals("O")&&Green[0][1].equals("B")&&Red[0][1].equals("R")&&Blue[0][1].equals("G")&&Orange[0][1].equals("O")&&(n==0))
			{

				
		       System.out.print("  	U M2 U M2 U M U2 M2 U2 M  U U ");
		       
		       
		       moveU();
		        moveR();
		        moveR();
		        moveL();
		        moveL();
		        moveU();
		        moveR();
		        moveR();
		        moveL();
		        moveL();
		        moveU();
		        moveRP();
		        moveL();
		        moveU();
		        moveU();
		        moveR();
		        moveR();
		        moveL();
		        moveL();
		        moveU();
		        moveU();
		        moveRP();
		        moveL();
		        moveU();
		        moveU();
		        n=1;
		        
			}
			
			
			
			
			if(Orange[0][0].equals("R")&&Orange[0][2].equals("R")&&Blue[0][0].equals("G")&&Blue[0][2].equals("G")&&Red[0][0].equals("O")&&Red[0][2].equals("O")&&Green[0][0].equals("B")&&Green[0][2].equals("B")&&Green[0][1].equals("O")&&Red[0][1].equals("B")&&Blue[0][1].equals("R")&&Orange[0][1].equals("G")&&(n==0))
			{

				
		       System.out.print("  	 M2 U M2 U M U2 M2 U2 M   ");
		       
		     
		        moveR();
		        moveR();
		        moveL();
		        moveL();
		        moveU();
		        moveR();
		        moveR();
		        moveL();
		        moveL();
		        moveU();
		        moveRP();
		        moveL();
		        moveU();
		        moveU();
		        moveR();
		        moveR();
		        moveL();
		        moveL();
		        moveU();
		        moveU();
		        moveRP();
		        moveL();
		        n=1;
		        
		        
			}
			
			
			
			if(Orange[0][0].equals("G")&&Orange[0][2].equals("G")&&Blue[0][0].equals("O")&&Blue[0][2].equals("O")&&Red[0][0].equals("B")&&Red[0][2].equals("B")&&Green[0][0].equals("R")&&Green[0][2].equals("R")&&Green[0][1].equals("G")&&Red[0][1].equals("O")&&Blue[0][1].equals("B")&&Orange[0][1].equals("R")&&(n==0))
			{

				
		       System.out.print("  	U M2 U M2 U M U2 M2 U2 M  U U ");
		       
		       
		       moveU();
		        moveR();
		        moveR();
		        moveL();
		        moveL();
		        moveU();
		        moveR();
		        moveR();
		        moveL();
		        moveL();
		        moveU();
		        moveRP();
		        moveL();
		        moveU();
		        moveU();
		        moveR();
		        moveR();
		        moveL();
		        moveL();
		        moveU();
		        moveU();
		        moveRP();
		        moveL();
		        
		        n=1;
		        
			}
			
			
			
			
			if(Orange[0][0].equals("O")&&Orange[0][2].equals("O")&&Blue[0][0].equals("B")&&Blue[0][2].equals("B")&&Red[0][0].equals("R")&&Red[0][2].equals("R")&&Green[0][0].equals("G")&&Green[0][2].equals("G")&&Green[0][1].equals("B")&&Red[0][1].equals("O")&&Blue[0][1].equals("G")&&Orange[0][1].equals("R")&&(n==0))
			{

				
		       System.out.print("   M2 U M2 U2 M2 U M2  ");
		       
		       
		        moveR();
		        moveR();
		        moveL();
		        moveL();
				
		        moveU();
				
		        moveR();
		        moveR();
		        moveL();
		        moveL();
				
		        moveU();
				moveU();
		       
			   
			     moveR();
		        moveR();
		        moveL();
		        moveL();
				
		        moveU();
				
				moveR();
		        moveR();
		        moveL();
		        moveL();
		        n=1;
			 }
			
			
			
			if(Orange[0][0].equals("B")&&Orange[0][2].equals("B")&&Blue[0][0].equals("R")&&Blue[0][2].equals("R")&&Red[0][0].equals("G")&&Red[0][2].equals("G")&&Green[0][0].equals("O")&&Green[0][2].equals("O")&&Green[0][1].equals("R")&&Red[0][1].equals("B")&&Blue[0][1].equals("O")&&Orange[0][1].equals("G")&&(n==0))
			{

				
		       System.out.print(" U  M2 U M2 U2 M2 U M2  ");
		       
		       moveU();
		        moveR();
		        moveR();
		        moveL();
		        moveL();
				
		        moveU();
				
		        moveR();
		        moveR();
		        moveL();
		        moveL();
				
		        moveU();
				moveU();
		       
			   
			     moveR();
		        moveR();
		        moveL();
		        moveL();
				
		        moveU();
				
				moveR();
		        moveR();
		        moveL();
		        moveL();
		        n=1;
			 }
			

		 
			if(Orange[0][0].equals("R")&&Orange[0][2].equals("R")&&Blue[0][0].equals("G")&&Blue[0][2].equals("G")&&Red[0][0].equals("O")&&Red[0][2].equals("O")&&Green[0][0].equals("B")&&Green[0][2].equals("B")&&Green[0][1].equals("O")&&Red[0][1].equals("B")&&Blue[0][1].equals("R")&&Orange[0][1].equals("G")&&(n==0))
			{

				
		       System.out.print("   M2 U M2 U2 M2 U M2  U2");
		       
		 
		        moveR();
		        moveR();
		        moveL();
		        moveL();
				
		        moveU();
				
		        moveR();
		        moveR();
		        moveL();
		        moveL();
				
		        moveU();
				moveU();
		       
			   
			     moveR();
		        moveR();
		        moveL();
		        moveL();
				
		        moveU();
				
				moveR();
		        moveR();
		        moveL();
		        moveL();
		        
		        moveU();
				moveU();
				n=1;
			 }
			
			
			
			if(Orange[0][0].equals("G")&&Orange[0][2].equals("G")&&Blue[0][0].equals("O")&&Blue[0][2].equals("O")&&Red[0][0].equals("B")&&Red[0][2].equals("B")&&Green[0][0].equals("R")&&Green[0][2].equals("R")&&Green[0][1].equals("O")&&Red[0][1].equals("G")&&Blue[0][1].equals("R")&&Orange[0][1].equals("B")&&(n==0))
			{

				
		       System.out.print(" U'  M2 U M2 U2 M2 U M2  ");
		       
		       moveUP();
		        moveR();
		        moveR();
		        moveL();
		        moveL();
				
		        moveU();
				
		        moveR();
		        moveR();
		        moveL();
		        moveL();
				
		        moveU();
				moveU();
		       
			   
			     moveR();
		        moveR();
		        moveL();
		        moveL();
				
		        moveU();
				
				moveR();
		        moveR();
		        moveL();
		        moveL();
		       n=1; 
		        
			 }
					
			
			
			
			if((Orange[0][0].equals("O")&&Orange[0][1].equals("O")&&Orange[0][2].equals("O")||Orange[0][0].equals("B")&&Orange[0][1].equals("B")&&Orange[0][2].equals("B")||Orange[0][0].equals("R")&&Orange[0][1].equals("R")&&Orange[0][2].equals("R")||Orange[0][0].equals("G")&&Orange[0][1].equals("G")&&Orange[0][2].equals("G"))&&(n==0))
			{

				if(Blue[0][2].equals("B")&&Blue[0][1].equals("G"))
				{
					System.out.print(" U R U' R U R U R U' R' U' R R U'");
			        moveU();
			        moveR();
			        moveUP();
			        moveR();
			        moveU();
			        moveR();
			        moveU();
			        moveR();
			        moveUP();
			        moveRP();
			        moveUP();
			        moveR();
			        moveR();
			        moveUP();
					n=1;
				}
				
				else
				{
					  System.out.print("   U  R R U R U R' U' R' U' R' U R' U'  ");
		               
		                moveU();
				        moveR();
				        moveR();
				        moveU();
				        moveR();
				        moveU();
				        moveRP();
				        moveUP();
				       
				        moveRP();
				        moveUP();
				        moveRP();
				        moveU();
				        moveRP();
				        moveUP();
					    n=1;
				}
				
		     
				
			}
			
			
			
			
			if((Blue[0][0].equals("O")&&Blue[0][1].equals("O")&&Blue[0][2].equals("O")||Blue[0][0].equals("B")&&Blue[0][1].equals("B")&&Blue[0][2].equals("B")||Blue[0][0].equals("R")&&Blue[0][1].equals("R")&&Blue[0][2].equals("R")||Blue[0][0].equals("G")&&Blue[0][1].equals("G")&&Blue[0][2].equals("G"))&&(n==0))
			{

				if(Red[0][2].equals("O")&&Red[0][1].equals("R"))
				{
					System.out.print(" R U' R U R U R U' R' U' R R ");
			        
			        moveR();
			        moveUP();
			        moveR();
			        moveU();
			        moveR();
			        moveU();
			        moveR();
			        moveUP();
			        moveRP();
			        moveUP();
			        moveR();
			        moveR();
			       n=1;
					
				}
				
				else
				{
					  System.out.print("     R R U R U R' U' R' U' R' U R'   ");
		               
		                
				        moveR();
				        moveR();
				        moveU();
				        moveR();
				        moveU();
				        moveRP();
				        moveUP();
				       
				        moveRP();
				        moveUP();
				        moveRP();
				        moveU();
				        moveRP();
				       n=1;
					
				}
				
		     
				
			}
			
			
			
			
			if((Red[0][0].equals("O")&&Red[0][1].equals("O")&&Red[0][2].equals("O")||Red[0][0].equals("B")&&Red[0][1].equals("B")&&Red[0][2].equals("B")||Red[0][0].equals("R")&&Red[0][1].equals("R")&&Red[0][2].equals("R")||Red[0][0].equals("G")&&Red[0][1].equals("G")&&Red[0][2].equals("G"))&&(n==0))
			{

				if(Green[0][2].equals("G")&&Green[0][1].equals("B"))
				{
					System.out.print(" U' R U' R U R U R U' R' U' R R U  ");
			        
			        moveUP();
			        moveR();
			        moveUP();
			        moveR();
			        moveU();
			        moveR();
			        moveU();
			        moveR();
			        moveUP();
			        moveRP();
			        moveUP();
			        moveR();
			        moveR();
			        moveU();
			        n=1;
					
				}
				
				else
				{
					  System.out.print("   U'  R R U R U R' U' R' U' R' U R'  U ");
		               
					 
					    moveUP();
				        moveR();
				        moveR();
				        moveU();
				        moveR();
				        moveU();
				        moveRP();
				        moveUP();
				       
				        moveRP();
				        moveUP();
				        moveRP();
				        moveU();
				        moveRP();
				        moveU();
				        n=1;
					
				}
				
		     
				
			}
			
			
			
			
			
			if((Green[0][0].equals("O")&&Green[0][1].equals("O")&&Green[0][2].equals("O")||Green[0][0].equals("B")&&Green[0][1].equals("B")&&Green[0][2].equals("B")||Green[0][0].equals("R")&&Green[0][1].equals("R")&&Green[0][2].equals("R")||Green[0][0].equals("G")&&Green[0][1].equals("G")&&Green[0][2].equals("G"))&&(n==0))
			{

				if(Orange[0][2].equals("O")&&Orange[0][1].equals("R"))
				{
					System.out.print(" U U R U' R U R U R U' R' U' R R U U ");
			        
					moveU();
					moveU();
			        moveR();
			        moveUP();
			        moveR();
			        moveU();
			        moveR();
			        moveU();
			        moveR();
			        moveUP();
			        moveRP();
			        moveUP();
			        moveR();
			        moveR();
			        moveU();
			        moveU();
					n=1;
				}
				
				else
				{
					  System.out.print("   U U  R R U R U R' U' R' U' R' U R'  U U ");
		               
					  moveU();
					  moveU();
				        moveR();
				        moveR();
				        moveU();
				        moveR();
				        moveU();
				        moveRP();
				        moveUP();
				       
				        moveRP();
				        moveUP();
				        moveRP();
				        moveU();
				        moveRP();
				        moveU();
				        moveU();
					    n=1;
				}
				
				
		
				
				
			
				
				
			}
			
			
			
			
			
			
			
			
			
			int u=0;
			
			
			if(Blue[0][0].equals("B")&&Blue[0][1].equals("B")&&Blue[0][2].equals("B")&&(u==0))
			{
				
				 System.out.print("  ");
				 u=1;
	               
				  
				
			}
			
			if(Blue[0][0].equals("G")&&Blue[0][1].equals("G")&&Blue[0][2].equals("G")&&(u==0))
			{
				
				System.out.print(" U U  ");
				moveU();
				moveU();
				 u=1;
				
			}
			
			if(Blue[0][0].equals("R")&&Blue[0][1].equals("R")&&Blue[0][2].equals("R")&&(u==0))
			{
				System.out.print(" U ");
				moveU();
				 u=1;
				
				
				
			}
			
			if(Blue[0][0].equals("O")&&Blue[0][1].equals("O")&&Blue[0][2].equals("O")&&(u==0))
			{
				
				System.out.print(" U' ");
				moveUP();
				 u=1;
			}
			
			
			
			
}









public static void main(String[] args) 
   {
	
	
	   System.out.println("the cube is ");
	   displayColorWhite();
		
		displayColorGreen();
		
		displayColorRed();
		
        displayColorBlue();
	    
	   displayColorOrange();
	    
	   displayColorYellow();
	    
		
		/*
	   
	    System.out.println("the updated cube is ");
	    
	    
	    
	   //   UpdateColorWhite();
	   	//  UpdateColorGreen();
	   	//  UpdateColorRed();
	   //	  UpdateColorBlue();
	   //	  UpdateColorOrange();
	   //   UpdateColorYellow();
	     
	      
	    System.out.println("lets find edges "); 
	    
	      FindEdges();
	     
    	   solvecrossRY();
    	   
    	   
	       FindEdges();
	      
	       solvecrossBY();
	       
	       FindEdges();
	      
	       solvecrossOY();
	       
	       
	       FindEdges();
	      
	       solvecrossGY();
	          
	      System.out.println("lets find corners "); 
	      FindEdges();
	      FindCorners();
	      System.out.println("lets find and solve F2L "); 
	      solveYOBandOB();
	      FindEdges();
	      FindCorners();
	      solveYRBandRB();
	      FindEdges();
	      FindCorners();
	      solveYOGandOG();
	      FindEdges();
	      FindCorners();
	      solveYRGandRG();
	      
	      
	      UpdateColorWhite();
	   	  UpdateColorGreen();
	   	  UpdateColorRed();
	   	  UpdateColorBlue();
	   	  UpdateColorOrange();
	      UpdateColorYellow();
	      System.out.println("lets do OLL "); 
	      FindEdges();
	      FindCorners();
	     
	    	  
	      
	      solveOLL();
	     
	          UpdateColorWhite();
		   	  UpdateColorGreen();
		   	  UpdateColorRed();
		   	  UpdateColorBlue();
		   	  UpdateColorOrange();
		      UpdateColorYellow();
		      */
	      
		     solvePLL();
		      
		      UpdateColorWhite();
		   	  UpdateColorGreen();
		   	  UpdateColorRed();
		   	  UpdateColorBlue();
		   	  UpdateColorOrange();
		      UpdateColorYellow();
		      
		      

   }


	
}