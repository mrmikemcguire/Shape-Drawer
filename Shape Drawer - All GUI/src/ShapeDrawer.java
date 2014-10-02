import java.awt.*;
import javax.swing.*; 

public class ShapeDrawer extends Canvas 	
	{	
	private static final long	serialVersionUID = 1L;     	
	static int shape; 
	static int shapeColor;
	static int backgroundColor;
	static JFrame frame = new JFrame();
	
	public static void main(String[] args)     		
		{	     
		askQuestions();
		ShapeDrawer canvas = new ShapeDrawer();
		
		switch(backgroundColor)
			{
			case 0:
				{
				canvas.setBackground(Color.white);
				break;
				}
			case 1:
				{
				canvas.setBackground(Color.black);
				break;
				}
			case 2:
				{
				canvas.setBackground(Color.yellow);
				break;
				}				
			}
			
			JFrame frame = new JFrame();	       
			frame.setSize(400, 400);	       
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	     
			frame.getContentPane().add(canvas);	        
			frame.setVisible(true);	
			frame.setLocationRelativeTo(null);
		}
	
	public static void askQuestions()
	    {
		Object[] optionsThree = {"Square", "Circle"};
		shape = JOptionPane.showOptionDialog(frame, "What shape do you want to draw?",
				"Shape Choice",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null, optionsThree, optionsThree[0]);	
		
		Object[] optionsOne = {"White", "Black", "Yellow"};
		backgroundColor = JOptionPane.showOptionDialog(frame, "What color do you want the background to be?",
				"Background Color Choice",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null, optionsOne, optionsOne[0]);
		
		Object[] optionsTwo = {"Blue", "Red", "Green", "Yellow", "Black", "White"};
		shapeColor = JOptionPane.showOptionDialog(frame, "What color do you want the shape to be?",
				"Shape Color Choice",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null, optionsTwo, optionsTwo[0]);
	    }
		   
	
	public void paint(Graphics graphics) 	
		{
		switch(shapeColor)
			{
			case 0:
				{
				graphics.setColor(Color.blue);
				break;
				}
			case 1:
				{
				graphics.setColor(Color.red);
				break;
				}
			case 2:
				{
				graphics.setColor(Color.green);
				break;
				}
			case 3:
				{
				graphics.setColor(Color.yellow);
				break;
				}
			case 4:
				{
				graphics.setColor(Color.black);
				break;
				}
			case 5:
				{
				graphics.setColor(Color.white);
				break;
				}
			}
		
		switch(shape)
			{
			case 0:
				{
				graphics.fillRect(50, 40, 300, 300);
				break;
				}
			case 1:
				{
				graphics.fillOval(50, 30, 300, 300);
				break;
				}
			}
		}
	}