import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Questions 
	{
	private static final long serialVersionUID = 1L;
	static int shape; 
	static int shapeColor;
	static int backgroundColor;
	static int width, counter;
	static int height;
	static JFrame frame = new JFrame();

	public static void askQuestions()
	    {
		Object[] optionsThree = {"Square", "Circle"};
		shape = JOptionPane.showOptionDialog(frame, "What shape do you want to draw?",
				"Shape Choice",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null, optionsThree, optionsThree[1]);	
		
		Object[] optionsOne = {"White", "Black", "Yellow"};
		backgroundColor = JOptionPane.showOptionDialog(frame, "What color do you want the background to be?",
				"Background Color Choice",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null, optionsOne, optionsOne[2]);
		
		Object[] optionsTwo = {"Blue", "Red", "Green", "Yellow", "Black", "White"};
		shapeColor = JOptionPane.showOptionDialog(frame, "What color do you want the shape to be?",
				"Shape Color Choice",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null, optionsTwo, optionsTwo[2]);
	    }
	}