package view;

import java.awt.Choice;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controler.ChangePanelLis;
import controler.ColorListener;

public class SettingsScreen extends JPanel  {
	
	private static final long serialVersionUID = 3L;
	private Choice colorChoice = new Choice();
	private final int lengthIcon=65;
	private final int heightIcon=65;
	private ImageIcon iconAux = new ImageIcon("src/resources/3inarowBack.png");
	private ImageIcon icon = new ImageIcon(iconAux.getImage().getScaledInstance(lengthIcon, heightIcon, java.awt.Image.SCALE_DEFAULT));
	JButton mainMenu = new JButton ();
	private Font font = new Font("Arial",Font.BOLD, 16);
	JLabel selBacColor = new JLabel();
	private final int lengthIconBackCol=300;
	private final int heightIconBackCol=115;
	private ImageIcon iconBackColAux = new ImageIcon("src/resources/3inarowColorSelect.png");
	private ImageIcon iconBackCol = new ImageIcon(iconBackColAux.getImage().getScaledInstance(lengthIconBackCol, heightIconBackCol, java.awt.Image.SCALE_DEFAULT));
	
	public SettingsScreen(ChangePanelLis cpl,ColorListener cl) {
		setBounds(0, 0, 500, 500);
		colorChoice.addItem("Gray");
		colorChoice.addItem("Pink");
		colorChoice.addItem("Blue");
		cl.addChoice(colorChoice);
		colorChoice.addItemListener(cl);
		add(colorChoice);
		add(mainMenu);
		mainMenu.addActionListener(cpl);
		mainMenu.setIcon(icon);
		add(selBacColor);
		selBacColor.setIcon(iconBackCol);
		setVisible(false);
		repaint();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		colorChoice.setBounds(200,320,100,colorChoice.getHeight());
		colorChoice.setFont(font);
		selBacColor.setBounds(100, 160, lengthIconBackCol, heightIconBackCol);
		mainMenu.setBounds(410,10,lengthIcon,heightIcon);
	}
}
