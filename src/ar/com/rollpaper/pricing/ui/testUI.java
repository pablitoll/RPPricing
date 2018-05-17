package ar.com.rollpaper.pricing.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;

import com.alee.laf.WebLookAndFeel;
import com.alee.laf.checkbox.WebCheckBox;

import java.awt.Window.Type;
import java.awt.GridLayout;
import java.awt.Button;
import java.awt.Checkbox;

public class testUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					testUI window = new testUI();
					window.frame.setVisible(true);
				    // Install WebLaF as application L&F
	                WebLookAndFeel.install ();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public testUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setType(Type.UTILITY);
		frame.setResizable(false);
		frame.setBounds(100, 100, 488, 344);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
	   
		Button button = new Button("New button");
		button.setBounds(214, 21, 231, 57);
		frame.getContentPane().add(button);
		
		//Checkbox checkbox = new Checkbox("New check box");
	    final WebCheckBox checkBoxA = new WebCheckBox ( "Animated checkbox" );
		checkBoxA.setBounds(281, 211, 155, 22);
		frame.getContentPane().add(checkBoxA);
	}
}
