package java_lab;
import java.awt.*;    
import javax.swing.*;   
import java.awt.event.*;    
  
public class CardLayoutExample1 extends JFrame implements ActionListener  
{    
  
CardLayout crd;    
  

JButton b1, b2, b3;    
Container c;   
  

CardLayoutExample1()  
{    
  
c = getContentPane();    
  

crd = new CardLayout();    
  
c.setLayout(crd);    
  
 
b1 = new JButton("America");    
b2 = new JButton("Boy");    
b3 = new JButton("Cat");    
  

b1.addActionListener(this);    
b2.addActionListener(this);    
b3.addActionListener(this);    
  
c.add("a", b1);   
c.add("b", b2); 
c.add("c", b3);   
            
}    
public void actionPerformed(ActionEvent e)   
{    

crd.next(c);    
}    
  
public static void main(String argvs[])   
{     

CardLayoutExample1 crdl = new CardLayoutExample1();   
  
         
crdl.setSize(300, 300);    
crdl.setVisible(true);    
crdl.setDefaultCloseOperation(EXIT_ON_CLOSE);    
}    
}    
