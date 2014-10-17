package problem12;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class MorningMoo extends JFrame
  implements ActionListener
{
  private EasySound rooster;
  private EasySound cow;
  
  private int time;


  /**
   *   Constructor
   */
  public MorningMoo()
  {
	  
    super("Morning");
    
    rooster = new EasySound("Assets/roost.wav");
    cow = new EasySound("Assets/moo.wav");
    rooster.play();
        	
	Timer clock = new Timer(5000, this); // timer
	clock.start();

   Container c = getContentPane();
   c.setBackground(Color.WHITE);
  }

  public void actionPerformed(ActionEvent e)
  {
	time++;
	Container c = getContentPane();
	
	// if time is even, play rooster sound and make white
	if (time%2 == 0){
		c.setBackground(Color.WHITE);
		rooster.play();	
	}
    
	// if time is odd, play rooster sound and make black
	else{
		c.setBackground(Color.BLACK);
		cow.play();	
	}
  
  }
  
  public static void main(String[] args)
  {
    MorningMoo morning = new MorningMoo();
    morning.setSize(300, 150);
    morning.setDefaultCloseOperation(EXIT_ON_CLOSE);
    morning.setVisible(true);
  }
}  