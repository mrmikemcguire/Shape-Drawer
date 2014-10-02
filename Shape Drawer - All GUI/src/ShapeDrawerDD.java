import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*; 

public class ShapeDrawerDD extends Canvas 	
	{	
	private static final long	serialVersionUID = 1L;     	
	static int shape; 
	static int shapeColor;
	static int backgroundColor;
	static JFrame frame = new JFrame();
	static ShapeDrawerDD canvas;
	
	public static void main(String[] args)     		
		{	     
		askQuestions();
		canvas = new ShapeDrawerDD();
			
		frame.setSize(400, 400);	       
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	     
		frame.getContentPane().add(canvas);	        
		frame.setLocationRelativeTo(null);
		}
	
	public static void setBackgroundColor() {
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
	}
	
	public static void askQuestions()
	    {
	
	    String[] shapeOptions = {"Square", "Circle"};
	    JLabel shapeLabel = new JLabel("Choose Shape");
		final JComboBox<String> shapeDropdown = new JComboBox<String>(shapeOptions);
		
	    String[] backgroundOptions = {"White", "Black", "Yellow"};
		JLabel backgroundLabel = new JLabel("Choose background color");
		final JComboBox<String> backgroundDropdown = new JComboBox<String>(backgroundOptions);

	    String[] shapeColors = {"Blue", "Red", "Green", "Yellow", "Black", "White"};
		JLabel colorLabel = new JLabel("Choose shape color");
		final JComboBox<String> colorDropdown = new JComboBox<String>(shapeColors);
	    
		final JFrame configurator = new JFrame();
		configurator.setSize(400, 100);
		configurator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton button = new JButton("Enter");
		button.addActionListener(new ActionListener()
			{
			public void actionPerformed(ActionEvent arg0) 
				{
				backgroundColor = backgroundDropdown.getSelectedIndex();
				shapeColor = colorDropdown.getSelectedIndex();
				shape = shapeDropdown.getSelectedIndex();
				setBackgroundColor();
				frame.setVisible(true);
				configurator.setVisible(false);
				}
			});
		
		JPanel panel = new JPanel();
		panel.add(shapeLabel);
		panel.add(shapeDropdown);
		panel.add(colorLabel);
		panel.add(colorDropdown);
		panel.add(backgroundLabel);
		panel.add(backgroundDropdown);
		panel.add(button);
		
		configurator.add(panel);
		configurator.setVisible(true);
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