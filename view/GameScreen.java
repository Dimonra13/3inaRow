package view;

import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import controler.ChangePanelResetGameLis;
import controler.setValueCheckWin;
import model.Board;

public class GameScreen  extends JPanel implements Observer{
	
	private static final long serialVersionUID = 4L;
	private JButton menu = new JButton();
	private final int lengthIcon=50;
	private final int heightIcon=50;
	private ImageIcon iconWhiteAux = new ImageIcon("src/resources/3inarowBox.png");
	private ImageIcon iconWhite = new ImageIcon(iconWhiteAux.getImage().getScaledInstance(lengthIcon, heightIcon, java.awt.Image.SCALE_DEFAULT));
	private ImageIcon iconXAux = new ImageIcon("src/resources/3inarowXBox.png");
	private ImageIcon iconX = new ImageIcon(iconXAux.getImage().getScaledInstance(lengthIcon, heightIcon, java.awt.Image.SCALE_DEFAULT));
	private ImageIcon iconOAux = new ImageIcon("src/resources/3inarowOBox.png");
	private ImageIcon iconO = new ImageIcon(iconOAux.getImage().getScaledInstance(lengthIcon, heightIcon, java.awt.Image.SCALE_DEFAULT));
	private final int lengthIconBack=65;
	private final int heightIconBack=65;
	private ImageIcon iconAux = new ImageIcon("src/resources/3inarowBack.png");
	private ImageIcon icon = new ImageIcon(iconAux.getImage().getScaledInstance(lengthIconBack, heightIconBack, java.awt.Image.SCALE_DEFAULT));
	public JButton c11 =  new JButton();
	public JButton c12 =  new JButton();
	public JButton c13 =  new JButton();
	public JButton c21 =  new JButton();
	public JButton c22 =  new JButton();
	public JButton c23 =  new JButton();
	public JButton c31 =  new JButton();
	public JButton c32 =  new JButton();
	public JButton c33 =  new JButton();
	
	public GameScreen(ChangePanelResetGameLis cpl,setValueCheckWin svc) {
		setBounds(0, 0, 500, 500);
		add(menu);
		menu.addActionListener(cpl);
		menu.setIcon(icon);
		add(c11);
		c11.addActionListener(svc);
		add(c12);
		c12.addActionListener(svc);
		add(c13);
		c13.addActionListener(svc);
		add(c21);
		c21.addActionListener(svc);
		add(c22);
		c22.addActionListener(svc);
		add(c23);
		c23.addActionListener(svc);
		add(c31);
		c31.addActionListener(svc);
		add(c32);
		c32.addActionListener(svc);
		add(c33);
		c33.addActionListener(svc);
		c11.setIcon(iconWhite);
		c12.setIcon(iconWhite);
		c13.setIcon(iconWhite);
		c21.setIcon(iconWhite);
		c22.setIcon(iconWhite);
		c23.setIcon(iconWhite);
		c31.setIcon(iconWhite);
		c32.setIcon(iconWhite);
		c33.setIcon(iconWhite);
		setVisible(false);
		repaint();
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		menu.setBounds(410,10,lengthIconBack,heightIconBack);
		c11.setBounds(125,125,lengthIcon,heightIcon);
		c12.setBounds(225,125,lengthIcon,heightIcon);
		c13.setBounds(325,125,lengthIcon,heightIcon);
		c21.setBounds(125,225,lengthIcon,heightIcon);
		c22.setBounds(225,225,lengthIcon,heightIcon);
		c23.setBounds(325,225,lengthIcon,heightIcon);
		c31.setBounds(125,325,lengthIcon,heightIcon);
		c32.setBounds(225,325,lengthIcon,heightIcon);
		c33.setBounds(325,325,lengthIcon,heightIcon);

	}

	@Override
	public void update(Observable arg0, Object arg1) {
		Board b = (Board) arg0;
		if(b.board[0][0]=='x') {
			c11.setIcon(iconX);
		}else if(b.board[0][0]=='o') {
			c11.setIcon(iconO);
		}else {
			c11.setIcon(iconWhite);
		}
		
		if(b.board[0][1]=='x') {
			c12.setIcon(iconX);
		}else if(b.board[0][1]=='o') {
			c12.setIcon(iconO);
		}else {
			c12.setIcon(iconWhite);
		}
		
		if(b.board[0][2]=='x') {
			c13.setIcon(iconX);
		}else if(b.board[0][2]=='o') {
			c13.setIcon(iconO);
		}else {
			c13.setIcon(iconWhite);
		}
		
		if(b.board[1][0]=='x') {
			c21.setIcon(iconX);
		}else if(b.board[1][0]=='o') {
			c21.setIcon(iconO);
		}else {
			c21.setIcon(iconWhite);
		}
		
		if(b.board[1][1]=='x') {
			c22.setIcon(iconX);
		}else if(b.board[1][1]=='o') {
			c22.setIcon(iconO);
		}else {
			c22.setIcon(iconWhite);
		}
		
		
		if(b.board[1][2]=='x') {
			c23.setIcon(iconX);
		}else if(b.board[1][2]=='o') {
			c23.setIcon(iconO);
		}else {
			c23.setIcon(iconWhite);
		}
		
		if(b.board[2][0]=='x') {
			c31.setIcon(iconX);
		}else if(b.board[2][0]=='o') {
			c31.setIcon(iconO);
		}else {
			c31.setIcon(iconWhite);
		}
		
		if(b.board[2][1]=='x') {
			c32.setIcon(iconX);
		}else if(b.board[2][1]=='o') {
			c32.setIcon(iconO);
		}else {
			c32.setIcon(iconWhite);
		}
		
		if(b.board[2][2]=='x') {
			c33.setIcon(iconX);
		}else if(b.board[2][2]=='o') {
			c33.setIcon(iconO);
		}else {
			c33.setIcon(iconWhite);
		}
		
		repaint();
		
	}

}
