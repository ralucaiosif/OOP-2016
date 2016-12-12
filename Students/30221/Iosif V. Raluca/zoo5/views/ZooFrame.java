package javasmmr.zoowsome.views;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javasmmr.zoowsome.services.factories.Constants.Frames;
import javasmmr.zoowsome.views.utilities.FrameStack;



public abstract class ZooFrame extends JFrame implements ZooFrame_I{

	@Override 
	public void goBack(){
		
	}
	
	protected JPanel contentPanel;
	public static final int HEIGHT=500;
	public static final int WIDTH=700;
	
	public ZooFrame(String title){
		
		
		FrameStack.getInstance().push(this);
		setTitle(title);
		setSize(Frames.WIDTH, Frames.HEIGHT);
		setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPanel= new JPanel();
		contentPanel.setBorder(new EmptyBorder(5,5,5,5));
		contentPanel.setBackground(Color.red);
		add(contentPanel, BorderLayout.CENTER);
		}
	
	public void setBackButtonActionListener(ActionListener a){
		JPanel buttonPanel= new JPanel();
		buttonPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		JButton backButton= new JButton();
		this.add(buttonPanel, BorderLayout.NORTH);
		this.getContentPane().add(BorderLayout.CENTER, backButton);
		backButton.addActionListener(a);
		
		
		
	}
}
