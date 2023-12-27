
package smiley;
import java.awt.*;
import java.awt.event.*;

	

public class Layout_Gui {
	public static void main (String args[])
	{   Frame f=new Frame("Flow layout");
	    Panel p=new Panel();
		Button b1=new Button();
		Button b2=new Button();
		Button b3=new Button();
		Button b4=new Button();
		Button b5=new Button();
		f.add(p);
		p.add(new Button("INDIA"));
		p.add(new Button("UK"));
		p.add(new Button("JAPAN"));
		p.add(new Button("CHINA"));
		p.add(new Button("COUNTRIES"));
		f.setSize(300,300);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter()
				{
			public void windowClosing( WindowEvent e)
			{
				System.exit(0);
				
			}
		});
		
		
		
		
	}

}
