package awt;

import java.awt.*;
import java.awt.event.*;


public class awt {
  
	public static void main(String[]args)
	{
		Frame f =new Frame();
		f.setSize(400,200);
		f.setTitle("tuuasil");
		f.setLayout(new FlowLayout());
		
		Label l=new Label("Enter your name");
		f.add(l);
		TextField txt=new TextField(10);
		f.add(txt);
		Button bt= new Button("Log In");
		f.add(bt);
		
		TextArea ta = new TextArea("hello",2,10 );
		f.add(ta);
		
		String []days = {"sat","sun","mon","Tue"};
		List lst=new List(2,false);
		for(int i=0;i<days.length;i++)
			lst.add(days[i]);
		
		
		 f.addWindowListener(new WindowAdapter() {
	            public void windowClosing(WindowEvent we) {
	                // Close the window and exit the application
	                f.dispose(); // Closes the window
	                System.exit(0);   // Terminates the application
	            }
	        });
		
		
		f.setVisible(true);
	}
	
	
}
