package SnakeGame;

import java.awt.EventQueue;
import javax.swing.JFrame;

//This is the main class.//

public class Snake extends JFrame {
  
  public Snake() {
    
    initUI();
	}
	
	private void initUI() {
		
		add(new Board());
		
		setResizable(false);
		pack();
		
		//The setRezisable() method affects the insets of the JFrame container on some platforms//
		//Therefore, it is important to call it before the pack() method//
		//Otherwise, the collision of the snake with the right and bottom borders might not work correctly.//
		
		setTitle("Snake");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(() -> {
			JFrame ex = new Snake();
			ex.setVisible(true);
		});
	}
	
	
	
  
