package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.Board;
import view.GameScreen;
import view.WinnerScreen;

public class setValueCheckWin implements ActionListener{
	private GameScreen source;
	private WinnerScreen destination;
	private Board board;
	
	public 	setValueCheckWin(Board b) {
		board=b;
	}
	
	public void setOrigin(GameScreen s) {
		source=s;
	}
	
	public void setDetination(WinnerScreen d) {
		destination=d;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			if(e.getSource().equals(source.c11)) {
				board.setBox(0, 0);
			}
			if(e.getSource().equals(source.c12)) {
				board.setBox(0, 1);
			}
			if(e.getSource().equals(source.c13)) {
				board.setBox(0, 2);
			}
			if(e.getSource().equals(source.c21)) {
				board.setBox(1, 0);
			}
			if(e.getSource().equals(source.c22)) {
				board.setBox(1, 1);
			}
			if(e.getSource().equals(source.c23)) {
				board.setBox(1, 2);
			}
			if(e.getSource().equals(source.c31)) {
				board.setBox(2, 0);
			}
			if(e.getSource().equals(source.c32)) {
				board.setBox(2, 1);
			}
			if(e.getSource().equals(source.c33)) {
				board.setBox(2, 2);
			}
			if(board.isFinished()) {
				source.setVisible(false);
				destination.setVisible(true);
				if(board.winner==1) {
					destination.winnerIs(1);
				}else if(board.winner==2) {
					destination.winnerIs(2);
				}else {
					destination.winnerIs(0);
				}
				board.boardReset();
				
			}
		}catch(Exception error) {
			JOptionPane.showMessageDialog(null,error);
		}
		
		
	}
}
