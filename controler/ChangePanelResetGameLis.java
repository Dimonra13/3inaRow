package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import model.Board;

public class ChangePanelResetGameLis implements ActionListener{
	private JPanel source;
	private JPanel destination;
	private Board board;
	
	public 	ChangePanelResetGameLis(Board b) {
		board=b;
	}
	
	public void setOrigin(JPanel s) {
		source=s;
	}
	
	public void setDetination(JPanel d) {
		destination=d;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		board.boardReset();
		source.setVisible(false);
		destination.setVisible(true);
		
	}
}
