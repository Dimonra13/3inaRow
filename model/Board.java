package model;

import java.util.Observable;

public class Board extends Observable{
	public char[][] board;
	public int winner;
	private int player;
	
	public Board() {
		board= new char[3][3];
		boardReset();
	}
	
	public void boardReset() {
		for(char[] aux:board) {
			for (int i = 0; i < aux.length; i++) {
				aux[i]=' ';
			}
		}
		winner=0;
		player=1;
		setChanged();
		notifyObservers();
	}
	
	private boolean isEmptyBox(int f, int c) {
		return board[f][c]==' ';
	}
	
	public void setBox(int f,int c) {
		if(!isEmptyBox(f, c)) {
			throw new RuntimeException("Used Box");
		}else {
			if(player==1) {
				board[f][c]='x';
			}else {
				board[f][c]='o';
			}
			player=(player+1)%2;
			setChanged();
			notifyObservers();
		}
	}
	
	public boolean isFinished() {
		return checkRows()||checkColumns()||checkDiagonal()||checkReverseDiagonal()||checkDraw();
	}

	private boolean checkDraw() {
		boolean draw=true;
		int i=0;
		while(draw&&i<3) {
			int j=0;
			while(draw&&j<3) {
				draw=board[i][j]!=' ';
				j++;
			}
			i++;
		}
		return draw;
	}

	private boolean checkDiagonal() {
		boolean win= board[0][0]==board[1][1]&&board[1][1]==board[2][2]&&board[0][0]!=' ';
		if(win) {
			if(board[0][0]=='x') {
				winner=1;
			}else {
				winner=2;
			}
		}
		return win;
	}
	
	private boolean checkReverseDiagonal() {
		boolean win= board[0][2]==board[1][1]&&board[1][1]==board[2][0]&&board[0][2]!=' ';
		if(win) {
			if(board[0][2]=='x') {
				winner=1;
			}else {
				winner=2;
			}
		}
		return win;
	}
	
	private boolean checkRows() {
		boolean win=false;
		int i=0;
		while(!win&&i<3) {
			win=board[i][0]==board[i][1]&&board[i][1]==board[i][2]&&board[i][0]!=' ';
			if(win) {
				if(board[i][0]=='x') {
					winner=1;
				}else {
					winner=2;
				}
			}
			i++;
		}
		return win;
	}

	private boolean checkColumns() {
		boolean win=false;
		int j=0;
		while(!win&&j<3) {
			win=board[0][j]==board[1][j]&&board[1][j]==board[2][j]&&board[0][j]!=' ';
			if(win) {
				if(board[0][j]=='x') {
					winner=1;
				}else {
					winner=2;
				}
			}
			j++;
		}
		return win;
	}

}
