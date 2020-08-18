import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements ActionListener{

	int count = 0;
	private JLabel label;
	private JPanel panel;
	private JFrame frame;
	private JButton button;
	
	public GUI() {
		frame = new JFrame();
		
		button = new JButton("Press To Get Cookies! ");
		button.addActionListener(this);
		label = new JLabel("Number Of Cookies That I Owe You! :0");

		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(50, 50, 25, 25));
		panel.setLayout(new GridLayout(0, 1));
		panel.add(button);
		panel.add(label);
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("My GUI");
		frame.pack();
		frame.setVisible(true);
		
		
	}
	
	
	public static void main(String[] args) {
		new GUI();

	}


	@Override
	public void actionPerformed(ActionEvent e) {
			count++;
			label.setText("Number of Cookies That I Owe You! : " + count);
	}

}
