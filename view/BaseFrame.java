package view;

import java.awt.Toolkit;

import javax.swing.JFrame;

public class BaseFrame extends JFrame{
	private static final long serialVersionUID = 1L;

	public BaseFrame() {
		setTitle("3 IN A ROW");
		setBounds(750, 250, 500, 500);
		setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("src/resources/3inarowIcon.png"));
	}

}