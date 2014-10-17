package problem12;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Morning extends JFrame
  implements ActionListener
{
  private EasySound rooster;
  
  //private int time;


  /**
   *   Constructor
   */
  public Morning()
  {
	  
    super("Morning");
    
    rooster = new EasySound("Assets/roost.wav");
    rooster.play();
        	
	Timer clock = new Timer(5000, this); 
	clock.start();

    Container c = getContentPane();
    c.setBackground(Color.WHITE);
  }

  public void actionPerformed(ActionEvent e)
  {
    
    rooster.play();
  
  }
  
  public static void main(String[] args)
  {
    Morning morning = new Morning();
    morning.setSize(300, 150);
    morning.setDefaultCloseOperation(EXIT_ON_CLOSE);
    morning.setVisible(true);
  }
}  