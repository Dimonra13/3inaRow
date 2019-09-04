package view;

import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controler.ChangePanelLis;

 
public class StartScreen  extends JPanel{
	
	private static final long serialVersionUID = 2L;
	private final int lengthIcon=300;
	private final int heightIcon=270;
	private ImageIcon iconAux = new ImageIcon("src/resources/3inarow.png");
	private ImageIcon icon = new ImageIcon(iconAux.getImage().getScaledInstance(lengthIcon, heightIcon, java.awt.Image.SCALE_DEFAULT));
	private final int lengthStart=150;
	private final int heightStart=75;
	private ImageIcon iconStartAux = new ImageIcon("src/resources/3inarowStart.png");
	private ImageIcon iconStart = new ImageIcon(iconStartAux.getImage().getScaledInstance(lengthStart, heightStart, java.awt.Image.SCALE_DEFAULT));
	private final int lengthSet=65;
	private final int heightSet=65;
	private ImageIcon iconSetAux = new ImageIcon("src/resources/3inarowSet.png");
	private ImageIcon iconSet = new ImageIcon(iconSetAux.getImage().getScaledInstance(lengthSet, heightSet, java.awt.Image.SCALE_DEFAULT));
	JButton settings = new JButton();
	JLabel title = new JLabel();
	JButton start = new JButton();
	
	public StartScreen(ChangePanelLis cplSettings,ChangePanelLis cplStartGame) {
		setBounds(0, 0, 500, 500);
		add(settings);
		settings.addActionListener(cplSettings);
		settings.setIcon(iconSet);
		add(start);
		start.setIcon(iconStart);
		start.addActionListener(cplStartGame);
		add(title);
		title.setIcon(icon);
		setVisible(true);
		repaint();
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		title.setBounds(100, 60, lengthIcon, heightIcon);
		start.setBounds(175,350,lengthStart,heightStart);
		settings.setBounds(410,10,lengthSet,heightSet);
		
	}

}
