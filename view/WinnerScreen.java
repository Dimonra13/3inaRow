package view;

import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controler.ChangePanelLis;
import controler.ChangePanelResetGameLis;

public class WinnerScreen extends JPanel{

	private static final long serialVersionUID = 7L;
	JLabel winner = new JLabel();
	private final int lengthIconBack=65;
	private final int heightIconBack=65;
	private ImageIcon iconAux = new ImageIcon("src/resources/3inarowBack.png");
	private ImageIcon icon = new ImageIcon(iconAux.getImage().getScaledInstance(lengthIconBack, heightIconBack, java.awt.Image.SCALE_DEFAULT));
	JButton mainMenu = new JButton ();
	private final int lengthIconW=350;
	private final int heightIconW=225;
	private ImageIcon iconDrawAux = new ImageIcon("src/resources/3inarowWD.png");
	private ImageIcon iconDraw = new ImageIcon(iconDrawAux.getImage().getScaledInstance(lengthIconW, heightIconW, java.awt.Image.SCALE_DEFAULT));
	private ImageIcon iconW1Aux = new ImageIcon("src/resources/3inarowW1.png");
	private ImageIcon iconW1 = new ImageIcon(iconW1Aux.getImage().getScaledInstance(lengthIconW, heightIconW, java.awt.Image.SCALE_DEFAULT));
	private ImageIcon iconW2Aux = new ImageIcon("src/resources/3inarowW2.png");
	private ImageIcon iconW2 = new ImageIcon(iconW2Aux.getImage().getScaledInstance(lengthIconW, heightIconW, java.awt.Image.SCALE_DEFAULT));
	private final int lengthRestart=150;
	private final int heightRestart=75;
	private ImageIcon iconRestartAux = new ImageIcon("src/resources/3inarowRestart.png");
	private ImageIcon iconRestart = new ImageIcon(iconRestartAux.getImage().getScaledInstance(lengthRestart, heightRestart, java.awt.Image.SCALE_DEFAULT));
	JButton restart = new JButton();
	
	public WinnerScreen(ChangePanelLis cpl,ChangePanelResetGameLis cplRestart) {
		setBounds(0, 0, 500, 500);
		add(winner);
		add(mainMenu);
		mainMenu.addActionListener(cpl);
		mainMenu.setIcon(icon);
		add(restart);
		restart.addActionListener(cplRestart);
		restart.setIcon(iconRestart);
		setVisible(false);
		repaint();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		winner.setBounds(75,100,lengthIconW,heightIconW);
		mainMenu.setBounds(410,10,lengthIconBack,heightIconBack);
		restart.setBounds(175,350,lengthRestart,heightRestart);
	}
	
	public void winnerIs(int i) {
		if(i==0) {
			winner.setIcon(iconDraw);
		}else if (i==1){
			winner.setIcon(iconW1);
		}else {
			winner.setIcon(iconW2);
		}
		repaint();
	}

}
