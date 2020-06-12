package model;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ChangeColor extends Frame implements ActionListener


{
	
	static Button redbtn;
	static Button greenbtn;
	static Button bluebtn;
	static Button nextbtn;
	Container container;
	
	ChangeColor()
	{
		redbtn= new Button("red");

		greenbtn = new Button("green");
		
		
		
		bluebtn = new Button("blue");
		nextbtn= new Button("next");
		
		 
	  setLayout(new FlowLayout());   
	  
		//c.setTitle("CHANGE");
		 add(redbtn);
	     add(greenbtn);
	     add(bluebtn);
	     add(nextbtn);
	     
	     redbtn.addActionListener(this);
	     greenbtn.addActionListener(this);
	     bluebtn.addActionListener(this);
	     nextbtn.addActionListener(this);
		
		
	}
	
	
	




@Override
public void actionPerformed(ActionEvent ev) 

{
	String clickedbtn= ev.getActionCommand();
	System.out.println("clicked" + clickedbtn);
	
	if(ev.getSource()==redbtn)
	{
		setBackground(Color.red);
		
	}
	
	
	else if(ev.getSource()==bluebtn)
	{
		
		setBackground(Color.blue);
	}
	
	else if(ev.getSource()==greenbtn)
	{
		
		setBackground(Color.green);
	}
	
}

}
