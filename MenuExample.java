
package smiley;
import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

public class MenuExample extends Frame implements ActionListener

{

	Label l=new Label();

	MenuExample()

	{

	

Frame f=new Frame("Menu Bar");

MenuBar mb=new MenuBar();

Menu m1=new Menu("CSE");

Menu m2=new Menu("ECE");

Menu m3=new Menu("IT");

m3.addActionListener(this);

Menu my1=new Menu("1ST YEAR CSE");

Menu my2=new Menu("2ND YEAR CSE");

Menu my3=new Menu("3RD YEAR CSE");

Menu my4=new Menu("4TH YEAR CSE");

Menu my5=new Menu("1ST YEAR ECE");

Menu my6=new Menu("2ND YEAR ECE");

Menu my7=new Menu("3RD YEAR ECE");

Menu my8=new Menu("4TH YEAR ECE");

Menu my9=new Menu("1ST YEAR IT");

Menu my10=new Menu("2ND YEAR IT");

Menu my11=new Menu("3RD YEAR IT");

Menu my12=new Menu("4TH YEAR IT");

my12.addActionListener(this);

MenuItem mi1=new MenuItem("CSE-A");

MenuItem mi2=new MenuItem("CSE-B");

MenuItem mi3=new MenuItem("CSE-C");

MenuItem mi4=new MenuItem("ECE-A");

MenuItem mi5=new MenuItem("ECE-B");

MenuItem mi6=new MenuItem("IT-A");

mi6.addActionListener(this);

m1.add(my1);

m1.add(my2);

m1.add(my3);

m1.add(my4);

m2.add(my5);

m2.add(my6);

m2.add(my7);

m2.add(my8);

m3.add(my9);

m3.add(my10);

m3.add(my11);

m3.add(my12);

my1.add(mi1);

my1.add(mi2);

my1.add(mi3);

my2.add(mi1);

my2.add(mi2);

my2.add(mi3);

my3.add(mi1);

my3.add(mi2);

my3.add(mi3);

my4.add(mi1);

my4.add(mi2);

my4.add(mi3);

my5.add(mi4);

my5.add(mi5);

my6.add(mi4);

my6.add(mi5);

my7.add(mi4);

my7.add(mi5);

my8.add(mi4);

my8.add(mi5);

my9.add(mi6);

my10.add(mi6);

my11.add(mi6);

my12.add(mi6);

mb.add(m1);

mb.add(m2);

mb.add(m3);



l.setBounds(200,200,200,200);

f.add(l);

l.setVisible(true);

f.setMenuBar(mb);

f.setSize(500,500);

f.setLayout(null);

f.setVisible(true);

 }

	

	 public void actionPerformed(ActionEvent e)

	    {

		  String s = e.getActionCommand();

	l.setText(s + " selected");

	 

	    }

	 public static void main(String[] args) {

		 new  MenuExample ();

	 }

	 }



